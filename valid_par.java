//valid parenthesis
import java.util.*;
class valid_par{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }
            else if(s.charAt(i)=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }
            else if(s.charAt(i)==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }
            else{
                System.out.println("Not valid");
                return;
            }
        }
        if(st.isEmpty()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}