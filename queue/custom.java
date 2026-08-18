package queue;
class custom_queue{
    private static final int DEFAULT_SIZE=10;
    int start=-1;
    int end=-1;
    protected int[] data;
    public custom_queue(int size){
        this.data=new int[size];
    }
    public custom_queue(){
        this(DEFAULT_SIZE);
    }
    public boolean isFull(){
        return end==data.length-1;
    }
    public boolean isEmpty(){
        return start==-1;
    }
    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            start=0;
        }
        end++;
        data[end]=x;
    }
    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty queue cant be dequeued");
        }
        int x=data[start];
        
        for(int i =1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;

        return x;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty queue cant be peeked");
        }
        return data[0];
    }
    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}
public class custom {
    public static void main(String[] args) throws Exception{
        custom_queue q=new custom_queue(5);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }

}


