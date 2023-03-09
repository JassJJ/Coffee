package MyStepDefs;

import Coffee.CoffeeMachine;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {

    CoffeeMachine Coffee;
    @Before
    public void setUp() {
        CoffeeMachine CoffeeMachine = new CoffeeMachine();
        // System.out.println("Making object...");
    }
    @Given("there is {} left")
    public void thereIsNumberLeft(int amount) {
        Coffee.setAmount(amount);
    }

    @And("i have payed {}")
    public void iHavePayedMoney(int money) {
        Coffee.payMoney(money);
    }

    @Then("i should get {}coffee")
    public void iShouldGetAmountCoffee(int expected) {
        int actual = Coffee.getAmountOfCoffee();
        assertEquals(expected, actual);

    }

    @And("i have chosen the {int} i want")
    public void iHaveChoosenTheAmountOfCoffeIWant(int amountOfCoffee) {
        Coffee.setWantedAmount(amountOfCoffee);

    }
}
