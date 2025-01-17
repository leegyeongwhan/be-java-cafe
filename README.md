# be-java-cafe

# 학습 계획

- 3단계 까지 진행하면서 예상되는 학습 키워드와, 궁금한 점을 답변해보고 채워본다.
- 김영한님 강의 스프링 기본편, mvc1편을 참고해서 학습한다.
- mvc와 스프링 기본원리에 대해 생각해보며 학습한다.

## 스프링 부트,스프링

### 스프링

- 스프링(Spring)은 자바 기반의 오픈 소스 프레임워크로, 엔터프라이즈급 애플리케이션을 개발하는 데 사용된다.
  스프링의 핵심기능인 DI(Dependency Injection), AOP(Aspect Oriented Programming), MVC(Model-View-Controller) 패턴 등 이 제공되며
  애플리케이션을 보다 유연하게 구성할 수 있도록 해준다. 스프링은 자바 기반의 프레임워크다.

### 스프링 부트

- 스프링 부트(Spring Boot)는 스프링 프레임워크 설정파일(Xml)를 사용하지않고 어노테이션 기반의 설정을 사용한다.
  결국 스프링 부트는 스프링부트는 스프링을 기반으로 개발된 프로젝트를 빠르게 구성할 수 있도록 도와주는 도구이다.

### 스프링에서 HTTP는 기본이다.

전에 cs에서 배운 내용을 토대로 복습한다.

> 참고자료 :https://gist.github.com/leegyeongwhan/f8d9c2fe74ce0e9a663edeeee795cec9

## 스프링 에서 웹 동작 방식을 알아보자.

- 웹어플리케이션 동작과정
  ![img_1.png](img_1.png)

- 서버에서 처리해야 하는 업무
  ![img.png](img.png)
  실제 비지니스 로직에 비해 해야 할 일이 너무 많다 -> 비효율적이다.
  그렇기 때문에 서블릿을 지원하는 WAS들이 비지니스 로직을 제외한 모든 기능을 제공한다.

## 웹 시스템의 구성

### WEB
- Http 기반으로 동작, 정적 리소스 제공
- HTML,CSS,JS
- APACHE
### WAS
HTTP 기반으로 동작
- 웹 서버 기능 포함 + (정적 리소스 제공 가능)
- 프로그램 코드를 실행해서 `애플리케이션 로직` 수행
- 동적 HTML, HTTP API(JSON)
- 서블릿, JSP, 스프링 MVC
- Tomcat
### DB

사실 WAS, DB 만으로 시스템 구성이 가능하다. WAS가 정적 리소스,어플리케이션 로직을 제공하기 때문이다.
하지만 WAS에 너무많은 일을시키면 서버 과부하 우려되고, 어플리케이션 로직은 비용이 비싸다.

![img_2.png](img_2.png)
그래서 정적 리소스와, 동적리소스를 나눠 처리한다.-> 효율적이다.
### 스프링 부트에서의 GET과 POST 메소드의 동작방식

## MVC

### MVC란 ?

## mustache

### mustache란?

### 템플릿 엔진은?

## backend

### backend란

backend란 정확히 무엇이며, 앞으로 backend개발자가 되면 무엇을 학습해야하고, 생태계를 알아본다.

## web과 spring

결국 스프링은 웹 사이트를 개발할 때 사용할 수 있는 도구이다. 웹 서비스의 구조와,웹 서버 아키텍쳐
,전체 구조에 대해 알아보자.

## DB

전에 cs에서 학습 한 내용을 기반으로 H2 DB에대해 학습한다.

### Spring과 DB

이제 Spring으로 제작한 App과 DB를 연결하고, 동작 방식을 학습한다.
마스터즈 2023 스프링 카페

### http중복 제거

> https://www.baeldung.com/web-mvc-configurer-adapter-deprecated

### OOP의 특징

### Solid 원칙

### Spring Triangle
## 1. 제어 역전
- 애플리케이션 실행 시점(런타임)에 외부에서 실제 구현 객체를 생성하고 클라이언트에 전달해서 클라이언트와 서버 실제 의존관계를 연결하는 것을 의존관꼐 
주입이라고 한다.
## 2. 관점 지향 프로그래밍 (AOP, Aspect Oriented Programming)
## 3. 추상화 서비스(PSA, Portable Service Abstraction)

### Dependency Injection(DI)
### log
로그를 상황에 맞게 잘 사용한다.

로그에 대해서도 공부해 본다. 생각보다 공부할게 많다.

> 참고자료 : https://pig-programming.tistory.com/51



### 피드백

## 1,2단계 피드백
- ++sequence 연산이 원자적으로 처리되지 않을 수 있다.
  예를 들어, 스레드1과 스레드2가 동시에 idIncrease() 메서드를 호출하면 두 스레드가 sequence 변수의 값을 동시에 읽어 1 증가시킨 후,
  각각의 결과를 반환할 수 있습니다. 그 결과, id 필드가 서로 다른 값을 가지게 되어 버그가 발생할 수 있습니다. 결론적으로
  static한 변수가 멀티스레드에서 안전한가? 서로 다른 스레드에서 같은 필드에 접근해 오류가 생길수있다.
  해결책은? -> AtomicLong 혹은 idIncrease()를 동기화 시켜주자.


- `store.stream().filter(article -> article.getId() == id).findAny();` ,`return store.stream().filter(member -> member.getId() == userId).findFirst();`
findAny와 findfirst의 차이는 병렬성차이.



### 해결
@modelAttribute에 관하여
> 참고자료 : https://hyeon9mak.github.io/model-attribute-without-setter/


처음 jdbc sql문 사용 너무 지저 분하고 가독성이 떨어짐
두번째 jdbc 템플릿 사용 가독성이 증가했지만 여전히 지저분하고 중복이 많음
세번째 BeanPropertyRowMapper 를 사용 중복을 많이제거함
