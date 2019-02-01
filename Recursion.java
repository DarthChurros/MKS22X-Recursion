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

  public static void main(String[] args) {
    //for (int i = 0; i < 20; i++) {
      //System.out.println("sqrt("+i+") = "+sqrt(i, 0.001));
    //}
    System.out.println("sqrt(2) = "+sqrt(2,0.1));
  }
}
