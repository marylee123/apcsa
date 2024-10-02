// reads input.txt file, creates a 2D array with that data and prints the 2D array.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
  public static void main(String[] args) {
    try {
      File file = new File("input.txt");
      Scanner input = new Scanner(file);
      int row = 5;
      int column = 4;
      int[][] matrix = new int[row][column];

      for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[i].length; j++){
          matrix[i][j] = input.nextInt();
        }
      }
      for(int r = 0; r < matrix.length; r++){
        for(int c = 0; c < matrix[r].length; c++){
          System.out.print(matrix[r][c] + " ");
        }
        System.out.println();
      }
      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found
    }
  }
}
