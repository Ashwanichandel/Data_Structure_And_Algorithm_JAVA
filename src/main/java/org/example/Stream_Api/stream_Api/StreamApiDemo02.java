package org.example.Stream_Api.stream_Api;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

record Employee(String empName, String empGen, Double empSal, Long empPhNo, int age, String dept) {
}

public class StreamApiDemo02 {
    public static void main(String[] args) {
        ArrayList<Employee> listOfEmployee = new ArrayList<>();

        listOfEmployee.add(new Employee("Scott", "male", 72000D, 9876543210L, 27, "IT"));
        listOfEmployee.add(new Employee("John", "male", 510000D, 9898765432L, 34, "Finance"));
        listOfEmployee.add(new Employee("Martin", "male", 5800000D, 9123456789L, 41, "HR"));
        listOfEmployee.add(new Employee("Smith", "male", 67000D, 9988776655L, 29, "Marketing"));
        listOfEmployee.add(new Employee("Virat", "male", 120000D, 9090909090L, 32, "IT"));
        listOfEmployee.add(new Employee("Priya", "female", 76000D, 9876501234L, 25, "Finance"));
        listOfEmployee.add(new Employee("Ananya", "female", 490000D, 9823456789L, 30, "HR"));
        listOfEmployee.add(new Employee(
                "Sneha", "female", 6100000D, 9765432109L, 39, "HR"));
        listOfEmployee.add(new Employee("Neha", "female", 68000D, 9933445566L, 28, "IT"));
        listOfEmployee.add(new Employee("Aishwarya", "female", 98000D, 9012345678L, 31, "IT"));

        Map<String, Optional<Employee>> collect = listOfEmployee.stream().collect(Collectors.groupingBy(
                Employee::dept, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparing(Employee::empSal).reversed())
                                .skip(1).findFirst())));

        collect.forEach((k, v) -> System.out.println(k + " : " + v));


        List<Integer> listrOfNum = Arrays.asList(10, 10, 20, 30, 40);


        int sum = listrOfNum.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum:: " + sum);
        /*

         */
        System.out.println("Find Duplicate::");
        Set<Integer> set = new HashSet<>();
        List<Integer> list = listrOfNum.stream().filter(num -> !set.add(num)).collect(Collectors.toList());
        list.forEach(System.out::println);

        // remove duplicate
        System.out.println("Removing  Duplicate from this list ::" + listrOfNum);
        List<Integer> listDuplicateRemove = listrOfNum.stream().distinct().collect(Collectors.toList());
        listDuplicateRemove.forEach(System.out::println);

        double avg = listrOfNum.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Find average::" + avg);

        int secondHighest = listrOfNum.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println("Find Second Higest::" + secondHighest);

      /*
      String
      */

        List<String> listOfString = List.of("Ashwani", "Ashwani", "Mahima", "Bulbul", "Rudra", "Annie", "Champa", "Doctor", "Engineer");
        List<String> sorted = listOfString.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sorted.forEach(System.out::println);

        //find first non repeating character
        System.out.println("Using entry map::");
        List<Character> listOfCharacter = Arrays.asList('a', 'b', 'c', 'a', 'b', 'a', 'd');
        Map<Character, Integer> map = new HashMap<>();
        for (Character str : listOfCharacter) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Key=" + entry.getKey() + " Value= " + entry.getValue());
        }

        //list of integer
        List<Integer> listOfInteger = Arrays.asList(1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8);
        Map<Integer, Integer> map1 = new HashMap<>();
        for (Integer str : listOfInteger) {
            map1.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            System.out.println("Key=" + entry.getKey() + " Value= " + entry.getValue());
        }
        //using stream api
        System.out.println("frequency:::");
        Map<String, Long> frequency = listOfString.stream().
                collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));
        frequency.forEach((k, v) -> System.out.println(k + ":->" + v));
        int third = listrOfNum.stream().distinct().sorted(Comparator.reverseOrder()).skip(4).findFirst().orElse(0);
        System.out.println("fourth higest" + third);

        System.out.println("============Find the First Non-Repeated Character===========");
        String str = "programming";

        Character result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(result);

        System.out.println("============Find the First Repeated Character===========");

        Character firstRepeatedCharacter = str.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(firstRepeatedCharacter);

        System.out.println("============Find the frequencyof each Word===========");
        String sentence = "java spring java boot spring java";
        Map<String, Long> collect1 = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        collect1.forEach((k, v) -> System.out.println(k + "->" + v));


        System.out.println("============Find the frequencyof each Character===========");
        String str1 = "banana ";
        Map<Character, Long> freqEachCharacter = str1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        freqEachCharacter.forEach((k, v) -> System.out.println(k + "->" + v));


        System.out.println("Group Employees by Department");

        Map<String, List<Employee>> listMap = listOfEmployee.stream().collect(Collectors.groupingBy(Employee::dept));
        listMap.forEach((dept, emp) -> System.out.println(dept + "->" + emp));

        System.out.println("find higest paid employee");
        Employee employee = listOfEmployee.stream().max(Comparator.comparing(Employee::empSal)).orElse(null);
        System.out.println(employee);

        System.out.println("count employee in each dept");
        listOfEmployee.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.counting())).forEach((k,v)-> System.out.println(k+"->"+v));

        Employee employee1 = listOfEmployee.stream().sorted(Comparator.comparing(Employee::empSal).reversed()).skip(1).findFirst().orElse(null);
        System.out.println(employee1);
    }

}
