package LinkedList;

public class App {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insert("Hi");
        linkedList.insert("I");
        linkedList.insert("am");
        linkedList.insert("Rahaf");

        System.out.println(linkedList.size());
        System.out.println(linkedList.includes("Rahaf"));

        System.out.println(linkedList);

    }
}