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
    
    gce2(arr1,arr2);
 }
    
    public static void gce2(int[]arr1,int[]arr2){
        HashMap<Integer,Integer>map = new HashMap<>();
        
        for(int a :arr1){
            if(map.containsKey(a) == false){
                map.put(a,1);
            }else{
                int nf = map.get(a)+1;
                map.put(a,nf);
            }
        }
        for(int a :arr2){
            if(map.containsKey(a) == true && map.get(a) > 0){
                System.out.println(a);
                int mf = map.get(a)-1;
                map.put(a,mf);
            }
        }
    }

}