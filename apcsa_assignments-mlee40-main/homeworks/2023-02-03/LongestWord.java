// find the longest word inside my_text.txt and print that word
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LongestWord {
  public static void main(String[] args) {
    try {
      File file = new File("my_text.txt");
      Scanner input = new Scanner(file);

      int longestLength = 0;
      String longestWord = "";
      while (input.hasNext()) {
        String word = input.next();
        if (word.length() > longestLength){
            longestWord = word;
            longestLength = word.length();
            //System.out.print(word);
        }
      }
      System.out.println(longestWord);
      input.close();//releases the file from your program
   
    } catch (FileNotFoundException ex) {
      //File not found
    }
  }
}
