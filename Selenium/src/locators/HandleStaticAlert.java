package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandleStaticAlert {

    public static void main(String[] args) {
        //handleStaticAlert();
        //  handleStaticConfirmAlert();
        //  handleStaticPromptAlert();
        // handleChildWindow();
        //   handleDynamicAlert();
        handleChildWindow1();
    }

    public static void handleStaticAlert() {
        WebDriver oBrowser = null;
        try {
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("file:///C:/Users/HP/Desktop/Testig%20note/html%20program/Sample2.html");
            Thread.sleep(2000);

            //Click the 'alertBtn'
            oBrowser.findElement(By.xpath("//input[@id='btn_id1']")).click();
            Thread.sleep(1000);
            Alert oAlert = oBrowser.switchTo().alert();
            System.out.println(oAlert.getText());
            oAlert.accept();

            Thread.sleep(2000);
            oBrowser.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser = null;
        }
    }


    //Static confirm alert handling
    public static void handleStaticConfirmAlert() {
        WebDriver oBrowser = null;
        try {
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("file:///C:/Users/HP/Desktop/Testig%20note/html%20program/Sample2.html");
            Thread.sleep(2000);

            //Click the 'confirmBtn'
            oBrowser.findElement(By.xpath("//input[@id='btn_id2']")).click();
            Thread.sleep(1000);
            Alert oAlert = oBrowser.switchTo().alert();
            System.out.println(oAlert.getText());
            oAlert.accept();
            Thread.sleep(2000);

            if (oBrowser.findElement(By.xpath("//body")).getText().equals("User clicked OK button")) {
                System.out.println("User clicked 'OK' button");
            } else {
                System.out.println("Failed to click 'OK' button");
            }


            oBrowser.navigate().refresh();
            Thread.sleep(2000);

            oBrowser.findElement(By.xpath("//input[@id='btn_id2']")).click();
            Thread.sleep(1000);
            oAlert = oBrowser.switchTo().alert();
            oAlert.dismiss();
            Thread.sleep(2000);

            if (oBrowser.findElement(By.xpath("//body")).getText().equals("User clicked cancel button")) {
                System.out.println("User clicked 'Cancle' button");
            } else {
                System.out.println("Failed to click 'Cancel' button");
            }

            Thread.sleep(2000);
            oBrowser.quit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser = null;
        }
    }


    //Static prompt alert handling
    public static void handleStaticPromptAlert() {
        WebDriver oBrowser = null;
        String userName[] = {"Arjun", "Bhima", "Chanakya", "Dhrona"};
        try {
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("file:///C:/Users/HP/Desktop/Testig%20note/html%20program/Sample2.html");
            Thread.sleep(2000);

            //Click the 'confirmBtn'
            for (int i = 0; i < userName.length; i++) {
                oBrowser.findElement(By.xpath("//input[@id='btn_id3']")).click();
                Thread.sleep(1000);
                Alert oAlert = oBrowser.switchTo().alert();
                System.out.println(oAlert.getText());
                oAlert.sendKeys(userName[i]);
                Thread.sleep(2000);
                oAlert.accept();
                Thread.sleep(2000);
                if (oBrowser.findElement(By.xpath("//body")).getText().trim().equals("User Name is: " + userName[i].trim())) {
                    System.out.println("User name entered and clicked 'OK' button");
                } else {
                    System.out.println("Failed to enter the user name & click 'OK' button");
                }

                oBrowser.navigate().refresh();
                Thread.sleep(2000);
            }

            oBrowser.quit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser = null;
        }
    }


    public static void handleDynamicAlert() {
        WebDriver oBrowser = null;
        try {
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("file:///C:/Users/HP/Desktop/Testig%20note/html%20program/Sample2.html");
            Thread.sleep(2000);

            //Click the 'alertBtn'
            oBrowser.findElement(By.xpath("//input[@id='btn_id1']")).click();
            if (isAlertPresent(oBrowser) == true) {
                Thread.sleep(1000);

                Alert oAlert = oBrowser.switchTo().alert();
                System.out.println(oAlert.getText());
                oAlert.accept();
            } else {
                System.out.println("No alert is present at this time");
            }


            Thread.sleep(2000);
            oBrowser.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser = null;
        }
    }


    public static boolean isAlertPresent(WebDriver oBrowser) {
        try {
            oBrowser.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public static void handleChildWindow() {
        WebDriver oBrowser = null;
        String sParent = null;
        Set<String> oChild = null;
        try {
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("file:///C:/Users/HP/Desktop/Testig%20note/html%20program/sample1.html");
            Thread.sleep(2000);
            sParent = oBrowser.getWindowHandle();
            System.out.println("Parent Window ID: " + sParent);

            oBrowser.findElement(By.linkText("ActiTime")).click();
            Thread.sleep(2000);

            oChild = oBrowser.getWindowHandles();
            for (String childWnd : oChild) {
                if (!childWnd.equals(sParent)) {
                    oBrowser.switchTo().window(childWnd);
                    System.out.println(oBrowser.getTitle());
                    System.out.println(oBrowser.getCurrentUrl());

                    oBrowser.findElement(By.id("username")).sendKeys("aaaaaaaaaaaaaa");
                    Thread.sleep(2000);
                    oBrowser.close();
                    break;
                }
            }

            oBrowser.switchTo().window(sParent);

            Thread.sleep(2000);
            oBrowser.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser = null;
        }
    }

    public static void handleChildWindow1() {
        WebDriver oBrowser = null;
        String sParent = null;
        Set<String> oChild = null;
        try {
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("https://www.linkedin.com/login");
            Thread.sleep(2000);

            // oBrowser.switchTo().frame(oBrowser.findElement(By.xpath("//iframe[@*='Sign in with Google Button']")));
            //oBrowser.switchTo().frame(oBrowser.findElement(By.xpath("//iframe[@*='Sign in with Apple']")));

            sParent = oBrowser.getWindowHandle();
            System.out.println("Parent Window ID: " + sParent);



            oBrowser.findElement(By.xpath("//span[@class = 'sign-in-with-apple-button__text']")).click();
            Thread.sleep(2000);

            oChild = oBrowser.getWindowHandles();
            for (String childWnd : oChild) {
                if (!childWnd.equals(sParent)) {
                    oBrowser.switchTo().window(childWnd);
                    System.out.println(oBrowser.getTitle());
                    System.out.println(oBrowser.getCurrentUrl());

                    oBrowser.close();
                    break;
                }
            }

            oBrowser.switchTo().window(sParent);

            Thread.sleep(2000);
            oBrowser.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser = null;
        }
    }
}


