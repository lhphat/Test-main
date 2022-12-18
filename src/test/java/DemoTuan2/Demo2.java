package DemoTuan2;
//Bài về task
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.DriverManager;
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
        driver.get("https://staging4.bachhoaxanh.com/?view=mobie");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.F12);
        System.out.println("LSMH");
        System.out.println(driver.getTitle());
        sleep(10000);
        WebElement a = driver.findElement(By.cssSelector("body > section > div.colcontent > div.groupcate.owl-carousel.owl-loaded.owl-drag > div.owl-stage-outer > div > div.owl-item.active > div > a.groupitem.i-history"));
        String text = a.getText();
        System.out.println(text);
        System.out.println("click vào");
        a.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement b = driver.findElement(By.id("phone"));
        System.out.println("SĐT");
        b.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        b.sendKeys("0789121340");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        WebElement c = driver.findElement(By.cssSelector("#login-frm-otp > button"));
        c.click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        WebElement d = driver.findElement(By.id("Password"));
        System.out.println("Password");
        d.click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        d.sendKeys("123456789");
        WebElement e= driver.findElement(By.xpath("//body/section[1]/div[1]/div[2]/div[2]/form[1]/button[1]"));
        e.click();
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        WebElement f = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/a[1]"));
        f.click();
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        WebElement location = driver.findElement(By.className("loca-parentwrapper"));
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        System.out.println("click vào location");
        location.click();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        sleep(2000);
        WebElement nearlocation = driver.findElement(By.className("near-location"));
        System.out.println("click ");
        sleep(1000);
        nearlocation.click();
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        sleep(5000);
        WebElement g= driver.findElement(By.cssSelector("body > section > div.colcontent > div.righthome > div.linehome__item.linehome__item--promotion > div.linehome__item__products > ul > li:nth-child(2) > div.box-buy > a > div.buy"));
        g.click();
        sleep(1000);
        WebElement h = driver.findElement(By.className("icon-cart"));
        h.click();
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        WebElement i = driver.findElement(By.cssSelector("#header > div.line-second-head > div.menu-search > form > a > span > i"));
        i.click();
        sleep(10000);
        driver.quit();
        System.out.println("Đóng");

    }
    public void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
