package stepdefinition;

import org.openqa.selenium.Alert;
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

public class orderstepdefinition {
	WebDriver driver = hooks.hooksclass.driver;
	WebElement obj;

	@Given("user is in application")
	public void user_is_in_application() {
		try {
			driver.get("http://uniformm1.upskills.in/admin");
			driver.manage().window().maximize();
		} catch (Exception ex) {
			System.out.println("Not able to open the application" + ex);
		}

	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		try {
			driver.findElement(By.name("username")).sendKeys(string);
			driver.findElement(By.name("password")).sendKeys(string2);
		} catch (Exception ex) {
			System.out.println("wrong input" + ex);
		}
	}

	@When("user click on login")
	public void user_click_on_login() {
		try {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		} catch (Exception ex) {
			System.out.println("unable to click login" + ex);
		}
	}

	@Then("verify user is in dashboard")
	public void verify_user_is_in_dashboard() {
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

	@When("clicks on orders")
	public void clicks_on_orders() {
		try {
			driver.findElement(By.xpath("//li[@id='sale']/a")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
		} catch (Exception ex) {
			System.out.println("unable to click on orders" + ex);

		}
	}

	@Then("verify user is on the orders section")
	public void verify_user_is_on_the_orders_section() {
		try {
			obj = driver.findElement(By.xpath("//h1[contains(text(),'Orders')]"));
			String at = obj.getText();
			System.out.println(at);
			String et = "Orders";
			Assert.assertEquals(et, at);
		} catch (Exception ex) {
			System.out.println("not in orders" + ex);
		}
	}

	@When("user click order")
	public void user_click_order() {
		try {
			driver.findElement(By.xpath("//li[@id='sale']/a")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
		} catch (Exception ex) {
			System.out.println("unable to click on orders" + ex);

		}

	}

	@When("user enters {string},{string},{string},{string},{string} and order status")
	public void user_enters_and_order_status(String string, String string2, String string3, String string4,
			String string5) throws InterruptedException {
		try {
			driver.findElement(By.name("filter_order_id")).sendKeys(string);
			WebElement obj = driver.findElement(By.name("filter_order_status"));
			Select drpStatus = new Select(obj);
			drpStatus.selectByIndex(2);
			driver.findElement(By.name("filter_date_added")).sendKeys(string2);
			driver.findElement(By.name("filter_customer")).sendKeys(string3);
			driver.findElement(By.name("filter_total")).sendKeys(string4);
			driver.findElement(By.name("filter_date_modified")).sendKeys(string5);
		} catch (Exception ex) {
			System.out.println("Wrong input" + ex);
		}

	}

	@When("clicks on filter")
	public void clicks_on_filter() {
		try {
			driver.findElement(By.id("button-filter")).click();
		} catch (Exception ex) {
			System.out.println("unable to click on filter" + ex);
		}

	}

	@Then("verify a particular order is shown")
	public void verify_a_particular_order_is_shown() {
		try {
			obj = driver.findElement(By.xpath("//td[contains(text(),'599')]"));
		} catch (Exception ex) {
			System.out.println("order not shown" + ex);
		}
	}

	@When("user click on order")
	public void user_click_on_order() {
		try {//// li[@class='open']/a
			driver.findElement(By.xpath("//li[@id='sale']/a")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
		} catch (Exception ex) {
			System.out.println("unable to click on Orders" + ex);

		}

	}

	@When("enter order details{string},{string},{string},{string},{string}and order status")
	public void enter_order_details_and_order_status(String string, String string2, String string3, String string4,
			String string5) throws InterruptedException {
		try {
			driver.findElement(By.name("filter_order_id")).sendKeys(string);
			WebElement obj = driver.findElement(By.name("filter_order_status"));
			Select drpStatus = new Select(obj);
			drpStatus.selectByIndex(2);
			driver.findElement(By.name("filter_date_added")).sendKeys(string2);
			driver.findElement(By.name("filter_customer")).sendKeys(string3);
			driver.findElement(By.name("filter_total")).sendKeys(string4);
			driver.findElement(By.name("filter_date_modified")).sendKeys(string5);
		} catch (Exception ex) {
			System.out.println("Wrong input" + ex);
		}

	}

	@When("clicks onfilter button")
	public void clicks_onfilter_button() {
		try {
			driver.findElement(By.id("button-filter")).click();
		} catch (Exception ex) {
			System.out.println("unable to click on filter" + ex);
		}
	}

	@When("clicks on view")
	public void clicks_on_view() {
		try {
			driver.findElement(By.xpath("//i[@class='fa fa-eye']")).click();
		} catch (Exception ex) {
			System.out.println("Unable to click on view" + ex);
		}
	}

	@Then("verify  order details and customer details is shown")
	public void verify_order_details_and_customer_details_is_shown() {
		try {

			obj = driver.findElement(By.xpath("//h3[contains(text(),'Order Details')]"));
			String at = obj.getText();
			System.out.print(at);
			String et = "Order Details";
			Assert.assertEquals(et, at);
		} catch (Exception ex) {
			System.out.println("actual output is not matching with expected" + ex);
		}

	}

	@When("user click on order and enter order details{string},{string},{string},{string},{string}and order status")
	public void user_click_on_order_and_enter_order_details_and_order_status(String string, String string2,
			String string3, String string4, String string5) {
		try {
			driver.findElement(By.xpath("//li[@id='sale']/a")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
			driver.findElement(By.name("filter_order_id")).sendKeys(string);
			WebElement obj = driver.findElement(By.name("filter_order_status"));
			Select drpStatus = new Select(obj);
			drpStatus.selectByIndex(2);
			driver.findElement(By.name("filter_date_added")).sendKeys(string2);
			driver.findElement(By.name("filter_customer")).sendKeys(string3);
			driver.findElement(By.name("filter_total")).sendKeys(string4);
			driver.findElement(By.name("filter_date_modified")).sendKeys(string5);
		} catch (Exception ex) {
			System.out.print("wrong input" + ex);
		}
	}

	@When("user clicks on filter button")
	public void user_clicks_on_filter_button() {
		try {
			driver.findElement(By.id("button-filter")).click();
		} catch (Exception ex) {
			System.out.println("unable to click on filter" + ex);
		}

	}

	@When("user clicks on edit after result is shown")
	public void user_clicks_on_edit_after_result_is_shown() {
		try {
			driver.findElement(By.xpath("//i[@class='fa fa-pencil']")).click();
		} catch (Exception ex) {
			System.out.println("unable to click on edit" + ex);
		}

	}

	@Then("verify user is in edit page")
	public void verify_user_is_in_edit_page() {
		try {
			obj = driver.findElement(By.xpath("//h3[contains(text(),'Edit Order')]"));
			String at = obj.getText();
			String et = "Edit Order";
			Assert.assertEquals(et, at);
		} catch (Exception ex) {
			System.out.println("user not in edit page" + ex);
		}

	}

	@Then("enter details to be changed")
	public void enter_details_to_be_changed() throws InterruptedException {
		try {
			Actions builder = new Actions(driver);

			WebElement ln = driver.findElement(By.id("input-lastname"));
			WebElement pn = driver.findElement(By.id("input-telephone"));
			ln.click();
			builder.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(2000);
			builder.sendKeys(Keys.BACK_SPACE).build().perform();
			builder.sendKeys(ln, "Tamang").build().perform();
			pn.click();
			builder.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(2000);
			builder.sendKeys(Keys.BACK_SPACE).build().perform();
			builder.sendKeys(pn, "7654321980").build().perform();
		} catch (Exception ex) {
			System.out.println("unable to edit" + ex);
		}

	}

	@Then("verify it is edited or not")
	public void verify_it_is_edited_or_not() {
		driver.findElement(By.id("button-customer")).click();
		Assert.fail("continue button is not working");

	}

	@When("user will click on order and enters order details{string},{string},{string},{string},{string}and order status")

	public void user_will_click_on_order_and_enters_order_details_and_order_status(String string, String string2,
			String string3, String string4, String string5) {

		try {
			driver.findElement(By.xpath("//li[@id='sale']/a")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
			driver.findElement(By.name("filter_order_id")).sendKeys(string);
			WebElement obj = driver.findElement(By.name("filter_order_status"));
			Select drpStatus = new Select(obj);
			drpStatus.selectByIndex(2);
			driver.findElement(By.name("filter_date_added")).sendKeys(string2);
			driver.findElement(By.name("filter_customer")).sendKeys(string3);
			driver.findElement(By.name("filter_total")).sendKeys(string4);
			driver.findElement(By.name("filter_date_modified")).sendKeys(string5);
		} catch (Exception ex) {
			System.out.println("wrong input" + ex);
		}
	}

	@When("user click on filter button")
	public void user_click_on_filter_button() {
		try {
			driver.findElement(By.id("button-filter")).click();
		} catch (Exception ex) {
			System.out.println("unable to click on filter" + ex);
		}

	}

	@When("user click on delete after result is shown")
	public void user_click_on_delete_after_result_is_shown() throws InterruptedException {
		try {
			driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
			Alert alert = driver.switchTo().alert();
			String alerttext;
			alerttext = alert.getText();
			System.out.println(alerttext);
			alert.dismiss();
		} catch (Exception ex) {
			System.out.println("no alert mesage" + ex);
		}

	}

	@Then("verify validation message")
	public void verify_validation_message() {
		System.out.print("only one order details so cant delete and dismissed alert message wile deleting");

	}

	@When("user enters dashboard and clicks order")
	public void user_enters_dashboard_and_clicks_order() {
		try{
		driver.findElement(By.xpath("//li[@id='sale']/a")).click();
		
			driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
		} catch (Exception ex) {
			System.out.println("unable to click on orders" + ex);
		}
	}

	@When("clicks on add new button and enter customer details{string},{string},{string},{string}")
	public void clicks_on_add_new_button_and_enter_customer_details(String string, String string2, String string3,
			String string4) {
		try {
			driver.findElement(By.xpath("//a[@data-original-title='Add New']")).click();
			driver.findElement(By.name("firstname")).sendKeys(string);
			driver.findElement(By.name("lastname")).sendKeys(string2);
			driver.findElement(By.name("email")).sendKeys(string4);
			driver.findElement(By.name("telephone")).sendKeys(string3);
		} catch (Exception ex) {
			System.out.println("unable to add " + ex);
		}
	}

	@Then("user clicks on continue and verify added or not")
	public void user_clicks_on_continue_and_verify_added_or_not() {
		driver.findElement(By.id("button-customer")).click();
		Assert.fail("continue button is not working");
	}

}
