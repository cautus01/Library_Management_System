# 도서관 관리 시스템


## 프로젝트 개요

**진행기간 : 2020.9.22 ~ 2020.11.16**
 
**주요내용**
 
- **도서관 관리 시스템의 ER-model을 설계하고 ER-diagram을 그리기**

- **ER-Diagram을 토대로 TABLE 생성 , DATA 삽입 , SQL쿼리를 실행하기**

- **JDBC를 이용하여 다음의 쿼리의 결과를 응용프로그램 단계에서 출력하기**

**사용한 skill : ER-model, ER-diagram, PostgreSQL, JDBC**

**어려웠던점: ER-model을 설계하고 ER-Diagram을 그릴 때, 속성들의 관계 설정에 어떻게할지 고민을 많이 했으며, 실제 도서관 시스템이 어떻게 돌아가는지 조사해 해결하였다.**

**결과 : JDBC로 쿼리의 결과를 출력하였다.**

## 도서관 관리 시스템 ER-diagram [LINK](https://github.com/cautus01/Library_Management_System/tree/main/ER-diagram)

![캡처](https://user-images.githubusercontent.com/69049801/154909219-0fe52fa6-d4d4-45be-9814-8c8824b4bc89.PNG)

- entity set

- relationship set

## PostgreSQL로 TABLE 생성 , DATA 삽입 , SQL쿼리를 실행하기

1. 현재 만들어진 테이블 목록 출력

2. 각각의 테이블의 정보

- book 테이블 정보

- member 테이블 정보

- notbook 테이블 정보

- reservation 테이블 정보

- room 테이블 정보

- seats 테이블 정보

3. 만들어진 모든 테이블에 대해 모든 데이터를 조회하는 select문

- book 테이블의 모든 데이터를 출력

- member 테이블의 모든 데이터를 출력

- notbook 테이블의 모든 데이터를 출력

- reservation 테이블의 모든 데이터를 출력

- room 테이블의 모든 데이터를 출력

- seats 테이블의 모든 데이터를 출력

4. 특정 테이블의 특정 컬럼만 조회하는 select문 3개
- select bookid, pub from book;
 : book테이블에서 bookid, pub 컬럼을 선택하고 보여준다.

![image](https://user-images.githubusercontent.com/69049801/158011463-ac6b8aa7-f512-420c-9244-edd43d3a3cb7.png)

- select ntitle, npub from notbook;
: notbook테이블에서 bookid, pub 컬럼을 선택하고 보여준다.

![image](https://user-images.githubusercontent.com/69049801/158011473-9f6576b8-0a7c-45b1-905a-a86cf5d8bd9d.png)

- select name, address from member;
: member테이블에서 name, address 컬럼을 선택하고 보여준다.

![image](https://user-images.githubusercontent.com/69049801/158011484-a2bf5512-0a20-4b7f-b427-3595536a486f.png)

