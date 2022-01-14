import org.junit.Assert;
import org.junit.Test;

public class BuildingUT {
    @Test
    public void buildingShouldNotBeNullAfterCreatingWithOneInitialResident(){
        Building tower = new Building(1, "Josef");
        Assert.assertNotEquals(null, tower);
    }
    @Test
    public void buildingShouldNotBeNullAfterCreatingWithMoreInitialResidents(){
        String[] residents = {"Josef", "Gabi", "Karl"};
        Building tower = new Building(1, residents);
        Assert.assertNotEquals(null, tower);
    }
    @Test
    public void residentsSizeShouldBe1AfterCreatingWithOneInitialResident(){
        Building tower = new Building(1, "Josef");
        Assert.assertEquals(1, (int) tower.getResidents());
    }
    @Test
    public void residentsSizeShouldBe3AfterCreatingWith3InitialResidents(){
        String[] residents = {"Josef", "Gabi", "Karl"};
        Building tower = new Building(1, residents);
        Assert.assertEquals(3, (int) tower.getResidents());
    }
}
