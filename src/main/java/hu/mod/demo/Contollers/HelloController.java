package hu.mod.demo.Contollers;

import hu.mod.MalasitsA.dummy;
import hu.mod.demo.models.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/hello")
public class HelloController {

    private dummy _dobj;

    @Autowired
    public HelloController(dummy d){
        this._dobj = d;
    }

    @GetMapping(path="/get",produces = "application/json")
    public person getHello(){
        return _dobj.Hello();
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    public person postHello(@RequestBody person p){
        p.setNev(p.getId() + "-" + p.getNev());
        return p;
    }
}
