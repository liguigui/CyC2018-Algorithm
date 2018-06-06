import org.junit.Assert;

public class Test {

    private final int[] nums = {-2, -1, 0, 1, 2};
    private final int expect = 2;

    @org.junit.Test
    public void ThreeSumTest() {
        Assert.assertEquals(ThreeSum.count(nums), expect);
    }

    @org.junit.Test
    public void ThreeSumFastTest() {
        Assert.assertEquals(ThreeSumFast.count(nums), expect);
    }
}