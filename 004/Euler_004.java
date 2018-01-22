/*
  A palindromic number reads the same both ways. The largest palindrome made
  from the product of two 2-digit numbers is 9009 = 91 x 99.

  Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Euler_004 {
  public static void main(String[] args) {
    int n = 999 * 999;
    for (int i = n; i >= 0; i--) {
      if (isPalindrome(i) && isProductOfThreeDigitNumbers(i)) {
        System.out.println(i);
        break;
      }
    }
  }

  private static boolean isPalindrome(int n) {
    StringBuilder sb = new StringBuilder(String.valueOf(n));
    return (sb.toString()).equals(sb.reverse().toString());
  }

  private static boolean isProductOfThreeDigitNumbers(int n) {
    for (int i = 999; i >= 100; i--) {
      for (int j = 999; j >= 100; j--) {
        if (i * j == n) { return true; }
      }
    }
    return false;
  }
}
