package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Relative_Locator {

public static void main(String[] args){

    realtivelocator();
}
public static void realtivelocator() {
    ChromeDriver chrome = null;

    try {
    chrome=new ChromeDriver();
    chrome.manage().window().maximize();
    chrome.get("file:///C:/Users/HP/Desktop/Testig%20note/html%20program/sample1.html");
    //chrome.findElement(By.xpath("//input[contains(@id, 'm1_un_id')]")).sendKeys("555");
    //chrome.findElement(By.xpath("//input[@id='frm1_un_id']/following-sibling::input[1]")).sendKeys("kkkk");

    //String text= chrome.findElement(By.xpath("//td[text()='Abdul Kalam']/following-sibling::td[1]")).getText();
    //System.out.println(text);

        //chrome.findElement(By.xpath("//input[@id='frm1_un_id']/following::input[1]")).sendKeys("2222");

      //  chrome.findElement(By.xpath(" //pre[contains(text(), 'Three')]/following::input[1]")).sendKeys("2222");
     //String text=   chrome.findElement(By.xpath("//td[text()='Abdul Kalam']/following::tr[1]/td[1]")).getText();
       // System.out.println(text);


       // String text=   chrome.findElement(By.xpath("//td[text()='Indian Scientist']/preceding-sibling::td[1]")).getText();
       // System.out.println(text);

        //String text=   chrome.findElement(By.xpath("//td[text()='RAICHUR']/preceding-sibling::td[1]")).getText();
        // System.out.println(text);

       // String text=   chrome.findElement(By.xpath("//td[text()='Narendra Modi']/preceding::tr[1]/td[1]")).getText();
       // System.out.println(text);

         // chrome.findElement(By.xpath("//input[@id='frm1_ok_id']/preceding::input[1]")).sendKeys("lll");


        // String text=   chrome.findElement(By.xpath("//input[@id='frm1_un_id']/ancestor::form\n")).getDomAttribute("id");
        // System.out.println(text);

      //  String text=   chrome.findElement(By.xpath("//td[text()='Smruthi Irani']/ancestor::table")).getDomAttribute("id");
      //  System.out.println(text);


       // String text=   chrome.findElement(By.xpath("//body/descendant::input[1]\n")).getDomAttribute("id");
       //  System.out.println(text);

       // String id=   chrome.findElement(By.xpath("//body/descendant::td[text()='AbdulKalam']")).getDomAttribute("id");
       // System.out.println(id);

      //  String text=   chrome.findElement(By.xpath("//tbody/parent::table")).getDomAttribute("id");
       // System.out.println(text);


       // String text=   chrome.findElement(By.xpath("//input[@id='frm1_un_id']/parent::form")).getDomAttribute("id");
      //  System.out.println(text);
    } catch (Exception e) {
        e.printStackTrace();
    } finally {

    }
}}


