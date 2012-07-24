class TheaterManager1 {
    private ticketBooth
    private foodStand
    private theaters
    private movieLocations
    private money

    TheaterManager1(TicketBooth1 ticketBooth,
                   FoodStand1 foodStand,
                   Theater1[] theaters,
                   Map<String, Theater1> movieLocations,
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
}
