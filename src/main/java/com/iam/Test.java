package com.iam;

import java.io.Serializable;

public class Test<T> implements Serializable{
    
    private T t;
    
    public Test(T t){
        this.t = t;
    }
    
    public T getT(){
        return t;
    }
    
    public void setT(T t){
        this.t = t;
    }
    
    public static void main(String[] args) {
        Test<String> test = new Test<String>("Hello");
        System.out.println(test.getT());
    }
}

