package BinarySearch;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        int[] array = {2,4,3,6,7,5,8,7,4,1,9};
        
        int solution = binarySearch(array, 5);
        if(solution == -1)
            System.out.println("The number is not in the array");
        else
            System.out.println("The number is at position " + solution);
    }

    public static int binarySearch(int[] a, int key){
        int low = 0;
        int high = a.length - 1;
        int mid = 0;

        while(low <= high){
            mid = (low + high)/2;
            if(a[mid] < key){
                low = mid + 1;
            } else if(a[mid] > key){
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}