package ccnt.lxy.test;

import edu.ccnt.lxy.BeanDefinition;
import edu.ccnt.lxy.PropertyValue;
import edu.ccnt.lxy.PropertyValues;
import edu.ccnt.lxy.factory.AutowireCapableBeanFactory;
import edu.ccnt.lxy.factory.BeanFactory;
import org.junit.Test;

/**
 * Created by LXY on 2017/10/20.
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception {
        //1、创建bean工厂
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        //2、定义bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("ccnt.lxy.test.HelloWorld");

        //3、bean属性注入
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.applyPropertyValues(new PropertyValue("age", 555));
        propertyValues.applyPropertyValues(new PropertyValue("name", "小黄"));
        beanDefinition.setPropertyValues(propertyValues);


        //4、生成bean
        beanFactory.registerBean("helloWorldService", beanDefinition);

        //5、获取bean
        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloWorldService");
        helloWorld.helloWorld();
    }
}
