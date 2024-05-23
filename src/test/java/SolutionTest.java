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
    @Test
    public void test3() {
        int[] nums = {51, 15, 61, 64, 53, 6, 3, 5, 76, 79, 67, 26, 87, 76, 54, 50, 42, 80, 79};
        int k = 74;
        int expected = 245759;
        int actual = new Solution().beautifulSubsets(nums, k);

        Assert.assertEquals(expected, actual);
    }
}
