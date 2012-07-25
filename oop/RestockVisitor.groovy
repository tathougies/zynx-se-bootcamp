class RestockVisitor implements MovieTheaterVisitor{

    private restockAmount

    RestockVisitor(Integer restockAmount) {
        this.restockAmount = restockAmount
    }

    void visit(TicketBooth4 ticketBooth) {
        ticketBooth.restockTickets(restockAmount)
    }

    void visit(FoodStand4 foodStand) {
        def foodNames = foodStand.getFoodNames()
        for (foodName in foodNames)
            foodStand.restockFood(foodName, restockAmount)
    }
}
