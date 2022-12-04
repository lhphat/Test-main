package DemoTuan3;

//Bài về task
import bsh.util.JConsole;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.sql.DriverManager;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static org.apache.logging.log4j.LogManager.*;

public class Demo2 {
    WebDriver driver;
    @BeforeSuite
    public void OpenBHX () {
        WebDriverManager.chromedriver().setup();
        log.info("Mở trình duyệt web");
        driver = new ChromeDriver();
        log.info("mở trang BHX");   
        driver.get("https://www.bachhoaxanh.com/?view=mobie");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    }
    @Test
    public void login(){
        log.info("LSMH");
        System.out.println(driver.getTitle());
        sleep(10000);
        WebElement a = driver.findElement(By.cssSelector("body > section > div.colcontent > div.groupcate.owl-carousel.owl-loaded.owl-drag > div.owl-stage-outer > div > div.owl-item.active > div > a.groupitem.i-history"));
        String text = a.getText();
        System.out.println(text);
        log.info("click");
        a.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement b = driver.findElement(By.id("phone"));
        log.info("SĐT");
        b.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        b.sendKeys("0789121340");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        log.info("click đăng nhập sđt");
        WebElement c = driver.findElement(By.cssSelector("#login-frm-otp > button"));
        c.click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        WebElement d = driver.findElement(By.id("Password"));
        log.info("Password");
        d.click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        d.sendKeys("123456789");
        WebElement e= driver.findElement(By.xpath("//body/section[1]/div[1]/div[2]/div[2]/form[1]/button[1]"));
        log.info("Click đăng nhập");
        e.click();
    }
    @Test
    public void location(){
        log.info("click banner back lại trang chủ");
        WebElement f = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/a[1]"));
        f.click();
        log.info("chọn location");
        WebElement location = driver.findElement(By.className("loca-parentwrapper"));
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        log.info("click location");
        location.click();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        sleep(2000);
        log.info("chọn địa chỉ của bạn");
        WebElement nearlocation = driver.findElement(By.className("near-location"));
        log.info("click chọn địa chỉ của bạn");
        sleep(1000);
        nearlocation.click();
    }
    @Test
    public void addProduct(){
        log.info("chọn sp thứ ở trang chủ");
        WebElement g= driver.findElement(By.cssSelector("body > section > div.colcontent > div.righthome > div.linehome__item.linehome__item--promotion > div.linehome__item__products > ul > li:nth-child(2) > div.box-buy > a > div.buy"));
        g.click();
        sleep(1000);
        log.info("click vào cart");
        WebElement h = driver.findElement(By.className("icon-cart"));
        h.click();
        log.info("giỏ hàng tiếp tục");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        WebElement i = driver.findElement(By.cssSelector("#header > div.line-second-head > div.menu-search > form > a > span > i"));
        i.click();
    }
    @AfterSuite
    public void stopWebDrive(){
        driver.quit();
        System.out.println("Đã đóng trình duyệt");
    }
    public void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    static Logger log = LogManager.getLogger(Demo2.class.getName());
    public static void main(String[]args){
        log.debug("debug log");
        log.error("error log");
        log.info("info log");
    }
}

