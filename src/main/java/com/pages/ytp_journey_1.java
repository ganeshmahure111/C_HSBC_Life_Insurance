package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ytp_journey_1{
	
	//============================================================================  WEBPAGE 1  ===================================================================\\
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076608266-panel-panel1599550630773-guidetextbox___widget']")
	private WebElement first_Name;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076608266-panel-panel1599550630773-guidetextbox_copy___widget']")
	private WebElement middle_Name;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076608266-panel-panel1599550630773-guidetextbox_copy_69___widget']")
	private WebElement last_Name;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076608266-panel-panel1599550875187-guideemail___widget']")
	private WebElement email_Id;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076608266-panel-panel-guidenumericbox___widget']")
	private WebElement mobile_number;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-leadFormPanels-guidebutton___widget']")
	private WebElement continue_1;
	
	//================================================= GET METHOD ================================================\\
	
	public WebElement getFirst_Name() {
		return first_Name;
	}
	
	public WebElement getMiddle_Name() {
		return middle_Name;
	}
	
	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getEmail_Id() {
		return email_Id;
	}

	public WebElement getMobile_number() {
		return mobile_number;
	}

	public WebElement getContinue_1() {
		return continue_1;
	}
	
	//============================================================================  WEBPAGE 2  ===================================================================\\
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076844140-panel-guideradiobutton_113848271__-2_widget']")
	private WebElement female;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076844140-panel-guideradiobutton_113848271__-3_widget']")
	private WebElement transgender;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076844140-panel-panel1593610481480-panel-guidedatepicker___widget']")
	private WebElement dateOfBirth;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076844140-panel-guideradiobutton__-1_widget']")
	private WebElement tobaco_yes;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-leadFormPanels-guidebutton___widget']")
	private WebElement continue_2;
	
	//================================================= GET METHOD ================================================\\
	
	public WebElement female() {
		return female;
	}
	
	public WebElement transgender() {
		return transgender;
	}
	
	public WebElement getdateOfBirth() {
		return dateOfBirth;
	}
	
	public WebElement tobaco_yes() {
		return tobaco_yes;
	}
	
	public WebElement getcontinue_2() {
		return continue_2;
	}
	
	//============================================================================  WEBPAGE 3  ===================================================================\\

	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576-panel-panel-guidenumericbox___widget']")
	private WebElement annualIncome;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-leadFormPanels-guidebutton___widget']")
	private WebElement continue_3;
	
	//================================================= GET METHOD ================================================\\
	
	public WebElement getannualIncome() {
		return annualIncome;
	}
	
	public WebElement getcontinue_3() {
		return continue_3;
	}
	
	//============================================================================  WEBPAGE 4  ===================================================================\\
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-guideradiobutton_617732117__-1_widget']")
	private WebElement emp_yes;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-guideradiobutton_617732117__-2_widget']")
	private WebElement emp_no;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-leadFormPanels-guidebutton___widget']")
	private WebElement check_premium;
	
	//================================================= GET METHOD ================================================\\
	public WebElement emp_yes() {
		return emp_yes;
	}
	
	public WebElement emp_no() {
		return emp_no;
	}
	
	public WebElement getcheck_premium() {
		return check_premium;
	}
	
	//============================================================================  CREATE YOUR OWN PLAN  ===================================================================\\
	
	@FindBy (xpath = "//input[@name='guideContainer-rootPanel-panel-panel1602840994127-panel-panel_2030159564-panel_776881033-panel1602832081639-panel1593601382008-guidenumericbox___jqName']")
	private WebElement sumAssured_Clear;
	
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1602840994127-panel-panel_2030159564-panel_776881033-panel1602832081639-panel1593601382008-guidenumericbox___widget']")
	private WebElement sum_assured;
	
		//========= PAY EVERY =========
	@FindBy (xpath = "id=\"guideContainer-rootPanel-panel-panel1602840994127-panel-panel_2030159564-panel_776881033-panel1602832081639-panel1603714262987-guideradiobutton__-1_widget\"")
	private WebElement month;
	
	@FindBy (xpath = "//label[text()='3 Month']")
	private WebElement three_month;
	
	@FindBy (xpath = "//label[text()='6 Month']")
	private WebElement six_Month;
	
	@FindBy (xpath = "//label[text()='Year']")
	private WebElement year;
	
	//========= PREMIUM PAYMENT TERM =========
	
	@FindBy (xpath ="//div[@class='guideCheckBoxItem afCheckBoxItem pptOptionMode guideFieldHorizontalAlignment notallowedInput withSpan pptOptionMode guideItemSelected']")
	private WebElement regular;
	
	@FindBy (xpath = "//div[@class='guideCheckBoxItem afCheckBoxItem pptOptionLimitedMode5 guideFieldHorizontalAlignment notallowedInput withSpan pptOptionMode']")
	private WebElement five_year;
	
	@FindBy (xpath = "//label[text()=' Limited 10 years']")
	private WebElement ten_year;

	@FindBy (xpath = "//label[text()=' Limited 15 years']")
	private WebElement fifty_year;

	@FindBy (xpath = "//label[text()=' Upto Age 60 Years']")
	private WebElement sixty_year;
	
	@FindBy (xpath = "//div[@class='guideCheckBoxItem afCheckBoxItem checkboxROP guideFieldHorizontalAlignment choice-check-box panelWithTooltipRop']")
	private WebElement rop;
	
	//========================================
	
	@FindBy (xpath = "//p[@class='btm-premiumAmount']")
	private WebElement total_premium;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1602840994127-panel_495801424-panel1606803587832-guidebutton_224626606___widget']")
	private WebElement recalculate_Quate_1;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1602840994127-panel_495801424-panel1606803587832-guidebutton___widget']")
	private WebElement proceed_1;
	
	//================================================= GET METHOD ================================================\\
	
	public WebElement sumAssured_Clear() {
		return sumAssured_Clear;
	}
	
	
	public WebElement getsum_assured() {
		return sum_assured;
	}
		
	//============== PAY EVERY ===============
	
	public WebElement month() {
		return month;
	}
	
	public WebElement three_month() {
		return three_month;
	}
	
	public WebElement getsix_Month() {
		return six_Month;
	}
	
	public WebElement year() {
		return year;
	}
	
	//========= PREMIUM PAYMENT TERM =========
	
	public WebElement regular() {
		return regular;
	}
	
	public WebElement getfive_year() {
		return five_year;
	}
	
	public WebElement ten_year() {
		return ten_year;
	}
	
	public WebElement fifty_year() {
		return fifty_year;
	}
	
	public WebElement sixty_year() {
		return sixty_year;
	}
	
	public WebElement rop() {
		return rop;
	}
	
	public WebElement total_premium() {
		return total_premium;
	}
	
	public WebElement getrecalculate_Quate_1() {
		return recalculate_Quate_1;
	}
	
	public WebElement getproceed_1() {
		return proceed_1;
	}
	
	//============================================================================  Choose A Plan Option ===================================================================\\

	@FindBy (xpath = "//label[text()='Level']")
	private WebElement level;
	
	@FindBy (xpath = "//label[text()='Increasing']")
	private WebElement increasing;
	
	@FindBy (xpath = "//label[text()=' Lumpsum']")
	private WebElement lumpsum;
	
	@FindBy (xpath = "//label[text()=' Monthly Income']")
	private WebElement monthlyIncome;
	
	@FindBy (xpath = "//label[text()=' Part Lumpsum & Part Monthly Income']")
	private WebElement partLumpsumAndMonthlyIncome;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1602840994127-panel_495801424-panel1606803587832-guidebutton_224626606___widget']")
	private WebElement recalculate_Quate_2;
	
	@FindBy (xpath= "//button[@id='guideContainer-rootPanel-panel-panel1602840994127-panel_495801424-panel1606803587832-guidebutton___widget']")
	private WebElement proceed_2;
	
	
	//================================================= GET METHOD ================================================\\
	public WebElement level() {
		return level;
	}
	
	public WebElement lumpsum() {
		return lumpsum;
	}
	
	public WebElement increasing() {
		return increasing;
	}
	
	public WebElement monthlyIncome() {
		return monthlyIncome;
	}

	public WebElement partLumpsumAndMonthlyIncome() {
		return partLumpsumAndMonthlyIncome;
	}
	
	public WebElement getrecalculate_Quate_2() {
		return recalculate_Quate_2;
	}
	
	public WebElement getproceed_2() {
		return proceed_2;
	}
	
	//============================================================================  Choose Additional Benefits [ RIDER ]  ===================================================================\\
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1602840994127-panel-panel1602841540877-panel1594630495974-panel_1607896557-panel1594795092191-guidenumericbox_1244___widget']")
	private WebElement adb;
	
	@FindBy (xpath ="//div[@class='guideFieldNode guideTextDraw addOn_title_adb iconText-title withTrim guideStaticText af-field-filled']")	
	private WebElement adb_select;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1602840994127-panel-panel1602841540877-panel1594630495974-panel_1607896567-panel1594795147180-guidenumericbox_1244___widget']")
	private WebElement atpd_PPP;
	
	@FindBy (xpath = "//div[@class='guideFieldNode guideTextDraw addOn_title_atpdp iconText-title withTrim guideStaticText af-field-filled']")
	private WebElement atpd_PPP_select;
	
	@FindBy (xpath = "//div[@class='guideFieldNode guideTextDraw addOn_title_atpd iconText-title withTrim guideStaticText af-field-filled']")
	private WebElement atpd_PP;
	
	@FindBy (xpath ="(//div[@class='slickk-next slick-arrow'])[2]")
	private WebElement arrow;
	
	@FindBy (xpath = "//div[@class='guideFieldNode guideTextDraw addOn_title_cipp iconText-title withTrim guideStaticText af-field-filled']")
	private WebElement cipp;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1602840994127-panel-panel1602841540877-panel1594630495974-panel_1607896557_cop_231112403-panel1594795092191-guidenumericbox_1244___widget']")
	private WebElement cippp;
	
	@FindBy (xpath = "//div[@class='guideFieldNode guideTextDraw addOn_title_cippp iconText-title withTrim guideStaticText af-field-filled']")
	private WebElement cippp_select;
	
	
	
	@FindBy (xpath = "//div[@class='guideFieldNode guideTextDraw addOn_title_ti iconText-title withTrim guideStaticText af-field-filled validation-success']")
	private WebElement terminalIllness_Select;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1602840994127-panel-panel1602841540877-panel1594630495974-panel_1607896456_cop_4417727-panel1594795169775-guidenumericbox_1244___widget']")
	private WebElement terminalIllness;
					
	@FindBy (xpath = "//div[@class='guideFieldNode guideTextDraw addOn_title_byp iconText-title withTrim guideStaticText af-field-filled validation-success']")
	private WebElement blockYourPremium;
	
	
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1602840994127-panel_495801424-panel1606803587832-guidebutton_224626606___widget']")
	private WebElement recalculate_Quate_3;
	
	@FindBy (xpath ="//button[@id='guideContainer-rootPanel-panel-panel1602840994127-panel_495801424-panel1606803587832-guidebutton___widget']")
	private WebElement proceed_3;
	
	//================================================= GET METHOD ================================================\\
	
	public WebElement adb() {
		return adb;
	}
	
	public WebElement adb_select() {
		return adb_select;
	}
	
	public WebElement atpd_PPP() {
		return atpd_PPP;
	}
	
	public WebElement atpd_PPP_select() {
		return atpd_PPP_select;
	}
	
	public WebElement atpd_PP() {
		return atpd_PP;
	}
	
	public WebElement arrow() {
		return arrow;
	}
	
	public WebElement cipp() {
		return cipp;
	}
	
	public WebElement cippp() {
		return cippp;
	}
	
	public WebElement terminalIllness_Select() {
		return terminalIllness_Select;
	}
	
	public WebElement terminalIllness() {
		return terminalIllness;
	}
	
	public WebElement blockYourPremium() {
		return blockYourPremium;
	}
	
	public WebElement cippp_select() {
		return cippp_select;
	}
	
	
	public WebElement getrecalculate_Quate_3() {
		return recalculate_Quate_3;
	}
	
	public WebElement getproceed_3() {
		return proceed_3;
	}
	
	//============================================================================  Policy Premium Detail ===================================================================\\
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel_1080226036-panel_1173209043-panel_1712664342-panel_379119756-guidetextbox___widget']")
	private WebElement pan;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel_1080226036-panel_1173209043-panel_1712664342-panel_379119756-guidetextbox_2043843___widget']")
	private WebElement pincode;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel_1080226036-panel_1173209043-guidebutton___widget']")
	private WebElement proceed_4;
	
	//================================================= GET METHOD ================================================\\

	public WebElement pan() {
		return pan;
	}
	
	public WebElement pincode() {
		return pincode;
	}
	
	public WebElement proceed_4() {
		return proceed_4;
	}
	
	//============================================================================  Payment Detail ===================================================================\\

	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel_1013852821-panel-panel1593779195034-panel1593780270581-panel_1307358209-panel-guidecheckbox___1_widget']")
	private WebElement payNow;

	@FindBy (xpath ="//div[@id='guideContainer-rootPanel-panel_1013852821-panel-panel1593779195034-panel1593780270581-panel_1307358209-panel_copy-guidecheckbox___guide-item']")
	//   //p[text()='Pay Later!']
	private WebElement payLater;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel_1013852821-panel-panel1593779195034-panel1593780270581-guidebutton_19836339___widget']")
	private WebElement next;
	
	//================================================= GET METHOD ================================================\\

	public WebElement payNow () {
		return payNow;
	}
	
	public WebElement payLater () {
		return payLater;
	}
	
	public WebElement next () {
		return next;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}