package org.example.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
int arr[]={1,2,3,44,5,6};
        //System.out.println(reverseLinkedList(arr));
    }
    static Node reverseLinkedList(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
