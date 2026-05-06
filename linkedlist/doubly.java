package linkedlist;
class linkedlist {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        private int data;
        private Node next;
        private Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        
    }
    linkedlist(){
        this.size=0;
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=head;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;
        size++;
        
    }
    public void insertLast(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=head;
            return;
        }
        node.prev=tail;
        node.next=null;
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int index,int val){
        if(index==0){
            insertFirst(val);
        }
        if(index==size-1){
            insertLast(val);
        }
        Node node =new Node(val);
        int c=0;
        Node temp=head;
        while(c!=index-2){
            temp=temp.next;
            c++;
        }
        node.next=temp.next;
        node.prev=temp;
        temp.next.prev=node;
        temp.next=node;
        size++;
    }
    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.err.print(temp.data+"<=>");
            last=temp;
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
        System.out.println("Print in reverse order ");
        while(last!=null){
            System.out.print(last.data+"<=>"); 
            last=last.prev;
        }
        System.out.print("START");
        System.out.println();
    }
    public int deleteFirst(){
        Node temp=head;
        int val=temp.data;
        head=head.next;
        head.prev=null;
        temp.next=null;
        size--;
        return val;
    }
    public int deleteLast(){
        if(size==1){
            deleteFirst();
        }
        int val=tail.data;
        Node temp=tail;
        tail=tail.prev;
        tail.next=null;
        temp.prev=null;
        size--;
        return val;
    }
}
public class doubly {
    public static void main(String args[]){
        System.out.println("Hi");
        linkedlist l = new linkedlist();
        l.insertFirst(5);
        l.insertFirst(6);
        l.insertFirst(7);
        l.insertFirst(8);
        l.display();
        /*l.insertLast(4);
        l.insertLast(3);
        l.insertLast(2);
        l.display();
        l.insert(3, 0);
        l.display();
        int a=l.deleteFirst();
        l.display();
        int b = l.deleteLast();
        l.display();*/
    }
}
