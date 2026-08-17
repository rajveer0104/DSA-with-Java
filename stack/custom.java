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
    public boolean push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        top++;
        data[top]=x;
        return true;

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
public class custom {
    public static void main(String[] args) throws Exception {
        custom_stack stack=new custom_stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
