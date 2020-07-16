class JavaVariable {
  public static void main(String[] args) {
//    static int final CONST_VALUE = 10; // This is a const variable
    

    // byte data type is an 8-bit signed two's complement integer
    // it's same with C++ char type. The range is from -128 to 127
    byte oneByteVariable = 0;
   
    // short data type is 16-bit signed two's complement, same with C++
    short twoBytesVarialble = 0;

    // int data type is 32-bit signed, same with C++
    int fourBytesVariable = 0;
    
    long eightBytesVariable;

    // float is four bytes variable with single precision
    float floatVariable;

    // double is eight bytes variable with double precision
    double doubleVariable;

    // The document said that the size for this type isn't precisely defined.
    // In C++, it is bool
    boolean flagVariable;

    // char data type is a single 16-bit Unicode, range from '\u0000' to '\uffff'
    char characterVariable;

    int[] anArray = new int[10];

    for (int i = 0; i < 10; ++i) {
      anArray[i] = i;
    }
      
    for (int i = 0; i < 10; ++i) {
      System.out.println("Element " + i + ": " + anArray[i]);
    }
  }
}

