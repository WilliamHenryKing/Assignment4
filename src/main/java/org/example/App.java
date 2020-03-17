package org.example;

import java.util.*;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //The following program creates a map of type hashmap. The hashmap is printed out.
        //The keys and values of the hashmap are then separately extracted and printed out.

        Map<Integer, String> hashMap = new HashMap();
        // putting keys and values in
        hashMap.put(1, "Danny");
        hashMap.put(2, "Samantha");
        hashMap.put(3, "Yasmin");
        hashMap.put(4, "Kanicka");
        hashMap.put(5, "Henry");

        System.out.println("\nPrinting out the Map:");
        System.out.println(hashMap);

        Set<Integer> keysOfMap;
        //extracts the keys from the hashmap and puts it into a Set.
        keysOfMap = hashMap.keySet();

        List<String> listOfValues = new ArrayList();
        //The interfaces Collection and Collections are used to extract the values from the hashmap.
        Collection<String> collectionOfValues = Collections.unmodifiableCollection(hashMap.values());
        //This collection is now added to the list.
        listOfValues.addAll(collectionOfValues);

        //printing it all out
        System.out.println("\nPrinting out the Set:");
        System.out.println(keysOfMap);
        System.out.println("\nPrinting out the List:");
        System.out.println(listOfValues);

    }
}
