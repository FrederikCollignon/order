create table "order".order
(
    id integer not null
        constraint order_pk
            primary key,
    name varchar(255) not null
);

alter table "order".order
    owner to student;

create unique index order_id_index
	on "order".order (id);


-- auto-generated definition
create sequence order_seq;

alter sequence order_seq owner to student;