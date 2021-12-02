import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[]arr1 = new int[n1];
    for(int i = 0;i<n1;i++){
        arr1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[]arr2 = new int[n2];
    for(int i = 0;i<n2;i++){
        arr2[i] = scn.nextInt();
    }
    
    gce1(arr1,arr2);
 }
 public static void gce1(int[]arr1,int[]arr2){
     HashSet<Integer>map1 = new HashSet<>();
    //  HashSet<Integer>map2 = new HashSet<>();
     
     for(int i = 0;i<arr1.length;i++){
         if(map1.contains(arr1[i]) == false){
             map1.add(arr1[i]);
         }
     }
     for(int i = 0;i<arr2.length;i++){
         if(map1.contains(arr2[i]) == true){
             System.out.println(arr2[i]);
             map1.remove(arr2[i]);
            
         } 
     }
 }

}