package com.Test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.gfp_journey;

import com.utility.Base_Class;
import com.utility.Library;

@Listeners(com.utility.Listner.class)

public class TC_gfp extends Base_Class {

	@DataProvider(name = "excelData")
	public Object[][] testExcel() throws IOException {
		String filepath = "C:\\Users\\30007473\\eclipse-workspace\\C_HSBC_Insurance\\TestData\\Data.xlsx";

		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("YTP");
		int rowCount = sheet.getLastRowNum();

		Object[][] dataObj = new Object[rowCount][18];

		for (int i = 1; i <= rowCount; i++) {
			Row row = sheet.getRow(i);
			int colCount = 18;
			for (int j = 0; j < colCount; j++) {
				int rowNum = i;
				rowNum--;
				dataObj[rowNum][j] = row.getCell(j).toString();

			}
		}
		return dataObj;
	}

	@Test(dataProvider = "excelData")
	public void verify_gfp_journey(String TC_ID, String First_Name, String Middle_Name, String Last_Name,
			String Email_ID, String Mobile_Number, String Gender, String Dob, String consume_tobacco, String occu,
			String edu, String annualIncome, String Emp, String sum, String policy_term, String pay,
			String Payment_Term, String Life_cover) throws Exception {
		log.info("================= || GUARANTED FUTURE PLAN JOURNEY || ===================");

		log.info("==================== ||   TEST CASE START || ====================");

		gfp_journey login = PageFactory.initElements(driver, gfp_journey.class);

		Library.Custom_SendKeys(login.getfirstName(), First_Name, First_Name);
		Library.Custom_SendKeys(login.getmidddleName(), Middle_Name, Middle_Name);
		Library.Custom_SendKeys(login.getlastName(), Last_Name, Last_Name);
		Library.Custom_SendKeys(login.getemail(), Email_ID, Email_ID);
		Library.Custom_SendKeys(login.getmobileNumber(), Mobile_Number, Mobile_Number);
		Library.Custom_Click(login.getcontinuebtn(), "Continue - 1");
		// ====================================================================================================================

		Library.Custom_SendKeys(login.getDOB(), excel.getStringData("Sheet1", 1, 5), "Date of Birth");
		Library.Custom_SendKeys(login.getpincode(), excel.getStringData("Sheet1", 1, 6), "pincode");
		Library.Custom_Click(login.getcontnue2(), "Continue - 2");

		// ====================================================================================================================

		Library.Custom_Click(login.geteducationLevel(), "Education Level");
		Library.Custom_Click(login.getgraduation(), "Graduate");

		WebElement occupation = driver.findElement(By.xpath(
				"//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576-panel-guideradiobutton___widget']"));
		Select sel = new Select(occupation);
		sel.selectByVisibleText("Self Employed");

		WebElement natureOfDuty = driver.findElement(By.xpath(
				"//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576-panel-guidedropdownlist_2084424641___widget']"));
		Select duty = new Select(natureOfDuty);
		duty.selectByVisibleText("Software Engineer");

		Library.Custom_SendKeys(login.getannualIncome(), excel.getStringData("Sheet1", 1, 7), "Annual Income");

		Library.Custom_Click(login.getcontinue3(), "Continue-3");

		// ====================================================================================================================

		Library.Custom_Click(login.getmonth(), "Monthly");

		Library.Custom_SendKeys(login.getamountInvest(), excel.getStringData("Sheet1", 1, 8), "Amount Invest");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)\r\n" + "\r\n" + "", "");

		WebElement dropdouwn = driver.findElement(By.xpath(
				"//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-guidedropdownlist___widget']"));
		Select premium = new Select(dropdouwn);
		List<WebElement> alloption = premium.getOptions();
		for (WebElement option : alloption) {
			if (option.getText().equals("5 Years")) {
				option.click();
				break;
			}
		}

		Library.Custom_Click(login.getcontinue4(), "Continue-4");
		// ====================================================================================================================

		Library.Custom_Click(login.getregular_Income(), "Regular Income");
		Library.Custom_Click(login.getget_Quote(), "Get Quote");

		// ====================================================================================================================

		js.executeScript("window.scrollBy(0,250)\r\n" + "\r\n" + "", "");
		Thread.sleep(3000);
		Library.Custom_Click(login.getproceed(), "Proceed");

		// ====================================================================================================================

		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,200)\r\n" + "\r\n" + "", "");

		Thread.sleep(4000);

		log.info("=============== || TEST SUCCESSFULLY EXECUTE ||================");

	}
}
