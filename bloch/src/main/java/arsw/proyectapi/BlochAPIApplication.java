package arsw.proyectapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@ComponentScan(basePackages = {"arsw.proyect"})
public class BlochAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlochAPIApplication.class,args);
	}

}
