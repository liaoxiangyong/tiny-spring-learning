package ccnt.lxy.test.xml;

import edu.ccnt.lxy.AbstractBeanDefinitionReader;
import edu.ccnt.lxy.BeanDefinition;
import edu.ccnt.lxy.BeanDefinitionReader;
import edu.ccnt.lxy.io.ResourceLoader;
import edu.ccnt.lxy.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * Created by LXY on 2017/10/21.
 */
public class XmlBeanDefinitionReaderTest {

    @Test
    public void test() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();

    }
}
