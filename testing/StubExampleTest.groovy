import org.junit.Test

import static org.junit.Assert.assertTrue

class DummyConverter implements ICelsiusConverter
{
    def convertToFahrenheit(int input)
    {
        return 105
    }
}

class WeatherReporterTest
{
    @Test
    void WeatherReporterShouldDetectIfTooHot()
    {
        def reporter = new WeatherReporter(new DummyConverter())

        def result = reporter.reportWeather(40)

        assertTrue result == "It is very hot outside"
    }
}