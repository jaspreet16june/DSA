import java.util.Scanner;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static class Pair {
        
        TreeNode parent;
        int min;
        int max;
        
        Pair(){
            
        }
        Pair(TreeNode parent,int min,int max){
            this.min= min;
            this.max = max;
            this.parent = parent;
        }
    }

    public static TreeNode constructBSTFromLevelOrder(int[] arr) {
        ArrayDeque<Pair>q = new ArrayDeque<>();
        // int min = -(int)1e9 -1;
        // int max = (int)1e9 +1;
        //add node
        q.add(new Pair(null,Integer.MIN_VALUE,Integer.MAX_VALUE));
        TreeNode root = null;
        int idx = 0;
        
        while(q.size() > 0 && idx < arr.length){
        //remove
        Pair rem = q.remove();
        
      if(arr[idx] < rem.min || arr[idx] > rem.max){
          continue;
      }
      
      TreeNode node = new TreeNode(arr[idx]);
      idx++;
      
      if(rem.parent == null){
          root = node;
      }else{
          
            if(rem.parent.val  > node.val){
                rem.parent.left = node;
            }else{
                rem.parent.right = node;
            }
      }
      q.add(new Pair(node, rem.min,node.val));
      q.add(new Pair(node,node.val,rem.max));
    }
    
        
        return root;
    }

    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] level = new int[n];
        for (int i = 0; i < n; i++)
            level[i] = scn.nextInt();

        TreeNode root = constructBSTFromLevelOrder(level);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}