package ResourceProperties;


import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports {
	
	public static ExtentReports ReportObject() {
		
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("Test Result");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Gowtham");
		return extent;
	}

	private void attachReporter(ExtentSparkReporter reporter) {
		// TODO Auto-generated method stub
		
	}

	private void setSystemInfo(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}


