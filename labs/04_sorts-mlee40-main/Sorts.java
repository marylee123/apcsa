public class Sorts{
	public static void BubbleSort(int[] original){
		int[] array = new int[original.length];
		for(int i = 0; i < array.length; i++){
			array[i] = original[i];
		}

		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length-i-1; j++){
				if(array[j] > array[j+1]){
					int intermediate = array[j];
					array[j] = array[j+1];
					array[j+1] = intermediate;
				}
			}
			for(int k = 0; k < array.length; k++){
				System.out.print(array[k] + " ");
			}
			System.out.println();
		}
	}

	public static void InsertionSort(int[] original){
		int[] array = new int[original.length];
		for(int i = 0; i < array.length; i++){
			array[i] = original[i];
		}

		for(int i = 1; i < array.length; i++){
			int j = i;
			while(array[j] < array[j-1]){
				int intermediate = array[j];
				array[j] = array[j-1];
				array[j-1] = intermediate;
				if(j > 1){
					j--;
				}
			}
			for(int k = 0; k < array.length; k++){
				System.out.print(array[k] + " ");
			}
			System.out.println();
		}
	}
	public static void SelectionSort(int[] original){
		int[] array = new int[original.length];
		for(int i = 0; i < array.length; i++){
			array[i] = original[i];
		}

		for(int i = 0; i < array.length-1; i++){
			int min_index = i;
			for(int j = i+1; j < array.length; j++){
				if(array[min_index]>array[j]){
					min_index = j;
				}
			}
			int intermediate = array[i];
			array[i] = array[min_index];
			array[min_index] = intermediate;
			for(int k = 0; k < array.length; k++){
				System.out.print(array[k] + " ");
			}
			System.out.println();
		}
	}
}
