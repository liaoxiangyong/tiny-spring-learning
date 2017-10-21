package edu.ccnt.lxy.io;

import java.io.InputStream;

/**
 * Created by LXY on 2017/10/21.
 */
public interface Resource {     //资源类，标识一个外部资源，通过getInputStream获取资源的输入流
    InputStream getInputStream() throws Exception;
}
