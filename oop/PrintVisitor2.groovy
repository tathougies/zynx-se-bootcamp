class PrintVisitor2 implements MovieTheaterVisitor2 {

    void visit(TicketBooth5 ticketBooth) {
        ticketBooth.showMovieNameAndTime()
    }

    void visit(FoodStand5 foodStand) {
        foodStand.showFoodNames()
    }
}
