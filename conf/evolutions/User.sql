DROP TABLE User;


CREATE TABLE User(
	id number,
	fullName varchar2(255),
	phoneNumber varchar2(255), 
	emailAddress varchar2(255),
	message varchar2(255),
 	constraint userRetrival primary key (id)
)