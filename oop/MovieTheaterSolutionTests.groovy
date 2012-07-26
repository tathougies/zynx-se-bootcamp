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

foodStand.showFoodNames()

foodStand.showAmountOfFood("Hot Dog")
foodStand.showAmountOfFood("Lasagna")

foodStand.buyFood("Hot Dog", new Money(10.0))
foodStand.showAmountOfFood("Hot Dog")

foodStand.buyFood("Popcorn", new Money(1.0))

foodStand.buyFood("Soda", new Money(10.0))
foodStand.buyFood("Lobster", new Money(5.00))

foodStand.restockFood("Soda", 40)
foodStand.showAmountOfFood("Soda")
foodStand.restockFood("Soda", -20)
foodStand.restockFood("Pizza", 10)

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

foodStand2.showAmountOfFood("Hot Dog")
foodStand2.showAmountOfFood("Lasagna")

foodStand2.buyFood("Hot Dog", new Money(10.0))
foodStand2.showAmountOfFood("Hot Dog")

foodStand2.buyFood("Popcorn", new Money(1.0))

foodStand2.buyFood("Soda", new Money(10.0))
foodStand2.buyFood("Lobster", new Money(5.00))

foodStand2.restockFood("Soda", 40)
foodStand2.showAmountOfFood("Soda")
foodStand2.restockFood("Soda", -20)
foodStand2.restockFood("Pizza", 10)

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

foodStand3.showAmountOfFood("Hot Dog")
foodStand3.showAmountOfFood("Lasagna")

foodStand3.buyFood("Hot Dog", new Money(10.0))
foodStand3.showAmountOfFood("Hot Dog")

foodStand3.buyFood("Popcorn", new Money(1.0))

foodStand3.buyFood("Soda", new Money(10.0))
foodStand3.buyFood("Lobster", new Money(5.00))

foodStand3.restockFood("Soda", 40)
foodStand3.showAmountOfFood("Soda")
foodStand3.restockFood("Soda", -20)
foodStand3.restockFood("Pizza", 10)

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

TheaterFacade1[] theaterFacades = [new TheaterFacade1(firstTheater), new TheaterFacade1(secondTheater), new TheaterFacade1(thirdTheater)]
theaterManager2 = new TheaterManager2(ticketBooth3, foodStand3, theaterFacades, movieLocations, money)
theaterManager2.runTheaters()


time = new Time(12, 0)
firstTheater = new NormalTheater("10", "Spiderman", times)
secondTheater = new NormalTheater("4", "Batman", times)
thirdTheater = new NormalTheater("6", "Superman", times)
fourthTheater = new DriveInTheaterAdaptor(new DriveInTheater("Drive in", "Cars", time))
movieTimes = ["Spiderman":times, "Batman":times, "Superman":times, "Cars":[time]]

TheaterFacade2[] theaterFacades2 = [new TheaterFacade2(firstTheater), new TheaterFacade2(secondTheater), new TheaterFacade2(thirdTheater), new TheaterFacade2(fourthTheater)]
theaterManager3 = new TheaterManager3(ticketBooth3, foodStand3, theaterFacades2, movieLocations, money)

theaterManager3.runTheaters()

println foodStand.getFoodNames()
println foodStand2.getFoodNames()
println foodStand3.getFoodNames()

TheaterFacade2[] theaterFacades21 = [new TheaterFacade2(firstTheater), new TheaterFacade2(secondTheater), new TheaterFacade2(thirdTheater), new TheaterFacade2(fourthTheater)]
foodStand4 = new FoodStand4(foodNames, foodPrices, foodStock, money, noTaxCalculator)
ticketBooth4 = new TicketBooth4(movieNames, movieTimes, ticketPrice, tickets, money, noTaxCalculator)

theaterManager4 = new TheaterManager4(ticketBooth4, foodStand4, theaterFacades21, movieLocations, money)

movieTheaterVisitor = new RestockVisitor1(42)
theaterManager4.visitStands(movieTheaterVisitor)

movieTheaterVisitor = new PrintVisitor1()
theaterManager4.visitStands(movieTheaterVisitor)
