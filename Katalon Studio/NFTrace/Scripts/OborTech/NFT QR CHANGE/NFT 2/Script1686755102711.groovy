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

WebUI.navigateToUrl('https://login.obortech.io/login')

WebUI.setText(findTestObject('Object Repository/Page_OBORTECH - Admin Login/input_Welcome Back_username'), 'Jason@123')

WebUI.click(findTestObject('Object Repository/Page_OBORTECH - Admin Login/div_Welcome Back_col-lg-6 d-none d-lg-block_6de795'))

WebUI.setText(findTestObject('Object Repository/Page_OBORTECH - Admin Login/input_Welcome Back_username'), 'JASON')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OBORTECH - Admin Login/input_Welcome Back_password'), 'wNQlMm1+XEytEz4qTt15cA==')

WebUI.click(findTestObject('Object Repository/Page_OBORTECH - Admin Login/button_Continue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OBORTECH - Admin Login/input_Welcome Back_transactionPassword'), 
    'QafbsybhDy2e2IMw696fNg==')

WebUI.click(findTestObject('Object Repository/Page_OBORTECH - Admin Login/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_OBORTECH - Manage Events/span_Transporter  Jason'))

WebUI.doubleClick(findTestObject('Object Repository/Page_OBORTECH - Manage Events/a_Choco chip Project'))

WebUI.click(findTestObject('Object Repository/Page_OBORTECH - Manage Events/div_All Group 1'))

WebUI.click(findTestObject('Object Repository/Page_OBORTECH - Manage Events/div_Wakeland'))

WebUI.click(findTestObject('Object Repository/Page_OBORTECH - Manage Events/button_CREATE Item'))

WebUI.setText(findTestObject('Object Repository/Page_OBORTECH - Manage Events/input_Add Code_itemName'), 'NEER')

WebUI.doubleClick(findTestObject('Object Repository/Page_OBORTECH - Manage Events/i_Add Code_fas fa-qrcode'))

WebUI.click(findTestObject('Object Repository/Page_OBORTECH - Manage Events/button_Done'))

WebUI.click(findTestObject('Object Repository/Page_OBORTECH - Manage Events/button_SUBMIT'))

WebUI.click(findTestObject('Object Repository/Page_OBORTECH - Manage Events/i_Add Code_fas fa-qrcode'))

WebUI.click(findTestObject('Object Repository/Page_OBORTECH - Manage Events/b_Generate QR code'))

