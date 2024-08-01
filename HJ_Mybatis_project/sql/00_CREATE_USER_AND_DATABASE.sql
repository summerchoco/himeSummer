-- 현재 접속중인 MySQL Server내에 존재하는 데이터베이스 목록 출력.
show databases;

-- mysql 이라는 이름의 데이터베이스로 이동(접속)
use mysql;

-- ohgiraffers 라는 계정명과 ohgiraffers 라는 비밀번호를 갖는 유저 생성.
CREATE USER 'ohgiraffers'@'%' IDENTIFIED BY 'ohgiraffers';

-- 방금 위에서 생성한 유저가 들어있는지 확인
select * from user;

-- menudb 라는 이름의 데이터베이스를 생성
CREATE DATABASE menudb;
show databases;

-- 방금 생성한 데이터베이스의 모든 권한을 ohgiraffers 유저에게 부여한 후 확인.
GRANT ALL PRIVILEGES ON menudb.* TO 'ohgiraffers'@'%';
show grants for 'ohgiraffers'@'%';

-- 현재 mysql 에서 menudb 로 이동.
use menudb;
