package org.example.Array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImportantStreamApiAskedQuestion {
    public static void main(String[] args) {
        moveZeroToEnd();
        sortingMapByValue();
        findDuplicateUsingJava8();
    }
    public static void moveZeroToEnd(){
        int arr[]={0,2,3,0,2,4,5,0,6};
        int[]res=  IntStream.concat(
                Arrays.stream(arr).filter(n->n!=0),
                Arrays.stream(arr).filter(n->n==0)).toArray();
        System.out.println(Arrays.toString(res));
    }
    public static void findDuplicateUsingJava8(){
        List<Integer> list= List.of(1,2,3,4,5,6,7,8,2,3,4,5,67,8,1,2,3,4,5,6,7);
        Set<Integer> set= list.stream()
                .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println("original list");
        list.forEach(System.out::println);

    }
    public static void sortingMapByValue(){
        Map<String,Integer> map=new HashMap<>();
        map.put("A",20);
        map.put("B",15);
        map.put("C",1);
        map.put("D",4);

        Map<String, Integer> sortedMap =  map.entrySet().
                stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,LinkedHashMap::new
                ));
        System.out.println(sortedMap);
    }
    public static int[] moveZeroToEnd(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }

}
