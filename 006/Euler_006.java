/*
  The sum of the squares of the first ten natural numbers is,

    1^2 + 2^2 + ... + 10^2 = 385

  The square of the sum of the first ten natural numbers is,

    (1 + 2 + ... + 10)^2 = 55^2 = 3025

  Hence the difference between the sum of the squares of the first ten natural
  numbers and the square of the sum is 3025 - 385 = 2640.

  Find the difference between the sum of the squares of the first one hundred
  natural numbers and the square of the sum.
*/

public class Euler_006 {
  public static void main(String[] args) {
    int sumOfSquares = sumOfSquares(100);
    int squareOfSum = squareOfSum(100);
    System.out.println(squareOfSum - sumOfSquares);
  }

  private static int sumOfSquares(int n) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i * i;
    }
    return sum;
  }

  private static int squareOfSum(int n) {
    int sum = (n * (n + 1)) / 2;
    return sum * sum;
  }
}
