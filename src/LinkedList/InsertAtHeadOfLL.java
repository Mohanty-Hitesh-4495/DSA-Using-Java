package LinkedList;
import java.util.List;
import java.util.Arrays;

/*
Given a linked list and an integer value val, insert a new node with that value at the beginning (before the head) of the list and return the updated linked list.
https://takeuforward.org/linked-list/insert-at-the-head-of-a-linked-list
 */

public class InsertAtHeadOfLL {

    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
            if(head != null)
                System.out.print(" -> ");
        }
        System.out.println();
    }

    public static Node insert(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(22,33,44,55);
        Node head = new Node(list.get(0));
        head.next = new Node(list.get(1));
        head.next.next = new Node(list.get(2));
        head.next.next.next = new Node(list.get(3));
        System.out.println("LinkedList before insertion at head: ");
        printLinkedList(head);
        head = insert(head, 11);
        System.out.println("LinkedList after insertion at head: ");
        printLinkedList(head);
    }
}
