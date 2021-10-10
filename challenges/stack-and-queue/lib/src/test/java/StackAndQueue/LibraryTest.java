/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StackAndQueue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    public void canPush() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(15);
        try {
            assertEquals(15, stack.peek(), "Method should return the top value of the stack");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canPushMultiValue() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(15);
        stack.push(1);
        stack.push(10);

        try {
            assertEquals(10, stack.peek(), "Method should return the top value of the stack");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canPop() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(15);
        stack.push(1);
        stack.push(10);

        try {
            assertEquals(10, stack.pop(), "Method should return the top value of the stack");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canEmptyStack() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(15);
        stack.push(1);
        stack.push(10);
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            assertTrue(stack.isEmpty(), "The method should return true if the stack is empty");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canPeekNext() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(15);
        stack.push(1);
        stack.push(10);
        try {
            assertEquals(1, stack.getTop().getNext().getData(), "The method should return the second top value");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canInstantiate() {
        Stack<Integer> stack = new Stack<Integer>();
        assertTrue(stack.isEmpty(), "Method should return true if stack is empty");
    }

    @Test
    public void raisesExceptionStack() {
        Stack<Integer> stack = new Stack<Integer>();

        try {
            stack.pop();
        } catch (Exception e) {
            assertEquals("sorry, empty stack!", e.getMessage(), e.getMessage());
        }
    }

    @Test
    public void canEnqueue() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(12);

        try {
            assertEquals(12, queue.peek(), "Method should return the first element value from the Queue");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canMultiEnqueue() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(1);

        try {
            assertEquals(14, queue.peek(), "Method should return the first element value from the Queue");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canDequeue() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(1);

        try {
            assertEquals(14, queue.dequeue(), "Method should return the first element value from the Queue after removing it from the queue");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canPeek() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(1);

        try {
            assertEquals(14, queue.peek(), "Method should return the first element value from the Queue");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canEmptyQueue() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(1);

        try {
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            assertTrue(queue.isEmpty(), "Method should return true if the queue is empty");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canInstantiateQueue() {
        Queue<Integer> queue = new Queue<Integer>();
        assertTrue(queue.isEmpty(), "Method should return true if the queue is empty");
    }

    @Test
    public void raisesExceptionQueue() {
        Queue<Integer> queue = new Queue<Integer>();

        try {
            queue.peek();
        } catch (Exception e) {
            assertEquals("Can't peek empty Queue!", e.getMessage(), e.getMessage());
        }
    }

}