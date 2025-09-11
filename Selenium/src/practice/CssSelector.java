package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class CssSelector {
    public static void main(String[] args) {
        xpathLocator();
    }

    public static void xpathLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/HP/Desktop/Testig%20note/html%20program/sample1.html");

            //using cssSelector enter userName and password
           // chrome.findElement(By.cssSelector("html body form input")).sendKeys("aaaaaaaaa");
           // chrome.findElement(By.cssSelector("html body form[id='frm1'] input")).sendKeys("aaaaaaaaa");
           // chrome.findElement(By.cssSelector("html body form[id='frm2'] input[id='frm1_un_id']")).sendKeys("aaaaaaaaa");
           // chrome.findElement(By.cssSelector("html body form[id='frm2'] input[id='frm1_pwd_id']")).sendKeys("aaaaaaaaa");
          //  chrome.findElement(By.cssSelector("input")).sendKeys("aaaaaaaaa");
           // chrome.findElement(By.cssSelector("a")).sendKeys("aaaaaaaaa");
            //chrome.findElement(By.cssSelector("input[name='frm1_un_name']")).sendKeys("aaaaaaaaa");
           // chrome.findElement(By.cssSelector("input[name='frm1_un_name'][type='text']")).sendKeys("aaaaaaaaa");
           // chrome.findElement(By.cssSelector("a:not([target])")).sendKeys("aaaaaaaaa");
            //chrome.findElement(By.cssSelector("input[id^='frm1_un_i']")).sendKeys("aaaaaaaaa");
            //chrome.findElement(By.cssSelector("input[id^='frm1_pwd_i']")).sendKeys("aaaaaaaaa");
          //  chrome.findElement(By.cssSelector("input[id$='1_un_id']")).sendKeys("aaaaaaaaa");
           // chrome.findElement(By.cssSelector("form[id='frm1']>input[id*='1_un_id']")).sendKeys("aaaaaaaaa");
           // chrome.findElement(By.cssSelector("form[id='frm1']>input[id='frm1_un_id']")).sendKeys("aaaaaaaaa");
          // chrome.findElement(By.cssSelector("form[id='frm1']>:first-child")).sendKeys("KKKKK");
           //chrome.findElement(By.cssSelector("form[id='frm1']>:nth-child(4)")).sendKeys("aaaaaaaaaa");


            //Identify the username by traversing left direction from the password element. toleftof
           // chrome.findElement(RelativeLocator.with(By.tagName("input"))
               //     .toLeftOf(By.xpath("//input[@id='frm1_pwd_id']"))).sendKeys("aaaaaaaaa");


            //Q: Identify the username by traversing left direction from the password element torightof
            //chrome.findElement(RelativeLocator.
                   // with(By.tagName("input"))
                //    .toRightOf(By.xpath("//input[@id='frm1_un_id']"))).sendKeys("aaaaaaaaa");

                    ///above

           // chrome.findElement(RelativeLocator.
                 //   with(By.tagName("input")).
                  //  above(By.xpath("//input[@id='frm1_ok_id']"))).sendKeys("aaaaaaaaa");


            ///below
           // chrome.findElement(RelativeLocator.
                //    with(By.xpath("//input[1]")).
                //    below(By.xpath("//pre/b[contains(text(), 'Four')]"))).sendKeys("aaaaaaaaa");


            chrome.findElement(RelativeLocator.
                    with(By.xpath("//input[1]")).
                    near(By.xpath("//pre/b[contains(text(), 'Four')]"))).sendKeys("aaaaaaaaa");

            Thread.sleep(2000);

            chrome.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
}

    }}