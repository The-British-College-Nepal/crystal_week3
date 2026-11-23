
package stats;

import java.util.Arrays;

/**
 * A class that stores numbers and calculates statistics.
 *
 * @author Your Name
 */
public class Stats {

	private int[] numbers;
	private int count;

	public Stats(int capacity) {
		numbers = new int[capacity];
		count = 0;
	}

	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	public int getCount() {
		return this.count;
	}

	// STEP 2.3: Calculate maximum value
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

	// STEP 2.4: Calculate minimum value
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

	// STEP 2.1: Calculate total
	public int getTotal() {

		int total = 0;

		for (int i = 0; i < count; i++) {
			total += numbers[i];
		}

		return total;
	}

	// STEP 2.2: Calculate average
	public double getAverage() {

		if (count == 0) {
			throw new IllegalStateException("No values have been added");
		}

		return getTotal() / (double) count;
	}

	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}
}
