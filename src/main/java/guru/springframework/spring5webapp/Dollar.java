package guru.springframework.spring5webapp;

public class Dollar extends Money {

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Money times(int multiplier) {
    return new Dollar(amount * multiplier);
  }
}
