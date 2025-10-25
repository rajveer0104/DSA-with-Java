import java.util.*;
public class arraylist_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
