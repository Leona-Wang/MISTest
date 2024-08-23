public class Solution {
    
    public Solution(){

    }

    public int[] plusOne(int[] digits) {
        
        int i=1;

        int count=0;

        digits[digits.length-1]++;

        while (digits[digits.length-i]>=10 && digits.length-i>=0){

            count=digits[digits.length-i]/10;
            digits[digits.length-i]=digits[digits.length-i]%10;
            if (digits.length-i>0){
                digits[digits.length-i-1]=digits[digits.length-i-1]+count;
                
            }

            else{
                int[] newArr=new int[digits.length+1];
                newArr[0]=count;
                System.arraycopy(digits, 0, newArr, 1, digits.length);
                return newArr;
            }

            i++;

        }

        return digits;
        
    }
}
