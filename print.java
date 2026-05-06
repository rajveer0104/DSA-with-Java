
public class print {
    public static void main(String[] args) {
        //syntax
        int a=70;
        System.out.println("Hi"+a);
        double p=Math.pow(2, 3);
        System.out.println(p);



        //1)user input
        /*Scanner sc=new Scanner (System.in);
        System.out.println("Enter length");
        int l =sc.nextInt();
        System.out.println("Enter breadth");
        int b =sc.nextInt();
        int p=2*(l+b);
        System.out.println("Peri of rec:"+p);*/      
        
        //2) User input 
        /*Scanner sc=new Scanner (System.in);
        int i= sc.nextInt();
        char c= sc.next().charAt(5);
        float f= sc.nextFloat();
        long l=sc.nextLong();
        double d= sc.nextDouble();
        boolean b= sc.nextBoolean();
        sc.nextLine();
        String s= sc.nextLine();
        System.out.println("int "+i);
        System.out.println("char "+c);
        System.out.println("float "+f);
        System.out.println("long "+l);
        System.out.println("double "+d);
        System.out.println("boolean "+b);
        System.out.println("string "+s);
        sc.close();*/

        //Condition
        //1) If Else
        /*Scanner sc=new Scanner (System.in);
        System.out.println("Enter a");
        int a =sc.nextInt();
        if(a>=9)
        {
            System.out.println("T loves T");
        }
        else{
            System.out.println("No change");
        }*/


        //2)switch case (calculator)
        /*System.out.println("Enter 1 for addition\nEnter 2 for subtraction\nEnter 3 for multiplication\nEnter 4 for division");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter choice");
        int c =sc.nextInt();
        System.out.println("Enter 2 nos.");
        int a =sc.nextInt();
        int b =sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("Result is"+(a+b));
                break;
            case 2:
                System.out.println("Result is"+(a-b));
                break;
            case 3:
                System.out.println("Result is"+(a*b));
                break;
            case 4:
                System.out.println("Result is"+(a/b));
                break;
            default:
                System.out.println("wrong choice");
        }*/


        //Loop
        //1) while loop
        /*int a =10;
        while(a>=1)
        {
            System.out.println(a);
            a--;
        }*/
        //2) for loop
        /*int i,j;
        for (i=0;i<5;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/
        //3) do while loop
        /*int a =10;
        do { 
            System.out.println(a);
            a--;
        } while (a<=5);*/


        //array
        /* Scanner sc= new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter elements of array");
        for (int i=0;i<5;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("The array");
        for (int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }*/
        
    }
}
