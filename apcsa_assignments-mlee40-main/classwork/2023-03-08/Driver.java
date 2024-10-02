import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    MyLinkedList myList = new MyLinkedList();

    myList.add("1");
    myList.add("2");
    myList.add("3");
    myList.add("4");

    System.out.println(myList); // expecting 4 3 2 1
    System.out.println(myList.get(2)); // expecting 2
    System.out.println(myList.toString()); // expecting 4 3 2 1
    System.out.println(myList.size()); // expecting 4

    myList.add(3, "0");

    System.out.println(myList); // expecting 4 3 2 1 0
    System.out.println(myList.indexOf("3")); // expecting 1

    myList.remove(1);

    System.out.println(myList); // expecting 4 2 1 0
  }
}
