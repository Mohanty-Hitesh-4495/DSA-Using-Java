package Binary_Search.Questions;

public class NthRootOfNumber {
    public static void main(String[] args) {
        int N = 3, M = 27;
//        int N = 4, M = 69;
        int result = NthRoot(N, M);
        if (result == -1)
            System.out.println("No integer Nth root exists for " + M);
        else
            System.out.println("The " + N + "th root of " + M + " is: " + result);
    }

    public static int NthRoot(int N, int M) {
        int low = 1;
        int high = M;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midPower = multiply(N, mid); // use long
            if (midPower == M) return mid;
            else if (midPower < M) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static long multiply(int n, int num) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= num;
        }
        return ans;
    }
}
