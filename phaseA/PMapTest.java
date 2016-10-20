/** Phase A <jtk764><ces3723>
 * Phase B <ces3723><jtk764>
 */
package pMap.phaseA;

import java.util.Arrays;

import org.junit.Test;

public class PMapTest {

	@Test
	public void test1() {
		PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		System.out.println(pmap.size());
		int[] keys = pmap.keys();
		for (int i : keys) {
			System.out.print(i+" ");
		}
		System.out.println();
		int[] values = pmap.values();
		for (int i : values) {
			System.out.print(i+" ");
		}
		System.out.println("\n" + pmap.size());
		System.out.println(pmap.isEmpty());
		System.out.println(pmap.containsKey(2));
		System.out.println(pmap.containsValue(3));
		System.out.println(pmap.get(2));
		System.out.println(pmap.isEmpty());
		System.out.println(pmap.remove(2));
		for(Entry i: pmap.entrys()) {
			System.out.println(i.toString());
		}
		pmap.putAll( new int[]{1, 2}, new int[]{3, 4});
		System.out.println(Arrays.toString(pmap.keys()) + "\n" + Arrays.toString(pmap.values()));
	}

	@Test
	public void test2() {
		PMap pmap = new PMap();
		pmap.put(3, 1);
		pmap.put(4, 2);
		pmap.put(5, 3);
		System.out.println(pmap.size());
		int[] keys = pmap.keys();
		for (int i : keys) {
			System.out.print(i+" ");
		}
		System.out.println();
		int[] values = pmap.values();
		for (int i : values) {
			System.out.print(i+" ");
		}
		System.out.println("\n" + pmap.size());
		System.out.println(pmap.isEmpty());
		System.out.println(pmap.containsKey(2));
		System.out.println(pmap.containsValue(3));
		System.out.println(pmap.get(2));
		System.out.println(pmap.isEmpty());
		System.out.println(pmap.remove(2));
		for(Entry i: pmap.entrys()) {
			System.out.println(i.toString());
		}
		pmap.putAll( new int[]{1, 2}, new int[]{3, 4});
		System.out.println(Arrays.toString(pmap.keys()) + "\n" + Arrays.toString(pmap.values()));
	}
}
