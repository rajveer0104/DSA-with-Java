package questions.linkedlist;

import java.util.*;
public class remove_dupli {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(4);
        System.out.println(ll);
        System.out.println(removeDuplicatestwo(ll));
    }
    static LinkedList<Integer> removeDuplicates(LinkedList<Integer> ll) {
    int i = 0;

    while (i < ll.size() - 1) {
        if (ll.get(i).equals(ll.get(i + 1))) {
            ll.remove(i + 1);
        } else {
            i++;
        }
    }

    return ll;
}

static LinkedList<Integer> removeDuplicatesone(LinkedList<Integer> ll) {
    int i = 0;
    HashMap<Integer,Integer> map=new HashMap<>();
   for (int j = 0; j <ll.size(); j++) {
        map.put(ll.get(j), map.getOrDefault(ll.get(j), 0)+1);
   }
   for (int j = 0; j < ll.size()-1; j++) {
    int x=map.get(ll.get(j));
    
    for (int k = 0; k < x-1; k++) {
        ll.get(j).equals(ll.get(j+1));
        ll.remove(j+1);
        map.put(ll.get(j),map.get(ll.get(j))-1);
        
    }
    
   }

    return ll;
}
static LinkedList<Integer> removeDuplicatestwo(LinkedList<Integer> ll) {
    HashSet<Integer> set=new HashSet<>();
        Iterator<Integer> it = ll.iterator();
        while(it.hasNext()){
            int num=it.next();
            if(set.contains(num)){
                it.remove();
            }
            else{
                set.add(num);
            }
        }
    
        return ll;
   }
}
