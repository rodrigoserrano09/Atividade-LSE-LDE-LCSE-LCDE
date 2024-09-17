package listaCircularDuplamenteEncadeada;

public class CDLinkedList {

    protected Node head;
    protected Node tail;
    protected int size;

    public void addHead(String element) {
        Node newNode = new Node(element, null, null);
        if (size == 0) {
            tail = head = newNode;
            newNode.setNextNode(head);
            newNode.setPreviousNode(tail);
        } else if (size == 1) {
            newNode.setNextNode(head);
            newNode.setPreviousNode(tail);
            head.setPreviousNode(newNode);
            head.setNextNode(newNode);
            head = newNode;
            tail.setNextNode(head);
        } else {
            newNode.setNextNode(head);
            newNode.setPreviousNode(tail);
            head.setPreviousNode(newNode);
            tail.setNextNode(newNode);
            head = newNode;
        }
        size++;
    }

    public void addTail(String element) {
        Node newNode = new Node(element, null, null);
        if (size == 0) {
            head = tail = newNode;
            newNode.setNextNode(head);
            newNode.setPreviousNode(tail);
        } else if (size == 1) {
            newNode.setNextNode(head);
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail.setPreviousNode(newNode);
            tail = newNode;
            head.setPreviousNode(tail);
        } else {
            newNode.setNextNode(head);
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
            head.setPreviousNode(tail);
        }
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Lista vazia");
        } else if (size == 1) {
            tail = head = null;
        } else if (size == 2) {
            head = head.getNextNode();
            head.setPreviousNode(null);
            tail.setNextNode(null);
        } else {
            head = head.getNextNode();
            head.setPreviousNode(tail);
            tail.setNextNode(head);
        }
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Lista vazia");
        } else if (size == 1) {
            tail = head = null;
        } else if (size == 2) {
            tail = tail.getPreviousNode();
            head.setPreviousNode(null);
            tail.setNextNode(null);
        } else {
            tail = tail.getPreviousNode();
            head.setPreviousNode(tail);
            tail.setNextNode(head);
        }
        size--;
    }

    public double size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node current = head;
        int count = 0;

        while (count < size) {
            sb.append(current.getElement());
            current = current.getNextNode();
            if (count < size - 1) {
                sb.append(", ");
            }
            count++;
        }

        sb.append("]");
        return sb.toString();
    }
}

