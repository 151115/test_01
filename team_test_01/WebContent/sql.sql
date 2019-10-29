

// 디비 관련 ~ 

create table Review_test_01  (

	memberId varchar(10) not null,
	memberPw varchar(10) not null,
	review_text varchar(500) not null
	
)

drop table Review_test_01

create table member_test_01 (
	memberId varchar(10) primary key ,
	memberPw varchar(10) not null
)

insert into member_test_01 (memberId, memberPw)
values	('hi', '1234')

select * from member_test_01

insert into Review_test_01 
values ('hi', '1234' , '좋은  여행2')

select * from review_test_01


