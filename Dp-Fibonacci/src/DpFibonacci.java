import java.util.HashMap;
import java.util.Map;

public class DpFibonacci {

	static Map<Integer, Integer> FibonacciCache = new HashMap<>();

	private static int Fibonacci(Integer n) {
		if (n <= 2)
			return 1;

		if (FibonacciCache.containsKey(n))
			return FibonacciCache.get(n);

		int FibResult=Fibonacci(n - 1) + Fibonacci(n - 2);
		FibonacciCache.put(n, FibResult);
		return FibResult;
	}

	public static void main(String[] args) {
		FibonacciCache.put(0, 1);
		FibonacciCache.put(1, 1);
		FibonacciCache.put(2, 1);

		System.out.println(Fibonacci(10));
	}
}
