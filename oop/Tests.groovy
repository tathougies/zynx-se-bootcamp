firstTime = new Time(14, 15)
println firstTime
failTime = new Time(25, 10)
secondTime = new Time(18, 10)
thirdTime = new Time(22, 50)
Time[] times = [firstTime, secondTime, thirdTime]

firstTheater = new NormalTheater("10", "Spiderman", times)

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

NoTaxChangeCalculator noTaxCalculator = new NoTaxChangeCalculator("That is not enough money")
println noTaxCalculator.calculateChange(new Money(12.0), new Money(10.0))
try {
    noTaxCalculator.calculateChange(new Money(10.0), new Money(12.0))
} catch (Exception e) {
    println e.getMessage()
}

foodStand = new FoodStand(foodNames, foodPrices, foodStock, money, noTaxCalculator)
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
secondTheater = new NormalTheater("4", "Batman", times)
thirdTheater = new NormalTheater("6", "Superman", times)
movieLocations = ["Spiderman":firstTheater, "Batman":secondTheater, "Superman":thirdTheater]
ticketPrice = new Money(11.50)
tickets = 100
ticketBooth = new TicketBooth(movieNames, movieTimes, ticketPrice, tickets, money, noTaxCalculator)

californiaTaxChangeCalculator = new CaliforniaTaxChangeCalculator("Sorry that's not enough... in California")

println ""

ticketBooth.setPaymentCalculator(californiaTaxChangeCalculator)
ticketBooth.buyTicket("Batman", new Time(18, 10), new Money(10.0))
ticketBooth.buyTicket("Batman", new Time(18, 10), new Money(13.5))

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

time = new Time(12, 0)
fourthTheater = new DriveInTheaterAdaptor(new DriveInTheater("Drive in", "Cars", time))

TheaterFacade[] theaterFacades = [new TheaterFacade(firstTheater), new TheaterFacade(secondTheater), new TheaterFacade(thirdTheater), new TheaterFacade(fourthTheater)]
theaterManager = new TheaterManager(ticketBooth, foodStand, theaterFacades, movieLocations, money)

theaterManager.runTheaters()
theaterManager.showMovieLocation("Superman")
theaterManager.showMovieLocation("Total Recall")