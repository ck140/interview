package com.datastructure;


public class MyArray {
    Object[] array;
    int size; //数组最大长度
    int length; //数组实际长度

    public MyArray(){
        size = 50;
        array = new Object[size];
        length = 0;
    }

    public MyArray(int size){
        this.size = size;
        array = new Object[size];
        length = 0;
    }

    public int getLength(){
        return length;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.print(" "+array[i]);
        }
    }

    public int search(Object object){
        for(int i=0;i<length;i++){
            if (array[i]==object){
                return i;
            }
        }
        return -1;
    }
    public boolean add(Object object){
        if (length >= size){
            return false;
        }else{
            array[length]=object;
            length++;
            return true;
        }
    }
    public boolean delete(Object object){
        boolean flag = false;
        for(int i=0;i<=length;i++){
            if(array[i]==object){
                for(int j=i;j<length;j++){
                    array[j]=array[j+1];
                }
                flag = true;
                array[length] = null;
                length--;
            }
        }
        return flag;
    }
}
