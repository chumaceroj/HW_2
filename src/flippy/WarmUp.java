package flippy;

import java.util.Arrays;

public class WarmUp {
	
	/**
	 * Counts how many cards are hearts
	 * 
	 * @param cards an array of cards
	 * @return the number of cards that are hearts
	 */
	public static int countHearts(Card[] cards ){
		int counter = 0;

		for (int i = 0; i<cards.length; i++) { // loops through cards and adds to counter if the card is hearts
			if (cards[i].getSuit().equals("hearts")) {
				counter++;
			}
		}

		return counter; // returns number of cards that are of the hearts suit in the array cards
	}
	
	/**
	 * Add the elements of two arrays of the same length.  The function assumes that 
	 * the arrays are of the same length
	 * 
	 * @param array1
	 * @param array2
	 * @return a new array that is the element-wise sum of the input arrays 
	 */
	public static double[] addArraysSameLength(double[] array1, double[] array2){
		double[] sumArrays = new double[array1.length]; // creates a new array of doubles

		for (int i = 0; i<array1.length; i++) { // initializes each value of sumArrays by adding together the corresponding values of array1 and array2
			sumArrays[i] = array1[i] + array2[i];
		}
		
		return sumArrays;
	}
	
		
	/**
	* Reverses the order of elements in an array of Strings by mutating
	* elements in the given array
	*
	* @param array
	*/
	public static void reverseArray(String[] array){
		for (int i = 0; i<array.length/2; i++) { // loops through half of the array to swap values in the first half with the second half
			String initialValue = array[i]; // stores value before swap
			array[i] = array[array.length -i-1]; // changes value in second half of the array
			array[array.length-i-1] = initialValue; // changes value in first half of the array
		}
	}

	public static void main(String[] args){
		String[] words = {"I", "love", "my", "CS", "classes", "!"};
		
		System.out.println("Before: " + Arrays.toString(words));
		reverseArray(words);
		System.out.println("After: " + Arrays.toString(words));
	}
}
