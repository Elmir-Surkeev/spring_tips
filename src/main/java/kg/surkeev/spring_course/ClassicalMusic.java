package kg.surkeev.spring_course;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    //if we use private constructor method we can't create new Object class
    private ClassicalMusic classicalMusic;


    //even though we are returning a new Object, the scope remains singleton
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong(){
        return "Uptown funk";
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
}
