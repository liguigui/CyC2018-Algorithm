import org.junit.Assert;

public class Test {

    private final int[] nums = {-2, -1, 0, 1, 2};
    private final int expect = 2;

    @org.junit.Test
    public void ThreeSumTest() {
        test(new ThreeSumSlow());
    }

    @org.junit.Test
    public void ThreeSumFastTest() {
        test(new ThreeSumFast());
    }

    private void test(ThreeSum threeSum) {
        Assert.assertEquals(threeSum.count(nums), expect);
    }
}