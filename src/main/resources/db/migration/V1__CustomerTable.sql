create table "order".customer
(
    id           integer      not null
        constraint customers_pk
            primary key,
    first_name   varchar(255) not null,
    last_name    varchar(255) not null,
    email        varchar(255),
    address      varchar(255),
    phone_number varchar(255)
);

alter table "order".customer
    owner to student;

create unique index customers_id_index
    on "order".customer (id);

-- auto-generated definition
create sequence customer_seq;

alter sequence customer_seq owner to student;


