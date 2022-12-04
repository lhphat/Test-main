package DemoTuan1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class Demo3 {
    @Test
    public void Test () {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        System.out.println("mở trình duyệt ");
        driver = new ChromeDriver();

        System.out.println("mở trang TGDD");
        driver.get("https://www.thegioididong.com/");
        System.out.println("tìm phần khung search");
        WebElement a = driver.findElement(By.id("skw"));
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        System.out.println("click vào khung search");
        a.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        System.out.println("nhập từ khoá tìm kiếm");
        a.sendKeys("Loa Bluetooth Fenda W8 Xanh dương");
        WebElement b = driver.findElement(By.id("search-result"));
        b.submit();
  //      driver.quit();//     System.out.println("đóng trình duyệt google chrome");
    }
}
