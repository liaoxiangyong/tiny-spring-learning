package ccnt.lxy.test;

import edu.ccnt.lxy.BeanDefinition;
import edu.ccnt.lxy.factory.AutowireCapableBeanFactory;
import edu.ccnt.lxy.factory.BeanFactory;
import org.junit.Test;

/**
 * Created by LXY on 2017/10/20.
 */
public class BeanFactoryTest {

    @Test
    public void test() {
        //1、创建bean工厂
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        //2、注入bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("ccnt.lxy.test.HelloWorld");
        beanFactory.registerBean("HelloWorld",beanDefinition);

        //3、获取bean
        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("HelloWorld");
        helloWorld.helloWorld();
    }
}
