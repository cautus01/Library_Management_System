# 도서관 관리 시스템


## 프로젝트 개요

> **진행기간 : 2020.9.22 ~ 2020.11.16**
> 
> **주요내용**
> 
>> **도서관 관리 시스템의 ER-model을 설계하고 ER-diagram을 그리기**
>>
>> **ER-Diagram을 토대로 TABLE 생성 , DATA 삽입 , SQL쿼리를 실행하기**
>>
>> **JDBC를 이용하여 다음의 쿼리의 결과를 응용프로그램 단계에서 출력하기**
>>
> 
> **사용한 skill : ER-model, ER-diagram, PostgreSQL, JDBC**<br/><br/>  

## 도서관 관리 시스템 ER-diagram

![캡처](https://user-images.githubusercontent.com/69049801/154913713-6ed44ab2-a7fd-4fd7-ad28-3ca88bd0f93a.PNG)

### entity set

책 entity set, 회원 entity set, 비도서 entity set, 열람실 entity set, 좌석 entity set 가 있다.

#### 책 entity set

책 entity set은 책에 대한 정보들을 entity로 가지며 attribute로는 도서번호, 제목, 저자, 출판사, 청구번호, ISBN을 가지고 있다. key는 도서번호이다. 청구번호는 중복 가능하다고 가정했다.

#### 회원 entity set

회원 entity set은 회원에 대한 정보들을 entity로 가지며 attribute로는 회원번호, 이름, 주소, 생년월일, 이메일, 휴대폰번호를 가지고 있다. key는 회원번호이다.

#### 비도서 entity set

비도서 entity set은 비도서에 대한 정보들을 entity로 가지며 attribute로는 비도서번호, 자료명, 발행처, 발행년도, 청구기호를 가지고 있다. key는 비도서번호이다.

#### 열람실 entity set

회원 entity set은 회원에 대한 정보들을 entity로 가지며 attribute로는 회원번호, 이름, 주소, 생년월일, 이메일, 휴대폰번호를 가지고 있다. key는 회원번호이다.

#### 좌석 entity set

열람실 entity set은 열람실에 대한 정보들을 entity로 가지며 attribute로는 열람실명, 좌석수, 운영시작시간, 운영종료시간을 가지고 있다. key는 열람실명이다. 열람실 중 운영시작시간과 운영종료시간이 다른 것이 몇 개 있다고 가정했다.

https://github.com/cautus01/Library_Management_System/tree/main/ER-diagram<br/><br/> 에서 자세한 내용을 볼 수 있다.

## PostgreSQL로 TABLE 생성 , DATA 삽입 , SQL쿼리를 실행하기


