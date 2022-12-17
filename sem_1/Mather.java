package sem_1;

public class Mather extends People implements MatherI{

    public Mather(Integer id, String name, String gender, Integer age, String social_status) {
        super(id, name, gender, age, social_status);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void hello(){
        System.out.println("Привет я " + getName() + ", " + "мама этой семейки");
    }
    @Override
    public void get_growth() {
        // TODO Auto-generated method stub
        System.out.println(168);
    }
}

