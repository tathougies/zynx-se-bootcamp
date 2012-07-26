class FoodStand1 {
    private foodNames
    private foodPrices
    private foodStock
    private money

    FoodStand1(String[] foodNames,
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

    void showPrice(String foodName) {
        if (foodName in foodNames) {
            println "${foodName} costs ${foodPrices[foodName]}"
        }
        else {
            println "Sorry, we do not have ${foodName}s here."
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
        if (foodName in foodNames) {
            println "We have ${foodStock[foodName]} ${foodName}s."
        }
        else {
            println "Sorry, we do not have ${foodName}s here."
        }
    }

    void buyFood(String foodName, Money payment) {
        if (foodName in foodNames) {
            if (foodStock[foodName] > 0) {
                try {
                    takeMoney(foodPrices[foodName], payment)
                    println "Here is your ${foodName}"
                    foodStock[foodName] -= 1
                }
                catch (Exception e) {
                    println e.getMessage()
                }
            }
            else {
                println "Sorry, we are out of ${foodName}s."
            }
        }
        else {
            println "Sorry, we do not have ${foodName}s here."
        }
    }

    void restockFood(String foodName, Integer newFoodAmount) {
        if (foodName in foodNames) {
            if (newFoodAmount >= 0) {
                foodStock[foodName] += newFoodAmount
                println "We used to have ${foodStock[foodName] - newFoodAmount} ${foodName}s and now we have ${foodStock[foodName]}"
            }
            else {
                println "You can't restock with a negative amount!"
            }
        }
        else {
            println "Sorry, we do not have ${foodName}s here."
        }
    }

    Money getMoney() {
        return money.clone()
    }
}





















