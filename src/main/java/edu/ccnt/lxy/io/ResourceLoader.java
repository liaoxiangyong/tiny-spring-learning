package edu.ccnt.lxy.io;

import edu.ccnt.lxy.BeanDefinition;

import java.net.URL;
import java.util.Map;

/**
 * Created by LXY on 2017/10/21.
 */
public class ResourceLoader {       //资源加载类
    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
