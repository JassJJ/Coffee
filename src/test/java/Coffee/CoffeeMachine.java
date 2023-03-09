package Coffee;

public class CoffeeMachine {
    private int amountLeft;

    private int payment;

    private int returnAmount;

    private int wantedAmount;
    public void setAmount(int amount) {
        this.amountLeft=amount;
    }

    public void payMoney(int money) {
        this.payment = money;
    }

    public int getAmountOfCoffee() {
        returnAmount=wantedAmount;
        return returnAmount;

    }

    public void setWantedAmount(int amountOfCoffee) {
        this.wantedAmount = amountOfCoffee;
    }
}
