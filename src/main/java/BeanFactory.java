import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by LXY on 2017/10/20.
 */
public class BeanFactory {      //bean容器

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    //获取bean
    public Object getBean(String beanName){
        return beanDefinitionMap.get(beanName).getBean();
    }

    //注册bean
    public void registerBean(String beanName,BeanDefinition beanDefinition){
        beanDefinitionMap.put(beanName,beanDefinition);
    }
}
