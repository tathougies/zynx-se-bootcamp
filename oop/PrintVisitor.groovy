class PrintVisitor implements MovieTheaterVisitor {

    void visit(TicketBooth4 ticketBooth) {
        ticketBooth.showMovieNameAndTime()
    }

    void visit(FoodStand4 foodStand) {
        foodStand.showFoodNames()
    }
}
