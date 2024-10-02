import java.io.*;
import java.util.*;

public class Stack{
  // This Stack class is designed for integer values >= 0

  // Instance variables here
  private Node head;
  private int size;
  // Constructor
  public Stack(){
    head = null;
    size = 0;
  }

  // Add element to stack
  public void push(int value){
    Node node = new Node(value, head);
    head = node;
    size++;
  }

  // Remove element from stack
  public int pop(){
    Node original = head;
    head = head.getNext();
    size--;
    return original.getData();
  }

  // Get top element
  public int top(){
    return head.getData();
  }

  // Check is stack empty
  public boolean isEmpty(){
    if(size == 0){
      return true;
    }
    return false;
  }

  // Return size stack
  public int size(){
    return size;
  }

  // Print stack
  public String toString(){
    // Create a reference to head. It will help loop through the list
    Node walker = head;
    String accumulator = "";

    while(walker != null){
      accumulator += walker.getData() + " ";
      walker = walker.getNext();
    }
    return accumulator;
  }
}
