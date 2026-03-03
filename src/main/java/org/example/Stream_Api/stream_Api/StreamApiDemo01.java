package org.example.Stream_Api.stream_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Employye(String empName, String empGen, Double empSal, Long empPhNo, int age) {
}

public class StreamApiDemo01 {
    public static void main(String[] args) {
        ArrayList<Employye> listOfEmployee = new ArrayList<>();

        listOfEmployee.add(new Employye("Scott", "male", 72000D, 9876543210L, 27));
        listOfEmployee.add(new Employye("John", "male", 510000D, 9898765432L, 34));
        listOfEmployee.add(new Employye("Martin", "male", 5800000D, 9123456789L, 41));
        listOfEmployee.add(new Employye("Smith", "male", 67000D, 9988776655L, 29));
        listOfEmployee.add(new Employye("Virat", "male", 120000D, 9090909090L, 32));
        listOfEmployee.add(new Employye("Priya", "female", 76000D, 9876501234L, 25));
        listOfEmployee.add(new Employye("Ananya", "female", 490000D, 9823456789L, 30));
        listOfEmployee.add(new Employye("Sneha", "female", 6100000D, 9765432109L, 39));
        listOfEmployee.add(new Employye("Neha", "female", 68000D, 9933445566L, 28));
        listOfEmployee.add(new Employye("Aishwarya", "female", 98000D, 9012345678L, 31));


        //find female employee using Stream API

        List<Employye> collect = listOfEmployee.stream().filter(emp -> emp.empGen() == "female").collect(Collectors.toList());
        collect.forEach(emp -> System.out.println(emp));
        System.out.println("\n=====================** list of employee who has age >30=====================");
        List<Employye> listOfempAge = listOfEmployee.stream().filter(emp -> emp.age() > 30).collect(Collectors.toList());
        listOfempAge.forEach(emp -> System.out.println(emp));
        System.out.println("\n=====================** employee count who has age >30=====================");
        long count = listOfempAge.stream().count();
        System.out.println(count);
        System.out.println("\n=====================** *********  =====================");
        List<Employye> empSal = listOfEmployee.stream().filter(emp -> emp.empSal() > 50000).collect(Collectors.toList());
        for (Employye employe : empSal) {
            System.out.println(employe);
        }
        System.out.println("\n===================== ** create a list of employee name ** =====================");
        List<String> listOfEmpName = listOfEmployee.stream().map(emp -> emp.empName()).collect(Collectors.toList());
        for (String name : listOfEmpName) {
            System.out.println(name);
        }
        System.out.println("\n===================== ** find employee highest salary  ** =====================");
        double maxSal = listOfEmployee.stream().mapToDouble(Employye::empSal).max().orElseThrow();
        System.out.println(maxSal);
    }
}
