use mydb

create table coupon(
id int AUTO_INCREMENT PRIMARY KEY,
code varchar(20),
discount decimal(8,3),
exp_date varchar(100) 
);

