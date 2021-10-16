package StackAndQueue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    Stack stack = new Stack();
    Queue queue = new Queue();


    @Test
    @DisplayName("Stack can push successfully")
    public void stackPush() {
        stack.push("A");
        stack.push("B");
        stack.push("C");
        boolean isEmpty = stack.isEmpty();
        assertFalse(isEmpty);
    }

    @Test
    @DisplayName("Stack can push Multiple Value")
    public void stackMultiValues() {
        stack.push("A");
        stack.push("B");
        stack.push("C");

        assertEquals("Stack{top=Node{data='C', next=Node{data='B', next=Node{data='A', next=null}}}}", stack.toString());
    }

    @Test
    @DisplayName("Stack can pop successfully")
    public void stackPop() {
        stack.push("A");
        stack.push("B");
        stack.push("C");

        stack.pop();

        assertEquals("Stack{top=Node{data='B', next=Node{data='A', next=null}}}", stack.toString());
    }

    @Test
    @DisplayName("Stack can successfully be empty")
    public void stackEmpty() {
        stack.push("A");
        stack.push("B");
        stack.push("C");

        stack.pop();
        stack.pop();
        stack.pop();


        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("Stack can successfully get the next peek")
    public void Peek() {
        stack.push("A");
        stack.push("B");
        stack.push("C");

        stack.pop();

        String nextPeek = stack.peek();
        assertEquals(nextPeek, stack.peek());
    }

    @Test
    @DisplayName("empty Stack ")
    public void emptyStack() {
        assertTrue(stack.isEmpty());

    }

    @Test
    @DisplayName("Peek, Pop exception")
    public void exception() {

        assertEquals("stack is empty", stack.peek());
        assertEquals("Stack is empty", stack.pop());
    }

    @Test
    @DisplayName("Queue can enqueue successfully")
    public void queuePush() {
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        assertFalse(queue.isEmpty());
    }

    @Test
    @DisplayName("Queue can enqueue Multiple Value")
    public void queueMultiValues() {
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        assertEquals("Queue{front=Node{data='A', next=Node{data='B', next=Node{data='C', next=null}}}, rear=Node{data='C', next=null}}", queue.toString());
    }

    @Test
    @DisplayName("Queue can dequeue successfully")
    public void queuePop() {
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        queue.dequeue();

        assertEquals("Queue{front=Node{data='B', next=Node{data='C', next=null}}, rear=Node{data='C', next=null}}", queue.toString());
    }

    @Test
    @DisplayName("Queue can successfully be empty")
    public void queueEmpty() {
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        boolean isEmpty = queue.isEmpty();
        assertTrue(isEmpty);
    }

    @Test
    @DisplayName("Queue can successfully get the next peek")
    public void queuePeek() {
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        queue.dequeue();

        String nextPeek = queue.peek();
        assertEquals(nextPeek, queue.peek());
    }

    @Test
    @DisplayName("empty Queue")
    public void emptyQueue() {
        assertTrue(queue.isEmpty());

    }

    @Test
    @DisplayName("Peek, Pop exception")
    public void queueException() {

        assertEquals("Queue is empty", queue.peek());
        assertEquals("Queue is empty", queue.dequeue());
    }

    @Test
    @DisplayName("PseudoQueue Test")
    public void Pseudo() {
        PseudoQueue multiStack = new PseudoQueue();
        multiStack.enqueue("A");
        multiStack.enqueue("B");
        multiStack.enqueue("C");
        multiStack.enqueue("D");
        multiStack.enqueue("E");

        Queue queue = new Queue();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");

        multiStack.dequeue();
        multiStack.dequeue();
        multiStack.dequeue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();


        assertEquals(multiStack.firstStack.peek(), queue.peek());
    }

    @Test
    @DisplayName("Animal shelter test")
    public void AnimalShelter() throws Exception {

        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(new Animal("Cats"));
        animalShelter.enqueue(new Animal("CaTs"));
        animalShelter.enqueue(new Animal("CAts"));
        animalShelter.enqueue(new Animal("Dogs"));
        animalShelter.enqueue(new Animal("Rocky"));

        assertEquals("not an animal",animalShelter.dequeue("Rocky"));
        assertEquals("cats",animalShelter.dequeue("cats"));
        assertEquals("cats",animalShelter.dequeue("cats"));
        assertEquals("cats",animalShelter.dequeue("cats"));
        assertEquals("dogs",animalShelter.dequeue("dogs"));
        assertEquals("not an animal",animalShelter.dequeue("cats"));

    }

}