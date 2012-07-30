/*
Flight Class

A simple class representing a single flight.
Contains the flights id number, origin/destination,
and date.
 */

class Flight {
    def flightNum, orig, dest, date

    public Flight(int id, String origin, String destination, Date flightDate)
    {
        flightNum = id
        orig = origin
        dest = destination
        date = flightDate
    }

    public int getFlightNum()
    {
        return flightNum
    }

    public String getOrig()
    {
        return orig
    }

    public String getDest()
    {
        return dest
    }

    public Date getDate()
    {
        return date;
    }
}
