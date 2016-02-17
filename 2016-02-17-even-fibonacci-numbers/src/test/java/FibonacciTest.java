import org.fest.assertions.api.Assertions;
import org.junit.Test;

public class FibonacciTest {

   @Test
   public void if_input_is_1_should_return_1(){
      Assertions.assertThat(Fibonacci.compute(1)).isEqualTo(1);
   }

}
