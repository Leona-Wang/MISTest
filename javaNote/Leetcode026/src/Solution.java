import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    

    public Solution(){

    }
    //範例解答
    public int removeDuplicates(int[] nums){
        int result=1;

        for (int i=1;i<nums.length;i++){
            if (nums[i]!=nums[i-1]){
                nums[result]=nums[i];
                result++;
            }
        }

        return result;
    }

    //我寫的(leetcode不會過)
    /*public int removeDuplicates(int[] nums) {

        
        int result=0;

        Set<Integer> set=new HashSet<>();
           
        
        for (int i:nums){
            if (!set.contains(i)){
                set.add(i);
                result++;
            }
            
            
        }
        
        nums = set.stream().mapToInt(Integer::intValue).toArray();
        for (int i : nums) {
            System.out.println(i);
        }

        return result;
    }*/


}
