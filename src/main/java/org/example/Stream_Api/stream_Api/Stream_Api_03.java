package org.example.Stream_Api.stream_Api;

import java.util.ArrayList;
import java.util.List;

record Student(String stdName, String stdGender, Double stdSalary, Long stdPhNo, Integer stdAge) {

}

public class Stream_Api_03 {
    public static void main(String[] args) {
        ArrayList<Student> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new Student("Scott", "male", 72000D, 9876543210L, 27));
        listOfEmployee.add(new Student("John", "male", 510000D, 9898765432L, 34));
        listOfEmployee.add(new Student("Martin", "male", 5800000D, 9123456789L, 41));
        listOfEmployee.add(new Student("Smith", "male", 67000D, 9988776655L, 29));
        listOfEmployee.add(new Student("Virat", "male", 120000D, 9090909090L, 32));
        listOfEmployee.add(new Student("Priya", "female", 76000D, 9876501234L, 25));
        listOfEmployee.add(new Student("Ananya", "female", 490000D, 9823456789L, 30));
        listOfEmployee.add(new Student("Sneha", "female", 6100000D, 9765432109L, 39));
        listOfEmployee.add(new Student("Neha", "female", 68000D, 9933445566L, 28));
        listOfEmployee.add(new Student("Aishwarya", "female", 98000D, 9012345678L, 31));

        streamApi(listOfEmployee);
    }

    public static void streamApi(List<Student> list) {
        System.out.println("********Retrived the list of female employee*********");
        list.stream().filter(t -> t.stdGender().equals("female")).forEach(System.out::println);


        System.out.println("\nlist of employee  who has age more than 30\n");
        list.stream().filter(emp->emp.stdAge()>30 && emp.stdGender().equals("female")).forEach(System.out::println);

        System.out.println("\nFilter the employee salary more than 50000****\n");
        list.stream().filter(emp->emp.stdSalary()>500000).forEach(System.out::println);

        System.out.println("\n create a list of Students in String\n");
        list.stream().map(std->std.stdName()).forEach(System.out::println);

        System.out.println("\n********* Calculate average salary*********** \n");
        double avgSal = list.stream().mapToDouble(Student::stdSalary).average().orElseThrow();
        System.out.println(avgSal);
    }

}
