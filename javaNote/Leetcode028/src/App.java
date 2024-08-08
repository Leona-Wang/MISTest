public class App {
    public static void main(String[] args) throws Exception {
        String haystack="sadbutsad";
        String needle="sad";

        Solution s=new Solution();

        System.out.println(s.strStr(haystack, needle));
    }
}
