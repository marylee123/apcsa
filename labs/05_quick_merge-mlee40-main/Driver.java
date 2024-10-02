import java.util.Random;
public class Driver{
  public static void main(String args[]){
    // TEST CASE 1 ////////////////////////////////////////////////////
    System.out.println("TEST CASE 1");
    System.out.println("random array");
    Random random1 = new Random();
		int[] array1 = new int[7];
		for(int k = 0; k < array1.length; k++){
			array1[k] = random1.nextInt(0,100);
      System.out.print(array1[k] + " ");
		}
    System.out.println();
    System.out.println();
    // testing QuickSelect
    Quick quick_select1 = new Quick();
    System.out.println("3rd smallest element of the array");
    System.out.println(quick_select1.QuickSelect(array1, 0, array1.length-1, 3));

    System.out.println();
    System.out.println();

    // testing QuickSort
    Quick quick_sort1 = new Quick();
    System.out.println("sorted array using QuickSort algorithm");
    quick_sort1.QuickSort(array1,0,array1.length-1);
    for(int k = 0; k < array1.length; k++){
      System.out.print(array1[k] + " ");
		}

    System.out.println();
    System.out.println();

    // new random array
    System.out.println("new random array");
    Random newRandom1 = new Random();
    int[] newArray1 = new int[7];
    for(int k = 0; k < newArray1.length; k++){
			newArray1[k] = newRandom1.nextInt(0,100);
      System.out.print(newArray1[k] + " ");
		}

    System.out.println();
    System.out.println();

    // testing MergeSort
    MergeSort merged1 = new MergeSort();
    System.out.println("sorted array using MergeSort algorithm");
    merged1.MergeSort(newArray1);
    for(int k = 0; k < newArray1.length; k++){
      System.out.print(newArray1[k] + " ");
		}


    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();



    // TEST CASE 2 ////////////////////////////////////////////////////
    System.out.println("TEST CASE 2");
    System.out.println("random array");
    Random random2 = new Random();
		int[] array2 = new int[10];
		for(int k = 0; k < array2.length; k++){
			array2[k] = random2.nextInt(-50,50);
      System.out.print(array2[k] + " ");
		}
    System.out.println();
    System.out.println();
    // testing QuickSelect
    Quick quick_select2 = new Quick();
    System.out.println("5th smallest element of the array");
    System.out.println(quick_select2.QuickSelect(array2, 0, array2.length-1, 5));

    System.out.println();
    System.out.println();

    // testing QuickSort
    Quick quick_sort2 = new Quick();
    System.out.println("sorted array using QuickSort algorithm");
    quick_sort2.QuickSort(array2,0,array2.length-1);
    for(int k = 0; k < array2.length; k++){
      System.out.print(array2[k] + " ");
		}

    System.out.println();
    System.out.println();

    // new random array
    System.out.println("new random array");
    Random newRandom2 = new Random();
    int[] newArray2 = new int[10];
    for(int k = 0; k < newArray2.length; k++){
			newArray2[k] = newRandom2.nextInt(-50,50);
      System.out.print(newArray2[k] + " ");
		}

    System.out.println();
    System.out.println();

    // testing MergeSort
    MergeSort merged2 = new MergeSort();
    System.out.println("sorted array using MergeSort algorithm");
    merged2.MergeSort(newArray2);
    for(int k = 0; k < newArray2.length; k++){
      System.out.print(newArray2[k] + " ");
		}


    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();



    // TEST CASE 3 ////////////////////////////////////////////////////
    System.out.println("TEST CASE 3");
    System.out.println("random array");
    Random random3 = new Random();
		int[] array3 = new int[6];
		for(int k = 0; k < array3.length; k++){
			array3[k] = random3.nextInt(-100,0);
      System.out.print(array3[k] + " ");
		}
    System.out.println();
    System.out.println();
    // testing QuickSelect
    Quick quick_select3 = new Quick();
    System.out.println("2nd smallest element of the array");
    System.out.println(quick_select3.QuickSelect(array3, 0, array3.length-1, 2));

    System.out.println();
    System.out.println();

    // testing QuickSort
    Quick quick_sort3 = new Quick();
    System.out.println("sorted array using QuickSort algorithm");
    quick_sort3.QuickSort(array3,0,array3.length-1);
    for(int k = 0; k < array3.length; k++){
      System.out.print(array3[k] + " ");
		}

    System.out.println();
    System.out.println();

    // new random array
    System.out.println("new random array");
    Random newRandom3 = new Random();
    int[] newArray3 = new int[6];
    for(int k = 0; k < newArray3.length; k++){
			newArray3[k] = newRandom3.nextInt(-100,0);
      System.out.print(newArray3[k] + " ");
		}

    System.out.println();
    System.out.println();

    // testing MergeSort
    MergeSort merged3 = new MergeSort();
    System.out.println("sorted array using MergeSort algorithm");
    merged3.MergeSort(newArray3);
    for(int k = 0; k < newArray3.length; k++){
      System.out.print(newArray3[k] + " ");
		}
  }
}
