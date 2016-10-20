/** Phase A <jtk764><ces3723>
 * Phase B <ces3723><jtk764>
 */

package pMap.phaseB;

import java.util.Map;

/**
 * Map.Entry. Assume that key is an integer and value is a string.
 */

public class Entry implements Map.Entry<Integer,String> {
	private int key;
	private String value;
	
	public Entry(Integer key, String value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public Integer getKey() {
		return key;
	}
	@Override
	public String getValue() {
		return value;
	}
	@Override
	public String setValue(String value) {
		this.value = value;
		return value;
	}
	
	@Override
	public int hashCode() {
		return Integer.hashCode(key);
	}
	
	@Override
	public boolean equals(Object so) {
		Entry s = (Entry) so;
		if(this.key == s.key) return true;
		else return false;
	}
	
	
}
