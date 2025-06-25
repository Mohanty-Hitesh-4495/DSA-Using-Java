package LinkedList;
// Introduction to Linked List...
// https://takeuforward.org/linked-list/linked-list-introduction

// creating node class of a linked list
class Node{
    int data;   // data
    Node next;  // reference to next node

    // constructor for node with provided reference to next node
    Node(int d, Node n){
        this.data = d;
        this.next = n;
    }

    // constructor for end node
    Node(int d){
        this.data = d;
    }
}

public class IntroToLinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node x = new Node(arr[0]);
        System.out.println(x.data);
    }
}
