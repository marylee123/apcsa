import java.io.*;
import java.util.*;

public class Queue{
  // This Queue class is designed for integer values >= 0

  // Place private instance variables here
  private Node head;
  private int size;
  // Place constructors here
  public Queue(){
    head = null;
    size = 0;
  }


  // Enqueue a new value to the queue
  public void enqueue(int value){
    //Node newNode = new Node(value);
    Node walker = head;
    if(walker != null){
      while(walker.getNext() != null){
        walker = walker.getNext();
      }
      walker.setNext(new Node(value));
    }
    else{
        head = new Node(value);
    }
    size++;
  }


  // Dequeue a value from the queue
  public int dequeue(){
    Node original = head;
    head = head.getNext();
    size--;
    return original.getData();
  }

  // Return the front/top
  public int front(){
    return head.getData();
  }


  // Check is queue is empty
  public boolean isEmpty(){
    if(size == 0){
      return true;
    }
    return false;
  }

  // Return queue size
  public int size(){
    return size;
  }


  // Print queue
  public String toString(){
    Node walker = head;
    String accumulator = "";

    while(walker != null){
      accumulator += walker.getData() + " ";
      walker = walker.getNext();
    }
    return accumulator;
  }

}
