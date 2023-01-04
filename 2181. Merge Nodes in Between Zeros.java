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
    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head.next;
        int sum = 0;
        while(temp!=null){
            if(temp.val!=0){
                sum+=temp.val;
                temp = temp.next;
            }else{
                list.add(sum);
                sum = 0;
                temp = temp.next;
            }
        }
        ListNode m = new ListNode(list.get(0));
        ListNode y = m;
        for(int i = 1;i<list.size();i++){
            ListNode t = new ListNode(list.get(i));
            y.next = t;
            y = y.next;
        }
        return m;
    }
}
