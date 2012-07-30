/*
The Flight Database class.

Acts as an interface with the backend database of available flights.
For our purposes only need to worry about a single method getFlight
which allows us to find a flight given an origin, destination and date.

This is a dummy implementation, currently always fails. The implementation
 should be irrelevant because this should be mocked in all tests.
 */

class FlightDatabase {
    public Flight getFlight(String orig, String dest, Date date)
    {
        return null
    }
	
	public Flight getFlightByOrig(String orig, Date date)
	{
		return null
	}
	
	public Flight getFlightByDest(String dest, Date date)
	{
		return null
	}
}
