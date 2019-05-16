package hu.mod.MalasitsA;

import hu.mod.demo.models.person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class dummy {
    @Value("${demo.app.stringem}")
    private String s;

    public person Hello(){
        person p = new person(1,"Akarki");
        return p;
    }
}
