package ccnt.lxy.test;

import edu.ccnt.lxy.BeanDefinition;
import edu.ccnt.lxy.PropertyValue;
import edu.ccnt.lxy.PropertyValues;
import edu.ccnt.lxy.factory.AutowireCapableBeanFactory;
import edu.ccnt.lxy.factory.BeanFactory;
import edu.ccnt.lxy.io.ResourceLoader;
import edu.ccnt.lxy.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * Created by LXY on 2017/10/20.
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception {
        //1、读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

        //2、装配bean
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBean(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        // 3.获取bean
        HelloWorld helloWorldService = (HelloWorld) beanFactory.getBean("helloWorld");
        helloWorldService.helloWorld();
    }
}
