package com.lgorithm;

/**
 * 利用异或、与，取反运算
 */
public class Xor {

    public static void main(String[] args) {
        int[] arrOne = { -1, 2, 3, 4, 10, 4, 3, 2, -1 };
        System.out.println(xorOne(arrOne));
        int[] arrTwo = { -1, 2, 3, 4, 10, 11, 4, 3, 2, -1 };
        System.out.println(xorTwo(arrTwo));

    }

    // 数组中仅有一个不同，其余均相同，找出不同的那一个| 异或，相同为0
    public static int xorOne(int[] arr) {
        int xor = 0;
        for (int i : arr) {
            xor = xor ^ i;
        }
        return xor;
    }

    public static String xorTwo(int[] arr) {

        int xorOne = xorOne(arr);

        // 取出最右边的那个1
        int rightOne = xorOne & (~xorOne + 1);

        int first = 0;
        int second = 0;
        for (int i : arr) {
            if ((i & rightOne) != 0) {
                first = first ^ i;
            }
        }
        second = first ^ xorOne;

        return "两个不同的数：" + first + ";" + second;

    }

}
