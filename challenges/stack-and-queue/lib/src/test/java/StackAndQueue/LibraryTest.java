/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StackAndQueue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Animals.AllAnimals;
import Animals.Cats;
import Animals.Dogs;
import StackQueueBraclets.BracketValidation;


public class LibraryTest {

    // <<<<< code challenge 10 + 11 >>>>>
    @Test
    public void checkPush() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(15);
        try {
            assertEquals(15, stack.peek(), "Method should return the top value of the stack");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkPushMultiValue() {
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
    public void checkPop() {
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
    public void checkEmptyStack() {
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
    public void checkPeekNext() {
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
    public void checkInstantiate() {
        Stack<Integer> stack = new Stack<Integer>();
        assertTrue(stack.isEmpty(), "Method should return true if stack is empty");
    }

    @Test
    public void checkExceptionStack() {
        Stack<Integer> stack = new Stack<Integer>();

        try {
            stack.pop();
        } catch (Exception e) {
            assertEquals("Empty", e.getMessage(), e.getMessage());
        }
    }

    @Test
    public void checkEnqueue() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(12);

        try {
            assertEquals(12, queue.peek(), "Method should return the first element value from the Queue");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkMultiEnqueue() {
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
    public void checkDequeue() {
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
    @Test
    public void checkEnqueue2() throws Exception {
        PseudoQueue<Integer> queue = new PseudoQueue<>();

        queue.enqueue(12);

        try {
            assertEquals(12, queue.dequeue(), "Method should return the first element value from the Queue");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canMultiEnqueue2() throws Exception {
        PseudoQueue<Integer> queue = new PseudoQueue<>();

        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(1);

        try {
            assertEquals(14, queue.dequeue(), "Method should return the first element value from the Queue");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canDequeue2() {
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
    // <<<<< code challenge 12 >>>>>

    @Test
    public void raisesExceptionQueueAnimal() {
        AnimalShelter<String> queue = new AnimalShelter<String>();


        AnimalShelter animalShelter=new AnimalShelter();
        Cats cat1=new Cats("shemsh");
        Cats cat2=new Cats("kitkit");


        Dogs dog1=new Dogs("Rocky");
        Dogs dog2=new Dogs("MILO");

        AllAnimals duck1=new AllAnimals("daffy");
        AllAnimals duck2=new AllAnimals("Quacky");

        animalShelter.enqueue(cat1);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(dog2);
        animalShelter.enqueue(duck1);
        animalShelter.enqueue(duck2);



    }


    @Test
    public void checkMultiEnqueueAnimal() throws Exception {
        AnimalShelter<String> queue = new AnimalShelter<String>();


        AnimalShelter animalShelter=new AnimalShelter();
        Cats cat1=new Cats("Oliver");
        Cats cat2=new Cats("Loki");


        Dogs dog1=new Dogs("Rex");
        Dogs dog2=new Dogs("Baily");

        AllAnimals duck1=new AllAnimals("Biscuit");
        AllAnimals duck2=new AllAnimals("Cookie");

        animalShelter.enqueue(cat1);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(dog2);
        animalShelter.enqueue(duck1);
        animalShelter.enqueue(duck2);
        System.out.println(dog1);

        try {
            assertEquals("Dogs{type='Rex'}", animalShelter.dequeue(dog1), "Method should return the first element value from the Queue after removing it from the queue");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canDequeueAnimal() {
        AnimalShelter<String> queue = new AnimalShelter<String>();


        AnimalShelter animalShelter=new AnimalShelter();
        Cats cat1=new Cats("Oliver");
        Cats cat2=new Cats("Loki");


        Dogs dog1=new Dogs("Rex");
        Dogs dog2=new Dogs("Baily");

        AllAnimals duck1=new AllAnimals("Biscuit");
        AllAnimals duck2=new AllAnimals("Cookie");

        animalShelter.enqueue(cat1);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(dog2);
        animalShelter.enqueue(duck1);
        animalShelter.enqueue(duck2);


        try {
            assertEquals("Dogs{ name=>'Rex'}\n", animalShelter.dequeue(dog1), "Method should return the first element value from the Queue after removing it from the queue");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
