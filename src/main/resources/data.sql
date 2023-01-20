---Cars----
INSERT INTO t_car (id, mark, rental_price, model, type, year_of_issue, color, fuel, status)
VALUES (1, 'Toyota', 99.99, 'Rav4', 'Crossover', 2017, 'Gray', 'Petrol', 'Enable');
INSERT INTO t_car (id, mark, rental_price, model, type, year_of_issue, color, fuel, status)
VALUES (2, 'Peugeot', 69.99, '407', 'Coupe', 2010, 'Blue', 'Diesel', 'Enable');

---Users---
INSERT INTO t_user (id, login, password, email, role)
VALUES (1,'root','root','root@example.com','ADMIN');
INSERT INTO t_user (id, login, password, email, role)
VALUES (2,'test','test','test@example.com','USER');

---Payments---
