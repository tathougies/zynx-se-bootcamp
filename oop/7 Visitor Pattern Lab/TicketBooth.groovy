class TicketBooth {
    private movieNames
    private movieTimes
    private ticketPrice
    private tickets
    private money
    private validate = new Validator()
    private paymentCalculator

    TicketBooth(String[] movieNames,
                 Map<String, Time> movieTimes,
                 Money ticketPrice,
                 Integer tickets,
                 Money money,
                 ChangeCalculator paymentCalculator
    ) {
        this.movieNames = movieNames
        this.movieTimes = movieTimes
        this.ticketPrice = ticketPrice
        this.tickets = tickets
        this.money = money
        this.paymentCalculator = paymentCalculator
    }

    String toString() {
        return "Ticket Booth"
    }

    private String noMovieMessage(String movieName) {
        return "We are not showing ${movieName} here."
    }

    private String noTimeMessage(String movieName, Time movieTime) {
        return "We are not showing ${movieName} at ${movieTime} here."
    }

    private String noTicketsMessage() {
        return "We are out of tickets."
    }

    private String restockingWithNothingMessage() {
        return "You need to restock with a positive amount."
    }

    void showTicketPrice(String movieName) {
        try {
            validate.inList(movieName, movieNames, noMovieMessage(movieName))
            println "The ticket will cost ${ticketPrice}."
        }
        catch (Exception e) {
            println e.getMessage()
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
        try{
            validate.inList(movieName, movieNames, noMovieMessage(movieName))
            validate.inList(movieTime, movieTimes[movieName], noTimeMessage(movieName, movieTime))
            validate.isPositive(tickets, noTicketsMessage())
            def change = paymentCalculator.calculateChange(payment, ticketPrice)
            println "Your change is ${change}."
            money += ticketPrice
            println "Here is your ${movieName} ticket."
            tickets -= 1
        }
        catch (Exception e) {
            println e.getMessage()
        }
    }

    void restockTickets(Integer newTicketAmount) {
        try {
            validate.isPositive(newTicketAmount, restockingWithNothingMessage())
            println "We used to have ${tickets - newTicketAmount} tickets and now we have ${tickets}"
        }
        catch (Exception e) {
            println e.getMessage()
        }
    }

    void setPaymentCalculator(ChangeCalculator paymentCalculator) {
        this.paymentCalculator = paymentCalculator
    }

    void accept(MovieTheaterVisitor movieTheaterVisitor) {
        movieTheaterVisitor.visit(this)
    }

    Money getMoney() {
        return money.clone()
    }
}
