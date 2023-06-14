import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};                     //input is given here in array form
        HashSet<Integer> ans = allDuplicates(arr);
        for(int key:ans) {
            System.out.print(key+" ");                            //output 
        }
    }
    public static HashSet<Integer> allDuplicates(int[] arr) {
        HashSet<Integer> ans = new HashSet<>();                   //HashSet is used to avoid duplicates of a number more than twice
        Arrays.sort(arr);
        for(int i=1; i<arr.length;i++) {
            if(arr[i]==arr[i-1]) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
