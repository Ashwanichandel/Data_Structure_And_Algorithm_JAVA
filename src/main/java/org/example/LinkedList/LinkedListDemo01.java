package org.example.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data, Node next1) {
        this.data = data;
        this.next = next1;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedListDemo01 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9};
        Node node = new Node(arr[3]);
        System.out.println(node.data);
    }


}
