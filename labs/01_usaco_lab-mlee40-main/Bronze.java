import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Bronze {
  public static void main(String[] args) {
    try {
      File file = new File("files/makelake.in");
      Scanner input = new Scanner(file);
      int R = input.nextInt();
      int C = input.nextInt();
      int E = input.nextInt();
      int N = input.nextInt();
      int[][] lake = new int[R][C];
      
      for (int row = 0; row < R; row++){
        for (int column = 0; column < C; column++){
          lake[row][column] = input.nextInt();
        }
      }

      while(input.hasNext()){
        int R_s = input.nextInt() - 1;
        int C_s = input.nextInt() - 1;
        int D_s = input.nextInt();
        int[][] herd = new int[3][3];
        
        int max_elev = lake[R_s][C_s];
        for (int r = 0; r < 3; r++){
          for (int c = 0; c < 3; c++){
            herd[r][c] = lake[R_s + r][C_s + c];
            if (max_elev < herd[r][c]){
              max_elev = herd[r][c];
            }
          }
        }

        max_elev = max_elev - D_s;

        for (int i = 0; i < 3; i++){
          for (int j = 0; j < 3; j++){
            if (max_elev < herd[i][j]){
              lake[R_s + i][C_s + j] = max_elev;
            }
          }
        }

      }
      int volume = 0;
      for (int xcor = 0; xcor < R; xcor++){
        for (int ycor = 0; ycor < C; ycor++){
          volume += lake[xcor][ycor];
        }
      }
      volume = (R*C*E - volume) * 5184;
      System.out.println(volume);

      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found
      System.out.println("oops");
    }
  }
}
