/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StackAndQueue;

public class Library {
    public static void main(String[] args) throws Exception {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);
        System.out.println("Peek: "+stack.peek());
        System.out.println(stack.isEmpty());

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.peek();

        System.out.println(queue);
        System.out.println("Peek: "+queue.peek());
        System.out.println(queue.isEmpty());

        queue.dequeue();

    }
}
