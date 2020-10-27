import org.junit.Assert;
import com.sanjith.fizzbuzz.FizzBuzz;
import org.junit.Test;

public class FizzBuzz {

	@Test
    public void fizzBuzzConvertorLeavesNormalNumbersAlone(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));

    }

    @Test
    public void fizzBuzzConvertorMultiplesOfThree(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzBuzz.convert(3));

    }

    @Test
    public void fizzBuzzConvertorMultiplesOfFive(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Buzz", fizzBuzz.convert(5));

    }

    @Test
    public void multiplesOfBothThreeAndFive(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }
}