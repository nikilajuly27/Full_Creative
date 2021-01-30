import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('')

//System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome")WebDriver driver = new ChromeDriver();
WebUI.navigateToUrl('https://prodaptcloud.sharepoint.com/Sites/Voiceportal/Sitepages/Oneprodapt.aspx')

WebUI.click(findTestObject('SPFx/Login to Account/Name Field'))

WebUI.setText(findTestObject('SPFx/Login to Account/Name Field'), 'revathi.g@prodapt.com')

WebUI.click(findTestObject('SPFx/Login to Account/Next button'))

WebUI.click(findTestObject('SPFx/Login to Account/Password Field'))

WebUI.setText(findTestObject('SPFx/Login to Account/Password Field'), 'Dec@2020')

WebUI.click(findTestObject('SPFx/Login to Account/Next button'))

WebUI.click(findTestObject('SPFx/Login to Account/Submit - Yes'))

WebUI.refresh()

WebUI.delay(8)

WebUI.refresh()

WebUI.delay(8)

WebUI.refresh()

WebUI.delay(8)

WebUI.refresh()

WebUI.delay(8)

WebUI.refresh()

WebUI.delay(8)

WebUI.click(findTestObject('SPFx/Create Leave/Leave tab'))

not_run: WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.selectOptionByValue(findTestObject('SPFx/Create Leave/Leave Type'), 'CL', false)

WebUI.setText(findTestObject('SPFx/Create Leave/Start Date'), '24-12-2020')

WebUI.delay(2)

not_run: WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.setText(findTestObject('SPFx/Create Leave/End Date'), '24-12-2020')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('SPFx/Create Leave/From Session'), 'Whole Day', false)

WebUI.selectOptionByValue(findTestObject('SPFx/Create Leave/To Session'), 'Whole Day', false)

WebUI.setText(findTestObject('SPFx/Create Leave/Reason'), 'CL Leave')

WebUI.delay(2)

WebUI.mouseOver(findTestObject('SPFx/Create Leave/Create Leave Button'))

WebUI.click(findTestObject('SPFx/Create Leave/Create Leave Button'))

not_run: WebUI.delay(2)

not_run: WebUI.refresh()

