import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demotourscript 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay Chaurasia\\Desktop\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://demo.guru99.com/test/newtours/index.php");
		 w.findElement(By.linkText("REGISTER")).click();
		  w.findElement(By.name("firstName")).sendKeys("komal");
		  w.findElement(By.name("lastName")).sendKeys("komal123");
		  w.findElement(By.name("phone")).sendKeys("8668379620");
		  w.findElement(By.name("userName")).sendKeys("komal@123");
		  w.findElement(By.name("address1")).sendKeys("Mumbai");
		  w.findElement(By.name("city")).sendKeys("Mumbai");
		  w.findElement(By.name("state")).sendKeys("Maharashtra");
		  w.findElement(By.name("postalCode")).sendKeys("400 004"); Select s=new
		  Select(w.findElement(By.name("country"))); s.selectByVisibleText("ANGOLA");
		  w.findElement(By.name("email")).sendKeys("komal123@gmail.com");
		  w.findElement(By.name("password")).sendKeys("komal4321");
		  w.findElement(By.name("confirmPassword")).sendKeys("komal4321");
		  w.findElement(By.name("submit")).click();
		  System.out.println("Registration done Successfully");
		  
		  w.findElement(By.linkText("SIGN-OFF")).click();
		  System.out.println("SIGN-OFF DONE SUCCESSFULLY");
		  w.findElement(By.linkText("SUPPORT")).click();
		  w.findElement(By.xpath("//a[contains(text(),'SUPPORT')]")).click();
		  System.out.println("This page is under construction");
		  w.findElement(By.linkText("CONTACT")).click();
		  w.findElement(By.xpath("//a[contains(text(),'CONTACT')]")).click();
		  System.out.println("This page is under construction");
		  w.findElement(By.linkText("Home")).click();
		  System.out.println("Home page opens Successfully"); 
		  {
		  Scanner sc = new
		  Scanner(System.in); System.out.println("Enter username"); 
		  String ut=sc.next(); System.out.println("Enter password"); 
		  String uv=sc.next();
		 
		  if(w.getTitle().equals("Welcome: Mercury Tours")) 
		  {
		  w.findElement(By.name("userName")).sendKeys(ut);
		  w.findElement(By.name("password")).sendKeys(uv);
		  w.findElement(By.name("submit")).click();
		  System.out.println("LOGIN DONE SUCCESSFULLY"); 
		  }
		  else 
		  {
		  System.out.println("TITLE DOES NOT MATCH"); 
		  }
		  
		  
		  
		  if(w.getTitle().equals("Login: Mercury Tours")) 
		  {
		  w.findElement(By.linkText("SIGN-OFF")).click();
		  System.out.println("SIGN-OFF DONE SUCCESSFULLY"); 
		  } else 
		  {
		  System.out.println("TITLE DOES NOT MATCH"); 
		  }
		  
		  
		  w.findElement(By.linkText("Flights")).click();
		  System.out.println("Flight page opens Successfully");
		  //w.findElement(By.xpath(/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/b[1]/font[1]/input[1]")).click(); 
		  w.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/b[1]/font[1]/input[2]")).click();
		  
		  
		  Select s0=new Select(w.findElement(By.name("passCount")));
		  s0.selectByVisibleText("3"); 
		  Select s1=new Select(w.findElement(By.name("fromPort"))); 
		  s1.selectByVisibleText("London");
		  Select s2=new Select(w.findElement(By.name("fromMonth")));
		  s2.selectByVisibleText("April"); 
		  Select s3=new Select(w.findElement(By.name("fromDay"))); 
		  s3.selectByVisibleText("2");
		  Select s4=new Select(w.findElement(By.name("toPort")));
		  s4.selectByVisibleText("Frankfurt"); 
		  Select s5=new Select(w.findElement(By.name("toMonth"))); 
		  s5.selectByVisibleText("May");
		  Select s6=new Select(w.findElement(By.name("toDay")));
		  s6.selectByVisibleText("11"); 
		  Select s7=new Select(w.findElement(By.name("airline")));
		  s7.selectByVisibleText("Unified Airlines");
		  w.findElement(By.xpath("//tbody/tr[9]/td[2]/font[1]/font[1]/input[2]")).click();
		  w.findElement(By.xpath("//tbody/tr[14]/td[1]/input[1]")).click();
		  
		  w.findElement(By.linkText("Hotels")).click();
		  w.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]")).click();
		  System.out.println("This page is under construction");
		  w.findElement(By.linkText("Car Rentals")).click();
		  w.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]")).click();
		  System.out.println("This page is under construction");
		  w.findElement(By.linkText("Cruises")).click(); System.out.println("This page is under construction so homepage opens automatically");
		  w.findElement(By.linkText("Destinations")).click();
		  w.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]")).click();
		  System.out.println("This page is under construction");
		  w.findElement(By.linkText("Vacations")).click();
		  w.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]")).click();
		  System.out.println("This page is under construction");
		  w.findElement(By.linkText("Home")).click();
		  System.out.println("Home page opens Successfully");
		  w.findElement(By.linkText("your destination")).click(); System.out.println("This page is under construction so homepage opens automatically");
		  w.findElement(By.linkText("featured vacation destinations")).click();
		  System.out.println("This page is under construction so homepage opens automatically");
		  w.findElement(By.linkText("Register here")).click();
		  System.out.println("Register here page opens Successfully");
		  w.findElement(By.name("firstName")).sendKeys("komal");
		  w.findElement(By.name("lastName")).sendKeys("komal123");
		  w.findElement(By.name("phone")).sendKeys("8668379620");
		  w.findElement(By.name("userName")).sendKeys("komal@123");
		  w.findElement(By.name("address1")).sendKeys("Mumbai");
		  w.findElement(By.name("city")).sendKeys("Mumbai");
		  w.findElement(By.name("state")).sendKeys("Maharashtra");
		  w.findElement(By.name("postalCode")).sendKeys("400 004"); 
		  Select s11=new Select(w.findElement(By.name("country"))); 
		  s11.selectByVisibleText("ANGOLA");
		  w.findElement(By.name("email")).sendKeys("komal123@gmail.com");
		  w.findElement(By.name("password")).sendKeys("komal4321");
		  w.findElement(By.name("confirmPassword")).sendKeys("komal4321");
		  w.findElement(By.name("submit")).click();
		  System.out.println("Registration done Successfully");
		  w.findElement(By.linkText("Home")).click();
		  System.out.println("Home page opens Successfully");
		  w.findElement(By.linkText("Business Travel @ About.com")).click();
		  System.out.println("This page is under construction"); w.navigate().back();
		  w.findElement(By.linkText("Salon Travel")).click();
		  System.out.println("Salon Travel page opens Successfully");
		  w.navigate().back(); w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Flash Movie Demo')]")).click();
		  w.findElement(By.xpath("//body/form[1]/center[1]/input[1]")).click();
		  w.findElement(By.xpath("//body/form[1]/center[1]/input[2]")).click();
		  w.findElement(By.xpath("//body/form[1]/center[1]/input[3]")).click();
		  w.findElement(By.xpath("//body/form[1]/center[1]/input[4]")).click();
		  Thread.sleep(2000);
		  
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Radio & Checkbox Demo')]")).click(); 
		  w.findElement(By.xpath("//input[@id='vfb-7-2']")).click();
		  w.findElement(By.xpath("//input[@id='vfb-6-1']")).click();
		  
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Table Demo')]")).click();
		  
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Accessing Link')]")).click();
		  w.findElement(By.xpath("//body/a[1]")).click(); w.navigate().back();
		  w.findElement(By.xpath("//body/a[2]")).click(); w.navigate().back();
		  
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Ajax Demo')]")).click();
		  w.findElement(By.xpath("//input[@id='no']")).click();
		  w.findElement(By.xpath("//input[@id='buttoncheck']")).click();
		  
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		  w.findElement(By.xpath("//a[contains(text(),'Inside & Outside Block Level Tag')]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Inside a block-level tag.')]")).click(); 
		  w.navigate().back(); w.findElement(By.xpath("//span[contains(text(),'Outside a block-level tag.')]")).click();
		  w.navigate().back();
		  
		  Thread.sleep(2000); 
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Delete Customer Form')]")).click(); 
		  w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("123");
		  //w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		  w.navigate().back();
		  
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		  w.findElement(By.xpath("//a[contains(text(),'Yahoo')]")).click();
		  w.navigate().back();
		  
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Tooltip')]")).click();
		  w.navigate().back();
		  
		  Thread.sleep(2000); w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[10]/a[1]")).click();
		  w.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\Ajay Chaurasia\\Desktop\\RESUME");
		  w.findElement(By.xpath("//input[@id='terms']")).click();
		  w.findElement(By.xpath("//button[@id='submitbutton']")).click();
		  
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); 
		  w.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		  w.findElement(By.xpath("//input[@id='email']")).sendKeys("komal123@gmail.com"); 
		  w.findElement(By.xpath("//input[@id='passwd']")).sendKeys("komal4321");
		  w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();
		  
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Social Icon')]")).click();
		  Thread.sleep(2000);
		  
		  w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Selenium Auto IT')]")).click();
		  
		  w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Selenium IDE Test')]")).click();
		  w.findElement(By.xpath("//input[@id='email']")).sendKeys("komal123@gmail.com"); 
		  w.findElement(By.xpath("//input[@id='pass']")).sendKeys("komal4321");
		  w.findElement(By.xpath("//input[@id='persist_box']")).click();
		  w.findElement(By.xpath("//input[@id='u_0_b']")).click(); 
		  w.navigate().back();
		  
		  w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Guru99 Demo Page')]")).click();
		  
		  w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Scrollbar Demo')]")).click();
		  WebElement Element = w.findElement(By.linkText("VBScript"));
		  JavascriptExecutor js=(JavascriptExecutor) w;
		  
		  js.executeScript("arguments[0].scrollIntoView();",Element);
		  
		  Thread.sleep(5000);
		  
		  WebElement Element1 = w.findElement(By.linkText("ACCOUNTING"));
		  js.executeScript("arguments[0].scrollIntoView();",Element1);
		  
		  Thread.sleep(2000); w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'File Upload using Sikuli Demo')]")).click();
		  w.findElement(By.xpath("//input[@id='photoimg']")).sendKeys("C:\\Users\\Ajay Chaurasia\\Desktop\\RESUME");
		  
		  w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Cookie Handling Demo')]")).click(); 
		  w.findElement(By.xpath("//body/div[2]/form[1]/input[1]")).sendKeys("komal123@gmail.com");
		  w.findElement(By.xpath("//body/div[2]/form[1]/input[2]")).sendKeys("komal4321");
		  w.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		  
		  Thread.sleep(2000); w.findElement(By.xpath("//body/div[@id='includedContent']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Drag and Drop Action')]")).click(); 
		  WebElement Drag=w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")); 
		  WebElement Drop=w.findElement(By.xpath("//ol[@id='amt7']")); 
		  Actions act1=new Actions(w); 
		  act1.dragAndDrop(Drag,Drop).build().perform();
		  WebElement Drag1=w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")); 
		  WebElement Drop1=w.findElement(By.xpath("//ol[@id='amt8']")); 
		  Actions act2=new Actions(w); 
		  act2.dragAndDrop(Drag1,Drop1).build().perform();
		  
		  
		  
		  w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Selenium DatePicker Demo')]")).click();
		  
		  
		  w.navigate().back(); w.findElement(By.linkText("Insurance Project")).click();
		  System.out.println("Insurance Project page opens Successfully");
		  w.findElement(By.linkText("Register")).click(); 
		  Select s8=new Select(w.findElement(By.name("title"))); 
		  s8.selectByVisibleText("Ms");
		  w.findElement(By.name("firstname")).sendKeys("komal");
		  w.findElement(By.name("lastname")).sendKeys("komal123");
		  w.findElement(By.name("phone")).sendKeys("8668379620"); 
		  Select s9=new Select(w.findElement(By.name("year"))); 
		  s9.selectByVisibleText("1940");
		  Select s10=new Select(w.findElement(By.name("month")));
		  s10.selectByVisibleText("May"); 
		  Select s12=new Select(w.findElement(By.name("date"))); 
		  s12.selectByVisibleText("6");
		  w.findElement(By.xpath("//*[@id=\"licencetype_f\"]")).click(); 
		  Select s13=new Select(w.findElement(By.name("licenceperiod")));
		  s13.selectByVisibleText("10"); 
		  Select s14=new Select(w.findElement(By.name("occupation")));
		  s14.selectByVisibleText("Doctor");
		  w.findElement(By.name("street")).sendKeys("Mumbai");
		  w.findElement(By.name("city")).sendKeys("Mumbai");
		  w.findElement(By.name("county")).sendKeys("India");
		  w.findElement(By.name("post_code")).sendKeys("400004");
		  w.findElement(By.name("email")).sendKeys("komal123@gmail.com");
		  w.findElement(By.name("password")).sendKeys("komal4321");
		  w.findElement(By.name("c_password")).sendKeys("komal4321");
		  w.findElement(By.name("submit")).click();
		  System.out.println(" Insuarance Registration done Successfully");
		  
		  w.findElement(By.name("email")).sendKeys("komal123@gmail.com");
		  w.findElement(By.name("password")).sendKeys("komal4321");
		  w.findElement(By.name("submit")).click();
		  System.out.println(" Insuarance login done Successfully");
		  
		  w.findElement(By.xpath("//a[@id='ui-id-2']")).click(); 
		  Select s15=new Select(w.findElement(By.name("0"))); 
		  s15.selectByVisibleText("At home");
		  w.findElement(By.xpath("//input[@id='quotation_windscreenrepair_f']")).click();
		  w.findElement(By.xpath("//input[@id='quotation_incidents']")).sendKeys("12");
		  w.findElement(By.xpath("//input[@id='quotation_vehicle_attributes_registration']")).sendKeys("14");
		  w.findElement(By.xpath("//input[@id='quotation_vehicle_attributes_mileage']")).sendKeys("16");
		  w.findElement(By.xpath("//input[@id='quotation_vehicle_attributes_value']")).sendKeys("18");
		  Select s19=new Select(w.findElement(By.name("parkinglocation")));
		  s19.selectByVisibleText("Locked Garage"); 
		  Select s18=new Select(w.findElement(By.name("year"))); 
		  s18.selectByVisibleText("2016");
		  Select s16=new Select(w.findElement(By.name("month")));
		  s16.selectByVisibleText("August"); 
		  Select s17=new Select(w.findElement(By.name("date"))); 
		  s17.selectByVisibleText("3");
		  w.findElement(By.xpath("//body/div[3]/div[1]/div[2]/form[1]/div[8]/input[3]")).click(); 
		  w.navigate().back();
		  w.findElement(By.xpath("//a[@id='ui-id-3']")).click();
		  w.findElement(By.xpath("//body[1]/div[3]/div[1]/div[3]/form[1]/input[1]")).sendKeys("123456");
		  w.findElement(By.xpath("//input[@id='getquote']")).click();
		  w.navigate().back(); 
		  w.findElement(By.xpath("//a[@id='ui-id-4']")).click();
		  w.findElement(By.xpath("//a[@id='ui-id-5']")).click(); 
		  Select s20=new Select(w.findElement(By.name("user[title]")));
		  s20.selectByVisibleText("Captain");
		  w.findElement(By.xpath("//input[@id='user_surname']")).sendKeys("Chaurasia");
		  w.findElement(By.xpath("//input[@id='user_firstname']")).sendKeys("Komal");
		  w.findElement(By.xpath("//input[@id='user_phone']")).sendKeys("6683796208");
		  Select s21=new Select(w.findElement(By.name("user[dateofbirth(1i)]")));
		  s21.selectByVisibleText("1937"); 
		  Select s22=new Select(w.findElement(By.name("user[dateofbirth(2i)]")));
		  s22.selectByVisibleText("February"); 
		  Select s23=new Select(w.findElement(By.name("user[dateofbirth(3i)]")));
		  s23.selectByVisibleText("3");
		  w.findElement(By.xpath("//input[@id='user_licencetype_f']")).click(); 
		  Select s24=new Select(w.findElement(By.name("user[licenceperiod]")));
		  s24.selectByVisibleText("6");
		  w.findElement(By.xpath("//input[@id='user_address_attributes_street']")).sendKeys("Goldeol");
		  w.findElement(By.xpath("//input[@id='user_address_attributes_city']")).sendKeys("Mumbai");
		  w.findElement(By.xpath("//input[@id='user_address_attributes_county']")).sendKeys("India");
		  w.findElement(By.xpath("//input[@id='user_address_attributes_postcode']")).sendKeys("400004");
		  w.findElement(By.xpath("//body/div[3]/div[1]/div[5]/form[1]/div[14]/input[1]")).click(); 
		  w.navigate().back();
		 
		  w.findElement(By.xpath("//a[contains(text(),'Agile Project')]")).click();
		  w.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("1303");
		  w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Guru99");
		  w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Mini Statement')]")).click();
		  Select s25=new Select(w.findElement(By.name("accountno")));
		  s25.selectByVisibleText("3309");
		  w.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'Continue')]")).click(); 
		  w.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		  Alert a=w.switchTo().alert();
	        Thread.sleep(2000);
	        a.accept();
		  
		  Thread.sleep(2000);
		 
		  w.findElement(By.xpath("//a[contains(text(),'Bank Project')]")).click();
		  w.findElement(By.xpath("//a[contains(text(),'here')]")).click();
		  w.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("komal123@gmail.com");
		  w.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).click();
		  w.navigate().back();
		  w.navigate().back();
		  Thread.sleep(2000);
		  w.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr323069");
		  w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("upErAnY");
		  w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		  
		  w.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		  w.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("Sia");
		  w.findElement(By.xpath("//tbody/tr[5]/td[2]/input[2]")).click();
		  Thread.sleep(2000);
		  
		  w.findElement(By.xpath("//input[@id='dob']")).sendKeys("04/07/1998");
          w.findElement(By.xpath("//tbody/tr[7]/td[2]/textarea[1]")).sendKeys("B-403,Siddhivinayak Plaza, Above S.K. Wheels Maruti");
		  w.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("Bhiwandi");
		  w.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("Maharashtra");
		  Thread.sleep(2000);
		  w.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("4212033");
		  w.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).sendKeys("7459876283");
		  w.findElement(By.xpath("//tbody/tr[12]/td[2]/input[1]")).sendKeys("komal12@gmail.com");
		  w.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).click();
		  w.navigate().back();
          
		  w.findElement(By.xpath("//a[contains(text(),'Edit Customer')]")).click();
		  w.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).sendKeys("1234");
		  w.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).click();
		  w.navigate().back();
		  //w.findElement(By.xpath("//body/div[3]/div[1]/ul[1]/li[4]/a[1]")).click();
		  //w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("1234");
		  //w.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).click();
		  //w.navigate().back();
		/*
		 * w.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		 * w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("12345");
		 * Select s26=new Select(w.findElement(By.name("selaccount")));
		 * s26.selectByVisibleText("current");
		 * w.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("2000");
		 * w.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
		 * w.navigate().back(); Thread.sleep(2000);
		 */  w.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).sendKeys("1234");
		  w.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).click();
		  w.navigate().back();
		  w.findElement(By.xpath("//a[contains(text(),'Mini Statement')]")).click();
		  w.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).sendKeys("1234");
		  w.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).click();
		  w.navigate().back();
		
		  w.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		  Alert a5=w.switchTo().alert();
	        Thread.sleep(2000);
	        a.accept();
		  




	}
}

}