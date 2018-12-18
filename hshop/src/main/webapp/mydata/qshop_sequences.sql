-----------------------------------------------------
-- Export file for user QSHOP                      --
-- Created by Administrator on 2013-4-17, 13:12:56 --
-----------------------------------------------------

set define off
spool qshop_sequences.log

prompt
prompt Creating sequence QSHOP_AD_SEQ
prompt ==============================
prompt
create sequence QSHOP.QSHOP_AD_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 121
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_BRAND_SEQ
prompt =================================
prompt
create sequence QSHOP.QSHOP_BRAND_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 121
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_CMT_SEQ
prompt ===============================
prompt
create sequence QSHOP.QSHOP_CMT_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_CPU_SEQ
prompt ===============================
prompt
create sequence QSHOP.QSHOP_CPU_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 41
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_DVDROM_SEQ
prompt ==================================
prompt
create sequence QSHOP.QSHOP_DVDROM_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_EXP_SEQ
prompt ===============================
prompt
create sequence QSHOP.QSHOP_EXP_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 121
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_FEATURE_SEQ
prompt ===================================
prompt
create sequence QSHOP.QSHOP_FEATURE_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 41
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_FRI_SEQ
prompt ===============================
prompt
create sequence QSHOP.QSHOP_FRI_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 41
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_GENRE_SEQ
prompt =================================
prompt
create sequence QSHOP.QSHOP_GENRE_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 81
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_GRADE_SEQ
prompt =================================
prompt
create sequence QSHOP.QSHOP_GRADE_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 121
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_GRAP_SEQ
prompt ================================
prompt
create sequence QSHOP.QSHOP_GRAP_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 41
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_HDD_SEQ
prompt ===============================
prompt
create sequence QSHOP.QSHOP_HDD_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 61
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_MGR_SEQ
prompt ===============================
prompt
create sequence QSHOP.QSHOP_MGR_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_ORDS_SEQ
prompt ================================
prompt
create sequence QSHOP.QSHOP_ORDS_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 81
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_OS_SEQ
prompt ==============================
prompt
create sequence QSHOP.QSHOP_OS_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 61
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_PRODUCT_SEQ
prompt ===================================
prompt
create sequence QSHOP.QSHOP_PRODUCT_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 201
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_ROM_SEQ
prompt ===============================
prompt
create sequence QSHOP.QSHOP_ROM_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 41
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_SCREEN_SEQ
prompt ==================================
prompt
create sequence QSHOP.QSHOP_SCREEN_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_SELLORDER_SEQ
prompt =====================================
prompt
create sequence QSHOP.QSHOP_SELLORDER_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 281
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_SELLPRO_SEQ
prompt ===================================
prompt
create sequence QSHOP.QSHOP_SELLPRO_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 261
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_SERVICE_SEQ
prompt ===================================
prompt
create sequence QSHOP.QSHOP_SERVICE_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_SHOPCART_SEQ
prompt ====================================
prompt
create sequence QSHOP.QSHOP_SHOPCART_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 181
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_SHOPLOG_SEQ
prompt ===================================
prompt
create sequence QSHOP.QSHOP_SHOPLOG_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_STOCK_SEQ
prompt =================================
prompt
create sequence QSHOP.QSHOP_STOCK_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_STYLE_SEQ
prompt =================================
prompt
create sequence QSHOP.QSHOP_STYLE_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 81
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_SUPP_SEQ
prompt ================================
prompt
create sequence QSHOP.QSHOP_SUPP_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 81
increment by 1
cache 20;

prompt
prompt Creating sequence QSHOP_VIP_SEQ
prompt ===============================
prompt
create sequence QSHOP.QSHOP_VIP_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 201
increment by 1
cache 20;


spool off
