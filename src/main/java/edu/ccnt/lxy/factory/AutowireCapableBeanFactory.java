package edu.ccnt.lxy.factory;

import edu.ccnt.lxy.BeanDefinition;
import edu.ccnt.lxy.PropertyValue;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by LXY on 2017/10/20.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {           //通过该类实现注入bean的属性

    @Override
    public Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        try {
            Object bean = createBean(beanDefinition);
            applyPropertyValues(bean,beanDefinition);       //为bean注入属性
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Object createBean(BeanDefinition beanDefinition) throws IllegalAccessException, InstantiationException {
        return beanDefinition.getBeanClass().newInstance();
    }


    private void applyPropertyValues(Object bean,BeanDefinition beanDefinition) throws Exception {
        List<PropertyValue> propertyValueList = beanDefinition.getPropertyValues().getPropertyValues();
        for(PropertyValue propertyValue :propertyValueList){
            Field field = bean.getClass().getDeclaredField(propertyValue.getName());
            field.setAccessible(true);
            field.set(bean,propertyValue.getValue());
        }
    }
}
