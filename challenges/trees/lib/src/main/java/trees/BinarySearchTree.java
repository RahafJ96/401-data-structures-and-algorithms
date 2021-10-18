package trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>>{

    public Node<T> root;

    public void add(T key){
        if(isEmpty()){
            root = new Node<>(key);
        }else{
            traverse(key,root);
        }
    }
    List<Integer> postOrderList = new ArrayList<>();
    List<Integer> inOrderList = new ArrayList<>();
    List<Integer> preOrderList = new ArrayList<>();


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
    public void postOrder(Node node){

        if(node == null){
            return;
        }

        // left
        postOrder(node.getLeftNode());

        // right
        postOrder(node.getRightNode());

        //  print the value
        System.out.print(node.getData() + " ");
        postOrderList.add((Integer) node.getData());
    }
    public void preOrder(Node node){

        if(node == null){
            return;
        }

        System.out.print(node.getData() + " ");
        preOrderList.add((Integer) node.getData());

        preOrder(node.getLeftNode());

        preOrder(node.getRightNode());
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
    public int findMaxvalue() {

        if(root == null){
            throw new IllegalArgumentException("Empty tree");
        }
        System.out.println("Root: "+root.getData());
        int max = (Integer) root.getData();

        postOrder(root);

        for(int i = 0; i<postOrderList.size(); i++){
            if(max<postOrderList.get(i)){
                max = postOrderList.get(i);
            }
        }
        return max;

    }

    public Node<T> getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root.getData() +
                '}';
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
}
