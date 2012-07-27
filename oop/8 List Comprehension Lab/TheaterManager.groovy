class TheaterManager {
    private ticketBooth
    private foodStand
    private theaters
    private movieLocations
    private money

    TheaterManager(TicketBooth ticketBooth,
                    FoodStand foodStand,
                    TheaterFacade[] theaters,
                    Map<String, Theater> movieLocations,
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

    TicketBooth goToTicketBooth() {
        return ticketBooth
    }

    FoodStand goToFoodStand() {
        return foodStand
    }

    void runTheaters() {
        theaters.each { theater -> theater.runTheater() }
    }

    void visitStands(MovieTheaterVisitor movieTheaterVisitor) {
        ticketBooth.accept(movieTheaterVisitor)
        foodStand.accept(movieTheaterVisitor)
    }
}
