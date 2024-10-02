public class Driver{
  public static void main(String[] args){
    // Testing Deque with array of integers
    System.out.println("Testing Deque with array of integers");
    MyDeque<Integer> dequeInt = new MyDeque<Integer>(10);

    System.out.println(dequeInt); // expecting []
    System.out.println();

    // catching Exceptions
    System.out.println("Testing Exceptions");
    try{
      System.out.println("Testing removeFirst()");
      System.out.println(dequeInt.removeFirst());
    }
    catch(Exception e){
      System.out.println(e);
    }
    try{
      System.out.println("Testing removeLast()");
      System.out.println(dequeInt.removeLast());
    }
    catch(Exception e){
      System.out.println(e);
    }
    try{
      System.out.println("Testing getFirst()");
      System.out.println(dequeInt.getFirst());
    }
    catch(Exception e){
      System.out.println(e);
    }
    try{
      System.out.println("Testing getLast()");
      System.out.println(dequeInt.getLast());
    }
    catch(Exception e){
      System.out.println(e);
    }
    try{
      System.out.println("Testing addFirst()");
      dequeInt.addFirst(null);
      System.out.println(dequeInt);
    }
    catch(Exception e){
      System.out.println(e);
    }
    try{
      System.out.println("Testing addLast()");
      dequeInt.addLast(null);
      System.out.println(dequeInt);
    }
    catch(Exception e){
      System.out.println(e);
    }

    System.out.println();

    // testing add methods
    try{
      // testing addFirst()
      System.out.println("Testing addFirst()");
      dequeInt.addFirst(5);
      System.out.println(dequeInt); // expecting [5]

      dequeInt.addFirst(4);
      System.out.println(dequeInt); // expecting [4, 5]

      dequeInt.addFirst(3);
      System.out.println(dequeInt); // expecting [3, 4, 5]

      dequeInt.addFirst(8);
      System.out.println(dequeInt); // expecting [8, 3, 4, 5]

      dequeInt.addFirst(0);
      System.out.println(dequeInt); // expecting [0, 8, 3, 4, 5]
      System.out.println();

      // testing addLast()
      System.out.println("Testing addLast()");
      dequeInt.addLast(1);
      System.out.println(dequeInt); // expecting [0, 8, 3, 4, 5, 1]

      dequeInt.addLast(7);
      System.out.println(dequeInt); // expecting [0, 8, 3, 4, 5, 1, 7]

      dequeInt.addLast(5);
      System.out.println(dequeInt); // expecting [0, 8, 3, 4, 5, 1, 7, 5]

      dequeInt.addLast(4);
      System.out.println(dequeInt); // expecting [0, 8, 3, 4, 5, 1, 7, 5, 4]

      dequeInt.addLast(6);
      System.out.println(dequeInt); // expecting [0, 8, 3, 4, 5, 1, 7, 5, 4, 6]
      System.out.println();
    }
    catch(Exception e){
      System.out.println(e);
    }

    // testing remove and getter methods
    try{
      // testing removeFirst()
      System.out.println("Testing removeFirst()");
      System.out.println(dequeInt.removeFirst()); // expecting 0
      System.out.println(dequeInt); // expecting [8, 3, 4, 5, 1, 7, 5, 4, 6]

      System.out.println(dequeInt.removeFirst()); // expecting 8
      System.out.println(dequeInt); // expecting [3, 4, 5, 1, 7, 5, 4, 6]
      System.out.println();

      // testing removeLast()
      System.out.println("Testing removeLast()");
      System.out.println(dequeInt.removeLast()); // expecting 6
      System.out.println(dequeInt); // expecting [3, 4, 5, 1, 7, 5, 4]

      System.out.println(dequeInt.removeLast()); // expecting 4
      System.out.println(dequeInt); // expecting [3, 4, 5, 1, 7, 5]
      System.out.println();

      // testing getFirst()
      System.out.println("Testing getFirst()");
      System.out.println(dequeInt.getFirst()); // expecting 3
      System.out.println();

      // testing getLast()
      System.out.println("Testing getLast()");
      System.out.println(dequeInt.getLast()); // expecting 5
      System.out.println();

      // testing size()
      System.out.println("Testing size()");
      System.out.println(dequeInt.size()); // expecting 6
      System.out.println();

      // testing getData()
      System.out.println("Testing getData()");
      System.out.println(dequeInt.getData());
      System.out.println();

      // testing getData();
      System.out.println("Testing getStart()");
      System.out.println(dequeInt.getStart()); // expecting 8
      System.out.println();

      // testing getData();
      System.out.println("Testing getEnd()");
      System.out.println(dequeInt.getEnd()); // expecting 3
      System.out.println();
    }
    catch(Exception e){
      System.out.println(e);
    }

    // testing resize();
    try{
      System.out.println("Testing resize()");
      dequeInt.addFirst(100);
      dequeInt.addFirst(100);
      dequeInt.addFirst(100);
      dequeInt.addFirst(100);
      dequeInt.addFirst(100);
      System.out.println(dequeInt); // expecting [100, 100, 100, 100, 100, 3, 4, 5, 1, 7, 5]
      System.out.println();
    }
    catch(Exception e){
      System.out.println(e);
    }

    System.out.println();
    System.out.println();

    // Testing Deque with array of strings
    System.out.println("Testing Deque with array of strings");
    MyDeque<String> dequeString = new MyDeque<String>(10);

    System.out.println(dequeString); // expecting []
    System.out.println();

    // testing add methods
    try{
      // testing addFirst()
      System.out.println("Testing addFirst()");
      dequeString.addFirst("d");
      System.out.println(dequeString); // expecting [d]

      dequeString.addFirst("c");
      System.out.println(dequeString); // expecting [c, d]

      dequeString.addFirst("b");
      System.out.println(dequeString); // expecting [b, c, d]

      dequeString.addFirst("a");
      System.out.println(dequeString); // expecting [a, b, c, d]
      System.out.println();

      // testing addLast()
      System.out.println("Testing addLast()");
      dequeString.addLast("e");
      System.out.println(dequeString); // expecting [a, b, c, d, e]

      dequeString.addLast("f");
      System.out.println(dequeString); // expecting [a, b, c, d, e, f]

      dequeString.addLast("g");
      System.out.println(dequeString); // expecting [a, b, c, d, e, f, g]

      dequeString.addLast("h");
      System.out.println(dequeString); // expecting [a, b, c, d, e, f, g, h]

      dequeString.addLast("i");
      System.out.println(dequeString); // expecting [a, b, c, d, e, f, g, h, i]

      dequeString.addLast("j");
      System.out.println(dequeString); // expecting [a, b, c, d, e, f, g, h, i, j]
      System.out.println();
    }
    catch(Exception e){
      System.out.println(e);
    }

    // testing remove and getter methods
    try{
      // testing removeFirst()
      System.out.println("Testing removeFirst()");
      System.out.println(dequeString.removeFirst()); // expecting "a"
      System.out.println(dequeString); // expecting [b, c, d, e, f, g, h, i, j]

      System.out.println(dequeString.removeFirst()); // expecting "b"
      System.out.println(dequeString); // expecting [c, d, e, f, g, h, i, j]

      System.out.println(dequeString.removeFirst()); // expecting "c"
      System.out.println(dequeString); // expecting [d, e, f, g, h, i, j]
      System.out.println();

      // testing removeLast()
      System.out.println("Testing removeLast()");
      System.out.println(dequeString.removeLast()); // expecting "j"
      System.out.println(dequeString); // expecting [d, e, f, g, h, i]

      System.out.println(dequeString.removeLast()); // expecting "i"
      System.out.println(dequeString); // expecting [d, e, f, g, h]
      System.out.println();

      // testing getFirst()
      System.out.println("Testing getFirst()");
      System.out.println(dequeString.getFirst()); // expecting "d"
      System.out.println();

      // testing getLast()
      System.out.println("Testing getLast()");
      System.out.println(dequeString.getLast()); // expecting "h"
      System.out.println();

      // testing size()
      System.out.println("Testing size()");
      System.out.println(dequeString.size()); // expecting 5
      System.out.println();

      // testing getData()
      System.out.println("Testing getData()");
      System.out.println(dequeString.getData());
      System.out.println();

      // testing getData();
      System.out.println("Testing getStart()");
      System.out.println(dequeString.getStart()); // expecting 0
      System.out.println();

      // testing getData();
      System.out.println("Testing getEnd()");
      System.out.println(dequeString.getEnd()); // expecting 4
      System.out.println();
    }
    catch(Exception e){
      System.out.println(e);
    }

    // testing resize();
    try{
      System.out.println("Testing resize()");
      dequeString.addLast("z");
      dequeString.addLast("z");
      dequeString.addLast("z");
      dequeString.addLast("z");
      dequeString.addLast("z");
      dequeString.addLast("z");
      System.out.println(dequeString); // expecting [d, e, f, g, h, z, z, z, z, z, z]
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
