
class FakeExchange implements Exchange {
  @Override
  public double rate(String fromCurrency, String toCurrency) {
    if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) return 0.85;
    if (fromCurrency.equals("USD") && toCurrency.equals("JPY")) return 110.0;
    return 1.0;
  }
}

public class Main {
  public static void main(String[] args) {
    Exchange exchange = new FakeExchange();

    Cash dollar = new Cash(exchange, 100);
    System.out.println("Dollar: " + dollar.toString());

    Cash euro = dollar.in("USD", "EUR");
    System.out.println("Dollar to Euro: " + euro.toString());
  }
}

