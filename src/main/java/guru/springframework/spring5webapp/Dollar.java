package guru.springframework.spring5webapp;

public class Dollar {

  int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  void times(int multiplier) {
    amount *= multiplier;
  }
}
