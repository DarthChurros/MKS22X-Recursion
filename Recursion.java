public class Recursion {
  public static double sqrt(double n, double tolerance) {
    return sqrt(n, tolerance/100, 1.0);
  }

  private static double sqrt(double n, double tol, double guess) {
    if (n == 0) {
      return 0.0;
    }
    if (Math.abs(guess * guess - n) > tol*tol) {
      return sqrt(n, tol, (n / guess + guess) / 2);
    }
    return guess;
  }

  public static int fib(int n) {
    if (n == 0) return 0;
    return fib(n, 0, 1);
  }

  private static int fib(int n, int prev1, int prev2) {
    if (n > 1) {
      return fib(n-1, prev1 + prev2, prev1);
    }
    return prev1 + prev2;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 45; i++) {
      System.out.println("fib("+i+") = "+fib(i));
    }
  }
}
