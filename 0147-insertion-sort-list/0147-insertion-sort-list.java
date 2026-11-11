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
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list  =new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        for(int i=1;i<list.size();i++){
            int key = list.get(i);
            int j=i-1;
            while(j>=0&&list.get(j)>key){
                list.set(j+1, list.get(j));
                j=j-1;
            }
            list.set(j+1, key);        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for(int val : list) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }
}