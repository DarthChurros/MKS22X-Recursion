import java.util.ArrayList;

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

  public static ArrayList<Integer> makeAllSums(int n) {
    ArrayList<Integer> sums = new ArrayList<Integer>();
    makeAllSums(n, 0, sums);
    return sums;
  }

  private static void makeAllSums(int n, int sum, ArrayList<Integer> sums) {
    if (n > 0) {
      makeAllSums(n - 1, sum, sums);
      makeAllSums(n - 1, sum + n, sums);
    } else {
      sums.add(sum);
    }
  }

  public static void main(String[] args) {
    System.out.println("sqrt()");
    System.out.println("-----------------------\n");

    System.out.println("sqrt(4, 0.00001)");
    System.out.println("EXPECTED: 2");
    System.out.println(sqrt(4, 0.00001));         // 2

    System.out.println("----");

    System.out.println("sqrt(8, 0.00001)");
    System.out.println("EXPECTED: ~2.8284");
    System.out.println(sqrt(8, 0.00001));         // ~2.8284

    System.out.println("----");

    System.out.println("sqrt(0, 0.00001)");
    System.out.println("EXPECTED: 0");
    System.out.println(sqrt(0, 0.00001));         // 0

    System.out.println("\n");

    System.out.println("fib()");
    System.out.println("-----------------------\n");

    System.out.println("fib(0)");
    System.out.println("EXPECTED: 0");
    System.out.println(fib(0));                   // 0

    System.out.println("----");

    System.out.println("fib(1)");
    System.out.println("EXPECTED: 1");
    System.out.println(fib(1));                   // 1

    System.out.println("----");

    System.out.println("fib(7)");
    System.out.println("EXPECTED: 13");
    System.out.println(fib(7));                   // 13

    System.out.println("makeAllSums()");
    System.out.println("-----------------------\n");

    System.out.println("makeAllSums(0)");
    System.out.println("EXPECTED: [0]");
    System.out.println(makeAllSums(0));           // [0]

    System.out.println("----");

    System.out.println("makeAllSums(1)");
    System.out.println("EXPECTED: [1, 0]");
    System.out.println(makeAllSums(1));           // [1, 0]

    System.out.println("----");

    System.out.println("makeAllSums(3)");
    System.out.println("EXPECTED: [0, 3, 2, 5, 1, 4, 3, 6]");
    System.out.println(makeAllSums(3));           // [0, 3, 2, 5, 1, 4, 3, 6]
  }
}
