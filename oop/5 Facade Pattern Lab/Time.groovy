class Time implements Comparable<Time>{
    private hours
    private minutes

    Time(Integer hours, Integer minutes)  {
        if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59)   {
            this.hours = hours
            this.minutes = minutes
        }
        else {
            println "Not a valid time."
        }
    }

    String toString() {
        return "${hours}:${minutes}"
    }

    int compareTo(Time secondTime) {
        int hourComparisonResult = hours.compareTo(secondTime.hours)
        if (hourComparisonResult != 0) {
            return hourComparisonResult
        }
        else {
            return minutes.compareTo(secondTime.minutes)

        }
    }
}
