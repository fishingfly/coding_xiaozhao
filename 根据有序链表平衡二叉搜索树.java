/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.ArrayList;
import java.util.List;
public class Solution {
    	public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
             return null;
         }else if(head.next == null){
             return new TreeNode(head.val);
         }else{
             ListNode mid = head;
             ListNode end = head;
             ListNode premid = null;
             while (end != null && end.next != null ){
                 premid = mid;
                 mid = mid.next;
                 end = end.next.next;
             }
             TreeNode t1 = new TreeNode(mid.val);
             premid.next = null;//这一步非常巧妙
             t1.left = sortedListToBST(head);
         	t1.right = sortedListToBST(mid.next);
             return t1;
         }
     }
}