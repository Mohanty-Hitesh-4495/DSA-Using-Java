package Matrix;
import java.util.Arrays;
//  832. Flipping an Image
//  URL=https://leetcode.com/problems/flipping-an-image/
/*  Example:
    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    Output: [[1,0,0],[0,1,0],[1,1,1]]
    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class Flipping_image {
    public static void main(String[] args) {
        int[][] image = {
                {1,0,1},
                {1,1,1},
                {1,0,0}
        };
        System.out.println("INPUT");
        for (int[] ints : image) {
            System.out.println(Arrays.toString(ints));
        }
        int[][] ans = flipAndInvertImage(image);
        System.out.println("OUTPUT");
        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int start=0,end=image[i].length-1;
            while(start<=end){
                int temp=(image[i][start]+1)%2;
                image[i][start]=(image[i][end]+1)%2;
                image[i][end]=temp;
                start++;
                end--;
            }
        }
        return image;
    }
}
