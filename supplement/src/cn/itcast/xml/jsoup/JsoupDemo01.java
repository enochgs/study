package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.IOException;
/**
 * Jsoup快速入门
 */
public class JsoupDemo01 {
  //1.写main方法
  public static void main(String[] args) throws IOException {
    //2.获取Document对象，根据xml文档获取
    /*2.1获取student.xml的path.  通过JsoupDemo01.class获取字节码文件对象，通过getClassLoader()获取类加载器，
        通过getResource("student.xml")来找到student.xml的资源位置，通过getPath()获取到它的字符串表示形式的对象
      */
    String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
    //Jsoup的parse静态方法，接受文件对象，和字符编码
    //2.2解析xml文档，加载文档进内存，获取dom树--->Document对象(对应的)
    Document document = Jsoup.parse(new File(path), "utf-8");
    //3.获取元素对象 Element
    Elements elements = document.getElementsByTag("name");
    System.out.println(elements.size());
    //3.1获取第一个name的Element对象
    Element element = elements.get(0);
    //3.2获取数据
    String name = element.text();
    System.out.println(name);

  }
}
