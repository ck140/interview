package com.datastructure;

public class MyStack {
    private Object[] stack;
    private int size;
    private int top;

    public MyStack(int size){
        this.size = size;
        stack = new Object[size];
        top = -1;
    }

    public boolean push(Object object){
        if(top<size-1){
            stack[++top] = object;
            return true;
        }else
            return false;
    }

    public Object pop(){
        if(top>-1){
            Object temp = stack[top];
            stack[top] = null;
            return temp;
        }else {
            return null;
        }
    }

    public Object peek(){
        if(top>-1){
            return stack[top];
        }else return null;
    }

    public boolean isFull(){
        if(top==size-1){
            return true;
        }else return false;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else return false;
    }
}
