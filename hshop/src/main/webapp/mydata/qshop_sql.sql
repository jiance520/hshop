prompt PL/SQL Developer import file
prompt Created on 2013年4月17日 by Administrator
set feedback off
set define off
prompt Creating ADVERT...
create table ADVERT
(
  aid   NUMBER(10) not null,
  img   VARCHAR2(300) not null,
  link  VARCHAR2(300) not null,
  title VARCHAR2(100) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ADVERT
  add primary key (AID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating GRADE...
create table GRADE
(
  gid       NUMBER(10) not null,
  discount  NUMBER(10) not null,
  gradetype VARCHAR2(20) not null,
  point     NUMBER(10) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GRADE
  add primary key (GID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating VIP...
create table VIP
(
  vid      NUMBER(10) not null,
  address  VARCHAR2(100),
  borndate DATE,
  email    VARCHAR2(20) not null,
  gender   NUMBER(10) not null,
  logdate  DATE not null,
  name     VARCHAR2(20) not null,
  password VARCHAR2(50) not null,
  phone    VARCHAR2(20) not null,
  point    NUMBER(10) not null,
  status   NUMBER(10) not null,
  username VARCHAR2(20) not null,
  gradeid  NUMBER(10) not null,
  question VARCHAR2(50),
  answer   VARCHAR2(100)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table VIP
  add primary key (VID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table VIP
  add constraint FK14BFDABF22633 foreign key (GRADEID)
  references GRADE (GID);

prompt Creating COMMENTS...
create table COMMENTS
(
  commentid    NUMBER(10) not null,
  adddate      DATE not null,
  content      VARCHAR2(140) not null,
  ipaddress    VARCHAR2(20),
  isread       NUMBER(10) not null,
  productid    NUMBER(10) not null,
  replycontent VARCHAR2(140),
  replydate    DATE,
  replyid      NUMBER(10),
  title        VARCHAR2(20) not null,
  vipid        NUMBER(10) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table COMMENTS
  add primary key (COMMENTID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table COMMENTS
  add constraint FKABDCDF45E39FFBF foreign key (VIPID)
  references VIP (VID);

prompt Creating EXPRESS...
create table EXPRESS
(
  eid     NUMBER(10) not null,
  address VARCHAR2(150) not null,
  fax     VARCHAR2(20),
  logdate DATE not null,
  name    VARCHAR2(60) not null,
  phone   VARCHAR2(20) not null,
  price   FLOAT not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table EXPRESS
  add primary key (EID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating FRIENDSHIP...
create table FRIENDSHIP
(
  fid    NUMBER(10) not null,
  link   VARCHAR2(300) not null,
  name   VARCHAR2(60) not null,
  remark VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table FRIENDSHIP
  add primary key (FID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating MANAGER...
create table MANAGER
(
  mid      NUMBER(10) not null,
  name     VARCHAR2(20) not null,
  password VARCHAR2(50) not null,
  status   NUMBER(10) not null,
  username VARCHAR2(20) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table MANAGER
  add primary key (MID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating ORDERSTATE...
create table ORDERSTATE
(
  stateid   NUMBER(10) not null,
  remark    VARCHAR2(100),
  statetype VARCHAR2(20) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ORDERSTATE
  add primary key (STATEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT_BRAND...
create table PRODUCT_BRAND
(
  brandid    NUMBER(10) not null,
  img        VARCHAR2(300) not null,
  infomation VARCHAR2(200) not null,
  logorder   NUMBER(10) not null,
  name       VARCHAR2(20) not null,
  url        VARCHAR2(300) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT_BRAND
  add primary key (BRANDID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT_CPU...
create table PRODUCT_CPU
(
  driveid   NUMBER(10) not null,
  drivename NVARCHAR2(100) not null,
  parameter VARCHAR2(100) not null,
  remark    VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT_CPU
  add primary key (DRIVEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT_DVDROM...
create table PRODUCT_DVDROM
(
  driveid   NUMBER(10) not null,
  drivename NVARCHAR2(100) not null,
  parameter VARCHAR2(100) not null,
  remark    VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT_DVDROM
  add primary key (DRIVEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT_FEATURE...
create table PRODUCT_FEATURE
(
  featureid NUMBER(10) not null,
  name      NVARCHAR2(100) not null,
  parameter VARCHAR2(100) not null,
  remark    VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT_FEATURE
  add primary key (FEATUREID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT_GENRE...
create table PRODUCT_GENRE
(
  genreid NUMBER(10) not null,
  name    VARCHAR2(20) not null,
  remark  VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT_GENRE
  add primary key (GENREID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT_GRAPHICS...
create table PRODUCT_GRAPHICS
(
  driveid   NUMBER(10) not null,
  drivename NVARCHAR2(100) not null,
  parameter VARCHAR2(100) not null,
  remark    VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT_GRAPHICS
  add primary key (DRIVEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT_HARDDISK...
create table PRODUCT_HARDDISK
(
  driveid   NUMBER(10) not null,
  drivename NVARCHAR2(100) not null,
  parameter VARCHAR2(100) not null,
  remark    VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT_HARDDISK
  add primary key (DRIVEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT_OS...
create table PRODUCT_OS
(
  osid   NUMBER(10) not null,
  name   NVARCHAR2(100) not null,
  remark VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT_OS
  add primary key (OSID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT_ROM...
create table PRODUCT_ROM
(
  driveid   NUMBER(10) not null,
  drivename NVARCHAR2(100) not null,
  parameter VARCHAR2(100) not null,
  remark    VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT_ROM
  add primary key (DRIVEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT_SCREEN...
create table PRODUCT_SCREEN
(
  driveid   NUMBER(10) not null,
  drivename NVARCHAR2(100) not null,
  parameter VARCHAR2(100) not null,
  remark    VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT_SCREEN
  add primary key (DRIVEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT_STYLE...
create table PRODUCT_STYLE
(
  styleid NUMBER(10) not null,
  color   NVARCHAR2(100) not null,
  remark  VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT_STYLE
  add primary key (STYLEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating SUPPLIER...
create table SUPPLIER
(
  ssid    NUMBER(10) not null,
  address VARCHAR2(150) not null,
  logdate DATE not null,
  name    VARCHAR2(60) not null,
  phone   VARCHAR2(20) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SUPPLIER
  add primary key (SSID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating PRODUCT...
create table PRODUCT
(
  productid      NUMBER(10) not null,
  alarmnum       NUMBER(10) not null,
  discount       NUMBER(10),
  isdiscount     NUMBER(10),
  oneimg         VARCHAR2(300) not null,
  price          FLOAT not null,
  productnum     NUMBER(10) not null,
  productname    VARCHAR2(20) not null,
  productno      NVARCHAR2(50) not null,
  threeimg       VARCHAR2(300),
  twoimg         VARCHAR2(300),
  brandid        NUMBER(10) not null,
  cpuunitid      NUMBER(10) not null,
  dvdromid       NUMBER(10),
  featureid      NUMBER(10),
  genreid        NUMBER(10) not null,
  graphicsid     NUMBER(10),
  harddiskid     NUMBER(10) not null,
  productosid    NUMBER(10),
  romid          NUMBER(10) not null,
  screenid       NUMBER(10) not null,
  productstyleid NUMBER(10) not null,
  productdesc    VARCHAR2(4000),
  supplierid     NUMBER(10) not null,
  logdate        DATE not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT
  add primary key (PRODUCTID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table PRODUCT
  add constraint FK185958CF1BA3B099 foreign key (CPUUNITID)
  references PRODUCT_CPU (DRIVEID);
alter table PRODUCT
  add constraint FK185958CF3651D4AB foreign key (PRODUCTOSID)
  references PRODUCT_OS (OSID);
alter table PRODUCT
  add constraint FK185958CF5E044265 foreign key (ROMID)
  references PRODUCT_ROM (DRIVEID);
alter table PRODUCT
  add constraint FK185958CF6E732E31 foreign key (FEATUREID)
  references PRODUCT_FEATURE (FEATUREID);
alter table PRODUCT
  add constraint FK185958CF6F4B648D foreign key (DVDROMID)
  references PRODUCT_DVDROM (DRIVEID);
alter table PRODUCT
  add constraint FK185958CF89CBB1C1 foreign key (HARDDISKID)
  references PRODUCT_HARDDISK (DRIVEID);
alter table PRODUCT
  add constraint FK185958CF8C1F007 foreign key (GRAPHICSID)
  references PRODUCT_GRAPHICS (DRIVEID);
alter table PRODUCT
  add constraint FK185958CF967AFE8B foreign key (GENREID)
  references PRODUCT_GENRE (GENREID);
alter table PRODUCT
  add constraint FK185958CFA3311193 foreign key (BRANDID)
  references PRODUCT_BRAND (BRANDID);
alter table PRODUCT
  add constraint FK185958CFC0F46B98 foreign key (PRODUCTSTYLEID)
  references PRODUCT_STYLE (STYLEID);
alter table PRODUCT
  add constraint FK185958CFC8225509 foreign key (SCREENID)
  references PRODUCT_SCREEN (DRIVEID);
alter table PRODUCT
  add constraint FK_SUPPLIERID foreign key (SUPPLIERID)
  references SUPPLIER (SSID);

prompt Creating SELLORDER...
create table SELLORDER
(
  soid         NUMBER(10) not null,
  logdate      DATE not null,
  ordernum     VARCHAR2(20) not null,
  paystate     NUMBER(10) not null,
  paytype      VARCHAR2(20) not null,
  sum          NUMBER(22) not null,
  expressid    NUMBER(10) not null,
  orderstateid NUMBER(10) not null,
  vipid        NUMBER(10) not null,
  postaddr     VARCHAR2(100) not null,
  postname     VARCHAR2(20) not null,
  postphone    VARCHAR2(20) not null,
  remark       VARCHAR2(100),
  state        NUMBER(10) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SELLORDER
  add primary key (SOID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SELLORDER
  add constraint FK4C6A8B1C5E39FFBF foreign key (VIPID)
  references VIP (VID);
alter table SELLORDER
  add constraint FK4C6A8B1C7B3F1B57 foreign key (ORDERSTATEID)
  references ORDERSTATE (STATEID);
alter table SELLORDER
  add constraint FK4C6A8B1C917020A5 foreign key (EXPRESSID)
  references EXPRESS (EID);

prompt Creating SELLPRODUCT...
create table SELLPRODUCT
(
  spid      NUMBER(10) not null,
  num       NUMBER(10) not null,
  productid NUMBER(10) not null,
  orderid   NUMBER(10) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SELLPRODUCT
  add primary key (SPID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SELLPRODUCT
  add constraint FK1175113D2A7C122F foreign key (ORDERID)
  references SELLORDER (SOID);
alter table SELLPRODUCT
  add constraint FK1175113D70BD37E3 foreign key (PRODUCTID)
  references PRODUCT (PRODUCTID);

prompt Creating SERVICE...
create table SERVICE
(
  serviceid    NUMBER(10) not null,
  content      VARCHAR2(200) not null,
  logdate      DATE not null,
  managedate   DATE not null,
  manageremark VARCHAR2(100),
  managestatus NUMBER(10) not null,
  ordernum     VARCHAR2(20) not null,
  remark       VARCHAR2(100),
  title        VARCHAR2(20) not null,
  vipid        NUMBER(10) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table SERVICE
  add primary key (SERVICEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating SHOPCART...
create table SHOPCART
(
  id         NUMBER(10) not null,
  logdate    DATE not null,
  productnum NUMBER(10) not null,
  productid  NUMBER(10) not null,
  vipid      NUMBER(10) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SHOPCART
  add primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SHOPCART
  add constraint FK1A17DB165E39FFBF foreign key (VIPID)
  references VIP (VID);
alter table SHOPCART
  add constraint FK1A17DB1670BD37E3 foreign key (PRODUCTID)
  references PRODUCT (PRODUCTID);

prompt Creating SHOPLOG...
create table SHOPLOG
(
  logid      NUMBER(10) not null,
  logcontent VARCHAR2(200) not null,
  logtime    DATE not null,
  userid     NUMBER(10) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table SHOPLOG
  add primary key (LOGID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Disabling triggers for ADVERT...
alter table ADVERT disable all triggers;
prompt Disabling triggers for GRADE...
alter table GRADE disable all triggers;
prompt Disabling triggers for VIP...
alter table VIP disable all triggers;
prompt Disabling triggers for COMMENTS...
alter table COMMENTS disable all triggers;
prompt Disabling triggers for EXPRESS...
alter table EXPRESS disable all triggers;
prompt Disabling triggers for FRIENDSHIP...
alter table FRIENDSHIP disable all triggers;
prompt Disabling triggers for MANAGER...
alter table MANAGER disable all triggers;
prompt Disabling triggers for ORDERSTATE...
alter table ORDERSTATE disable all triggers;
prompt Disabling triggers for PRODUCT_BRAND...
alter table PRODUCT_BRAND disable all triggers;
prompt Disabling triggers for PRODUCT_CPU...
alter table PRODUCT_CPU disable all triggers;
prompt Disabling triggers for PRODUCT_DVDROM...
alter table PRODUCT_DVDROM disable all triggers;
prompt Disabling triggers for PRODUCT_FEATURE...
alter table PRODUCT_FEATURE disable all triggers;
prompt Disabling triggers for PRODUCT_GENRE...
alter table PRODUCT_GENRE disable all triggers;
prompt Disabling triggers for PRODUCT_GRAPHICS...
alter table PRODUCT_GRAPHICS disable all triggers;
prompt Disabling triggers for PRODUCT_HARDDISK...
alter table PRODUCT_HARDDISK disable all triggers;
prompt Disabling triggers for PRODUCT_OS...
alter table PRODUCT_OS disable all triggers;
prompt Disabling triggers for PRODUCT_ROM...
alter table PRODUCT_ROM disable all triggers;
prompt Disabling triggers for PRODUCT_SCREEN...
alter table PRODUCT_SCREEN disable all triggers;
prompt Disabling triggers for PRODUCT_STYLE...
alter table PRODUCT_STYLE disable all triggers;
prompt Disabling triggers for SUPPLIER...
alter table SUPPLIER disable all triggers;
prompt Disabling triggers for PRODUCT...
alter table PRODUCT disable all triggers;
prompt Disabling triggers for SELLORDER...
alter table SELLORDER disable all triggers;
prompt Disabling triggers for SELLPRODUCT...
alter table SELLPRODUCT disable all triggers;
prompt Disabling triggers for SERVICE...
alter table SERVICE disable all triggers;
prompt Disabling triggers for SHOPCART...
alter table SHOPCART disable all triggers;
prompt Disabling triggers for SHOPLOG...
alter table SHOPLOG disable all triggers;
prompt Disabling foreign key constraints for VIP...
alter table VIP disable constraint FK14BFDABF22633;
prompt Disabling foreign key constraints for COMMENTS...
alter table COMMENTS disable constraint FKABDCDF45E39FFBF;
prompt Disabling foreign key constraints for PRODUCT...
alter table PRODUCT disable constraint FK185958CF1BA3B099;
alter table PRODUCT disable constraint FK185958CF3651D4AB;
alter table PRODUCT disable constraint FK185958CF5E044265;
alter table PRODUCT disable constraint FK185958CF6E732E31;
alter table PRODUCT disable constraint FK185958CF6F4B648D;
alter table PRODUCT disable constraint FK185958CF89CBB1C1;
alter table PRODUCT disable constraint FK185958CF8C1F007;
alter table PRODUCT disable constraint FK185958CF967AFE8B;
alter table PRODUCT disable constraint FK185958CFA3311193;
alter table PRODUCT disable constraint FK185958CFC0F46B98;
alter table PRODUCT disable constraint FK185958CFC8225509;
alter table PRODUCT disable constraint FK_SUPPLIERID;
prompt Disabling foreign key constraints for SELLORDER...
alter table SELLORDER disable constraint FK4C6A8B1C5E39FFBF;
alter table SELLORDER disable constraint FK4C6A8B1C7B3F1B57;
alter table SELLORDER disable constraint FK4C6A8B1C917020A5;
prompt Disabling foreign key constraints for SELLPRODUCT...
alter table SELLPRODUCT disable constraint FK1175113D2A7C122F;
alter table SELLPRODUCT disable constraint FK1175113D70BD37E3;
prompt Disabling foreign key constraints for SHOPCART...
alter table SHOPCART disable constraint FK1A17DB165E39FFBF;
alter table SHOPCART disable constraint FK1A17DB1670BD37E3;
prompt Loading ADVERT...
insert into ADVERT (aid, img, link, title)
values (102, '/img/ads/10922485318240.jpg', 'http://192.168.56.101:8080/QShop/qshop-product?id=191', '广告一号');
insert into ADVERT (aid, img, link, title)
values (103, '/img/ads/10922485600888.jpg', 'http://192.168.56.101:8080/QShop/qshop-product?id=192', '广告二号');
insert into ADVERT (aid, img, link, title)
values (104, '/img/ads/10922485908128.jpg', 'http://192.168.56.101:8080/QShop/qshop-product?id=199', '广告三号');
insert into ADVERT (aid, img, link, title)
values (105, '/img/ads/10922486832712.png', 'http://192.168.56.101:8080/QShop/qshop-product?id=189', '广告四号');
insert into ADVERT (aid, img, link, title)
values (106, '/img/ads/10922487093632.png', 'http://192.168.56.101:8080/QShop/qshop-list', '广告五号');
commit;
prompt 6 records loaded
prompt Loading GRADE...
insert into GRADE (gid, discount, gradetype, point)
values (1, 1, '铜牌会员', 1000);
insert into GRADE (gid, discount, gradetype, point)
values (2, 1, '银牌会员', 5000);
insert into GRADE (gid, discount, gradetype, point)
values (3, 1, '金牌会员', 20000);
commit;
prompt 3 records loaded
prompt Loading VIP...
insert into VIP (vid, address, borndate, email, gender, logdate, name, password, phone, point, status, username, gradeid, question, answer)
values (161, 'aaa', to_date('09-04-2013', 'dd-mm-yyyy'), 'caze@email.com', 0, to_date('07-04-2013 12:28:33', 'dd-mm-yyyy hh24:mi:ss'), '华明', 'e10adc3949ba59abbe56e057f20f883e', '13800000000', 0, 0, 'caze', 1, 'WangJian', '1234');
insert into VIP (vid, address, borndate, email, gender, logdate, name, password, phone, point, status, username, gradeid, question, answer)
values (181, null, null, '1@qq.com', 0, to_date('07-04-2013 17:02:45', 'dd-mm-yyyy hh24:mi:ss'), 'Wang', 'e10adc3949ba59abbe56e057f20f883e', '13800000000', 0, 0, 'wangjian', 1, null, null);
insert into VIP (vid, address, borndate, email, gender, logdate, name, password, phone, point, status, username, gradeid, question, answer)
values (182, '湖南长沙长沙市', null, 'jinhao.tang@live.com', 0, to_date('07-04-2013 18:29:46', 'dd-mm-yyyy hh24:mi:ss'), 'jinhao.tang', 'f74680162accd40ceddf8f272de8227e', '13874909640', 0, 0, 'jinhao', 1, null, null);
commit;
prompt 3 records loaded
prompt Loading COMMENTS...
prompt Table is empty
prompt Loading EXPRESS...
insert into EXPRESS (eid, address, fax, logdate, name, phone, price)
values (1, '湖南省长沙市雨花区', '(0731)12345678', to_date('07-04-2013 01:51:26', 'dd-mm-yyyy hh24:mi:ss'), '顺丰快递', '(0731)12345678', 15);
insert into EXPRESS (eid, address, fax, logdate, name, phone, price)
values (2, '湖南省长沙市开福区', '(0731)12345678', to_date('23-03-2013', 'dd-mm-yyyy'), '中国邮政EMS', '(0731)12345678', 10);
insert into EXPRESS (eid, address, fax, logdate, name, phone, price)
values (3, '湖南省长沙市芙蓉区扫把塘', '(0731)12345678', to_date('23-03-2013', 'dd-mm-yyyy'), '申通快递', '(0731)12345678', 20);
insert into EXPRESS (eid, address, fax, logdate, name, phone, price)
values (4, '湖南省长沙市雨花区', '(0731)12345678', to_date('23-03-2013', 'dd-mm-yyyy'), '圆通快递', '(0731)12345678', 20);
commit;
prompt 4 records loaded
prompt Loading FRIENDSHIP...
insert into FRIENDSHIP (fid, link, name, remark)
values (1, 'http://www.baidu.com', '百度搜索', '暂无备注');
insert into FRIENDSHIP (fid, link, name, remark)
values (2, 'http://www.360buy.com', '京东商城', '暂无备注');
insert into FRIENDSHIP (fid, link, name, remark)
values (3, 'http://www.taobao.com', '淘宝商城', '暂无备注');
commit;
prompt 3 records loaded
prompt Loading MANAGER...
insert into MANAGER (mid, name, password, status, username)
values (1, '管理员', 'e10adc3949ba59abbe56e057f20f883e', 0, 'admin');
commit;
prompt 1 records loaded
prompt Loading ORDERSTATE...
insert into ORDERSTATE (stateid, remark, statetype)
values (61, null, '已收货');
insert into ORDERSTATE (stateid, remark, statetype)
values (1, null, '未发货');
insert into ORDERSTATE (stateid, remark, statetype)
values (2, null, '已发货');
insert into ORDERSTATE (stateid, remark, statetype)
values (3, null, '已退货');
insert into ORDERSTATE (stateid, remark, statetype)
values (4, null, '已作废');
commit;
prompt 5 records loaded
prompt Loading PRODUCT_BRAND...
insert into PRODUCT_BRAND (brandid, img, infomation, logorder, name, url)
values (1, 'none', '联想品牌信息', 1, '联想', 'url');
insert into PRODUCT_BRAND (brandid, img, infomation, logorder, name, url)
values (2, 'none', '华硕品牌信息', 2, '华硕', 'url');
insert into PRODUCT_BRAND (brandid, img, infomation, logorder, name, url)
values (3, 'none', '惠普品牌信息', 3, '惠普', 'url');
insert into PRODUCT_BRAND (brandid, img, infomation, logorder, name, url)
values (4, 'none', '戴尔品牌信息', 4, '戴尔', 'url');
insert into PRODUCT_BRAND (brandid, img, infomation, logorder, name, url)
values (5, 'none', '东芝品牌信息', 5, '东芝', 'url');
insert into PRODUCT_BRAND (brandid, img, infomation, logorder, name, url)
values (6, 'none', '索尼品牌信息', 6, '索尼', 'url');
insert into PRODUCT_BRAND (brandid, img, infomation, logorder, name, url)
values (7, 'none', '宏基品牌信息', 7, '宏基', 'url');
insert into PRODUCT_BRAND (brandid, img, infomation, logorder, name, url)
values (8, 'none', '联想ThinkPad品牌信息', 8, '联想ThinkPad', 'url');
commit;
prompt 8 records loaded
prompt Loading PRODUCT_CPU...
insert into PRODUCT_CPU (driveid, drivename, parameter, remark)
values (1, '酷睿i7', 'i7 3533MB 4核心', '暂无说明');
insert into PRODUCT_CPU (driveid, drivename, parameter, remark)
values (2, '酷睿i5', 'i5 2533MB 双核心 四线程', '暂无说明');
insert into PRODUCT_CPU (driveid, drivename, parameter, remark)
values (3, '酷睿i3', 'i3 2153MB 双核心', '暂无说明');
insert into PRODUCT_CPU (driveid, drivename, parameter, remark)
values (4, 'AMD APU', '暂无参数', '暂无说明');
insert into PRODUCT_CPU (driveid, drivename, parameter, remark)
values (5, '英特尔Intel', '暂无参数', '暂无说明');
commit;
prompt 5 records loaded
prompt Loading PRODUCT_DVDROM...
insert into PRODUCT_DVDROM (driveid, drivename, parameter, remark)
values (1, 'DVD-ROM RW+', '52x 刻录光驱', 'remark');
insert into PRODUCT_DVDROM (driveid, drivename, parameter, remark)
values (2, 'DVD-ROM', '32x 普通光驱', 'remark');
commit;
prompt 2 records loaded
prompt Loading PRODUCT_FEATURE...
insert into PRODUCT_FEATURE (featureid, name, parameter, remark)
values (1, '蓝牙', '蓝牙3.0', '暂无说明');
insert into PRODUCT_FEATURE (featureid, name, parameter, remark)
values (2, '指纹识别', '暂无参数', '自带商务功能');
insert into PRODUCT_FEATURE (featureid, name, parameter, remark)
values (3, '人脸识别', '暂无参数', '暂无说明');
insert into PRODUCT_FEATURE (featureid, name, parameter, remark)
values (4, '键盘背光灯', '暂无参数', '暂无说明');
insert into PRODUCT_FEATURE (featureid, name, parameter, remark)
values (22, '蓝牙3.0/指纹识别/键盘背光', '暂无参数', '高端笔记本');
commit;
prompt 5 records loaded
prompt Loading PRODUCT_GENRE...
insert into PRODUCT_GENRE (genreid, name, remark)
values (1, '超级本', '暂无说明');
insert into PRODUCT_GENRE (genreid, name, remark)
values (3, '轻薄便携本', '暂无说明');
insert into PRODUCT_GENRE (genreid, name, remark)
values (4, '商务办公本', '暂无说明');
insert into PRODUCT_GENRE (genreid, name, remark)
values (5, '全能学生本', '暂无说明');
insert into PRODUCT_GENRE (genreid, name, remark)
values (6, '家庭娱乐本', '暂无说明');
insert into PRODUCT_GENRE (genreid, name, remark)
values (7, '时尚丽人本', '暂无说明');
insert into PRODUCT_GENRE (genreid, name, remark)
values (24, '游戏影音本', '暂无备注');
commit;
prompt 7 records loaded
prompt Loading PRODUCT_GRAPHICS...
insert into PRODUCT_GRAPHICS (driveid, drivename, parameter, remark)
values (1, 'Intel HD Graphics', 'Intel HD Graphics 1024GB', '暂无说明');
insert into PRODUCT_GRAPHICS (driveid, drivename, parameter, remark)
values (2, 'AMD Radeon HD', 'AMD Radeon HD 1024GB', '暂无说明');
insert into PRODUCT_GRAPHICS (driveid, drivename, parameter, remark)
values (21, 'NVIDIA GeForce GT', 'NVIDIA GeForce GT 1024MB', null);
commit;
prompt 3 records loaded
prompt Loading PRODUCT_HARDDISK...
insert into PRODUCT_HARDDISK (driveid, drivename, parameter, remark)
values (42, 'HDD 750GB 5400t', '750GB 5400t', null);
insert into PRODUCT_HARDDISK (driveid, drivename, parameter, remark)
values (1, '希捷H001', 'SATA 500GB 7200t', '暂无说明');
insert into PRODUCT_HARDDISK (driveid, drivename, parameter, remark)
values (2, '希捷H002', 'SATA 320GB 5400t', '暂无说明');
insert into PRODUCT_HARDDISK (driveid, drivename, parameter, remark)
values (3, '日立', 'SATA 500GB 7200t', '暂无说明');
insert into PRODUCT_HARDDISK (driveid, drivename, parameter, remark)
values (4, '希捷SSD', 'SSD 120GB 7200t', '暂无说明');
insert into PRODUCT_HARDDISK (driveid, drivename, parameter, remark)
values (5, '三星SSD', 'SSD 320GB 7200t', '暂无说明');
insert into PRODUCT_HARDDISK (driveid, drivename, parameter, remark)
values (21, '西数 SATA27392', 'WD STAT 320GB 4500t', null);
insert into PRODUCT_HARDDISK (driveid, drivename, parameter, remark)
values (22, '西数 SATA9874HF', 'WD STAT 500GB 7200t', null);
insert into PRODUCT_HARDDISK (driveid, drivename, parameter, remark)
values (23, '三星 SSD', 'SAMSUNG SSD 120GB', null);
insert into PRODUCT_HARDDISK (driveid, drivename, parameter, remark)
values (41, '24GB+500GB混合硬盘', 'SSD + 7200t', null);
commit;
prompt 10 records loaded
prompt Loading PRODUCT_OS...
insert into PRODUCT_OS (osid, name, remark)
values (1, 'Windows 7', 'Windows 7 旗舰版');
insert into PRODUCT_OS (osid, name, remark)
values (2, 'Windows 8', 'Windows 8 家庭版');
insert into PRODUCT_OS (osid, name, remark)
values (3, 'DOS', '暂无说明');
insert into PRODUCT_OS (osid, name, remark)
values (21, 'Linux', 'Redhat Linux');
insert into PRODUCT_OS (osid, name, remark)
values (41, 'Ubuntu 11.2', null);
commit;
prompt 5 records loaded
prompt Loading PRODUCT_ROM...
insert into PRODUCT_ROM (driveid, drivename, parameter, remark)
values (1, '金士顿2Gb', 'KST 2GB DDR3 1333MB', '暂无说明');
insert into PRODUCT_ROM (driveid, drivename, parameter, remark)
values (2, '金士顿4Gb', 'KST 4GB DDR3 1333MB', '暂无说明');
insert into PRODUCT_ROM (driveid, drivename, parameter, remark)
values (3, '黑金刚2Gb', 'KST 2GB DDR3 1333MB', '暂无说明');
insert into PRODUCT_ROM (driveid, drivename, parameter, remark)
values (21, '金士顿8GB', '8GB DDR3 1600MHz', null);
commit;
prompt 4 records loaded
prompt Loading PRODUCT_SCREEN...
insert into PRODUCT_SCREEN (driveid, drivename, parameter, remark)
values (1, '17寸及以上', '暂无参数', '暂无说明');
insert into PRODUCT_SCREEN (driveid, drivename, parameter, remark)
values (2, '15寸', '暂无参数', '暂无说明');
insert into PRODUCT_SCREEN (driveid, drivename, parameter, remark)
values (3, '14寸', '暂无参数', '暂无说明');
insert into PRODUCT_SCREEN (driveid, drivename, parameter, remark)
values (4, '13寸', '暂无参数', '暂无说明');
insert into PRODUCT_SCREEN (driveid, drivename, parameter, remark)
values (5, '12寸', '暂无参数', '暂无说明');
insert into PRODUCT_SCREEN (driveid, drivename, parameter, remark)
values (6, '11寸及以下', '暂无参数', '暂无说明');
commit;
prompt 6 records loaded
prompt Loading PRODUCT_STYLE...
insert into PRODUCT_STYLE (styleid, color, remark)
values (1, '白色', '暂无说明');
insert into PRODUCT_STYLE (styleid, color, remark)
values (2, '黑色', '暂无说明');
insert into PRODUCT_STYLE (styleid, color, remark)
values (3, '宝石蓝', '暂无说明');
insert into PRODUCT_STYLE (styleid, color, remark)
values (4, '红色', '暂无说明');
insert into PRODUCT_STYLE (styleid, color, remark)
values (5, '粉红色', '暂无说明');
insert into PRODUCT_STYLE (styleid, color, remark)
values (6, '橘黄色', '暂无说明');
insert into PRODUCT_STYLE (styleid, color, remark)
values (7, '淡黄色', '暂无说明');
commit;
prompt 7 records loaded
prompt Loading SUPPLIER...
insert into SUPPLIER (ssid, address, logdate, name, phone)
values (1, '广州市百脑汇电脑城B座', to_date('26-03-2013', 'dd-mm-yyyy'), '联想爱华公司', '13312344321');
insert into SUPPLIER (ssid, address, logdate, name, phone)
values (2, '北京市戴尔科技股份有限公司', to_date('25-03-2013', 'dd-mm-yyyy'), '戴尔公司', '15199990000');
insert into SUPPLIER (ssid, address, logdate, name, phone)
values (61, '深圳宝安区', to_date('07-04-2013 10:58:32', 'dd-mm-yyyy hh24:mi:ss'), '深圳宏基总代理', '18699990000');
commit;
prompt 3 records loaded
prompt Loading PRODUCT...
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (194, 5, 0, 0, '/img/product/1156415105695850.jpg', 4200, 92, '华硕A45EI321VD-SL', 'QPRO201304074970', null, '/img/product/543392222038900.jpg', 2, 1, 1, null, 7, 21, 1, 1, 2, 3, 1, null, 1, to_date('07-04-2013 11:58:10', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (199, 5, 0, 0, '/img/product/170663847010000.jpg', 12300, 98, '测试数据', 'QPRO201304076290', '/img/product/288080573752880.jpg', '/img/product/514722162582160.jpg', 1, 2, 1, 3, 3, 1, 3, 41, 2, 6, 5, null, 1, to_date('07-04-2013 12:31:39', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (187, 5, 0, 0, '/img/product/1190545958168800.jpg', 4999, 197, 'ThinkPad E430 3254A4', 'QPRO201304072396', '/img/product/2730609995816.jpg', '/img/product/1013056308447736.jpg', 8, 2, 1, null, 4, 1, 22, 21, 1, 3, 2, '<img src="http://192.168.56.101:8080/QShop/img/product/78957048975439.png">', 1, to_date('07-04-2013 11:23:17', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (188, 5, 0, 0, '/img/product/19114276308806.jpg', 6299, 95, '惠普Envy 4-1236tx', 'QPRO201304075617', '/img/product/1328442203471747.jpg', '/img/product/591177260126687.jpg', 3, 2, 1, 1, 1, 2, 1, 2, 1, 3, 2, '<h1>商品信息.....</h1>', 1, to_date('07-04-2013 11:30:50', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (189, 5, 0, 0, '/img/product/169297905122156.jpg', 6799, 50, '联想Yoga13-IFI', 'QPRO201304078095', null, '/img/product/903832364449098.jpg', 1, 2, 1, null, 7, 1, 3, 2, 1, 1, 6, '<h3><b>l,l,l,</b></h3>', 1, to_date('07-04-2013 11:34:46', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (190, 5, 0, 0, '/img/product/1346191604456778.jpg', 4399, 99, '东芝M800-T01W', 'QPRO201304070989', null, '/img/product/491510119274280.jpg', 5, 2, 1, null, 5, 2, 1, 1, 1, 3, 1, null, 1, to_date('07-04-2013 11:38:06', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (191, 5, 0, 0, '/img/product/309924502905173.jpg', 3500, 114, 'Acer E1-471G', 'QPRO201304078716', '/img/product/471030632168655.jpg', '/img/product/1018518410428454.jpg', 7, 2, null, null, 6, null, 2, null, 3, 3, 1, null, 61, to_date('07-04-2013 11:43:00', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (192, 5, 0, 0, '/img/product/419149112112998.jpg', 4300, 95, '戴尔Inspiron 14R54y8', 'QPRO201304079741', null, '/img/product/101032685005176.jpg', 4, 2, 1, null, 6, 1, 2, 2, 1, 3, 3, null, 1, to_date('07-04-2013 11:49:14', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (193, 5, 0, 0, '/img/product/502432910991328.jpg', 8888, 50, '联想ThinkPad S230u', 'QPRO201304071646', '/img/product/693575866264848.jpg', '/img/product/105128625397642.jpg', 8, 1, 1, 2, 1, 1, 41, 2, 2, 3, 2, null, 1, to_date('07-04-2013 11:53:43', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (195, 5, 0, 0, '/img/product/518816873755320.jpg', 4650, 20, '索尼E1512S7C', 'QPRO201304072565', null, '/img/product/565237330884936.jpg', 6, 2, 1, null, 5, 2, 2, 2, 1, 2, 1, null, 1, to_date('07-04-2013 12:06:02', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (196, 5, 0, 0, '/img/product/648521242098925.jpg', 2999, 35, '东芝L830-S16W1', 'QPRO201304076421', null, '/img/product/864239886845529.jpg', 5, 3, 1, null, 6, 2, 2, 3, 1, 4, 1, null, 1, to_date('07-04-2013 12:11:18', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (197, 5, 0, 0, '/img/product/962542228014315.jpg', 6750, 10, '联想ThinkPad X230', 'QPRO201304072069', '/img/product/1146858824868120.jpg', '/img/product/968003460513687.jpg', 8, 2, null, null, 4, null, 2, 2, 1, 5, 2, null, 1, to_date('07-04-2013 12:15:24', 'dd-mm-yyyy hh24:mi:ss'));
insert into PRODUCT (productid, alarmnum, discount, isdiscount, oneimg, price, productnum, productname, productno, threeimg, twoimg, brandid, cpuunitid, dvdromid, featureid, genreid, graphicsid, harddiskid, productosid, romid, screenid, productstyleid, productdesc, supplierid, logdate)
values (198, 5, 0, 0, '/img/product/831472741319052.jpg', 6800, 75, '惠普dv6-7208tx', 'QPRO201304071541', null, null, 3, 1, 1, 1, 24, 21, 42, 2, 2, 2, 2, null, 1, to_date('07-04-2013 12:17:58', 'dd-mm-yyyy hh24:mi:ss'));
commit;
prompt 13 records loaded
prompt Loading SELLORDER...
insert into SELLORDER (soid, logdate, ordernum, paystate, paytype, sum, expressid, orderstateid, vipid, postaddr, postname, postphone, remark, state)
values (221, to_date('07-04-2013 17:05:50', 'dd-mm-yyyy hh24:mi:ss'), 'QSHOPA201304079122', 1, '汇款-中国工商银行', 31217, 4, 61, 181, '北京昌平', 'wangjian', '13800000000', null, 1);
insert into SELLORDER (soid, logdate, ordernum, paystate, paytype, sum, expressid, orderstateid, vipid, postaddr, postname, postphone, remark, state)
values (261, to_date('12-04-2013 12:57:24', 'dd-mm-yyyy hh24:mi:ss'), 'QSHOPA201304128411', 0, '支付宝', 6314, 1, 1, 161, '澳门', 'kkk', '13800000000', null, 0);
insert into SELLORDER (soid, logdate, ordernum, paystate, paytype, sum, expressid, orderstateid, vipid, postaddr, postname, postphone, remark, state)
values (241, to_date('10-04-2013 17:44:54', 'dd-mm-yyyy hh24:mi:ss'), 'QSHOPA201304107380', 0, '汇款-中国工商银行', 5014, 1, 1, 161, '北京昌平', 'sad', '13800000000', null, 0);
insert into SELLORDER (soid, logdate, ordernum, paystate, paytype, sum, expressid, orderstateid, vipid, postaddr, postname, postphone, remark, state)
values (242, to_date('10-04-2013 17:49:37', 'dd-mm-yyyy hh24:mi:ss'), 'QSHOPA201304103755', 0, '支付宝', 288807, 1, 1, 161, '甘肃兰州皋兰', '12', '13800000000', '12', 0);
commit;
prompt 4 records loaded
prompt Loading SELLPRODUCT...
insert into SELLPRODUCT (spid, num, productid, orderid)
values (201, 1, 199, 221);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (202, 3, 188, 221);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (223, 1, 187, 242);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (221, 1, 187, 241);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (222, 1, 188, 242);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (224, 1, 190, 242);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (225, 5, 192, 242);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (226, 8, 194, 242);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (227, 10, 195, 242);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (228, 5, 196, 242);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (229, 6, 191, 242);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (230, 10, 198, 242);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (231, 10, 197, 242);
insert into SELLPRODUCT (spid, num, productid, orderid)
values (241, 1, 188, 261);
commit;
prompt 14 records loaded
prompt Loading SERVICE...
prompt Table is empty
prompt Loading SHOPCART...
prompt Table is empty
prompt Loading SHOPLOG...
prompt Table is empty
prompt Enabling foreign key constraints for VIP...
alter table VIP enable constraint FK14BFDABF22633;
prompt Enabling foreign key constraints for COMMENTS...
alter table COMMENTS enable constraint FKABDCDF45E39FFBF;
prompt Enabling foreign key constraints for PRODUCT...
alter table PRODUCT enable constraint FK185958CF1BA3B099;
alter table PRODUCT enable constraint FK185958CF3651D4AB;
alter table PRODUCT enable constraint FK185958CF5E044265;
alter table PRODUCT enable constraint FK185958CF6E732E31;
alter table PRODUCT enable constraint FK185958CF6F4B648D;
alter table PRODUCT enable constraint FK185958CF89CBB1C1;
alter table PRODUCT enable constraint FK185958CF8C1F007;
alter table PRODUCT enable constraint FK185958CF967AFE8B;
alter table PRODUCT enable constraint FK185958CFA3311193;
alter table PRODUCT enable constraint FK185958CFC0F46B98;
alter table PRODUCT enable constraint FK185958CFC8225509;
alter table PRODUCT enable constraint FK_SUPPLIERID;
prompt Enabling foreign key constraints for SELLORDER...
alter table SELLORDER enable constraint FK4C6A8B1C5E39FFBF;
alter table SELLORDER enable constraint FK4C6A8B1C7B3F1B57;
alter table SELLORDER enable constraint FK4C6A8B1C917020A5;
prompt Enabling foreign key constraints for SELLPRODUCT...
alter table SELLPRODUCT enable constraint FK1175113D2A7C122F;
alter table SELLPRODUCT enable constraint FK1175113D70BD37E3;
prompt Enabling foreign key constraints for SHOPCART...
alter table SHOPCART enable constraint FK1A17DB165E39FFBF;
alter table SHOPCART enable constraint FK1A17DB1670BD37E3;
prompt Enabling triggers for ADVERT...
alter table ADVERT enable all triggers;
prompt Enabling triggers for GRADE...
alter table GRADE enable all triggers;
prompt Enabling triggers for VIP...
alter table VIP enable all triggers;
prompt Enabling triggers for COMMENTS...
alter table COMMENTS enable all triggers;
prompt Enabling triggers for EXPRESS...
alter table EXPRESS enable all triggers;
prompt Enabling triggers for FRIENDSHIP...
alter table FRIENDSHIP enable all triggers;
prompt Enabling triggers for MANAGER...
alter table MANAGER enable all triggers;
prompt Enabling triggers for ORDERSTATE...
alter table ORDERSTATE enable all triggers;
prompt Enabling triggers for PRODUCT_BRAND...
alter table PRODUCT_BRAND enable all triggers;
prompt Enabling triggers for PRODUCT_CPU...
alter table PRODUCT_CPU enable all triggers;
prompt Enabling triggers for PRODUCT_DVDROM...
alter table PRODUCT_DVDROM enable all triggers;
prompt Enabling triggers for PRODUCT_FEATURE...
alter table PRODUCT_FEATURE enable all triggers;
prompt Enabling triggers for PRODUCT_GENRE...
alter table PRODUCT_GENRE enable all triggers;
prompt Enabling triggers for PRODUCT_GRAPHICS...
alter table PRODUCT_GRAPHICS enable all triggers;
prompt Enabling triggers for PRODUCT_HARDDISK...
alter table PRODUCT_HARDDISK enable all triggers;
prompt Enabling triggers for PRODUCT_OS...
alter table PRODUCT_OS enable all triggers;
prompt Enabling triggers for PRODUCT_ROM...
alter table PRODUCT_ROM enable all triggers;
prompt Enabling triggers for PRODUCT_SCREEN...
alter table PRODUCT_SCREEN enable all triggers;
prompt Enabling triggers for PRODUCT_STYLE...
alter table PRODUCT_STYLE enable all triggers;
prompt Enabling triggers for SUPPLIER...
alter table SUPPLIER enable all triggers;
prompt Enabling triggers for PRODUCT...
alter table PRODUCT enable all triggers;
prompt Enabling triggers for SELLORDER...
alter table SELLORDER enable all triggers;
prompt Enabling triggers for SELLPRODUCT...
alter table SELLPRODUCT enable all triggers;
prompt Enabling triggers for SERVICE...
alter table SERVICE enable all triggers;
prompt Enabling triggers for SHOPCART...
alter table SHOPCART enable all triggers;
prompt Enabling triggers for SHOPLOG...
alter table SHOPLOG enable all triggers;
set feedback on
set define on
prompt Done.
