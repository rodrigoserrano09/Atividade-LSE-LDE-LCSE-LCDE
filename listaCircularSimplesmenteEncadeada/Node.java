package listaCircularSimplesmenteEncadeada;

public class Node {

    private String element;
    private Node nextNode;
    private Node previousNode;

    public Node(String element, Node nextNode, Node previousNode) {
        this.element = element;
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public String getElement() {
        return element;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }
}
