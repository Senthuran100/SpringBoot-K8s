# SpringBoot-K8s
Tryout Sample spring boot and deploy in K8s(Minikube)

## **Steps to deploy the spring boot application in minikube**

* First Create a Spring boot project and implement a sample controller and test whether the spring boot application is working fine.
* Write a [docker file](https://github.com/Senthuran100/SpringBoot-K8s/blob/main/Dockerfile)
* Use the below command to build the docker file.

`docker build -t k8s-springboot .
`
* Then verify whether the image is created using the below command.

`docker images`
* Then push this to the dockerhub - This is an Optional step based on the image pull policy.

`docker push senthurandocker/k8s-springboot:latest`
* Create a [deployment.yaml](https://github.com/Senthuran100/SpringBoot-K8s/blob/main/deployment.yaml) file and specify the deployment and service
* Start the minikube.

`minikube start`
* Then execute the below command to create the deployment.

`kubectl apply -f deployment.yaml`
* Then check whether the pods, deployment and services are created.

`kubectl get all`
* Then test the spring boot application using the minikube address.

