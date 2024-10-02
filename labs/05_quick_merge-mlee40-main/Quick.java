public class Quick{
  public static int QuickSelect(int[] data, int start, int end, int k){
    int pivot = partition(data, start, end);
    if(pivot > k-1){
      return QuickSelect(data, start, pivot-1, k);
    }
    else if(pivot < k-1){
      return QuickSelect(data, pivot+1, end, k);
    }
    else{
      return data[k-1];
    }
  }
  public static void QuickSort(int[] data, int start, int end){
    if(start < end){
      int pivot = partition(data, start, end);
      QuickSort(data, start, pivot-1);
      QuickSort(data, pivot+1, end);
    }
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
}
