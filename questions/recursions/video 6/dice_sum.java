
import java.util.ArrayList;

public class dice_sum {
    public static void main(String[] args) {
        dice("", 4);
        ArrayList<String> hi = dice2("", 4);
        System.out.println(hi);

    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) { // instead of 6 can pass the number of faces of the dice as an
                                                      // argument eg.7 faced die, 8 faced dice
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> dice2(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(dice2(p + i, target - i));
        }
        return ans;
    }
}
