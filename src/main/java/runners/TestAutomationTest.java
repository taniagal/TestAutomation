package runners;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestAutomationTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        System.setProperty("producto1","Milk");
        System.setProperty("producto2","Rice");
        System.setProperty("producto3","Meat");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void validateTextValue() {
        driver.get("http://todomvc.com/");
        driver.manage().window().setSize(new Dimension(1361, 724));
        driver.findElement(By.linkText("AngularJS")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("AngularJS"));
    }

    @Test
    public void entryDataInForm() {
        driver.get("http://todomvc.com/");
        driver.manage().window().setSize(new Dimension(1361, 724));
        driver.findElement(By.linkText("AngularJS")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".new-todo")).sendKeys(System.getProperty("producto1"));
        driver.findElement(By.cssSelector(".new-todo")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".new-todo")).sendKeys(System.getProperty("producto2"));
        driver.findElement(By.cssSelector(".new-todo")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".new-todo")).sendKeys(System.getProperty("producto3"));
        driver.findElement(By.cssSelector(".new-todo")).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("Completed")).click();
        assertThat(driver.findElement(By.cssSelector(".todo-count")).getText(), is("3 items left"));
        driver.close();
    }
}

