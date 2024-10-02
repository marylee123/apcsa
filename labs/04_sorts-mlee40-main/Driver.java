import java.util.Random;

public class Driver{
	public static void main(String[] args){
		Random random = new Random();
		int[] array = new int[7];
		for(int k = 0; k < array.length; k++){
			array[k] = random.nextInt();
		}

		System.out.println("Bubble Sort");
		for(int k = 0; k < array.length; k++){
			System.out.print(array[k] + " ");
		}
		System.out.println();
		Sorts.BubbleSort(array);

		System.out.println();

		System.out.println("Insertion Sort");
		for(int k = 0; k < array.length; k++){
			System.out.print(array[k] + " ");
		}
		System.out.println();
		Sorts.InsertionSort(array);

		System.out.println();

		System.out.println("Selection Sort");
		for(int k = 0; k < array.length; k++){
			System.out.print(array[k] + " ");
		}
		System.out.println();
		Sorts.SelectionSort(array);

		//Random ran = new Random();
	}
}
