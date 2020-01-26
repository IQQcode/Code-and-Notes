package org.iqqcode.jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

/**
 * @Author: Mr.Q
 * @Date: 2020-01-20 22:04
 * @Description:
 */
public class JsoupObject_parse_String {
    public static void main(String[] args) throws IOException {
        //1.获取Document对象,根据XML对象获取
        //获取student.xml的path
        String path = JsoupDemo.class.getClassLoader().getResource("user.xml").getPath();
        //2.解析xml文档,将文档加载如内存,获取DOM树
       //parse(String html): 解析xml或html字符串
        String str="<?xml version=\"1.0\"encoding=\"UTF-8\"?>\n"+
                "\n"+
                "<students>\n"+
                "\t<student number=\"heima_e0e1\">\n"+
                "\t\t<name>tom</name>\n"+
                "\t\t<age>18</age>\n"+
                "\t\t<sex>male</sex>\n"+
                "\t</student>\n"+
                "\t<student number=\"heima_0002\">\n"+
                "\t\t<name>jack</name>\n"+
                "\t\t<age>18</age>\n"+
                "\t\t<sex>female</sex>\n"+
                "\t</student>\n"+
                "\n"+
                "</students>";
        //获取元素对象
        Document document = Jsoup.parse(str);
        System.out.println(document);
    }
}
