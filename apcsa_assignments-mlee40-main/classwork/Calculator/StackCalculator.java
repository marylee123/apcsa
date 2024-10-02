/*import java.lang.Object;
import java.util.AbstractCollection<E>;
import java.util.AbstractList<E>;
import java.util.Vector<E>;*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
public class StackCalculator{
	public static void main(String[] args){
		try{
			System.out.println(eval("11 3 - 4 + 2.5 *")); // expecting 30.0
			System.out.println(eval("21 4.0 +")); // expecting 25.0
			System.out.println(eval("8 2 + 99 9 - * 2 + 9 -")); // expecting  893.0
			System.out.println(eval("1 2 3 4 5 + * - -")); // expecting 26.0
			System.out.println(eval("15.6 3.7 5.9 7.1 18.7 - + - +")); // expecting 25.0
			System.out.println(eval("100")); // expecting 100.0
			System.out.println(eval("32.0 20.0 18 % 8 * /")); // expecting  2.0
			System.out.println(eval("19.7 4.4 13.7 8.9 * * 6.0 4.1 / * 7.1 - - 8.6 9.9 14.2 + - 8.5 2.8 - - 0.1 / 12.3 / 14.6 15.2 18.3 / 11.3 6.9 + / / / 10.1 18.8 9.0 / 5.6 / / - 9.0 4.4 + 3.3 14.1 4.8 + / 6.8 0.7 1.5 + + 6.4 - / + 3.9 3.7 15.5 * 5.7 12.0 + 8.3 * - 14.6 13.1 / 10.4 / + - * 16.7 5.4 - 12.1 * - / +")); // expecting -758.3344574395414
		}
		catch(Exception e){
			System.out.println(e);
		}


		System.out.println();


		// expecting Exceptions
		try{
			System.out.println(eval("")); // expecting an IllegalArgumentException "too few operands"
		} catch(Exception e){
			System.out.println(e);
		}

		try{
			System.out.println(eval("1 1 1 +")); // expecting an IllegalArgumentException "too many operands"
		} catch(Exception e){
			System.out.println(e);
		}

		try{
			System.out.println(eval("1 1 1 - * +")); // expecting an IllegalArgumentException "too few operands for operation +"
		} catch(Exception e){
			System.out.println(e);
		}

	}
	public static double eval(String expression) throws Exception{
		Scanner input = new Scanner(expression);
		Stack calc = new Stack();

		while(input.hasNext()){
			String element = input.next();
			if((!element.equals("+")) && (!element.equals("-")) && (!element.equals("/")) && (!element.equals("*")) && (!element.equals("%"))){
				calc.push(Double.parseDouble(element));
			}
			else{
				if(calc.size() >= 2){
					if(element.equals("+")){
						double num1 = (double)calc.pop();
						double num2 = (double)calc.pop();
						calc.push(num1 + num2);
					}
					else if(element.equals("-")){
						double num1 = (double)calc.pop();
						double num2 = (double)calc.pop();
						calc.push(num2 - num1);
					}
					else if(element.equals("/")){
						double num1 = (double)calc.pop();
						double num2 = (double)calc.pop();
						calc.push(num2 / num1);
					}
					else if(element.equals("*")){
						double num1 = (double)calc.pop();
						double num2 = (double)calc.pop();
						calc.push(num1 * num2);
					}
					else if(element.equals("%")){
						double num1 = (double)calc.pop();
						double num2 = (double)calc.pop();
						calc.push(num2 % num1);
					}
				}
				else{
					throw new IllegalArgumentException("Too few operands");
				}
			}
			//calc.push(Double.parseDouble(element));
			//System.out.println(Double.parseDouble(element));
		}
		if(calc.size() == 1){
			return (double)calc.pop();
		}
		else if(calc.size() > 1){
			throw new IllegalArgumentException("Too many operands");
		}
		else{
			throw new IllegalArgumentException("Too few operands");
		}

	}

}
