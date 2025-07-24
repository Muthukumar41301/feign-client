# Feign Client in Spring Boot

## What is Feign Client?  
**Feign Client** is a declarative web service client developed by Netflix and integrated into the Spring Cloud ecosystem.  
It simplifies HTTP communication between microservices by allowing you to define REST API calls through **Java interfaces** and annotations, eliminating the need for boilerplate code like `RestTemplate` or `WebClient`.

---

## Key Features
- ✅ **Declarative REST Client** – Define interfaces with annotations; no manual HTTP handling.  
- ✅ **Integration with Eureka & Ribbon** – Supports service discovery and client-side load balancing.  
- ✅ **Seamless with Spring Cloud** – Works with Spring Boot auto-configuration.  
- ✅ **Supports Interceptors** – Add logging, authentication, or custom headers easily.  
- ✅ **Resilience4j/Hystrix Integration** – Enables circuit breakers and fault tolerance.

---

## How Feign Works
1. Define an interface with Feign annotations.  
2. Feign generates a runtime implementation for the interface.  
3. The generated implementation makes REST API calls to the target service.
