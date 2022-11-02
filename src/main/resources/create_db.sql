CREATE DATABASE Student;

Use Student;

create table address(
                        id int primary key auto_increment,
                        city varchar(128),
                        street varchar(128),
                        post_index varchar(64)
);

create table student(
                        id int primary key auto_increment,
                        firstname varchar(128),
                        surname varchar(128),
                        phone int,
                        address_id int not null ,
                        constraint fk_address foreign key (address_id) references address(id)
);


INSERT  into address (city, street, post_index)
values
    ('Minsk','Cherviakova 10','225'),
    ('Brest','Gogala','007'),
    ('Gomel','Dzerjinskova','123'),
    ('Grodno','Sovetskaia','234'),
    ('Mogilev','Komsamolskaia','758'),
    ('Vitebsk','Lenina','456'),
    ('Soligorsc','Chkalova','374'),
    ('Bobruisk','Kosmonavta','390'),
    ('Mosir','Pervomaiskaia','426'),
    ('Baranovichi','Frunse','453');


INSERT into student (firstname, surname, phone, address_id)
values
    ('Roma', 'Liskovich', 2143132, 1),
    ('Andrei', 'Gerasimyk', 234235243, 2),
    ('Dima', 'Pokikarpuk', 755456335, 3),
    ('Maksim', 'Loginov', 40483790, 4),
    ('Anton', 'Zaiaz', 547684844, 5),
    ('Oleg', 'Lobazevich', 376700969, 6),
    ('Tania','Sirotko', 576465475, 7),
    ('Sveta','Bondaruck', 325432646, 8),
    ('Ira','Ijachnik',963456356, 9),
    ('Masha','Daneluk',876456358, 10);

SELECT s.id, s.firstname, s.surname, s.phone, a.city, a.street, a.post_index from student s join address a on s.address_id = a.id;
