package pt.pa;

import pt.pa.adts.*;
import pt.pa.adts.Map;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {5,1,4,3,7,4,8,9,1,4,6,4,7,6,9,5,3,6,8,4,6,9};

        Map<Integer, Integer> uniqueCount = new MapList<>();
        //Map<Integer, Integer> uniqueCount = new MapBST<>();

        for(int num : numbers) {
            if(uniqueCount.containsKey(num)) {
                int curCount = uniqueCount.get(num);
                uniqueCount.put(num, curCount + 1);
            } else {
                uniqueCount.put(num, 1);
            }
        }

        System.out.println(uniqueCount);
        //TODO: 1. show only unique numbers

        for (Integer key : uniqueCount.keys()) {
            System.out.println("Unique Number: " + key);
        }

        //TODO: 2. show only (sorted) unique numbers and how many times they occur

        System.out.println("Unique Numbers:");
        for (Integer key : getSortedUniqueKeys(uniqueCount)) {
            int count = uniqueCount.get(key);
            System.out.println("Number [" + key + "] occurs " + count + " times.");
        }
    }

    private static List<Integer> getSortedUniqueKeys(Map<Integer, Integer> map) {
        List<Integer> keys = new ArrayList<>(map.keys());
        Collections.sort(keys);
        return keys;
    }



}
