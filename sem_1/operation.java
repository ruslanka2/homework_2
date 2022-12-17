package sem_1;

import java.util.ArrayList;

public class operation implements methodI {
    
ArrayList <String> ne = new ArrayList<>();
String n;


    
public ArrayList<String> setNe( ){
    ne.add("Ivan");
    ne.add("Nadya");
    ne.add("Taras");
    ne.add("Nastya");
    ne.add("Lida");
    ne.add("Alex");

    return ne;
}
@Override
public int sum_family() {
    
   return 6;
}


    
}


    
    
