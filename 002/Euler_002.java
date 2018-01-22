/*
  Each new term in the Fibonacci sequence is generated by adding the previous
  two terms. By starting with 1 and 2, the first 10 terms will be:

  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

  By considering the terms in the Fibonacci sequence whose values do not
  exceed four million, find the sum of the even-value terms.
*/

public class Euler_002 {
  public static void main(String[] args) {
    int f1 = 0;
    int f2 = 1;
    int sum = 0;
    while (f1 + f2 < 4_000_000) {
      int temp = f1 + f2;
      f1 = f2;
      f2 = temp;
      if (f2 % 2 == 0) { sum += f2; }
    }

    System.out.println(sum);
  }
}
