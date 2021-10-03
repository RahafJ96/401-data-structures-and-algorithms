package LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    void instantiateLinkedList() {
        LinkedList MyTest = new LinkedList();
        assertNull(MyTest.head);
    }

    @Test
    void canInsert() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("1");
        MyTest.insert("5");
        MyTest.insert("2");
        MyTest.insert("9");
        MyTest.insert("7");

        String expected = "{ 1 } -> { 5 } -> { 2 } -> { 9 } -> { 7 } -> NULL";
        assertEquals(expected, MyTest.toString());
    }
    @Test
    void canAddBefore() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("1");
        MyTest.insert("5");
        MyTest.insert("2");
        MyTest.insert("9");
        MyTest.insert("7");

        String expected = "{ 1 } -> { 5 } -> { 2 } -> { 9 } -> { 7 } -> NULL";
        assertEquals(expected, MyTest.toString());
    }
    @Test
    void canAddAfter() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("1");
        MyTest.insert("5");
        MyTest.insert("2");
        MyTest.insert("9");
        MyTest.insert("7");

        String expected = "{ 1 } -> { 5 } -> { 2 } -> { 9 } -> { 7 } -> NULL";
        assertEquals(expected, MyTest.toString());
    }
    @Test
    void canRemove() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("1");
        MyTest.insert("5");
        MyTest.insert("2");
        MyTest.insert("9");
        MyTest.insert("7");

        String expected = "{ 1 } -> { 5 } -> { 2 } -> { 9 } -> { 7 } -> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void headPointsRight() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("1");
        MyTest.insert("5");
        MyTest.insert("2");
        MyTest.insert("9");
        MyTest.insert("7");

        String expected = "{ 1 } -> { 5 } -> { 2 } -> { 9 } -> { 7 } -> NULL";
    }

    @Test
    void canInsertMultiple() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("1");
        MyTest.insert("5");
        MyTest.insert("2");
        MyTest.insert("9");
        MyTest.insert("7");
        String expected = "{ 1 } -> { 5 } -> { 2 } -> { 9 } -> { 7 } -> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void LinkedListIncludes() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("1");
        MyTest.insert("5");
        MyTest.insert("2");
        MyTest.insert("9");
        MyTest.insert("7");
        MyTest.insert("33");
        assertTrue(MyTest.includes("8"));
    }

    @Test
    void LinkedListDoesntIncludes() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("1");
        MyTest.insert("5");
        MyTest.insert("2");
        MyTest.insert("9");
        MyTest.insert("7");
        MyTest.insert("33");

        assertFalse(MyTest.includes("3"));
        assertFalse(MyTest.includes("2"));
    }

    @Test
    void includesWorkingFine() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("1");
        MyTest.insert("5");
        MyTest.insert("2");
        MyTest.insert("9");
        MyTest.insert("7");
        MyTest.insert("33");
        String expected = "{ 1 } -> { 5 } -> { 2 } -> { 9 } -> { 7 } -> { 33 } -> NULL";
        assertEquals(expected, MyTest.toString());
    }
}
