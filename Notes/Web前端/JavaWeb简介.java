Jquery:  派生的JS库

1.导入js库；

2.提供页面载入事件$(function(){ })；

3.确定具体的事件(单击点击click)


***************************        JavaWeb简介               *********************

     B/S结构：浏览器端和服务器端的交互

     B/S系统特点：

     1)  分布式  
                    --->  中间件(俩个独立的系统间可以互相通信)

                               MQ (Message消息队列)--->
                                      Hadoop里的消息总线
                                      ActiveMQ
                                      RabbitMQ

                               Solr：索引库(将数据库的信息导入到索引库)

                               Redis：缓存技术
     2)  高并发
                 使用http服务器集群(集群搭建)
                    
     3)  海量数据
     4)  负载均衡-高可用
                         Nginx服务器

     5)  基于面向服务架构：SOA(大型电商系统)



 JavaWeb:

一、xml： 可拓展标记语言
                      特点：
                           a.结构严瑾;
                           b.标签必须成对出现;
                           c.作为配置文件使用 ssh，ssm(xml文件)

   xml的解析：
              DOM解析： 基于面向对象编程的思想
              SAX解析： 基于事件编程的思想
              JSON解析：


   xml的语法规则：
                1.标签必须成对出现
                2.标签中出现冒号(名称空间：没有定义不能使用)
                   名称空间：xml的schema约束


二、项目管理工具

Ant

Maven

Gradle