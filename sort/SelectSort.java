package com.sort;

import java.util.Arrays;

/**
 * Created by ck140 on 2018/4/17.
 */
public class SelectSort {
    public static void main(String[] args){
        int[] a = new int[]{2,1,8,7,9,4,6};
        new SelectSort().selectSort(a);
        System.out.println(Arrays.toString(a));
    }
    public void selectSort(int[] a){
        int i,j,min;
        for(i=0;i<a.length;i++){
            min = a[i];
            for(j=i+1;j<a.length;j++) {
                if (a[j] < min){
                    min = a[j];
                    a[j]=a[i];
                    a[i]=min;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
