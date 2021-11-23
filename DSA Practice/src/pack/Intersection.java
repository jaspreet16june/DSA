package pack;

import java.util.HashSet;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1 = {1,2,3,4};
		int[]arr2 = {4,5,3,7};
		
		intersection(arr1,arr2);
	}
	public static void intersection(int[]arr1,int[]arr2) {
		
		HashSet<Integer>hs = new HashSet<>();
		
		for(int i = 0;i<arr1.length;i++) {
			hs.add(arr1[i]);
		}
		for(int i = 0;i<arr2.length;i++) {
			
			if(hs.contains(arr2[i])) {
				System.out.println(arr2[i]);				
			}
		}
		
	}
	
}
