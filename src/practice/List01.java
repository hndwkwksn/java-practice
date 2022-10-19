package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();

		list1.add("りんご");
		list1.add("みかん");
		list1.add(1, "バナナ");

		list2.add(100);
		list2.add(50);
		list2.add(1,200);

		for(int i = 0; i < 3; i++) {
			System.out.println(i + "番目⇨" + list1.get(i));
		}

		for(int i = 0; i < 3; i++) {
			System.out.println(i + "番目⇨" + list2.get(i));
		}

		System.out.println(list1.contains("バナナ"));
		System.out.println(list1.contains("なし"));

		System.out.println("コレクションのサイズ : " + list1.size());
		
		list1.remove("バナナ");
		list2.remove(0);
	}

}
