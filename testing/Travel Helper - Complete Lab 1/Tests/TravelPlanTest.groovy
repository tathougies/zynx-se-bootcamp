import org.junit.Test
import static org.junit.Assert.*
import org.junit.Before

/*
 * I expect some test that severely relies on other things working well,
 * so this is not super legitimately finished.
 */
class TravelPlanTest{
    def plan
    @Before
    void setUp() {
        plan = new TravelPlan()
    }

    @Test
    public void constructorRunsOnValidStepsInput(){
        def dict = ['origin': 'SEA',
                'destination' : 'JFK',
                'date' : '073012',
                'departureTime' : '12:00P']
        def step = new TravelStep()
        step.load(dict)
        def planList = [step]
        def newPlan = new TravelPlan(planList)
        assertEquals(planList, newPlan.getPlanList())
    }

    @Test
    public void loadRunsOnValidStepsInput(){
        def list =[
                    ['origin': 'SEA',
                     'destination' : 'JFK',
                     'date' : '073012',
                     'departureTime' : '12:00P'],
                    ['origin': 'JFK',
                     'destination' : 'SEA',
                     'date' : '080312',
                     'departureTime' : '05:00P']
                   ]
        def result = plan.load(list)
        assertTrue(result)
        assertEquals('SEA', plan.getPlanList()[0]['origin'])
    }

    @Test (expected = Exception)
    public void loadThrowsExceptionOnInvalidInput(){
        def result = plan.load([['origin':'SEAA']])
        assertNull(result)
    }

    @Test (expected = Exception)
    public void loadThrowsExceptionOnNullInput(){
        def result = plan.load()
        assertNull(result)
    }

    @Test (expected = Exception)
    public void loadThrowsExceptionOnEmptyListInput(){
        def result = plan.load([])
        assertNull(result)
    }
}
