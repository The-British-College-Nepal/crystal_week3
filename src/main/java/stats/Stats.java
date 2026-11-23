
package stats;

import java.util.Arrays;

/**
 * A class that stores numbers and calculates statistics.
 *
 * @author Your Name
 */
public class Stats {

	// STEP 1.2: Encapsulate fields
	private int[] numbers;
	private int count;

	/**
	 * Creates a Stats object with the given capacity.
	 *
	 * @param capacity maximum number of values
	 */
	public Stats(int capacity) {
		numbers = new int[capacity];
		count = 0;
	}

	/**
	 * Adds a value to the array.
	 *
	 * @param value number to add
	 */
	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	/**
	 * Returns the number of values added.
	 *
	 * @return actual number of values
	 */
	public int getCount() {
		return this.count;
	}

	/**
	 * Returns the maximum value.
	 *
	 * @return highest value
	 */
	public int getMax() {

		if (count == 0) {
			throw new IllegalStateException("No values have been added");
		}

		int max = numbers[0];

		for (int i = 1; i < count; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		return max;
	}

	/**
	 * Returns the minimum value.
	 *
	 * @return lowest value
	 */
	public int getMin() {

		if (count == 0) {
			throw new IllegalStateException("No values have been added");
		}

		int min = numbers[0];

		for (int i = 1; i < count; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		return min;
	}

	/**
	 * Calculates the sum of all added values.
	 *
	 * @return total sum
	 */
	public int getTotal() {

		int total = 0;

		for (int i = 0; i < count; i++) {
			total += numbers[i];
		}

		return total;
	}

	/**
	 * Calculates the average of all added values.
	 *
	 * @return average value
	 */
	public double getAverage() {

		if (count == 0) {
			throw new IllegalStateException("No values have been added");
		}

		return (double) getTotal() / count;
	}

	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}
}
