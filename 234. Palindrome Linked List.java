/* https://leetcode.com/problems/palindrome-linked-list/description/ */
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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            list2.add(0,temp.val);
            temp = temp.next;
        }
        

        


        if(list.equals(list2) ){
            return true;
        }
        return false;
    }
}
