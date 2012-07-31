import org.junit.Test
import static org.junit.Assert.*
import org.junit.Before

class TravelStepTest{
    def step
    @Before
    void setup(){
        step = new TravelStep()
    }

    /**************************DATE TESTS*****************************/
    @Test
    public void isValidDateReturnsTrueOnValidDateWithNoPunctuation(){
        def date = "073012"
        def result = step.isValidDate(date)
        assertNotNull(result)
        assertTrue(result)
    }

    @Test
    public void isValidDateReturnsTrueOnValidDateWithSlashes(){
        def date = "07/30/12"
        def result = step.isValidDate(date)
        assertTrue(result)
    }

    @Test
    public void isValidDateReturnsFalseOnNull(){
        def date = null
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnValidDateWithDashes(){
        def date = "07-30-12"
        def result = step.isValidDate(date)
        assertTrue(result)
    }

    @Test
    public void isValidDateReturnsFalseOnTooShortDate(){
        def date = "0730"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOn7CharacterDate(){
        def date = "0730122"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnTooLongDate(){
        def date = "0730121212"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnInvalidCharacters(){
        def date = "0730&&"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnInvalidMonthNoPunctuation(){
        def date = "773012"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnInvalidMonthSlashes(){
        def date = "77/30/12"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnInvalidMonthDashes(){
        def date = "77/30/12"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnInvalidDayLongMonthNoPunctuation(){
        def date = "073312"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnInvalidDayShortMonthNoPunctuation(){
        def date = "043112"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnInvalidDayLongMonthSlashes(){
        def date = "07/33/12"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnInvalidDayShortMonthSlashes(){
        def date = "04/31/12"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnInvalidDayLongMonthDashes(){
        def date = "07/33/12"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    @Test
    public void isValidDateReturnsFalseOnInvalidDayShortMonthDashes(){
        def date = "02/30/12"
        def result = step.isValidDate(date)
        assertFalse(result)
    }

    /**************************PLACE TESTS*****************************/
    @Test
    public void isValidPlaceReturnsTrueOnValidInputAllCaps(){
        def place = "SEA"
        def result = step.isValidPlace(place)
        assertTrue(result)
    }

    @Test
    public void isValidPlaceReturnsTrueOnTooLongInputLowercase(){
        def place = "sea"
        def result = step.isValidPlace(place)
        assertTrue(result)
    }

    @Test
    public void isValidPlaceReturnsFalseOnNull(){
        def place = null
        def result = step.isValidPlace(place)
        assertFalse(result)
    }

    @Test
    public void isValidPlaceReturnsFalseOnTooLongInput(){
        def place = "SEAA"
        def result = step.isValidPlace(place)
        assertFalse(result)
    }

    @Test
    public void isValidPlaceReturnsFalseOnTooShortInput(){
        def place = "SE"
        def result = step.isValidPlace(place)
        assertFalse(result)
    }

    @Test
    public void isValidPlaceReturnsFalseOnNonLetterInput(){
        def place = "123"
        def result = step.isValidPlace(place)
        assertFalse(result)
    }

    /**************************TIME TESTS*****************************/
    @Test
    public void isValidTimeReturnsTrueOnValidInput(){
        def time = "12:00A"
        def result = step.isValidTime(time)
        assertTrue(result)
    }

    @Test
    public void isValidTimeReturnsFalseOnNull(){
        def time = null
        def result = step.isValidTime(time)
        assertFalse(result)
    }

    @Test
    public void isValidTimeReturnsFalseOnTooLongInput(){
        def time = "12:00AA"
        def result = step.isValidTime(time)
        assertFalse(result)
    }

    @Test
    public void isValidTimeReturnsFalseOnTooShortInput(){
        def time = "12:00"
        def result = step.isValidTime(time)
        assertFalse(result)
    }

    @Test
    public void isValidTimeReturnsFalseOnInputWithNonColonDivider(){
        def time = "12.00A"
        def result = step.isValidTime(time)
        assertFalse(result)
    }

    @Test
    public void isValidTimeReturnsFalseOnInvalidCharacters(){
        def time = "&&:00A"
        def result = step.isValidTime(time)
        assertFalse(result)
    }

    @Test
    public void isValidTimeReturnsFalseOnNotAorP(){
        def time = "12:00M"
        def result = step.isValidTime(time)
        assertFalse(result)
    }

    @Test
    public void isValidTimeReturnsFalseOnInvalidHour(){
        def time = "32:00A"
        def result = step.isValidTime(time)
        assertFalse(result)
    }

    @Test
    public void isValidTimeReturnsFalseOnInvalidMinutes(){
        def time = "12:71A"
        def result = step.isValidTime(time)
        assertFalse(result)
    }

    /******************************LOAD TESTS*****************************/

    @Test
    public void loadReturnsTrueOnValidInput(){
        def dict = ['origin': 'SEA',
                'destination' : 'JFK',
                'date' : '073012',
                'departureTime' : '12:00P']
        def result = step.load(dict)
        assertTrue(result)
    }

    @Test(expected = Exception)
    public void loadThrowsExceptionOnInvalidOrigin(){
        def dict = ['origin': 'SEAA',
                    'destination' : 'JFK',
                    'date' : '073012',
                    'departureTime' : '12:00P']
        def result = step.load(dict)
        assertNull(result)
    }

    @Test(expected = Exception)
    public void loadThrowsExceptionOnMissingOrigin(){
        def dict = ['destination' : 'JFK',
                'date' : '073012',
                'departureTime' : '12:00P']
        def result = step.load(dict)
        assertNull(result)
    }

    @Test(expected = Exception)
    public void loadThrowsExceptionOnInvalidDestination(){
        def dict = ['origin': 'SEA',
                'destination' : 'JFKK',
                'date' : '073012',
                'departureTime' : '12:00P']
        step.load(dict)
    }

    @Test(expected = Exception)
    public void loadThrowsExceptionOnMissingDestination(){
        def dict = ['origin': 'SEA',
                'date' : '073012',
                'departureTime' : '12:00P']
        def result = step.load(dict)
        assertNull(result)
    }

    @Test(expected = Exception)
    public void loadThrowsExceptionOnInvalidDate(){
        def dict = ['origin': 'SEA',
                'destination' : 'JFK',
                'date' : '0730122',
                'departureTime' : '12:00P']
        def result = step.load(dict)
        assertNull(result)
    }

    @Test(expected = Exception)
    public void loadThrowsExceptionOnMissingDate(){
        def dict = ['origin': 'SEA',
                'destination' : 'JFK',
                'departureTime' : '12:00P']
        def result = step.load(dict)
        assertNull(result)
    }

    @Test(expected = Exception)
    public void loadThrowsExceptionOnInvalidTime(){
        def dict = ['origin': 'SEA',
                'destination' : 'JFK',
                'date' : '073012',
                'departureTime' : '12:00X']
        def result = step.load(dict)
        assertNull(result)
    }

    @Test(expected = Exception)
    public void loadThrowsExceptionOnMissingTime(){
        def dict = ['origin': 'SEA',
                'destination' : 'JFK',
                'date' : '073012']
        def result = step.load(dict)
        assertNull(result)
    }

    @Test(expected = Exception)
    public void formatDateThrowsExceptionOnNullInput(){
        def result = step.formatDate()
    }

    @Test
    public void formatDateReturnsCorrectOutputOnInputSlashes(){
        def date = "07/30/12"
        def result = step.formatDate()
        assertEquals("073012",result)
    }
}
