public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        //int[] expectedNums = {1,2}; // The expected answer with correct length

        Solution s=new Solution();
        int k = s.removeDuplicates(nums); // Calls your implementation

        System.out.println("---------------");
        System.out.println(k);
        //assert k == expectedNums.length;
        //for (int i = 0; i < k; i++) {
        //    assert nums[i] == expectedNums[i];
        //}
    }
}
