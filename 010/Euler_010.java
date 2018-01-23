/*
  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

  Find the sum of all the primes below two million.
*/

import java.util.TreeSet;

public class Euler_010 {
  private static TreeSet<Long> memo = new TreeSet<>();

  public static void main(String[] args) {
    generatePrimes(2_000_000);

    long sum = 0;
    for (Long prime: memo) {
      sum += prime;
    }

    System.out.println(sum);
  }

  private static void generatePrimes(long n) {
    long current = 2L;
    outer:
    while (current < n) {
      if (current < 2) {
        current++;
        continue outer;
      }

      if (current == 2) {
        memo.add(current);
        current++;
        continue outer;
      }

      if (current % 2 == 0) {
        current++;
        continue outer;
      }

      for (Long prime: memo) {
        if (prime > Math.sqrt(current)) {
          break;
        }

        if (current % prime == 0) {
          current++;
          continue outer;
        }
      }

      memo.add(current);
      current++;
    }
  }
}
