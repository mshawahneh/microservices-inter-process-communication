#!/bin/bash
docker rmi $(docker images -qa -f 'dangling=true')
docker login {dockerhub}
for service in 'experiment-micro-service1' 'experiment-micro-service2' 'experiment-micro-service3' 'experiment-micro-service4' 'experiment-micro-service5' 'experiment-micro-service6' 'experiment-micro-service7' 'experiment-discovery-service' 'experiment-api-gateway'
do
  docker pull {dockerhub}/$service
done
docker-compose down
docker-compose up --no-start
docker-compose start