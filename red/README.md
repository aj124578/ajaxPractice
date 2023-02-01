# 스프링부트 MVC 공부하기

## 기술스택
- 스프링부트 2.7.7
- h2 db 사용 (인메모리 DB )
## 라이브러리
```gradle
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	compileOnly 'org.projectlombok:lombok'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	runtimeOnly 'com.h2database:h2'
	annotationProcessor 'org.projectlombok:lombok'
```

## 테이블 스키마
```sql
create table product(
    id int auto_increment primary key,
    name varchar not null unique,
    price int not null,
    qty int not null,
    createdAt timestamp
);
```

## 더미 데이터
```SQL
insert into product(name, price, qty, createdAt) values('바나나', 1000, 50, now());
insert into product(name, price, qty, createdAt) values('사과', 2000, 100, now());
insert into product(name, price, qty, createdAt) values('딸기', 3000, 150, now());
commit;
```