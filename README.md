# SpringCloudStudy
Kafka를 포함한 MSA 아키텍처 도입을 위한 Spring Cloud Study.

# 참고자료
- 블로그 포스트 : https://tmdrl5779.tistory.com/category/Programming/MSA?page=2  
- GitHub
  - https://github.com/in28minutes/spring-microservices-v3
  - Spring Boot 3.0+ - https://github.com/in28minutes/spring-microservices-v3
  - Spring Boot 2.4+ - https://github.com/in28minutes/spring-microservices-v2

# URLs
Initial

- http://localhost:8765/CURRENCY-EXCHANGE/currency-exchange/from/USD/to/INR

- http://localhost:8765/CURRENCY-CONVERSION/currency-conversion/from/USD/to/INR/quantity/10

- http://localhost:8765/CURRENCY-CONVERSION/currency-conversion-feign/from/USD/to/INR/quantity/10



Lower Case

- http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/INR

- http://localhost:8765/currency-conversion/currency-conversion/from/USD/to/INR/quantity/10

- http://localhost:8765/currency-conversion/currency-conversion-feign/from/USD/to/INR/quantity/10



Custom Routes

- http://localhost:8765/currency-exchange/from/USD/to/INR

- http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10

- http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10

- http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10