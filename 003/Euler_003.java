/*
  The prime factors of 13195 are 5, 7, 13, and 29.

  What is the largest prime factor of the number 600851475143?
*/

import java.util.TreeSet;

public class Euler_003 {
  private static TreeSet<Long> memo = new TreeSet<>();

  public static void main(String[] args) {
    long n = 600_851_475_143L;
    long largestPrimeFactor = 2L;
    for (long i = 3L; n > 1; i++) {
      if (isPrime(i) && n % i == 0) {
        n /= i;
        largestPrimeFactor = i;
      }
    }

    System.out.println(largestPrimeFactor);
  }

  private static boolean isPrime(long n) {
    if (n < 2) { return false; }
    if (n == 2) {
      memo.add(n);
      return true;
    }
    if (n % 2 == 0) { return false; }
    for (Long prime: memo) {
      if (prime > Math.sqrt(n)) { break; }
      if (n % prime == 0) { return false; }
    }
    memo.add(n);
    return true;
  }
}
