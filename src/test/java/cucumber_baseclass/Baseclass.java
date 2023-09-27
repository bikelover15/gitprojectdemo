package cucumber_baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	public static WebDriver driver;
	public static Actions act;
	public static Robot R;
	public static Select s;
	public static WebDriverWait wait;
	public static TakesScreenshot take;
	public static JavascriptExecutor js;

	public static WebDriver browserlaunch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\saro\\nykka_project_withcucumber\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public static void geturl(String name) {
		driver.get(name);
	}

	public static void getTitle() {
		driver.getTitle();
	}

	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigat_to() {
		driver.navigate().to("");
	}

	public static void navigate_back() {
		driver.navigate().back();
	}

	public static void navigate_forward() {
		driver.navigate().forward();
	}

	public static void navigate_refresh() {
		driver.navigate().refresh();
	}

	public static void alert_accept() {
		driver.switchTo().alert().accept();
	}

	public static void alert_dismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void alert_sendkeys() {
		driver.switchTo().alert().sendKeys("");
	}

	public static void alert_gettext() {
		driver.switchTo().alert().getText();
	}

	public static void action_syntax(WebElement key, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(key, value).build().perform();
	}

	public static void action_sendkeys(String value) {
		Actions act = new Actions(driver);
		act.sendKeys(value).build().perform();
	}

	public static void action_click(WebElement value) {
		Actions act = new Actions(driver);
		act.click(value).build().perform();
	}

	public static void action_contextclik() {
		act.contextClick().build().perform();
	}

	public static void action_doubleclick() {
		act.doubleClick().build().perform();
	}

	public static void action_moveToElement_target() {
		act.moveToElement(null).build().perform();
	}

	public static void acvtion_moveToElement_targetXY() {
		act.moveToElement(null, 0, 0).build().perform();
	}

	public static void acvtion_moveToElement_XY() {
		act.moveByOffset(0, 0).build().perform();
	}

	public static void acvtion_dragAndDrop() {
		act.dragAndDrop(null, null).build().perform();
	}

	public static void acvtion_clickAndHold() {
		act.clickAndHold().build().perform();
	}

	public static void acvtion_clickAndHold_target() {
		act.clickAndHold(null).build().perform();
	}

	public static void frames_access() {
		driver.switchTo().frame(0);
	}

	public static void frames_access_close() {
		driver.switchTo().defaultContent();
	}

	public static void robot_syntax() throws AWTException {
		Robot R = new Robot();
	}

	public static void robot_keypress() {
		R.keyPress(KeyEvent.VK_0);
	}

	public static void robot_keyrelease() {
		R.keyRelease(KeyEvent.VK_0);
	}

	public static void getwindow_handle() {
		driver.getWindowHandle();
	}

	public static void getwindow_handles() {
		driver.getWindowHandles();
	}

	public static void dropdown_syntax(WebElement key, String value) {
		Select s = new Select(key);
		s.selectByValue(value);
	}

	public static void dropdown_selectByIndex() {
		s.selectByIndex(0);
	}

	public static void dropdown_selectByValue() {
		s.selectByValue("");
	}

	public static void dropdown_selectByVisibleText() {
		s.selectByVisibleText("");
	}

	public static void dropdown_deselectByIndex() {
		s.deselectByIndex(0);
	}

	public static void dropdown_deselectByValue() {
		s.deselectByValue("");
	}

	public static void dropdown_deselectByVisibleText() {
		s.deselectByVisibleText("");
	}

	public static void dropdown_getFirstSelectedOption() {
		s.getFirstSelectedOption();
	}

	public static void dropdown_getAllSelectedOptions() {
		s.getAllSelectedOptions();
	}

	public static void dropdown_deselectAll() {
		s.deselectAll();
	}

	public static void dropdown_getOptions() {
		s.getOptions();
	}

	public static void dropdown_isMultiple() {
		s.isMultiple();
	}

	public static void checkbox() {
		driver.findElement(By.xpath("")).click();
	}

	public static void implicit_wait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//	public static void Explicit_wait_syntax(WebElement returntype) {
//		WebDriverWait wait = new WebDriverWait(driver, 0);
//		wait.until(ExpectedConditions.visibilityOf(returntype));
//	}
//
//	public static void FluentWait_synta() {
//		Wait waits = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS)
//				.ignoring(Exception.class);
//	}

	public static void TakesScreenshot_syntax() {
		TakesScreenshot take = (TakesScreenshot) driver;
	}

	public static void TakesScreenshot_steps(String name) throws IOException {
		File A = take.getScreenshotAs(OutputType.FILE);
		File AA = new File(
				"C:\\Users\\ELCOT\\eclipse-workspace\\saro\\Mavan_Practicals\\screenshots\\" + name + ".png");
		FileUtils.copyFile(A, AA);
	}

	public static void sendkey() {
		sendkey();
	}

	public static void sendkeys(WebElement key, String value) {
		sendkeys(key, value);
	}

	public static void java_script_executer_syntax() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	}

	public static void java_script_executer_scroll_up_and_down_target(WebElement web) {
		js.executeScript("arguments[0].scrollIntoView();", web);
	}

	public static void java_script_executer_scroll_up_and_down_random() {
		js.executeScript("window.scrollBy(0,-500");
	}



}
