package BubbleSort;

import java.util.*;

public class BubbleSort{
    public static void main(String[] args){
        int[] array = {5,1,4,2,8,9};
        bubbleSort(array);
        printArray(array);
    }

    //bubble sorting algorithm
    public static void bubbleSort(int[] a){
        int n = a.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    //method to print the array
    public static void printArray(int a[]){
        int n = a.length;
        for(int i = 0; i < n; i++){
            System.out.println(a[i] + " ");
        }
    }
}