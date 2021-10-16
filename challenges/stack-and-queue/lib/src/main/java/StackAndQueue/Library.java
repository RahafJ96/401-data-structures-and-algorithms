/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StackAndQueue;

import Animals.Cats;
import Animals.Dogs;
import Animals.AllAnimals;
import Game.DuckDuckGooseGame;
import StackQueueBraclets.BracketValidation;

public class Library {
    public static void  main(String[] args) throws Exception {
        DuckDuckGooseGame game = new DuckDuckGooseGame();

        game.addToQueue("A");
        game.addToQueue("B");
        game.addToQueue("C");
        game.addToQueue("D");
        game.addToQueue("E");

        //System.out.println(""+game.DuckDuckGoose(3));


        stackDemo();
        queueDemo();

        pseudoQueueDemo();

        //animalShelterDemo();

        //bracketValidate();

//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println(stack);
//
//        stack.pop();
//
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());
//
//
//        Queue<Integer> queue = new Queue<>();
//
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//
//        System.out.println(queue);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//
//        System.out.println(queue);
//        System.out.println(queue.isEmpty());
////        System.out.println(queue.peek());
//        queue.dequeue();
//
//
////        <<<< code challenge 11 >>>
//
//        PseudoQueue stack1 = new PseudoQueue();
//
//        stack1.enqueue(20);
//        stack1.enqueue(15);
//        stack1.enqueue(10);
//
//        System.out.println("PseudoQueue:  "+stack1);
//
//
//        stack1.enqueue(5);
//        System.out.println("PseudoQueue(enqueue):  "+stack1);
//
//        System.out.println("deQueue: "+stack1.dequeue());
//        System.out.println(stack1);
//
//        System.out.println("deQueue: "+stack1.dequeue());
//        System.out.println(stack1);
//
//        stack1.enqueue(7);
//        System.out.println("enQueue:  "+stack1);


    }
    public static void stackDemo() throws Exception {
        Stack stack = new Stack();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println("<<<<<<<< Stack >>>>>>>>");

        System.out.println("The Top of the stack is => " + stack.peek());

        System.out.println(stack.pop());

        System.out.println("The Top of the stack is => " + stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

    public static void queueDemo() throws Exception {
        Queue queue = new Queue();

        queue.enqueue("R");
        queue.enqueue("A");
        queue.enqueue("H");
        queue.enqueue("A");
        queue.enqueue("F");


        System.out.println("<<<<<<<<<<<< Queue >>>>>>>>>>>>");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("The front of the Queue is => " + queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }



    public static void pseudoQueueDemo() throws Exception {
        PseudoQueue pseudoQueue=new PseudoQueue();
        pseudoQueue.enqueue("Pseudo");
        pseudoQueue.enqueue(0);
        pseudoQueue.enqueue(20);

        System.out.println("<<<<<<<<<<<< Pseudo >>>>>>>>>>>>");

        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());
    }
    public static void animalShelterDemo()throws Exception{
        AnimalShelter animalShelter=new AnimalShelter();
        Cats cat1=new Cats("Oliver");
        Cats cat2=new Cats("Loki");


        Dogs dog1=new Dogs("Rex");
        Dogs dog2=new Dogs("Baily");

        AllAnimals hamster1=new AllAnimals("Biscuit");
        AllAnimals hamster2=new AllAnimals("Cookie");

        animalShelter.enqueue(cat1);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(dog2);
        animalShelter.enqueue(hamster1);
        animalShelter.enqueue(hamster2);
        System.out.println("\n"+"<<<<<<<<<<<< Animal Shelter >>>>>>>>>>>>");

        System.out.println(animalShelter.dequeue("dog"));
        System.out.println(animalShelter.dequeue("cat"));
        System.out.println("\n"+"<<<<<<<<<<<<< All Animals >>>>>>>>>>>>>>");

        System.out.println(animalShelter.dequeue("Ace"));
        System.out.println("\n"+"<<<<<<<<<<<<<<<<< Cats >>>>>>>>>>>>>>>>>>");

        System.out.println(animalShelter.dequeue("cat"));
        System.out.println(animalShelter.dequeue("cat"));
        System.out.println(animalShelter.dequeue("cat"));

        System.out.println("\n"+"<<<<<<<<<<<<<< Hamsters >>>>>>>>>>>>>>>");

        System.out.println(animalShelter.dequeue("Angel"));
        System.out.println("\n"+"<<<<<<<<<<<<<<<< Dogs >>>>>>>>>>>>>>>>>");

        System.out.println(animalShelter.dequeue("dog"));
        System.out.println(animalShelter.dequeue("dog"));
        System.out.println(animalShelter.dequeue("dog"));
        System.out.println("\n"+"<<<<<<<<<<< Shelter Search >>>>>>>>>>>>");

        System.out.println("Search for Ducks in the Shelter: "+animalShelter.dequeue("duck"));

    }
    public static void bracketValidate() throws Exception{
        BracketValidation validate=new BracketValidation();
        System.out.println(validate.validateBrackets("([}){}{)"));
        System.out.println(validate.validateBrackets("{{[()]}}"));

    }

}
