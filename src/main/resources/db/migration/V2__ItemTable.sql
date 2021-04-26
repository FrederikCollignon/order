create table "order".item
(
    id integer not null
        constraint item_pk
            primary key,
    name varchar(255) not null,
    description varchar(255) not null,
    price double precision not null,
    amount int not null
);

alter table "order".item
    owner to student;

create unique index item_id_index
	on "order".item (id);


-- auto-generated definition
create sequence item_seq;

alter sequence item_seq owner to student;