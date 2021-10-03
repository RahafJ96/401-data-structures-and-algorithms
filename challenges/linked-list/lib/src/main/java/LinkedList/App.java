package LinkedList;

public class App {


    public static void main(String[] args){

        LinkedList list1 = new LinkedList();
        list1.insert("1");
        list1.insert("2");
        list1.insert("3");
        list1.insert("4");
        list1.insert("5");
        list1.insert("6");
        list1.append("27");
        list1.insertBefore("17","27");
        System.out.println(list1.size());
        System.out.println(list1.includes("18"));
        System.out.println(list1);
    }
}
