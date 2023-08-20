package array;


import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Type parentheses to validiate");
        String s = sc.nextLine();
        ValidParantheses validator = new ValidParantheses();

        System.out.println(validator.isValid(s));
    }

    private boolean isValid(String s){
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='[') {
                stack.push(c);
            } else if (c==')'||c=='}'||c==']'){
                if(stack.isEmpty()||!isMatchingPair(stack.pop(),c)){
                    return false;
                } }
        }
        return stack.isEmpty();
    }
    private boolean isMatchingPair(char open,char close){
        return(open=='('&& close==')')||
                (open=='['&& close==']')||
                (open=='{'&& close=='}');

    }

}


