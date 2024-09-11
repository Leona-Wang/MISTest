import java.math.BigInteger;

public class Solution {
    
    public Solution(){

    }


    //我寫的2
    /*public String addBinary(String a, String b){
        String result="";

        int max=Math.max(a.length(),b.length());

        int temp=0;

        char[] aToChar=new char[max];
        char[] bToChar=new char[max];

        for (int i=0;i<max-a.length();i++){
            aToChar[i]='0';
        }
        for (int j=max-a.length();j<max;j++){
            aToChar[j]=a.charAt(temp);
            temp++;
        }

        temp=0;
        for (int i=0;i<max-b.length();i++){
            bToChar[i]='0';
        }
        for (int j=max-b.length();j<max;j++){
            bToChar[j]=b.charAt(temp);
            temp++;
        }

        temp=0;
        int cal=0;

        for (int i=max-1;i>=0;i--){

            cal=Character.getNumericValue(aToChar[i])+Character.getNumericValue(bToChar[i])+temp;
            result=(cal%2)+result;
            temp=cal/2;
        }

        if (temp==1){
            result="1"+result;
        }

        return result;
    }*/

    //我寫的
    /*public String addBinary(String a, String b) {

        String result="";

        BigInteger aToInt=new BigInteger(a,2);
        BigInteger bToInt=new BigInteger(b,2);

        BigInteger resultToInt=aToInt.add(bToInt);

        result=resultToInt.toString(2);


        return result;
    }*/
}
