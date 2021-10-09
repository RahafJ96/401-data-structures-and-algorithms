package LinkedList;

public class App {
    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        list1.append("A");
        list1.append("B");
        list1.append("C");
        list1.append("D");
        list1.append("E");
        list1.append("F");

        list1.insertAfter("GG","C");
        list1.insertBefore("W","B");

        Node current = list1.head;
        while (current != null) {
            //System.out.println(current.value);
            current = current.getNext();
        }

        System.out.println(list1.dataToString());
        System.out.println(list1.includes(3));
        System.out.println(list1.includes(5));
        System.out.println(list1.includes(10));

        System.out.println(list1.toString());
    }
}