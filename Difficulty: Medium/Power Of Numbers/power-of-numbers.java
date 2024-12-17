//{ Driver Code Starts
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // test cases

        Solution ob = new Solution();

        while (T-- > 0) {
            int n = sc.nextInt(); // input N
            int ans = ob.reverseExponentiation(n);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int reverseExponentiation(int n) {
        // code here
         String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String s1=sb.toString();
        int n1=Integer.parseInt(s1);
        return((int)Math.pow(n,n1));
    }
}
