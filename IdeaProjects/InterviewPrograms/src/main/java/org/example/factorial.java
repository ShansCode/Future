package org.example;

public class factorial {

    public static void Main(String[] args){
        factorialRecurssion(5);
    }

    public static int factorialRecurssion(int n){
        return (n<=1) ? 1 : n * factorialRecurssion(n-1);



//        for(int i=1;i<n;i++){
//
//        }
    }
}
