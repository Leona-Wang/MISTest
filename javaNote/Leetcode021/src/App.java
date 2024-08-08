public class App {
    public static void main(String[] args) throws Exception {

        ListNode list1=null;
        ListNode list2=new ListNode(0);
        /*ListNode list13=new ListNode(4);
        ListNode list12=new ListNode(2,list13);
        ListNode list1=new ListNode(1,list12);

        ListNode list23=new ListNode(4);
        ListNode list22=new ListNode(3,list23);
        ListNode list2=new ListNode(1,list22);*/
        

        Solution s=new Solution();

        ListNode current = s.mergeTwoLists(list1,list2);
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        


    }
}
