package Recursion;

import java.util.*;
public class RecursivePrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find if it is prime: ");
        int n = input.nextInt();
        int i = n-1;
        if(prime(n,i))
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number");
        
        input.close();
    }
    public static boolean prime(int n, int i){
        if(n <= 1)
            return false;
        if(n == 2)
            return true;
        if(n%i == 0)
            return false;

        if(i == 2)
            return true;

        return prime(n, i-1);
    }

}