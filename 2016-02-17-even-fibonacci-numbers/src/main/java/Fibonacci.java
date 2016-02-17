public class Fibonacci {

   public static int compute(int n) {
      int fibb = 0;
      if (n <= 2) {
         return n;
      }

      return compute(n - 1) + compute(n - 2);
   }

}
