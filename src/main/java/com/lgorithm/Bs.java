package com.lgorithm;

/**
 * 折半查找
 */
public class Bs {

    public static void main(String[] args) {
        // 有序，某个值是否存在
        int[] exArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 23 };
        System.out.println(BsExist(exArr, 1));

        // 有序，大于等于某个值最左的位置
        int[] leftArr = { 1, 2, 5, 5, 5, 5, 5, 8, 9, 23 };
        System.out.println(BsLeft(leftArr, 5));

        // 有序，小于等于某个值最右的位置
        int[] rightArr = { 1, 2, 5, 5, 5, 5, 5, 8, 9, 23 };
        System.out.println(BsRight(rightArr, 5));

        // 无序，区间最小
    }

    public static boolean BsExist(int[] arr, int dest) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) { // 左右游标不相等时
            int min = left + (right - left) / 2;
            if (arr[min] == dest) {
                return true;
            } else if (arr[min] < dest) { // 向右走
                left = min + 1;
            } else if (arr[min] > dest) {
                right = min - 1;
            }
        }
        // 左右右边相等时，再判断一次
        return arr[left] == dest;
    }

    public static int BsLeft(int[] arr, int dest) {

        int leftIndex = -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int min = left + (right - left) / 2;
            if (arr[min] >= dest) {
                leftIndex = min;
                right = min - 1;

            } else if (arr[min] < dest) { // 向右找
                left = min + 1;
            }
        }

        return leftIndex;
    }

    public static int BsRight(int[] arr, int dest) {
        int rightIndex = -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int min = left + (right - left) / 2;
            if (arr[min] <= dest) {
                rightIndex = min;
                left = min + 1;

            } else if (arr[min] > dest) { // 向左找
                right = min - 1;
            }
        }

        return rightIndex;
    }

    public static int BsMin(int[] arr) {
        int dest = 0;
        return dest;
    }

}
