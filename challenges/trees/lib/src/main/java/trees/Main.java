package trees;

public class Main {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Testing");

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

    }
}
