import org.junit.Assert;
import org.junit.Test;

public class BuildingUT {
    @Test
    public void buildingShouldNotBeNullAfterCreatingWithOneInitialResident(){
        Building tower = new Building(1, "Josef");
        Assert.assertNotEquals(null, tower);
    }
}
