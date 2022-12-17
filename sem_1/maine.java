package sem_1;



public class maine {
   
    public static void main(String[] args) {
       Father father = new Father(1, "Ivan", "men",46, "worker");
       Mather mather = new Mather(2, "Nadya", "women", 44, "worker");
       Children son = new Children(3, "Taras", "men", 20, "student", "yes");
       Children daughter = new Children(4, "Nastya","women",22,"student","da");
       relatives sister = new relatives(7, "Lida", "women", 39, "worker", "sister", "father");
       relatives bro = new relatives(8, "Alex", "men", 47, "worker", "brat", "mother");
       //List<People> list = new LinkedList<>();
       operation ob = new operation();
       
       
       System.out.println("Наша семейное дерево состоит из " + ob.sum_family() + " человек" + ob.setNe());
       System.out.println("Сын унаследовал у отца метод, но сам остался  " ); //почему то не получается
                                                                                 // добавить метод для вывода на консоль
      son.getbody_structure();
       
      son.get_growth();
      

       
      //  System.out.println("Цифрой выюерите результат исследований : 1 - показать всех детей семьи. 2 - Родственники по линии отца. 3 - Родственники по линии матери.");
      //  Scanner iScanner=new Scanner(System.in);
      //  int x= iScanner.nextInt();
      //  if (x==1){
      //   System.out.println(son );
      //   System.out.println(daughter );
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
