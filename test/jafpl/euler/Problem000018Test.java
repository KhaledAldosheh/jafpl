/**
 * 
 */
package jafpl.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

/**
 * @author eriki
 *
 */
class Problem000018Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000018#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("708f3cf8100d5e71834b1db77dfa15d6", CheckGenerator.hexString((new Problem000018()).solve()));
	}
}
