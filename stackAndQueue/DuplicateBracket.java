import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    boolean db = duplicateBrac(str);
    System.out.println(db);

  }
  public static boolean duplicateBrac(String str) {
    Stack<Character> st = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == '(') {
        st.push(ch);
      } else if (ch == ')') {
        int pc = 0;
        while (st.peek() != '(') {
          st.pop();
          pc++;
        }
        st.pop();
        if (pc == 0) {
          return true;
        }
      } else if (ch != ')' || ch != '(' || ch != ' ') {
        st.push(ch);
      }
    }
  return false;
  }
}