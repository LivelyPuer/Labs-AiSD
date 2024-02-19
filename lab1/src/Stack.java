public class Stack {
    private Node lastNode;

    private Integer size = 0;

    public void push(Node node) {
        if (lastNode != null) node.setPrevNode(lastNode);
        lastNode = node;
        size += 1;
    }

    public Node pop() {
        if (isEmpty()) return null;
        Node tmp = lastNode;
        lastNode = lastNode.getPrevNode();
        size -= 1;
        return tmp;

    }

    public Node peek() {
        return lastNode;
    }

    public Integer size() {
        return size;
    }

    public Boolean isEmpty() {
        return lastNode == null;
    }


}
