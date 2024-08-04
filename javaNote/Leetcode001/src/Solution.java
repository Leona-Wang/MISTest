import java.util.HashMap;

public class Solution {

    public Solution(){
        
    }
    public int[] twoSum(int[] nums, int target){

        int[] result=new int[2];

        HashMap<Integer,Integer> find=new HashMap<Integer,Integer>();

        for (int i=0;i<nums.length;i++){
            int findNum=target-nums[i];
            if (find.containsKey(findNum)){
                result[0]=find.get(findNum);
                result[1]=i;
                return result;
            }
            else{
                find.put(nums[i],i);
            }
        }

        return result;
    }
}

