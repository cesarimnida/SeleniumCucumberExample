package br.iteris.selenium.cucumber.example.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class LoginRobot {
    private WebDriver driver;

    void openLoginPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver2.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://credenciamento-uat.portalfd.com.br/admin/login");
    }

    void clickOnHyperlink(String button) {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'" + button + "')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    void clickOnButton(String button) {
        driver.findElement(By.xpath("//div[text()='" + button + "']")).click();
    }

    void typeAValidCpf() {
        driver.findElement(By.xpath("//input[@placeholder='CPF']")).sendKeys("86121990007");
    }

    void typeAnInvalidCpf() {
        driver.findElement(By.xpath("//input[@placeholder='CPF']")).sendKeys("08843052950");
    }

    void checkFieldIsVisible(String field) {
        assert driver.findElement(By.xpath("//input[@placeholder='" + field + "']")).isDisplayed();
    }

    void checkButtonIsVisible(String button) {
        assert driver.findElement(By.xpath("//div[text()='" + button + "']")).isDisplayed();
    }

    void waitForLoading() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement loading = driver.findElement(By.cssSelector("ngx-spinner>div"));
        wait.until(ExpectedConditions.invisibilityOf(loading));
    }

    void checkParagraphIsVisible(String text) {
        assert driver.findElement(By.xpath("//p[text()='" + text + "']")).isDisplayed();
    }
}
