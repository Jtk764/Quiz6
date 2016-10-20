/** Phase A <jtk764><ces3723>
 * Phase B <ces3723><jtk764>
 */
package pMap.phaseB;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * PMap stands for Paired Map. A map is a collection of key value pairs, e.g.,
 * (1, "one") (2, "two") (3, "three") are all pairs with a key that's a integer and a value
 * that's an string.
 */

public class PMap implements Map<Integer,String> {
	
	HashSet<pMap.phaseB.Entry> hs = new HashSet<pMap.phaseB.Entry>(1000); 
	@Override
	public int size() {
		return hs.size();
	}

	@Override
	public boolean isEmpty() {
		return hs.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return hs.contains(new pMap.phaseB.Entry((Integer) key, null));
	}

	@Override
	public boolean containsValue(Object value) {
		for(pMap.phaseB.Entry i: hs) {
			if (i.getValue().equals((String) value)) return true;
		}
		return false;
	}

	@Override
	public String get(Object key) {
		for(pMap.phaseB.Entry i : hs) {
			if(i.getKey() == key) return i.getValue();
		}
		return null;
	}

	@Override
	public String put(Integer key, String value) {
		hs.add(new pMap.phaseB.Entry(key, value));
		return value;
	}

	@Override
	public String remove(Object key) {
		String val = get(key);
		hs.remove(new pMap.phaseB.Entry((Integer) key, null));
		return val;
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends String> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Integer> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<String> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<Integer, String>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
