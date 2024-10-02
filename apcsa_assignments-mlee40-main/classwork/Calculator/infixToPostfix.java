import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
public class infixToPostfix{
  public static void main(String[] args){
		convert("5 * 4 + 2");
    convert("10 + 8 * 4");
	}
  public static void convert(String expression){
    Scanner input = new Scanner(expression);
		Stack calc = new Stack();

		while(input.hasNext()){
			String element = input.next();

			if(element.equals("+") || element.equals("-") || element.equals("/") || element.equals("*") || element.equals("*")){
        if(calc.size() == 0){
          calc.push(element);
        }
        else{
          if((element.equals("+")) || (element.equals("-")) && ((calc.peek().equals("*")) || (calc.peek().equals("/")) || (calc.peek().equals("/")))){
            System.out.print(calc.pop() + " ");
            calc.push(element);
          } else{
            calc.push(element);
          }
        }
			}
			else{
				System.out.print(element + " ");
			}
    }
    //System.out.println();
    while(calc.size()>0){
      System.out.print(calc.pop() + " ");
    }
    System.out.println();
  }
}
