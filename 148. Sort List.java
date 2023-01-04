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
    public ListNode sortList(ListNode head) {
        if(head == null){
            return null;
        }
        ArrayList <Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);

        head.val = list.get(0);
        ListNode x = head.next;
        int i = 1;
        while(x!=null){
            x.val = list.get(i);
            x = x.next;
            i++;
        }
        return head;

        
    }
}
