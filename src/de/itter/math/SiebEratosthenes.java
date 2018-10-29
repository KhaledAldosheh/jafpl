package de.itter.math;

import java.util.Vector;

/**
 * 
 * @author Erik Itter
 *
 */
public class SiebEratosthenes {

	private Vector<Integer> primes = new Vector<Integer>();
	private int maximum = 0;

	public SiebEratosthenes(int maximum) {

		this.maximum = maximum;

		boolean[] isPrime = field(maximum);

		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				primes.add(new Integer(i));
			}
		}
	}

	/**
	 * For readability the number n is represented by index n, not n-1.
	 * 
	 * @param maximum
	 * @return
	 */
	public static boolean[] field(int maximum) {
		boolean[] isPrime = new boolean[maximum + 1];// waste a little for
		// readability
		for (int i = 2; i <= maximum; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i * i <= maximum; i++) {

			if (isPrime[i]) {
				for (int j = i; i * j <= maximum; j++) {
					isPrime[i * j] = false;
				}
			}
		}
		return isPrime;
	}

	public int nth(int n) {
		if (maximum < n) {
			new SiebEratosthenes(n);
		}
		return primes.elementAt(n - 1).intValue();
	}

	public Vector<Integer> primes(int maximun) {
		if (primes.size() == 0 || primes.elementAt(primes.size() - 1) < maximum) {
			new SiebEratosthenes(maximun);
		}

		return primes;
	}

}
