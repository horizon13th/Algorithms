package Miscellaneous;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MaxConcurrentPool {

	public static void main(String[] args) {
		// n*4 2D-array
		Long[][] test = new Long[3][4];
		test[0][0] = 10000L;
		test[0][1] = 20000L;
		test[0][2] = 1411325674537L;
		test[0][3] = 1411325726830L;
		test[1][0] = 10001L;
		test[1][1] = 20001L;
		test[1][2] = 1411325632683L;
		test[1][3] = 1411325731213L;
		test[2][0] = 10002L;
		test[2][1] = 20000L;
		test[2][2] = 1411325508697L;
		test[2][3] = 1411325726810L;

		MaxConcurrentPool pool = new MaxConcurrentPool();
		Long id = pool.getMaxConcurrentPool(test);

		System.out.println("result:" + String.valueOf(id));
	}

	public Long getMaxConcurrentPool(Long[][] connections) {
		if (null == connections) {
			System.out.println("invalid input");
			return 0L;
		}

		// Two HashMaps:
		// MapTimeSegment: Key-id,Value-lists of time segments
		// MapMaxConcurrent: Key-id Value-its max concurrent
		Map<Long, List<Long[]>> mapTimeSegment = new HashMap<Long, List<Long[]>>();
		Map<Long, Long> mapMaxConcurrent = new HashMap<Long, Long>();

		for (int j = 0; j < connections.length; j++) {

			Long poolId = connections[j][1];
			List<Long[]> timeSegment = mapTimeSegment.get(poolId);
			Long count = mapMaxConcurrent.get(poolId);

			Long[] seg = new Long[3];
			seg[0] = connections[j][2];// start time
			seg[1] = connections[j][3];// end time
			seg[2] = 1L;// count

			if (null == count) {
				count = seg[2];
			}

			if (null == timeSegment) {
				timeSegment = new ArrayList<Long[]>();
				timeSegment.add(seg);
				mapTimeSegment.put(poolId, timeSegment);
				mapMaxConcurrent.put(poolId, count);
			} else {
				Long min = timeSegment.get(0)[0];
				Long max = timeSegment.get(timeSegment.size() - 1)[1];
				int minIndex = 0;
				int maxIndex = timeSegment.size();
				boolean complete = false;
				if (seg[1] == min) {
					timeSegment.add(0, seg);
					complete = true;
				}
				if (seg[1] < min) {
					Long[] seg_0 = new Long[3];
					seg_0[0] = seg[1];
					seg_0[1] = min;
					seg_0[2] = 0L;
					timeSegment.add(0, seg_0);
					timeSegment.add(0, seg);
					complete = true;
				}
				if (seg[0] == max) {
					timeSegment.add(timeSegment.size(), seg);
					complete = true;
				}
				if (seg[0] > max) {
					Long[] seg_0 = new Long[3];
					seg_0[0] = max;
					seg_0[1] = seg[0];
					seg_0[2] = 0L;
					timeSegment.add(seg_0);
					timeSegment.add(seg);
					complete = true;
				}
				if (seg[0] < min && seg[1] >= min) {
					Long[] seg_0 = new Long[3];
					seg_0[0] = seg[0];
					seg_0[1] = min;
					seg_0[2] = 1L;
					timeSegment.add(0, seg_0);
					minIndex += 1;
				}
				if (seg[1] > max && seg[0] <= max) {
					Long[] seg_0 = new Long[3];
					seg_0[0] = max;
					seg_0[1] = seg[1];
					seg_0[2] = 1L;
					timeSegment.add(seg_0);
				}
				int i = minIndex;
				while (i < maxIndex && !complete) {
					Long[] seg_cur = timeSegment.get(i);
					if (seg[0] <= seg_cur[0] && seg[1] >= seg_cur[1]) {
						seg_cur[2] += 1;
						count = (seg_cur[2] > count) ? seg_cur[2] : count;
						complete = (seg[0] == seg_cur[0] && seg[1] == seg_cur[1]) ? true : false;
					} else if (seg[0] > seg_cur[0] && seg[1] >= seg_cur[1]) {
						seg_cur[1] = seg[0];
						Long[] seg_1 = new Long[3];
						seg_1[0] = seg[0];
						seg_1[1] = seg_cur[1];
						seg_1[2] = seg_cur[2] + 1;
						count = (seg_1[2] > count) ? seg_1[2] : count;
						timeSegment.add(i + 1, seg_1);
						maxIndex += 1;
						i += 1;
					} else if (seg[0] <= seg_cur[0] && seg[1] < seg_cur[1]) {
						seg_cur[1] = seg[1];
						seg_cur[2] += 1;
						count = (seg_cur[2] > count) ? seg_cur[2] : count;
						Long[] seg_1 = new Long[3];
						seg_1[0] = seg[1];
						seg_1[1] = seg_cur[1];
						seg_1[2] = seg_cur[2];
						timeSegment.add(i + 1, seg_1);
						maxIndex += 1;
						i += 1;
					} else if (seg[0] > seg_cur[0] && seg[1] < seg_cur[1]) {
						seg_cur[1] = seg[0];
						seg[2] += seg_cur[2];
						count = (seg[2] > count) ? seg[2] : count;
						timeSegment.add(i + 1, seg);
						Long[] seg_1 = new Long[3];
						seg_1[0] = seg[1];
						seg_1[1] = seg_cur[1];
						seg_1[2] = seg_cur[2];
						timeSegment.add(i + 2, seg_1);
						complete = true;
					}
					i += 1;
				}
			}
		}

		Long maxCount = 0L;
		Long maxId = 0L;

		// scan all pairs in hashmap and get the final result
		for (Map.Entry<Long, Long> entry : mapMaxConcurrent.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxId = entry.getKey();
			}
		}

		return maxId;
	}

}
