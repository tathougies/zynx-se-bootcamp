class Money implements Comparable<Money>{
    private money
    private precision = 2

    Money(float money) {
        if (money >= 0) {
            this.money = money
        }
        else {
            this.money = 0.0
        }
    }

    String toString() {
        return "\$${money.round(precision)}"
    }

    Money plus(Money secondAmount) {
        return new Money((float) this.money + secondAmount.money)
    }

    Money minus(Money secondAmount) {
        return new Money((float) this.money - secondAmount.money)
    }

    Money multiply(float secondAmount) {
        return new Money((float) this.money * secondAmount)
    }

    int compareTo(Money secondAmount) {
        if(this.money < secondAmount.money) {
            return -1
        }
        else if (this.money > secondAmount.money){
            return 1
        }
        else {
            return 0
        }

    }
}
