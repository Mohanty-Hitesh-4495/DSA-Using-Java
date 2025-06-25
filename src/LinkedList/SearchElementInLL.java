package LinkedList;

public class SearchElementInLL {

    public static boolean searchElement(Node head, int item){
        Node temp = head;
        while(temp != null){
            if (temp.data == item)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};

        Node head = new  Node(nums[0]);
        head.next = new  Node(nums[1]);
        head.next.next = new  Node(nums[2]);
        head.next.next.next = new  Node(nums[3]);
        head.next.next.next.next = new  Node(nums[4]);

        if(searchElement(head, 8))
            System.out.println("Node Found :)");
        else
            System.out.println("Node not Found :(");
    }
}
