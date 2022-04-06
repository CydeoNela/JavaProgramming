package practiceFromBegining.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Set {
    public static void main(String[] args) {

        java.util.Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.add(null);

        java.util.Set<Integer>LinkedHasSet=new LinkedHashSet<>();
        LinkedHasSet.addAll(Arrays.asList(10,200,300,40,90));
        LinkedHasSet.add(null);

        java.util.Set<Integer>treeSet=new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.add(null);

        System.out.println("hashSet = " + hashSet);
        System.out.println("LinkedHasSet = " + LinkedHasSet);
        System.out.println("treeSet = " + treeSet);

        System.out.println("___________________________________________________________");
        for (Integer each : hashSet) {
            System.out.println(each);

        }
        }


    }


