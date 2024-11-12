import java.util.Arrays;

public class A4Q3Starter {
  public static void main(String[] args) {
    int[] array;

    array = new int[] { 1, 5, 3, 7, 9, 1, 3, 7, 5, 3, 7, 1, 9 };
    verify(3, longestDuplicateSubsequence(array), Arrays.toString(array));

    array = new int[] { 3, 4, 1, 2, 4, 1, 2, 4, 3 };
    verify(4, longestDuplicateSubsequence(array), Arrays.toString(array));

    array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    verify(0, longestDuplicateSubsequence(array), Arrays.toString(array));

    array = new int[] { 1, 2, 3, 4, 5, 10, 6, 7, 8, 9, 10 };
    verify(1, longestDuplicateSubsequence(array), Arrays.toString(array));

    array = new int[] { 1, 2, 3, 4, 5, 6, 1, 2, 1, 2, 3, 4, 5, 1, 2, 3, 4 };
    verify(5, longestDuplicateSubsequence(array), Arrays.toString(array));

    array = new int[] { 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2 };
    verify(11, longestDuplicateSubsequence(array), Arrays.toString(array));

    array = new int[] { 1, 1, 1, 1, 1 };
    verify(4, longestDuplicateSubsequence(array), Arrays.toString(array));

    System.out.println("\n*** End of program. ***");
  }

  public static void verify(int expected, int result, String action) {
    if (expected == result) {
      System.out.printf("Test succeeded: %s\n", action);
    } else {
      System.out.printf("Test FAILED (expected %s, got %s): %s\n", expected, result, action);
    }
  }

  // Do not change the functions above here
  // ========================================================================
  // Modify/rewrite the function below, adding any other necessary functions

  //written  by oyewusi Iteoluwakisi 
  //assignment 4 question 3
  public static int longestDuplicateSubsequence(int[] array) {
    return longestDuplicateSubsequenceRec(array, 0, 0, 0); // call recursive helper method
  }

  // recursive helper method
  private static int longestDuplicateSubsequenceRec(int[] array, int i, int j, int maxlength) {
    int length = 0; // initiate length
    // if j has reached the end of the array
    if (j >= array.length) {
      return maxlength; // return maxLength
    }
    if (i == j) {
      length = longestDuplicateSubsequenceRec(array, i + 1, j + 1, 0); // if i is equal to j call recursion
    } else if (array[i] == array[j]){
      length = longestDuplicateSubsequenceRec(array, i + 1, j + 1, maxlength + 1);// if array at i matches with array at j increment i j and maxLength till  they no longer match
    }
    length = Math.max(length, longestDuplicateSubsequenceRec(array, i, j + 1, 0)); // return larger value between maxLength and recursive call for nested j loop of maxLength
    length = Math.max(maxlength, length);//return larger value between maxLength and length

    return length; // return length
  }

}