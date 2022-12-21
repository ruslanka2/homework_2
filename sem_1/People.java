package sem_1;

public   class  People implements Comparable<People>  {
    
    private Integer id;
    private String name;
    private String gender;
    private int age;
    private String social_status;

 
    public  People(Integer id, String name, String gender, Integer age, String social_status){
        this.id=id;
        this.name=name;
        this.gender = gender;
        this.age = age;
        this.social_status = social_status;
    }
    
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public Integer getAge(){
        return age;
    }
    public String getSocial_status(){
        return social_status;
    }

    public void setId(Integer id){
        this.id = id; 
    }
    public void setName(String name){
        this.name = name; 
    }
    public void setGender(String gender){
        this.gender = gender; 
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setSocial_status(String social_status){
        this.social_status = social_status; 
    }
    public void hello(){
        System.out.println("Привет мы семейка");
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "people{"+
        "id =" + id +
        ",name = " + name +
        ",gender = "+ gender +
        ",age = " + age +
        ",social_status = " + social_status +
        '}';


        

        
            
        
    }

    @Override
    public int compareTo(People o) {
        if (this.age > o.age)
        return 1;
    else if (this.age < o.age)
        return -1;
    else
        return 0;
    }
}
// return "book{"+
//                 "brand=" + brand +
//                 ",os=" + os +
//                 ",diagonal=" + diagonal +
//                 ",hdd_size=" + hdd_size +
//                 ",price=" + price +
//                 '}';
