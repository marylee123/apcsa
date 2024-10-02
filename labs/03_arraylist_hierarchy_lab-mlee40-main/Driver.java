import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    try{
      NoNullArrayList<Integer> array = new NoNullArrayList<Integer>();
      array.add(2);
      System.out.println(array);
      array.add(6);
      System.out.println(array);
      array.add(7);
      System.out.println(array);
      array.add(7);
      System.out.println(array);
      array.add(-1);
      System.out.println(array);
      array.add(0);
      System.out.println(array);
      array.set(4, 6);
      System.out.println(array);

      System.out.println(array);
      array.add(null);
      System.out.println(array);
      array.set(2, null);
    }
    catch(Exception e){
      System.out.println(e);
    }
    System.out.println();
    try{
      OrderedArrayList<Integer> arr = new OrderedArrayList<Integer>();
      arr.add(2);
      System.out.println(arr);
      arr.add(6);
      System.out.println(arr);
      arr.add(7);
      System.out.println(arr);
      arr.add(7);
      System.out.println(arr);
      arr.add(-1);
      System.out.println(arr);
      arr.add(0);
      System.out.println(arr);
      arr.set(4, 6);

      System.out.println(arr);
      arr.add(null);
      System.out.println(arr);
      arr.set(2, null);
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
