package edu.ccnt.lxy;

import edu.ccnt.lxy.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LXY on 2017/10/21.
 */
public abstract class AbstractBeanDefinitionReader implements  BeanDefinitionReader{

    private Map<String,BeanDefinition> registry;        //保存资源文件中的类

    private ResourceLoader resourceLoader;      //类加载器

    public AbstractBeanDefinitionReader(ResourceLoader resourceLoader){
        this.registry = new HashMap<String, BeanDefinition>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
