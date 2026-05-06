import java.util.ArrayList;

public class f {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fun(list);
        // fun2(list);
        for (int idx = 0; idx < list.size(); idx++) {
            System.out.println(list.get(idx));
        }
    }

    static void fun(ArrayList<Integer> list) {
        list.add(2);
        fun2(list);
    }

    static void fun2(ArrayList<Integer> list) {
        list.add(5);
    }
}
