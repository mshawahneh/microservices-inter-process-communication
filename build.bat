@ECHO OFF
cd C:\future\Thesis\git\microservices-inter-process-communication\experiment-api-gateway
call mvn clean install -DskipTests
ECHO Done with Gateway
cd C:\future\Thesis\git\microservices-inter-process-communication\experiment-discovery-service
call mvn clean install -DskipTests
ECHO Done with Discovery 
SET baseDir=C:\future\Thesis\git\microservices-inter-process-communication\experiment-micro-service
FOR %%A in (1 2 3 4 5 6 7) DO (
cd %baseDir%%%A
call mvn clean install -DskipTests
ECHO Done with service%%A
)
echo 'Now Done All services Done
pause