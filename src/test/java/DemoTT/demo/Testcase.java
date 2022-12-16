package DemoTT.demo;
import DemoTT.Setup.Setup;
import DemoTT.Page.ChonSp;
import DemoTT.Page.GioHang;
import DemoTT.Page.TrangChu;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Testcase extends Setup {
    WebDriver driver;

    ChonSp SP;
    TrangChu trangchu;
    GioHang giohang;


    @BeforeClass
    public void setup() {
        driver = getDriver();
    }
    @Test
    public void Giaotainha(){
        trangchu=new TrangChu(driver);
        trangchu.ClickMenuThietBi();
        trangchu.Kittest();
        SP=new ChonSp();
        SP.muaspgiohang();
        giohang=new GioHang(driver);
        giohang.OrderGiao("Phuc","0938727300","40400");
    }
}