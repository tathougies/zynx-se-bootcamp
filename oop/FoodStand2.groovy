class FoodStand2 {
    private foodNames
    private foodPrices
    private foodStock
    private money
    private validate = new Validator()

    FoodStand2(String[] foodNames,
               Map<String, Money> foodPrices,
               Map<String, Integer> foodStock,
               Money money
    ) {
        this.foodNames = foodNames
        this.foodPrices = foodPrices
        this.foodStock = foodStock
        this.money = money
    }

    String[] getFoodNames() {
        return foodNames
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

    void takeMoney(Money price, Money payment) throws Exception {
        if (payment >= price) {
            println "Your change is ${payment - price}."
            money += price
        }
        else {
            throw new Exception("Sorry, that is not enough")
        }
    }

    void showFoodNames() {
        println "We have the following foods:"
        for (foodName in foodNames) {
            println foodName
        }
    }

    void showAmountOfFood(String foodName) {
        try {
            validate.inList(foodName, foodNames, noFoodMessage(foodName))
            println "We have ${foodStock[foodName]} ${foodName}s."
        }
        catch (Exception e) {
            println e.getMessage()
        }
    }

    void buyFood(String foodName, Money payment) {
        try {
            validate.inList(foodName, foodNames, noFoodMessage(foodName))
            validate.isPositive(foodStock[foodName], outOfStockMessage(foodName))
            takeMoney(foodPrices[foodName], payment)
            println "Here is your ${foodName}"
            foodStock[foodName] -= 1
        }
        catch (Exception e) {
            println e.getMessage()
        }
    }

    void restockFood(String foodName, Integer newFoodAmount) {
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
}





















