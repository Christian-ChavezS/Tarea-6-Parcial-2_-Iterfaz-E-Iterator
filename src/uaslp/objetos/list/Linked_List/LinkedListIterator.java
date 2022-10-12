package uaslp.objetos.list.Linked_List;

import uaslp.objetos.list.Iterator;

public class LinkedListIterator implements Iterator {
    private Node current;


    public LinkedListIterator(Node head){
        this.current = head;
    }

    public boolean hasNext(){
        return current != null;
    }
    public String next(){
        String data = current.data;
        current = current.next;
        return data;
    }
}
