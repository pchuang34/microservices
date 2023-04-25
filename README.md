# microservices
## Requirement
* Postman
* Docker
* Minikube
## Getting Started
### Local Development
* `docker compose up -d postgres pgadmin zipkin rabbitmq`
### Docker
* `docker compose up -d`
### Kubernetes
Start Minikube
* `minikube start --memory=4g`

Create Postgres, Zipkin & Rabbitmq Services
* `kubectl apply -f bootstrap/postgres`
* `kubectl apply -f bootstrap/zipkin`
* `kubectl apply -f bootstrap/rabbitmq`

Create Customer, Fraud & Notification Services
* `kubectl apply -f services/customer`
* `kubectl apply -f services/fraud`
* `kubectl apply -f services/notification`
## Notes
* customer service is a loadbalancer
* show zipkin dependencies?