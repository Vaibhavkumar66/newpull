import org.testng.annotations.*;

public class DummyTest {
    @BeforeSuite
    public void setUp() {
        System.out.println("Doing Setup on Suite");
    }

    @Test
    public void testName() {
        System.out.println("TC1");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("Tearing down on Suite");
    }
}
