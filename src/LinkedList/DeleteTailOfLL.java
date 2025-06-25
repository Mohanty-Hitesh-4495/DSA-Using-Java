package LinkedList;

public class DeleteTailOfLL {
    public static Node deleteTail(Node head, int data) {
        if(head == null || head.next == null)
            return null;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data);
            head = head.next;
            if(head != null)
                System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new  int[]{1, 2, 3, 4, 5};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        System.out.print("LinkedList before tail deletion: ");
        printLL(head);
        head = deleteTail(head, 3);
        System.out.print("LinkedList after tail deletion: ");
        printLL(head);
    }
}
