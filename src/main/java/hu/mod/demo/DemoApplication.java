package hu.mod.demo;

import hu.mod.MalasitsA.dummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"hu.mod.demo.*","hu.mod.MalasitsA"})
@SpringBootApplication
public class DemoApplication {

	//@Bean
	//public dummy getDummy(){
	//	return  new dummy();
	//}

	//@Autowired
	//dummy dobj;
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		//for(String name : applicationContext.getBeanDefinitionNames()){
		//	System.out.println(name);
		//}

		//dummy dobj = applicationContext.getBean(hu.mod.MalasitsA.dummy.class);
		///dobj.Hello();

		//SpringApplication.run(DemoApplication.class, args);
	}

}
