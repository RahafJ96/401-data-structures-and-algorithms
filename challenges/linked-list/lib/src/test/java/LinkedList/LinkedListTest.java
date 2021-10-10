package LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class LinkedListTest {

    @Test void someLibraryMethodReturnsTrue() {
        App classUnderTest = new App();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    void instantiateLinkedList() {
        LinkedList MyTest = new LinkedList();
        assertNull(MyTest.head);
    }

    @Test
    void canInsert() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("A");
        MyTest.insert("B");
        MyTest.insert("C");
        MyTest.insert("D");

        String expected = "{ A } --> { B } --> { C } --> { D } --> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void headPointsRight() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("A");
        MyTest.insert("B");
        MyTest.insert("C");
        MyTest.insert("D");

        assertEquals("A", MyTest.head.getData());
    }

    @Test
    void canInsertMultiple() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("A");
        MyTest.insert("B");
        MyTest.insert("C");
        MyTest.insert("D");
        MyTest.insert("X");
        MyTest.insert("<3");
        String expected = "{ A } --> { B } --> { C } --> { D } --> { X } --> { <3 } --> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void LinkedListIncludes() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("A");
        MyTest.insert("B");
        MyTest.insert("C");
        MyTest.insert("D");
        MyTest.insert("X");
        MyTest.insert("<3");
        assertTrue(MyTest.includes("X"));
    }

    @Test
    void LinkedListDoesntIncludes() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("A");
        MyTest.insert("B");
        MyTest.insert("C");
        MyTest.insert("D");
        MyTest.insert("X");
        MyTest.insert("<3");

        assertFalse(MyTest.includes("Z"));
        assertFalse(MyTest.includes("W"));
    }

    @Test
    void includesWorkingFine() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("A");
        MyTest.insert("B");
        MyTest.insert("C");
        MyTest.insert("D");
        MyTest.insert("X");
        MyTest.insert("<3");

        String expected = "{ A } --> { B } --> { C } --> { D } --> { X } --> { <3 } --> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void canAddBefore() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("A");
        MyTest.insert("B");
        MyTest.insert("C");
        MyTest.insert("D");
        MyTest.insert("X");


        MyTest.insertBefore("X","W");

        String expected = "{ A } --> { B } --> { C } --> { D } --> { W } --> { X } --> NULL";
        assertEquals(expected, MyTest.toString());
    }
    @Test
    void canAddAfter() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("A");
        MyTest.insert("B");
        MyTest.insert("C");
        MyTest.insert("D");
        MyTest.insert("X");
        MyTest.insertAfter("B","N");

        String expected = "{ A } --> { B } --> { N } --> { C } --> { D } --> { X } --> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void kthFromEndWorkingFine() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("A");
        MyTest.insert("B");
        MyTest.insert("C");
        MyTest.insert("D");
        MyTest.insert("X");
        MyTest.insert("<3");

        String expected = "C";
        assertEquals(expected, MyTest.kthFromEnd(3));
    }

    @Test
    void zipTwoArgs() {
        LinkedList linkedList1 = new LinkedList();

        linkedList1.insert("X");
        linkedList1.insert("Y");
        linkedList1.insert("Z");

        LinkedList linkedList2 = new LinkedList();

        linkedList2.insert("1");
        linkedList2.insert("2");
        linkedList2.insert("3");


        LinkedList zipperList=new LinkedList();
        String expected="{ X } --> { 1 } --> { Y } --> { 2 } --> { Z } --> { 3 } --> NULL";
        assertEquals(expected,zipperList.zip(linkedList2,linkedList1));
    }
}
