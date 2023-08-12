package guru.springframework.spring5webapp;

public abstract class Money {
  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public abstract Money times(int multiplier);

  public static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  public String currency() {
    return this.currency;
  }

  public boolean equals(Object o) {
    Money money = (Money) o;
    return amount == money.amount
            && this.getClass().equals(o.getClass());
  }
}
