package DemoTuan2;
//Bài của tập về nhà của Linh

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Test
public class    Demo1 {
    Select select;
    Random rand;
    WebDriver driver;
    public void Tuan2() throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
        // Nhap ten
        System.out.println("Nhap Ten");
        DRIVER(driver, "firstName", "Le");
        DRIVER(driver, "lastName", "Phat");
        //Nhap email
        System.out.println("Nhap email");
        DRIVER(driver, "userEmail", "lehongphatcntt@gmail.com");
        //Chon gioi tinh
        System.out.println("Chon gioi tinh");
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='gender-radio-1']")));
        a.click();
        //Nhap sdt
        System.out.println("Nhap so dt");
        WebElement userNumber = driver.findElement(By.cssSelector("input#userNumber"));
        userNumber.sendKeys("0789121340");
        sleep(2000);
        //ngay sinh
        driver.findElement(By.id("dateOfBirthInput")).click();
        select = new Select(driver.findElement(By.cssSelector(".react-datepicker__year-select")));
        select.selectByVisibleText("2000");
        select = new Select(driver.findElement(By.cssSelector(".react-datepicker__month-select")));
        select.selectByVisibleText("August");
        sleep(1000);
        driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__month > div:nth-child(4) > div.react-datepicker__day.react-datepicker__day--026.react-datepicker__day--weekend")).click();
        //Nhap Subject
        WebElement subjects = driver.findElement(By.id("subjectsInput"));
        subjects.sendKeys("Physics");
        subjects.sendKeys(Keys.chord(Keys.ENTER));
        sleep(2000);
        //So Thich
        WebElement hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
        hobbies.click();
        sleep(2000);
        //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        //Chon file anh
        WebElement uploadEle = driver.findElement(By.id("uploadPicture"));
        uploadEle.sendKeys("C:\\Users\\K\\Desktop\\New folder\\1.jpg");
//        String projectPath = System.getProperty("user.dir");
//        WebElement uploadEle = driver.findElement(By.id("uploadPicture"));
//        uploadEle.sendKeys( projectPath+"\\DemoTuan2\\117750.jpg");
        sleep(1000);
//      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Nhap dia chis
        DRIVER(driver, "currentAddress", "49/46 Bla Bla");
        sleep(1000);
        //State và cty
        WebElement state = driver.findElement(By.id("react-select-3-input"));
        state.sendKeys("NCR");
        state.sendKeys(Keys.chord(Keys.ENTER));
        Thread.sleep(1000);

        WebElement city = driver.findElement(By.id("react-select-4-input"));
        city.sendKeys("Delhi");
        city.sendKeys(Keys.chord(Keys.ENTER));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }
    //Set up driver tìm theo driver id, và thực hiện action click và sendkeys
    public void DRIVER(WebDriver driver,String id, String text)
    {
        this.driver = driver;
        WebElement element = driver.findElement(By.id(id));
        element.click();
        element.sendKeys(text);
    }
    //Set up select tìm theo driver css, và thực hiện action click và select
    public void SELECT(Select select,String css,String value)
    {
        this.select = select;
        WebElement element = driver.findElement(By.id(css));
        element.click();
        select.selectByVisibleText(value);
    }
    public void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
