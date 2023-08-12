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
  }

  @Test
  public void testDollarEquality() {
    assertEquals(new Dollar(5), new Dollar(5));
    assertNotEquals(new Dollar(5), new Dollar(8));
  }

  @Test
  public void testFrancMultiplication() {
    Money five = Money.franc(5);
    assertEquals(Money.franc(10), five.times(2));
    assertEquals(Money.franc(15), five.times(3));
  }

  @Test
  public void testFrancEquality() {
    assertEquals(Money.franc(5), Money.franc(5));
    assertNotEquals(Money.franc(5), Money.franc(8));
  }

  @Test
  public void testDollarFrancEquality() {
    assertNotEquals(Money.dollar(5), new Franc(5));
  }
}
