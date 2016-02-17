public class Fibonacci {

   public static int compute(int n) {
      if (n ==0 ) {
         return 0;
      }
      if (n == 1) {
         return 1;
      }

      return compute(n - 1) + compute(n - 2);
   }

   public static int computeLessThanFourMillion()
   {
      int iteration=0;
      int result = 0;
      while (result<4000000)
      {
         result=compute(iteration);
         iteration++;

      }
       return result;
   }
   public static boolean checkeven(int n)
   {
      if (n%2 == 0)
         return true;
      else
      return false;
   }

}
