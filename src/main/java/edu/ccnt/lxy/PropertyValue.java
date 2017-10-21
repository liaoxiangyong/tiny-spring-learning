package edu.ccnt.lxy;

/**
 * Created by LXY on 2017/10/20.
 */
public class PropertyValue {        //bean的属性，String,Object

    private String name;        //属性名

    private Object value;   //对应的属性值

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
