package jafpl;

public class Palindrome {

	private static String PALINDROM_1 = "neben";
	private static String PALINDROM_2 = "Otto";
	private static String PALINDROM_3 = "Reliefpfeiler";
	private static String PALINDROM_2a = "otto";
	private static String PALINDROM_3a = "reliefpfeiler";
	private static String NOT_PALINDROM_1 = "ifjsdjfios";

	public static void main(String[] args) {

		System.out.println("\"" + PALINDROM_1 + "\" ist Palindrom?: "
				+ isPalindrom(PALINDROM_1));
		System.out.println("\"" + PALINDROM_3 + "\" ist Palindrom?: "
				+ isPalindrom(PALINDROM_3));
		System.out.println("\"" + PALINDROM_2 + "\" ist Palindrom?: "
				+ isPalindrom(PALINDROM_2));
		System.out.println("\"" + PALINDROM_3a + "\" ist Palindrom?: "
				+ isPalindrom(PALINDROM_3a));
		System.out.println("\"" + PALINDROM_2a + "\" ist Palindrom?: "
				+ isPalindrom(PALINDROM_2a));

	}

	/**
	 * Tests if a word provided is a palindrome.
	 * 
	 * @param word Word to be tested.
	 * @return <code>true</code> if <code>word</code> is palindrom,
	 *         <code>false</code> otherwise.
	 */
	private static boolean isPalindrom(String word) {

		char[] chars = word.toLowerCase().toCharArray();

		for (int i = 0; i < chars.length / 2; i++) {
			if (chars[i] != chars[chars.length - 1 - i]) {
				return false;
			}
		}

		return true;
	}

	private static void printASCIITable() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 16; j++) {
				System.out.print(" " + (char) (i * 16 + j) + " ");
			}
			System.out.println();
		}
	}

}