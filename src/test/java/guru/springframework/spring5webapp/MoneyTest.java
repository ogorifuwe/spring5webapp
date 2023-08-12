package guru.springframework.spring5webapp;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class MoneyTest {

  @Test
  public void testDollarMultiplication() {
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));

    Money fiveF = Money.franc(5);
    assertEquals(Money.franc(10), fiveF.times(2));
    assertEquals(Money.franc(15), fiveF.times(3));
  }

  @Test
  public void testDollarEquality() {
    assertEquals(Money.dollar(5), Money.dollar(5));
    assertNotEquals(Money.dollar(5), Money.dollar(8));
    assertEquals(Money.franc(5), Money.franc(5));
  }

  @Test
  public void testDollarFrancEquality() {
    assertNotEquals(Money.dollar(5), Money.franc(5));
  }

  @Test
  public void testCurrency() {
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.franc(1).currency());
  }
}
