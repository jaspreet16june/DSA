package Package;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The quick brown fox jumps over the lazy dog";
		boolean pana = panagram(s.toLowerCase());
		System.out.println(pana);

	}

	private static boolean panagram(String s) {
		// TODO Auto-generated method stub
		if(s.length()<26) {
			return false;
		}else {
		for(char ch = 'a';ch<='z';ch++) {
			if(s.indexOf(ch) < 0) {
				return false;
			}
		}
	}
		return true;
	}

}
