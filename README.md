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

![image](https://user-images.githubusercontent.com/69049801/158010926-ea1828c2-4076-4714-81f5-84a683be9db8.png)

2. 각각의 테이블의 정보

- book 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158010951-c784f64b-4f0f-4589-9e1f-d6990c9cfe33.png)

- member 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158010965-8c44d11d-9f50-4a05-a231-b4247826734c.png)

- notbook 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158010978-d23d0583-b3b0-4fd2-9f15-12959e40919e.png)

- reservation 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158010993-f3c3dedd-e243-4e0e-8281-19ab5959d2df.png)

-room 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158011009-a62f11c6-cd93-4e84-8bbf-2c79d0a7c2e2.png)



