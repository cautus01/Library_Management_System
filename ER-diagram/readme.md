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

## 키 제약조건

### 회원-책

- 대여 관계일 때 한 회원이 여러 책을 빌릴 수 있다. 하나의 책은 한 회원에게만 대여 가능하다. 따라서 책과 회원은 일대다(1-to-many) 관계이다.

- 예약 관계일 때 한 회원이 여러 책을 예약할 수 있고, 하나의 책은 여러 회원에게 예약 가능하다. 따라서 회원과 책은 다대다(many-to-many) 관계이다.

### 회원-열람실

한 회원은 하나의 열람실만 이용할 수 있다고 가정한다. 한 회원은 하나의 열람실만 이용할 수 있다. 하나의 열람실은 여러 회원이 이용할 수 있다. 따라서 회원과 열람실은 다대일(many-to-1) 관계이다.

### 회원-비도서

한 회원은 여러 개의 비도서를 빌릴 수 있다. 하나의 비도서는 한 회원에게만 빌려질 수 있다. 따라서 회원과 비도서는 일대다(1-to-many) 관계이다.

### 열람실-좌석

한 열람실은 여러 개의 좌석을 가질 수 있고 한 좌석은 하나의 열람실에만 존재한다. 따라서 열람실과 좌석은 일대다(1-to-many) 관계이다.

## 참여 제약조건

### 대여 관계일 때

각 회원이 적어도 한 책을 빌릴 필요는 없으며 각 책도 적어도 한 회원에게 빌려질 필요는 없다. 즉, 회원과 책은 대여 관계일 때 각기 부분 참여를 하고 있다.

### 예약 관계일 때

각 회원이 적어도 한 책을 예약할 필요는 없으며 각 책도 적어도 한 회원에게 예약될 필요는 없다. 즉, 회원과 책은 예약 관계일 때 각기 부분 참여를 하고 있다.

### 이용 관계일 때

각 회원이 적어도 하나의 열람실을 이용할 필요는 없으며 하나의 열람실이 적어도 한 회원에게 사용될 필요가 없다. 즉, 회원과 열람실은 이용 관계일 때 각기 부분 참여를 하고 있다.

### 관내대출 관계일 때

각 회원이 적어도 한 비도서를 빌릴 필요는 없으며 각 비도서도 적어도 한 회원에게 빌려질필요는 없다. 즉, 회원과 비도서는 관내대출 관계일 때 각기 부분 참여를 하고 있다.

### 가지고 있다 관계일 때

약한 entity는 항상 의존적이기 때문에 참여 제약 조건은 완전 참여이다.따라서 좌석은 가지고 있다 관계일 때 완전참여를 하고 있다. 각 열람실은 0개 이상의 좌석을 가지고 있다. 좌석이 없는 열람실이 있을 수 있다. 예를 들어서 열람실1, 열람실2, 열람실3가 있는데 열람실1이 공사에 들어갔다면 열람실1에는 좌석이 없다(=0개의 좌석을 가지고 있다). 즉 열람실은 가지고 있다 관계일 때 부분참여를 하고 있다.
