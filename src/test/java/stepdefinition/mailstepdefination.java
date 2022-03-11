package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class mailstepdefination {
	WebDriver driver = hooks.hooksclass.driver;
	WebElement obj;

	@Given("user enters the application")
	public void user_enters_the_application() {
		try {
			driver.get("http://uniformm1.upskills.in/admin");
			driver.manage().window().maximize();
		} catch (Exception ex) {
			System.out.println("Not able to open the application" + ex);
		}

	}

	@When("user enter {string} and {string} in the application")
	public void user_enter_and_in_the_application(String string, String string2) {
		try {
			driver.findElement(By.name("username")).sendKeys(string);
			driver.findElement(By.name("password")).sendKeys(string2);
		} catch (Exception ex) {
			System.out.println("wrong input" + ex);
		}
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		try {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		} catch (Exception ex) {
			System.out.println("unable to click login" + ex);
		}
	}

	@Then("verify user is in the dashboard")
	public void verify_user_is_in_the_dashboard() {
		try {
			obj = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
			String at = obj.getText();
			System.out.println(at);
			String et = "Dashboard";
			Assert.assertEquals(et, at);
		} catch (Exception ex) {
			System.out.println("excepted and actual not same" + ex);

		}

	}

	@When("user clicks on mail")
	public void user_clicks_on_mail() {
		try {
			driver.findElement(By.cssSelector("i.fa.fa-share-alt.fa-fw")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();

		} catch (Exception ex) {
			System.out.println("Unable to click on mail" + ex);
		}

	}

	@Then("verify user is in mail")
	public void verify_user_is_in_mail() {
		try {
			obj = driver.findElement(By.xpath("//h1[contains(text(),'Mail')]"));
			String at = obj.getText();
			String et = "Mail";
			Assert.assertEquals(et, at);
		} catch (Exception ex) {
			System.out.println("not in mail section" + ex);
		}

	}

	@When("user clicks mail")
	public void user_clicks_mail() {
		try {
			driver.findElement(By.cssSelector("i.fa.fa-share-alt.fa-fw")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();

		} catch (Exception ex) {
			System.out.println("Unable to click on mail" + ex);
		}

	}

	@When("enters To, {string} and {string}")
	public void enters_To_and(String string, String string2) throws InterruptedException {
		try {
			obj = driver.findElement(By.id("input-to"));
			Select drpStatus = new Select(obj);
			Thread.sleep(2000);
			drpStatus.selectByVisibleText("All Customers");
			driver.findElement(By.name("subject")).sendKeys(string);
			driver.findElement(By.xpath("//div[@contenteditable='true']")).sendKeys(string2);
		} catch (Exception ex) {
			System.out.println("wrng input" + ex);
		}
	}

	@Then("verify send button")
	public void verify_send_button() {
		driver.findElement(By.id("button-send")).click();
		Assert.fail();
	}

	@When("clicks mail and enters mail section")
	public void clicks_mail_and_enters_mail_section() {
		try {
			driver.findElement(By.cssSelector("i.fa.fa-share-alt.fa-fw")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();

		} catch (Exception ex) {
			System.out.println("Unable to click on mail" + ex);
		}

	}

	@When("Enters To,{string},{string}")
	public void enters_To(String string, String string2) throws InterruptedException {
		try {
			obj = driver.findElement(By.id("input-to"));
			Select drpStatus = new Select(obj);
			Thread.sleep(2000);
			drpStatus.selectByVisibleText("All Customers");
			driver.findElement(By.name("subject")).sendKeys(string);
			driver.findElement(By.xpath("//div[@contenteditable='true']")).sendKeys(string2);
		} catch (Exception ex) {
			System.out.println("wrng input" + ex);
		}

	}

	@Then("verify cancel button")
	public void verify_cancel_button() {
		try {
			driver.findElement(By.cssSelector("a.btn.btn-default")).click();
			Assert.fail();
			obj = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
			String at = obj.getText();
			System.out.println(at);
			String et = "Dashboard";
			Assert.assertEquals(et, at);
		} catch (Exception ex) {
			System.out.println("cancelbutton not working " + ex);
		}

	}

	@When("enters mail section after clicking mail")
	public void enters_mail_section_after_clicking_mail() {
		driver.findElement(By.cssSelector("i.fa.fa-share-alt.fa-fw")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();

	}

	@When("user cliks on insert button")
	public void user_cliks_on_insert_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@data-original-title='Link']")).click();
		Thread.sleep(2000);

	}

	@When("enters {string} and {string}")
	public void enters_and(String string, String string2) {
		Actions builder = new Actions(driver);

		driver.findElement(By.xpath("//input[@class='note-link-text form-control']")).sendKeys(string);
		obj = driver.findElement(By.xpath("//input[@class='note-link-url form-control']"));
		obj.click();
		builder.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		builder.sendKeys(Keys.BACK_SPACE).build().perform();
		obj.sendKeys(string2);

	}

	@When("cliks on insert button")
	public void cliks_on_insert_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Insert Link')]")).click();

	}

	@Then("verify link is added or not")
	public void verify_link_is_added_or_not() {
		obj = driver.findElement(By.xpath("//a[contains(text(),'Uniform Website')]"));
		String at = obj.getText();
		String et = "Uniform Website";
		System.out.println(at);
		Assert.assertEquals(et, at);

	}

	@When("click on mail")
	public void click_on_mail() {
		driver.findElement(By.cssSelector("i.fa.fa-share-alt.fa-fw")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();

	}

	@When("user clicks on bold text button")
	public void user_clicks_on_bold_text_button() {
		driver.findElement(By.xpath("//button[@data-original-title='Underline (CTRL+U)']")).click();

	}

	@When("enter {string}")
	public void enter(String string) {
		driver.findElement(By.xpath("//div[@contenteditable='true']")).sendKeys(string);

	}

	@Then("verify wether underlined or not")
	public void verify_wether_underlined_or_not() {

		WebElement search = driver
				.findElement(By.cssSelector("button.note-btn.btn.btn-default.btn-sm.note-btn-underline.active"));

		String classValue = search.getAttribute("class");
		System.out.println("Value of class attribute: " + classValue);
		Assert.assertTrue(classValue.contains("active"));

	}

	@When("user clicks and enter mail")
	public void user_clicks_and_enter_mail() {
		driver.findElement(By.cssSelector("i.fa.fa-share-alt.fa-fw")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();

	}

	@When("clicks on full screen")
	public void clicks_on_full_screen() {
		driver.findElement(By.cssSelector("button.note-btn.btn.btn-default.btn-sm.btn-fullscreen")).click();
	}

	@Then("verify full screen view")
	public void verify_full_screen_view() {
		WebElement fs = driver
				.findElement(By.cssSelector("button.note-btn.btn.btn-default.btn-sm.btn-fullscreen.active"));
		String classValue = fs.getAttribute("class");
		System.out.print("Value of class attribute" + classValue);
		Assert.assertTrue(classValue.contains("active"));
	}

}
