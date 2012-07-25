class FoodStand3 {
    private foodNames
    private foodPrices
    private foodStock
    private money
    private validate = new Validator()
    private paymentCalculator

    FoodStand3(String[] foodNames,
               Map<String, Money> foodPrices,
               Map<String, Integer> foodStock,
               Money money,
               ChangeCalculator paymentCalculator
    ) {
        this.foodNames = foodNames
        this.foodPrices = foodPrices
        this.foodStock = foodStock
        this.money = money
        this.paymentCalculator = paymentCalculator
    }

    String toString() {
        return "Food Stand"
    }

    private String noFoodMessage(String foodName) {
        return "Sorry, we do not have ${foodName} here."
    }

    private String outOfStockMessage(String foodName) {
        return "Sorry, we are out of ${foodName}."
    }

    private String restockingWithNothingMessage() {
        return "You need to restock with a positive amount."
    }

    void showPrice(String foodName) {
        try {
            validate.inList(foodName, foodNames, noFoodMessage(foodName))
            println "${foodName} costs ${foodPrices[foodName]}"
        }
        catch (Exception e) {
            println e.getMessage()
        }
    }

    void showProductNames() {
        println "We have the following foods:"
        for (foodName in foodNames) {
            println foodName
        }
    }

    void showAmountOfProduct(String foodName) {
        try {
            validate.inList(foodName, foodNames, noFoodMessage(foodName))
            println "We have ${foodStock[foodName]} ${foodName}s."
        }
        catch (Exception e) {
            println e.getMessage()
        }
    }

    void buyProduct(String foodName, Money payment) {
        try {
            validate.inList(foodName, foodNames, noFoodMessage(foodName))
            validate.isPositive(foodStock[foodName], outOfStockMessage(foodName))
            def price = foodPrices[foodName]
            def change = paymentCalculator.calculateChange(payment, price)
            println "Your change is ${change}."
            money += price
            println "Here is your ${foodName}"
            foodStock[foodName] -= 1
        }
        catch (Exception e) {
            println e.getMessage()
        }
    }

    void restockProduct(String foodName, Integer newFoodAmount) {
        try {
            validate.inList(foodName, foodNames, noFoodMessage(foodName))
            validate.isPositive(newFoodAmount, restockingWithNothingMessage())
            foodStock[foodName] += newFoodAmount
            println "We used to have ${foodStock[foodName] - newFoodAmount} ${foodName}s and now we have ${foodStock[foodName]}"
        }
        catch (Exception e) {
            println e.getMessage()
        }
    }

    void setPaymentCalculator(ChangeCalculator paymentCalculator) {
        this.paymentCalculator = paymentCalculator
    }
}





















