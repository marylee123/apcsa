import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String text = "This is a sample\nOf how to read\ntext!";

    // creates a Scanner object to read throug the String
    Scanner input = new Scanner("10 14 9 -3 0");

    //you don't want a for loop here unless you know the size of the data set

    while(input.hasNext()){
      System.out.println(input.next());
    }
    //Alternate loop:
    //while(input.hasNextLine()){
      //  System.out.println(input.nextLine());
      //}
    }
  }
