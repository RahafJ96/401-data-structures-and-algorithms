package LinkedList;

public class App {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {

        LinkedList linkedList1 = new LinkedList();

        linkedList1.insert("A");
        linkedList1.insert("B");
        linkedList1.insert("C");


        LinkedList linkedList2 = new LinkedList();

        linkedList2.insert("1");
        linkedList2.insert("2");
        linkedList2.insert("3");

        LinkedList zipperList = new LinkedList();
        System.out.println(zipperList.zip(linkedList2,linkedList1));


        //System.out.println(linkedList1.size());
        //System.out.println(linkedList1.includes("Rahaf"));

        //System.out.println(linkedList1);
        //System.out.println(linkedList1.kthFromEnd(3));

        //System.out.println(linkedList1);

    }
}