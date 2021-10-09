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
}
