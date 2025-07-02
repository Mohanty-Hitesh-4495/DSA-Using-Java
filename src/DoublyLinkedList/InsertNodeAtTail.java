package DoublyLinkedList;

public class InsertNodeAtTail {

    public static Node convertArr2DLL(int[] arr){
        Node head = new Node(arr[0]);
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
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null)
                System.out.print("->");
        }
        System.out.println();
    }

    public static Node insertAtTail(Node head, int item){
        Node temp = head;
        Node newNode = new Node(item);

        // if Doubly linked list is empty, then send newNode as Head
        if(head == null)
            return newNode;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);

        // Print the doubly linked list
        System.out.println("Doubly Linked List Initially: ");
        printDLL(head);

        System.out.println("Doubly Linked List After Inserting before the node with value 10:");
        head = insertAtTail(head, 10); // Insert a node with value 10 at the end
        printDLL(head);
    }
}
