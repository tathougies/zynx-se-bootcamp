firstTime = new Time(14, 15)
println firstTime
failTime = new Time(25, 10)
secondTime = new Time(18, 10)
thirdTime = new Time(22, 50)
Time[] times = [firstTime, secondTime, thirdTime]

firstTheater = new Theater1("10", "Spiderman", times)

firstTheater.dimLights()
firstTheater.showPreviews()
firstTheater.showMovie()
firstTheater.rollCredits()
firstTheater.cleanTheater()

cash = new Money(10.04)
println cash
secondCash = new Money(20.25)
println secondCash
println (cash < secondCash)
cashDiff = secondCash - cash
println cashDiff
cashSum = cash + secondCash
println cashSum
tax = cash * 0.75
println tax

String[] foodNames = ["Popcorn", "Soda", "Hot Dog"]
foodPrices = ["Popcorn":new Money(3.00), "Soda":new Money(2.50), "Hot Dog":new Money(4.25)]
foodStock = ["Popcorn":20, "Soda":0, "Hot Dog": 17]
money = new Money(0.00)

foodStand = new FoodStand1(foodNames, foodPrices, foodStock, money)
foodStand.showPrice("Popcorn")
foodStand.showPrice("Lobster")

foodStand.showProductNames()

foodStand.showAmountOfProduct("Hot Dog")
foodStand.showAmountOfProduct("Lasagna")

foodStand.buyProduct("Hot Dog", new Money(10.0))
foodStand.showAmountOfProduct("Hot Dog")

foodStand.buyProduct("Popcorn", new Money(1.0))

foodStand.buyProduct("Soda", new Money(10.0))
foodStand.buyProduct("Lobster", new Money(5.00))

foodStand.restockProduct("Soda", 40)
foodStand.showAmountOfProduct("Soda")
foodStand.restockProduct("Soda", -20)
foodStand.restockProduct("Pizza", 10)

String[] movieNames = ["Spiderman", "Batman", "Superman"]

movieTimes = ["Spiderman":times, "Batman":times, "Superman":times]
secondTheater = new Theater1("4", "Batman", times)
thirdTheater = new Theater1("6", "Superman", times)
movieLocations = ["Spiderman":firstTheater, "Batman":secondTheater, "Superman":thirdTheater]
ticketPrice = new Money(11.50)
tickets = 100
ticketBooth = new TicketBooth1(movieNames, movieTimes, ticketPrice, tickets, money)

ticketBooth.showTicketPrice("Spiderman")
ticketBooth.showTicketPrice("Up")

ticketBooth.showMovieNameAndTime()

ticketBooth.showNumberOfTickets()

ticketBooth.buyTicket("Spiderman", new Time(18, 10), new Money(20.0))
ticketBooth.showNumberOfTickets()

ticketBooth.buyTicket("Batman", new Time(18, 10), new Money(10.0))
ticketBooth.buyTicket("Wall-E", new Time(18, 10), new Money(5.00))
ticketBooth.buyTicket("Spiderman", new Time(18, 15), new Money(5.00))


ticketBooth.restockTickets(10)
ticketBooth.restockTickets(-10)

Theater1[] theaters = [firstTheater, secondTheater, thirdTheater]
theaterManager = new TheaterManager1(ticketBooth, foodStand, theaters, movieLocations, money)
theaterManager.showMovieLocation("Superman")
theaterManager.showMovieLocation("Total Recall")

ticketBooth2 = new TicketBooth2(movieNames, movieTimes, ticketPrice, tickets, money)
ticketBooth2.showTicketPrice("Spiderman")
ticketBooth2.showTicketPrice("Up")

ticketBooth2.buyTicket("Spiderman", new Time(18, 10), new Money(20.0))
ticketBooth2.showNumberOfTickets()

ticketBooth2.buyTicket("Batman", new Time(18, 10), new Money(10.0))
ticketBooth2.buyTicket("Wall-E", new Time(18, 10), new Money(5.00))
ticketBooth2.buyTicket("Spiderman", new Time(18, 15), new Money(5.00))

ticketBooth2.restockTickets(10)
ticketBooth2.restockTickets(-10)


foodStock = ["Popcorn":20, "Soda":0, "Hot Dog": 17]
foodStand2 = new FoodStand2(foodNames, foodPrices, foodStock, money)

foodStand2.showPrice("Popcorn")
foodStand2.showPrice("Lobster")

foodStand2.showAmountOfProduct("Hot Dog")
foodStand2.showAmountOfProduct("Lasagna")

foodStand2.buyProduct("Hot Dog", new Money(10.0))
foodStand2.showAmountOfProduct("Hot Dog")

foodStand2.buyProduct("Popcorn", new Money(1.0))

foodStand2.buyProduct("Soda", new Money(10.0))
foodStand2.buyProduct("Lobster", new Money(5.00))

foodStand2.restockProduct("Soda", 40)
foodStand2.showAmountOfProduct("Soda")
foodStand2.restockProduct("Soda", -20)
foodStand2.restockProduct("Pizza", 10)

NoTaxChangeCalculator noTaxCalculator = new NoTaxChangeCalculator("That is not enough money")
println noTaxCalculator.calculateChange(new Money(12.0), new Money(10.0))
try {
    noTaxCalculator.calculateChange(new Money(10.0), new Money(12.0))
} catch (Exception e) {
    println e.getMessage()
}

foodStand3 = new FoodStand3(foodNames, foodPrices, foodStock, money, noTaxCalculator)

foodStand3.showPrice("Popcorn")
foodStand3.showPrice("Lobster")

foodStand3.showAmountOfProduct("Hot Dog")
foodStand3.showAmountOfProduct("Lasagna")

foodStand3.buyProduct("Hot Dog", new Money(10.0))
foodStand3.showAmountOfProduct("Hot Dog")

foodStand3.buyProduct("Popcorn", new Money(1.0))

foodStand3.buyProduct("Soda", new Money(10.0))
foodStand3.buyProduct("Lobster", new Money(5.00))

foodStand3.restockProduct("Soda", 40)
foodStand3.showAmountOfProduct("Soda")
foodStand3.restockProduct("Soda", -20)
foodStand3.restockProduct("Pizza", 10)

ticketBooth3 = new TicketBooth3(movieNames, movieTimes, ticketPrice, tickets, money, noTaxCalculator)
ticketBooth3.showTicketPrice("Spiderman")
ticketBooth3.showTicketPrice("Up")

ticketBooth3.buyTicket("Spiderman", new Time(18, 10), new Money(20.0))
ticketBooth3.showNumberOfTickets()

ticketBooth3.buyTicket("Batman", new Time(18, 10), new Money(10.0))
ticketBooth3.buyTicket("Wall-E", new Time(18, 10), new Money(5.00))
ticketBooth3.buyTicket("Spiderman", new Time(18, 15), new Money(5.00))

ticketBooth3.restockTickets(10)
ticketBooth3.restockTickets(-10)

californiaTaxChangeCalculator = new CaliforniaTaxChangeCalculator("Sorry that's not enough... in California")

ticketBooth3.setPaymentCalculator(californiaTaxChangeCalculator)
ticketBooth3.buyTicket("Batman", new Time(18, 10), new Money(10.0))
ticketBooth3.buyTicket("Batman", new Time(18, 10), new Money(13.5))

theaterManager.runTheaters()

TheaterFacade[] theaterFacades = [new TheaterFacade(firstTheater), new TheaterFacade(secondTheater), new TheaterFacade(thirdTheater)]
theaterManager2 = new TheaterManager2(ticketBooth3, foodStand3, theaterFacades, movieLocations, money)
theaterManager2.runTheaters()


