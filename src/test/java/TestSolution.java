import org.junit.Assert;
import org.junit.Test;
import ru.bevz.Solution;

public class TestSolution {

	@Test
	public void testIsStrogobogrammatic() {
		Solution solution = new Solution();
		boolean result;

		result = solution.isStrobogrammatic("69");
		Assert.assertEquals(true, result);

		result = solution.isStrobogrammatic("88");
		Assert.assertEquals(true, result);

		result = solution.isStrobogrammatic("962");
		Assert.assertEquals(false, result);

		result = solution.isStrobogrammatic("1");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testIsPowerOfFour() {
		Solution solution = new Solution();
		boolean result;

		result = solution.isPowerOfFour(16);
		Assert.assertEquals(true, result);

		result = solution.isPowerOfFour(5 );
		Assert.assertEquals(false, result);

		result = solution.isPowerOfFour(1);
		Assert.assertEquals(true, result);

		result = solution.isPowerOfFour(0.0625);
		Assert.assertEquals(true, result);
	}
}
