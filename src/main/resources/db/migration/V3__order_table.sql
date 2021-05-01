create table "order".orders
(
    id integer not null
        constraint orders_pk
            primary key,
    name varchar(255) not null
);

alter table "order".orders
    owner to student;

create unique index orders_id_index
	on "order".orders (id);


-- auto-generated definition
create sequence orders_seq;

alter sequence orders_seq owner to student;