class TheaterManager6 {
    private ticketBooth
    private foodStand
    private theaters
    private movieLocations
    private money

    TheaterManager6(TicketBooth6 ticketBooth,
                    FoodStand6 foodStand,
                    TheaterFacade2[] theaters,
                    Map<String, Theater2> movieLocations,
                    Money money
    ) {
        this.ticketBooth = ticketBooth
        this.foodStand = foodStand
        this.theaters = theaters
        this.movieLocations = movieLocations
        this.money = money
    }

    void showMovieLocation(String movieName) {
        def theaterName = movieLocations[movieName]
        if (theaterName) {
            println "${movieName} is showing in theater ${theaterName}."
        }
        else {
            println "We are not showing ${movieName} here."
        }
    }

    TicketBooth1 goToTicketBooth() {
        return ticketBooth
    }

    FoodStand1 goToFoodStand() {
        return foodStand
    }

    void runTheaters() {
        theaters.each { theater -> theater.runTheater() }
    }

    void visitStands(MovieTheaterVisitor2 movieTheaterVisitor) {
        ticketBooth.accept(movieTheaterVisitor)
        foodStand.accept(movieTheaterVisitor)
    }
}
