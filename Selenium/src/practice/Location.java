package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

    public static void main(String[] args) {
        location();

    }
    

    public  static void  location() {
        ChromeDriver chrome = null;
        try {
chrome= new ChromeDriver();
chrome.manage().window().maximize();
chrome.get("file:///C:/Users/HP/Desktop/Testig%20note/html%20program/sample1.html");
Thread.sleep(1000);
//Q:ab xpath .using AX find first password'?
            chrome.findElement(By.xpath("/html/body/form[1]/input[2]")).sendKeys("5555");
//================
//Q: Using AX find second username?
            chrome.findElement(By.xpath("/html/body/form[2]/input[1]")).sendKeys("aaaaaaaaaaaaa");


            //q:Using AX find second password?
            chrome.findElement(By.xpath("/html/body/form[@id=\"frm2\"]/input[2]")).sendKeys("megha");


            // Using AX fidn the second link?
            chrome.findElement(By.xpath("/html/body/a[@id='link2_id']")).click();
         chrome.close();

        } catch(Exception e){
            e.printStackTrace();
        }finally{
            chrome = null;
        }

    }
}