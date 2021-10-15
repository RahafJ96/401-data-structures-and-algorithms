package trees;

public class Node<T> {

    private T data;
    private  Node<T> leftNode;
    private  Node<T> rightNode;

    public Node(T data){
        this.data=data;
    }
    public Node(){

    }

    public T getData() {
        return data;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }
}
