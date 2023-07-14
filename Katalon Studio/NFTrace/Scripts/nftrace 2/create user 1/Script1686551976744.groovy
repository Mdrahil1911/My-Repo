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

WebUI.navigateToUrl('https://app.ccltrace.com/login')

WebUI.setText(findTestObject('Object Repository/Page_/input_Email_email'), 'cclorganisation@chaincodeconsulting.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_password'), 'lt7kXPiIKwaT+RdC1Uoh9g==')

WebUI.click(findTestObject('Object Repository/Page_/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_NFTrace - Users/button_Create User'))

WebUI.setText(findTestObject('Object Repository/Page_NFTrace - Users/input__firstName'), 'kevin')

WebUI.setText(findTestObject('Object Repository/Page_NFTrace - Users/input__lastName'), 'geaorge')

WebUI.setText(findTestObject('Object Repository/Page_NFTrace - Users/input__email'), '')

WebUI.setText(findTestObject('Object Repository/Page_NFTrace - Users/input__email'), 'kevin@gotgel.org')

WebUI.setText(findTestObject('Object Repository/Page_NFTrace - Users/input_Wallet Address_form-check-input'), '+91 95350-05632')

WebUI.click(findTestObject('Object Repository/Page_NFTrace - Users/input_Wallet Address_form-check-input'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NFTrace - Users/input__password'), 'lubJgWeNoDywD0cxuuK8nQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NFTrace - Users/input__confirmPassword'), 'lubJgWeNoDywD0cxuuK8nQ==')

