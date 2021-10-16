package trees;

public class BinarySearchTree<T extends Comparable<T>>{

    public Node<T> root;

    public void add(T key){
        if(isEmpty()){
            root = new Node<>(key);
        }else{
            traverse(key,root);
        }
    }

    public boolean isEmpty(){
        return root == null;
    }
    private void traverse(T key, Node<T> root){
        Node<T> node = new Node<>(key);
        if (key.compareTo(root.getData()) < 0){
            if (root.getLeftNode() == null){
                root.setLeftNode(node);
            }else{
                traverse(key, root.getLeftNode());
            }
        }
        if (key.compareTo(root.getData())> 0){
            if (root.getRightNode() == null){
                root.setRightNode(node);
            }else{
                traverse(key, root.getRightNode());
            }
        }
    }
    public void inOrderTraversal(){
        if (isEmpty()){
            return;
        }

    }
    private void traversalInOrder(Node<T> root){
        if (root.getLeftNode() != null){
            traversalInOrder(root.getLeftNode());
        }
        System.out.println("-->"+ root.getData());

        if (root.getRightNode() != null){
            traversalInOrder(root.getRightNode());
        }
    }
    public boolean contains(T key){
        return contains(key,root);
    }

    private boolean contains( T key, Node<T> root )
    {
        if( key == null ){
            return false;
        }

        int compareResult = key.compareTo( root.getData());

        if( compareResult < 0 )
        { return contains( key, root.getLeftNode());}
        else if( compareResult > 0 )
        { return contains( key, root.getRightNode());}
        else {
            return true; // Match
        }
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root.getData() +
                '}';
    }
}
