package linkedlist;
class LL {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        private int data;
        private Node next;

        
        public Node(int data){
            this.data=data;
        }

    }
    public LL(){
        this.size=0;
    }
    public void insertLast(int val){
        Node newN=new Node(val);
        if(head==null){
            head=newN;
            tail=newN;
        }
        tail.next=newN;
        newN.next=head;
        tail=newN;
        size++;
    }
    public void insertFirst(int val){
        Node newN=new Node(val);
        if(head==null){
            head=newN;
            tail=newN;
        }
        tail.next=newN;
        newN.next=head;
        head=newN;
        size++;
    }
        public void insert(int index,int value){
        Node temp=head;
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node n=new Node(value);
        n.next=null;
        for (int i = 0; i <index-1; i++) {
            temp=temp.next;
            
        }
        n.next=temp.next;
        temp.next=n;
        size++;

    }
    
    public void displays(){
        Node temp=head;
        System.out.print(temp.data+"->");
        temp=temp.next;
        while(temp!=head){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("HEAD");
        System.out.println();
    }

    public int delete(int val){
        if (head.data==val){
            tail.next=head.next;
            head=head.next;
            size--;
            return val;
        }
        Node temp=head.next;
        Node temp2=head;
        while(temp!=head){
            if(temp.data==val){
                
                temp2.next=temp.next;
                size--;
                return val;
            }
            temp=temp.next;
            temp2=temp2.next;

        }
        return 0;
    }
}
public class circular {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(2);
        list.insertFirst(6);
        list.insertFirst(7);
        list.displays();
        list.insert(3, 88);
        list.displays();
        list.delete(2);
        list.displays();

    }
}
