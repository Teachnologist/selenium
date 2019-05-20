import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class First {

    public static void main(String[] args) {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("acceptSslCerts",true);
        WebDriver driver=new ChromeDriver(options);

// Launch website

        driver.navigate().to("");

        // Click on the search text box and send value
        List<WebElement> listOfproducts= driver.findElements(By.className(""));

        for(int i=0;i<listOfproducts.size();i++){
            WebElement element = listOfproducts.get(i);
            element.click();
        }


       System.out.println();

        // Click on the search button
    //    driver.findElement(By.name("btnK")).click();

    }
}
