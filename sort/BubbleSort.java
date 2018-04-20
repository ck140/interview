package com.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by ck140 on 2018/3/26.
 */
 
public class BubbleSort1 {
    public static void main(String[] args){
        int[] a = {9,1,2,3,4};
        bubbleSort(a);
        System.out.println("-----------------***-------");
        a = new int[]{9,2,1,4,5};
        bubbleSortFinal(a);

        a = new int[]{1,2,3,6,5,8,7,9};
        bubbleSortFinally(a);
    }

    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j+1] = tmp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }

    public static void bubbleSortFinal(int[] a){
        boolean sorted = true; //用以判断是否有序
        for(int i = 0;i<a.length-1;i++){
            sorted = true;
            for(int j = 0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    sorted = false;
                }
            }
            if(sorted){
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSortFinally(int[] a){
        int j,k;
        int flag;

        flag = a.length;

        while(flag>0){
            k=flag;
            flag = 0;
            for (j=0;j<k-1;j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = j;
                    System.out.println(flag);
                    System.out.println(Arrays.toString(a));
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
