import static org.junit.Assert.*;

import org.junit.Test;

public class TDDTest {

	@Test
	public void test() {
		CharacterRemove string=new CharacterRemove();
		assertEquals("BCD",string.CharRemove("ABCD"));
		assertEquals("CD",string.CharRemove("AACD"));
		assertEquals("BCD",string.CharRemove("BACD"));
		assertEquals("BBAA",string.CharRemove("BBAA"));
		assertEquals("BAA",string.CharRemove("AABAA"));
	}

}
