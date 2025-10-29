package org.example.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.next = next;
        this.data = data;
    }

    public Node(int data) {
        this.next = null;
        this.data = data;
    }
}

public class LinkedListDemo01 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9};
        Node node = new Node(arr[3]);
        Node head = convertArrToLL(arr);
        /*Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }*/
        System.out.println(lengthOfLL(head));
    }

    private static Node convertArrToLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    /**
     *
     * // traverse to the LL
     * // find out the length of link list
     *
     * @return
     */
//length of LL
    private static int lengthOfLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
}
