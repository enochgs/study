package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Jsoup对象的parse静态方法
 * 1.parse(File in, String charsetName) ---重点掌握
 * 2.parse(String html)  ---了解，很少使用
 * 3.parse(URL url, int timeoutMillis)  ---要求掌握
 */
public class JsoupDemo02 {
  public static void main(String[] args) throws IOException {
    //2.1获取student.xml的path.
    String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
    //2.2解析xml文档，加载文档进内存，获取dom树--->Document对象(对应的)
    /*//第1个方法 parse(File in, String charsetName): 解析xml或html文件的。
    Document document = Jsoup.parse(new File(path), "utf-8");
    System.out.println(document);*/

    /*
    //第2个方法 parse(String html)：解析xml或html字符串。
    String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
          "\n" +
          "<students >\n" +
          "  <student number=\"heima_0001\">\n" +
          "    <name>tom</name>\n" +
          "    <age>55</age>\n" +
          "    <sex>male</sex>\n" +
          "  </student>\n" +
          "\n" +
          "  <student number=\"heima_0002\">\n" +
          "    <name>jack</name>\n" +
          "    <age>18</age>\n" +
          "    <sex>male</sex>\n" +
          "  </student>\n" +
          "\n" +
          "</students>";
    Document document = Jsoup.parse(str);
    System.out.println(document); //也能解析到内存，有document对象，就可以它获取元素对象了
*/
    //第3个方法  parse(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
    URL url = new URL("https://baike.baidu.com/item/jsoup/9012509?fr=aladdin");//代表网络中的一个资源
    Document document = Jsoup.parse(url, 100000);
    System.out.println(document);

  }
}
