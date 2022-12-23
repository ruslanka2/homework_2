package sem_1;
import java.util.List;
import java.util.ArrayList;


public class maine {
  void testPeople(List<People> li, Peoplechecks sc ){
    for(People p:li){
      if(sc.check(p)){
        System.out.println(p);
      }
    }
  }

 
 
    
    public static void main (String[] args) {
       Father father = new Father(1, "Ivan", "men","Пенсионер", "worker");
       Mather  mather = new Mather(2, "Nadya", "women", 44.5, "worker");
       Children son = new Children(3, "Taras", "men", "Совершеннолетний", "student", "yes");
       Children daughter = new Children(4, "Nastya","women","Совершеннолетняя","student","da");
       relatives sister = new relatives(7, "Lida", "women", 39, "worker", "sister", "father");
       relatives bro = new relatives(8, "Alex", "men", 47, "worker", "brat", "mother");
       List<People> lis = new ArrayList<>();
       lis.add(father);
       lis.add(mather);
       lis.add(son);
       lis.add(daughter);
       lis.add(sister);
       lis.add(bro);
       for (var x:lis){
         System.out.println(x);
       }
       for (var y:lis){
        System.out.println(y.getName());
       }
       
      
      
      for (var x:lis){
         System.out.println(x);
      

       }
      //  lis.sort((o1,o2) -> Integer.compare(o1.getAge(), o2.getAge()));
     
      //  maine info = new maine();
      //  info.testPeople (lis, new Peoplechecks() {
      //   @Override
      //   public boolean check(People p){
      //     return p.getAge()>30;
      //   }
      //  });
      // info.testPeople (lis, (People p) -> {return p.age<30;});
       

      // info.testPeople(lis, new Peoplechecks() {
      //         @Override
      //         public boolean check(People p){
      //           return  p.getAge()<30;
      //         }
      //      });
       
       
      
       

       
       
      //  System.out.println("Наша семейное дерево состоит из " + ob.sum_family() + " человек" + ob.setNe());
      //  System.out.println("Сын унаследовал у отца метод, но сам остался  " ); //почему то не получается
      //                                                                            // добавить метод для вывода на консоль
      // son.getbody_structure();
       
      // son.get_growth();

      
      
      

       
      //  System.out.println("Цифрой выюерите результат исследований : 1 - показать всех детей семьи. 2 - Родственники по линии отца. 3 - Родственники по линии матери.");
      //  Scanner iScanner=new Scanner(System.in);
      //  int x= iScanner.nextInt();
      //  if (x==1){
      //     info.testPeople(lis, (People p)->{return name.getName()=="Ivan";});

      // interface Peoplechecks{
      //   boolean check(People p);
      // }
        // System.out.println(son );
        // System.out.println(daughter );
      //  }
      //  if (x==2){
      //   System.out.println(sister );
        
      //  }
      //  if (x==3){
      //   System.out.println(bro );
        
      //  }
       
      
    //    List<People> list1 = new LinkedList<>();
       
       //System.out.println(father.getName());
       //System.out.println(son);
       //System.out.println(sister);
       //father.hello();
       //son.hello();
       //mother.hello();
       //daughter.hello();
    
    
    }




    
   }




    




   
  
  
