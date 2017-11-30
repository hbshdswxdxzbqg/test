package com.algorithm.th31;

public class Euclid {

	/**
	 * �����Լ��
	 * 
	 * @param a
	 *            �Ǹ�����
	 * @param b
	 *            �Ǹ�����
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
