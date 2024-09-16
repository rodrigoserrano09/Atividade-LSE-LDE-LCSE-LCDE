package listaSimplesmenteEncadeada;

public class SLinkedList {

    protected Node head;
    protected Node tail;
    protected int size;

    public SLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addHead(String element) {
        Node newNode = new Node(element, head);
        head = newNode;
        if (size == 0) {
            tail = newNode;
        }
        size++;
    }

    public void addTail(String element) {
        Node newNode = new Node(element, null);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Operação inválida");
            return;
        }
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
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
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }

        sb.append("]");
        return sb.toString();
    }
}
