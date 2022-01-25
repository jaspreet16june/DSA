import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    // code
    int largest = lah(n,a);
    System.out.print(largest);
 }
 public static int lah(int n, int[]arr){
    
    int[]ser = smallestElementRight(arr);
    int[]sel = smallestElementLeft(arr);
    int max = 0;
    for(int i = 0; i<arr.length;i++){
        int val = arr[i];
        int width = ser[i] - sel[i] - 1;
        int area = val * width;
        if(max < area){
            max =area;
        }
    }
    return max;
 }
 
 public static int[] smallestElementRight(int[]arr){
     Stack<Integer> st1 = new Stack<>();
     int newArr1[] = new int[arr.length];
     newArr1[arr.length-1] =arr.length;
     st1.push(arr.length-1);
    for(int i = arr.length-2;i>=0;i--){
        while(st1.size()>0 && arr[st1.peek()] >=arr[i] ){
            st1.pop();
        }
        if(st1.size() == 0){
            newArr1[i] = arr.length;
        }else{
            newArr1[i] =st1.peek();
        }
        st1.push(i);
    } 
     return newArr1;
     
 }
 public static int[] smallestElementLeft(int[]arr){
     Stack<Integer> st1 = new Stack<>();
     int newArr1[] = new int[arr.length];
     newArr1[0] =-1;
     st1.push(0);
    for(int i = 1;i<arr.length;i++){
        while(st1.size()>0 && arr[st1.peek()] >=arr[i] ){
            st1.pop();
        }
        if(st1.size() == 0){
            newArr1[i] = -1;
        }else{
            newArr1[i] =st1.peek();
        }
        st1.push(i);
    } 
     return newArr1;
     
 }
}