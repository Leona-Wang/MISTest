public class App {
    public static void main(String[] args) throws Exception {

        Solution s=new Solution();

        int[] nums={3,2,4};
        int target=6;

        int[] result=s.twoSum(nums,target);
        
        System.out.println(result[0]+","+result[1]);

    }
}
