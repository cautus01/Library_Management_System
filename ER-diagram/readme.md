# 도서관 관리 시스템 ER-diagram

![캡처](https://user-images.githubusercontent.com/69049801/154909219-0fe52fa6-d4d4-45be-9814-8c8824b4bc89.PNG)

## entity set

책 entity set, 회원 entity set, 비도서 entity set, 열람실 entity set, 좌석 entity set 가 있다.

### 책 entity set

책 entity set은 책에 대한 정보들을 entity로 가지며 attribute로는 도서번호, 제목, 저자, 출판사, 청구번호, ISBN을 가지고 있다. key는 도서번호이다. 청구번호는 중복 가능하다고 가정했다.

### 회원 entity set

회원 entity set은 회원에 대한 정보들을 entity로 가지며 attribute로는 회원번호, 이름, 주소, 생년월일, 이메일, 휴대폰번호를 가지고 있다. key는 회원번호이다.
