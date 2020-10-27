import org.junit.Assert;
import com.sanjith.fizzbuzz.FizzBuzz;
import org.junit.Test;

public class FizzBuzz {

	@Test
    public void fizzBuzzConvertorLeavesNormalNumbersAlone(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("1", fizzBuzz.convert(1));

    }
}