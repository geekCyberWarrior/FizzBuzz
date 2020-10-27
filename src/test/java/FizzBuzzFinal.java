import org.junit.Test;
import com.sanjith.fizzbuzz.FizzBuzz;

public class ActualFizzBuzzAppTest {


    @Test
    public void outputTheHundredFizzBuzzes(){

        FizzBuzz fizzBuzz = new FizzBuzz();
        for(int i=1; i<=100; i++){
            System.out.println(fizzBuzz.convert(i));
        }
    }
}
