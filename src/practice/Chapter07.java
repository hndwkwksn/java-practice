package practice;

import java.util.Random;

public class Chapter07 {

	public static void main(String[] args) {
		Random rand = new Random();
		int dis = rand.nextInt(20);

		if(dis <= 5) {
			System.out.println(dis + "kmはとても近いです。");
		} else if(dis <= 10) {
			System.out.println(dis + "kmは近いです。");
		} else if(dis <= 15) {
			System.out.println(dis + "kmは遠いです。");
		} else {
			System.out.println(dis + "kmはとても遠いです。");
		}
	}

}
