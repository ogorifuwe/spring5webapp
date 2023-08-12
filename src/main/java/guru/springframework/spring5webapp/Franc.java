package guru.springframework.spring5webapp;

public class Franc extends Money {

  public Franc(int amount) {
    super(amount);
  }

  Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }




}
