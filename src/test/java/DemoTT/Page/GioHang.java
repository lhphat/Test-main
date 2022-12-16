package DemoTT.Page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Name;

public class GioHang {
    private WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver; //khởi tạo biến js
    private By HoTen = By.cssSelector("#cusName");
    private By SDT = By.cssSelector("#cusPhone");

    private By dropdownTP = By.cssSelector("form[class='active'] div[class='btn-click country'] button[type='button']");

    private By dropdownQH = By.cssSelector("form[class='active'] div[class='btn-click district'] button[type='button']");

    private By dropdownPX = By.cssSelector("form[class='active'] div[class='wards'] button[type='button']");

    private By Nhapdiachi = By.cssSelector("#cusAddr");

    public void ThongTinDH(String Name,String sdt){
        WebElement NhapTen = driver.findElement(HoTen);
        if (NhapTen.isDisplayed()) {
            NhapTen.sendKeys(Name);
        }
        WebElement NhapSDT = driver.findElement(SDT);
        if (NhapSDT.isDisplayed()) {
            NhapSDT.sendKeys(sdt);
        }
    }
    public void Diachi(String diachi) {
        driver.findElement(dropdownTP).click();
        js.executeScript("document.querySelector(\"form[class='active'] div[class='btn-click country'] button[type='button']\").click()");
        driver.findElement(dropdownQH).click();
        js.executeScript("document.querySelector(\"div[class='btn-click district'] aside:nth-child(1) span:nth-child(1)\").click()");
        driver.findElement(dropdownPX).click();
        js.executeScript("document.querySelector(\"div[class='wards'] aside:nth-child(1) span:nth-child(1)\").click()");
        WebElement NhapDiaChi = driver.findElement(Nhapdiachi);
        if (NhapDiaChi.isDisplayed()) {
            NhapDiaChi.sendKeys(diachi);
        }
    }
    public void OrderGiao(String Name,String sdt,String diachi){
    log.info("GioiTinh");
    js.executeScript("document.querySelector(\"body > div:nth-child(10) > section:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(1) > span:nth-child(2) > i:nth-child(1)\").click();");
    log.info("Nhap thong tin DH");
    ThongTinDH(Name,sdt);
    log.info("Diachi");
    Diachi(diachi);
    log.info("DatHang");
    js.executeScript("document.querySelector(\"button[type='button'] b\").click()");

    }
    static Logger log = LogManager.getLogger(GioHang.class.getName());
    public static void main(String[]args){
        log.debug("debug log");
        log.error("error log");
        log.info("info log");
    }

}
