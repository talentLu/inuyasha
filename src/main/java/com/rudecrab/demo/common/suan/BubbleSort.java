package com.rudecrab.demo.common.suan;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/3/15 18:02
 **/
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int a,int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {23, 43, 234, 23542, 432, 5423};
        bubbleSort(arr);
        for(int a:arr) {
            System.out.print(a + " ");
        }

    }
}
