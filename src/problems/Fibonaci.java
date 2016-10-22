package problems;

public class Fibonaci {

	public int fib(int n) {
		int A[] = { 0, 1, 0 }; // constant space
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n > 1) {

			do {

				A[2] = A[0] + A[1];
				A[0] = A[1];
				A[1] = A[2];
				n -= 1;
			} while (n > 1);
			return A[2];
		}
		return 0;
	}

}
