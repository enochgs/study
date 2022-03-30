package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Document/Element对象功能
 * 1. getElementsById(String id)：根据id属性值获取唯一的element对象
 * 2. getElementsByTag(String tagName)：根据标签名称获取元素对象集合
 * 3. getElementsByAttribute(String key)：根据属性名称获取元素对象集合
 * 4. getElementsByAttributeValue(String key, String value)：根据对应的属性名称和属性值获取元素对象集合
 */
public class JsoupDemo03 {
  public static void main(String[] args) throws IOException {
    //1获取student.xml的path.
    String path = JsoupDemo03.class.getClassLoader().getResource("student.xml").getPath();
    //2.获取Document对象
    Document document = Jsoup.parse(new File(path), "utf-8");
    //3.获取元素对象
    //3.1获取所有student对象  ----getElementsByTag(String tagName)
    Elements student = document.getElementsByTag("student");
    System.out.println(student);
    System.out.println("-----------------");

    //3.2获取属性名为id的元素对象们  ----getElementsByAttribute(String key)
    Elements elements1 = document.getElementsByAttribute("id");
    System.out.println(elements1);
    System.out.println("-----------------");
    //3.3获取 number属性值为heima_0001的元素对象  ----getElementsByAttributeValue(String key, String value)
    Elements elements2 = document.getElementsByAttributeValue("number", "heima_0001");
    System.out.println(elements2);
    System.out.println("-----------------");
    //3.4获取id属性值的元素对象
    Element itcast = document.getElementById("itcast");
    System.out.println(itcast);


  }
}
