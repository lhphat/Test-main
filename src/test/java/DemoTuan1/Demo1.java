package DemoTuan1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Test
public class Demo1 {
    public void Testlocation() {
        WebDriver driver;
        //setup và mở trình duyệt
        WebDriverManager.chromedriver().setup();
        System.out.println("mở trình duyệt");
        driver = new ChromeDriver();
        System.out.println("mở trang BHX");
        //Mở trang bhx
        driver.get("https://staging2.bachhoaxanh.com/?view=moblie");
        //lấy title của trang web
                System.out.println(driver.getTitle());
        System.out.println("chon location");
        //tạo thẻ kiếm class
        WebElement a = driver.findElement(By.className("loca-parentwrapper"));
        String text = a.getText();
        System.out.println(text);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        System.out.println("click vào location");
        a.click();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        sleep(2000);
        WebElement b = driver.findElement(By.className("near-location"));
        System.out.println("click ");
        b.click();
//        sleep(10000);
//        driver.quit();
//        System.out.println("đóng trình duyệt google chrome");
    }
    private void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

