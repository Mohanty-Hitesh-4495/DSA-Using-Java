package DoublyLinkedList;

public class DeleteHeadOfDLL {

    public static Node convertArr2DLL(int[] arr){
        Node head = new Node (arr[0]);
        Node temp = head;
        for (int i=1; i<arr.length; i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }
        return head;
    }

    public static void printDLL(Node head){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp.next != null)
                System.out.print("->");
        }
        System.out.println();
    }

    public static Node deleteHead(Node head){
        head.next.prev = null;
        head = head.next;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);

        // Print the doubly linked list
        System.out.println("Doubly Linked List Initially: ");
        printDLL(head);

        System.out.println("Doubly Linked List After deleting head node:");

        head = deleteHead(head); // delete head  from doubly linked list
        printDLL(head);
    }
}
