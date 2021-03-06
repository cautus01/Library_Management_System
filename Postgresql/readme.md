# PostgreSQL로 TABLE 생성 , DATA 삽입 , SQL쿼리를 실행하기

## 1. 현재 만들어진 테이블 목록 출력

![image](https://user-images.githubusercontent.com/69049801/158010926-ea1828c2-4076-4714-81f5-84a683be9db8.png)

## 2. 각각의 테이블의 정보

- book 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158010951-c784f64b-4f0f-4589-9e1f-d6990c9cfe33.png)

- member 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158010965-8c44d11d-9f50-4a05-a231-b4247826734c.png)

- notbook 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158010978-d23d0583-b3b0-4fd2-9f15-12959e40919e.png)

- reservation 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158010993-f3c3dedd-e243-4e0e-8281-19ab5959d2df.png)

- room 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158011009-a62f11c6-cd93-4e84-8bbf-2c79d0a7c2e2.png)

- seats 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158011035-1f405c2e-cc99-4758-876c-b5d43cf16e01.png)

## 3. 만들어진 모든 테이블에 대해 모든 데이터를 조회하는 select문

- book 테이블의 모든 데이터를 출력

![image](https://user-images.githubusercontent.com/69049801/158011215-3083f9ee-989e-4a01-b79f-95710c06cc8a.png)

- member 테이블의 모든 데이터를 출력

![image](https://user-images.githubusercontent.com/69049801/158011242-99684c62-cd05-47d9-a04a-ded97dbac000.png)

- notbook 테이블의 모든 데이터를 출력

![image](https://user-images.githubusercontent.com/69049801/158011253-f744f889-bb03-4c03-9292-98d5c94f5722.png)

- reservation 테이블의 모든 데이터를 출력

![image](https://user-images.githubusercontent.com/69049801/158011264-76944b61-7685-45b8-9c10-225b551720e4.png)

- room 테이블의 모든 데이터를 출력

![image](https://user-images.githubusercontent.com/69049801/158011276-a0d9744c-a132-45d3-b8c7-1d6f8bf1222d.png)

- seats 테이블의 모든 데이터를 출력

![image](https://user-images.githubusercontent.com/69049801/158011287-a51ffe4b-8ce0-488c-a79d-adc55d34724f.png)

## 4. 특정 테이블의 특정 컬럼만 조회하는 select문 3개
- select bookid, pub from book;
    : book테이블에서 bookid, pub 컬럼을 선택하고 보여준다.

![image](https://user-images.githubusercontent.com/69049801/158011463-ac6b8aa7-f512-420c-9244-edd43d3a3cb7.png)

- select ntitle, npub from notbook;
    : notbook테이블에서 bookid, pub 컬럼을 선택하고 보여준다.

![image](https://user-images.githubusercontent.com/69049801/158011473-9f6576b8-0a7c-45b1-905a-a86cf5d8bd9d.png)

- select name, address from member;
    : member테이블에서 name, address 컬럼을 선택하고 보여준다.

![image](https://user-images.githubusercontent.com/69049801/158011484-a2bf5512-0a20-4b7f-b427-3595536a486f.png)


## 5. 특정 테이블의 특정 조건의 특정 컬럼만 조회하는 select문 3개
- select npub from notbook where npub='PBS';
    
   : notbook테이블에서 npub가 PBS인 npub 컬럼을 선택하고 보여준다.
   
   ![image](https://user-images.githubusercontent.com/69049801/158012214-59b04030-ed8c-42f7-b159-b524278d63aa.png)

    
- select ntitle from notbook where ntitle='Rise of the mammals';
    
   : notbook테이블에서 ntitle가 Rise of the mammals인 ntitle 컬럼을 선택하고 보여준다.
   
   ![image](https://user-images.githubusercontent.com/69049801/158012224-32b76594-06aa-4324-9ea7-8a8ba48d5050.png)

    
- select name from member where name='Noel';
    
    : member테이블에서 name이 Noel인 name 컬럼을 선택하고 보여준다.
    
    ![image](https://user-images.githubusercontent.com/69049801/158012235-827a94a0-c691-47dd-a756-bf220d7ba132.png)
    
## 6. 특정 조건에 대한 update문 1개

- update book set title='feel good' where bookid=50;

    : 조건에 해당하는 데이터를 갱신한다. book테이블에서 bookid가 50인 데이터의 title을 feel good으로 갱신한다.
    
    ![image](https://user-images.githubusercontent.com/69049801/158012256-5c05e577-057b-46b1-898a-eeb3d3bc2d23.png)
 
## 7. 집계함수와 group by, having, order by를 이용한 select문 3개
 
- select rname, count(*) from member group by rname having count(*)<3 order by rname asc;
    
    :member테이블의 rname을 그룹화하여 count(*)(뜻: 전체 데이터의 갯수)의 개수가 3 미만인 데이터의 rname과 count(*)를 출력한다. 이때 rname을 오름차순으로 정렬한다.
        
    ![image](https://user-images.githubusercontent.com/69049801/158320362-5448caad-6936-4306-bac2-e26fded09cab.png)

- select address, count(*) from member group by address having count(*)>1 order by address asc;
    
    : member테이블의 address을 그룹화하여 count(*)(뜻: 전체 데이터의 갯수)의 개수가 1 초과인 데이터의 address과 count(*)를 출력한다. 이때 address를 오름차순으로 정렬한다.
    
    ![image](https://user-images.githubusercontent.com/69049801/158320445-f74d06c6-9e1a-4a80-a070-3b995ef63710.png)

- select npub, count(*) from notbook group by npub having count(*)>=1 order by npub asc;
    
    : notbook테이블의 npub을 그룹화하여 count(*)(뜻: 전체 데이터의 갯수)의 개수가 1보다 크거나 같은 데이터의 npub과 count(*)를 출력한다. 이때 npub를 오름차순으로 정렬한다.
        
    ![image](https://user-images.githubusercontent.com/69049801/158320575-2e4a85cf-e868-4b95-95f1-419792db262e.png)

## 8. subquery를 이용한 select문 3개

- select * from member where memid > (select memid from member where name='Leah');
    
    :member 테이블에서 조건( memid가 조건1을 초과하는(조건1: memid가 (member테이블에서 name이 Leah인 memid를 선택) )데이터의 모든 컬럼을 선택하고 출력한다.
    
    ![image](https://user-images.githubusercontent.com/69049801/158322198-d6e5a789-be87-4f00-8202-e955321d569b.png)

- select * from book where bookid < (select bookid from book where title='feel good');

    : book 테이블에서 조건( bookid가 조건1보다 작은 (조건1: bookid가 (book테이블에서 title이 feel good인 bookid를 선택))을 만족하는 데이터의 모든 컬럼을 선택하고 출력한다.
    
    ![image](https://user-images.githubusercontent.com/69049801/158322267-e2163d28-855c-4d41-8082-ed66011a3b0a.png)

- select * from notbook where nbookid < (select nbookid from notbook where ntitle='Bears');

    : notbook 테이블에서 조건( nbookid가 조건1보다 작은 (조건1: nbookid가 (notbook테이블에서 ntitle이 Bears인 bookid를 선택) )을 만족하는 데이터의 모든 컬럼을 선택하고 출력한다.
    
    ![image](https://user-images.githubusercontent.com/69049801/158322320-c8b4668f-0eba-499e-abd4-d4b18f7a7376.png)
    
### 9. 특정 테이블의 특정 컬럼, 특정 조건에 대해서 view의 생성 3개

- create v_member as select memid, name from member;

    : member테이블에서 memid, name 컬럼을 선택하고 보여주는 view를 생성한다.
    
    ![image](https://user-images.githubusercontent.com/69049801/158322617-4a705b78-fe70-4cc1-9a64-ec77e123544e.png)

- create view v_book as select bookid, title from book;

    : book테이블에서 bookid, title 컬럼을 선택하고 보여주는 view를 생성한다.
    
    ![image](https://user-images.githubusercontent.com/69049801/158322659-465d5eb2-5425-4c5b-8f08-491953aabd13.png)

- create view v_notbook as select nbookid, ntitle from notbook;

    : notbook테이블에서 nbookid, ntitle 컬럼을 선택하고 보여주는 view를 생성한다.
    
    ![image](https://user-images.githubusercontent.com/69049801/158322705-601598dc-3cc8-485b-9bd3-7c73e7030117.png)


