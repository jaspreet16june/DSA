import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        boolean bal = balancedBracket(str);
        System.out.println(bal);
    }
    public static boolean balancedBracket(String str){
        Stack<Character>st = new Stack<>();
        
        for(int i = 0;i< str.length();i++){
            char ch = str.charAt(i);
            
            if(ch =='(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(st.size() == 0){
                    return false;
                }
                char newChar = getChar(ch);
                if(st.peek() != newChar){
                    return false;
                }
            st.pop();
            }
        }
           if(st.size() > 0){
                return false;
            }else{
                return true;
            }
    }
    public static char getChar(char ch){
        if(ch == ']'){
            return '[';
        }else if(ch == ')'){
            return '(';
        }else{
            return '{';
        }
    }
}