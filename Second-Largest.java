// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arrStr = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arrStr).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);
            
            System.out.println("-");
        }
    }
}
//Diver Code End
class Solution {
    static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) { 
                second = first;
                first = num;
            } else if (num > second && num < first) { 
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 5, 10};
        int[] arr3 = {10, 10, 10};

        System.out.println(secondLargest(arr1)); // Output: 34
        System.out.println(secondLargest(arr2)); // Output: 5
        System.out.println(secondLargest(arr3)); // Output: -1
    }
}

