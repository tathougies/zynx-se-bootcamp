
Map<String, float[]> showTimes = [ "Spiderman" : [2.00, 5.50, 9.75], "Dark Knight" : [3.00, 6.50, 10.75], "Ted" : [4.00, 6.50, 11.75] ]
float ticketPrice = 11.50
String[] foodNames = [ "Popcorn", "Soda", "Hot Dog"]
Map<String, Integer> foodStock = [ "Popcorn" : 20, "Soda" : 100, "Hot Dog" : 35 ]
Map<String, Float> foodPrices = [ "Popcorn" : 3.00, "Soda" : 2.00, "Hot Dog" : 4.50 ]
String[] theaters = ["A", "B", "C"]
String[] movies = [ "Spiderman", "Dark Knight", "Ted"]
Map<String, String> movieLocations = [ "Spiderman" : "C", "Dark Knight" : "A", "Ted" : "B"]
int tickets = 100
MovieTheater movieTheater = new MovieTheater(showTimes, ticketPrice, foodNames, foodStock, foodPrices, theaters, movies, movieLocations, tickets)

movieTheater.showFoodPrice("Hot Dog")
movieTheater.showFoodPrice("Frog Legs")

movieTheater.takeTicketMoney(2.00)
movieTheater.takeTicketMoney(12.00)
movieTheater.tickets = 0
movieTheater.takeTicketMoney(12.00)
movieTheater.tickets = 99

movieTheater.takeFoodMoney("Popcorn", 5.00)
movieTheater.takeFoodMoney("Hot Dog", 2.00)
movieTheater.takeFoodMoney("Lobster", 55.0)

movieTheater.showFood()

movieTheater.showAmountOfFood("Hot Dog")
movieTheater.showAmountOfFood("Lasagna")

movieTheater.buyFood("Hot Dog", 10.0)
movieTheater.showAmountOfFood("Hot Dog")

movieTheater.foodStock["Hot Dog"] = 0
movieTheater.buyFood("Hot Dog", 10.0)
movieTheater.foodStock["Hot Dog"] = 30


movieTheater.showMovieNames()

movieTheater.showShowTimes("Dark Knight")
movieTheater.showShowTimes("Up")

movieTheater.showMovieLocation("Ted")
movieTheater.showMovieLocation("Toy Story 3")

movieTheater.dimLights("A")
movieTheater.dimLights("LA")

movieTheater.showPreviews("B")
movieTheater.showPreviews("New York")

movieTheater.showMovie("C")
movieTheater.showMovie("Chicago")

movieTheater.buyMovieTicket("Spiderman", 2.00, 12.00)
movieTheater.buyMovieTicket("Toy Story 3", 9.75, 12.00)
movieTheater.buyMovieTicket("Spiderman", 0.00, 12.00)
movieTheater.buyMovieTicket("Spiderman", 2.00, 2.00)

movieTheater.buyFood("Hot Dog", 10.00)
movieTheater.buyFood("Pizza", 10.00)
movieTheater.buyFood("Hot Dog", 1.00)

movieTheater.rollCredits("A")
movieTheater.rollCredits("San Diego")

movieTheater.cleanTheater("B")
movieTheater.cleanTheater("Boston")

movieTheater.restockFood("Hot Dog", 90)
movieTheater.restockFood("Lobster", 80)
movieTheater.restockFood("Hot Dog", -3)

movieTheater.restockTickets(80)
movieTheater.restockTickets(-9)

println movieTheater.money
println movieTheater.tickets
