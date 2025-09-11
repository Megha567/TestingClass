package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCssSelector {
    public static void main (String[] args){
        CssSelector();
    }

    public static void CssSelector(){
        ChromeDriver chrome=null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();
           chrome.navigate().to("file:///C:/Users/HP/Desktop/Testig%20note/html%20program/sample1.html");
           chrome.findElement(By.cssSelector("form> input[@type=\"text\"]")).sendKeys("aaaa");
            //  chrome.findElement(By.cssSelector("form[id='frm1']>:first-child")).sendKeys("aaa");
        }catch(Exception e){
            e.printStackTrace();
        }finally{

        }


    }

}
