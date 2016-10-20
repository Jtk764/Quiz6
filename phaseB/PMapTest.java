/** Phase A <jtk764><ces3723>
 * Phase B <ces3723><jtk764>
 */
package pMap.phaseB;

import java.util.Collection;
import java.util.Set;

import org.junit.Test;

public class PMapTest {

	@Test
	public void test1() {
		PMap pmap = new PMap();
		pmap.put(1, "two");
		pmap.put(2, "one");
		pmap.put(3, "three");
		System.out.println(pmap.size());
		Set<Integer> keys = pmap.keySet();
		for (Integer i : keys) {
			System.out.print(i + " ");
		}
		System.out.println();
		Collection<String> values = pmap.values();
		for (String i : values) {
			System.out.print(i + " ");
		}
		System.out.println(pmap.size());
		System.out.println(pmap.containsKey(new Integer(3)));
		System.out.println(pmap.get(new Integer(3)));
		System.out.println(pmap.remove(new Integer(3)));
		System.out.println(pmap.containsValue("LOL"));
		System.out.println(pmap.keySet());
		System.out.println(pmap.values());
		System.out.println(pmap.entrySet());
		pmap.clear();
		System.out.println(pmap.size());
	}
	
	@Test
	public void test2() {
		PMap pmap = new PMap();
		pmap.put(1, "two");
		pmap.put(2, "one");
		pmap.put(3, "three");
		pmap.put(3, "LOL");
		System.out.println(pmap.size());
		Set<Integer> keys = pmap.keySet();
		for (Integer i : keys) {
			System.out.print(i + " ");
		}
		System.out.println();
		Collection<String> values = pmap.values();
		for (String i : values) {
			System.out.print(i + " ");
		}
		System.out.println(pmap.size());
		System.out.println(pmap.containsKey(new Integer(3)));
		System.out.println(pmap.get(new Integer(3)));
		System.out.println(pmap.remove(new Integer(3)));
		System.out.println(pmap.containsValue("LOL"));
		System.out.println(pmap.keySet());
		System.out.println(pmap.values());
		System.out.println(pmap.entrySet());
		pmap.clear();
		System.out.println(pmap.size());
		
	}

	// TODO add more test cases to test all implemented methods
}
