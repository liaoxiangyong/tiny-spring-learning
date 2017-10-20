package edu.ccnt.lxy.factory;

import edu.ccnt.lxy.BeanDefinition;

/**
 * Created by LXY on 2017/10/20.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {           //通过该类实现注入bean的属性

    @Override
    public Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            Object bean = beanDefinition.getBeanClass().newInstance();
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
