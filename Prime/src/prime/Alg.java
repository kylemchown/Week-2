package prime;

import java.util.ArrayList;

public class Alg {

	public void a(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int a = 2;
		primes.add(2);
		for (int i = 3; i <= n; i++) {
			if (i % 2 == 1) {
				outerloop: for (int j : primes) {
					if (i % j == 0) {
						a = 2;
						break outerloop;
					} else {
						a = i;
					}
				}
				if (primes.contains(a)) {

				} else {
					primes.add(a);
				}

			}
		}
		System.out.println(primes.size());

	}
}
