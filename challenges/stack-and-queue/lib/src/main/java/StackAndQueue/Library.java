/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StackAndQueue;


public class Library {
    public static void  main(String[] args) throws IllegalArgumentException {


        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());


        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println(queue);
        System.out.println(queue.isEmpty());
//        System.out.println(queue.peek());
        queue.dequeue();


//        <<<< code challenge 11 >>>

        PseudoQueue stack1 = new PseudoQueue();

        stack1.enqueue(20);
        stack1.enqueue(15);
        stack1.enqueue(10);

        System.out.println(stack1);


        stack1.enqueue(5);
        System.out.println(stack1);

        System.out.println(stack1.dequeue());
        System.out.println(stack1);

        System.out.println(stack1.dequeue());
        System.out.println(stack1);

        stack1.enqueue(7);
        System.out.println(stack1);


    }

}
