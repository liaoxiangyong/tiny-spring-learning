package ccnt.lxy.test.io;

import edu.ccnt.lxy.io.Resource;
import edu.ccnt.lxy.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by LXY on 2017/10/21.
 */
public class ResourceLoaderTest {

    @Test
    public void resourceTest() throws Exception {
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("tinyioc.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }
}
