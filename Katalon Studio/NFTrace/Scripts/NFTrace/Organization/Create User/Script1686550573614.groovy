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

WebUI.click(findTestObject('Object Repository/Page_NFTrace - Users/button_Create User'))

WebUI.setText(findTestObject('Object Repository/Page_NFTrace - Users/input__firstName'), 'Hasan')

WebUI.setText(findTestObject('Object Repository/Page_NFTrace - Users/input__lastName'), 'Isla')

WebUI.setText(findTestObject('Object Repository/Page_NFTrace - Users/input__email'), 'Hasan@gotgel.org')

WebUI.setText(findTestObject('Object Repository/create user/Page_NFTrace - Users/input__phone'), '9635875563')

WebUI.click(findTestObject('Object Repository/Page_NFTrace - Users/input_Wallet Address_form-check-input'))

WebUI.click(findTestObject('create user/Page_NFTrace - Users/input_Wallet Address_form-check-input'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NFTrace - Users/input__password'), 'lt7kXPiIKwaT+RdC1Uoh9g==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NFTrace - Users/input__confirmPassword'), 'lt7kXPiIKwaT+RdC1Uoh9g==')

WebUI.uploadFile(findTestObject('image/image/input__file upload_file'), 'C:\\Users\\MD Rahil\\Desktop\\NFTrace images\\download.jpg')

WebUI.click(findTestObject('create user/Page_NFTrace - Users/button_Submit'))

