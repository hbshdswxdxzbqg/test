package com.algorithm.th31;

public class Euclid {

	/**
	 * 求最大公约数
	 * 
	 * @param a
	 *            非负整数
	 * @param b
	 *            非负整数
	 * @return
	 */
	public static int euclid(int a, int b) {
		if (a < 0 || b < 0) {
			return 0;
		}
		if (b == 0) {
			return a;
		} else {
			return euclid(b, a % b);
		}
	}

	public static void main(String[] args) {
		System.out.println(euclid(30, 21));
	}

}
