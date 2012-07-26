class RestockVisitor2 implements MovieTheaterVisitor2{

    private restockAmount

    RestockVisitor2(Integer restockAmount) {
        this.restockAmount = restockAmount
    }

    void visit(TicketBooth5 ticketBooth) {
        ticketBooth.restockTickets(restockAmount)
    }

    void visit(FoodStand5 foodStand) {
        def foodNames = foodStand.getFoodNames()
        for (foodName in foodNames)
            foodStand.restockFood(foodName, restockAmount)
    }
}
