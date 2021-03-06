# 프론트앤드

- 폴더 : /frontend
- 버전 : vue 3.0.0

## 실행순서
1) dependency 다운로드 

```npm install```



2) 자체 서버 실행

```npm run serve```
* 자체 서버 실행시 API는 서버에 있는 API를 Call 하는 형태(백엔드와 별도로 동작)



3) 프론트앤드 빌드 ( → ../src/main/resources/static 백앤드 리소스 폴더로  vue.config.js에 설정)

```npm run build```



## 백앤드랑 통신
- axios 이용
- main.js에서 axios baseURL 설정가능 : 현재 디플로이된 서버로 되어있으나, 로컬에서 백엔드 실행시 localhost로 변경

## App.vue 초간단 설명
1) template은 html 영역 (단, v-model, v-for 등 추가적인 문법 사용 가능)
2) script는 Javascript 영역
3) style은 CSS 영역  


→ 모듈화해서 사용하는 것이 일반적 vue파일 import 하는 방식






# 백앤드
- 버전 : springboot 2.6.1
- JDBC 드라이버로 localhost의 MariaDB와 연결되도록 설정되어, 
   로컬에 MariaDB 설치가 안되어있다면 WAS 오류 발생
  DB설정 정보 : /src/main/resources/application.properties

## 실행순서
1) /frontend에서 npm install, npm run build로 빌드 먼저 진행
2) spring-boot 빌드

```mvn clean instll```
  * 이때, /target에 jar파일로 빌드됨
3) spring-boot 내장 tomcat으로 WAS 실행

```mvn spring-boot:run```
   - spring security가 적용되어 login이 안 된 경우 특정 url만 접근가능하도록 설정됨
   - http://localhost/index.html 으로 페이지확인 또는 http://localhost/lotto/1 등으로 api 확인 가능

## 도커 실행
 - spring-boot+Vue.js 웹 어플리케이션 단독 Docker 정보

  ① /Dockerfile

     - open jdk를 이용해서 /target에 있는 빌드된 웹 어플리케이션을 java -jar 로 실행


  ② /docker-compose.yml

   - docker official image인 MariaDB를 이용해 DB, Web application 통합 구성 

     docker-compose up으로 자동 실행



##  로그 
spring-boot 로그는 log4j 활용
/logs에 .log 파일로 남긴 후 .gz으로 압축 관리

## DB 
MariaDB 로컬에 설치 필요
/init 폴더에 로또 사이트에서 크롤링한 DB DDL 파일 위치