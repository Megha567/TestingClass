package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginandLogout {
    public static void main(String[] args) {
        loginTestCase();
    }
    public static void loginTestCase() {
        ChromeDriver chrome = null;
        try {
            //1. Open chrome browser
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();


            //2. navigate the actiTime URL (wait for page to load)
            chrome.get("file:///C:/Users/HP/Desktop/Testig%20note/html%20program/sample1.html");
            Thread.sleep(2000);


            //3. enter user name
            chrome.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");


            //4. enter password
            chrome.findElement(By.name("pwd")).sendKeys("manager");


            //5. click on Login button (wait for page to load)
            chrome.findElement(By.cssSelector("a[id='loginButton'] div")).click();
            Thread.sleep(2000);


            //6. Verify login is successful
            String text = chrome.findElement(By.xpath("//td[@class='pagetitle']")).getText();
            if(text.equalsIgnoreCase("Enter Time-Track")) {
                System.out.println("Login to ActiTime is successful");
            }else {
                System.out.println("Failed to login to actiTime");
                return;
            }


            //7. Logout from actiTime (wait for page to load)
            chrome.findElement(By.xpath("//a[@id='logoutLink']")).click();
            Thread.sleep(2000);


            //8. Verify logout successful
            if(chrome.findElement(By.xpath("//tbody/tr/td[@id='logoContainer']/div/img[1]")).isDisplayed()) {
                System.out.println("Logout from actiTime is succesful");
            }else {
                System.out.println("FAiled to logout from actiTime");
                return;
            }



        }catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            chrome = null;
        }
    }
}