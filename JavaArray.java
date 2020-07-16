class JavaArray {
  public static void main(String[] args) {
    // Multi dimension java array can vary in row length unlike C++
    String[][] names = {
      {"Mr. ", "Mrs. ", "Ms. "},
      {"Smith", "Jones"}
    };
    
    // Array in java have the method to get length
    System.out.println("Length of java array: " + names.length);
    System.out.println(names[0][0] + names[1][0]);
    System.out.println(names[0][2] + names[1][1]);
    
    System.out.println("Destination array result");
    
    // Check arraycopy method
    JavaArray jarray = new JavaArray();
    jarray.copyArray();
    jarray.copyArrayRange();
  }


  private void copyArray() {
    // System class has arraycopy method used to efficiently copy data from
    // one array into another
    System.out.println("Call to method copyArray");
    char[] srcArray = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
    char[] dstArray = new char[7];
    System.arraycopy(srcArray, 2, dstArray, 0, 7);
    System.out.println(new String(dstArray));
  }

  private void copyArrayRange() {
    // Use java.util.Arrays.copyOfRange
    System.out.println("Call to method copyArrayRange");
    char[] srcArray = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
    char[] dstArray = java.util.Arrays.copyOfRange(srcArray, 2, 9);
    System.out.println(new String(dstArray));
  }

}
