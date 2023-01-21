---Cars----
INSERT INTO t_car (id, mark, rental_price, model, type, year_of_issue, color, fuel, status)
VALUES (1, 'Toyota', 99.99, 'Rav4', 'Crossover', 2017, 'Gray', 'Petrol', 'Enable');
INSERT INTO t_car (id, mark, rental_price, model, type, year_of_issue, color, fuel, status)
VALUES (2, 'Peugeot', 69.99, '407', 'Coupe', 2010, 'Blue', 'Diesel', 'Enable');
INSERT INTO t_car (id, mark, rental_price, model, type, year_of_issue, color, fuel, status)
VALUES (3, 'Renault', 49.99, 'Logan', 'Sedan', 2020, 'White', 'Petrol', 'Enable');
INSERT INTO t_car (id, mark, rental_price, model, type, year_of_issue, color, fuel, status)
VALUES (4, 'Volkswagen', 54.99, 'Polo', 'Sedan', 2021, 'Black', 'Diesel', 'Enable');
INSERT INTO t_car (id, mark, rental_price, model, type, year_of_issue, color, fuel, status)
VALUES (5, 'Lexus', 129.99, 'LX570', 'Crossover', 2015, 'Gray', 'Petrol', 'Enable');
INSERT INTO t_car (id, mark, rental_price, model, type, year_of_issue, color, fuel, status)
VALUES (6, 'Volvo', 58.99, 'S40', 'Sedan', 2010, 'White', 'Petrol', 'Enable');

---Users---
INSERT INTO t_user (id, login, password, email, role)
VALUES (1,'root','root','root@example.com','ADMIN');
INSERT INTO t_user (id, login, password, email, role)
VALUES (2,'test','test','test@example.com','USER');

---Payments---
