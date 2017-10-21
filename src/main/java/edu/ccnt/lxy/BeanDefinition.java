package edu.ccnt.lxy;

/**
 * Created by LXY on 2017/9/15.
 */
public class BeanDefinition {       //bean定义类

    private Object bean;        //bean

    private Class beanClass;        //bean所属的类

    private String beanClassName;   //bean的类名

    private PropertyValues propertyValues = new PropertyValues();      //bean的属性

    public BeanDefinition() {
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName){
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);      //通过类名将所属类别也赋值
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
