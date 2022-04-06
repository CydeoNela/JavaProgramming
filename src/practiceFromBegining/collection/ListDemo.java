package practiceFromBegining.collection;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer>arrayList=new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,2,3,4,5));
        arrayList.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer>LinkedList=new LinkedList<>();
        LinkedList.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer>vector=new Vector<>();
        vector.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer>stack=new Stack<>();
        stack.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println("arrayList = " + arrayList);
        System.out.println("LinkedList = " + LinkedList);
        System.out.println("vector = " + vector);
        System.out.println("Stack = " + stack);

        System.out.println("--------------------------------------------------------------");
        System.out.println("ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

            for (Integer each : arrayList) {
                System.out.println(each);
                System.out.println();
                System.out.println("----------------------------------------------");






            }
            
        }
    }
}
