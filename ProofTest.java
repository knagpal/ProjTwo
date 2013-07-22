import static org.junit.Assert.*;

import org.junit.Test;


public class ProofTest {

	@Test
	public void test() {
		LineNumber a = new LineNumber();
		assertEquals(a.count,0);
		TheoremSet someThrms = new TheoremSet();
		Proof soo = new Proof(someThrms);
		System.out.print (soo.nextLineNumber ( ) + "\t");
		System.out.print("hello");
	}
}
