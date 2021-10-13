@ECHO OFF

SET baseDir=C:\future\Thesis\git\microservices-inter-process-communication\experiment-micro-service

FOR %%A in (1 2 3 4 5 6 7) DO (

cd %baseDir%%%A
mvn clean install -DskipTests

ECHO Done with service%%A

)

cd C:\future\Thesis\git\microservices-inter-process-communication\experiment-api-gateway
mvn clean install -DskipTests

ECHO Done with Gateway

cd C:\future\Thesis\git\microservices-inter-process-communication\experiment-discovery-service
mvn clean install -DskipTests

ECHO Done with Discovery 
echo 'Now Done All services Done
pause