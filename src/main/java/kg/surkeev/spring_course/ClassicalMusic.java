package kg.surkeev.spring_course;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @PostConstruct
    public void doMyInit(){
        System.out.println("ClassicalMusic doMyInit");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("ClassicalMusic doMyDestroy");
    }


    @Override
    public String getSong(){
        return " Uptown funk";
    }
}
