package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.rmi.Naming;

/**
 * 选择器查询
 */
public class JsoupDemo05 {
  public static void main(String[] args) throws IOException {
    //1.获取student.xml的path.
    String path = JsoupDemo05.class.getClassLoader().getResource("student.xml").getPath();
    //2.获取Document对象
    Document document = Jsoup.parse(new File(path), "utf-8");
    //3.查询name标签
    /*
        div{
          这是css标签选择器的写法，java是直接把标签名写进去即可
        }
     */
    Elements elements = document.select("name");
    System.out.println(elements);
    System.out.println("------------------------------");


    //4.查询id值为itcast的元素
    /*
        #itcast{
            这是css类选择器的写法，java是直接把 #itcast 写进去即可
          }
     */
    Elements elements1 = document.select("#itcast");
    System.out.println(elements1);
    System.out.println("------------------------------");

    //5.获取student标签并且number属性值为heima_0001的age子标签
    //5.1获取获取student标签并且number属性值为heima_0001
    Elements elements2 = document.select("student[number='heima_0001']");
    System.out.println(elements2);
    System.out.println("------------------------------");
    //5.2获取获取student标签并且number属性值为heima_0001的子标签
    Elements elements3 = document.select("student[number='heima_0001']>age");
    System.out.println(elements3);
  }
}
