cd ..
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=false -DallowDowngrade=true
call mvn org.farhan:sheep-dog-mgmt-maven-plugin:1.14:prepare -DpreparationGoals=deploy
call git push
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=true
call git add *
call git commit -m "Upgrading dependency versions"
call git push
call mvn deploy -DskipTests
cd scripts 