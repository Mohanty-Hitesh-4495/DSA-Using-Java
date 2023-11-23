package Basic_Fundamentals;

public class ArmstrongSeries {
    public static void main(String[] args) {
        for (int num = 100; num < 1000; num++) {
            if(isArmstrong(num)){
                System.out.println(num);
            }
        }
    }
    static boolean isArmstrong(int num){
        int sum=0,temp=num;
        while(num!=0){
            int n=(num%10)*(num%10)*(num%10);
            sum=sum+n;
            num=num/10;
        }
        if(sum==temp)
            return true;
        else
            return false;
    }
}
