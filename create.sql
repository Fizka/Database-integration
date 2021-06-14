create table bikeday (id int4 not null, dteday timestamp, hr int4 not null, mnth int4 not null, season int4 not null, weekday varchar(255), yr int4 not null, primary key (id))
create table bikeday (id int4 not null, dteday timestamp, hr int4, mnth int4, season int4, weekday varchar(255), yr int4, primary key (id))
create table bikeday (id int4 not null, dteday timestamp, hr int4, mnth int4, season int4, weekday varchar(255), yr int4, primary key (id))
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed int4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday timestamp, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday date, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday date, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday date, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday date, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday date, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
create sequence hibernate_sequence start 1 increment 1
create table renting_date (id_renting_date int8 not null, dteday date, holiday int4, mnth int4, season int4, weekday int4, workingday int4, yr int4, primary key (id_renting_date))
create table renting_hours (id_renting_hours int8 not null, hr int4, date_id int8 not null, user_id int8 not null, weather_id int8 not null, primary key (id_renting_hours))
create table renting_user (id_renting_user int8 not null, casual int4, cnt int4, registered int4, primary key (id_renting_user))
create table weather_conditions (id_weather_conditions int8 not null, atemp float4, hum float4, temp float4, weathersit int4, windspeed float4, primary key (id_weather_conditions))
alter table if exists renting_hours add constraint UK_jh2a063gvf2010pab43xv740 unique (date_id)
alter table if exists renting_hours add constraint UK_8of0qhbrn21yuavfysfsg4p4b unique (user_id)
alter table if exists renting_hours add constraint UK_rpg6ick30qbv92aebwaeude8v unique (weather_id)
alter table if exists renting_hours add constraint FKcp6jwfrahlr19dfmwqtky42ed foreign key (date_id) references renting_date
alter table if exists renting_hours add constraint FKhg65y4feiahejlxr3slesypt6 foreign key (user_id) references renting_user
alter table if exists renting_hours add constraint FKnstc2u5ham612w2ldhmy93grr foreign key (weather_id) references weather_conditions
