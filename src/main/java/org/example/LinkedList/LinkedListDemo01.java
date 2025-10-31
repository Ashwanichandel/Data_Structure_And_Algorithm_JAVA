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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = this;
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        return sb.toString().trim();
    }
}

public class LinkedListDemo01 {
    public static void main(String[] args) {
        int arr[] = {12, 5, 6, 8};
        //Node node = new Node(arr[3]);
        Node head = convertArrToLL(arr);
        /*Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }*/
        System.out.println(removeTailLL(head));
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

    /**
     * Delete element [head]
     * in LL
     *
     * @return
     */
    private static Node removeHead(Node head) {
        if (head == null)
            return head;

        head = head.next;
        return head;
    }

    //remove the element from tail in LinkedList
    private static Node removeTailLL(Node head) {
        if (head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;

    }

    //remove Kth element from LinkedList;
}
