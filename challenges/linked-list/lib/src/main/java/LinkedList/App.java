package LinkedList;

public class App {
    private static final LinkedList list1 = new LinkedList();


    public static void main(String[] args){
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);

        System.out.printf(list1.listString());
    }
}