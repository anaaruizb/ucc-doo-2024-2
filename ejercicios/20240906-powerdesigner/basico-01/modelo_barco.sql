/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     6/09/2024 8:38:05 p. m.                      */
/*==============================================================*/


drop table BARCO;

drop table CIUDAD;

drop table ITINERARIO;

/*==============================================================*/
/* Table: BARCO                                                 */
/*==============================================================*/
create table BARCO (
   ID                   NUMERIC              not null,
   CAPACIDAD            NUMERIC(15,2)        not null,
   COLOR                VARCHAR(20)          not null,
   MARCA                VARCHAR(0)           not null,
   MODELO               TIMESTAMP WITH TIME ZONE not null,
   constraint PK_BARCO primary key (ID)
);

/*==============================================================*/
/* Table: CIUDAD                                                */
/*==============================================================*/
create table CIUDAD (
   ID                   CHAR(5)              not null,
   NOMBRE               VARCHAR(20)          null,
   constraint PK_CIUDAD primary key (ID)
);

/*==============================================================*/
/* Table: ITINERARIO                                            */
/*==============================================================*/
create table ITINERARIO (
   ID                   NUMERIC              not null,
   NOMBRE               VARCHAR(0)           not null,
   FECHA_SALIDA         DATE                 not null,
   HORA_SALIDA          TIME WITH TIME ZONE  not null,
   BARCO_ID             DECIMAL              not null,
   CIUDAD_SALIDA_ID     CHAR(5)              not null,
   CIUDAD_LLEGADA_ID2   CHAR(5)              not null,
   constraint PK_ITINERARIO primary key (ID)
);

alter table ITINERARIO
   add constraint FK_ITINERAR_REFERENCE_BARCO foreign key (BARCO_ID)
      references BARCO (ID)
      on delete restrict on update restrict;

alter table ITINERARIO
   add constraint FK_ITINERAR_RF_CIUDAD_SALIDA foreign key (CIUDAD_SALIDA_ID)
      references CIUDAD (ID)
      on delete restrict on update restrict;

alter table ITINERARIO
   add constraint FK_ITINERAR_RF_CIUDAD_LLEGADA foreign key (CIUDAD_LLEGADA_ID2)
      references CIUDAD (ID)
      on delete restrict on update restrict;

