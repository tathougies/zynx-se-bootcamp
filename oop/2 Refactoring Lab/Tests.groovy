firstTime = new Time(14, 15)
println firstTime
failTime = new Time(25, 10)
secondTime = new Time(18, 10)
thirdTime = new Time(22, 50)
Time[] times = [firstTime, secondTime, thirdTime]

firstTheater = new Theater("10", "Spiderman", times)

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

foodStand = new FoodStand(foodNames, foodPrices, foodStock, money)
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
secondTheater = new Theater("4", "Batman", times)
thirdTheater = new Theater("6", "Superman", times)
movieLocations = ["Spiderman":firstTheater, "Batman":secondTheater, "Superman":thirdTheater]
ticketPrice = new Money(11.50)
tickets = 100
ticketBooth = new TicketBooth(movieNames, movieTimes, ticketPrice, tickets, money)

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

Theater[] theaters = [firstTheater, secondTheater, thirdTheater]
theaterManager = new TheaterManager(ticketBooth, foodStand, theaters, movieLocations, money)
theaterManager.showMovieLocation("Superman")
theaterManager.showMovieLocation("Total Recall")
