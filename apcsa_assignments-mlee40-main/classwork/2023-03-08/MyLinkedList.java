import java.io.*;
import java.util.*;


public class MyLinkedList{

  private Node head;

  public MyLinkedList(){
    head = null;
  }


  /* Add a new node which data value to the front of the list */
  public void add(String value){
    Node temp = new Node(value, head);
  	head = temp;
  }

  /* Returns the value in the node at location index. */
  public String get(int index){

    // Create a reference to head. It will help loop through the list
    Node walker = head;

    int i = 0;
    while(walker != null){
      if(i == index){
    	  return walker.getData();
      }
      i++;
      walker = walker.getNext();
    }
    return "null";
    // Counter to track a node position
  }

  /* Return the list as a string */
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

  /* Returns the number of elements in the list */
  public int size(){
    Node walker = head;

    int size = 0;
    while(walker != null){
      size++;
      walker = walker.getNext();
    }

    return size;
  }


  /*Adds a new node which contains value at index */
  public void add(int index, String value){
    Node walker = head;
    int i = 0;
    while(i < index){
      walker = walker.getNext();
      i++;
    }

    Node newNode = new Node(value);
    Node next = walker.getNext();

    walker.setNext(newNode);
    walker.getNext();
    newNode.setNext(next);
  }


  /* Returns the index of the first node in the list that contains value. */
  public int indexOf(String value){
    Node walker = head;
    int i = 0;
    while(walker != null){
      if(walker.getData().equals(value)){
        return i;
      }
      walker = walker.getNext();
      i++;
    }
    return -1;
  }


  /* Remove node al location index */

  public void remove(int index){
    if(index==0){
      head=head.getNext();
      return;
    }
    Node walker = head;
    for(int i = 0; i< index-1; i++){
      walker = walker.getNext();
    }
    walker.setNext(walker.getNext().getNext());
  }
}
