package sem_1;

public class Father extends People implements FatherI {

    public Father(Integer id, String name, String gender, Integer age, String social_status) {
        super(id, name, gender, age, social_status);
        //TODO Auto-generated constructor stub
        
    }


    @Override
    public void hello(){
        System.out.println("Привет я " + getName() + ", " + " Отец этой семейки");
}


    @Override
    public void getbody_structure() {
        // TODO Auto-generated method stub
        System.out.println("jock");
    }
}