package stepdefinition;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDef {
	int result;
	int result1;
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Calculator Opened");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int int1, int int2) {
	    // Write code here that turns the phrase above into concrete actions
		result = int1+int2;

	    
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expResult) {
	    // Write code here that turns the phrase above into concrete actions
		//expResult is taken from feature Then statement
		Assert.assertEquals(expResult, result);
		//Assert.assertEquals(expResult1, result1);

	    
	}
	
	@When("I subtract {int} and {int}")
	public void i_subtract_and(int int1, int int2) {
	    // Write code here that turns the phrase above into concrete actions
	  result= int1-int2;
	}
	
	@When("I enter the number1 as {int} and number2 as {int}")
	public void i_enter_the_number1_as_and_number2_as(int Number1, int Number2) {
	    result= Number1+Number2;
	    
	}
	@When("I add below numbers")
	public void i_add_below_numbers(List<Integer> numbers) {
		
		for(Integer num:numbers) {
			
			result = result +num;
		}
		
	}


	
	



}
