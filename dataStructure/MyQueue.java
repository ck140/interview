package com.datastructure;

public class MyQueue {
    private Object[] queue;
    private int size;
    private int front;
    private int rear;
    private int length;

    public MyQueue(int size){
        this.size = size;
        queue = new Object[size];
        front = 0;
        rear = -1;
        length = 0;
    }
    public boolean isEmpty(){
        if(length == 0){
            return true;
        }else return false;
    }

    public boolean isFull(){
        if (length==size){
            return true;
        }else return false;
    }

    public boolean add(Object object){
        if(length==size){
            return false;
        }else{
            rear = (++rear)%size;
            queue[rear]=object;
            length++;
            return true;
        }
    }

    public boolean remove(){
        if(length==0){
            return false;
        }else{
            queue[front] =null;
            front = (++front)%size;
            length--;
            return true;
        }
    }
}
