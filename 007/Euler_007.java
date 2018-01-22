/*
  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
  that the 6th prime is 13.

  What is the 10001st prime number?
*/

import java.util.TreeSet;

public class Euler_007 {
  private static TreeSet<Integer> memo = new TreeSet<>();

  public static void main(String[] args) {
    int count = 0;
    int n = 2;
    while (true) {
      if (isPrime(n)) {
        count++;
        if (count == 10001) {
          System.out.println(n);
          break;
        }
      }
      n++;
    }
  }

  private static boolean isPrime(int n) {
    if (n < 2) { return false; }
    if (n == 2) {
      memo.add(n);
      return true;
    }
    if (n % 2 == 0) { return false; }
    for (Integer prime: memo) {
      if (prime > Math.sqrt(n)) { break; }
      if (n % prime == 0) { return false; }
    }
    memo.add(n);
    return true;
  }
}
