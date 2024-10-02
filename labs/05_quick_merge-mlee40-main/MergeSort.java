import java.util.Arrays;
public class MergeSort{
  public static void main(String args[]){
		int[] array = new int[]{0,2,4,5,3,2,6,9,60,5,3,0};
		for(int k = 0; k < array.length; k++){
			System.out.print(array[k] + " ");
		}
    System.out.println();
    int[] newArray = MergeSort(array);
    for(int k = 0; k < newArray.length; k++){
			System.out.print(newArray[k] + " ");
		}
  }
  //Sorts the array
  public static int[] MergeSort(int[] data){
    if(data.length > 1){
      int[] L = new int[data.length/2];
      for(int i = 0; i < L.length; i++){
  			L[i] = data[i];
  		}
      MergeSort(L);

      int[] R = new int[data.length - (data.length/2)];
      for(int i = 0; i < R.length; i++){
  			R[i] = data[data.length/2 + i];
  		}
      MergeSort(R);

      merge(data,L,R);
      return data;
    }
    else{
      return data;
    }
  }
  // Merge two sorted arrays. You may use any of these two options:
  /*public static int[] merge(int[] left, int[] right){

  }*/
  public static void merge(int[] destination, int[] left, int[] right){
    int l = 0;
    int r = 0;
    while(l < left.length && r < right.length){
      if(left[l] < right[r]){
        destination[l+r] = left[l];
        l++;
      }
      else{
        destination[l+r] = right[r];
        r++;
      }
    }
    while(l < left.length){
      destination[l+r] = left[l];
      l++;
    }
    while(r < right.length){
      destination[l+r] = right[r];
      r++;
    }
  }
}
