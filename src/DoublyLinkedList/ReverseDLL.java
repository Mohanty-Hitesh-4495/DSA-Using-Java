package DoublyLinkedList;
import java.util.Stack;

public class ReverseDLL {

    public static Node convertArr2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i<arr.length; i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }
        return head;
    }

    public static void printDLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        Node head = convertArr2DLL(arr);
        System.out.println("Doubly Linked List before reversal:");
        printDLL(head);

        head = optimalReverse(head);

        System.out.println("Doubly Linked List after reversal:");
        printDLL(head);
    }

    // Time Complexity : O(2N)
    // Space Complexity : O(N)
    // push all node data onto a stack and pop them back while traversing again.
    public static Node bruteforceReverse(Node head){
        Node temp = head;
        Stack<Integer> stack = new Stack();
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;

        while(temp.next != null){
            temp.data = stack.pop();
            temp = temp.next;
        }
        return temp.prev; // or may return head as well
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    // Swap next and prev pointers for each node while traversing the list.
    public static Node optimalReverse(Node head){
        if(head == null || head.next ==null)
            return head;

        Node current = head;
        Node temp = null;
        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }
        return temp.prev;
    }
}
