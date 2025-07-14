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
        int sum=0;
          ArrayList<Integer> ls=new ArrayList<>();
          ListNode temp=head;
          while(temp!=null)
          {
             ls.add(temp.val);
             temp=temp.next;
          }
       Collections.reverse(ls);
          for(int i=0;i<ls.size();i++)
          {
             sum+=ls.get(i)*Math.pow(2,i);
          }
          return sum;
    }
}