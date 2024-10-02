public class Recursion{
  public static void main(String[] args){
    // testing bunnyEars()
    System.out.println(bunnyEars(0)); // expecting 0
    System.out.println(bunnyEars(1)); // expecting 2
    System.out.println(bunnyEars(2)); // expecting 4

    System.out.println();

    // testing triangle()
    System.out.println(triangle(0)); // expecting 0
    System.out.println(triangle(1)); // expecting 1
    System.out.println(triangle(2)); // expecting 3

    System.out.println();

    // testing strCopies()
    System.out.println(strCopies("catcowcat", "cat", 2)); // expecting true
    System.out.println(strCopies("catcowcat", "cow", 2)); // expecting false
    System.out.println(strCopies("catcowcat", "cow", 1)); // expecting true

    System.out.println();

    // testing array11()
    int[] array1 = new int[]{1, 2, 11};
    int[] array2 = new int[]{11, 11};
    int[] array3 = new int[]{1, 2, 3, 4};

    System.out.println(array11(array1, 0)); // expecting 1
    System.out.println(array11(array2, 0)); // expecting 2
    System.out.println(array11(array3, 0)); // expecting 0

    System.out.println();

    // testing countPairs()
    System.out.println(countPairs("axa")); // expecting 1
    System.out.println(countPairs("axax")); // expecting 2
    System.out.println(countPairs("axbx")); // expecting 1

    System.out.println();

    // testing groupSum()
    int[] gs1 = new int[]{2,4,8};

    System.out.println(groupSum(0, gs1, 10)); // expecting true
    System.out.println(groupSum(0, gs1, 14)); // expecting true
    System.out.println(groupSum(0, gs1, 9)); // expecting false

  }

  public static int bunnyEars(int bunnies){
    if(bunnies == 0){
      return 0;
    }
    else{
      return 2 + bunnyEars(bunnies-1);
    }
  }
  public static int triangle(int rows){
    if(rows == 0){
      return 0;
    }
    else{
      return rows + triangle(rows-1);
    }
  }
  public static boolean strCopies(String str, String sub, int n){
    int length = sub.length();
    if(n == 0){
      return true;
    }
    else{
      if(length > str.length()){
        return false;
      }
      else{
        if(str.substring(0,length).equals(sub)){
          return strCopies(str.substring(length), sub, n-1);
        }
        else{
          return strCopies(str.substring(length), sub, n);
        }
      }
    }

  }
  public static int array11(int[] nums, int index){
    if(index < nums.length){
      if(nums[index] == 11){
        return 1 + array11(nums, index+1);
      }
      return array11(nums, index+1);
    }
    else{
      return 0;
    }
  }

  public static int countPairs(String str){
    if(str.length() > 2){
      String left = str.substring(0, 1);
      String right = str.substring(2, 3);
      if(left.equals(right)){
        return 1 + countPairs(str.substring(1));
      }
      return countPairs(str.substring(1));
    }
    else{
      return 0;
    }
  }
  public static boolean groupSum(int start, int[] nums, int target){
    
  }
}
