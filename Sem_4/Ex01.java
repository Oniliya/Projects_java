package Sem_4;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Ex01 { 
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

     
        ll.add(1);
        ll.add(2);
        ll.add(4);

        System.out.println(ll);

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        

    }
}
