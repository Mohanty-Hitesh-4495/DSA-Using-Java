package Linear_Search;
//  1672. Richest Customer Wealth
//  URL=https://leetcode.com/problems/richest-customer-wealth/
public class Max_Wealth {
    public static void main(String[] args) {
        int [][] arr={
                {1, 2, 3},
                {5, 8},
                {-5, -2,89}
        };
        int richest=maximumWealth(arr);
        System.out.println("MAXIMUM BALANCE IN BANK ACCOUNT = "+richest);
    }
    static int maximumWealth(int [][] arr){
        int max=Integer.MIN_VALUE;
        for(int person=0;person<arr.length;person++){
            int sum=0;
            for(int account=0;account<arr[person].length;account++){
                sum+=arr[person][account];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
