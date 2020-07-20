// import java.lang.CharSequence;

public class InverseCharSequence implements java.lang.CharSequence {

	private String inversedSequence;

	private static String createReverseString(String input) {
		byte[] inputByteArray = input.getBytes();
		byte[] reversedByteArray = new byte[inputByteArray.length];

		for (int i = 0; i < inputByteArray.length; ++i) {
			reversedByteArray[i] = inputByteArray[inputByteArray.length - i -1];
		}
		return new String(reversedByteArray);
	}

	public InverseCharSequence(String inputSequence) {
		inversedSequence = createReverseString(inputSequence);
	}

	public char charAt(int index) {
		return inversedSequence.charAt(index);
	}

	public int length() {
		return inversedSequence.length();
	}

	public CharSequence subSequence(int start, int end) {
		return inversedSequence.subSequence(start, end);
	}

	public String toString() {
		return inversedSequence;
	}

	public static void main(String[] args) {
		String inputString = "Your implementation should return the string backwards";
		InverseCharSequence inverseSequence = 
		new InverseCharSequence(inputString);
		System.out.println("Input string: " + inputString);
		System.out.println("Char at 3: " + inverseSequence.charAt(3));
		System.out.println("Length of sequence: " + inverseSequence.length());
		System.out.println("Subsequence in [4, 8): " + inverseSequence.subSequence(4, 8));
		System.out.println("toString() returns: " + inverseSequence.toString());
	}
}