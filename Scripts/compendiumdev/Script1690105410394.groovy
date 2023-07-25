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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://compendiumdev.co.uk/')

Thread.sleep(2000)

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowTitle('Software Development, Testing and Marketing Consultancy')

WebUI.click(findTestObject('Object Repository/devcompedium/Page_Software Development, Testing and Mark_b9fb06/img'))

Thread.sleep(2000)

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/devcompedium/Page_Java For Testers Book by Alan Richards_5a8453/a_Home'))

Thread.sleep(2000)

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/devcompedium/Page_EvilTester.com/a_Blog'))

WebUI.closeBrowser()

