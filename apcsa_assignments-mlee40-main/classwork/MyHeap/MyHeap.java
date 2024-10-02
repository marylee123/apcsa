public class MyHeap {
  private int[] Heap;
  private int size;
  private int maxsize;

  public MyHeap(int numElements) {
    maxsize = numElements;
    size = 0;
    Heap = new int[maxsize + 1];
  }

  private int parent(int pos) {
    // RETURN POSTION PARENT
    return (pos-1)/2;
  }

  private int leftChild(int pos) {
    // RETURN POSITION LEFTCHILD
    return 2*pos+1;
  }

  private int rightChild(int pos) {
    // RETURN POSITION LEFTCHILD
    return 2*(pos+1);
  }


  private void swap(int idx1, int idx2) {
      // YOUR CODE HERE
      int temp = Heap[idx1];
      Heap[idx1] = Heap[idx2];
      Heap[idx2] = temp;

    //  System.out.println("swap");
    //  print();
  }

  private void downHeapify(int pos) {
    if (pos >= (size / 2) && pos <= size)
      return;
    if(leftChild(pos) >= size || rightChild(pos) >= size){
      return;
    }

    if (Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)]) {
      // YOUR CODE HERE
      if(Heap[leftChild(pos)] < Heap[rightChild(pos)]){
        swap(rightChild(pos),pos);
        downHeapify(rightChild(pos));
      }
      else{
        swap(leftChild(pos),pos);
        downHeapify(leftChild(pos));
      }
      /*swap(size-1,pos);
      heapifyUp(size-1);
      downHeapify();
      System.out.println("downheapify");
      print();*/
    }
  }

  private void heapifyUp(int pos) {
    int temp = Heap[pos];
    while(pos>0 && temp > Heap[parent(pos)]){
      // YOUR CODE HERE
      swap(pos, parent(pos));
      pos = parent(pos);
    }
    Heap[pos] = temp;
  //  System.out.println("upheapify");
  //  print();
  }


  public void insert(int element) {
    // YOUR CODE HERE
    Heap[size] = element;
    heapifyUp(size);
    size++;
  }

  public void print() {
    // YOUR CODE HERE
    int first = 0;
    for(int i = 0; i < size; i++){
      if((i-1)/2 == first){
        System.out.println();
        first = i;
      }
      System.out.print(Heap[i] + " ");
    }
    System.out.println();
  }

  public int deleteRoot() {
    // YOUR CODE HERE
    int temp = Heap[0];
    swap(0,size-1);

    Heap[size-1] = 0;
    size--;
    downHeapify(0);

    return temp;
  }

}
