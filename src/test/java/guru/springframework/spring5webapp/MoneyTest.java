package guru.springframework.spring5webapp;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MoneyTest {

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10, five.amount);
  }
}
