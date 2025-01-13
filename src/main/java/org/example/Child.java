package org.example;

import org.example.Parent;

public class Child extends Parent {
    private int value = 20; // 子类也有一个同名的私有属性

    // 重写父类的setValue方法
    @Override
    public void setValue(int value) {
//        super.setValue(value); // 调用父类的setValue方法
        this.value = value; // 同时设置子类的私有属性
    }

    @Override
    public int getValue() {

        return value;
    }


}