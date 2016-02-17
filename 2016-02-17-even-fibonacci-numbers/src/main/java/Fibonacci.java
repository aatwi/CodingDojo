public class Fibonacci {

   public static long compute(int n) {
      if (n == 0) {
         return 0;
      }
      if (n == 1) {
         return 1;
      }

      long a = 0;
      long b = 1;
      long c = 0;
      for (int i = 2; i <= n; i++) {
         c = a + b;
         a = b;
         b = c;
      }

      return c;
   }


}
