import org.fest.assertions.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

public class FibonacciTest {

   @Test
   public void if_input_is_1_should_return_1(){
      Assertions.assertThat(Fibonacci.compute(1)).isEqualTo(1);
   }


   @Test
   public void if_input_is_10(){
      Assertions.assertThat(Fibonacci.compute(10)).isEqualTo(55);
   }

   @Ignore
   @Test
   public void if_input_is_4000000(){
      Assertions.assertThat(Fibonacci.compute(4000000)).isEqualTo(5);
   }

}
