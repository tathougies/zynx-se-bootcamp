class NoTaxChangeCalculator implements ChangeCalculator {

    private message

    NoTaxChangeCalculator(String message) {
        this.message = message
    }

    Money calculateChange(Money payment, Money price) throws Exception {
        if(payment >= price) {
            return payment - price
        }
        else {
            throw new Exception(message)
        }
    }
}
