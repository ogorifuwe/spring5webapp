package guru.springframework.spring5webapp;

public class Money implements Expression {
  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public Money times(int multiplier) {
    return new Money(amount * multiplier, this.currency);
  }

  public static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public String currency() {
    return this.currency;
  }

  public Expression plus(Money addend) {
    return new Money(amount + addend.amount, currency);
  }

  public boolean equals(Object o) {
    Money money = (Money) o;
    return amount == money.amount
            && this.currency == money.currency;
  }

  @Override
  public String toString() {
    return "Money{" +
            "amount=" + amount +
            ", currency='" + currency + '\'' +
            '}';
  }
}
