import java.util.*;
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        //int arr[]={23,55,76,12,54,33};
        int mx=arr[0];
        int mn=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>mx) mx=arr[i];
            if(arr[i]<mn) mn=arr[i];
        }

        System.out.println("Max element in array is "+mx+" minimum element is "+mn);
    }
}
