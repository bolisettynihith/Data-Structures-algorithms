class MyLinkedList {
    int data;
    MyLinkedList next;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        int data;
        MyLinkedList next=null;
    }
    public MyLinkedList head;
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int length(){
        MyLinkedList temp = head;
        int len=0;
        while(temp != null){
            temp = temp.next;
            len = len+1;
        }
        return(len);
    }
    public int get(int index) {
        if(index > length()-1){
            return(-1);
        }
        else if(length() == 1){
            return head.data;
        }
        else if(index <0){
            return(-1);
        }
        else{
            MyLinkedList temp = head;
            for(int i=0;i<index;i++){
                temp= temp.next;
            }
            return(temp.data);
         }
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        MyLinkedList newnode = new MyLinkedList();
        newnode.data =val;
        MyLinkedList temp =head;
        newnode.next = temp;
        head = newnode;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        MyLinkedList newnode = new MyLinkedList();
        newnode.data =val;
        MyLinkedList temp = head;
        if(temp == null){
            temp = newnode;
        }
        else{
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
}
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index <= 0){
            addAtHead(val);
        }
       else if(length()==0 && index>0){
            return;
        }
        else if(index>length() || index<0){
            return;
        }

        else if(index==length() && index!= 0){
            addAtTail(val);
        }
        else{
            System.out.println("howle");
            MyLinkedList newnode = new MyLinkedList();
            newnode.data =val;
            MyLinkedList temp = head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            MyLinkedList temp1 = temp.next;
            newnode.next = temp1;
            temp.next = newnode;
            newnode.next = temp1;
        }
        
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }
        else if(index <0){
            return;
        }
        else if(index<=length()-1){
            MyLinkedList temp = head;
            for(int i=0;i<index-1;i++){
                temp =temp.next;
            }
            MyLinkedList temp1 = temp.next.next;
            temp.next = temp1;
        }
        else{
            return;
        }
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */