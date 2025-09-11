package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class UploadFile {

    public static void main(String[] args) {
        uploadFile();
    }
    public static void uploadFile(){
        WebDriver oBrowser = null;
        Actions oAction =null;
        try{
            oBrowser =new ChromeDriver();
            oBrowser.manage().window().maximize();
            oBrowser.navigate().to("https://demoqa.com/upload-download");
            Thread.sleep(2000);

         // oAction = new Actions(oBrowser);
           // oAction.moveToElement(oBrowser.findElement(By.id("uploadFile"))).perform();
           // Thread.sleep(2000);
            oBrowser.findElement(By.id("uploadFile")).click();
            Thread.sleep(2000);
            Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\Testig note\\uploadwindow.exe");



        }catch (Exception e ){
            e.printStackTrace();
        }finally{
            oBrowser = null;
        }
    }
}
