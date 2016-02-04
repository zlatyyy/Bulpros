package com.ikea.cucumber;
import java.io.PrintWriter;
import java.util.List;

import gherkin.deps.com.google.gson.Gson;
import cucumber.api.java.en.Given;
public class GivenSteps {
	@Given("^the system knows about the following card parameters$")
	public void the_system_knows_about_the_following_card_parameters(List<Cart> fruitList) throws Throwable { 
		Gson gson = new Gson();
		PrintWriter writer = new PrintWriter("fruit.json", "UTF-8");
		writer.println(gson.toJson(fruitList));
		writer.close();
	}
}
