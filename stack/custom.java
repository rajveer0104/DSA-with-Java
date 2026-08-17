package stack;
/**
 * Innercustom
 */
class custom_stack {
    private static final int DEFAULT_SIZE=10;
    int top=-1;
    protected int data[];
    public custom_stack(){
        this(DEFAULT_SIZE);
    }
    public custom_stack(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return top== data.length-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        top++;
        data[top]=x;

    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty cannot pop");
        }
        return data[top--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack empty cant peek");
            
        }
        return data[top];

    }
    
}
class dynamic_stack extends custom_stack{
    public dynamic_stack(int size){
        super(size);
    }
    public void push(int x){
        if(this.isFull()){
            int temp[]=new int[this.data.length*2];
            for(int i =0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        super.push(x);

    }
}
public class custom {
    public static void main(String[] args) throws Exception {
        System.out.println("Normal Stack:::");
        custom_stack stack=new custom_stack(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Dynamic stack :::");
        dynamic_stack stack2=new dynamic_stack(5);
        stack2.push(0);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
    }
}
