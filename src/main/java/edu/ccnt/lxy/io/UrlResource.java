package edu.ccnt.lxy.io;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by LXY on 2017/10/21.
 */
public class UrlResource implements Resource {      //从url获取资源

    private final URL url;

    public UrlResource(URL url){        //构建URLResource资源对象
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws Exception {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        InputStream inputStream = urlConnection.getInputStream();
        return inputStream;
    }
}
