package edu.ccnt.lxy.factory;

import edu.ccnt.lxy.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by LXY on 2017/10/20.
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    @Override
    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();

    }

    @Override
    public void registerBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(beanName,beanDefinition);
    }

    public abstract Object doCreateBean(BeanDefinition beanDefinition);      //完成bean的实例化
}
