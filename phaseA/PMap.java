/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */
package pMap.phaseA;

/**
 * PMap stands for Paired Map. A map is a collection of key value pairs, e.g.,
 * (1, 2) (2, 3) (3, 4) are all pairs with a key that's a integer and a value
 * that's an integer
 */
public class PMap {
	public Entry[] table = new Entry[1000];

	public int size() {
		int temp=0;
	for (int i = 0; i < 1000 ; i++){
		if (table[i] != null){
			temp++;
		}
	}
	return temp;
	}

	public boolean isEmpty() {
		if(this.size() == 0 ) return true;
		return false;
	}

	public boolean containsKey(int key) {
		for (int i = 0; i < 1000 ; i++){
			if (table[i] != null && table[i].getKey() == key ){
				return true;}
		}
		return false;
	}

	public boolean containsValue(int value) {
		
		for (int i = 0; i < 1000 ; i++){
			if (table[i] != null && table[i].getValue() == value){
				return true;}
		}
		return false;
	}

	public int get(int key) {
		for (int i = 0; i < 1000 ; i++){
			if (table[i] != null && table[i].getKey() == key ){
				return table[i].getValue();}
		}
		return 0;
	}
	
	private int getInd(int key) {
		for(int i = 0; i < 1000; i++) {
			if(table[i] != null && table[i].getKey() == key) return i;
		}
		return -1;
	}

	public int put(int key, int value) {
		int ind = getInd(key);
		if(ind != -1) {
			table[ind] = new Entry(key, value);
			return value;
		}
		else {
			for(int i = 0; i < 1000; i++) {
				if(table[i] == null) { 
					table[i] = new Entry(key, value);
					return 0;
				}
			}
		}
		return 0;
	}

	public int remove(int key) {
		int ind = getInd(key);
		if(ind != -1) {
			int val = table[ind].getValue();
			table[ind] = null;
			return val;
		}
		return 0;
	}

	public void putAll(int[] keys, int[] values) {
		for(int i = 0; i < keys.length; i++) {
			put(keys[i], values[i]);
		}

	}

	public void clear() {
		for (int i = 0; i < 1000 ; i++){
			table[i] = null;
		}
		

	}

	public int[] keys() {
		if (this.isEmpty()) return null;
		int[] v = new int[this.size()];
		int j = 0;
		for (int i = 0; i < 1000 ; i++){
			if(table[i] != null){
				v[j]=table[i].getKey();
				j++;
			}
		}
		return v;
	}
	

	public int[] values() {
		if (this.isEmpty()) return null;
		int[] v = new int[this.size()];
		int j = 0;
		for (int i = 0; i < 1000 ; i++){
			if(table[i] != null){
				v[j]=table[i].getValue();
				j++;
			}
		}
		return v;
	}

	public Entry[] entrys() {
		if (this.isEmpty()) return null;
		Entry[] v = new Entry[this.size()];
		int j = 0;
		for (int i = 0; i < 1000 ; i++){
			if(table[i] != null){
				v[j]=table[i];
				j++;
			}
		}
		return v;
	}
	}
