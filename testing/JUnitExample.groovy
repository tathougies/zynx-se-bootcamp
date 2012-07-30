import org.junit.Test
import org.junit.Before
import static org.junit.Assert.*
import org.junit.After

class ExampleTest
{
    def localDb

    @Before
    void setupDatabase()
    {
        localDb = new DatabaseInstance()
        localDb.beginTransaction()
    }

    @Test
    void ExampleShouldLoadFromDB()
    {
        def testObject = new Example()

        def result = testObject.find("query")
        assertNotNull(result)
    }

    @Test(expected = ItemNotFoundException)
    void ExampleShouldFailToFindWithInvalidQuery()
    {
        def testObject = new ExampleTest()

        def result = testObject.find("bad query")
    }

    @After
    void cleanupDatabase()
    {
        localDb.rollback()
    }
}