package Package;
import java.util.*;

public class missingPal{

	public static void main(String[] args) {
		try (
		Scanner scn = new Scanner(System.in)) {
			String str = scn.next();
			
			palindrome(str);
		}
	}

	private static void palindrome(String str) {
		int r = str.length()-1;
		for(int i = 0;i<=r;i++) {
			char chF = str.charAt(i);
			char chL = str.charAt(r);
			if(chF == chL) {
				chF++;
				chL--;
			}else {
				System.out.println(chL);
				System.out.println(chF);

			}
			
		}
	}

}
