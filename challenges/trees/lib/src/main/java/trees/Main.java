package trees;

public class Main {

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
        System.out.println("after testing");
    }
}
