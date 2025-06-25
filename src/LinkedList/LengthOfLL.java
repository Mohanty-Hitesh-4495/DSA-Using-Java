package LinkedList;

public class LengthOfLL {

    public static int LengthOfLinkedList(Node head){
        if (head == null){
            return 0;
        }
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data);
            head = head.next;
            if(head != null)
                System.out.print("->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        Node head = new  Node(nums[0]);
        head.next = new  Node(nums[1]);
        head.next.next = new  Node(nums[2]);
        head.next.next.next = new  Node(nums[3]);
        head.next.next.next.next = new  Node(nums[4]);

        System.out.print("Linked List: ");
        printLL(head);
        System.out.println("Length of LinkedList: " + LengthOfLinkedList(head));

    }
}
