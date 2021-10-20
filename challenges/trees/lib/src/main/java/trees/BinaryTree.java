package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    List<Integer> postOrderList = new ArrayList<>(); // FOR TEST and use it in code challenge 16
    List<Integer> inOrderList = new ArrayList<>();  // FOR TEST
    List<Integer> preOrderList = new ArrayList<>(); // FOR TEST


    public void postOrder(Node node) {

        if (node == null) {
            return;
        }

        // recur left
        postOrder(node.getLeftNode());

        // recur right
        postOrder(node.getRightNode());

        //  print the value
        System.out.print(node.getData() + " ");
        postOrderList.add((Integer) node.getData());
    }

    public void inOrder(Node node) {

        if (node == null) {
            return;
        }

        inOrder(node.getLeftNode());

        System.out.print(node.getData() + " ");
        inOrderList.add((Integer) node.getData());

        inOrder(node.getRightNode());

    }

    public void preOrder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.getData() + " ");
        preOrderList.add((Integer) node.getData());

        preOrder(node.getLeftNode());

        preOrder(node.getRightNode());
    }


    //        <<< Code Challenge 16 >>>


    public int findMaxvalue() {

        if (root == null) {
            throw new IllegalArgumentException("the tree is empty");
        }

        int max = (int) root.getData();

        postOrder(root);

        for (int i = 0; i < postOrderList.size(); i++) {
            if (max < postOrderList.get(i)) {
                max = postOrderList.get(i);
            }
        }
        return max;
    }


    //        <<< Code Challenge 17 >>>

    public ArrayList breadthFirst(BinaryTree tree) {

        if (tree.getRoot() == null) {
            return null;
        }

        LinkedList<Node> nodes = new LinkedList<>();
        ArrayList<Integer> finalNodes = new ArrayList<>();

        nodes.add(tree.getRoot());

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();
            finalNodes.add((Integer) node.getData());

            if (node.getLeftNode() != null) {
                nodes.add(node.getLeftNode());
            }

            if (node.getRightNode() != null) {
                nodes.add(node.getRightNode());
            }
        }
        return finalNodes;
    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    public String toString() {

            if(root == null){
                return "BinaryTree{ " +
                        " root = " + root + " }";

            }else if(root != null && root.getLeftNode() == null && root.getRightNode() == null){

                return "BinaryTree{ " +
                        " root = " + root.getData() +
                        " left = " + null+
                        " right = " + null+
                        " }";

            }else if(root != null && root.getLeftNode() != null && root.getRightNode() == null){
                return "BinaryTree{ " +
                        " root = " + root.getData() +
                        " left = " + root.getLeftNode().getData()+
                        " right = " + null+
                        " }";

            }else if(root != null && root.getLeftNode() == null && root.getRightNode() != null){
                return "BinaryTree{ " +
                        " root = " + root.getData() +
                        " left = " + null+
                        " right = " + root.getRightNode().getData()+
                        " }";
            }else{
                return "BinaryTree{ " +
                        " root = " + root.getData() +
                        " left = " + root.getLeftNode().getData()+
                        " right = " + root.getRightNode().getData()+
                        " }";
            }

        }

    
}


