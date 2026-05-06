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
    public void insertFirst(int value){
        Node n =new Node(value);
        n.next=head;
        head=n;
        if(tail==null){
            tail=head;
        }
        size++;
        }

    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node n=new Node(value);
        n.next=null;
        tail.next=n;
        tail=n;
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
    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
            
        }
        System.out.println("NULL");
    }
    public Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
            
        }
        return temp;

    }
    public int deleteFirst(){
        int val=head.data;
        Node temp=head;
        head=head.next;
        temp.next=null;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        int val=tail.data;
        Node secondLastNode=getNode(size-2);
        tail=secondLastNode;
        tail.next=null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=getNode(index-1);
        int val=prev.next.data;
        prev.next=prev.next.next;
        size--;
        return val;
    }
    public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.data==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public int getSize(){
        return size;
    }


    
}


public class single {
    public static void main(String[] args) {
        LL l=new LL();
        l.insertFirst(5);
        l.insertFirst(6);
        l.insertFirst(7);
        l.insertFirst(8);
        l.insertLast(9);
        l.display();
        l.insert(2, 1);
        l.display();
        System.out.println(l.deleteFirst());
        l.display();
        System.out.println(l.getSize());
        System.out.println(l.deleteLast());
        l.display();
        System.out.println(l.getSize());
        System.err.println(l.delete(2));
        l.display();
        System.out.println(l.getSize());

    }
}
