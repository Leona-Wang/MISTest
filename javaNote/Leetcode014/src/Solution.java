

public class Solution{

    public Solution(){

    }

    public String longestCommonPrefix(String[] strs){
        //answer
        if (strs.length==0){
            return "";
        }
        String result=strs[0];

        for (int i=1;i<strs.length;i++){
            String compare=strs[i];
            while(!compare.startsWith(result)){
                result=result.substring(0,result.length()-1);
            }
        }
        
        return result;

        //I write
        /*String result="";

        ArrayList<char[]> strsToChar=new ArrayList<char[]>();


        for (String s:strs){
            char[] c=s.toCharArray();
            strsToChar.add(c);
        }

        int match=0;

        outerLoop:
        for (int i=0;i<strsToChar.get(0).length;i++){
            
            //System.out.println(i);
            char ch=strsToChar.get(0)[i];
            

            for (char[] cs:strsToChar){
                if (i>=cs.length || cs[i]!=ch){
                    match=i-1;
                    break outerLoop;
                }
                else {
                    match=i;
                }
            }
        }
        //System.out.println(match);

        for (int j=0;j<=match;j++){
            //System.out.println(j);
            if (strsToChar.get(0).length!=0){
                result +=strsToChar.get(0)[j];
            }
            
        }



        return result;*/
    }

}