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
  id        bigserial not null
    constraint renter_credentials_pk
      primary key,
  login     varchar(50),
  hash      varchar,
  renter_id bigint
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
  first_name      varchar,
  last_name       varchar,
  patronymic      varchar,
  passport_number varchar,
  renter_id       bigint
    constraint renter_info_renter_id_fk
      references renter
);

alter table renter_info
  owner to postgres;

create table transaction
(
  id        bigserial not null
    constraint transaction_pk
      primary key,
  type      varchar,
  price     bigint,
  renter_id bigint
    constraint transaction_renter_id_fk
      references renter
);

alter table transaction
  owner to postgres;

create table lot
(
  id     bigserial not null
    constraint lot_pk
      primary key,
  number bigint,
  type   varchar
);

alter table lot
  owner to postgres;

create table lot_status
(
  id         bigserial not null
    constraint lot_status_pk
      primary key,
  lot_id     bigint
    constraint lot_status_lot_id_fk
      references lot,
  status     varchar,
  time_stamp date
);

alter table lot_status
  owner to postgres;

create table rent
(
  id             bigserial not null
    constraint rent_pk
      primary key,
  renter_id      bigint
    constraint rent_renter_id_fk
      references renter,
  lot_id         bigint
    constraint rent_lot_id_fk
      references lot,
  rent_start     date,
  rent_end       date,
  transaction_id bigint
    constraint rent_transaction_id_fk
      references transaction
);

alter table rent
  owner to postgres;

