package sem_1;

public class relatives extends People {

    public relatives(Integer id, String name, String gender, Integer age, String social_status,  String family_id, String line_id) {
        
        
        super(id, name, gender, age, social_status);
        this.family_id = family_id;
        this.line_id = line_id;
    }
private String family_id;
private String line_id;

public String getfamily_id(){
    return family_id;
}

public void setfamily_id(String family_id){
    this.family_id=family_id;
}


public String getline_id(){
    return line_id;
}

public void setline_id(String line_id){
    this.line_id=line_id;
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
    ", family_id = " + family_id +
    ", line_id = " + line_id +

    '}';
}
    
}
