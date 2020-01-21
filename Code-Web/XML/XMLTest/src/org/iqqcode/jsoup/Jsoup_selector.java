package org.iqqcode.jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Mr.Q
 * @Date: 2020-01-21 14:17
 * @Description:选择器查询
 */
public class Jsoup_selector {
    public static void main(String[] args) throws IOException {
        //1.获取Document对象,根据XML对象获取
        //获取student.xml的path(类名)
        String path = Jsoup_selector.class.getClassLoader().getResource("stu.xml").getPath();
        //2.解析xml文档,将文档加载如内存,获取DOM树
        Document document = Jsoup.parse(new File(path), "utf-8");

        //查询 name标签
        Elements elements = document.select("name");
        System.out.println(elements);

        //查询id值为 xml01的元素
        Elements ele = document.select("#xml01");
        System.out.println("\n**************************");
        System.out.println(ele);
    }
}
