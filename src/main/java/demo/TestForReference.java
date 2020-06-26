package demo;

public class TestForReference {
    public static void main(String[] args) {
        Node node_01 = new Node(1);
        Node node_02 = new Node(2);
        Node node_03 = new Node(3);
        node_01.setLeft(node_02);
        node_01.setRight(node_03);
        node_02 = node_03;
    }
}

class Node {
    private Integer value;
    private Node left;
    private Node right;

    public Node(Integer value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
