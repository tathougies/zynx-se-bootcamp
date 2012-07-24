class MovieTheater {
    public def showTimes = [:]
    public float ticketPrice
    public def foodNames = []
    public def foodStock = [:]
    public def foodPrices = [:]
    public def theaters = []
    public def movies = []
    public def movieLocations = [:]
    public float money = 0.0
    public int tickets

    MovieTheater(
            Map<String, float[]> showTimes,
            float ticketPrice,
            String[] foodNames,
            Map<String, Integer> foodStock,
            Map<String, Float> foodPrices,
            String[] theaters,
            String[] movies,
            Map<String, String> movieLocations,
            int tickets
    ) {
        this.showTimes = showTimes
        this.ticketPrice = ticketPrice
        this.foodNames = foodNames
        this.foodStock = foodStock
        this.foodPrices = foodPrices
        this.theaters = theaters
        this.movies = movies
        this.movieLocations = movieLocations
        this.tickets = tickets
    }

    void showFoodPrice(String foodName) {
        def price = foodPrices[foodName]
        if (price) {
            println "${foodname} costs ${price.toString()}."
        }
        else
            println "Sorry, we don't have ${foodName} here."
    }

    void takeTicketMoney(float payment) {
        if (tickets > 0) {
            if (payment >= ticketPrice) {
                float change = payment - ticketPrice
                println "Your change is ${change.toString()}.  Here is your ticket."
                tickets -= 1
                money += ticketPrice
            }
            else {
                println "Sorry, that is not enough."
            }
        }
        else {
            println "Sorry, we're sold out of tickets."
        }
    }

    void takeFoodMoney(String foodName, float payment) {

        def foodPrice = foodPrices[foodName]
        if (foodPrice) {
            if (foodStock[foodName] > 0) {
                if(payment >= foodPrice) {
                    def change = payment - foodPrice
                    println "Your change is ${change.toString()}. Enjoy your ${foodName}."
                    money += foodPrice
                    foodStock[foodName] -= 1
                }
                else {
                    println "Sorry, that is not enough."
                }
            }
            else {
                println "Sorry, we are out of ${foodName}s"
            }
        }
        else {
            println "Sorry, we don't have ${foodName} here."
        }

    }

    void showFood() {
        println "We have the foods: "
        for (foodName in foodNames)
                println foodName
    }

    void showAmountOfFood(String foodName) {
        if(foodName in foodNames) {
            println "We have ${foodStock[foodName]} ${foodName}s"
        }
        else {
            println "Sorry, we don't have ${foodName} here"
        }
    }

    void showMovieNames() {
        println "We are showing the following movies:"
        for(movie in movies)
            println movie
        println ""
    }

    void showShowTimes(String movieTitle) {
        def times = showTimes[movieTitle]
        if (times) {
            println "This movie is showing at the following times:"
            for(time in times)
                println time
            println ""
        }
        else {
            println "Sorry, we are not showing that."
        }
    }

    void showMovieLocation(String movieTitle) {
        def location = movieLocations[movieTitle]
        if (location) {
            println "This movie is showing at theatre ${location}."
        }
        else {
            println "Sorry, we are not showing that."
        }
    }

    void dimLights(String location) {
        if (location in theaters) {
            println "Dimming lights in theater ${location}."
        }
        else {
            println "That theater does not exist."
        }
    }

    void showPreviews(String location) {
        if (location in theaters) {
            println "Showing previews in theater ${location}."
        }
        else {
            println "That theater does not exist."
        }
    }

    void showMovie(String location) {
        if (location in theaters) {
            def movieShowing
            for(pair in movieLocations) {
                if (location in pair.value)
                    movieShowing = pair.key
            }
            println "Starting movie ${movieShowing} now."
        }
        else {
            println "That theater does not exist."
        }
    }

    void buyMovieTicket(String movie, Float time, float money) {
        if (movie in movies) {
            boolean flag = false
            for (times in showTimes[movie])
                if (time == times) {
                    println "Getting you a ticket for ${movie} at time ${time}."
                    takeTicketMoney(money)
                    flag = true
                    break
                }
            if (!flag) {
                println "Sorry, we do not show ${movie} at time ${time}"
            }
        }
        else {
            println "Sorry we do not have the movie ${movie}."
        }
    }

    void buyFood(String foodType, float money) {
        if(foodType in foodNames) {
            println "Getting you ${foodType}."
            takeFoodMoney(foodType, money)
        }
        else {
            println "Sorry, there is no ${foodType} here."
        }
    }

    void rollCredits(String location) {
        if(location in theaters) {
            def movieName
            for (pair in movieLocations) {
                if (location == pair.value) {
                    movieName = pair.key
                }
            }
            println "Rolling credits for ${movieName}."
        }
        else {
            println "${location} is not a reel theater."
        }
    }

    void cleanTheater(String location) {
        if (location in theaters) {
            println "Cleaning theater ${location}"
        }
        else {
            println "${location} is not a reel theater."
        }
    }

    void restockFood(String foodName, Integer amount) {
        if(foodName in foodNames) {
            if(amount >= 0) {
                foodStock[foodName] += amount
                println "We used to have ${foodStock[foodName] - amount} ${foodName}s and now we have ${foodStock[foodName]}."
            }
            else {
                println "You can't restock with a negative amount!"
            }
        }
        else {
            println "Sorry, we do not have ${foodName} here."
        }
    }

    void restockTickets(int amount) {
        if(amount >= 0) {
            tickets += amount
            println "We used to have ${tickets - amount} tickets and now we have ${tickets}."
        }
        else {
            println "Please enter a nonnegative amount."
        }
    }
}