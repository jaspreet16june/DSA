package Package;
import java.util.*;

public class upperLowerCase {
		
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		
		char chL = Character.toUpperCase(ch);
		
		chL +=1;
		
		System.out.println(chL);
		
	}

}

