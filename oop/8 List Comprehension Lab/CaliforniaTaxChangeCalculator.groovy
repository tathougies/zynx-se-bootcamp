class CaliforniaTaxChangeCalculator implements ChangeCalculator {

    private message
    private final float californiaTaxRate = 1.15

    CaliforniaTaxChangeCalculator(String message) {
        this.message = message
    }

    Money calculateChange(Money payment, Money price) throws Exception {
        def calculatedPrice = price * californiaTaxRate
        if (payment >= calculatedPrice) {
            return payment - calculatedPrice
        }
        else {
            throw new Exception(message)
        }
    }
}
