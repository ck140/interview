package com.sort;

import java.util.Arrays;

/**
 * Created by ck140 on 2018/4/17.
 */
public class InsertSort {
    public static void main(String[] args){
        int[] a= new int[]{3,5,4,1,6,2};
        new InsertSort().insertSort(a);
        System.out.println(Arrays.toString(a));
    }
    public void insertSort(int[] a){
        int i,j;
        for (i=1;i<a.length;i++){
            for(j=i;j>0&&a[j]<a[j-1];j--){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
    }
}
