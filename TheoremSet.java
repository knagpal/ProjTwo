import java.util.*;

public class TheoremSet {
	//Using a HashMap to keep track of theorems
	private HashMap<String, Expression> db;

	public TheoremSet ( ) {
		//new database
		db = new HashMap<String, Expression>();
	}

	public Expression put (String s, Expression e) {
		//(k,v) pairs are (theoremName, theorem)
		if (!db.containsKey(s)) { //if key is not in database, add the (k,v) pair
			return db.put(s,e);
		} else if (db.get(s) == e){ //if key is in database, and the values are equivalent, do nothing
			return null;
		} else { //if key is in database, and values are different, add new (k,v) pair to database
			return db.put(s,e);
		}
		/* -To Do: Handling cases where our database is full, does hashmap automatically resize?
		 * the HashMap class 'put' function returns the previous VALUE associated with the key,
		 *  or null if there was no mapping for key
		 *  I'm wondering why we need to return this? What does returning this value do for us? -Ryan
		 */
	}
}
