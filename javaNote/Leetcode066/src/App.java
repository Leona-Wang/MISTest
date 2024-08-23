public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        int[] digits={9};
        Solution s=new Solution();

        int[] result=s.plusOne(digits);

        for (int i:result){
            System.out.println(i);
        }
        
    }
}
