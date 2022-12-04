package DemoTuan1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Demo2 {
        @Test
        public void OpenBHX () {
            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            System.out.println("mở trình duyệt test");
            driver = new ChromeDriver();
            System.out.println("mở trang test");
            driver.get("https://www.bachhoaxanh.com/");
            System.out.println("LSMH");
            System.out.println(driver.getTitle());
            WebElement a = driver.findElement(By.className("histories"));
            String text = a.getText();
            System.out.println(text);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            System.out.println("click vào");
            a.click();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            WebElement b = driver.findElement(By.id("phone"));
            System.out.println("SĐT");
            b.click();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            b.sendKeys("0938727300");
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            WebElement c = driver.findElement(By.cssSelector("body.new2019.resolution-1536:nth-child(2) section:nth-child(2) div.customer-form-box:nth-child(1) div.form-otp.active form.register-frm > button.btni.submitbtn:nth-child(4)"));
            c.click();
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            WebElement d = driver.findElement(By.id("Password"));
            System.out.println("Password");
            d.click();
            driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
            d.sendKeys("123456789");
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            WebElement e= driver.findElement(By.xpath("//body/section[1]/div[1]/div[2]/div[2]/form[1]/button[1]"));
            e.click();
//            sleep(10000);
//            driver.quit();
//            System.out.println("Đóng");
        }
    private void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
