package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverView {

    public static void main(String[] args) {
        handleFrameTestcase1();
    }

    public static void handleFrameTestcase1() {
        WebDriver oBrowser = null;
        try {
            //1. open the "https://docs.oracle.com/javase/8/docs/api/"
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();
            oBrowser.navigate().to("https://docs.oracle.com/javase/8/docs/api/");
            //2. Read the main page title and URL.oBrowser.findElement(By.tagName("h1")).getText();
            System.out.println(oBrowser.getCurrentUrl());
            System.out.println(oBrowser.getTitle());

            //3 using index switch to 'Packages' frame and click on the "java.awt"
            oBrowser.switchTo().frame(0);
            oBrowser.findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();


            //4. go back to main page
            oBrowser.switchTo().defaultContent();
            //5. using name/id attribute switch to 'Interfaces' frame
            oBrowser.switchTo().frame("packageFrame");

            //click on the "ActiveEvent" link
            oBrowser.findElement(By.linkText("ActiveEvent")).click();
            Thread.sleep(2000);

            //7. go back to main page
            oBrowser.switchTo().defaultContent();

            //8using WebElement switch to 'Interface ActiveEvent' frame
            WebElement classFrame = oBrowser.findElement(By.name("classFrame"));
            oBrowser.switchTo().frame(classFrame);

            //9  // 9. Read the page header "Interface ActiveEvent"
                      String header = oBrowser.findElement(By.cssSelector("h2.title")).getText();
                        System.out.println("Page Header: " + header);

                        //            // 10. Go back to main page
                  oBrowser.switchTo().defaultContent();
            Thread.sleep(2000);
        }
            catch(Exception e)
      {
        e.printStackTrace();
    }
    finally

    {
        oBrowser = null;
    }
}}

