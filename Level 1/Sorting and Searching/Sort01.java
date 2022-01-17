import java.io.*;
import java.util.*;

public class Main {

  public static void sort01(int[] arr){
    //write your code here
    int left=0,right=0;
    
    while(right<arr.length){
    //greater elements from left to right-1
    if(arr[right]>0){
      right++;
    }
    //smaller elements from 0 to left-1;
    else{ 
      swap(arr,right,left);
      right++;                //to move to first element of unexplored array
      left++;                 //to move to first elmeent of greater elements
    }
  }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) 
  {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
  }

}
