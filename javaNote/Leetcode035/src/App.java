public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] nums={1,3,5,6};
        int target=5;

        Solution s=new Solution();

        System.out.println(s.searchInsert(nums,target));
    }
}
