# 도서관 관리 시스템 ER-diagram

![캡처](https://user-images.githubusercontent.com/69049801/154909219-0fe52fa6-d4d4-45be-9814-8c8824b4bc89.PNG)

## entity set

책 entity set, 회원 entity set, 비도서 entity set, 열람실 entity set, 좌석 entity set 가 있다.

### 책 entity set

책 entity set은 책에 대한 정보들을 entity로 가지며 attribute로는 도서번호, 제목, 저자, 출판사, 청구번호, ISBN을 가지고 있다. key는 도서번호이다. 청구번호는 중복 가능하다고 가정했다.

### 회원 entity set

회원 entity set은 회원에 대한 정보들을 entity로 가지며 attribute로는 회원번호, 이름, 주소, 생년월일, 이메일, 휴대폰번호를 가지고 있다. key는 회원번호이다.

### 비도서 entity set

비도서 entity set은 비도서에 대한 정보들을 entity로 가지며 attribute로는 비도서번호, 자료명, 발행처, 발행년도, 청구기호를 가지고 있다. key는 비도서번호이다.

### 열람실 entity set

회원 entity set은 회원에 대한 정보들을 entity로 가지며 attribute로는 회원번호, 이름, 주소, 생년월일, 이메일, 휴대폰번호를 가지고 있다. key는 회원번호이다.

### 좌석 entity set

열람실 entity set은 열람실에 대한 정보들을 entity로 가지며 attribute로는 열람실명, 좌석수, 운영시작시간, 운영종료시간을 가지고 있다. key는 열람실명이다. 열람실 중 운영시작시간과 운영종료시간이 다른 것이 몇 개 있다고 가정했다.

## relationship set

### 대여 relationship set

책 entity set와 회원 entity set은 대여라는 relationship set으로 이어져 있으며 이 대여는‘회원 entity set의 entity가 책 entity set의 entity를 대여한다’라는 뜻을 지닌다.
대여 relationship set의 attribute로는 언제 대출하였는지, 언제 반납했는지, 언제까지 반납해야 하는지, 연체기간은 얼마인지, 연체료는 얼마인지를 나타내는 대출일, 반납일, 반납예정일, 연체기간, 연체료라는 attribute를 가지고 있다.

### 예약 relationship set

책 entity set과 회원 entity set은 예약이라는 relationship set으로 이어져 있으며 이 예약는‘회원 entity set의 entity가 책 entity set의 entity를 예약한다’라는 뜻을 지닌다. 
예약 relationship set의 attribute로는 언제 예약했는지, 몇 번째 순서로 예약했는지를 나타내는 예약날짜, 예약순서라는 attribute를 가지고 있다.

### 이용 relationship set
회원 entity set과 열람실 entity set은 이용이라는 relationship set으로 이어져 있으며 이 이용은 ‘회원 entity set의 entity가 열람실 entity set의 entity를 예약한다’라는 뜻을 지닌다.
이용 relationship set의 attribute로는 이용한 날이 언제인지, 입실한 시간이 언제인지, 퇴실한 시간이 언제인지를 나타내는 이용날짜, 입실시간, 퇴실시간이라는 attribute를 가지고 있다.

### 관내대출 relationship set
회원 entity set과 비도서 entity set은 관내대출이라는 relationship set으로 이어져 있으며이 관내대출은 ‘회원 entity set의 entity가 비도서 entity set의 entity를 관내대출한다’라는 뜻을 지닌다. 관내대출 relationship set의 attribute로는 관내대출한 날이 언제인지, 대출한 시간이 언제인지, 반납한 시간이 언제인지, 연체시간이 얼마인지, 반납예정시간은 언제인지, 연체료는 얼마인지를 나타내는 관내대출일, 대출시간, 연체시간, 반납예정시간, 반납시간, 연체료라는
attribute를 가지고 있다. 비도서는 관내대출만 가능하고, 반납하기 전에는 도서관을 나갈 수 없다라고 가정했다.

### 가지고 있다 relationship set

열람실 없이는 좌석이 존재할 수 없다.열람실 entity set과 좌석 entity set은 가지고있다 라는 relationship set으로 이어져 있으며좌석 entity set은 열람실 entity set에 항상 의존적이다.
열람실 entity set의 entity가 좌석 entity set의 entity를 가지고있다 라는 뜻이다.
