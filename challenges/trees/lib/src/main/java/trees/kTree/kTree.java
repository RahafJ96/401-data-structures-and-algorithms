package trees.kTree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class kTree<T> {

    kTreeNode root = null;
    int nodes = 0;
    int K=0;


    public kTree(int k) {
        if(k<=1) {
            k = 2;
        }
        this.K = k;
    }

    public boolean isEmpty() {

        return root == null;
    }

    public boolean isNotEmpty(){
        return root != null;
    }

    public void add(T value){
        nodes++;
        kTreeNode newNode = new kTreeNode(value);
        if( isEmpty()){
            root = newNode;
            return;
        }
        Queue<kTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            kTreeNode currentNode = queue.poll();
            if(currentNode.children.size() < this.K){
                currentNode.addNode(newNode);
                return;
            }
            else {
                queue.addAll(currentNode.children);
            }
        }
    }


    public  kTree<String> fizzBuzzTree(kTree<Integer> kTree){
        kTree<String> outTree = new kTree(kTree.K);

        Queue<kTreeNode> queue = new LinkedList<>();
        if(kTree.isNotEmpty()){
            queue.add(kTree.root);
            while(!queue.isEmpty()){

                kTreeNode<Integer> currentNode = queue.poll();

                String currentValue;
                if(currentNode.value % 15 == 0 )
                    currentValue = "FizzBuzz";
                else if(currentNode.value % 3 == 0)
                    currentValue="Fizz";
                else if(currentNode.value % 5 == 0)
                    currentValue="Buzz";
                else
                    currentValue=currentNode.value.toString();

                outTree.add(currentValue);

                if(! currentNode.children.isEmpty())
                    queue.addAll(currentNode.children);
            }
        }
        return outTree;
    }
    @Override
    public String toString() {
        return "K-ary tree (K="+this.K+"): {" +
                "\n root=" + root +
                "\nnodes=" + nodes +
                '}';
    }

}
