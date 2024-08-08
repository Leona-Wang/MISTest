import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public Solution(){

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode result=null;

        ListNode left=list1;
        ListNode right=list2;

        ArrayList<Integer> sort=new ArrayList<Integer>();

        while (left!=null || right!=null){

            if (left!=null && right!=null){
                if (left.val<=right.val){
                    sort.add(left.val);
                    left=left.next;
                }
                else{
                    sort.add(right.val);
                    right=right.next;
                }
            }
            else if(left==null && right!=null){
                sort.add(right.val);
                right=right.next;
            }
            else if (left!=null && right==null){
                sort.add(left.val);
                left=left.next;            
            }
            
        }

        ListNode last=null;

        for (int i=sort.size()-1;i>=0;i--){
            if (i==sort.size()-1){
                last=new ListNode(sort.get(i));
                result=last;
            }
            else{
                result=new ListNode(sort.get(i),last);
                last=result;
            }
             
        }

        return result;
    }

}
