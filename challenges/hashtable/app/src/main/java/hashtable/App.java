package hashtable;

import hashtable.binarytree.BinaryTree;
import hashtable.binarytree.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    // code challenge 34
    boolean uniqueCharacters(String str)
    {
        str = str.replaceAll("\\s","");

        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
        return true;
    }

    // code challenge 33
    public static List<String> leftJoin(HashMap h1, HashMap h2){

        List<String> list = new ArrayList<>();
        for(Object k : h1.keySet()){
            if(h1.containsKey(k)){
                list.add(k +  ": " +"[ " + h1.get(k)+ ", " + h2.get(k) +" ]");
            } else{
                list.add(k + ": " + h1.get(k) + ", " + null);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        // code challenge 30
        HashTable<Integer,String> hashTable = new HashTable<>();

        System.out.println(hashTable.getSize());
        System.out.println(hashTable.isEmpty());

        hashTable.add(7,"rahaf");
        hashTable.add(5,"roaa");
        hashTable.add(3,"ola");

        System.out.println("Is it Empty? : "+hashTable.isEmpty());

        System.out.println("Size : "+hashTable.getSize());

        System.out.println("<<<<<<< Code Challenge 30 >>>>>>");


        System.out.println(hashTable.get(5));

        System.out.println(hashTable.contains(7));
        System.out.println(hashTable.contains(9));

        // code challenge 31
        System.out.println("   ");
        System.out.println("<<<<<<< Code Challenge 31 >>>>>>");
        String paragraph1 = "Once upon a time, there was a brave princess who...";
        String paragraph2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way ??? in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only";
        String paragraph3= "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn???t know what I was doing in New York";
        System.out.println("Paragraph 1: "+hashTable.repeatedWord(paragraph1));
        System.out.println("Paragraph 2: "+hashTable.repeatedWord(paragraph2));
        System.out.println("Paragraph 3: "+hashTable.repeatedWord(paragraph3));


        // code challenge 32
        HashTable<Integer,Integer> trees = new HashTable<Integer, Integer>();

        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        tree1.setRoot(new Node(150));
        tree1.getRoot().setLeft(new Node(100));
        tree1.getRoot().setRight(new Node(250));
        tree1.getRoot().getRight().setLeft(new Node(200));
        tree1.getRoot().getRight().setRight(new Node(350));
        tree1.getRoot().getRight().getRight().setLeft(new Node(300));
        tree1.getRoot().getRight().getRight().setRight(new Node(500));
        tree1.getRoot().getLeft().setLeft(new Node(75));
        tree1.getRoot().getLeft().setRight(new Node(160));
        tree1.getRoot().getLeft().getRight().setLeft(new Node(125));
        tree1.getRoot().getLeft().getRight().setRight(new Node(175));

        tree2.setRoot(new Node(42));
        tree2.getRoot().setLeft(new Node(100));
        tree2.getRoot().setRight(new Node(600));
        tree2.getRoot().getRight().setLeft(new Node(200));
        tree2.getRoot().getRight().setRight(new Node(350));
        tree2.getRoot().getRight().getRight().setLeft(new Node(4));
        tree2.getRoot().getRight().getRight().setRight(new Node(500));
        tree2.getRoot().getLeft().setLeft(new Node(15));
        tree2.getRoot().getLeft().setRight(new Node(160));
        tree2.getRoot().getLeft().getRight().setLeft(new Node(125));
        tree2.getRoot().getLeft().getRight().setRight(new Node(175));

        System.out.println("   ");
        System.out.println("<<<<<<< Code Challenge 32 >>>>>>");
        System.out.println(trees.treeIntersection(tree1,tree2));


        // code challenge 33
        HashMap<String, String> firstHashMap = new HashMap<>();
        HashMap<String, String> secondHashMap = new HashMap<>();
        System.out.println("   ");
        System.out.println("<<<<<<< Code Challenge 33 >>>>>>");
        firstHashMap.put("fond", "enamored");
        firstHashMap.put("wrath", "anger");
        firstHashMap.put("diligent", "employed");
        firstHashMap.put("outfit", "garb");
        firstHashMap.put("guide", "usher");

        secondHashMap.put("fond", "averse");
        secondHashMap.put("wrath", "delight");
        secondHashMap.put("diligent", "idle");
        secondHashMap.put("guide", "follow");
        secondHashMap.put("flow", "jam");

        System.out.println(leftJoin(firstHashMap, secondHashMap));

        // code challenge 34

        App obj= new App();
        String char1 = "The quick brown fox jumps over the lazy dog";
        String char2 = "I love cats";
        String char3 = "Donald the duck";


        System.out.println("   ");
        System.out.println("<<<<<<< Code Challenge 34 >>>>>>");
        if (obj.uniqueCharacters(char2))
            System.out.println(true);
        else
            System.out.println(false);
    }
    }

