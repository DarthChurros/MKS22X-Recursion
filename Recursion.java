public class Recursion {
  public static double sqrt(double n) {
    return sqrt(n, 1.0);
  }

  private static double sqrt(double n, double guess) {
    if (n == 0) {
      return 0.0;
    }
    if (Math.abs(guess * guess - n) > 0.000001) {
      return sqrt(n, (n / guess + guess) / 2);
    }
    return Math.round(guess*1000)/1000.0;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 20; i++) {
      System.out.println("sqrt("+i+") = "+sqrt(i));
    }
  }
}
