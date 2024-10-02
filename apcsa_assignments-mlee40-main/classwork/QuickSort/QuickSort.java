public class QuickSort{
  public static void main(String[] args){
    int[] array = new int[]{5,4,8,9,0,3,2,1};
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();

    QuickSort(array, 0, array.length-1);
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
    //System.out.println();
    //System.out.println(quickSelect(array, 0, 7, 6));
  }

  public static int partition(int[] data, int start, int end){
    int intermediate;
    int pivot = (int) (Math.random() * (end - start)) + start;
    //System.out.println(data[pivot]);
    if(pivot != start){
      intermediate = data[pivot];
      data[pivot] = data[start];
      data[start] = intermediate;
      pivot = start;
      start++;
    }
    while(start != end){
      if(data[start] > data[pivot]){
        intermediate = data[end];
        data[end] = data[start];
        data[start] = intermediate;
        end--;
      }
      else{
        start++;
      }
    }
    if(data[start] <= data[pivot]){
      intermediate = data[pivot];
      data[pivot] = data[start];
      data[start] = intermediate;
      pivot = start;
    }
    else{
      intermediate = data[pivot];
      data[pivot] = data[start-1];
      data[start-1] = intermediate;
      pivot = start-1;
    }
    /*for(int i = 0; i < data.length; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println();*/
    return pivot;
  }

  public static void QuickSort(int[] data, int start, int end){
    if(start < end){
      int pivot = partition(data, start, end);
      QuickSort(data, start, pivot-1);
      QuickSort(data, pivot+1, end);
    }
  }
}
