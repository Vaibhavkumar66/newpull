import org.testng.annotations.*;

public class DummyTest {



    @BeforeSuite
    public void setUp() {
        System.out.println("Doing Setup on Suite");
    }

    @BeforeTest
    public void setUp2() {
        System.out.println("*******RUNNING BEFORE TEST******");
    }

    @Test
    public void testName() {
        System.out.println("TC1");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("Tearing down on Suite");
    }

    @AfterTest
    public void tearDown2() {
        System.out.println("******* AFTER TEST ********");
    }

    @BeforeClass
    public void setUp23() {
        System.out.println("Doing for " + getClass().getName());
    }
    @AfterClass
    public void setUp24() {
        System.out.println("Completed for " + getClass().getName());
    }
}
