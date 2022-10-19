package practice;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set01 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		set1.add("スイカ");
		set1.add("メロン");

		set2.add(1);
		set2.add(2);

		//Setは要素を特定する概念がない　⇨　値を取得できない

		System.out.println(set1.contains("スイカ"));

		System.out.println("set1.size : " + set1.size());

		set1.remove("スイカ");
		System.out.println(set1.contains("スイカ"));
	}

}
