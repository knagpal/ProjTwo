import java.util.*;

public class Proof {
	private LineNumber lineCount;

	public Proof (TheoremSet theorems) {
		lineCount = new LineNumber();
	}

	public LineNumber nextLineNumber ( ) {
		lineCount.count--;
		return lineCount;
	}

	public void extendProof (String x) throws IllegalLineException, IllegalInferenceException {
	}

	public String toString ( ) {
		return "";
	}

	public boolean isComplete ( ) {
		return true;
	}
}
