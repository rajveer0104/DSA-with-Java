public class comparisonstring {
    public static void main(String[] args) {
        String name = "Anurima";
        // System.out.println(name);
        String name2 = "Anurima";
        System.out.println(name==name2); // returns true since both points to same object location in the string pool

        String a = new String("Hi");
        String b = new String("Hi");
        System.out.println(a==b);// returns false since both points to diff objects locstions which are not in string pool
        System.out.println(a.equals(b));// returns true since this is not a comparator..this function only compares the value of the object not the location
        name = "Sarkar";
        System.out.println(name);// string not modified the object of the string is changed
    }
}
