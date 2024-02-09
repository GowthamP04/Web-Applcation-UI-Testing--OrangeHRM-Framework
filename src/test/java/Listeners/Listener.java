/*
 * package Listeners;
 * 
 * import org.openqa.selenium.WebDriver; import org.testng.ITestContext; import
 * org.testng.ITestListener; import org.testng.ITestResult;
 * 
 * import com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; import
 * com.aventstack.extentreports.Status;
 * 
 * import CommonFunctions.CommonFunction;
 * 
 * 
 * public class Listener extends CommonFunction implements ITestListener{
 * 
 * 
 * ExtentTest test; ExtentReports extent = ExtentReports.ReportObject();
 * ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
 * 
 * public void onTestStart(ITestResult result) {
 * 
 * test = extent.createTest(result.getMethod().getMethodName());
 * extentTest.set(test); }
 * 
 * public void onTestSuccess(ITestResult result) {
 * 
 * extentTest.get().log(Status.PASS, "Test Passed"); }
 * 
 * 
 * public void onTestFailure(ITestResult result) {
 * 
 * extentTest.get().fail(result.getThrowable()); try { driver = (WebDriver)
 * result.getTestClass().getRealClass().getField("driver").get(result.
 * getInstance()); } catch (Exception e1) { //-->exception that means its a
 * generic exception // TODO Auto-generated catch block e1.printStackTrace(); }
 * String filepath = null; try { filepath =
 * getScreenshot(result.getMethod().getMethodName(), driver); } catch (Exception
 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
 * extentTest.get().addScreenCaptureFromPath(filepath,
 * result.getMethod().getMethodName()); }
 * 
 * private String getScreenshot(String methodName, WebDriver driver) { // TODO
 * Auto-generated method stub return null; }
 * 
 * 
 * 
 * public void onTestSkipped(ITestResult result) { // not implemented }
 * 
 * public void onTestFailedButWithinSuccessPercentage(ITestResult result) { //
 * not implemented }
 * 
 * public void onTestFailedWithTimeout(ITestResult result) {
 * onTestFailure(result); }
 * 
 * public void onStart(ITestContext context) { // not implemented }
 * 
 * public void onFinish(ITestContext context) { extent.flush(); }
 * 
 * 
 * }
 * 
 */