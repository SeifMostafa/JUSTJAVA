import static org.junit.Assert.*;

import org.junit.Test;

import A.TechnicalAlgoTraders;

public class TechnicalAlgoTradersTest {

	TechnicalAlgoTraders technicalAlgoTraders = new TechnicalAlgoTraders();

	@Test
	public void testMaxInFloatArr1() {
		float[] arr = new float[] { 0.5f, 0.8f, 0.7f };
		assertEquals(technicalAlgoTraders.findMaxFloatInArray(arr), 0.8f, 0f);
	}

	@Test
	public void testMaxInFloatArr2() {
		float[] arr2 = new float[] { Float.NaN, Float.NEGATIVE_INFINITY, 0.7f };
		assertEquals(technicalAlgoTraders.findMaxFloatInArray(arr2), 0.7f, 0f);
	}

	@Test
	public void testMaxInFloatArr3() {
		assertEquals(technicalAlgoTraders.findMaxFloatInArray(new float[] { 3 , 0, 1 } ), 3f, 0f);
	}

}
