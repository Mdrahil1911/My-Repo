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

WebUI.click(findTestObject('Object Repository/logout page/a_Organizations'))

WebUI.click(findTestObject('NFTrace - Organizations/button_Create Organization'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/NFTrace - Organizations/input__organizationName'), 'LPU UNIVERSITY')

WebUI.selectOptionByIndex(findTestObject('NFTrace - Organizations/select_Select Organization typeSupply Chain_735ca9'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/NFTrace - Organizations/input__email'), 'LPU@gotgel.org')

WebUI.setText(findTestObject('Object Repository/NFTrace - Organizations/input__phone'), '9535225612')

WebUI.setEncryptedText(findTestObject('Object Repository/NFTrace - Organizations/input__password'), 'lubJgWeNoDywD0cxuuK8nQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/NFTrace - Organizations/input__confirmPassword'), 'lubJgWeNoDywD0cxuuK8nQ==')

WebUI.uploadFile(findTestObject('image/image/input__file upload_file'), 'C:\\Users\\MD Rahil\\Desktop\\NFTrace images\\reva.jpg')

WebUI.click(findTestObject('Object Repository/NFTrace - Organizations/button_Submit'))

