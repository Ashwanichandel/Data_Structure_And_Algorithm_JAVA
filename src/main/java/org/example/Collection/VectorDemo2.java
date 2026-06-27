package org.example.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

public class VectorDemo2 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Mango");
        vector.add("Apple");
        vector.add("Orange");
        vector.add("Kiwi");
        // ForEachMethodInternal
       /* Consumer<String> cons= new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        };
         vector.forEach(cons);
       // ForEachMethodInternal
        Consumer<String> cons=(str)-> System.out.println(str);
        vector.forEach(cons);

        // ForEachMethodInternal
        vector.forEach(val-> System.out.println(val));

        Vector<Integer> v= new Vector<>();
        System.out.println("Initial capacity:: "+v.capacity());
        for (int i = 0; i <100 ; i++) {
            v.add(i);
        }

        System.out.println("After adding 100 element::"+v.capacity());
          v.add(2);
*/

        Vector<String> listOfCity = new Vector<>();
        listOfCity.add("Surat");
        listOfCity.add("Pune");
        listOfCity.add("Ahmadabad");
        listOfCity.add("Vanaras");

        listOfCity.sort(String::compareTo);
        listOfCity.forEach(System.out::println);


        Vector<Integer> listOfNumbers = new Vector<>();
        listOfNumbers.add(500);
        listOfNumbers.add(400);
        listOfNumbers.add(300);
        listOfNumbers.add(200);
        listOfNumbers.add(100);
        System.out.println("using for loop before sorting");
        for (Integer val : listOfNumbers) {
            System.out.println(val);
        }
        System.out.println("using foreach");
        listOfNumbers.sort(Integer::compareTo);
        listOfNumbers.forEach(num -> System.out.println(num));

        //uisng normal loop
        System.out.println("using for loop after sort method");
        for (Integer val : listOfNumbers) {
            System.out.println(val);
        }

        Object[] arr = listOfNumbers.toArray();
        System.out.println("Collection to array");
        for (Object val : arr) {
            System.out.println(val);
        }
        System.out.println("Using list");
        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(500);
        listOfInteger.add(400);
        listOfInteger.add(300);
        listOfInteger.add(200);
        listOfInteger.add(100);
        Object[] array = listOfInteger.toArray();
        for (Object val : array) {
            System.out.println(val);
        }
        System.out.println("Using before sorting foreach");
        listOfInteger.forEach(System.out::println);
        System.out.println("Using after sorting foreach");
        listOfInteger.sort(Integer::compareTo);
        listOfInteger.forEach(System.out::println);


    }

}
