public class Cash {
    private Exchange exchange;
    private int cents;

    public Cash(Exchange exchange, int cents) {
        this.exchange = exchange;
        this.cents = cents;
    }

    public Cash in(String fromCurrency, String toCurrency) {

        int newCents = (int) Math.round(this.cents * exchange.rate(fromCurrency, toCurrency));
        return new Cash(this.exchange, newCents);
    }

    @Override
    public String toString() {
        return "Cash{" +
            "cents=" + cents +
            '}';
    }
}
