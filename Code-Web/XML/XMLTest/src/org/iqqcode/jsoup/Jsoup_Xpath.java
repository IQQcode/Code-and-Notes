package org.iqqcode.jsoup;


import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Author: Mr.Q
 * @Date: 2020-01-21 14:56
 * @Description:XPath查询
 */
public class Jsoup_Xpath {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //1.获取Document对象,根据XML对象获取
        //获取student.xml的path(类名)
        String path = Jsoup_Xpath.class.getClassLoader().getResource("stu.xml").getPath();
        //2.解析xml文档,将文档加载如内存,获取DOM树
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.根据Document创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        //4.结合xpath语法查询
        // **查询所有student标签
        System.out.println("\n*-*-*-*-*-查询所有student标签*-*-*-*-*-*-");
        List<JXNode> jxNodeList = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodeList) {
            System.out.println(jxNode);
        }

        System.out.println("\n*-*-*-*-*-查询所有student标签下的name标签*-*-*-*-*-*-");
        // **查询所有student标签下的name标签
        List<JXNode> jxNodeList1 = jxDocument.selN("//student/name");
        for (JXNode jxNode : jxNodeList1) {
            System.out.println(jxNode);
        }

        System.out.println("\n*-*-*-*-*-查询student标签下带有 id属性的name标签*-*-*-*-*-*-");
        // **查询student标签下带有 id属性的name标签
        List<JXNode> jxNodeList2 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodeList2) {
            System.out.println(jxNode);
        }

        System.out.println("\n*-*-*-*查询student标签下带有 id属性的name标签,id属性值为xml01-*-*-*-");
        // **查询student标签下带有 id属性的name标签,id属性值为xml01
        List<JXNode> jxNodeList3 = jxDocument.selN("//student/name[@id='xml02']");
        for (JXNode jxNode : jxNodeList3) {
            System.out.println(jxNode);
        }
    }
}
