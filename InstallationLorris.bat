cd C:Desktop
mkdir run
cd run
call mvn scm:checkout -DconnectionUrl=scm:git:https://github.com/BenKapoor/CliniqueMaven
cd target
cd checkout
cd CliniqueMaven
call mvn clean
call mvn package
cd CliniqueMavenPRESENTATION
cd target
