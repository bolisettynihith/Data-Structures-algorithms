/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int value) {
        ListNode temp=head;
        while(head!=null && head.val==value){
            head=head.next;
         
            }
        temp= head;
    
        while(temp!=null && temp.next!=null ){
            if(temp.next.val==value){
                temp.next=temp.next.next;
           
                
            }
            else{
                 temp=temp.next;
            
                
            }
           
               
             
        }
        if(temp!=null && temp.next!=null && temp.next.val==value){
            temp.next=null;
        }
        return head;
        
    }
    
}
