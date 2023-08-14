package guru.springframework.spring5webapp;

public interface Expression {
  Money reduce(Bank bank, String to);

  Expression plus(Money addend);
}
