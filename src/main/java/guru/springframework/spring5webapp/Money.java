package guru.springframework.spring5webapp;

public class Money implements Expression {
  final int amount;
  private final String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public String currency() {
    return this.currency;
  }

  @Override
  public Expression times(int multiplier) {
    return new Money(amount * multiplier, this.currency);
  }

  @Override
  public Expression plus(Expression addend) {
    return new Sum(this, addend);
  }

  public Money reduce(Bank bank, String to) {
    return new Money(amount / bank.rate(this.currency, to), to);
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
