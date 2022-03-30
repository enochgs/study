package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.soap.Name;
import java.io.File;
import java.io.IOException;

/**
 * Element对象功能
 * 1. 获取子元素对象
 *
 *    1. getElementsById(String id)：根据id属性值获取唯一的element对象
 *    2. getElementsByTag(String tagName)：根据标签名称获取元素对象集合
 *    3. getElementsByAttribute(String key)：根据属性名称获取元素对象集合
 *    4. getElementsByAttributeValue(String key, String value)：根据对应的属性名称和属性值获取元素对象集合
 *
 * 2. 获取属性值
 *
 *    String attr(String key)：根据属性名称获取属性值
 *
 * 3. 获取文本内容
 *
 *    1. String text()：获取所有子标签的纯文本内容
 *    2. String html()：获取标签体的所有的内容(包括字符标签中的字符串内容)
 */
public class JsoupDemo04 {
  public static void main(String[] args) throws IOException {
    //获取student.xml的path.
    String path = JsoupDemo04.class.getClassLoader().getResource("student.xml").getPath();
    //获取Document对象
    Document document = Jsoup.parse(new File(path), "utf-8");
    //通过document对象获取name标签，获取所有的name标签，本文档可获取2个
    Elements elements = document.getElementsByTag("name");
    System.out.println(elements.size());
    System.out.println("----------------------");

    //通过Element对象获取子标签对象--------1. 获取子元素对象
    Element element_student = document.getElementsByTag("student").get(0);
    Elements ele_name = element_student.getElementsByTag("name");
    System.out.println(ele_name.size());
    System.out.println("----------------------");

    //获取student对象的属性值--------2. String attr(String key)：根据属性名称获取属性值
    String number = element_student.attr("number");
    System.out.println(number);
    System.out.println("----------------------");

    //获取文本内容
    String text = ele_name.text();
    String html = ele_name.html();
    System.out.println(text);//子标签中所有纯文本内容
    System.out.println(html);//把子标签也输出了
  }
}
