CREATE TABLE "CYM"."USERINFO"
(
  "USERID"   NUMBER            NOT NULL ENABLE,
  "UNAME"    VARCHAR2(30 BYTE) NOT NULL ENABLE,
  "UPASS"    VARCHAR2(20 BYTE) NOT NULL ENABLE,
  "REALNAME" VARCHAR2(20 BYTE),
  "EMAIL"    VARCHAR2(50 BYTE),
  "LOCKED"   VARCHAR2(20 BYTE) DEFAULT 'false',
  CONSTRAINT "USERINFO_PK" PRIMARY KEY ("USERID")
    USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS
      STORAGE (INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
      PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
      TABLESPACE "USERS" ENABLE
) SEGMENT CREATION IMMEDIATE
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE
(
  INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT
)
  TABLESPACE "USERS";
 
