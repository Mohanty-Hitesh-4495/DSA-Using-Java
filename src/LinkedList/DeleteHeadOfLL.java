package LinkedList;

public class DeleteHeadOfLL {

    public static Node deleteHead(Node head){
        if(head == null || head.next == null)
            return null;
        // move ahead and return next node, removing head...
        return head.next;
    }

    public static void printLinkedList(Node head){
        while(head != null){
            System.out.print(head.data);
            head = head.next;
            if(head != null)
                System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("LinkedList before deleting Head: ");
        printLinkedList(head);
        head = deleteHead(head);
        System.out.println("LinkedList after deleting Head: ");
        printLinkedList(head);
    }
}
