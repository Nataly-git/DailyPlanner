create table products (
    id integer not null auto_increment,
    calories double precision,
    carbohydrates double precision,
    fats double precision,
    item_name varchar(20),
    product_weight integer,
    proteins double precision,
    primary key (id));

create table user_calories (
    user_id integer not null,
    product_id integer not null);

create table users_info (
    id integer not null auto_increment,
    active bit,
    age integer,
    height integer,
    password varchar(255),
    role varchar(255),
    sex varchar(255),
    username varchar(255),
    weight integer, primary key (id));

alter table user_calories
    add constraint user_products
        foreign key (product_id) references products (id);

alter table user_calories
    add constraint calories_user_info
        foreign key (user_id) references users_info (id);