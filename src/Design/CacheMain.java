package Design;

import java.util.List;
import java.util.Random;

public class CacheMain {

	public static void main(String[] args) {
		final CachedObjs<String> test = new CachedObjs<String>(1000 * 60 * 60) {
			@Override
			protected void populateCache(List<String> objects) {
				objects.clear();
				Random ra = new Random();
				for (int i = 0; i < 1000; i++) {
					objects.add(Integer.toBinaryString(ra.nextInt()));
				}
			}
		};
		List<String> cache = test.get(false);
		for (String str : cache) {
			System.out.println(str);
		}
	}
}
