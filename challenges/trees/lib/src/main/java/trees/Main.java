package trees;

import trees.kTree.kTree;

public class Main {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Binary Search Tree");

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.add(13);
        binarySearchTree.add(5);
        binarySearchTree.add(15);
        binarySearchTree.add(10);
        binarySearchTree.add(4);
        binarySearchTree.add(7);

        System.out.println(" 13 --> 5 -- > 15 - > 10 -> 4 -> 7");

        System.out.println("Is the BinarySearch tree contains 4: " + binarySearchTree.contains(4));
        binarySearchTree.inOrderTraversal();
        //System.out.println("after testing");
        System.out.println("\n"+"Max value is: " + binarySearchTree.findMaxvalue());

        binarySearchTree.setRoot(new Node(7));
        binarySearchTree.getRoot().setLeftNode(new Node(24));
        binarySearchTree.getRoot().setRightNode(new Node(11));
        binarySearchTree.getRoot().getLeftNode().setLeftNode(new Node(13));
        binarySearchTree.getRoot().getLeftNode().getLeftNode().setLeftNode(new Node(100));
        binarySearchTree.getRoot().getLeftNode().setRightNode(new Node(50));
        binarySearchTree.getRoot().getRightNode().setRightNode(new Node((1)));
        binarySearchTree.getRoot().getRightNode().getRightNode().setRightNode(new Node(101));
        binarySearchTree.getRoot().getRightNode().setLeftNode(new Node((2)));

        System.out.print("Before: ");
        System.out.println(binarySearchTree.getRoot());

        System.out.println();
        System.out.println();

        System.out.print("inOrder: ");
        binarySearchTree.inOrder(binarySearchTree.getRoot());

        System.out.println();
        System.out.println();

        System.out.print("preOrder: ");
        binarySearchTree.preOrder(binarySearchTree.getRoot());

        System.out.println();
        System.out.println();

        System.out.print("postOrder: ");
        binarySearchTree.postOrder(binarySearchTree.getRoot());

        System.out.println();
        System.out.println();

        System.out.println("After Breadthing: "+binarySearchTree.breadthFirst(binarySearchTree));

        BinarySearchTree<Integer> binarySearchTree1 = new BinarySearchTree<>();

        binarySearchTree1.setRoot(new Node(7));
        binarySearchTree1.getRoot().setLeftNode(new Node(24));
        binarySearchTree1.getRoot().setRightNode(new Node(11));
        binarySearchTree1.getRoot().getLeftNode().setLeftNode(new Node(13));
        binarySearchTree1.getRoot().getLeftNode().getLeftNode().setLeftNode(new Node(100));
        binarySearchTree1.getRoot().getLeftNode().setRightNode(new Node(50));
        binarySearchTree1.getRoot().getRightNode().setRightNode(new Node((1)));
        binarySearchTree1.getRoot().getRightNode().getRightNode().setRightNode(new Node(101));
        binarySearchTree1.getRoot().getRightNode().setLeftNode(new Node((2)));
        System.out.println(binarySearchTree.isEqual(binarySearchTree1,binarySearchTree));


        System.out.println("________________________________________________________________________");

        System.out.println("Binary Tree");

        BinaryTree binaryTree = new BinaryTree();


        binaryTree.setRoot(new Node(10));
        binaryTree.getRoot().setLeftNode(new Node(24));
        binaryTree.getRoot().setRightNode(new Node(11));
        binaryTree.getRoot().getLeftNode().setLeftNode(new Node(13));
        binaryTree.getRoot().getLeftNode().getLeftNode().setLeftNode(new Node(100));
        binaryTree.getRoot().getLeftNode().setRightNode(new Node(50));
        binaryTree.getRoot().getRightNode().setRightNode(new Node((1)));
        binaryTree.getRoot().getRightNode().getRightNode().setRightNode(new Node(101));
        binaryTree.getRoot().getRightNode().setLeftNode(new Node((2)));


        System.out.println("\n"+"Max value is: " + binaryTree.findMaxvalue());

        System.out.print("Before: ");
        System.out.println(binaryTree.getRoot());

        System.out.println();
        System.out.println();

        System.out.print("inOrder: ");
        binaryTree.inOrder(binaryTree.getRoot());

        System.out.println();
        System.out.println();

        System.out.print("preOrder: ");
        binaryTree.preOrder(binaryTree.getRoot());

        System.out.println();
        System.out.println();

        System.out.print("postOrder: ");
        binaryTree.postOrder(binaryTree.getRoot());

        System.out.println();
        System.out.println();

        System.out.println("After Breadthing: "+binaryTree.breadthFirst(binaryTree));

        BinaryTree binaryTree2 = new BinaryTree();

        binaryTree2.setRoot(new Node(7));
        binaryTree2.getRoot().setLeftNode(new Node(24));
        binaryTree2.getRoot().setRightNode(new Node(11));
        binaryTree2.getRoot().getLeftNode().setLeftNode(new Node(13));
        binaryTree2.getRoot().getLeftNode().getLeftNode().setLeftNode(new Node(100));
        binaryTree2.getRoot().getLeftNode().setRightNode(new Node(50));
        binaryTree2.getRoot().getRightNode().setRightNode(new Node((1)));
        binaryTree2.getRoot().getRightNode().getRightNode().setRightNode(new Node(101));
        binaryTree2.getRoot().getRightNode().setLeftNode(new Node((2)));
        System.out.println(binaryTree.isEqual(binaryTree2,binaryTree));

        System.out.println("________________________________________________________________________");

        System.out.println("K-Tree");
        System.out.println("  ");
        kTree kTree = new kTree(1);

        kTree.add(1);
        kTree.add(2);
        kTree.add(3);
        kTree.add(5);
        kTree.add(15);

        System.out.println(kTree);
        System.out.println(kTree.fizzBuzzTree(kTree));

    }
}
