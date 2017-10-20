import org.junit.Test;

/**
 * Created by LXY on 2017/10/20.
 */
public class BeanFactoryTest {

    @Test
    public void test() {
        //1、初始化bean
        HelloWorld helloWorld = new HelloWorld();
        BeanDefinition beanDefinition = new BeanDefinition(helloWorld);

        //2、注入bean
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService",beanDefinition);

        //3、获取bean
        HelloWorld helloWorld1 =(HelloWorld) beanFactory.getBean("helloService");
        helloWorld.helloWorld();
    }
}
