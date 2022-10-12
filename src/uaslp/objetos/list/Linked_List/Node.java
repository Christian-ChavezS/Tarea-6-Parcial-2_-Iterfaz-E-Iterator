package uaslp.objetos.list.Linked_List;

public class Node {
    Node next;
    Node previous;
    String data;

    public String getData() {
        return data;
    }

    public Node(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setData(String data) {
        this.data = data;
    }
}
