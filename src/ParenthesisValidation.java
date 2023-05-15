import java.util.Stack;

public class ParenthesisValidation {
    public static void main(String[] args) {
        String s = "}}";
        Stack<Character> stack = new Stack<>();
        if(s.isEmpty() && (s.charAt(0)!=')' || s.charAt(0)!='}' || s.charAt(0)!=']')){
            System.out.println("NOT VALID");
        }
        for(Character c : s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            }
            else if((c==')' && stack.size()!=0 && stack.peek()=='(') || (c=='}' && stack.size()!=0 && stack.peek()=='{') || (c==']' && stack.size()!=0 && stack.peek()=='[')){
                stack.pop();
            } else{
            }
        }
        if(stack.size() == 0){
            System.out.println("VALID");
        }
        else{
            System.out.println("NOT VALID");
        }
    }
}
