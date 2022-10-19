package practice;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Map01 {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();

		map1.put(0, "ぶどう");
		map1.put(3, "もも");

		map1.put(0, "マスカット");

		for(int i = 0; i < 4; i++) {
			System.out.println(map1.get(i));
		}

		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("もも"));

		System.out.println("map1.size : " + map1.size());
	}

}
