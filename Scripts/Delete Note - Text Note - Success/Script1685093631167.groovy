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

Mobile.startExistingApplication('com.socialnmobile.dictapps.notepad.color.note')

Mobile.tap(findTestObject('Object Repository/createNote/simpleNote/add_Button'), 0)

Mobile.tap(findTestObject('Object Repository/createNote/simpleNote/add_Text'), 0)

inputTitle = CustomKeywords.'master.randomNumber.genRandomNumber'('Text Note for Delete ', 4)

Mobile.setText(findTestObject('Object Repository/createNote/simpleNote/input_Title_forNote'), inputTitle, 0)

Mobile.setText(findTestObject('Object Repository/createNote/simpleNote/input_Description_forNote'), 'Please edit text', 
    0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.tapAndHold(findTestObject('deleteNote/TextNoteToDelete'), 0, 0)

Mobile.tap(findTestObject('Object Repository/deleteNote/button_Delete'), 0)

Mobile.tap(findTestObject('Object Repository/deleteNote/button_Ok_Delete'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

