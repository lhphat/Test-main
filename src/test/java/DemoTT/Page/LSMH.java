package DemoTT.Page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class LSMH {
    WebDriver driver;

    private By SDT = By.id("txtPhoneNumber");
    private By clicktieptuc = By.xpath("//form[@id='frmGetVerifyCode']//button[@type='submit'][contains(text(),'Tiếp tục')]");

    private By OTP=By.name("txtOTP");

    private By dangnhap= By.xpath("//form[@id='frmSubmitVerifyCode']//button[@type='submit'][contains(text(),'Tiếp tục')]");


    public LSMH(WebDriver driver){
        {
            this.driver = driver;
        }
    }
    Keys cmdCtrl = Platform.getCurrent().is(Platform.WINDOWS) ? Keys.COMMAND : Keys.CONTROL;

    public void loggin(){
        String oldTab = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://staging.nhathuocankhang.com/lsmh/dang-nhap','_blank');");
    }
    public void DangNhap(String sdt){
        WebElement NhapSDT = driver.findElement(SDT);
        if (NhapSDT.isDisplayed()) {
            NhapSDT.sendKeys(sdt);
        }
        driver.findElement(clicktieptuc).click();
        WebElement NhapOTP = driver.findElement(OTP);
        NhapOTP.sendKeys("2106");
        driver.findElement(dangnhap).submit();
    }
    public void DNLSMH(String sdt){
     log.info("loggin");
     loggin();
     log.info("DangNhap");
     DangNhap(sdt);
    }
    static Logger log = LogManager.getLogger(LSMH.class.getName());
    public static void main(String[]args){
        log.debug("debug log");
        log.error("error log");
        log.info("info log");
    }
}
