/** Phase A <jtk764><ces3723>
 * Phase B <ces3723><jtk764>
 */

package pMap.phaseA;

/**
 * Map.Entry, assume that the key and value are both integers.
 */
public class Entry {
	private int key;
	private int value;
	public Entry(int k, int v){
		key = k;
		value = v;
	}
	// TODO
	public int getKey(){
		return key;
	}
	
	public int getValue(){
		return value;
	}
	
	@Override
	public String toString() {
		return "( " + key + ", " + value + " )";
	}
}

