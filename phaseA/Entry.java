/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
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
}

