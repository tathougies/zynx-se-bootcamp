class TicketBooth {
    private movieNames
    private movieTimes
    private ticketPrice
    private tickets
    private money

    TicketBooth(String[] movieNames,
                Map<String, Time> movieTimes,
                Money ticketPrice,
                Integer tickets,
                Money money
    ) {
        this.movieNames = movieNames
        this.movieTimes = movieTimes
        this.ticketPrice = ticketPrice
        this.tickets = tickets
        this.money = money
    }

    String toString() {
        return "Ticket Booth"
    }

    void showTicketPrice(String movieName) {
        if (movieName in movieNames) {
            println "The ticket will cost ${ticketPrice}."
        }
        else {
            println "We are not showing ${movieName} here."
        }
    }

    void takeTicketMoney(Money price, Money payment) throws Exception {
        if (payment >= price) {
            println "Your change is ${payment - price}."
            money += price
        }
        else {
            throw new Exception("Sorry, that is not enough")
        }
    }

    void showMovieNameAndTime() {
        println "We are selling tickets for the following movies and at the following times:"
        for (movieName in movieNames) {
            println movieName
            for (time in movieTimes[movieName]) {
                println time
            }
        }
    }

    void showNumberOfTickets() {
        println "We have ${tickets} tickets left."
    }

    void buyTicket(String movieName, Time movieTime, Money payment) {
        if (movieName in movieNames) {
            if (movieTimes[movieName].contains(movieTime)) {
                if (tickets > 0) {
                    try {
                        takeTicketMoney(ticketPrice, payment)
                        println "Here is your ${movieName} ticket."
                        tickets -= 1
                    }
                    catch (Exception e) {
                        println e.getMessage()
                    }
                }
                else {
                    println "Sorry, we are out of tickets for ${movieName}."
                }
            }
            else {
                println "We are not showing ${movieName} at ${movieTime}."
            }
        }
        else {
            println "We are not showing ${movieName} here."
        }
    }

    void restockTickets(Integer newTicketAmount) {
        if (newTicketAmount >= 0) {
            tickets += newTicketAmount
            println "We used to have ${tickets - newTicketAmount} tickets and now we have ${tickets}"
        }
        else {
            println "You can't restock with a negative amount!"
        }
    }

    Money getMoney() {
        return money.clone()
    }
}
