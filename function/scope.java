
public class scope {
    //public static void main(String[] args) {
        /*Call by reference 
        int a=40;
        int b=50;
        swap(a, b);
        System.out.println(a+"   "+b);

        String name = "Hi";
        change(name);
        System.out.println(name);

    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void change(String name){
        name="Hello";
    }*/

    /*Call By value
        int[] arr={5,10,20,45,67};
        change(arr);
        System.out.println(Arrays.toString(arr));

}
    static void change(int[] num){
    num[0]=9;
    }*/

    //shadowing
    static int a=9;
    public static void main(String[] args) {
        System.out.println(a);
        int a=80;
        System.out.println(a);
        shadow();

    }
    static void shadow(){
        System.out.println(a);
    }
    }
    
    
