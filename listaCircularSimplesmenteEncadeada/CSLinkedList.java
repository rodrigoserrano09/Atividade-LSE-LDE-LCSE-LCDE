package listaCircularSimplesmenteEncadeada;

public class CSLinkedList {

    protected Node head;
    protected Node tail;
    protected int size;

    public CSLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addHead(String element) {
        Node newNode = new Node(element, null, null);
        if (size == 0) {
            head = tail = newNode;
            newNode.setNextNode(head);
        } else {
            newNode.setNextNode(head);
            newNode.setPreviousNode(tail);
            head.setPreviousNode(newNode);
            head = newNode;
            tail.setNextNode(head);
        }
        size++;
    }

    public void addTail(String element) {
        Node newNode = new Node(element, null, null);
        if (size == 0) {
            head = tail = newNode;
            newNode.setNextNode(head);
        } else {
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
            tail.setNextNode(head);
            head.setPreviousNode(tail);
        }
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Operação inválida");
            return;
        }
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.getNextNode();
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

