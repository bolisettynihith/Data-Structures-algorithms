Rotate list

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int size(ListNode h){
        int k=0;
        if(h==null)
            return -1;
        else
        {
            while(h!=null)
            {
                h=h.next;
                k++;
            }
            return k;
        }
    }
     ListNode temp = null;
    public ListNode rotateRight(ListNode head, int k) {
        int l=size(head);
        k=k%l;
       temp = head;
        if(head==null) return null;
        else if(head.next==null) return head;
        else
        {
            for(int i=0;i<l-k-1;i++)
            {
                temp=temp.next;
            }
             ListNode temp1 = temp;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=head;
            head=temp1.next;
            temp1.next=null;
        }
        
        return head;
    }
}