import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SearchBox {
/*    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/DevTools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.au");
*//*        if(driver.findElement(By.name("q"))!= null){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }*//*
        WebElement searchBox = driver.findElement(By.name("q"));
        Assert.assertEquals(true, searchBox.isDisplayed());
        driver.close();
    }*/

    public boolean isPresent(String name) {
        System.setProperty("webdriver.chrome.driver", "C:/DevTools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.au");
        WebElement searchBox = driver.findElement(By.name(name));
        if(searchBox!=null){
            return true;
        }
        else return false;
    }

}
