create database order_management;
use order_management;

create table orders(
order_id int auto_increment primary key,
customer_name varchar(100) not null,
product_name varchar(100) not null,
quantity int not null,
price decimal(10,2) not null,
order_date date not null,
status varchar(20) default "pending"
);



INSERT INTO orders (customer_name, product_name, quantity, price, order_date, status) VALUES
('Alice Johnson', 'Wireless Mouse', 2, 25.99, '2025-09-15', 'pending'),
('Bob Smith', 'Mechanical Keyboard', 1, 79.49, '2025-09-16', 'shipped'),
('Charlie Davis', '27-inch Monitor', 1, 189.99, '2025-09-14', 'delivered'),
('Diana Prince', 'USB-C Hub', 3, 15.00, '2025-09-17', 'pending'),
('Ethan Hunt', 'External Hard Drive', 2, 99.95, '2025-09-13', 'cancelled'),
('Fiona Gallagher', 'Webcam', 1, 49.99, '2025-09-16', 'shipped'),
('George Wilson', 'Gaming Chair', 1, 299.99, '2025-09-12', 'delivered');

select * from orders;

select * from orders order by price desc;

select * from orders order by price desc limit 1 offset 1;

select * from orders where status in ('processing','shipped','pending');

select count(*)from orders;

select count(*) as "total orders" from orders;

select max(price) from orders;
select min(price) from orders;

select count(*),status from orders group by status;