package questions.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class merge_sortedll {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        LinkedList<Integer> ll2=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(7);
        ll.add(8);
        ll2.add(3);
        ll2.add(4);
        ll2.add(9);
        ll2.add(11);
        System.out.println(merge(ll, ll2));

    }
    static LinkedList<Integer> merge(LinkedList<Integer>ll , LinkedList<Integer> ll2){
        LinkedList<Integer> list=new LinkedList<>();
        int i=0;
        int j=0;
        while(i<ll.size() && j<ll2.size()){
            if(ll.get(i)<ll2.get(j)){
                list.add(ll.get(i));
                i++;
            }
            else if(ll.get(i)>ll2.get(j)){
                list.add(ll2.get(j));
                j++;
            }
        }
        while(i<ll.size()){
            list.add(ll.get(i));
                i++;
        }
        while(j<ll2.size()){
            list.add(ll2.get(j));
                j++;
        }
        return list;
    }
    static LinkedList<Integer> mergesortedLL(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
    LinkedList<Integer> list = new LinkedList<>();

    Iterator<Integer> it1 = ll1.iterator();
    Iterator<Integer> it2 = ll2.iterator();

    while (it1.hasNext()) {
        list.add(it1.next());
    }

    while (it2.hasNext()) {
        list.add(it2.next());
    }

    Collections.sort(list);

    return list;
}
}
