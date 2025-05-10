# ToyElasticSearch

## 프로젝트 소개
이 프로젝트는 ElasticSearch를 사용하여 CS 지식을 검색할 수 있는 기능을 구현하는 토이 프로젝트이다. Spring Boot를 기반으로 개발되었으며, Docker를 통해 ElasticSearch를 쉽게 구성할 수 있도록 한다.

## 기술 스택
- Java 21
- Spring Boot 3.4.5
- ElasticSearch 8.12.1
- Docker & Docker Compose
- Gradle

## 시작하기

### 필수 조건
- Java 21
- Docker 및 Docker Compose

### ElasticSearch 실행
```bash
cd docker
docker-compose -f docker-compose-elasticsearch.yml up -d
```

### 애플리케이션 실행
```bash
cd demo
./gradlew bootRun
```

## ElasticSearch 접속 정보
- URL: http://localhost:9200

## 주요 기능
- CS 지식 데이터 인덱싱 및 검색 기능
- 알고리즘, 데이터베이스, 네트워크, 운영체제 등 CS 관련 자료 검색
- Nori 형태소 분석기를 통한 한글 검색 지원