create database DBSCRAPINGPRODCT;

USE DBSCRAPINGPRODCT;

CREATE TABLE PRODUCT(
	idProduct int not null PRIMARY KEY auto_increment,
    description varchar(300),
    value double,
    site varchar(400)
);