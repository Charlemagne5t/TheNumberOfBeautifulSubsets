import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] nums = {4,2,5,9,10,3};
        int k = 1;
        int expected = 23;
        int actual = new Solution().beautifulSubsets(nums, k);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        int[] nums = {16,6,1,14,12,18,8,10,3,11,7,19,20};
        int k = 19;
        int expected = 6143;
        int actual = new Solution().beautifulSubsets(nums, k);

        Assert.assertEquals(expected, actual);
    }
}
