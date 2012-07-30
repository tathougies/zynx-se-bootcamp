
/**
 * Travel Step -- represents one leg of a trip
 * Fields:
 *   Origin
 *   Destination
 *   Date
 *   Departure Time
 *   Arrival Time (default to empty)
 *
 * Constructor (empty)
 * Load(dictionary)
 *   This is where the validation part occurs
 * Validator Methods
 *
 * Validation Constraints:
 *   No field should be null
 *   Origin/Destination -- 3 letters Lowercase or Upper
 *   Dates -- three formats
 *     "MMDDYY", "MM-DD-YY", "MM/DD/YY"
 *     Months and days should make sense.
 *   Time -- "##:##A" or "##:##P"
 */
class TravelStep {
    public def origin
    public def destination
    public def date
    public def departureTime

    TravelStep() {}

    public Boolean load(dict){
        if(!isValidPlace(dict["origin"])){
            throw Exception("Origin invalid")
        }
        if(!isValidPlace(dict["destination"])){
            throw Exception("Destination invalid")
        }
        if(!isValidDate(dict["date"])){
            throw Exception("Date invalid")
        }
        if(!isValidTime(dict["departureTime"])){
            throw Exception("Departure time invalid")
        }
        origin = dict["origin"]
        destination = dict["destination"]
        date = dict["date"]
        departureTime = dict["departureTime"]

        return true
    }

    public Boolean isValidDate(date){
        if (date == null)
            return false
        if (date.size() == 6){
            if (!date.isInteger()){
                return false
            }
            def month = (date[0] + date[1]).toInteger()
                if (month < 1 || month > 12){
                    return false
                }
            def day = (date[2] + date[3]).toInteger()
            def dayLimit = 30
            if (month in [1, 3, 5, 7, 8, 10 , 12])
                dayLimit = 31
            else if (month == 2)
                dayLimit = 29
            if (day > dayLimit || day < 1)
                return false
            return true
        }
        else if (date.size() == 8){
            def dividers = date[2] + date[5]
            if (dividers == "//" || dividers == "--"){
                def shortDate = ""
                for (int i in [0,1,3,4,6,7]){
                    shortDate += date[i]
                }
                return isValidDate(shortDate)
            }
        }
        return false
    }
    public Boolean isValidTime(time){
        if (time == null)
            return false
        if (time.size() != 6)
            return false
        if (time[2] != ":")
            return false
        if (!(time[5] in ["A", "P"]))
            return false
        if(!(time[0] + time[1] + time[3] + time[4]).isInteger())
            return false

        def hour = (time[0] + time[1]).toInteger()
        if(1 > hour || hour > 12)
            return false

        def minutes = (time[3] + time[4]).toInteger()
        if(0 > minutes || minutes > 59)
            return false

        return true

    }
    public Boolean isValidPlace(place){
        if (place == null)
            return false
        if (place.size() != 3)
            return false
        for (int i = 0; i < place.size(); i++){
            if (!place.charAt(i).isLetter())
                return false
        }

        return true
    }

}
