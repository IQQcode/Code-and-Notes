package org.iqqcode.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.IOException;

/**
 * @Author: Mr.Q
 * @Date: 2020-01-21 14:24
 * @Description:Jsoup_选择器查询
 * @获取stu标签,并且获取 number--->001的 age子标签
 */
public class Jsoup_selector_Demo {
    public static void main(String[] args) throws IOException {
        //1.获取Document对象,根据XML对象获取
        //获取student.xml的path(类名)
        String path = Jsoup_selector_Demo.class.getClassLoader().getResource("stu.xml").getPath();
        //2.解析xml文档,将文档加载如内存,获取DOM树
        Document document = Jsoup.parse(new File(path), "utf-8");

        //获取stu标签number--->001的标签
        Elements elements = document.select("student[number=\"001\"]");
        System.out.println(elements);

        //获取stu标签下的 number--->001的 age子标签
        Elements ele = document.select("student[number=\"001\"] > age");
        System.out.println("\n**************************");
        System.out.println(ele);
    }
}
