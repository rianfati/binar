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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('D:\\Android\\fore.apk', true)

Mobile.swipe(170, 1642, 1017, 1642)
Mobile.tap(findTestObject('fore/xbutton'), 0)
Mobile.tap(findTestObject('fore/xbutton2'), 0)
if (Mobile.verifyElementExist(findTestObject('fore/xbuttonlanjut'), 2, FailureHandling.OPTIONAL)){
	Mobile.tap(findTestObject('fore/xbuttonlanjut'), 0)
	Mobile.tap(findTestObject('fore/allowbutton'), 0)
}
else {
	Mobile.tap(findTestObject('fore/storelocation'), 0)
}

Mobile.tap(findTestObject('fore/manuka'), 0)
Mobile.tap(findTestObject('fore/manukaamericano'), 0)
Mobile.tap(findTestObject('fore/iced'), 0)
Mobile.tap(findTestObject('fore/icecube'), 0)
Mobile.tap(findTestObject('fore/lessice'), 0)
Mobile.swipe(170, 1642, 170, 642)
Mobile.tap(findTestObject('fore/syrup'), 0)
Mobile.tap(findTestObject('fore/aren'), 0)
Mobile.swipe(170, 1642, 170, 642)
Mobile.tap(findTestObject('fore/keranjang'), 0)
Mobile.tap(findTestObject('fore/coffee'), 0)
Mobile.tap(findTestObject('fore/espresso'), 0)
Mobile.verifyElementText(findTestObject('fore/espressoprice'), 'Rp 17.000')
Mobile.swipe(170, 1642, 170, 642)
Mobile.tap(findTestObject('fore/keranjang'), 0)
Mobile.tap(findTestObject('fore/cart'), 0)
if (Mobile.getText(findTestObject('fore/qty'), 0)== '1' && Mobile.getText(findTestObject('fore/qty2'), 0)== '1'){
	System.out.println('PASS')
}
else {
	System.out.println('ERROR')
}
Mobile.tap(findTestObject('fore/tambahlagi'), 0)
//Mobile.swipe(100, 1642, 100, 642)
//Mobile.tap(findTestObject('fore/merchandise'), 0)
//Mobile.tap(findTestObject('fore/stainlessstraw'), 0)
//Mobile.swipe(170, 1642, 170, 642)
//Mobile.tap(findTestObject('fore/keranjang'), 0)
Mobile.tap(findTestObject('fore/pesan'), 0)
Mobile.setText(findTestObject('fore/nomorponsel'), '098762', 0)
Mobile.tap(findTestObject('fore/ceknomor'), 0)





