package guru.springframework.spring5webapp;

public class Money {

  protected int amount;

  public Money(int amount) {
    this.amount = amount;
  }

  Money times(int multiplier) {
    return new Money(amount * multiplier);
  }

  public boolean equals(Object o) {
    Money money = (Money) o;
    return amount == money.amount
            && this.getClass().equals(o.getClass());
  }
}
