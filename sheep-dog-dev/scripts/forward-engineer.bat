cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.8-SNAPSHOT:asciidoctor-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.8-SNAPSHOT:uml-to-cucumber-guice -Dtag="%1"
cd scripts 