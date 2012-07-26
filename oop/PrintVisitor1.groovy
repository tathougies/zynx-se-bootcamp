class PrintVisitor1 implements MovieTheaterVisitor1 {

    void visit(TicketBooth4 ticketBooth) {
        ticketBooth.showMovieNameAndTime()
    }

    void visit(FoodStand4 foodStand) {
        foodStand.showFoodNames()
    }
}
