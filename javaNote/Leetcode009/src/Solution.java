public class Solution {

    public Solution(){

    }
    /*public boolean isPalindrome(int x){
        boolean result=false;

        String input=x+"";

        String reverse=new StringBuilder(input).reverse().toString();

        if (input.equals(reverse)){
            result=true;
        }
        else{
            result=false;
        }

        return result;
    }*/
    public boolean isPalindrome(int x){
        
        int reverse=0;
        int input=x;

        while (input>0){
            reverse=reverse*10+input%10;
            input=input/10;
            
        }

        return reverse==x;

    }

    
}
