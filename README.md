# E-Commerce Microservices Project

## 📌 Overview

This project demonstrates a basic microservices architecture using Spring Boot and Spring Cloud.

## 🧩 Services

* **Service Discovery (Eureka Server)**
* **Inventory Service**
* **Order Service**
* **API Gateway**

## 🔄 Architecture Flow

Client → API Gateway → Order Service → Inventory Service → Response

## ⚙️ Technologies Used

* Java 21
* Spring Boot 3.2.5
* Spring Cloud 2023.0.1
* Eureka Server
* Spring Cloud Gateway
* REST APIs

## 🌐 API Endpoints

### Inventory Service

http://localhost:8080/test

### Order Service

http://localhost:8081/order

### API Gateway

http://localhost:8085/order/order

## ✅ Features

* Microservices architecture
* Service discovery using Eureka
* API Gateway routing
* Inter-service communication using RestTemplate

## 🚀 Future Enhancements

* Payment Service
* Notification Service
* Config Server
* Kafka integration
* Docker & Kubernetes deployment

## 👨‍💻 Author

Selva Kumar
