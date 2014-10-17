/** Lab excercise 1
 *
 * first test for junit
 *
 * @author  Lennart Wissel
 * @version 17.10.2014
 */

public class lab1 {
  // calculates the first n odd numbers
  public static int sumOdd(int n) {
    int sum = 0;
    if (n == 0) { return 0; }
    for(int i = 1; i<=n; i++) {
      sum += 2*i-1;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sumOdd(2));
    System.out.println(sumOdd(3));
    System.out.println(sumOdd(4));
    System.out.println(sumOdd(10));
    System.out.println(sumOdd(100));
  }
}
