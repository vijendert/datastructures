package test;

import org.junit.Assert;
import org.junit.Test;

import mathematicsalgo.GenerateAllNumberFromGivenSetOfNumber;

public class GenerateAllNumberFromGivenSetOfNumberTest {

	@Test
	public void test() {
		String inputStr = "18760";
		GenerateAllNumberFromGivenSetOfNumber.findGreatestDivisibleby3(inputStr);
		Assert.assertSame("Checking equal", "18706", inputStr);
	}

}
