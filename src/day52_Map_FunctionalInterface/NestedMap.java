package day52_Map_FunctionalInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {
        Map<Integer, String>map1=new LinkedHashMap<>();
        map1.put(11,"SDET");
        map1.put(12,"SM");
        map1.put(13,"BA");
        map1.put(14,"Developer");
        map1.put(15,"PO");

        Map<String, Integer>map2=new LinkedHashMap<>();
        map2.put("Shay",1000000);
        map2.put("Hulya",1100000);
        map2.put("Veronica",1500000);
        map2.put("ALex",1600000);

        /*
        Id JobtTittle Name Salary
        11 "SDET"     "Shay",1000000
         */

        Map<Map<Integer, String>, Map<String, Integer>>mapOfMap=new LinkedHashMap<>();





    }
}
