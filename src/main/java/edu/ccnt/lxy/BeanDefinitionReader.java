package edu.ccnt.lxy;

/**
 * Created by LXY on 2017/10/21.
 */
public interface BeanDefinitionReader {     //解析类资源文件的接口

    void loadBeanDefinitions(String location) throws Exception;
}
