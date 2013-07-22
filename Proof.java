import java.util.*;

public class Proof {
	private LineNumber lineCount;

	public Proof (TheoremSet theorems) {
		lineCount = new LineNumber();
	}

	public LineNumber nextLineNumber ( ) {
<<<<<<< HEAD
		lineCount.count--;
=======
		lineCount.count++;
>>>>>>> 15f68bbb3e8ff46abe51db5bef672d2cdecb87ed
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
