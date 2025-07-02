package DoublyLinkedList;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data, Node previous, Node next){
        this.data = data;
        this.prev = previous;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class IntroToDLL {

    // Function to print Doubly Linked List from head to end
    public static void printDLL(Node head){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] item = new int[] {1,2,3,4,5};
        Node head = new Node(item[0]);
        Node temp = head;
        for(int i=1; i<item.length; i++){
            Node newNode = new Node(item[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }
        System.out.println("Printing Doubly Linked List:");
        printDLL(head);

    }
}
