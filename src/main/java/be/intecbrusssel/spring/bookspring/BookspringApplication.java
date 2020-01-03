package be.intecbrusssel.spring.bookspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BookspringApplication {

    public static void main(String[] args) {
       ApplicationContext applicationContext =  SpringApplication.run (BookspringApplication.class, args);

       for(String name: applicationContext.getBeanDefinitionNames()){
            System.out.println (name);
        }

    }

}
