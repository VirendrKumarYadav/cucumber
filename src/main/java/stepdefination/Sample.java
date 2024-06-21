package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.Account;



public class Sample {

	Account account;
	

	
	@Given("I have a balance of ${int} in my account")​

	public void i_have_a_balance_of_$_in_my_account(int amount) {​

	    account = new Account();​

	    account.deposite(amount);​

	    Assert.assertEquals(amount,​

	    account.getBalance());​

	  }​

	@When("I request ${int}")​

	public void i_requested_of_$_in_my_account(int amount) {​

	    account = new Account();​

	    account.deposite(amount);​

	    Assert.assertEquals( amount,​account.getBalance());​

	  }
	  
	  ​
	@Then("I ${int} should be dispensed")​

	public void i_should_be_dispened(int amount) {​

	    account = new Account();​

	    account.deposite(amount);​

	    Assert.assertEquals(amount,	​

	    account.getBalance());​

	  }
}
