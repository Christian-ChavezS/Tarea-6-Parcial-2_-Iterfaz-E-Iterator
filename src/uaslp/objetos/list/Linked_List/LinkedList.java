package uaslp.objetos.list.Linked_List;

import uaslp.objetos.list.List;

public class LinkedList implements List {
    private Node head;
    private Node tail;
    private int size;

    public void addAtTail(String data){
        Node node = new Node(data);
        node.setPrevious(tail);
        tail = node;

        if( head == null) {
            head = node;
        }else {
            node.getPrevious().setNext(node);
        }
        size++;
    }
    public void addAtFront(String data){
        Node node = new Node(data);
        node.setNext(head);
        head = node;

        if( tail == null) {
            tail = node;
        }else{
            node.getNext().setPrevious(node);
        }
        size++;
    }

    public int getSize(){
        return size;
    }

    public boolean remove(int indexToRemove){

        if(indexToRemove < 0 || indexToRemove >= size){
            return false;
        }if(size ==1){      //if this is the last, set null the attributes
            head = null;
            tail = null;
            size = 0;
        } else if(indexToRemove == 0){  //this is the first element
            head = head.getNext();
            head.setPrevious(null);
        } else if (indexToRemove == size -1) { // if is the last element
            tail = tail.getPrevious();
            tail.setNext(null);
        } else{
            Node iteratorNode = findNodeByIndex(indexToRemove);
            iteratorNode.getPrevious().setNext(iteratorNode.getNext());
            iteratorNode.getNext().setPrevious(iteratorNode.getPrevious());

        }
        size--;
        return true;
    }

    public void removeAll(){
        head = null;
        tail = null;
        size = 0;
    }
    public void removeAllWithValue(String value){
        Node current = head;

        while(current != null){
            if(current.data.equals(value)){
                if(current == head){
                    head = current.next;
                    if(head == null){
                        tail = null;
                    }else{
                        head.previous = null;
                    }
                }else{
                    current.previous.next = current.next;
                    if (current == tail){
                        tail = current.previous;
                    }else{
                        current.next.previous = current.previous;
                    }
                }
            }
            current = current.next;
        }
    }

    public boolean setAt(int index,String data){
        if(index < 0 || index >= size){
            return false;
        }
        Node node = findNodeByIndex(index);
        node.setData(data);
        return true;
    }

    public String getAt(int index){
        if(index < 0 || index >= size){
            return null;
        }
        Node node = findNodeByIndex(index);
        return node.getData();
    }

    private Node findNodeByIndex(int index) {
        Node iteratorNode = head;
        int indexIteratorNode = 0;

        while (indexIteratorNode < index){
            iteratorNode = iteratorNode.getNext();
            indexIteratorNode++;
        }
        return iteratorNode;
    }

    public LinkedListIterator getIterator(){
        return new LinkedListIterator(head);
    }
}
