package listaDuplamenteEncadeada;

public class DLinkedList {

    protected Node head;
    protected Node tail;
    protected int size;

    public DLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addHead(String element) {
        Node newNode = new Node(element, null, null);
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.setNextNode(head);
            head.setPreviousNode(newNode);
            head = newNode;
        }
        size++;
    }

    public void addTail(String element) {
        Node newNode = new Node(element, null, null);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Lista vazia");
        } else if (size != 1) {
            head = head.getNextNode();
            head.setPreviousNode(null);
        } else {
            head = null;
            tail = null;
        }
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Lista vazia");
        } else if (size != 1) {
            tail = tail.getPreviousNode();
            tail.setNextNode(null);
        } else {
            head = null;
            tail = null;
        }
        size--;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node current = head;
        while (current != null) {
            sb.append(current.getElement());
            if (current.getNextNode() != null) {
                sb.append(", ");
            }
            current = current.getNextNode();
        }

        sb.append("]");
        return sb.toString();
    }
}
