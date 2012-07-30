class WeatherReporter{
    ICelsiusConverter tempConverter

    WeatherReporter(ICelsiusConverter converter)
    {
        tempConverter = converter
    }

    def reportWeather(int degrees)
    {
        def degreesF = tempConverter.convertToFahrenheit(degrees)

        if(degreesF > 100)
            "It is very hot outside"
        else if (degreesF < 50)
            "It is very cold outside"
        else
            "It is nice outside"
    }
}

interface ICelsiusConverter
{
    def convertToFahrenheit(int degreesCelsius)
}

class CelsiusConverter implements ICelsiusConverter
{
    def convertToFahrenheit(int degreesCelsius)
    {
        return degreesCelsius * 1.8 + 32
    }
}





