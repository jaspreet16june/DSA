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
    static int max ;
    static int min ;
    public static void helper(TreeNode root, int level){
        
        if(root == null){
            return ;
        }
        min = Math.min(min,level);
        max = Math.max(max,level);
        
        helper(root.left,level-1);
         helper(root.right ,level+1);
        
        
        
    }
    public static int width(TreeNode root) {
        
     max = Integer.MIN_VALUE;
     min = Integer.MAX_VALUE;
     
     helper(root,0);
     
     int w = max - min + 1;
     
     return w;
        
     
    }

    // input_section=================================================

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        System.out.println(width(root));
    }

    public static void main(String[] args) {
        solve();
    }
}