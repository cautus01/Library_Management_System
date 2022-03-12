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

- room 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158011009-a62f11c6-cd93-4e84-8bbf-2c79d0a7c2e2.png)

- seats 테이블 정보

![image](https://user-images.githubusercontent.com/69049801/158011035-1f405c2e-cc99-4758-876c-b5d43cf16e01.png)

3. 만들어진 모든 테이블에 대해 모든 데이터를 조회하는 select문

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


