class RestockVisitor implements MovieTheaterVisitor{

    private restockAmount

    RestockVisitor(Integer restockAmount) {
        this.restockAmount = restockAmount
    }

    void visit(TicketBooth ticketBooth) {
        ticketBooth.restockTickets(restockAmount)
    }

    void visit(FoodStand foodStand) {
        def foodNames = foodStand.getFoodNames()
        foodNames.each { foodName -> foodStand.restockFood(foodName, restockAmount)}
    }
}
