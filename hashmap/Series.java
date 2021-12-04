import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]a = new int[n];
    for(int i = 0;i<n;i++){
        a[i]=scn.nextInt();
    }
     longestConsecutiveSeq(a);
 }
 public static void longestConsecutiveSeq(int[]a){
     HashMap<Integer,Boolean>hmap = new HashMap<>();
     
     for(int val : a){
         if(hmap.containsKey(val) == false){
             hmap.put(val,true);
         }
     }
     for(int val:hmap.keySet()){
        int ele = val;
         if(hmap.containsKey(ele-1) == true){
             hmap.put(ele,false);
         }
     }
      int st = -1;
        int mlen = 0;

        for (int i = 0; i < a.length; i++) {
            int ele = a[i];
            int len = 1;

            if (hmap.containsKey(ele) == true && hmap.get(ele) == true) {
                while (hmap.containsKey(ele + len) == true) {
                    len++;
                }

                if (len > mlen) {
                    mlen = len;
                    st = ele;
                }

                hmap.remove(ele);
            }

        }

        for (int k = st; k < st + mlen; k++) {
            System.out.println(k);
 }
 }

}