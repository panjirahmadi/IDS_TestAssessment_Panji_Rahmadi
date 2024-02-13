package testApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {
    // Description Test
    // Masuk kehalaman Bulk Upload
    WebDriver driver;
    @Test
    public void pageBulkUpload () {
        // Initiate Browser
        System.setProperty("webdriver.Chrome.driver","C:/Program Files/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        // Go to Login page
        driver.navigate().to("https://stg-sob.ids.id/auth/login");
        driver.manage().window().maximize();

        // variable penampung Object
        By username = By.xpath("//*[@id=\":R4alat1b36:\"]");
        By password = By.xpath("//*[@id=\"password\"]");
        By buttonLogin = By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div/form/div/button");
        driver.findElement(username).sendKeys("ryobranch"); //Input Username
        driver.findElement(password).sendKeys("Ryo@1234"); // Input Password
        driver.findElement(buttonLogin).click();

        //Klik toggle menu
        WebElement toggleMenu = driver.findElement(By.cssSelector("button.MuiButtonBase-root:nth-child(1)"));
        toggleMenu.sendKeys(Keys.RETURN);

        //Klik submenu SetorKu
        WebElement buttonSubMenuSetorKu = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div/div[2]/div[2]/ul/div[2]/li/div"));
        buttonSubMenuSetorKu.sendKeys(Keys.RETURN);

        //Klik submenu Bulk Upload
        WebElement buttonSubMenuBulkUpload = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div/div[2]/div[2]/ul/div[2]/div/div/div/li[1]/div"));
        buttonSubMenuBulkUpload.sendKeys(Keys.RETURN);

        // Verifikasi halaman sudah masuk ke Bulk Upload
        if (driver.getPageSource().contains("Bulk Upload")){
            System.out.println("Text is present, Now we are on the Bulk Upload page");
        }else {
            System.out.println("Text is present, Now we are on the Bulk Upload page");
        }
    }

}
