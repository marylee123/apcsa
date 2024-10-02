import java.util.NoSuchElementException;

public class MyDeque<E>{
  // Instance variables
  private E[] data;
  private int size;
  private int start, end;

  // Constructors
  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[5];
    size = 0;
    start = 0;
    end = 0;
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
     data = (E[])new Object[initialCapacity];
     size = 0;
     start = 0;
     end = 0;
  }

  // Add a new value on the indicated side
  public void addFirst(E element) throws Exception{
    if(element != null){
      if(size == 0){
        data[0] = element;
        size++;
      }
      else{
        if(size < data.length){
          if(start == 0){
            start = data.length-1;
          }
          else{
            start--;
          }
          data[start] = element;
          size++;
        }
        else{
          resize();
          addFirst(element);
        }
      }
    }
    else{
      throw new NullPointerException("Cannot add null element");
    }
  }
  public void addLast(E element) throws Exception{
    if(element != null){
      if(size == 0){
        data[0] = element;
        size++;
      }
      else{
        if(size < data.length){
          if(end < data.length-1){
            end++;
          }
          else{
            end = 0;
          }
          data[end] = element;
          size++;
        }
        else{
          resize();
          addLast(element);
        }
      }
    }
    else{
      throw new NullPointerException("Cannot add null element");
    }
  }

  // Remove and return the element
  public E removeFirst() throws Exception{
    if(size > 0){
      int removed = start;
      if(start < data.length-1){
        start++;
      }
      else{
        start = 0;
      }
      size--;
      return data[removed];
    }
    else{
      throw new NoSuchElementException("Element does not exist");
    }
  }
  public E removeLast() throws Exception{
    if(size > 0){
      int removed = end;
      if(end > 0){
        end--;
      }
      else{
        end = data.length-1;
      }
      size--;
      return data[removed];
    }
    else{
      throw new NoSuchElementException("Element does not exist");
    }
  }

  // Return the element. Do not deleter elements.
  public E getFirst() throws Exception{
    if(size > 0){
      return data[start];
    }
    else{
      throw new NoSuchElementException("Element does not exist");
    }
  }
  public E getLast() throws Exception{
    if(size > 0){
      return data[end];
    }
    else{
      throw new NoSuchElementException("Element does not exist");
    }
  }

  // Return deque size
  public int size(){
    return size;
  }

  // Getters

  // Return data
  public E[] getData(){
    return data;
  }
  // Return start
  public int getStart(){
    return start;
  }
  // Return end
  public int getEnd(){
    return end;
  }

  // Resize the array. Double its length (data.length * 2)
  private void resize(){
    E[] doubleData = (E[])new Object[data.length*2];
    if(start == 0){
      for(int i = 0; i < data.length; i++){
        doubleData[i] = data[i];
      }
    }
    else{
      int newIndex = 0;
      for(int i = start; i < data.length; i++){
        doubleData[newIndex] = data[i];
        newIndex++;
      }
      for(int i = 0; i <= end; i++){
        doubleData[newIndex] = data[i];
        newIndex++;
      }
    }
    start = 0;
    end = data.length-1;
    data = doubleData;
  }

  // Return the deque as string. Ex.:  "[hello, my, dear, friends!]"
  public String toString(){
    if(size == 0){
      return "[]";
    }
    else if(size == 1){
      return "[" + data[0] + "]";
    }
    else{
      String accumulator = "[";
      if(start < end){
        for(int i = start; i < end; i++){
          accumulator += data[i] + ", ";
        }
      }
      else{
        for(int i = start; i < data.length; i++){
          accumulator += data[i] + ", ";
        }
        for(int i = 0; i < end; i++){
          accumulator += data[i] + ", ";
        }
      }
      accumulator += data[end] + "]";
      return accumulator;
    }
  }
}
