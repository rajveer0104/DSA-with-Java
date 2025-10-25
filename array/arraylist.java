import java.util.*;
public class arraylist {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    ArrayList<Integer>list = new ArrayList<>();
    /*list.add(55);
    list.add(234);
    list.add(93);
    list.add(5);
    list.add(4532);
    list.add(33);
    System.out.println(list);
    System.out.println(list.contains(93));
    list.set(0,937);
    list.remove(3);
    System.out.println(list);*/

    //user input
    System.out.println("Enter elements");
    for(int i=0;i<5;i++){
        list.add(sc.nextInt());
    }
    System.out.println(list);
    for (int i = 0; i < 5; i++) {
    System.out.print(list.get(i)+" ");        
    }
    } 
}
