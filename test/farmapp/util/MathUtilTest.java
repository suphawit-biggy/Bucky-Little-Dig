import static org.junit.Assert.*;

import org.junit.Test;

import farmapp.util.MathUtil;

/**
 * @author Suphawit Kasemsirisopha [572115056]
 * on Apr 14, 2017
 */
public class MathUtilTest {
	@Test
	public void testAdd() {
	   MathUtil mathUtil = new MathUtil();
	   assertEquals(mathUtil.add(5, 4), 9);
	}
}
