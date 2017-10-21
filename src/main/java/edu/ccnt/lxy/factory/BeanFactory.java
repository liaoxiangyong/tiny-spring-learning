package edu.ccnt.lxy.factory;

import edu.ccnt.lxy.BeanDefinition;

/**
 * Created by LXY on 2017/10/20.
 */
public interface BeanFactory {
    //获取bean
    Object getBean(String beanName);

    //注册bean
    void registerBean(String beanName, BeanDefinition beanDefinition) throws Exception;
}
