import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest {

    @Test(groups = "sanity", timeOut = 2000)
    public void sanity() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("SANITY");

    }

    @Test(groups = {"integration", "regression"})
    public void testName() {
        System.out.println("TC2");
    }
    @Test(groups = "regression", dependsOnGroups = "sanity")
    public void testName2() {
        System.out.println("TC3");
    }
    @Test(groups = {"regression"},dependsOnGroups = "sanity")
    public void testName3() {
        System.out.println("TC4");
    }
    @Test(groups = {"integration"}, dependsOnGroups = "sanity")
    public void testName4() {
        System.out.println("TC5");
    }
    @Test(groups = "regression", dependsOnGroups = "sanity")
    public void testName5() {
        System.out.println("TC6");
    }
}
