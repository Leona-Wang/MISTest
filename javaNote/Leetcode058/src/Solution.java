public class Solution {
    
    public Solution(){

    }

    //解答
    public int lengthOfLastWord(String s){
        int result=0;

        s=s.trim();

        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)!=' '){
                result++;
            }
            else if (result>0){
                break;
            }
        }

        return result;
    }

    //我寫的
    /*public int lengthOfLastWord(String s) {
        
        int result=0;

        String[] input=s.split(" ");

        result=input[input.length-1].length();

        return result;
    }*/
}
