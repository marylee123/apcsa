import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Silver {
  public static void main(String[] args) {
    try {
        File file = new File("files/ctravel.in");
        Scanner input = new Scanner(file);
        int N = input.nextInt();
        int M = input.nextInt();
        int T = input.nextInt();

        String[][] grass = new String[N][M];


        for (int x = 0; x < N; x++){
            String line = input.next();
            grass[x] = line.split("");
        }

        int R1 = input.nextInt() - 1;
        int C1 = input.nextInt() - 1;
        int R2 = input.nextInt() - 1;
        int C2 = input.nextInt() - 1;

        int[][] curr_paths = new int[N][M];
        int[][] prev = new int[N][M];

        for (int row = 0; row < N; row++){
            for (int column = 0; column < M; column++){
                if(grass[row][column].equals("*")){
                    curr_paths[row][column] = -1;
                    prev[row][column] = -1;
                } 
            }
        }
        curr_paths[R1][C1] = 1;
        prev[R1][C1] = 1;
        int i = 1;


        while (i++ <= T){
            for (int r = 0; r < N; r++){
                for (int c = 0; c < M; c++){
                    if(prev[r][c] > 0){
                        curr_paths[r][c] = 0;
                    } 
                    if(prev[r][c] == 0){
                        int sum = 0;
                        if(r > 0 && prev[r-1][c] > 0){
                            sum += prev[r-1][c];
                        }
                        if(r < N-1 && prev[r+1][c] > 0){
                            sum += prev[r+1][c];
                        }
                        if(c > 0 && prev[r][c-1] > 0){
                            sum += prev[r][c-1];
                        }
                        if(c < M-1 && prev[r][c+1] > 0){
                            sum += prev[r][c+1];
                        }
                        curr_paths[r][c] = sum;
                    }
                }
            }
            for (int row = 0; row < N; row++){
                for (int column = 0; column < M; column++){
                    prev[row][column] = curr_paths[row][column];
                }
            }
        }
        System.out.println(curr_paths[R2][C2]);
     
        input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
        //File not found
        System.out.println("oops");
    }
  }
}

