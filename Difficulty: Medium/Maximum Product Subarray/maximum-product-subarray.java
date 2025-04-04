//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends

class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int maximum = arr[0], max = arr[0], min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            int a = arr[i] * max;
            int b = arr[i] * min;
            
            max = Math.max(Math.max(a, b), arr[i]);
            min = Math.min(Math.min(a, b), arr[i]);
            maximum = Math.max(maximum, max);
        }
        
        return maximum;
    }
}