package practiceFromBegining.collection;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer>priorityQueue=new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));
        priorityQueue.poll();

        Queue<Integer>linkedList=new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        Queue<Integer>arrayDequeue=new ArrayDeque<>();
        arrayDequeue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("linkedList = " + linkedList);
        System.out.println("arrayDequeue = " + arrayDequeue);

        arrayDequeue.poll();
        priorityQueue.poll();
        linkedList.poll();

        for (Integer each : priorityQueue) {
            System.out.println(each);

        }

    }

}
