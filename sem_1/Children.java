package sem_1;

public class Children extends People implements FatherI, MatherI{
    
    
    public Children(Integer id, String name, String gender, Integer age, String social_status, String fathermather_id) {
        
        super(id, name, gender, age, social_status);
        this.fathermather_id = fathermather_id;
        
        //TODO Auto-generated constructor stub
    }
    private  String fathermather_id;
    
    
   
    public String getfathermather_id(){
        return fathermather_id;
    }

    public void setfathermather_id( String fathermather_id){
        this.fathermather_id=fathermather_id;
    }
    
    
    public void setFatherId(String fathermather_id){
        this.fathermather_id = fathermather_id;
    
        
   
    
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "people{"+
        "id =" + getId() +
        ",name = " + getName() +
        ",gender = "+ getGender() +
        ",age = " + getAge() +
        ",social_status = " + getSocial_status() +
        ", fathermather_id = " + fathermather_id +
        '}';
    }
    @Override
    public void hello(){
        System.out.println("Привет я " + getName() + ", " + " ребенок этой семейки");
}

    @Override
    public void get_growth() {
       System.out.println(160);
        
    }

    @Override
    public void getbody_structure() {
        // TODO Auto-generated method stub
        System.out.println("fatman");
    }
}