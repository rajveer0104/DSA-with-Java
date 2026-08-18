package queue;

class custom_circular {

    private static final int DEFAULT_SIZE = 10;

    int start = -1;
    int end = -1;

    protected int[] data;

    public custom_circular(int size) {
        this.data = new int[size];
    }

    public custom_circular() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return (end + 1) % data.length == start;
    }

    public boolean isEmpty() {
        return start == -1;
    }

    public void enqueue(int x) {

        if (isFull()) {
            System.out.println("Queue is FULL");
            return;
        }

        if (isEmpty()) {
            start = 0;
        }

        end = (end + 1) % data.length;
        data[end] = x;
    }

    public int dequeue() throws Exception {

        if (isEmpty()) {
            throw new Exception("Empty circular queue can't be dequeued");
        }
        int p = data[start];
        if (start == end) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % data.length;
        }
        return p;
    }

    public int peek() throws Exception {

        if (isEmpty()) {
            throw new Exception("Empty circular queue can't be peeked");
        }

        return data[start];
    }
        public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = start;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
class dynamic_queue extends custom_circular{
    public dynamic_queue(){
        super();
    }
    public dynamic_queue(int size){
        super(size);
    }
    public void enqueue(int x){
        if(this.isFull()){
            int temp[]=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(start+i)%data.length];
            }
            start=0;
            end=data.length;
            data=temp;
        }
        super.enqueue(x);
    }

}
public class circular {

    public static void main(String[] args) throws Exception {
        custom_circular q = new custom_circular(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(50);
        q.enqueue(60);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}