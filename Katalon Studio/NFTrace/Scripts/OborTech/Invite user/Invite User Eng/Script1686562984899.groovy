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

WebUI.navigateToUrl('https://st-login.obortech.io/login')

WebUI.click(findTestObject('Object Repository/create user/Page_OBORTECH - Admin Login/input_Welcome Back_username'))

WebUI.setText(findTestObject('Object Repository/create user/Page_OBORTECH - Admin Login/input_Welcome Back_username'), 'obortech')

WebUI.setEncryptedText(findTestObject('Object Repository/create user/Page_OBORTECH - Admin Login/input_Welcome Back_password'), 
    'se//74IT7ufqnxLE0o0JPg==')

WebUI.click(findTestObject('Object Repository/create user/Page_OBORTECH - Admin Login/button_Continue'))

WebUI.setEncryptedText(findTestObject('Object Repository/create user/Page_OBORTECH - Admin Login/input_Welcome Back_transactionPassword'), 
    'FbF8m2q+6a9AfB6vyD1YbQ==')

WebUI.click(findTestObject('Object Repository/create user/Page_OBORTECH - Admin Login/button_Continue'))

WebUI.click(findTestObject('Object Repository/create user/Page_OBORTECH - Project Listing/a_obortech'))

WebUI.click(findTestObject('Object Repository/create user/Page_OBORTECH - Project Listing/a_Organizations  Users'))

WebUI.click(findTestObject('Object Repository/create user/Page_OBORTECH - Manage Organization/button_INVITE USER'))

WebUI.setText(findTestObject('Object Repository/create user/Page_OBORTECH - Manage Organization/input_First Name_firstName'), 
    'kreek')

WebUI.setText(findTestObject('Object Repository/create user/Page_OBORTECH - Manage Organization/input_Last Name_lastName'), 
    'breek')

WebUI.setText(findTestObject('Object Repository/create user/Page_OBORTECH - Manage Organization/input_Email Address_email'), 
    'kreek@gotgel.org')

WebUI.click(findTestObject('Object Repository/create user/Page_OBORTECH - Manage Organization/button_SEND INVITE'))

WebUI.click(findTestObject('Object Repository/create user/Page_OBORTECH - Manage Organization/button_OK'))

