echo %TIME%
cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-svc-maven-plugin:1.1-SNAPSHOT:uml-to-asciidoctor -Dtag="%1"
cd scripts
echo %TIME%