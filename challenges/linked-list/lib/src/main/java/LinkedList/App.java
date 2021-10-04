package LinkedList;

public class App {
    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(5);
        list1.append(6);

        list1.insertAfter(4,10);
        list1.insertBefore(1,20);

        Node current = list1.head;
        while (current != null) {
            //System.out.println(current.value);
            current = current.next;
        }

        System.out.println(list1.includes(8));
        System.out.println(list1.includes(3));
        System.out.println(list1.includes(5));
        System.out.println(list1.includes(10));

        System.out.println(list1.toString());
    }
}