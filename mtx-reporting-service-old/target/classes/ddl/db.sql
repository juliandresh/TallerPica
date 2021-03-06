CREATE USER MAINTENANCE IDENTIFIED BY qwerty;
GRANT CONNECT, RESOURCE TO MAINTENANCE;

--------------------------------------------------------
--  DDL for Table MAINTENANCE_ASSIGMENTS
--------------------------------------------------------

  CREATE TABLE "MAINTENANCE"."MAINTENANCE_ASSIGMENTS" 
   (	"OPERATOR_ID" NUMBER, 
	"MAINTENANCE_ID" NUMBER
   );
--------------------------------------------------------
--  DDL for Table MAINTENANCE_EXECUTION
--------------------------------------------------------

  CREATE TABLE "MAINTENANCE"."MAINTENANCE_EXECUTION" 
   (	"ID" NUMBER, 
	"DESCRIPTION" VARCHAR2(200 BYTE), 
	"STATUS" VARCHAR2(20 BYTE), 
	"EXECTUTION_DATE" DATE, 
	"AIRCRAFT_TYPE" VARCHAR2(20 BYTE)
   );
--------------------------------------------------------
--  DDL for Table MAINTENANCE_NOTE
--------------------------------------------------------

  CREATE TABLE "MAINTENANCE"."MAINTENANCE_NOTE" 
   (	"ID" NUMBER, 
	"MAINTENANCE_ID" NUMBER, 
	"NOTE" VARCHAR2(200 BYTE), 
	"PART" VARCHAR2(40 BYTE)
   );
--------------------------------------------------------
--  DDL for Table OPERATOR
--------------------------------------------------------

  CREATE TABLE "MAINTENANCE"."OPERATOR" 
   (	"ID" NUMBER, 
	"FIRST_NAME" VARCHAR2(60 BYTE), 
	"LAST_NAME" VARCHAR2(60 BYTE), 
	"SPECIALITY" VARCHAR2(50 BYTE), 
	"CHARGE" NUMBER
   );
  
REM INSERTING into MAINTENANCE.MAINTENANCE_ASSIGMENTS
SET DEFINE OFF;
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('1','1');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('2','1');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('1','1');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('2','2');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('3','2');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('4','2');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('3','3');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('2','3');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('1','3');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('1','4');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('2','4');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('3','4');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('4','4');
Insert into MAINTENANCE.MAINTENANCE_ASSIGMENTS (OPERATOR_ID,MAINTENANCE_ID) values ('1','5');
REM INSERTING into MAINTENANCE.MAINTENANCE_EXECUTION
SET DEFINE OFF;
Insert into MAINTENANCE.MAINTENANCE_EXECUTION (ID,DESCRIPTION,STATUS,EXECTUTION_DATE,AIRCRAFT_TYPE) values ('1','MAINTENANE IN PHOENIX','IN_PROGRESS',to_date('03/04/17','DD/MM/RR'),'MRO');
Insert into MAINTENANCE.MAINTENANCE_EXECUTION (ID,DESCRIPTION,STATUS,EXECTUTION_DATE,AIRCRAFT_TYPE) values ('2','MAINTENANE IN PHOENIX 1','DONE',to_date('03/04/17','DD/MM/RR'),'MRO');
Insert into MAINTENANCE.MAINTENANCE_EXECUTION (ID,DESCRIPTION,STATUS,EXECTUTION_DATE,AIRCRAFT_TYPE) values ('3','MAINTENANE IN PHOENIX 2','PENDING',to_date('03/04/17','DD/MM/RR'),'MRO');
Insert into MAINTENANCE.MAINTENANCE_EXECUTION (ID,DESCRIPTION,STATUS,EXECTUTION_DATE,AIRCRAFT_TYPE) values ('4','MAINTENANE IN PHOENIX 3','PENDING',to_date('03/04/17','DD/MM/RR'),'MRO');
Insert into MAINTENANCE.MAINTENANCE_EXECUTION (ID,DESCRIPTION,STATUS,EXECTUTION_DATE,AIRCRAFT_TYPE) values ('5','MAINTENANE IN PHOENIX 4','CANCELED',to_date('03/04/17','DD/MM/RR'),'MRO');
REM INSERTING into MAINTENANCE.MAINTENANCE_NOTE
SET DEFINE OFF;
Insert into MAINTENANCE.MAINTENANCE_NOTE (ID,MAINTENANCE_ID,NOTE,PART) values ('1','1','MAINTENANCE DONE','DRT');
Insert into MAINTENANCE.MAINTENANCE_NOTE (ID,MAINTENANCE_ID,NOTE,PART) values ('2','2','MAINTENANCE DONE','DRT');
Insert into MAINTENANCE.MAINTENANCE_NOTE (ID,MAINTENANCE_ID,NOTE,PART) values ('3','3','MAINTENANCE DONE','DRT');
Insert into MAINTENANCE.MAINTENANCE_NOTE (ID,MAINTENANCE_ID,NOTE,PART) values ('4','4','MAINTENANCE DONE','DRT');
Insert into MAINTENANCE.MAINTENANCE_NOTE (ID,MAINTENANCE_ID,NOTE,PART) values ('5','5','MAINTENANCE DONE','DRT');
REM INSERTING into MAINTENANCE.OPERATOR
SET DEFINE OFF;
Insert into MAINTENANCE.OPERATOR (ID,FIRST_NAME,LAST_NAME,SPECIALITY,CHARGE) values ('1','JHON ALEXANDER','FLANAGAN RAMIREZ','TT1','200000');
Insert into MAINTENANCE.OPERATOR (ID,FIRST_NAME,LAST_NAME,SPECIALITY,CHARGE) values ('2','ANA LIZ','JHONSON PAYTON','GH7','230000');
Insert into MAINTENANCE.OPERATOR (ID,FIRST_NAME,LAST_NAME,SPECIALITY,CHARGE) values ('3','CHARLES ','STIVENSON','FRT6','450000');
Insert into MAINTENANCE.OPERATOR (ID,FIRST_NAME,LAST_NAME,SPECIALITY,CHARGE) values ('4','DENYSE MARY','CARLTON','TT1','20000');
--------------------------------------------------------
--  DDL for Index MAINTENANCE_EXECUTION_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MAINTENANCE"."MAINTENANCE_EXECUTION_PK" ON "MAINTENANCE"."MAINTENANCE_EXECUTION" ("ID");
--------------------------------------------------------
--  DDL for Index MAINTENANCE_NOTE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MAINTENANCE"."MAINTENANCE_NOTE_PK" ON "MAINTENANCE"."MAINTENANCE_NOTE" ("ID");
--------------------------------------------------------
--  DDL for Index OPERATOR_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MAINTENANCE"."OPERATOR_PK" ON "MAINTENANCE"."OPERATOR" ("ID");
--------------------------------------------------------
--  Constraints for Table MAINTENANCE_ASSIGMENTS
--------------------------------------------------------

  ALTER TABLE "MAINTENANCE"."MAINTENANCE_ASSIGMENTS" MODIFY ("MAINTENANCE_ID" NOT NULL ENABLE);
  ALTER TABLE "MAINTENANCE"."MAINTENANCE_ASSIGMENTS" MODIFY ("OPERATOR_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MAINTENANCE_EXECUTION
--------------------------------------------------------

  ALTER TABLE "MAINTENANCE"."MAINTENANCE_EXECUTION" ADD CONSTRAINT "MAINTENANCE_EXECUTION_PK" PRIMARY KEY ("ID");
--------------------------------------------------------
--  Constraints for Table MAINTENANCE_NOTE
--------------------------------------------------------

  ALTER TABLE "MAINTENANCE"."MAINTENANCE_NOTE" ADD CONSTRAINT "MAINTENANCE_NOTE_PK" PRIMARY KEY ("ID");
--------------------------------------------------------
--  Constraints for Table OPERATOR
--------------------------------------------------------

  ALTER TABLE "MAINTENANCE"."OPERATOR" ADD CONSTRAINT "OPERATOR_PK" PRIMARY KEY ("ID");
--------------------------------------------------------
--  Ref Constraints for Table MAINTENANCE_ASSIGMENTS
--------------------------------------------------------

  ALTER TABLE "MAINTENANCE"."MAINTENANCE_ASSIGMENTS" ADD CONSTRAINT "MAINTENANCE_ASSIGMENTS_FK1" FOREIGN KEY ("MAINTENANCE_ID")
	  REFERENCES "MAINTENANCE"."MAINTENANCE_EXECUTION" ("ID") ENABLE;
  ALTER TABLE "MAINTENANCE"."MAINTENANCE_ASSIGMENTS" ADD CONSTRAINT "MAINTENANCE_ASSIGMENTS_FK2" FOREIGN KEY ("OPERATOR_ID")
	  REFERENCES "MAINTENANCE"."OPERATOR" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table MAINTENANCE_NOTE
--------------------------------------------------------

  ALTER TABLE "MAINTENANCE"."MAINTENANCE_NOTE" ADD CONSTRAINT "MAINTENANCE_NOTE_FK1" FOREIGN KEY ("MAINTENANCE_ID")
	  REFERENCES "MAINTENANCE"."MAINTENANCE_EXECUTION" ("ID") ENABLE;
