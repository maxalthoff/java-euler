/*
  2520 is the smallest number that can be divided by each of the numbers from
  1 to 10 without any remainder.

  What is the smallest possible number that is evenly divisible by all of the
  numbers from 1 to 20?
*/

public class Euler_005 {
  public static void main(String[] args) {
    for (int i = 20; ; i += 20) {
      if (evenlyDivisibleByOneToTwenty(i)) {
        System.out.println(i);
        break;
      }
    }
  }

  private static boolean evenlyDivisibleByOneToTwenty(int n) {
    for (int i = 1; i <= 20; i++) {
      if (n % i != 0) { return false; }
    }
    return true;
  }
}
