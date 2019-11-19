mkdir C:\ProjetMavenTestSCM
cd C:\ProjetMavenTestSCM
:: Copie le projet
call mvn scm:checkout  -DconnectionUrl=scm:git:https://github.com/BenKapoor/CliniqueMaven.git 

cd target\checkout\CliniqueMaven

:: build
call mvn clean package

:: deploie
copy C:\ProjetMavenTestSCM\target\checkout\CliniqueMaven\CliniqueMavenPRESENTATION\target\CliniqueMavenPRESENTATION.war

:: call Mettre le chemin de tomcat/startup.bat

start chrome http://localhost:8080/CliniqueMavenPRESENTATION/
