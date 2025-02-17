package kg.surkeev.spring_course;

public class KyrgyzMusic implements Music{
    @Override
    public String getSong(){
        return "Kyrgyz Music";
    }

    public void doMyInit(){
        System.out.println("Doing my initialization Kyrgyz Music");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction Kyrgyz Music");
    }
}
