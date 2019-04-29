create table renter
(
  id bigserial not null
    constraint renter_pk
      primary key
);

alter table renter
  owner to postgres;

create table renter_credentials
(
  id        bigserial   not null
    constraint renter_credentials_pk
      primary key,
  login     varchar(50) not null,
  password  varchar     not null,
  renter_id bigint      not null
    constraint renter_credentials_renter_id_fk
      references renter
);

alter table renter_credentials
  owner to postgres;

create table renter_info
(
  id              bigserial not null
    constraint renter_info_pk
      primary key,
  first_name      varchar   not null,
  last_name       varchar   not null,
  patronymic      varchar   not null,
  passport_number varchar   not null,
  renter_id       bigint    not null
    constraint renter_info_renter_id_fk
      references renter
);

alter table renter_info
  owner to postgres;

create table lot
(
  id     bigserial not null
    constraint lot_pk
      primary key,
  number bigint    not null,
  type   varchar   not null
);

alter table lot
  owner to postgres;

create table lot_status
(
  id         bigserial not null
    constraint lot_status_pk
      primary key,
  lot_id     bigint    not null
    constraint lot_status_lot_id_fk
      references lot,
  free       boolean   not null,
  time_stamp timestamp not null
);

alter table lot_status
  owner to postgres;

create unique index lot_number_uindex
  on lot (number);

create table rent
(
  id         bigserial not null
    constraint rent_pk
      primary key,
  renter_id  bigint
    constraint rent_renter_id_fk
      references renter,
  lot_id     bigint
    constraint rent_lot_id_fk
      references lot,
  rent_start date,
  rent_end   date
);

alter table rent
  owner to postgres;

create table transaction
(
  id      bigserial not null
    constraint transaction_pk
      primary key,
  price   bigint    not null,
  rent_id integer   not null
    constraint transaction_rent_id_fk
      references rent
);

alter table transaction
  owner to postgres;

create table token
(
  id        bigserial not null
    constraint token_pk
      primary key,
  renter_id bigint    not null
    constraint token_renter_id_fk
      references renter,
  token     varchar   not null
);

alter table token
  owner to postgres;

