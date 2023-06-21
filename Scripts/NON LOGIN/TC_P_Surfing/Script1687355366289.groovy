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

Mobile.startExistingApplication('com.brilife.myacces')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'btn - home_nab'
Mobile.tap(findTestObject('Object Repository/NON LOGIN/Surfing/android.widget.TextView - NAB Harian'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'btn - nab_harian'
Mobile.tap(findTestObject('Object Repository/NON LOGIN/Surfing/android.widget.TextView - Harian'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'btn - nab_bulanan'
Mobile.tap(findTestObject('Object Repository/NON LOGIN/Surfing/android.widget.TextView - Bulanan'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'btn - nab_tahunan'
Mobile.tap(findTestObject('Object Repository/NON LOGIN/Surfing/android.widget.TextView - Tahunan'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'btn - nab_back'
Mobile.tap(findTestObject('Object Repository/NON LOGIN/Surfing/android.widget.ImageView'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'btn - home_produk brilife'
Mobile.tap(findTestObject('Object Repository/NON LOGIN/Surfing/android.widget.TextView - Produk BRI Life'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'btn - produk_perlindungan jiwa & kesehatan'
Mobile.tap(findTestObject('Object Repository/NON LOGIN/Surfing/android.widget.TextView - PERLINDUNGAN JIWA  KESEHATAN'), 
    10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'btn - detail produk_amkkm'
Mobile.tap(findTestObject('Object Repository/NON LOGIN/Surfing/android.widget.TextView - Asuransi Mikro Kesehatan Kecelakaan Meninggal (AMKKM)'), 
    10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'btn - detail produk_back'
Mobile.tap(findTestObject('NON LOGIN/Surfing/android.widget.ImageView (1)'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'btn - produk_back'
Mobile.tap(findTestObject('NON LOGIN/Surfing/btn - produk_back'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'btn - produk_back_home'
Mobile.tap(findTestObject('NON LOGIN/Surfing/btn - produk_back_home'), 10)

Mobile.closeApplication()

