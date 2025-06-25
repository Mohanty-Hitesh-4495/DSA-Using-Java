package LinkedList;
/*
237. Delete Node in a Linked List
https://leetcode.com/problems/delete-node-in-a-linked-list/description/
Example:
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
 */
public class DeleteNodeInLL {
    public static void deleteNode(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data);
            head = head.next;
            if (head != null)
                System.out.print("->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,4,6,8,10};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        System.out.println("Linked List before deleting node [3]: ");
        printLL(head);
        deleteNode(head.next.next);
        System.out.println("Linked List after deleting node [3]: ");
        printLL(head);
    }
}

