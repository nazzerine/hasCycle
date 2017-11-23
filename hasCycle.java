package hasCycle;

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

*/

boolean hasCycle(Node head) {
    if (head == null) { 
        //if list is empty there cannot be a cycle
        return false;
    } else {
        Node walk1 = head;
        Node walk2 = head;
        while (walk1 != null && walk2 != null && walk2.next != null) {
            walk1 = walk1.next;
            walk2 = walk2.next.next;
            
            if (walk1 == walk2)
                return true;
        }
        return false;
    }
}
