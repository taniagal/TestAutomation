// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class TestAutomationTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
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
    driver.findElement(By.cssSelector(".new-todo")).sendKeys("Milk");
    driver.findElement(By.cssSelector(".new-todo")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".new-todo")).sendKeys("Rice");
    driver.findElement(By.cssSelector(".new-todo")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".new-todo")).sendKeys("Meat");
    driver.findElement(By.cssSelector(".new-todo")).sendKeys(Keys.ENTER);
    driver.findElement(By.linkText("Completed")).click();
    assertThat(driver.findElement(By.cssSelector(".todo-count")).getText(), is("3 items left"));
    driver.close();
  }
}
