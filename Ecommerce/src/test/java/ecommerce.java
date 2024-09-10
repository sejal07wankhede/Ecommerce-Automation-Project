
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ecommerce {
    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement web = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
        web.sendKeys("Mobile");
        web.sendKeys(Keys.ENTER);

        List<WebElement> list_of_webelement = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));

        int length = list_of_webelement.size();
        System.out.println(length);

        if (length != 0){
            for (WebElement input_list_of_element : list_of_webelement){
                String mob_list = input_list_of_element.getText();
                System.out.println(mob_list);

                // REDMI 12 5G (Jade Black, 128 GB)
                boolean status = input_list_of_element.getText().contains("REDMI 12 5G (Jade Black, 128 GB)");
                System.out.println("status "+ status);

                if (status == true){
                    input_list_of_element.click();
                    break;
                }
                else {
                    System.out.println("status does not match");
                }
            }
        }
        else {
            System.out.println("length is equal to zero");
        }


    }
}
