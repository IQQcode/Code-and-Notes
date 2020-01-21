package org.iqqcode.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo {
    public static void main(String[] args) throws IOException {
        //1.获取Document对象,根据XML对象获取
        //获取student.xml的path(类名)
        String path = JsoupDemo.class.getClassLoader().getResource("user.xml").getPath();
        //2.解析xml文档,将文档加载如内存,获取DOM树
        Document document = Jsoup.parse(new File(path),"utf-8");
        //3.获取元素对象Element
        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());
        //获取第一个name的Element对象
        Element element = elements.get(0);
        //获取数据
        String name = element.text();
        System.out.println(name);
    }
}