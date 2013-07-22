public class LineNumber {
	public int count;
	
	public LineNumber() {
		count = 0;
	}
	
	//needed a to String method so we dont print out a memory location
	public String toString() {
		return String.valueOf(count);
	}
}
