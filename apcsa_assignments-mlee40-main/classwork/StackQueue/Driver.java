import java.io.*;
import java.util.*;

public class Driver {
  public static void main(String[] args){
    // testing Stack
    System.out.println("testing Stack");
    Stack stack = new Stack();

    // testing push()
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.println(stack); // expecting 4 3 2 1

    // testing pop()
    System.out.println(stack.pop()); // expecting 4
    System.out.println(stack); // expecting 3 2 1

    // testing top()
    System.out.println(stack.top()); // expecting 3

    //testing isEmpty()
    System.out.println(stack.isEmpty()); // expecting false

    // testing size()
    System.out.println(stack.size()); // expecting 3



    // testing Queue
    System.out.println("testing Queue");
    Queue queue = new Queue();

    // testing push()
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    System.out.println(queue); // expecting 1 2 3 4

    // testing pop()
    System.out.println(queue.dequeue()); // expecting 1
    System.out.println(queue); // expecting 2 3 4

    // testing top()
    System.out.println(queue.front()); // expecting 2

    //testing isEmpty()
    System.out.println(queue.isEmpty()); // expecting false

    // testing size()
    System.out.println(queue.size()); // expecting 3

  }
}
