package day10;

public class Node {
    private int value;
    private Node leftNode;
    private Node rightNode;

    Node(int value) {
        this.value = value;
        leftNode = null;
        leftNode = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public boolean hasLeft() {
        return this.getLeftNode() == null;
    }

    public boolean hasRight() {
        return this.getRightNode() == null;
    }

    public Node add(Node curNode, int value) {
        // если место свободно
        if (curNode == null) {
            return new Node(value);
        }
        // лево
        if (value < curNode.getValue()) {
            curNode.setLeftNode(add(curNode.getLeftNode(), value));
        }
        // право
        else if (value > curNode.getValue()) {
            curNode.setRightNode(add(curNode.getRightNode(), value));
        }
        //  равно
        return curNode;

    }

    public void print(Node curNode) {
        if (curNode != null) {
            print(curNode.getLeftNode());
            System.out.println(curNode.getValue());
            print(curNode.getRightNode());
        }
    }

}
