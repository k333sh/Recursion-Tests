public class A4Q2Starter {
  public static void main(String[] args) {
    System.out.println("rulerSequence(5):");
    System.out.println(rulerSequence(5));
    
    System.out.println("\nRunning tests:");
    verifyString("0", rulerSequence(1), "rulerSequence(1)");
    verifyString("010", rulerSequence(2), "rulerSequence(2)");
    verifyString("010201030102010", rulerSequence(4), "rulerSequence(4)");
    verifyString("0102010301020104010201030102010501020103010201040102010301020106010201030102010401020103010201050102010301020104010201030102010", rulerSequence(7), "rulerSequence(7)");
    verifyString("010201030102010401020103010201050102010301020104010201030102010601020103010201040102010301020105010201030102010401020103010201070102010301020104010201030102010501020103010201040102010301020106010201030102010401020103010201050102010301020104010201030102010801020103010201040102010301020105010201030102010401020103010201060102010301020104010201030102010501020103010201040102010301020107010201030102010401020103010201050102010301020104010201030102010601020103010201040102010301020105010201030102010401020103010201090102010301020104010201030102010501020103010201040102010301020106010201030102010401020103010201050102010301020104010201030102010701020103010201040102010301020105010201030102010401020103010201060102010301020104010201030102010501020103010201040102010301020108010201030102010401020103010201050102010301020104010201030102010601020103010201040102010301020105010201030102010401020103010201070102010301020104010201030102010501020103010201040102010301020106010201030102010401020103010201050102010301020104010201030102010", rulerSequence(10), "rulerSequence(10)");
    
    System.out.println("\n*** End of program. ***");
  }
  
  public static void verifyString(String expected, String result, String action) {
    boolean isNull = false;
    boolean nullMatch = false;
    if (expected == null || result == null) {
      isNull = true;
      nullMatch = expected == result;
    }
    if ((isNull && nullMatch) || (!isNull && expected.equals(result))) {
      System.out.printf("Test succeeded: %s\n", action);
    } else {
      System.out.printf("Test FAILED (expected %s, got %s): %s\n", expected, result, action);
    }
  }
  
  public static String rulerSequence(int n) {
   
    // Implement recursion here...
    //code made by iteoluwakisi oyewusi 
    //assignment 4 question 3
    String result = ""; //result is an empty string
    if(n== 1){
      result = "0"; //result  is "0" if n is 1 
    }
    else{
      result = "" + rulerSequence(n-1) + (n-1) + rulerSequence(n-1); //else concatenate the recursive calls for n with n-1 in between both calls
    }

    
    return result;//return result 
  }
}