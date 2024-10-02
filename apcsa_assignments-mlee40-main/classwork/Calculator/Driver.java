import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Driver{
	public static void main(String[] args){
		try{
			File file = new File("PUT_FILENAME_HERE");
	    Scanner input = new Scanner(file);
	    while (input.hasNextLine()) {
	      String line = input.nextLine();
	      System.out.println(line);
			}
	    input.close();

			StackCalculator calc = new StackCalculator();
			System.out.println(calc.eval("1 2 +"));
		} catch (FileNotFoundException ex) {
      //File not found
    }
	}
}
