set projectLocation=%cd%
cd %projectLocation%
java -cp  bin;lib\*; org.testng.TestNG testng.xml 
pause
