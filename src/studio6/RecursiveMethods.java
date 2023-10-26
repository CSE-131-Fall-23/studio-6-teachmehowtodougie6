package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n==0) {
			return 0;
		}else {
			double geoSum = Math.pow(0.5, n)+ geometricSum(n-1);
			return geoSum;
		}
			// FIXME compute the geometric sum for the first n terms recursively
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (p % q == 0) {
			return q;
		} else {
			return gcd (q, (p%q));
		}
			// FIXME compute the gcd of p and q using recursion
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	
	public static void helper(int [] array, int index, int [] newArray) {
		if (index >= ((array.length-1)/2)) {
			newArray [array.length-index-1] = array [index];
			newArray[index] = array[array.length-index-1];
			helper (array, index-1, newArray);
		}
	}
	public static int[] toReversed(int[] array) {
		if (array.length == 0) {
			int [] tempArray = new int[array.length];
			return tempArray;
		} else {
			int index = array.length-1;
			int [] newArray = new int[array.length];
			helper(array, index, newArray);
			return newArray;
		}
		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
