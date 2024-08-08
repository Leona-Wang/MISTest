import java.util.Stack;

public class Solution{

    public Solution(){

    }

    public boolean isValid(String s){
        boolean result=false;

        Stack<Character> stk=new Stack<Character>();

        char[] inputs=s.toCharArray();

        outerLoop:
        for (char c:inputs){

            if (c=='(' || c=='[' || c=='{'){
                stk.push(c);
            }
            else {
                if (!stk.isEmpty()){
                    char compare=stk.pop();

                    if ((compare=='(' && c!=')') || (compare=='[' && c!=']') || (compare=='{' && c!='}')){
                        result=false;
                        break outerLoop;
                    }
                    else{
                        result=true;
                    }
                }
                else{
                    result=false;
                    break outerLoop;
                }
            }
        }

        if (!stk.isEmpty()){
            result=false;
        }
        return result;
    }
}