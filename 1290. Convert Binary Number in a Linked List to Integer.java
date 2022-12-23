/* https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/  */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int len = -1;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }

        int ans = 0;
        temp = head;
        while(temp!=null){
            ans += (temp.val * Math.pow(2,len--));
            temp = temp.next; 
        }
        return ans;

        
    }
}
