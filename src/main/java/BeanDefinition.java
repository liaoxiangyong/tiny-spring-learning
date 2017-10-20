/**
 * Created by LXY on 2017/9/15.
 */
public class BeanDefinition {       //bean定义类

    private Object bean;        //bean

    private Class beanClass;        //bean所属的类

    private String beanClassName;   //bean的类名

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
