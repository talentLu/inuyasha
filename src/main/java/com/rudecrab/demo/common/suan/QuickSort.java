package com.rudecrab.demo.common.suan;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/8/31 15:51
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {23, 43, 234, 2342, 432, 5423,3,43,51,6,19};
        quickSort(arr,0,arr.length-1);
        for(int a:arr) {
            System.out.print(a + " ");
        }
    }

    private static void quickSort(int[] arr,int low ,int high) {
        int key;
        if (low < high) {
            key =  split(arr,low,high);
            quickSort(arr,low,key);
            quickSort(arr,key+1,high);
        }
    }

    private static int split(int[] arr, int low, int high) {
        int temp = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= temp) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= temp) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }

}
