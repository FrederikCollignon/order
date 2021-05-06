create table "order".item_group
(
    id integer not null
        constraint item_group_pk
            primary key,
    item_id int not null,
    amount int not null,
    shipping_date date
);

alter table "order".item_group
    owner to student;

create unique index item_group_id_index
	on "order".item_group (id);


-- auto-generated definition
create sequence item_group_seq;

alter sequence item_group_seq owner to student;