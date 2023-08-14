package guru.springframework.spring5webapp;

import java.util.HashMap;
import java.util.Map;

public class Bank {

  private Map<Pair, Integer> rateMap = new HashMap<>();

  Money reduce(Expression source, String toCurrency) {
    return source.reduce(this, toCurrency);
  }

  public int rate(String from, String to) {
    return rateMap.getOrDefault(new Pair(from, to), 1);
  }

  public void addRate(String from, String to, int rate) {
    rateMap.put(new Pair(from, to), rate);
  }
}
