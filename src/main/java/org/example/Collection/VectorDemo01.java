package org.example.Collection;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo01 {
    public static void main(String[] args) {

        vectorCrudOperation();
    }

    public static void vectorCrudOperation() {
        System.out.println("Enter a choice::\n Enter 1 for add element::\n" +
                "Enter 2 for update element::\n Enter 3 for deleting element::\n Enter 4 for exit");
        Vector<String> toDoList = new Vector<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                //adding task
                case 1:
                    System.out.println("Enter task description");
                    String s = sc.nextLine();
                    toDoList.add(s);
                    System.out.println("task added sucessfully");
                    break;

                case 2:
                    System.out.println("Enter task description");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println(toDoList.get(i));
                    }
                    System.out.println("Task viewed succesfully!!");
                    break;

                case 3:
                    System.out.println("Exiting ToDo List application. Goodbye!");
                    break;
                case 4 :
                    System.out.print("Enter task number to mark as completed: ");
                    String addedValue = sc.nextLine();

                    for (int i = 0; i < toDoList.size(); i++) {
                        if(toDoList.contains(addedValue)){
                            
                        }
                    }
                default:
                    System.out.println("Invalid choice. Please enter a valid option.\n");
            }
        } while (choice != 3);

    }
}
