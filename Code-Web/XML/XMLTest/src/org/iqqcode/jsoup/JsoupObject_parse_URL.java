package org.iqqcode.jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.net.URL;

/**
 * @Author: Mr.Q
 * @Date: 2020-01-20 22:13
 * @Description:
 */
public class JsoupObject_parse_URL {
    public static void main(String[] args) throws IOException {
        //1.获取Document对象,根据xml对象获取
        //获取student.xml的path
        String path = JsoupDemo.class.getClassLoader().getResource("user.xml").getPath();
        //2.解析xml文档,将文档加载如内存,获取DOM树
        //parse(URL url,int timeoutMillins):通过网络路径获取指定的html或xml的文档对象
        URL url = new URL("https://baike.sogou.com/v63211637.htm?fromTitle=jsoup");
        Document doc = Jsoup.parse(url,10000);
        System.out.println(doc);
    }
}
