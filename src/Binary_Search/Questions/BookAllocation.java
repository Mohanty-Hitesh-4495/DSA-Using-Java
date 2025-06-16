package Binary_Search.Questions;

/*
Book Allocation Problem
URL=https://takeuforward.org/plus/dsa/problems/book-allocation-problem
 */

public class BookAllocation {

    public static void main(String[] args) {

        // Example 1
        int[] books1 = {12, 34, 67, 90};
        int m1 = 2;
        int result1 = findPages(books1, m1);
        System.out.println("Example 1 Output: " + result1);  // Expected: 113

        // Example 2
        int[] books2 = {25, 46, 28, 49, 24};
        int m2 = 4;
        int result2 = findPages(books2, m2);
        System.out.println("Example 2 Output: " + result2);  // Expected: 71
    }

    public static int findPages(int[] nums, int m) {
        int n=nums.length;
        // Not enough books for each student to get at least one
        if(n<m) return -1;

        // Minimum limit is max of all books (one student must read it)
        // Maximum limit is sum of all pages (one student reads all)
        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int pages : nums){
            low = Math.max(low, pages);
            high += pages;
        }
        // applying binary search...
        while(low <= high){
            int mid = low+(high-low)/2;
            int studentsCount = countStudents(nums,mid);
            if(studentsCount > m)
                low = mid+1;
            else
                high = mid-1;
        }
        return low;
    }

    public static int countStudents(int[] nums, int maxPages){
        int n=nums.length;
        int countStudent = 1;
        int countPage = 0;
        for (int bookPages : nums){
            if(countPage+bookPages <= maxPages){
                // add pages to current student
                countPage+=bookPages;
            } else {
                // add pages to next student
                countStudent++;
                countPage = bookPages;
            }
        }
        return countStudent;
    }
}
