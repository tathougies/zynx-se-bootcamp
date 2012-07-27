class PrintVisitor implements MovieTheaterVisitor {

    void visit(TicketBooth ticketBooth) {
        ticketBooth.showMovieNameAndTime()
    }

    void visit(FoodStand foodStand) {
        foodStand.showFoodNames()
    }
}
