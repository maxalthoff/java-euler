/*
  A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

                        a2 + b2 = c2

        For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  Find the product abc.
*/

public class Euler_009 {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    double c = -1;

    outer:
    while (true) {
      while (a + b + c <= 1000) {
        int cSquared = (a * a) + (b * b);
        c = Math.sqrt(cSquared);
        if (c == (int)c && a + b + c == 1000) {
          System.out.println(a * b * c);
          break outer;
        }
        b++;
      }
      a++;
      b = a + 1;
    }
  }
}
