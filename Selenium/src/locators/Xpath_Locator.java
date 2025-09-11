package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {

    public static void main(String args[]){
        xpathLocator();
    }
    //xpath locator eample
    public static void xpathLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/HP/Desktop/Testig%20note/html%20program/sample1.html");

            //using xpath enter userName and password
         //   chrome.findElement(By.xpath("/html/body/form[@id='frm1']/input[@name='frm1_un_name']")).sendKeys("aaaaaaaaaaaaa");
          //  Thread.sleep(2000);
//using  ax find first password
           // chrome.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("aaaaaaaaaaaaa");

            // Using AX find second username?
          //  chrome.findElement(By.xpath("  /html/body/form[2]/input[1]")).sendKeys("aaaaaaaaaaaaa");

            //Using AX find second password?

            //chrome.findElement(By.xpath("  /html/body/form[2]/input[2]")).sendKeys("aaaaaaaaaaaaa");

           // Using AX fidn the second link?

           // chrome.findElement(By.xpath("  /html/body/a[2]")).sendKeys("aaaaaaaaaaaaa");
            //Q: first username


           // chrome.findElement(By.xpath("  //input")).sendKeys("aaaaaaaaaaaaa");
           // Q: first password

           // chrome.findElement(By.xpath(" //input[2]")).sendKeys("aaaaaaaaaaaaa");
           // Thread.sleep(1000);

        //first link
            //chrome.findElement(By.xpath(" //a")).click();

          //  Q: Enter value for first username?

//input[@id='frm1_un_id']
          //  c) using more than one attribute name and value


  //     chrome.findElement(By.xpath(" //<tagName>[@<attrName>='<attrValue>'][@<attrName>='<attrValue>']")).sendKeys("aaaaaaaaaaaaa");

           // Find the link which doesnot have target attribute?

           // chrome.findElement(By.xpath("//a[not(@target)]")).sendKeys("aaaaaa");
            chrome.findElement(By.xpath("(//input[@name='frm1_un_name'])[1]")).sendKeys("1111111111");
            Thread.sleep(2000);
            chrome.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}
