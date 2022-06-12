// $ANTLR 3.4 SelectClauseParser.g 2017-07-25 10:01:45

package org.apache.hadoop.hive.ql.parse;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.conf.HiveConf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/**
   Licensed to the Apache Software Foundation (ASF) under one or more 
   contributor license agreements.  See the NOTICE file distributed with 
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with 
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class HiveParser_SelectClauseParser extends Parser {
    public static final int EOF=-1;
    public static final int AMPERSAND=4;
    public static final int BITWISEOR=5;
    public static final int BITWISEXOR=6;
    public static final int BigintLiteral=7;
    public static final int ByteLengthLiteral=8;
    public static final int COLON=9;
    public static final int COMMA=10;
    public static final int COMMENT=11;
    public static final int CONCATENATE=12;
    public static final int CharSetLiteral=13;
    public static final int CharSetName=14;
    public static final int DIV=15;
    public static final int DIVIDE=16;
    public static final int DOLLAR=17;
    public static final int DOT=18;
    public static final int DecimalLiteral=19;
    public static final int Digit=20;
    public static final int EQUAL=21;
    public static final int EQUAL_NS=22;
    public static final int Exponent=23;
    public static final int GREATERTHAN=24;
    public static final int GREATERTHANOREQUALTO=25;
    public static final int HexDigit=26;
    public static final int Identifier=27;
    public static final int KW_ABORT=28;
    public static final int KW_ADD=29;
    public static final int KW_ADMIN=30;
    public static final int KW_AFTER=31;
    public static final int KW_ALL=32;
    public static final int KW_ALTER=33;
    public static final int KW_ANALYZE=34;
    public static final int KW_AND=35;
    public static final int KW_ARCHIVE=36;
    public static final int KW_ARRAY=37;
    public static final int KW_AS=38;
    public static final int KW_ASC=39;
    public static final int KW_AUTHORIZATION=40;
    public static final int KW_AUTOCOMMIT=41;
    public static final int KW_BEFORE=42;
    public static final int KW_BETWEEN=43;
    public static final int KW_BIGINT=44;
    public static final int KW_BINARY=45;
    public static final int KW_BOOLEAN=46;
    public static final int KW_BOTH=47;
    public static final int KW_BUCKET=48;
    public static final int KW_BUCKETS=49;
    public static final int KW_BY=50;
    public static final int KW_CACHE=51;
    public static final int KW_CASCADE=52;
    public static final int KW_CASE=53;
    public static final int KW_CAST=54;
    public static final int KW_CHANGE=55;
    public static final int KW_CHAR=56;
    public static final int KW_CLUSTER=57;
    public static final int KW_CLUSTERED=58;
    public static final int KW_CLUSTERSTATUS=59;
    public static final int KW_COLLECTION=60;
    public static final int KW_COLUMN=61;
    public static final int KW_COLUMNS=62;
    public static final int KW_COMMENT=63;
    public static final int KW_COMMIT=64;
    public static final int KW_COMPACT=65;
    public static final int KW_COMPACTIONS=66;
    public static final int KW_COMPUTE=67;
    public static final int KW_CONCATENATE=68;
    public static final int KW_CONF=69;
    public static final int KW_CONSTRAINT=70;
    public static final int KW_CONTINUE=71;
    public static final int KW_CREATE=72;
    public static final int KW_CROSS=73;
    public static final int KW_CUBE=74;
    public static final int KW_CURRENT=75;
    public static final int KW_CURRENT_DATE=76;
    public static final int KW_CURRENT_TIMESTAMP=77;
    public static final int KW_CURSOR=78;
    public static final int KW_DATA=79;
    public static final int KW_DATABASE=80;
    public static final int KW_DATABASES=81;
    public static final int KW_DATE=82;
    public static final int KW_DATETIME=83;
    public static final int KW_DAY=84;
    public static final int KW_DBPROPERTIES=85;
    public static final int KW_DECIMAL=86;
    public static final int KW_DEFERRED=87;
    public static final int KW_DEFINED=88;
    public static final int KW_DELETE=89;
    public static final int KW_DELIMITED=90;
    public static final int KW_DEPENDENCY=91;
    public static final int KW_DESC=92;
    public static final int KW_DESCRIBE=93;
    public static final int KW_DIRECTORIES=94;
    public static final int KW_DIRECTORY=95;
    public static final int KW_DISABLE=96;
    public static final int KW_DISTINCT=97;
    public static final int KW_DISTRIBUTE=98;
    public static final int KW_DOUBLE=99;
    public static final int KW_DOW=100;
    public static final int KW_DROP=101;
    public static final int KW_DUMP=102;
    public static final int KW_ELEM_TYPE=103;
    public static final int KW_ELSE=104;
    public static final int KW_ENABLE=105;
    public static final int KW_END=106;
    public static final int KW_ESCAPED=107;
    public static final int KW_EXCEPT=108;
    public static final int KW_EXCHANGE=109;
    public static final int KW_EXCLUSIVE=110;
    public static final int KW_EXISTS=111;
    public static final int KW_EXPLAIN=112;
    public static final int KW_EXPORT=113;
    public static final int KW_EXTENDED=114;
    public static final int KW_EXTERNAL=115;
    public static final int KW_EXTRACT=116;
    public static final int KW_FALSE=117;
    public static final int KW_FETCH=118;
    public static final int KW_FIELDS=119;
    public static final int KW_FILE=120;
    public static final int KW_FILEFORMAT=121;
    public static final int KW_FIRST=122;
    public static final int KW_FLOAT=123;
    public static final int KW_FLOOR=124;
    public static final int KW_FOLLOWING=125;
    public static final int KW_FOR=126;
    public static final int KW_FOREIGN=127;
    public static final int KW_FORMAT=128;
    public static final int KW_FORMATTED=129;
    public static final int KW_FROM=130;
    public static final int KW_FULL=131;
    public static final int KW_FUNCTION=132;
    public static final int KW_FUNCTIONS=133;
    public static final int KW_GRANT=134;
    public static final int KW_GROUP=135;
    public static final int KW_GROUPING=136;
    public static final int KW_HAVING=137;
    public static final int KW_HOUR=138;
    public static final int KW_IDXPROPERTIES=139;
    public static final int KW_IF=140;
    public static final int KW_IMPORT=141;
    public static final int KW_IN=142;
    public static final int KW_INDEX=143;
    public static final int KW_INDEXES=144;
    public static final int KW_INNER=145;
    public static final int KW_INPATH=146;
    public static final int KW_INPUTDRIVER=147;
    public static final int KW_INPUTFORMAT=148;
    public static final int KW_INSERT=149;
    public static final int KW_INT=150;
    public static final int KW_INTERSECT=151;
    public static final int KW_INTERVAL=152;
    public static final int KW_INTO=153;
    public static final int KW_IS=154;
    public static final int KW_ISOLATION=155;
    public static final int KW_ITEMS=156;
    public static final int KW_JAR=157;
    public static final int KW_JOIN=158;
    public static final int KW_KEY=159;
    public static final int KW_KEYS=160;
    public static final int KW_KEY_TYPE=161;
    public static final int KW_LAST=162;
    public static final int KW_LATERAL=163;
    public static final int KW_LEFT=164;
    public static final int KW_LESS=165;
    public static final int KW_LEVEL=166;
    public static final int KW_LIKE=167;
    public static final int KW_LIMIT=168;
    public static final int KW_LINES=169;
    public static final int KW_LOAD=170;
    public static final int KW_LOCAL=171;
    public static final int KW_LOCATION=172;
    public static final int KW_LOCK=173;
    public static final int KW_LOCKS=174;
    public static final int KW_LOGICAL=175;
    public static final int KW_LONG=176;
    public static final int KW_MACRO=177;
    public static final int KW_MAP=178;
    public static final int KW_MAPJOIN=179;
    public static final int KW_MATCHED=180;
    public static final int KW_MATERIALIZED=181;
    public static final int KW_MERGE=182;
    public static final int KW_METADATA=183;
    public static final int KW_MINUS=184;
    public static final int KW_MINUTE=185;
    public static final int KW_MONTH=186;
    public static final int KW_MORE=187;
    public static final int KW_MSCK=188;
    public static final int KW_NONE=189;
    public static final int KW_NORELY=190;
    public static final int KW_NOSCAN=191;
    public static final int KW_NOT=192;
    public static final int KW_NOVALIDATE=193;
    public static final int KW_NULL=194;
    public static final int KW_NULLS=195;
    public static final int KW_OF=196;
    public static final int KW_OFFSET=197;
    public static final int KW_ON=198;
    public static final int KW_ONLY=199;
    public static final int KW_OPTION=200;
    public static final int KW_OR=201;
    public static final int KW_ORDER=202;
    public static final int KW_OUT=203;
    public static final int KW_OUTER=204;
    public static final int KW_OUTPUTDRIVER=205;
    public static final int KW_OUTPUTFORMAT=206;
    public static final int KW_OVER=207;
    public static final int KW_OVERWRITE=208;
    public static final int KW_OWNER=209;
    public static final int KW_PARTIALSCAN=210;
    public static final int KW_PARTITION=211;
    public static final int KW_PARTITIONED=212;
    public static final int KW_PARTITIONS=213;
    public static final int KW_PERCENT=214;
    public static final int KW_PLUS=215;
    public static final int KW_PRECEDING=216;
    public static final int KW_PRECISION=217;
    public static final int KW_PRESERVE=218;
    public static final int KW_PRETTY=219;
    public static final int KW_PRIMARY=220;
    public static final int KW_PRINCIPALS=221;
    public static final int KW_PROCEDURE=222;
    public static final int KW_PURGE=223;
    public static final int KW_QUARTER=224;
    public static final int KW_RANGE=225;
    public static final int KW_READ=226;
    public static final int KW_READS=227;
    public static final int KW_REBUILD=228;
    public static final int KW_RECORDREADER=229;
    public static final int KW_RECORDWRITER=230;
    public static final int KW_REDUCE=231;
    public static final int KW_REFERENCES=232;
    public static final int KW_REGEXP=233;
    public static final int KW_RELOAD=234;
    public static final int KW_RELY=235;
    public static final int KW_RENAME=236;
    public static final int KW_REPAIR=237;
    public static final int KW_REPL=238;
    public static final int KW_REPLACE=239;
    public static final int KW_REPLICATION=240;
    public static final int KW_RESTRICT=241;
    public static final int KW_REVOKE=242;
    public static final int KW_REWRITE=243;
    public static final int KW_RIGHT=244;
    public static final int KW_RLIKE=245;
    public static final int KW_ROLE=246;
    public static final int KW_ROLES=247;
    public static final int KW_ROLLBACK=248;
    public static final int KW_ROLLUP=249;
    public static final int KW_ROW=250;
    public static final int KW_ROWS=251;
    public static final int KW_SCHEMA=252;
    public static final int KW_SCHEMAS=253;
    public static final int KW_SECOND=254;
    public static final int KW_SELECT=255;
    public static final int KW_SEMI=256;
    public static final int KW_SERDE=257;
    public static final int KW_SERDEPROPERTIES=258;
    public static final int KW_SERVER=259;
    public static final int KW_SET=260;
    public static final int KW_SETS=261;
    public static final int KW_SHARED=262;
    public static final int KW_SHOW=263;
    public static final int KW_SHOW_DATABASE=264;
    public static final int KW_SKEWED=265;
    public static final int KW_SMALLINT=266;
    public static final int KW_SNAPSHOT=267;
    public static final int KW_SORT=268;
    public static final int KW_SORTED=269;
    public static final int KW_SSL=270;
    public static final int KW_START=271;
    public static final int KW_STATISTICS=272;
    public static final int KW_STATUS=273;
    public static final int KW_STORED=274;
    public static final int KW_STREAMTABLE=275;
    public static final int KW_STRING=276;
    public static final int KW_STRUCT=277;
    public static final int KW_TABLE=278;
    public static final int KW_TABLES=279;
    public static final int KW_TABLESAMPLE=280;
    public static final int KW_TBLPROPERTIES=281;
    public static final int KW_TEMPORARY=282;
    public static final int KW_TERMINATED=283;
    public static final int KW_THEN=284;
    public static final int KW_TIMESTAMP=285;
    public static final int KW_TINYINT=286;
    public static final int KW_TO=287;
    public static final int KW_TOUCH=288;
    public static final int KW_TRANSACTION=289;
    public static final int KW_TRANSACTIONS=290;
    public static final int KW_TRANSFORM=291;
    public static final int KW_TRIGGER=292;
    public static final int KW_TRUE=293;
    public static final int KW_TRUNCATE=294;
    public static final int KW_UNARCHIVE=295;
    public static final int KW_UNBOUNDED=296;
    public static final int KW_UNDO=297;
    public static final int KW_UNION=298;
    public static final int KW_UNIONTYPE=299;
    public static final int KW_UNIQUEJOIN=300;
    public static final int KW_UNLOCK=301;
    public static final int KW_UNSET=302;
    public static final int KW_UNSIGNED=303;
    public static final int KW_UPDATE=304;
    public static final int KW_URI=305;
    public static final int KW_USE=306;
    public static final int KW_USER=307;
    public static final int KW_USING=308;
    public static final int KW_UTC=309;
    public static final int KW_UTCTIMESTAMP=310;
    public static final int KW_VALIDATE=311;
    public static final int KW_VALUES=312;
    public static final int KW_VALUE_TYPE=313;
    public static final int KW_VARCHAR=314;
    public static final int KW_VIEW=315;
    public static final int KW_VIEWS=316;
    public static final int KW_WEEK=317;
    public static final int KW_WHEN=318;
    public static final int KW_WHERE=319;
    public static final int KW_WHILE=320;
    public static final int KW_WINDOW=321;
    public static final int KW_WITH=322;
    public static final int KW_WORK=323;
    public static final int KW_WRITE=324;
    public static final int KW_YEAR=325;
    public static final int LCURLY=326;
    public static final int LESSTHAN=327;
    public static final int LESSTHANOREQUALTO=328;
    public static final int LPAREN=329;
    public static final int LSQUARE=330;
    public static final int Letter=331;
    public static final int MINUS=332;
    public static final int MOD=333;
    public static final int NOTEQUAL=334;
    public static final int Number=335;
    public static final int PLUS=336;
    public static final int QUESTION=337;
    public static final int QuotedIdentifier=338;
    public static final int RCURLY=339;
    public static final int RPAREN=340;
    public static final int RSQUARE=341;
    public static final int RegexComponent=342;
    public static final int SEMICOLON=343;
    public static final int STAR=344;
    public static final int SmallintLiteral=345;
    public static final int StringLiteral=346;
    public static final int TILDE=347;
    public static final int TinyintLiteral=348;
    public static final int WS=349;
    public static final int KW_BATCH=382;
    public static final int KW_DAYOFWEEK=421;
    public static final int KW_HOLD_DDLTIME=471;
    public static final int KW_IGNORE=475;
    public static final int KW_NO_DROP=525;
    public static final int KW_OFFLINE=529;
    public static final int KW_PROTECTION=553;
    public static final int KW_READONLY=558;
    public static final int TOK_ABORT_TRANSACTIONS=671;
    public static final int TOK_ADMIN_OPTION_FOR=672;
    public static final int TOK_ALIASLIST=673;
    public static final int TOK_ALLCOLREF=674;
    public static final int TOK_ALTERDATABASE_OWNER=675;
    public static final int TOK_ALTERDATABASE_PROPERTIES=676;
    public static final int TOK_ALTERINDEX_PROPERTIES=677;
    public static final int TOK_ALTERINDEX_REBUILD=678;
    public static final int TOK_ALTERTABLE=679;
    public static final int TOK_ALTERTABLE_ADDCOLS=680;
    public static final int TOK_ALTERTABLE_ADDCONSTRAINT=681;
    public static final int TOK_ALTERTABLE_ADDPARTS=682;
    public static final int TOK_ALTERTABLE_ARCHIVE=683;
    public static final int TOK_ALTERTABLE_BUCKETS=684;
    public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=685;
    public static final int TOK_ALTERTABLE_CLUSTER_SORT=686;
    public static final int TOK_ALTERTABLE_COMPACT=687;
    public static final int TOK_ALTERTABLE_DROPCONSTRAINT=688;
    public static final int TOK_ALTERTABLE_DROPPARTS=689;
    public static final int TOK_ALTERTABLE_DROPPROPERTIES=690;
    public static final int TOK_ALTERTABLE_EXCHANGEPARTITION=691;
    public static final int TOK_ALTERTABLE_FILEFORMAT=692;
    public static final int TOK_ALTERTABLE_LOCATION=693;
    public static final int TOK_ALTERTABLE_MERGEFILES=694;
    public static final int TOK_ALTERTABLE_PARTCOLTYPE=695;
    public static final int TOK_ALTERTABLE_PROPERTIES=696;
    public static final int TOK_ALTERTABLE_RENAME=697;
    public static final int TOK_ALTERTABLE_RENAMECOL=698;
    public static final int TOK_ALTERTABLE_RENAMEPART=699;
    public static final int TOK_ALTERTABLE_REPLACECOLS=700;
    public static final int TOK_ALTERTABLE_SERDEPROPERTIES=701;
    public static final int TOK_ALTERTABLE_SERIALIZER=702;
    public static final int TOK_ALTERTABLE_SKEWED=703;
    public static final int TOK_ALTERTABLE_SKEWED_LOCATION=704;
    public static final int TOK_ALTERTABLE_TOUCH=705;
    public static final int TOK_ALTERTABLE_UNARCHIVE=706;
    public static final int TOK_ALTERTABLE_UPDATECOLSTATS=707;
    public static final int TOK_ALTERTABLE_UPDATESTATS=708;
    public static final int TOK_ALTERVIEW=709;
    public static final int TOK_ALTERVIEW_ADDPARTS=710;
    public static final int TOK_ALTERVIEW_DROPPARTS=711;
    public static final int TOK_ALTERVIEW_DROPPROPERTIES=712;
    public static final int TOK_ALTERVIEW_PROPERTIES=713;
    public static final int TOK_ALTERVIEW_RENAME=714;
    public static final int TOK_ANALYZE=715;
    public static final int TOK_ANONYMOUS=716;
    public static final int TOK_ARCHIVE=717;
    public static final int TOK_BIGINT=718;
    public static final int TOK_BINARY=719;
    public static final int TOK_BOOLEAN=720;
    public static final int TOK_CACHE_METADATA=721;
    public static final int TOK_CASCADE=722;
    public static final int TOK_CHAR=723;
    public static final int TOK_CHARSETLITERAL=724;
    public static final int TOK_CLUSTERBY=725;
    public static final int TOK_COLTYPELIST=726;
    public static final int TOK_COL_NAME=727;
    public static final int TOK_COMMIT=728;
    public static final int TOK_CREATEDATABASE=729;
    public static final int TOK_CREATEFUNCTION=730;
    public static final int TOK_CREATEINDEX=731;
    public static final int TOK_CREATEINDEX_INDEXTBLNAME=732;
    public static final int TOK_CREATEMACRO=733;
    public static final int TOK_CREATEROLE=734;
    public static final int TOK_CREATETABLE=735;
    public static final int TOK_CREATEVIEW=736;
    public static final int TOK_CROSSJOIN=737;
    public static final int TOK_CTE=738;
    public static final int TOK_CUBE_GROUPBY=739;
    public static final int TOK_DATABASECOMMENT=740;
    public static final int TOK_DATABASELOCATION=741;
    public static final int TOK_DATABASEPROPERTIES=742;
    public static final int TOK_DATE=743;
    public static final int TOK_DATELITERAL=744;
    public static final int TOK_DATETIME=745;
    public static final int TOK_DBPROPLIST=746;
    public static final int TOK_DB_TYPE=747;
    public static final int TOK_DECIMAL=748;
    public static final int TOK_DEFERRED_REBUILDINDEX=749;
    public static final int TOK_DELETE=750;
    public static final int TOK_DELETE_FROM=751;
    public static final int TOK_DESCDATABASE=752;
    public static final int TOK_DESCFUNCTION=753;
    public static final int TOK_DESCTABLE=754;
    public static final int TOK_DESTINATION=755;
    public static final int TOK_DIR=756;
    public static final int TOK_DISABLE=757;
    public static final int TOK_DISTRIBUTEBY=758;
    public static final int TOK_DOUBLE=759;
    public static final int TOK_DROPDATABASE=760;
    public static final int TOK_DROPFUNCTION=761;
    public static final int TOK_DROPINDEX=762;
    public static final int TOK_DROPMACRO=763;
    public static final int TOK_DROPROLE=764;
    public static final int TOK_DROPTABLE=765;
    public static final int TOK_DROPVIEW=766;
    public static final int TOK_ENABLE=767;
    public static final int TOK_EXCEPTALL=768;
    public static final int TOK_EXCEPTDISTINCT=769;
    public static final int TOK_EXPLAIN=770;
    public static final int TOK_EXPLAIN_SQ_REWRITE=771;
    public static final int TOK_EXPLIST=772;
    public static final int TOK_EXPORT=773;
    public static final int TOK_FALSE=774;
    public static final int TOK_FILE=775;
    public static final int TOK_FILEFORMAT_GENERIC=776;
    public static final int TOK_FLOAT=777;
    public static final int TOK_FOREIGN_KEY=778;
    public static final int TOK_FROM=779;
    public static final int TOK_FULLOUTERJOIN=780;
    public static final int TOK_FUNCTION=781;
    public static final int TOK_FUNCTIONDI=782;
    public static final int TOK_FUNCTIONSTAR=783;
    public static final int TOK_GRANT=784;
    public static final int TOK_GRANT_OPTION_FOR=785;
    public static final int TOK_GRANT_ROLE=786;
    public static final int TOK_GRANT_WITH_ADMIN_OPTION=787;
    public static final int TOK_GRANT_WITH_OPTION=788;
    public static final int TOK_GROUP=789;
    public static final int TOK_GROUPBY=790;
    public static final int TOK_GROUPING_SETS=791;
    public static final int TOK_GROUPING_SETS_EXPRESSION=792;
    public static final int TOK_HAVING=793;
    public static final int TOK_HINT=794;
    public static final int TOK_HINTARGLIST=795;
    public static final int TOK_HINTLIST=796;
    public static final int TOK_IFEXISTS=797;
    public static final int TOK_IFNOTEXISTS=798;
    public static final int TOK_IMPORT=799;
    public static final int TOK_INDEXCOMMENT=800;
    public static final int TOK_INDEXPROPERTIES=801;
    public static final int TOK_INDEXPROPLIST=802;
    public static final int TOK_INSERT=803;
    public static final int TOK_INSERT_INTO=804;
    public static final int TOK_INT=805;
    public static final int TOK_INTERSECTALL=806;
    public static final int TOK_INTERSECTDISTINCT=807;
    public static final int TOK_INTERVAL_DAY_LITERAL=808;
    public static final int TOK_INTERVAL_DAY_TIME=809;
    public static final int TOK_INTERVAL_DAY_TIME_LITERAL=810;
    public static final int TOK_INTERVAL_HOUR_LITERAL=811;
    public static final int TOK_INTERVAL_MINUTE_LITERAL=812;
    public static final int TOK_INTERVAL_MONTH_LITERAL=813;
    public static final int TOK_INTERVAL_SECOND_LITERAL=814;
    public static final int TOK_INTERVAL_YEAR_LITERAL=815;
    public static final int TOK_INTERVAL_YEAR_MONTH=816;
    public static final int TOK_INTERVAL_YEAR_MONTH_LITERAL=817;
    public static final int TOK_ISNOTNULL=818;
    public static final int TOK_ISNULL=819;
    public static final int TOK_ISOLATION_LEVEL=820;
    public static final int TOK_ISOLATION_SNAPSHOT=821;
    public static final int TOK_JAR=822;
    public static final int TOK_JOIN=823;
    public static final int TOK_LATERAL_VIEW=824;
    public static final int TOK_LATERAL_VIEW_OUTER=825;
    public static final int TOK_LEFTOUTERJOIN=826;
    public static final int TOK_LEFTSEMIJOIN=827;
    public static final int TOK_LENGTH=828;
    public static final int TOK_LIKETABLE=829;
    public static final int TOK_LIMIT=830;
    public static final int TOK_LIST=831;
    public static final int TOK_LOAD=832;
    public static final int TOK_LOCKDB=833;
    public static final int TOK_LOCKTABLE=834;
    public static final int TOK_MAP=835;
    public static final int TOK_MAPJOIN=836;
    public static final int TOK_MATCHED=837;
    public static final int TOK_MERGE=838;
    public static final int TOK_METADATA=839;
    public static final int TOK_MSCK=840;
    public static final int TOK_NORELY=841;
    public static final int TOK_NOT_CLUSTERED=842;
    public static final int TOK_NOT_MATCHED=843;
    public static final int TOK_NOT_SORTED=844;
    public static final int TOK_NOVALIDATE=845;
    public static final int TOK_NO_DROP=846;
    public static final int TOK_NULL=847;
    public static final int TOK_NULLS_FIRST=848;
    public static final int TOK_NULLS_LAST=849;
    public static final int TOK_OFFLINE=850;
    public static final int TOK_OFFSET=851;
    public static final int TOK_OP_ADD=852;
    public static final int TOK_OP_AND=853;
    public static final int TOK_OP_BITAND=854;
    public static final int TOK_OP_BITNOT=855;
    public static final int TOK_OP_BITOR=856;
    public static final int TOK_OP_BITXOR=857;
    public static final int TOK_OP_DIV=858;
    public static final int TOK_OP_EQ=859;
    public static final int TOK_OP_GE=860;
    public static final int TOK_OP_GT=861;
    public static final int TOK_OP_LE=862;
    public static final int TOK_OP_LIKE=863;
    public static final int TOK_OP_LT=864;
    public static final int TOK_OP_MOD=865;
    public static final int TOK_OP_MUL=866;
    public static final int TOK_OP_NE=867;
    public static final int TOK_OP_NOT=868;
    public static final int TOK_OP_OR=869;
    public static final int TOK_OP_SUB=870;
    public static final int TOK_ORDERBY=871;
    public static final int TOK_ORREPLACE=872;
    public static final int TOK_PARTITIONINGSPEC=873;
    public static final int TOK_PARTITIONLOCATION=874;
    public static final int TOK_PARTSPEC=875;
    public static final int TOK_PARTVAL=876;
    public static final int TOK_PERCENT=877;
    public static final int TOK_PRIMARY_KEY=878;
    public static final int TOK_PRINCIPAL_NAME=879;
    public static final int TOK_PRIVILEGE=880;
    public static final int TOK_PRIVILEGE_LIST=881;
    public static final int TOK_PRIV_ALL=882;
    public static final int TOK_PRIV_ALTER_DATA=883;
    public static final int TOK_PRIV_ALTER_METADATA=884;
    public static final int TOK_PRIV_CREATE=885;
    public static final int TOK_PRIV_DELETE=886;
    public static final int TOK_PRIV_DROP=887;
    public static final int TOK_PRIV_INDEX=888;
    public static final int TOK_PRIV_INSERT=889;
    public static final int TOK_PRIV_LOCK=890;
    public static final int TOK_PRIV_OBJECT=891;
    public static final int TOK_PRIV_OBJECT_COL=892;
    public static final int TOK_PRIV_SELECT=893;
    public static final int TOK_PRIV_SHOW_DATABASE=894;
    public static final int TOK_PTBLFUNCTION=895;
    public static final int TOK_QUERY=896;
    public static final int TOK_READONLY=897;
    public static final int TOK_RECORDREADER=898;
    public static final int TOK_RECORDWRITER=899;
    public static final int TOK_RELOADFUNCTION=900;
    public static final int TOK_RELY=901;
    public static final int TOK_REPLICATION=902;
    public static final int TOK_REPL_DUMP=903;
    public static final int TOK_REPL_LOAD=904;
    public static final int TOK_REPL_STATUS=905;
    public static final int TOK_RESOURCE_ALL=906;
    public static final int TOK_RESOURCE_LIST=907;
    public static final int TOK_RESOURCE_URI=908;
    public static final int TOK_RESTRICT=909;
    public static final int TOK_REVOKE=910;
    public static final int TOK_REVOKE_ROLE=911;
    public static final int TOK_RIGHTOUTERJOIN=912;
    public static final int TOK_ROLE=913;
    public static final int TOK_ROLLBACK=914;
    public static final int TOK_ROLLUP_GROUPBY=915;
    public static final int TOK_ROWCOUNT=916;
    public static final int TOK_SELECT=917;
    public static final int TOK_SELECTDI=918;
    public static final int TOK_SELEXPR=919;
    public static final int TOK_SERDE=920;
    public static final int TOK_SERDENAME=921;
    public static final int TOK_SERDEPROPS=922;
    public static final int TOK_SERVER_TYPE=923;
    public static final int TOK_SETCOLREF=924;
    public static final int TOK_SET_AUTOCOMMIT=925;
    public static final int TOK_SET_COLUMNS_CLAUSE=926;
    public static final int TOK_SHOWCOLUMNS=927;
    public static final int TOK_SHOWCONF=928;
    public static final int TOK_SHOWDATABASES=929;
    public static final int TOK_SHOWDBLOCKS=930;
    public static final int TOK_SHOWFUNCTIONS=931;
    public static final int TOK_SHOWINDEXES=932;
    public static final int TOK_SHOWLOCKS=933;
    public static final int TOK_SHOWPARTITIONS=934;
    public static final int TOK_SHOWTABLES=935;
    public static final int TOK_SHOW_COMPACTIONS=936;
    public static final int TOK_SHOW_CREATEDATABASE=937;
    public static final int TOK_SHOW_CREATETABLE=938;
    public static final int TOK_SHOW_GRANT=939;
    public static final int TOK_SHOW_ROLES=940;
    public static final int TOK_SHOW_ROLE_GRANT=941;
    public static final int TOK_SHOW_ROLE_PRINCIPALS=942;
    public static final int TOK_SHOW_SET_ROLE=943;
    public static final int TOK_SHOW_TABLESTATUS=944;
    public static final int TOK_SHOW_TBLPROPERTIES=945;
    public static final int TOK_SHOW_TRANSACTIONS=946;
    public static final int TOK_SKEWED_LOCATIONS=947;
    public static final int TOK_SKEWED_LOCATION_LIST=948;
    public static final int TOK_SKEWED_LOCATION_MAP=949;
    public static final int TOK_SMALLINT=950;
    public static final int TOK_SORTBY=951;
    public static final int TOK_START_TRANSACTION=952;
    public static final int TOK_STORAGEHANDLER=953;
    public static final int TOK_STOREDASDIRS=954;
    public static final int TOK_STREAMTABLE=955;
    public static final int TOK_STRING=956;
    public static final int TOK_STRINGLITERALSEQUENCE=957;
    public static final int TOK_STRUCT=958;
    public static final int TOK_SUBQUERY=959;
    public static final int TOK_SUBQUERY_EXPR=960;
    public static final int TOK_SUBQUERY_OP=961;
    public static final int TOK_SUBQUERY_OP_NOTEXISTS=962;
    public static final int TOK_SUBQUERY_OP_NOTIN=963;
    public static final int TOK_SWITCHDATABASE=964;
    public static final int TOK_TAB=965;
    public static final int TOK_TABALIAS=966;
    public static final int TOK_TABCOL=967;
    public static final int TOK_TABCOLLIST=968;
    public static final int TOK_TABCOLNAME=969;
    public static final int TOK_TABCOLVALUE=970;
    public static final int TOK_TABCOLVALUES=971;
    public static final int TOK_TABCOLVALUE_PAIR=972;
    public static final int TOK_TABLEBUCKETSAMPLE=973;
    public static final int TOK_TABLECOMMENT=974;
    public static final int TOK_TABLEFILEFORMAT=975;
    public static final int TOK_TABLELOCATION=976;
    public static final int TOK_TABLEPARTCOLS=977;
    public static final int TOK_TABLEPROPERTIES=978;
    public static final int TOK_TABLEPROPERTY=979;
    public static final int TOK_TABLEPROPLIST=980;
    public static final int TOK_TABLEROWFORMAT=981;
    public static final int TOK_TABLEROWFORMATCOLLITEMS=982;
    public static final int TOK_TABLEROWFORMATFIELD=983;
    public static final int TOK_TABLEROWFORMATLINES=984;
    public static final int TOK_TABLEROWFORMATMAPKEYS=985;
    public static final int TOK_TABLEROWFORMATNULL=986;
    public static final int TOK_TABLESERIALIZER=987;
    public static final int TOK_TABLESKEWED=988;
    public static final int TOK_TABLESPLITSAMPLE=989;
    public static final int TOK_TABLE_OR_COL=990;
    public static final int TOK_TABLE_PARTITION=991;
    public static final int TOK_TABLE_TYPE=992;
    public static final int TOK_TABNAME=993;
    public static final int TOK_TABREF=994;
    public static final int TOK_TABSORTCOLNAMEASC=995;
    public static final int TOK_TABSORTCOLNAMEDESC=996;
    public static final int TOK_TABSRC=997;
    public static final int TOK_TABTYPE=998;
    public static final int TOK_TEMPORARY=999;
    public static final int TOK_TIMESTAMP=1000;
    public static final int TOK_TIMESTAMPLITERAL=1001;
    public static final int TOK_TINYINT=1002;
    public static final int TOK_TMP_FILE=1003;
    public static final int TOK_TO=1004;
    public static final int TOK_TRANSFORM=1005;
    public static final int TOK_TRUE=1006;
    public static final int TOK_TRUNCATETABLE=1007;
    public static final int TOK_TXN_ACCESS_MODE=1008;
    public static final int TOK_TXN_READ_ONLY=1009;
    public static final int TOK_TXN_READ_WRITE=1010;
    public static final int TOK_UNIONALL=1011;
    public static final int TOK_UNIONDISTINCT=1012;
    public static final int TOK_UNIONTYPE=1013;
    public static final int TOK_UNIQUEJOIN=1014;
    public static final int TOK_UNLOCKDB=1015;
    public static final int TOK_UNLOCKTABLE=1016;
    public static final int TOK_UPDATE=1017;
    public static final int TOK_UPDATE_TABLE=1018;
    public static final int TOK_URI_TYPE=1019;
    public static final int TOK_USER=1020;
    public static final int TOK_USERSCRIPTCOLNAMES=1021;
    public static final int TOK_USERSCRIPTCOLSCHEMA=1022;
    public static final int TOK_VALIDATE=1023;
    public static final int TOK_VALUES_TABLE=1024;
    public static final int TOK_VALUE_ROW=1025;
    public static final int TOK_VARCHAR=1026;
    public static final int TOK_VIEWPARTCOLS=1027;
    public static final int TOK_VIRTUAL_TABLE=1028;
    public static final int TOK_VIRTUAL_TABREF=1029;
    public static final int TOK_WHERE=1030;
    public static final int TOK_WINDOWDEF=1031;
    public static final int TOK_WINDOWRANGE=1032;
    public static final int TOK_WINDOWSPEC=1033;
    public static final int TOK_WINDOWVALUES=1034;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators
    public HiveParser gHiveParser;
    public HiveParser gParent;


    public HiveParser_SelectClauseParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_SelectClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
        super(input, state);
        this.gHiveParser = gHiveParser;
        gParent = gHiveParser;
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return HiveParser.tokenNames; }
    public String getGrammarFileName() { return "SelectClauseParser.g"; }


      @Override
      public Object recoverFromMismatchedSet(IntStream input,
          RecognitionException re, BitSet follow) throws RecognitionException {
        throw re;
      }
      @Override
      public void displayRecognitionError(String[] tokenNames,
          RecognitionException e) {
        gParent.errors.add(new ParseError(gParent, e, tokenNames));
      }
      protected boolean useSQL11ReservedKeywordsForIdentifier() {
        return gParent.useSQL11ReservedKeywordsForIdentifier();
      }


    public static class selectClause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectClause"
    // SelectClauseParser.g:51:1: selectClause : ( KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) ) -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList ) -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList ) -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) );
    public final HiveParser_SelectClauseParser.selectClause_return selectClause() throws RecognitionException {
        HiveParser_SelectClauseParser.selectClause_return retval = new HiveParser_SelectClauseParser.selectClause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token dist=null;
        Token transform=null;
        Token KW_SELECT1=null;
        Token KW_ALL3=null;
        HiveParser_SelectClauseParser.hintClause_return hintClause2 =null;

        HiveParser_SelectClauseParser.selectList_return selectList4 =null;

        HiveParser_SelectClauseParser.selectTrfmClause_return selectTrfmClause5 =null;

        HiveParser_SelectClauseParser.trfmClause_return trfmClause6 =null;


        ASTNode dist_tree=null;
        ASTNode transform_tree=null;
        ASTNode KW_SELECT1_tree=null;
        ASTNode KW_ALL3_tree=null;
        RewriteRuleTokenStream stream_KW_TRANSFORM=new RewriteRuleTokenStream(adaptor,"token KW_TRANSFORM");
        RewriteRuleTokenStream stream_KW_DISTINCT=new RewriteRuleTokenStream(adaptor,"token KW_DISTINCT");
        RewriteRuleTokenStream stream_KW_SELECT=new RewriteRuleTokenStream(adaptor,"token KW_SELECT");
        RewriteRuleTokenStream stream_KW_ALL=new RewriteRuleTokenStream(adaptor,"token KW_ALL");
        RewriteRuleSubtreeStream stream_trfmClause=new RewriteRuleSubtreeStream(adaptor,"rule trfmClause");
        RewriteRuleSubtreeStream stream_selectList=new RewriteRuleSubtreeStream(adaptor,"rule selectList");
        RewriteRuleSubtreeStream stream_selectTrfmClause=new RewriteRuleSubtreeStream(adaptor,"rule selectTrfmClause");
        RewriteRuleSubtreeStream stream_hintClause=new RewriteRuleSubtreeStream(adaptor,"rule hintClause");
         gParent.pushMsg("select clause", state); 
        try {
            // SelectClauseParser.g:54:5: ( KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) ) -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList ) -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList ) -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case KW_SELECT:
                {
                alt4=1;
                }
                break;
            case KW_MAP:
            case KW_REDUCE:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // SelectClauseParser.g:55:5: KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) )
                    {
                    KW_SELECT1=(Token)match(input,KW_SELECT,FOLLOW_KW_SELECT_in_selectClause71); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SELECT.add(KW_SELECT1);


                    // SelectClauseParser.g:55:15: ( hintClause )?
                    int alt1=2;
                    switch ( input.LA(1) ) {
                        case DIVIDE:
                            {
                            alt1=1;
                            }
                            break;
                    }

                    switch (alt1) {
                        case 1 :
                            // SelectClauseParser.g:55:15: hintClause
                            {
                            pushFollow(FOLLOW_hintClause_in_selectClause73);
                            hintClause2=hintClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_hintClause.add(hintClause2.getTree());

                            }
                            break;

                    }


                    // SelectClauseParser.g:55:27: ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) )
                    int alt3=2;
                    switch ( input.LA(1) ) {
                    case BigintLiteral:
                    case CharSetName:
                    case DecimalLiteral:
                    case Identifier:
                    case KW_ABORT:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_AUTHORIZATION:
                    case KW_AUTOCOMMIT:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CACHE:
                    case KW_CASCADE:
                    case KW_CASE:
                    case KW_CAST:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONSTRAINT:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURRENT_DATE:
                    case KW_CURRENT_TIMESTAMP:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DAY:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTINCT:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DOW:
                    case KW_DROP:
                    case KW_DUMP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_EXTRACT:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FLOOR:
                    case KW_FOR:
                    case KW_FOREIGN:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOUR:
                    case KW_IDXPROPERTIES:
                    case KW_IF:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTERVAL:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ISOLATION:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEY:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LAST:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LEVEL:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAP:
                    case KW_MAPJOIN:
                    case KW_MATCHED:
                    case KW_MATERIALIZED:
                    case KW_MERGE:
                    case KW_METADATA:
                    case KW_MINUTE:
                    case KW_MONTH:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NORELY:
                    case KW_NOSCAN:
                    case KW_NOT:
                    case KW_NOVALIDATE:
                    case KW_NULL:
                    case KW_NULLS:
                    case KW_OF:
                    case KW_OFFSET:
                    case KW_OPTION:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRIMARY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PURGE:
                    case KW_QUARTER:
                    case KW_RANGE:
                    case KW_READ:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REFERENCES:
                    case KW_REGEXP:
                    case KW_RELOAD:
                    case KW_RELY:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPL:
                    case KW_REPLACE:
                    case KW_REPLICATION:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_REWRITE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SECOND:
                    case KW_SEMI:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SERVER:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SNAPSHOT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STATUS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTION:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_URI:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALIDATE:
                    case KW_VALUES:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_VIEWS:
                    case KW_WEEK:
                    case KW_WHILE:
                    case KW_WITH:
                    case KW_WORK:
                    case KW_WRITE:
                    case KW_YEAR:
                    case LPAREN:
                    case MINUS:
                    case Number:
                    case PLUS:
                    case STAR:
                    case SmallintLiteral:
                    case StringLiteral:
                    case TILDE:
                    case TinyintLiteral:
                    case KW_BATCH:
                    case KW_DAYOFWEEK:
                    case KW_HOLD_DDLTIME:
                    case KW_IGNORE:
                    case KW_NO_DROP:
                    case KW_OFFLINE:
                    case KW_PROTECTION:
                    case KW_READONLY:
                        {
                        alt3=1;
                        }
                        break;
                    case KW_TRANSFORM:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;

                    }

                    switch (alt3) {
                        case 1 :
                            // SelectClauseParser.g:55:28: ( ( KW_ALL |dist= KW_DISTINCT )? selectList )
                            {
                            // SelectClauseParser.g:55:28: ( ( KW_ALL |dist= KW_DISTINCT )? selectList )
                            // SelectClauseParser.g:55:29: ( KW_ALL |dist= KW_DISTINCT )? selectList
                            {
                            // SelectClauseParser.g:55:29: ( KW_ALL |dist= KW_DISTINCT )?
                            int alt2=3;
                            alt2 = dfa2.predict(input);
                            switch (alt2) {
                                case 1 :
                                    // SelectClauseParser.g:55:30: KW_ALL
                                    {
                                    KW_ALL3=(Token)match(input,KW_ALL,FOLLOW_KW_ALL_in_selectClause79); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_KW_ALL.add(KW_ALL3);


                                    }
                                    break;
                                case 2 :
                                    // SelectClauseParser.g:55:39: dist= KW_DISTINCT
                                    {
                                    dist=(Token)match(input,KW_DISTINCT,FOLLOW_KW_DISTINCT_in_selectClause85); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_KW_DISTINCT.add(dist);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_selectList_in_selectClause89);
                            selectList4=selectList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_selectList.add(selectList4.getTree());

                            }


                            }
                            break;
                        case 2 :
                            // SelectClauseParser.g:56:29: (transform= KW_TRANSFORM selectTrfmClause )
                            {
                            // SelectClauseParser.g:56:29: (transform= KW_TRANSFORM selectTrfmClause )
                            // SelectClauseParser.g:56:30: transform= KW_TRANSFORM selectTrfmClause
                            {
                            transform=(Token)match(input,KW_TRANSFORM,FOLLOW_KW_TRANSFORM_in_selectClause123); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_TRANSFORM.add(transform);


                            pushFollow(FOLLOW_selectTrfmClause_in_selectClause125);
                            selectTrfmClause5=selectTrfmClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_selectTrfmClause.add(selectTrfmClause5.getTree());

                            }


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: hintClause, hintClause, selectList, selectTrfmClause, hintClause, selectList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 57:6: -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList )
                    if (transform == null && dist == null) {
                        // SelectClauseParser.g:57:48: ^( TOK_SELECT ( hintClause )? selectList )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_1);

                        // SelectClauseParser.g:57:61: ( hintClause )?
                        if ( stream_hintClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_hintClause.nextTree());

                        }
                        stream_hintClause.reset();

                        adaptor.addChild(root_1, stream_selectList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 58:6: -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList )
                    if (transform == null && dist != null) {
                        // SelectClauseParser.g:58:48: ^( TOK_SELECTDI ( hintClause )? selectList )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELECTDI, "TOK_SELECTDI")
                        , root_1);

                        // SelectClauseParser.g:58:63: ( hintClause )?
                        if ( stream_hintClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_hintClause.nextTree());

                        }
                        stream_hintClause.reset();

                        adaptor.addChild(root_1, stream_selectList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 59:6: -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) )
                    {
                        // SelectClauseParser.g:59:9: ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_1);

                        // SelectClauseParser.g:59:22: ( hintClause )?
                        if ( stream_hintClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_hintClause.nextTree());

                        }
                        stream_hintClause.reset();

                        // SelectClauseParser.g:59:34: ^( TOK_SELEXPR selectTrfmClause )
                        {
                        ASTNode root_2 = (ASTNode)adaptor.nil();
                        root_2 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_2);

                        adaptor.addChild(root_2, stream_selectTrfmClause.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:61:5: trfmClause
                    {
                    pushFollow(FOLLOW_trfmClause_in_selectClause196);
                    trfmClause6=trfmClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_trfmClause.add(trfmClause6.getTree());

                    // AST REWRITE
                    // elements: trfmClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 61:17: -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
                    {
                        // SelectClauseParser.g:61:19: ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_1);

                        // SelectClauseParser.g:61:32: ^( TOK_SELEXPR trfmClause )
                        {
                        ASTNode root_2 = (ASTNode)adaptor.nil();
                        root_2 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_2);

                        adaptor.addChild(root_2, stream_trfmClause.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectClause"


    public static class selectList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectList"
    // SelectClauseParser.g:64:1: selectList : selectItem ( COMMA selectItem )* -> ( selectItem )+ ;
    public final HiveParser_SelectClauseParser.selectList_return selectList() throws RecognitionException {
        HiveParser_SelectClauseParser.selectList_return retval = new HiveParser_SelectClauseParser.selectList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA8=null;
        HiveParser_SelectClauseParser.selectItem_return selectItem7 =null;

        HiveParser_SelectClauseParser.selectItem_return selectItem9 =null;


        ASTNode COMMA8_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_selectItem=new RewriteRuleSubtreeStream(adaptor,"rule selectItem");
         gParent.pushMsg("select list", state); 
        try {
            // SelectClauseParser.g:67:5: ( selectItem ( COMMA selectItem )* -> ( selectItem )+ )
            // SelectClauseParser.g:68:5: selectItem ( COMMA selectItem )*
            {
            pushFollow(FOLLOW_selectItem_in_selectList239);
            selectItem7=selectItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selectItem.add(selectItem7.getTree());

            // SelectClauseParser.g:68:16: ( COMMA selectItem )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // SelectClauseParser.g:68:18: COMMA selectItem
            	    {
            	    COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectList243); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA8);


            	    pushFollow(FOLLOW_selectItem_in_selectList246);
            	    selectItem9=selectItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_selectItem.add(selectItem9.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: selectItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 68:39: -> ( selectItem )+
            {
                if ( !(stream_selectItem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_selectItem.hasNext() ) {
                    adaptor.addChild(root_0, stream_selectItem.nextTree());

                }
                stream_selectItem.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectList"


    public static class selectTrfmClause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectTrfmClause"
    // SelectClauseParser.g:71:1: selectTrfmClause : LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
    public final HiveParser_SelectClauseParser.selectTrfmClause_return selectTrfmClause() throws RecognitionException {
        HiveParser_SelectClauseParser.selectTrfmClause_return retval = new HiveParser_SelectClauseParser.selectTrfmClause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN10=null;
        Token RPAREN12=null;
        Token KW_USING13=null;
        Token StringLiteral14=null;
        Token KW_AS15=null;
        Token LPAREN16=null;
        Token RPAREN19=null;
        HiveParser.rowFormat_return inSerde =null;

        HiveParser.recordWriter_return inRec =null;

        HiveParser.rowFormat_return outSerde =null;

        HiveParser.recordReader_return outRec =null;

        HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList11 =null;

        HiveParser_FromClauseParser.aliasList_return aliasList17 =null;

        HiveParser.columnNameTypeList_return columnNameTypeList18 =null;

        HiveParser_FromClauseParser.aliasList_return aliasList20 =null;

        HiveParser.columnNameTypeList_return columnNameTypeList21 =null;


        ASTNode LPAREN10_tree=null;
        ASTNode RPAREN12_tree=null;
        ASTNode KW_USING13_tree=null;
        ASTNode StringLiteral14_tree=null;
        ASTNode KW_AS15_tree=null;
        ASTNode LPAREN16_tree=null;
        ASTNode RPAREN19_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_aliasList=new RewriteRuleSubtreeStream(adaptor,"rule aliasList");
        RewriteRuleSubtreeStream stream_rowFormat=new RewriteRuleSubtreeStream(adaptor,"rule rowFormat");
        RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
        RewriteRuleSubtreeStream stream_recordReader=new RewriteRuleSubtreeStream(adaptor,"rule recordReader");
        RewriteRuleSubtreeStream stream_selectExpressionList=new RewriteRuleSubtreeStream(adaptor,"rule selectExpressionList");
        RewriteRuleSubtreeStream stream_recordWriter=new RewriteRuleSubtreeStream(adaptor,"rule recordWriter");
         gParent.pushMsg("transform clause", state); 
        try {
            // SelectClauseParser.g:74:5: ( LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
            // SelectClauseParser.g:75:5: LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader
            {
            LPAREN10=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectTrfmClause285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN10);


            pushFollow(FOLLOW_selectExpressionList_in_selectTrfmClause287);
            selectExpressionList11=selectExpressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selectExpressionList.add(selectExpressionList11.getTree());

            RPAREN12=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectTrfmClause289); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN12);


            pushFollow(FOLLOW_rowFormat_in_selectTrfmClause297);
            inSerde=gHiveParser.rowFormat();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowFormat.add(inSerde.getTree());

            pushFollow(FOLLOW_recordWriter_in_selectTrfmClause301);
            inRec=gHiveParser.recordWriter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_recordWriter.add(inRec.getTree());

            KW_USING13=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_selectTrfmClause307); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING13);


            StringLiteral14=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_selectTrfmClause309); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral14);


            // SelectClauseParser.g:78:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
            int alt9=2;
            switch ( input.LA(1) ) {
                case KW_AS:
                    {
                    alt9=1;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // SelectClauseParser.g:78:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
                    {
                    KW_AS15=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectTrfmClause317); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS15);


                    // SelectClauseParser.g:78:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
                    int alt8=2;
                    switch ( input.LA(1) ) {
                    case LPAREN:
                        {
                        alt8=1;
                        }
                        break;
                    case Identifier:
                    case KW_ABORT:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_AUTHORIZATION:
                    case KW_AUTOCOMMIT:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CACHE:
                    case KW_CASCADE:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONSTRAINT:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURRENT_DATE:
                    case KW_CURRENT_TIMESTAMP:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DAY:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DOW:
                    case KW_DROP:
                    case KW_DUMP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FOR:
                    case KW_FOREIGN:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOUR:
                    case KW_IDXPROPERTIES:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ISOLATION:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEY:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LAST:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LEVEL:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAPJOIN:
                    case KW_MATCHED:
                    case KW_MATERIALIZED:
                    case KW_MERGE:
                    case KW_METADATA:
                    case KW_MINUTE:
                    case KW_MONTH:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NORELY:
                    case KW_NOSCAN:
                    case KW_NOVALIDATE:
                    case KW_NULL:
                    case KW_NULLS:
                    case KW_OF:
                    case KW_OFFSET:
                    case KW_OPTION:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRIMARY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PURGE:
                    case KW_QUARTER:
                    case KW_RANGE:
                    case KW_READ:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REFERENCES:
                    case KW_REGEXP:
                    case KW_RELOAD:
                    case KW_RELY:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPL:
                    case KW_REPLACE:
                    case KW_REPLICATION:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_REWRITE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SECOND:
                    case KW_SEMI:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SERVER:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SNAPSHOT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STATUS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTION:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_URI:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALIDATE:
                    case KW_VALUES:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_VIEWS:
                    case KW_WEEK:
                    case KW_WHILE:
                    case KW_WITH:
                    case KW_WORK:
                    case KW_WRITE:
                    case KW_YEAR:
                    case KW_BATCH:
                    case KW_DAYOFWEEK:
                    case KW_HOLD_DDLTIME:
                    case KW_IGNORE:
                    case KW_NO_DROP:
                    case KW_OFFLINE:
                    case KW_PROTECTION:
                    case KW_READONLY:
                        {
                        alt8=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;

                    }

                    switch (alt8) {
                        case 1 :
                            // SelectClauseParser.g:78:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
                            {
                            // SelectClauseParser.g:78:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
                            // SelectClauseParser.g:78:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
                            {
                            LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectTrfmClause321); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN16);


                            // SelectClauseParser.g:78:22: ( aliasList | columnNameTypeList )
                            int alt6=2;
                            alt6 = dfa6.predict(input);
                            switch (alt6) {
                                case 1 :
                                    // SelectClauseParser.g:78:23: aliasList
                                    {
                                    pushFollow(FOLLOW_aliasList_in_selectTrfmClause324);
                                    aliasList17=gHiveParser.aliasList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_aliasList.add(aliasList17.getTree());

                                    }
                                    break;
                                case 2 :
                                    // SelectClauseParser.g:78:35: columnNameTypeList
                                    {
                                    pushFollow(FOLLOW_columnNameTypeList_in_selectTrfmClause328);
                                    columnNameTypeList18=gHiveParser.columnNameTypeList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList18.getTree());

                                    }
                                    break;

                            }


                            RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectTrfmClause331); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN19);


                            }


                            }
                            break;
                        case 2 :
                            // SelectClauseParser.g:78:65: ( aliasList | columnNameTypeList )
                            {
                            // SelectClauseParser.g:78:65: ( aliasList | columnNameTypeList )
                            int alt7=2;
                            alt7 = dfa7.predict(input);
                            switch (alt7) {
                                case 1 :
                                    // SelectClauseParser.g:78:66: aliasList
                                    {
                                    pushFollow(FOLLOW_aliasList_in_selectTrfmClause337);
                                    aliasList20=gHiveParser.aliasList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_aliasList.add(aliasList20.getTree());

                                    }
                                    break;
                                case 2 :
                                    // SelectClauseParser.g:78:78: columnNameTypeList
                                    {
                                    pushFollow(FOLLOW_columnNameTypeList_in_selectTrfmClause341);
                                    columnNameTypeList21=gHiveParser.columnNameTypeList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList21.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_rowFormat_in_selectTrfmClause353);
            outSerde=gHiveParser.rowFormat();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowFormat.add(outSerde.getTree());

            pushFollow(FOLLOW_recordReader_in_selectTrfmClause357);
            outRec=gHiveParser.recordReader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_recordReader.add(outRec.getTree());

            // AST REWRITE
            // elements: StringLiteral, columnNameTypeList, inSerde, inRec, selectExpressionList, outSerde, aliasList, outRec
            // token labels: 
            // rule labels: inRec, outRec, inSerde, outSerde, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_inRec=new RewriteRuleSubtreeStream(adaptor,"rule inRec",inRec!=null?inRec.tree:null);
            RewriteRuleSubtreeStream stream_outRec=new RewriteRuleSubtreeStream(adaptor,"rule outRec",outRec!=null?outRec.tree:null);
            RewriteRuleSubtreeStream stream_inSerde=new RewriteRuleSubtreeStream(adaptor,"rule inSerde",inSerde!=null?inSerde.tree:null);
            RewriteRuleSubtreeStream stream_outSerde=new RewriteRuleSubtreeStream(adaptor,"rule outSerde",outSerde!=null?outSerde.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 80:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
            {
                // SelectClauseParser.g:80:8: ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM")
                , root_1);

                adaptor.addChild(root_1, stream_selectExpressionList.nextTree());

                adaptor.addChild(root_1, stream_inSerde.nextTree());

                adaptor.addChild(root_1, stream_inRec.nextTree());

                adaptor.addChild(root_1, 
                stream_StringLiteral.nextNode()
                );

                adaptor.addChild(root_1, stream_outSerde.nextTree());

                adaptor.addChild(root_1, stream_outRec.nextTree());

                // SelectClauseParser.g:80:93: ( aliasList )?
                if ( stream_aliasList.hasNext() ) {
                    adaptor.addChild(root_1, stream_aliasList.nextTree());

                }
                stream_aliasList.reset();

                // SelectClauseParser.g:80:104: ( columnNameTypeList )?
                if ( stream_columnNameTypeList.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());

                }
                stream_columnNameTypeList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectTrfmClause"


    public static class hintClause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintClause"
    // SelectClauseParser.g:83:1: hintClause : DIVIDE STAR PLUS hintList STAR DIVIDE -> ^( TOK_HINTLIST hintList ) ;
    public final HiveParser_SelectClauseParser.hintClause_return hintClause() throws RecognitionException {
        HiveParser_SelectClauseParser.hintClause_return retval = new HiveParser_SelectClauseParser.hintClause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token DIVIDE22=null;
        Token STAR23=null;
        Token PLUS24=null;
        Token STAR26=null;
        Token DIVIDE27=null;
        HiveParser_SelectClauseParser.hintList_return hintList25 =null;


        ASTNode DIVIDE22_tree=null;
        ASTNode STAR23_tree=null;
        ASTNode PLUS24_tree=null;
        ASTNode STAR26_tree=null;
        ASTNode DIVIDE27_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleSubtreeStream stream_hintList=new RewriteRuleSubtreeStream(adaptor,"rule hintList");
         gParent.pushMsg("hint clause", state); 
        try {
            // SelectClauseParser.g:86:5: ( DIVIDE STAR PLUS hintList STAR DIVIDE -> ^( TOK_HINTLIST hintList ) )
            // SelectClauseParser.g:87:5: DIVIDE STAR PLUS hintList STAR DIVIDE
            {
            DIVIDE22=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_hintClause420); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE22);


            STAR23=(Token)match(input,STAR,FOLLOW_STAR_in_hintClause422); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STAR.add(STAR23);


            PLUS24=(Token)match(input,PLUS,FOLLOW_PLUS_in_hintClause424); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PLUS.add(PLUS24);


            pushFollow(FOLLOW_hintList_in_hintClause426);
            hintList25=hintList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hintList.add(hintList25.getTree());

            STAR26=(Token)match(input,STAR,FOLLOW_STAR_in_hintClause428); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STAR.add(STAR26);


            DIVIDE27=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_hintClause430); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE27);


            // AST REWRITE
            // elements: hintList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 87:43: -> ^( TOK_HINTLIST hintList )
            {
                // SelectClauseParser.g:87:46: ^( TOK_HINTLIST hintList )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_HINTLIST, "TOK_HINTLIST")
                , root_1);

                adaptor.addChild(root_1, stream_hintList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintClause"


    public static class hintList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintList"
    // SelectClauseParser.g:90:1: hintList : hintItem ( COMMA hintItem )* -> ( hintItem )+ ;
    public final HiveParser_SelectClauseParser.hintList_return hintList() throws RecognitionException {
        HiveParser_SelectClauseParser.hintList_return retval = new HiveParser_SelectClauseParser.hintList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA29=null;
        HiveParser_SelectClauseParser.hintItem_return hintItem28 =null;

        HiveParser_SelectClauseParser.hintItem_return hintItem30 =null;


        ASTNode COMMA29_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_hintItem=new RewriteRuleSubtreeStream(adaptor,"rule hintItem");
         gParent.pushMsg("hint list", state); 
        try {
            // SelectClauseParser.g:93:5: ( hintItem ( COMMA hintItem )* -> ( hintItem )+ )
            // SelectClauseParser.g:94:5: hintItem ( COMMA hintItem )*
            {
            pushFollow(FOLLOW_hintItem_in_hintList469);
            hintItem28=hintItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hintItem.add(hintItem28.getTree());

            // SelectClauseParser.g:94:14: ( COMMA hintItem )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt10=1;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // SelectClauseParser.g:94:15: COMMA hintItem
            	    {
            	    COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_hintList472); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA29);


            	    pushFollow(FOLLOW_hintItem_in_hintList474);
            	    hintItem30=hintItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hintItem.add(hintItem30.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // AST REWRITE
            // elements: hintItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 94:32: -> ( hintItem )+
            {
                if ( !(stream_hintItem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hintItem.hasNext() ) {
                    adaptor.addChild(root_0, stream_hintItem.nextTree());

                }
                stream_hintItem.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintList"


    public static class hintItem_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintItem"
    // SelectClauseParser.g:97:1: hintItem : hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName ( hintArgs )? ) ;
    public final HiveParser_SelectClauseParser.hintItem_return hintItem() throws RecognitionException {
        HiveParser_SelectClauseParser.hintItem_return retval = new HiveParser_SelectClauseParser.hintItem_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN32=null;
        Token RPAREN34=null;
        HiveParser_SelectClauseParser.hintName_return hintName31 =null;

        HiveParser_SelectClauseParser.hintArgs_return hintArgs33 =null;


        ASTNode LPAREN32_tree=null;
        ASTNode RPAREN34_tree=null;
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleSubtreeStream stream_hintName=new RewriteRuleSubtreeStream(adaptor,"rule hintName");
        RewriteRuleSubtreeStream stream_hintArgs=new RewriteRuleSubtreeStream(adaptor,"rule hintArgs");
         gParent.pushMsg("hint item", state); 
        try {
            // SelectClauseParser.g:100:5: ( hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName ( hintArgs )? ) )
            // SelectClauseParser.g:101:5: hintName ( LPAREN hintArgs RPAREN )?
            {
            pushFollow(FOLLOW_hintName_in_hintItem512);
            hintName31=hintName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hintName.add(hintName31.getTree());

            // SelectClauseParser.g:101:14: ( LPAREN hintArgs RPAREN )?
            int alt11=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt11=1;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // SelectClauseParser.g:101:15: LPAREN hintArgs RPAREN
                    {
                    LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hintItem515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN32);


                    pushFollow(FOLLOW_hintArgs_in_hintItem517);
                    hintArgs33=hintArgs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hintArgs.add(hintArgs33.getTree());

                    RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hintItem519); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN34);


                    }
                    break;

            }


            // AST REWRITE
            // elements: hintArgs, hintName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 101:40: -> ^( TOK_HINT hintName ( hintArgs )? )
            {
                // SelectClauseParser.g:101:43: ^( TOK_HINT hintName ( hintArgs )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_HINT, "TOK_HINT")
                , root_1);

                adaptor.addChild(root_1, stream_hintName.nextTree());

                // SelectClauseParser.g:101:63: ( hintArgs )?
                if ( stream_hintArgs.hasNext() ) {
                    adaptor.addChild(root_1, stream_hintArgs.nextTree());

                }
                stream_hintArgs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintItem"


    public static class hintName_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintName"
    // SelectClauseParser.g:104:1: hintName : ( KW_MAPJOIN -> TOK_MAPJOIN | KW_STREAMTABLE -> TOK_STREAMTABLE );
    public final HiveParser_SelectClauseParser.hintName_return hintName() throws RecognitionException {
        HiveParser_SelectClauseParser.hintName_return retval = new HiveParser_SelectClauseParser.hintName_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_MAPJOIN35=null;
        Token KW_STREAMTABLE36=null;

        ASTNode KW_MAPJOIN35_tree=null;
        ASTNode KW_STREAMTABLE36_tree=null;
        RewriteRuleTokenStream stream_KW_MAPJOIN=new RewriteRuleTokenStream(adaptor,"token KW_MAPJOIN");
        RewriteRuleTokenStream stream_KW_STREAMTABLE=new RewriteRuleTokenStream(adaptor,"token KW_STREAMTABLE");

         gParent.pushMsg("hint name", state); 
        try {
            // SelectClauseParser.g:107:5: ( KW_MAPJOIN -> TOK_MAPJOIN | KW_STREAMTABLE -> TOK_STREAMTABLE )
            int alt12=2;
            switch ( input.LA(1) ) {
            case KW_MAPJOIN:
                {
                alt12=1;
                }
                break;
            case KW_STREAMTABLE:
                {
                alt12=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // SelectClauseParser.g:108:5: KW_MAPJOIN
                    {
                    KW_MAPJOIN35=(Token)match(input,KW_MAPJOIN,FOLLOW_KW_MAPJOIN_in_hintName563); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_MAPJOIN.add(KW_MAPJOIN35);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 108:16: -> TOK_MAPJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_MAPJOIN, "TOK_MAPJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:109:7: KW_STREAMTABLE
                    {
                    KW_STREAMTABLE36=(Token)match(input,KW_STREAMTABLE,FOLLOW_KW_STREAMTABLE_in_hintName575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_STREAMTABLE.add(KW_STREAMTABLE36);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 109:22: -> TOK_STREAMTABLE
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_STREAMTABLE, "TOK_STREAMTABLE")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintName"


    public static class hintArgs_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintArgs"
    // SelectClauseParser.g:112:1: hintArgs : hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) ;
    public final HiveParser_SelectClauseParser.hintArgs_return hintArgs() throws RecognitionException {
        HiveParser_SelectClauseParser.hintArgs_return retval = new HiveParser_SelectClauseParser.hintArgs_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA38=null;
        HiveParser_SelectClauseParser.hintArgName_return hintArgName37 =null;

        HiveParser_SelectClauseParser.hintArgName_return hintArgName39 =null;


        ASTNode COMMA38_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_hintArgName=new RewriteRuleSubtreeStream(adaptor,"rule hintArgName");
         gParent.pushMsg("hint arguments", state); 
        try {
            // SelectClauseParser.g:115:5: ( hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) )
            // SelectClauseParser.g:116:5: hintArgName ( COMMA hintArgName )*
            {
            pushFollow(FOLLOW_hintArgName_in_hintArgs610);
            hintArgName37=hintArgName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hintArgName.add(hintArgName37.getTree());

            // SelectClauseParser.g:116:17: ( COMMA hintArgName )*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt13=1;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // SelectClauseParser.g:116:18: COMMA hintArgName
            	    {
            	    COMMA38=(Token)match(input,COMMA,FOLLOW_COMMA_in_hintArgs613); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA38);


            	    pushFollow(FOLLOW_hintArgName_in_hintArgs615);
            	    hintArgName39=hintArgName();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hintArgName.add(hintArgName39.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // AST REWRITE
            // elements: hintArgName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 116:38: -> ^( TOK_HINTARGLIST ( hintArgName )+ )
            {
                // SelectClauseParser.g:116:41: ^( TOK_HINTARGLIST ( hintArgName )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_HINTARGLIST, "TOK_HINTARGLIST")
                , root_1);

                if ( !(stream_hintArgName.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hintArgName.hasNext() ) {
                    adaptor.addChild(root_1, stream_hintArgName.nextTree());

                }
                stream_hintArgName.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintArgs"


    public static class hintArgName_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintArgName"
    // SelectClauseParser.g:119:1: hintArgName : identifier ;
    public final HiveParser_SelectClauseParser.hintArgName_return hintArgName() throws RecognitionException {
        HiveParser_SelectClauseParser.hintArgName_return retval = new HiveParser_SelectClauseParser.hintArgName_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier40 =null;



         gParent.pushMsg("hint argument name", state); 
        try {
            // SelectClauseParser.g:122:5: ( identifier )
            // SelectClauseParser.g:123:5: identifier
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_hintArgName657);
            identifier40=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier40.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintArgName"


    public static class selectItem_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectItem"
    // SelectClauseParser.g:126:1: selectItem : ( ( tableAllColumns )=> tableAllColumns -> ^( TOK_SELEXPR tableAllColumns ) | ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR expression ( identifier )* ) );
    public final HiveParser_SelectClauseParser.selectItem_return selectItem() throws RecognitionException {
        HiveParser_SelectClauseParser.selectItem_return retval = new HiveParser_SelectClauseParser.selectItem_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_AS43=null;
        Token KW_AS45=null;
        Token LPAREN46=null;
        Token COMMA48=null;
        Token RPAREN50=null;
        HiveParser_FromClauseParser.tableAllColumns_return tableAllColumns41 =null;

        HiveParser_IdentifiersParser.expression_return expression42 =null;

        HiveParser_IdentifiersParser.identifier_return identifier44 =null;

        HiveParser_IdentifiersParser.identifier_return identifier47 =null;

        HiveParser_IdentifiersParser.identifier_return identifier49 =null;


        ASTNode KW_AS43_tree=null;
        ASTNode KW_AS45_tree=null;
        ASTNode LPAREN46_tree=null;
        ASTNode COMMA48_tree=null;
        ASTNode RPAREN50_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_tableAllColumns=new RewriteRuleSubtreeStream(adaptor,"rule tableAllColumns");
         gParent.pushMsg("selection target", state); 
        try {
            // SelectClauseParser.g:129:5: ( ( tableAllColumns )=> tableAllColumns -> ^( TOK_SELEXPR tableAllColumns ) | ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR expression ( identifier )* ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // SelectClauseParser.g:130:5: ( tableAllColumns )=> tableAllColumns
                    {
                    pushFollow(FOLLOW_tableAllColumns_in_selectItem694);
                    tableAllColumns41=gHiveParser.tableAllColumns();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableAllColumns.add(tableAllColumns41.getTree());

                    // AST REWRITE
                    // elements: tableAllColumns
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 130:42: -> ^( TOK_SELEXPR tableAllColumns )
                    {
                        // SelectClauseParser.g:130:45: ^( TOK_SELEXPR tableAllColumns )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableAllColumns.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:132:5: ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
                    {
                    // SelectClauseParser.g:132:5: ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
                    // SelectClauseParser.g:132:7: expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
                    {
                    pushFollow(FOLLOW_expression_in_selectItem716);
                    expression42=gHiveParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression42.getTree());

                    // SelectClauseParser.g:133:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
                    int alt16=3;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // SelectClauseParser.g:133:8: ( ( KW_AS )? identifier )
                            {
                            // SelectClauseParser.g:133:8: ( ( KW_AS )? identifier )
                            // SelectClauseParser.g:133:9: ( KW_AS )? identifier
                            {
                            // SelectClauseParser.g:133:9: ( KW_AS )?
                            int alt14=2;
                            alt14 = dfa14.predict(input);
                            switch (alt14) {
                                case 1 :
                                    // SelectClauseParser.g:133:9: KW_AS
                                    {
                                    KW_AS43=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem726); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS43);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_identifier_in_selectItem729);
                            identifier44=gHiveParser.identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier44.getTree());

                            }


                            }
                            break;
                        case 2 :
                            // SelectClauseParser.g:133:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
                            {
                            // SelectClauseParser.g:133:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
                            // SelectClauseParser.g:133:31: KW_AS LPAREN identifier ( COMMA identifier )* RPAREN
                            {
                            KW_AS45=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem735); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS45);


                            LPAREN46=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectItem737); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN46);


                            pushFollow(FOLLOW_identifier_in_selectItem739);
                            identifier47=gHiveParser.identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier47.getTree());

                            // SelectClauseParser.g:133:55: ( COMMA identifier )*
                            loop15:
                            do {
                                int alt15=2;
                                switch ( input.LA(1) ) {
                                case COMMA:
                                    {
                                    alt15=1;
                                    }
                                    break;

                                }

                                switch (alt15) {
                            	case 1 :
                            	    // SelectClauseParser.g:133:56: COMMA identifier
                            	    {
                            	    COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectItem742); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA48);


                            	    pushFollow(FOLLOW_identifier_in_selectItem744);
                            	    identifier49=gHiveParser.identifier();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_identifier.add(identifier49.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            RPAREN50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectItem748); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN50);


                            }


                            }
                            break;

                    }


                    }


                    // AST REWRITE
                    // elements: expression, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 134:7: -> ^( TOK_SELEXPR expression ( identifier )* )
                    {
                        // SelectClauseParser.g:134:10: ^( TOK_SELEXPR expression ( identifier )* )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        // SelectClauseParser.g:134:35: ( identifier )*
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectItem"


    public static class trfmClause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "trfmClause"
    // SelectClauseParser.g:137:1: trfmClause : ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
    public final HiveParser_SelectClauseParser.trfmClause_return trfmClause() throws RecognitionException {
        HiveParser_SelectClauseParser.trfmClause_return retval = new HiveParser_SelectClauseParser.trfmClause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_MAP51=null;
        Token KW_REDUCE53=null;
        Token KW_USING55=null;
        Token StringLiteral56=null;
        Token KW_AS57=null;
        Token LPAREN58=null;
        Token RPAREN61=null;
        HiveParser.rowFormat_return inSerde =null;

        HiveParser.recordWriter_return inRec =null;

        HiveParser.rowFormat_return outSerde =null;

        HiveParser.recordReader_return outRec =null;

        HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList52 =null;

        HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList54 =null;

        HiveParser_FromClauseParser.aliasList_return aliasList59 =null;

        HiveParser.columnNameTypeList_return columnNameTypeList60 =null;

        HiveParser_FromClauseParser.aliasList_return aliasList62 =null;

        HiveParser.columnNameTypeList_return columnNameTypeList63 =null;


        ASTNode KW_MAP51_tree=null;
        ASTNode KW_REDUCE53_tree=null;
        ASTNode KW_USING55_tree=null;
        ASTNode StringLiteral56_tree=null;
        ASTNode KW_AS57_tree=null;
        ASTNode LPAREN58_tree=null;
        ASTNode RPAREN61_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_REDUCE=new RewriteRuleTokenStream(adaptor,"token KW_REDUCE");
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_KW_MAP=new RewriteRuleTokenStream(adaptor,"token KW_MAP");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_aliasList=new RewriteRuleSubtreeStream(adaptor,"rule aliasList");
        RewriteRuleSubtreeStream stream_rowFormat=new RewriteRuleSubtreeStream(adaptor,"rule rowFormat");
        RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
        RewriteRuleSubtreeStream stream_recordReader=new RewriteRuleSubtreeStream(adaptor,"rule recordReader");
        RewriteRuleSubtreeStream stream_selectExpressionList=new RewriteRuleSubtreeStream(adaptor,"rule selectExpressionList");
        RewriteRuleSubtreeStream stream_recordWriter=new RewriteRuleSubtreeStream(adaptor,"rule recordWriter");
         gParent.pushMsg("transform clause", state); 
        try {
            // SelectClauseParser.g:140:5: ( ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
            // SelectClauseParser.g:141:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader
            {
            // SelectClauseParser.g:141:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList )
            int alt18=2;
            switch ( input.LA(1) ) {
            case KW_MAP:
                {
                alt18=1;
                }
                break;
            case KW_REDUCE:
                {
                alt18=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // SelectClauseParser.g:141:9: KW_MAP selectExpressionList
                    {
                    KW_MAP51=(Token)match(input,KW_MAP,FOLLOW_KW_MAP_in_trfmClause803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_MAP.add(KW_MAP51);


                    pushFollow(FOLLOW_selectExpressionList_in_trfmClause808);
                    selectExpressionList52=selectExpressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_selectExpressionList.add(selectExpressionList52.getTree());

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:142:9: KW_REDUCE selectExpressionList
                    {
                    KW_REDUCE53=(Token)match(input,KW_REDUCE,FOLLOW_KW_REDUCE_in_trfmClause818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_REDUCE.add(KW_REDUCE53);


                    pushFollow(FOLLOW_selectExpressionList_in_trfmClause820);
                    selectExpressionList54=selectExpressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_selectExpressionList.add(selectExpressionList54.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_rowFormat_in_trfmClause830);
            inSerde=gHiveParser.rowFormat();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowFormat.add(inSerde.getTree());

            pushFollow(FOLLOW_recordWriter_in_trfmClause834);
            inRec=gHiveParser.recordWriter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_recordWriter.add(inRec.getTree());

            KW_USING55=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_trfmClause840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING55);


            StringLiteral56=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_trfmClause842); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral56);


            // SelectClauseParser.g:145:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
            int alt22=2;
            switch ( input.LA(1) ) {
                case KW_AS:
                    {
                    alt22=1;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // SelectClauseParser.g:145:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
                    {
                    KW_AS57=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_trfmClause850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS57);


                    // SelectClauseParser.g:145:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
                    int alt21=2;
                    switch ( input.LA(1) ) {
                    case LPAREN:
                        {
                        alt21=1;
                        }
                        break;
                    case Identifier:
                    case KW_ABORT:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_AUTHORIZATION:
                    case KW_AUTOCOMMIT:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CACHE:
                    case KW_CASCADE:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONSTRAINT:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURRENT_DATE:
                    case KW_CURRENT_TIMESTAMP:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DAY:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DOW:
                    case KW_DROP:
                    case KW_DUMP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FOR:
                    case KW_FOREIGN:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOUR:
                    case KW_IDXPROPERTIES:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ISOLATION:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEY:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LAST:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LEVEL:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAPJOIN:
                    case KW_MATCHED:
                    case KW_MATERIALIZED:
                    case KW_MERGE:
                    case KW_METADATA:
                    case KW_MINUTE:
                    case KW_MONTH:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NORELY:
                    case KW_NOSCAN:
                    case KW_NOVALIDATE:
                    case KW_NULL:
                    case KW_NULLS:
                    case KW_OF:
                    case KW_OFFSET:
                    case KW_OPTION:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRIMARY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PURGE:
                    case KW_QUARTER:
                    case KW_RANGE:
                    case KW_READ:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REFERENCES:
                    case KW_REGEXP:
                    case KW_RELOAD:
                    case KW_RELY:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPL:
                    case KW_REPLACE:
                    case KW_REPLICATION:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_REWRITE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SECOND:
                    case KW_SEMI:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SERVER:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SNAPSHOT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STATUS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTION:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_URI:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALIDATE:
                    case KW_VALUES:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_VIEWS:
                    case KW_WEEK:
                    case KW_WHILE:
                    case KW_WITH:
                    case KW_WORK:
                    case KW_WRITE:
                    case KW_YEAR:
                    case KW_BATCH:
                    case KW_DAYOFWEEK:
                    case KW_HOLD_DDLTIME:
                    case KW_IGNORE:
                    case KW_NO_DROP:
                    case KW_OFFLINE:
                    case KW_PROTECTION:
                    case KW_READONLY:
                        {
                        alt21=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }

                    switch (alt21) {
                        case 1 :
                            // SelectClauseParser.g:145:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
                            {
                            // SelectClauseParser.g:145:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
                            // SelectClauseParser.g:145:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
                            {
                            LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_trfmClause854); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN58);


                            // SelectClauseParser.g:145:22: ( aliasList | columnNameTypeList )
                            int alt19=2;
                            alt19 = dfa19.predict(input);
                            switch (alt19) {
                                case 1 :
                                    // SelectClauseParser.g:145:23: aliasList
                                    {
                                    pushFollow(FOLLOW_aliasList_in_trfmClause857);
                                    aliasList59=gHiveParser.aliasList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_aliasList.add(aliasList59.getTree());

                                    }
                                    break;
                                case 2 :
                                    // SelectClauseParser.g:145:35: columnNameTypeList
                                    {
                                    pushFollow(FOLLOW_columnNameTypeList_in_trfmClause861);
                                    columnNameTypeList60=gHiveParser.columnNameTypeList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList60.getTree());

                                    }
                                    break;

                            }


                            RPAREN61=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_trfmClause864); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN61);


                            }


                            }
                            break;
                        case 2 :
                            // SelectClauseParser.g:145:65: ( aliasList | columnNameTypeList )
                            {
                            // SelectClauseParser.g:145:65: ( aliasList | columnNameTypeList )
                            int alt20=2;
                            alt20 = dfa20.predict(input);
                            switch (alt20) {
                                case 1 :
                                    // SelectClauseParser.g:145:66: aliasList
                                    {
                                    pushFollow(FOLLOW_aliasList_in_trfmClause870);
                                    aliasList62=gHiveParser.aliasList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_aliasList.add(aliasList62.getTree());

                                    }
                                    break;
                                case 2 :
                                    // SelectClauseParser.g:145:78: columnNameTypeList
                                    {
                                    pushFollow(FOLLOW_columnNameTypeList_in_trfmClause874);
                                    columnNameTypeList63=gHiveParser.columnNameTypeList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList63.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_rowFormat_in_trfmClause886);
            outSerde=gHiveParser.rowFormat();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowFormat.add(outSerde.getTree());

            pushFollow(FOLLOW_recordReader_in_trfmClause890);
            outRec=gHiveParser.recordReader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_recordReader.add(outRec.getTree());

            // AST REWRITE
            // elements: inSerde, outSerde, inRec, StringLiteral, selectExpressionList, columnNameTypeList, outRec, aliasList
            // token labels: 
            // rule labels: inRec, outRec, inSerde, outSerde, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_inRec=new RewriteRuleSubtreeStream(adaptor,"rule inRec",inRec!=null?inRec.tree:null);
            RewriteRuleSubtreeStream stream_outRec=new RewriteRuleSubtreeStream(adaptor,"rule outRec",outRec!=null?outRec.tree:null);
            RewriteRuleSubtreeStream stream_inSerde=new RewriteRuleSubtreeStream(adaptor,"rule inSerde",inSerde!=null?inSerde.tree:null);
            RewriteRuleSubtreeStream stream_outSerde=new RewriteRuleSubtreeStream(adaptor,"rule outSerde",outSerde!=null?outSerde.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 147:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
            {
                // SelectClauseParser.g:147:8: ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM")
                , root_1);

                adaptor.addChild(root_1, stream_selectExpressionList.nextTree());

                adaptor.addChild(root_1, stream_inSerde.nextTree());

                adaptor.addChild(root_1, stream_inRec.nextTree());

                adaptor.addChild(root_1, 
                stream_StringLiteral.nextNode()
                );

                adaptor.addChild(root_1, stream_outSerde.nextTree());

                adaptor.addChild(root_1, stream_outRec.nextTree());

                // SelectClauseParser.g:147:93: ( aliasList )?
                if ( stream_aliasList.hasNext() ) {
                    adaptor.addChild(root_1, stream_aliasList.nextTree());

                }
                stream_aliasList.reset();

                // SelectClauseParser.g:147:104: ( columnNameTypeList )?
                if ( stream_columnNameTypeList.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());

                }
                stream_columnNameTypeList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "trfmClause"


    public static class selectExpression_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectExpression"
    // SelectClauseParser.g:150:1: selectExpression : ( ( tableAllColumns )=> tableAllColumns | expression );
    public final HiveParser_SelectClauseParser.selectExpression_return selectExpression() throws RecognitionException {
        HiveParser_SelectClauseParser.selectExpression_return retval = new HiveParser_SelectClauseParser.selectExpression_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_FromClauseParser.tableAllColumns_return tableAllColumns64 =null;

        HiveParser_IdentifiersParser.expression_return expression65 =null;



         gParent.pushMsg("select expression", state); 
        try {
            // SelectClauseParser.g:153:5: ( ( tableAllColumns )=> tableAllColumns | expression )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // SelectClauseParser.g:154:5: ( tableAllColumns )=> tableAllColumns
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_tableAllColumns_in_selectExpression959);
                    tableAllColumns64=gHiveParser.tableAllColumns();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableAllColumns64.getTree());

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:156:5: expression
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_selectExpression971);
                    expression65=gHiveParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression65.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectExpression"


    public static class selectExpressionList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectExpressionList"
    // SelectClauseParser.g:159:1: selectExpressionList : selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) ;
    public final HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList() throws RecognitionException {
        HiveParser_SelectClauseParser.selectExpressionList_return retval = new HiveParser_SelectClauseParser.selectExpressionList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA67=null;
        HiveParser_SelectClauseParser.selectExpression_return selectExpression66 =null;

        HiveParser_SelectClauseParser.selectExpression_return selectExpression68 =null;


        ASTNode COMMA67_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");
         gParent.pushMsg("select expression list", state); 
        try {
            // SelectClauseParser.g:162:5: ( selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) )
            // SelectClauseParser.g:163:5: selectExpression ( COMMA selectExpression )*
            {
            pushFollow(FOLLOW_selectExpression_in_selectExpressionList1002);
            selectExpression66=selectExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression66.getTree());

            // SelectClauseParser.g:163:22: ( COMMA selectExpression )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // SelectClauseParser.g:163:23: COMMA selectExpression
            	    {
            	    COMMA67=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectExpressionList1005); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA67);


            	    pushFollow(FOLLOW_selectExpression_in_selectExpressionList1007);
            	    selectExpression68=selectExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression68.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // AST REWRITE
            // elements: selectExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 163:48: -> ^( TOK_EXPLIST ( selectExpression )+ )
            {
                // SelectClauseParser.g:163:51: ^( TOK_EXPLIST ( selectExpression )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST")
                , root_1);

                if ( !(stream_selectExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_selectExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_selectExpression.nextTree());

                }
                stream_selectExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectExpressionList"


    public static class window_clause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_clause"
    // SelectClauseParser.g:167:1: window_clause : KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) ;
    public final HiveParser_SelectClauseParser.window_clause_return window_clause() throws RecognitionException {
        HiveParser_SelectClauseParser.window_clause_return retval = new HiveParser_SelectClauseParser.window_clause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_WINDOW69=null;
        Token COMMA71=null;
        HiveParser_SelectClauseParser.window_defn_return window_defn70 =null;

        HiveParser_SelectClauseParser.window_defn_return window_defn72 =null;


        ASTNode KW_WINDOW69_tree=null;
        ASTNode COMMA71_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_WINDOW=new RewriteRuleTokenStream(adaptor,"token KW_WINDOW");
        RewriteRuleSubtreeStream stream_window_defn=new RewriteRuleSubtreeStream(adaptor,"rule window_defn");
         gParent.pushMsg("window_clause", state); 
        try {
            // SelectClauseParser.g:170:3: ( KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) )
            // SelectClauseParser.g:171:3: KW_WINDOW window_defn ( COMMA window_defn )*
            {
            KW_WINDOW69=(Token)match(input,KW_WINDOW,FOLLOW_KW_WINDOW_in_window_clause1046); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_WINDOW.add(KW_WINDOW69);


            pushFollow(FOLLOW_window_defn_in_window_clause1048);
            window_defn70=window_defn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_window_defn.add(window_defn70.getTree());

            // SelectClauseParser.g:171:25: ( COMMA window_defn )*
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt25=1;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // SelectClauseParser.g:171:26: COMMA window_defn
            	    {
            	    COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_window_clause1051); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA71);


            	    pushFollow(FOLLOW_window_defn_in_window_clause1053);
            	    window_defn72=window_defn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_window_defn.add(window_defn72.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // AST REWRITE
            // elements: window_defn, KW_WINDOW
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 171:46: -> ^( KW_WINDOW ( window_defn )+ )
            {
                // SelectClauseParser.g:171:49: ^( KW_WINDOW ( window_defn )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                stream_KW_WINDOW.nextNode()
                , root_1);

                if ( !(stream_window_defn.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_window_defn.hasNext() ) {
                    adaptor.addChild(root_1, stream_window_defn.nextTree());

                }
                stream_window_defn.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_clause"


    public static class window_defn_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_defn"
    // SelectClauseParser.g:174:1: window_defn : identifier KW_AS window_specification -> ^( TOK_WINDOWDEF identifier window_specification ) ;
    public final HiveParser_SelectClauseParser.window_defn_return window_defn() throws RecognitionException {
        HiveParser_SelectClauseParser.window_defn_return retval = new HiveParser_SelectClauseParser.window_defn_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_AS74=null;
        HiveParser_IdentifiersParser.identifier_return identifier73 =null;

        HiveParser_SelectClauseParser.window_specification_return window_specification75 =null;


        ASTNode KW_AS74_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_window_specification=new RewriteRuleSubtreeStream(adaptor,"rule window_specification");
         gParent.pushMsg("window_defn", state); 
        try {
            // SelectClauseParser.g:177:3: ( identifier KW_AS window_specification -> ^( TOK_WINDOWDEF identifier window_specification ) )
            // SelectClauseParser.g:178:3: identifier KW_AS window_specification
            {
            pushFollow(FOLLOW_identifier_in_window_defn1089);
            identifier73=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier73.getTree());

            KW_AS74=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_window_defn1091); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS74);


            pushFollow(FOLLOW_window_specification_in_window_defn1093);
            window_specification75=window_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_window_specification.add(window_specification75.getTree());

            // AST REWRITE
            // elements: identifier, window_specification
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 178:41: -> ^( TOK_WINDOWDEF identifier window_specification )
            {
                // SelectClauseParser.g:178:44: ^( TOK_WINDOWDEF identifier window_specification )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_WINDOWDEF, "TOK_WINDOWDEF")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_window_specification.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_defn"


    public static class window_specification_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_specification"
    // SelectClauseParser.g:181:1: window_specification : ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? ) ;
    public final HiveParser_SelectClauseParser.window_specification_return window_specification() throws RecognitionException {
        HiveParser_SelectClauseParser.window_specification_return retval = new HiveParser_SelectClauseParser.window_specification_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN77=null;
        Token RPAREN81=null;
        HiveParser_IdentifiersParser.identifier_return identifier76 =null;

        HiveParser_IdentifiersParser.identifier_return identifier78 =null;

        HiveParser_FromClauseParser.partitioningSpec_return partitioningSpec79 =null;

        HiveParser_SelectClauseParser.window_frame_return window_frame80 =null;


        ASTNode LPAREN77_tree=null;
        ASTNode RPAREN81_tree=null;
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");
        RewriteRuleSubtreeStream stream_window_frame=new RewriteRuleSubtreeStream(adaptor,"rule window_frame");
         gParent.pushMsg("window_specification", state); 
        try {
            // SelectClauseParser.g:184:3: ( ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? ) )
            // SelectClauseParser.g:185:3: ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
            {
            // SelectClauseParser.g:185:3: ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
            int alt29=2;
            switch ( input.LA(1) ) {
            case Identifier:
            case KW_ABORT:
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_ARRAY:
            case KW_AS:
            case KW_ASC:
            case KW_AUTHORIZATION:
            case KW_AUTOCOMMIT:
            case KW_BEFORE:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CACHE:
            case KW_CASCADE:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONSTRAINT:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURRENT_DATE:
            case KW_CURRENT_TIMESTAMP:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DAY:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DOUBLE:
            case KW_DOW:
            case KW_DROP:
            case KW_DUMP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FLOAT:
            case KW_FOR:
            case KW_FOREIGN:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOUR:
            case KW_IDXPROPERTIES:
            case KW_IMPORT:
            case KW_IN:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ISOLATION:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEY:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LAST:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LEVEL:
            case KW_LIKE:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAPJOIN:
            case KW_MATCHED:
            case KW_MATERIALIZED:
            case KW_MERGE:
            case KW_METADATA:
            case KW_MINUTE:
            case KW_MONTH:
            case KW_MSCK:
            case KW_NONE:
            case KW_NORELY:
            case KW_NOSCAN:
            case KW_NOVALIDATE:
            case KW_NULL:
            case KW_NULLS:
            case KW_OF:
            case KW_OFFSET:
            case KW_OPTION:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRIMARY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PURGE:
            case KW_QUARTER:
            case KW_RANGE:
            case KW_READ:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_REFERENCES:
            case KW_REGEXP:
            case KW_RELOAD:
            case KW_RELY:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPL:
            case KW_REPLACE:
            case KW_REPLICATION:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_REWRITE:
            case KW_RIGHT:
            case KW_RLIKE:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SECOND:
            case KW_SEMI:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SERVER:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SMALLINT:
            case KW_SNAPSHOT:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STATUS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TIMESTAMP:
            case KW_TINYINT:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTION:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNIONTYPE:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_URI:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALIDATE:
            case KW_VALUES:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_VIEWS:
            case KW_WEEK:
            case KW_WHILE:
            case KW_WITH:
            case KW_WORK:
            case KW_WRITE:
            case KW_YEAR:
            case KW_BATCH:
            case KW_DAYOFWEEK:
            case KW_HOLD_DDLTIME:
            case KW_IGNORE:
            case KW_NO_DROP:
            case KW_OFFLINE:
            case KW_PROTECTION:
            case KW_READONLY:
                {
                alt29=1;
                }
                break;
            case LPAREN:
                {
                alt29=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // SelectClauseParser.g:185:4: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_window_specification1129);
                    identifier76=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier76.getTree());

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:185:17: ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
                    {
                    // SelectClauseParser.g:185:17: ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
                    // SelectClauseParser.g:185:19: LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN
                    {
                    LPAREN77=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_window_specification1135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN77);


                    // SelectClauseParser.g:185:26: ( identifier )?
                    int alt26=2;
                    alt26 = dfa26.predict(input);
                    switch (alt26) {
                        case 1 :
                            // SelectClauseParser.g:185:26: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_window_specification1137);
                            identifier78=gHiveParser.identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier78.getTree());

                            }
                            break;

                    }


                    // SelectClauseParser.g:185:38: ( partitioningSpec )?
                    int alt27=2;
                    switch ( input.LA(1) ) {
                        case KW_CLUSTER:
                        case KW_DISTRIBUTE:
                        case KW_ORDER:
                        case KW_PARTITION:
                        case KW_SORT:
                            {
                            alt27=1;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // SelectClauseParser.g:185:38: partitioningSpec
                            {
                            pushFollow(FOLLOW_partitioningSpec_in_window_specification1140);
                            partitioningSpec79=gHiveParser.partitioningSpec();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_partitioningSpec.add(partitioningSpec79.getTree());

                            }
                            break;

                    }


                    // SelectClauseParser.g:185:56: ( window_frame )?
                    int alt28=2;
                    switch ( input.LA(1) ) {
                        case KW_RANGE:
                        case KW_ROWS:
                            {
                            alt28=1;
                            }
                            break;
                    }

                    switch (alt28) {
                        case 1 :
                            // SelectClauseParser.g:185:56: window_frame
                            {
                            pushFollow(FOLLOW_window_frame_in_window_specification1143);
                            window_frame80=window_frame();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_window_frame.add(window_frame80.getTree());

                            }
                            break;

                    }


                    RPAREN81=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_window_specification1146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN81);


                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, window_frame, partitioningSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 185:79: -> ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? )
            {
                // SelectClauseParser.g:185:82: ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_WINDOWSPEC, "TOK_WINDOWSPEC")
                , root_1);

                // SelectClauseParser.g:185:99: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                // SelectClauseParser.g:185:111: ( partitioningSpec )?
                if ( stream_partitioningSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitioningSpec.nextTree());

                }
                stream_partitioningSpec.reset();

                // SelectClauseParser.g:185:129: ( window_frame )?
                if ( stream_window_frame.hasNext() ) {
                    adaptor.addChild(root_1, stream_window_frame.nextTree());

                }
                stream_window_frame.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_specification"


    public static class window_frame_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_frame"
    // SelectClauseParser.g:188:1: window_frame : ( window_range_expression | window_value_expression );
    public final HiveParser_SelectClauseParser.window_frame_return window_frame() throws RecognitionException {
        HiveParser_SelectClauseParser.window_frame_return retval = new HiveParser_SelectClauseParser.window_frame_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_SelectClauseParser.window_range_expression_return window_range_expression82 =null;

        HiveParser_SelectClauseParser.window_value_expression_return window_value_expression83 =null;



        try {
            // SelectClauseParser.g:188:14: ( window_range_expression | window_value_expression )
            int alt30=2;
            switch ( input.LA(1) ) {
            case KW_ROWS:
                {
                alt30=1;
                }
                break;
            case KW_RANGE:
                {
                alt30=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // SelectClauseParser.g:189:2: window_range_expression
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_window_range_expression_in_window_frame1173);
                    window_range_expression82=window_range_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, window_range_expression82.getTree());

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:190:2: window_value_expression
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_window_value_expression_in_window_frame1178);
                    window_value_expression83=window_value_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, window_value_expression83.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_frame"


    public static class window_range_expression_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_range_expression"
    // SelectClauseParser.g:193:1: window_range_expression : ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) );
    public final HiveParser_SelectClauseParser.window_range_expression_return window_range_expression() throws RecognitionException {
        HiveParser_SelectClauseParser.window_range_expression_return retval = new HiveParser_SelectClauseParser.window_range_expression_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ROWS84=null;
        Token KW_ROWS85=null;
        Token KW_BETWEEN86=null;
        Token KW_AND87=null;
        HiveParser_SelectClauseParser.window_frame_start_boundary_return sb =null;

        HiveParser_SelectClauseParser.window_frame_boundary_return s =null;

        HiveParser_SelectClauseParser.window_frame_boundary_return end =null;


        ASTNode KW_ROWS84_tree=null;
        ASTNode KW_ROWS85_tree=null;
        ASTNode KW_BETWEEN86_tree=null;
        ASTNode KW_AND87_tree=null;
        RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
        RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
        RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
        RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");
        RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");
         gParent.pushMsg("window_range_expression", state); 
        try {
            // SelectClauseParser.g:196:2: ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) )
            int alt31=2;
            switch ( input.LA(1) ) {
            case KW_ROWS:
                {
                switch ( input.LA(2) ) {
                case KW_BETWEEN:
                    {
                    alt31=2;
                    }
                    break;
                case KW_CURRENT:
                case KW_UNBOUNDED:
                case Number:
                    {
                    alt31=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // SelectClauseParser.g:197:2: KW_ROWS sb= window_frame_start_boundary
                    {
                    KW_ROWS84=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression1200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS84);


                    pushFollow(FOLLOW_window_frame_start_boundary_in_window_range_expression1204);
                    sb=window_frame_start_boundary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_window_frame_start_boundary.add(sb.getTree());

                    // AST REWRITE
                    // elements: sb
                    // token labels: 
                    // rule labels: retval, sb
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_sb=new RewriteRuleSubtreeStream(adaptor,"rule sb",sb!=null?sb.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 197:41: -> ^( TOK_WINDOWRANGE $sb)
                    {
                        // SelectClauseParser.g:197:44: ^( TOK_WINDOWRANGE $sb)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_WINDOWRANGE, "TOK_WINDOWRANGE")
                        , root_1);

                        adaptor.addChild(root_1, stream_sb.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:198:2: KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
                    {
                    KW_ROWS85=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression1218); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS85);


                    KW_BETWEEN86=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_range_expression1220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN86);


                    pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression1224);
                    s=window_frame_boundary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_window_frame_boundary.add(s.getTree());

                    KW_AND87=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_range_expression1226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND87);


                    pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression1230);
                    end=window_frame_boundary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_window_frame_boundary.add(end.getTree());

                    // AST REWRITE
                    // elements: s, end
                    // token labels: 
                    // rule labels: s, end, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);
                    RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end",end!=null?end.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 198:78: -> ^( TOK_WINDOWRANGE $s $end)
                    {
                        // SelectClauseParser.g:198:81: ^( TOK_WINDOWRANGE $s $end)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_WINDOWRANGE, "TOK_WINDOWRANGE")
                        , root_1);

                        adaptor.addChild(root_1, stream_s.nextTree());

                        adaptor.addChild(root_1, stream_end.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_range_expression"


    public static class window_value_expression_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_value_expression"
    // SelectClauseParser.g:201:1: window_value_expression : ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) );
    public final HiveParser_SelectClauseParser.window_value_expression_return window_value_expression() throws RecognitionException {
        HiveParser_SelectClauseParser.window_value_expression_return retval = new HiveParser_SelectClauseParser.window_value_expression_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_RANGE88=null;
        Token KW_RANGE89=null;
        Token KW_BETWEEN90=null;
        Token KW_AND91=null;
        HiveParser_SelectClauseParser.window_frame_start_boundary_return sb =null;

        HiveParser_SelectClauseParser.window_frame_boundary_return s =null;

        HiveParser_SelectClauseParser.window_frame_boundary_return end =null;


        ASTNode KW_RANGE88_tree=null;
        ASTNode KW_RANGE89_tree=null;
        ASTNode KW_BETWEEN90_tree=null;
        ASTNode KW_AND91_tree=null;
        RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
        RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
        RewriteRuleTokenStream stream_KW_RANGE=new RewriteRuleTokenStream(adaptor,"token KW_RANGE");
        RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");
        RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");
         gParent.pushMsg("window_value_expression", state); 
        try {
            // SelectClauseParser.g:204:2: ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) )
            int alt32=2;
            switch ( input.LA(1) ) {
            case KW_RANGE:
                {
                switch ( input.LA(2) ) {
                case KW_BETWEEN:
                    {
                    alt32=2;
                    }
                    break;
                case KW_CURRENT:
                case KW_UNBOUNDED:
                case Number:
                    {
                    alt32=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // SelectClauseParser.g:205:2: KW_RANGE sb= window_frame_start_boundary
                    {
                    KW_RANGE88=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression1264); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_RANGE.add(KW_RANGE88);


                    pushFollow(FOLLOW_window_frame_start_boundary_in_window_value_expression1268);
                    sb=window_frame_start_boundary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_window_frame_start_boundary.add(sb.getTree());

                    // AST REWRITE
                    // elements: sb
                    // token labels: 
                    // rule labels: retval, sb
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_sb=new RewriteRuleSubtreeStream(adaptor,"rule sb",sb!=null?sb.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 205:42: -> ^( TOK_WINDOWVALUES $sb)
                    {
                        // SelectClauseParser.g:205:45: ^( TOK_WINDOWVALUES $sb)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_WINDOWVALUES, "TOK_WINDOWVALUES")
                        , root_1);

                        adaptor.addChild(root_1, stream_sb.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:206:2: KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
                    {
                    KW_RANGE89=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression1282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_RANGE.add(KW_RANGE89);


                    KW_BETWEEN90=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_value_expression1284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN90);


                    pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1288);
                    s=window_frame_boundary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_window_frame_boundary.add(s.getTree());

                    KW_AND91=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_value_expression1290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND91);


                    pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1294);
                    end=window_frame_boundary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_window_frame_boundary.add(end.getTree());

                    // AST REWRITE
                    // elements: s, end
                    // token labels: 
                    // rule labels: s, end, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);
                    RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end",end!=null?end.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 206:79: -> ^( TOK_WINDOWVALUES $s $end)
                    {
                        // SelectClauseParser.g:206:82: ^( TOK_WINDOWVALUES $s $end)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_WINDOWVALUES, "TOK_WINDOWVALUES")
                        , root_1);

                        adaptor.addChild(root_1, stream_s.nextTree());

                        adaptor.addChild(root_1, stream_end.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_value_expression"


    public static class window_frame_start_boundary_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_frame_start_boundary"
    // SelectClauseParser.g:209:1: window_frame_start_boundary : ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) );
    public final HiveParser_SelectClauseParser.window_frame_start_boundary_return window_frame_start_boundary() throws RecognitionException {
        HiveParser_SelectClauseParser.window_frame_start_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_start_boundary_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_UNBOUNDED92=null;
        Token KW_PRECEDING93=null;
        Token KW_CURRENT94=null;
        Token KW_ROW95=null;
        Token Number96=null;
        Token KW_PRECEDING97=null;

        ASTNode KW_UNBOUNDED92_tree=null;
        ASTNode KW_PRECEDING93_tree=null;
        ASTNode KW_CURRENT94_tree=null;
        ASTNode KW_ROW95_tree=null;
        ASTNode Number96_tree=null;
        ASTNode KW_PRECEDING97_tree=null;
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
        RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");
        RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
        RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");

         gParent.pushMsg("windowframestartboundary", state); 
        try {
            // SelectClauseParser.g:212:3: ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case KW_UNBOUNDED:
                {
                alt33=1;
                }
                break;
            case KW_CURRENT:
                {
                alt33=2;
                }
                break;
            case Number:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // SelectClauseParser.g:213:3: KW_UNBOUNDED KW_PRECEDING
                    {
                    KW_UNBOUNDED92=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_UNBOUNDED.add(KW_UNBOUNDED92);


                    KW_PRECEDING93=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PRECEDING.add(KW_PRECEDING93);


                    // AST REWRITE
                    // elements: KW_UNBOUNDED, KW_PRECEDING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 213:30: -> ^( KW_PRECEDING KW_UNBOUNDED )
                    {
                        // SelectClauseParser.g:213:33: ^( KW_PRECEDING KW_UNBOUNDED )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        stream_KW_PRECEDING.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_UNBOUNDED.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:214:3: KW_CURRENT KW_ROW
                    {
                    KW_CURRENT94=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_start_boundary1347); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CURRENT.add(KW_CURRENT94);


                    KW_ROW95=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_start_boundary1349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ROW.add(KW_ROW95);


                    // AST REWRITE
                    // elements: KW_CURRENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 214:22: -> ^( KW_CURRENT )
                    {
                        // SelectClauseParser.g:214:25: ^( KW_CURRENT )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        stream_KW_CURRENT.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // SelectClauseParser.g:215:3: Number KW_PRECEDING
                    {
                    Number96=(Token)match(input,Number,FOLLOW_Number_in_window_frame_start_boundary1362); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Number.add(Number96);


                    KW_PRECEDING97=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1364); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PRECEDING.add(KW_PRECEDING97);


                    // AST REWRITE
                    // elements: Number, KW_PRECEDING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 215:23: -> ^( KW_PRECEDING Number )
                    {
                        // SelectClauseParser.g:215:26: ^( KW_PRECEDING Number )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        stream_KW_PRECEDING.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Number.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_frame_start_boundary"


    public static class window_frame_boundary_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_frame_boundary"
    // SelectClauseParser.g:218:1: window_frame_boundary : ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) );
    public final HiveParser_SelectClauseParser.window_frame_boundary_return window_frame_boundary() throws RecognitionException {
        HiveParser_SelectClauseParser.window_frame_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_boundary_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token r=null;
        Token d=null;
        Token KW_UNBOUNDED98=null;
        Token KW_CURRENT99=null;
        Token KW_ROW100=null;
        Token Number101=null;

        ASTNode r_tree=null;
        ASTNode d_tree=null;
        ASTNode KW_UNBOUNDED98_tree=null;
        ASTNode KW_CURRENT99_tree=null;
        ASTNode KW_ROW100_tree=null;
        ASTNode Number101_tree=null;
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
        RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");
        RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
        RewriteRuleTokenStream stream_KW_FOLLOWING=new RewriteRuleTokenStream(adaptor,"token KW_FOLLOWING");
        RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");

         gParent.pushMsg("windowframeboundary", state); 
        try {
            // SelectClauseParser.g:221:3: ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case KW_UNBOUNDED:
                {
                alt36=1;
                }
                break;
            case KW_CURRENT:
                {
                alt36=2;
                }
                break;
            case Number:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // SelectClauseParser.g:222:3: KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING )
                    {
                    KW_UNBOUNDED98=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_UNBOUNDED.add(KW_UNBOUNDED98);


                    // SelectClauseParser.g:222:16: (r= KW_PRECEDING |r= KW_FOLLOWING )
                    int alt34=2;
                    switch ( input.LA(1) ) {
                    case KW_PRECEDING:
                        {
                        alt34=1;
                        }
                        break;
                    case KW_FOLLOWING:
                        {
                        alt34=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;

                    }

                    switch (alt34) {
                        case 1 :
                            // SelectClauseParser.g:222:17: r= KW_PRECEDING
                            {
                            r=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1400); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_PRECEDING.add(r);


                            }
                            break;
                        case 2 :
                            // SelectClauseParser.g:222:32: r= KW_FOLLOWING
                            {
                            r=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1404); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_FOLLOWING.add(r);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: KW_UNBOUNDED, r
                    // token labels: r
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_r=new RewriteRuleTokenStream(adaptor,"token r",r);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 222:49: -> ^( $r KW_UNBOUNDED )
                    {
                        // SelectClauseParser.g:222:52: ^( $r KW_UNBOUNDED )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(stream_r.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_UNBOUNDED.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:223:3: KW_CURRENT KW_ROW
                    {
                    KW_CURRENT99=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_boundary1422); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CURRENT.add(KW_CURRENT99);


                    KW_ROW100=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_boundary1424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ROW.add(KW_ROW100);


                    // AST REWRITE
                    // elements: KW_CURRENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 223:22: -> ^( KW_CURRENT )
                    {
                        // SelectClauseParser.g:223:25: ^( KW_CURRENT )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        stream_KW_CURRENT.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // SelectClauseParser.g:224:3: Number (d= KW_PRECEDING |d= KW_FOLLOWING )
                    {
                    Number101=(Token)match(input,Number,FOLLOW_Number_in_window_frame_boundary1437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Number.add(Number101);


                    // SelectClauseParser.g:224:10: (d= KW_PRECEDING |d= KW_FOLLOWING )
                    int alt35=2;
                    switch ( input.LA(1) ) {
                    case KW_PRECEDING:
                        {
                        alt35=1;
                        }
                        break;
                    case KW_FOLLOWING:
                        {
                        alt35=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;

                    }

                    switch (alt35) {
                        case 1 :
                            // SelectClauseParser.g:224:11: d= KW_PRECEDING
                            {
                            d=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1442); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_PRECEDING.add(d);


                            }
                            break;
                        case 2 :
                            // SelectClauseParser.g:224:28: d= KW_FOLLOWING
                            {
                            d=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1448); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_FOLLOWING.add(d);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: d, Number
                    // token labels: d
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 224:45: -> ^( $d Number )
                    {
                        // SelectClauseParser.g:224:48: ^( $d Number )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(stream_d.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        stream_Number.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_frame_boundary"

    // $ANTLR start synpred1_SelectClauseParser
    public final void synpred1_SelectClauseParser_fragment() throws RecognitionException {
        // SelectClauseParser.g:130:5: ( tableAllColumns )
        // SelectClauseParser.g:130:6: tableAllColumns
        {
        pushFollow(FOLLOW_tableAllColumns_in_synpred1_SelectClauseParser689);
        gHiveParser.tableAllColumns();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_SelectClauseParser

    // $ANTLR start synpred2_SelectClauseParser
    public final void synpred2_SelectClauseParser_fragment() throws RecognitionException {
        // SelectClauseParser.g:154:5: ( tableAllColumns )
        // SelectClauseParser.g:154:6: tableAllColumns
        {
        pushFollow(FOLLOW_tableAllColumns_in_synpred2_SelectClauseParser954);
        gHiveParser.tableAllColumns();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_SelectClauseParser

    // Delegated rules

    public final boolean synpred2_SelectClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_SelectClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_SelectClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_SelectClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA2_eotS =
        "\u067c\uffff";
    static final String DFA2_eofS =
        "\1\uffff\1\3\40\uffff\1\50\u0659\uffff";
    static final String DFA2_minS =
        "\1\7\1\4\40\uffff\1\7\3\0\2\7\2\uffff\4\0\5\uffff\3\0\1\7\6\uffff"+
        "\1\0\1\7\2\0\3\uffff\1\0\6\uffff\1\0\4\uffff\2\0\3\uffff\1\0\3\uffff"+
        "\1\0\2\uffff\2\0\2\uffff\5\0\1\uffff\2\0\6\uffff\1\0\2\uffff\2\0"+
        "\2\uffff\5\0\1\uffff\2\0\1\uffff\1\0\u00c7\uffff\1\0\1\uffff\2\0"+
        "\1\uffff\34\0\u014a\uffff\1\0\1\uffff\1\0\1\uffff\34\0\62\uffff"+
        "\1\0\u0378\uffff";
    static final String DFA2_maxS =
        "\2\u022e\40\uffff\1\u022e\3\0\2\u022e\2\uffff\4\0\5\uffff\3\0\1"+
        "\u022e\6\uffff\1\0\1\u022e\2\0\3\uffff\1\0\6\uffff\1\0\4\uffff\2"+
        "\0\3\uffff\1\0\3\uffff\1\0\2\uffff\2\0\2\uffff\5\0\1\uffff\2\0\6"+
        "\uffff\1\0\2\uffff\2\0\2\uffff\5\0\1\uffff\2\0\1\uffff\1\0\u00c7"+
        "\uffff\1\0\1\uffff\2\0\1\uffff\34\0\u014a\uffff\1\0\1\uffff\1\0"+
        "\1\uffff\34\0\62\uffff\1\0\u0378\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\3\44\uffff\1\1\u0653\uffff";
    static final String DFA2_specialS =
        "\43\uffff\1\0\1\1\1\2\4\uffff\1\3\1\4\1\5\1\6\5\uffff\1\7\1\10\1"+
        "\11\7\uffff\1\12\1\uffff\1\13\1\14\3\uffff\1\15\6\uffff\1\16\4\uffff"+
        "\1\17\1\20\3\uffff\1\21\3\uffff\1\22\2\uffff\1\23\1\24\2\uffff\1"+
        "\25\1\26\1\27\1\30\1\31\1\uffff\1\32\1\33\6\uffff\1\34\2\uffff\1"+
        "\35\1\36\2\uffff\1\37\1\40\1\41\1\42\1\43\1\uffff\1\44\1\45\1\uffff"+
        "\1\46\u00c7\uffff\1\47\1\uffff\1\50\1\51\1\uffff\1\52\1\53\1\54"+
        "\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71"+
        "\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
        "\u014a\uffff\1\106\1\uffff\1\107\1\uffff\1\110\1\111\1\112\1\113"+
        "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126"+
        "\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141"+
        "\1\142\1\143\62\uffff\1\144\u0378\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\6\uffff\1\3\4\uffff\1\3\7\uffff\5\3\1\1\2\3\1\uffff\24"+
            "\3\1\uffff\4\3\1\uffff\2\3\1\uffff\4\3\1\uffff\3\3\1\uffff\1"+
            "\3\1\uffff\4\3\1\uffff\20\3\1\2\6\3\1\uffff\1\3\1\uffff\1\3"+
            "\2\uffff\4\3\1\uffff\12\3\1\uffff\4\3\1\uffff\1\3\1\uffff\4"+
            "\3\1\uffff\24\3\1\uffff\6\3\1\uffff\13\3\1\uffff\6\3\1\uffff"+
            "\2\3\1\uffff\12\3\2\uffff\1\3\1\uffff\5\3\1\uffff\2\3\1\uffff"+
            "\5\3\3\uffff\14\3\1\uffff\20\3\1\uffff\6\3\1\uffff\17\3\1\uffff"+
            "\10\3\1\uffff\3\3\1\uffff\6\3\1\uffff\4\3\1\uffff\3\3\1\uffff"+
            "\15\3\1\uffff\3\3\2\uffff\1\3\1\uffff\4\3\3\uffff\1\3\2\uffff"+
            "\1\3\2\uffff\2\3\7\uffff\5\3\41\uffff\1\3\46\uffff\1\3\61\uffff"+
            "\1\3\3\uffff\1\3\61\uffff\1\3\3\uffff\1\3\27\uffff\1\3\4\uffff"+
            "\1\3",
            "\3\3\1\50\2\uffff\1\3\1\uffff\1\3\1\uffff\1\50\2\3\1\uffff"+
            "\1\3\1\50\1\uffff\2\3\1\uffff\2\3\1\uffff\1\43\4\144\2\147\1"+
            "\144\1\3\1\144\1\65\1\121\1\144\1\147\2\144\1\120\3\75\1\147"+
            "\2\144\1\147\2\144\2\50\1\144\1\uffff\1\44\3\144\1\uffff\2\144"+
            "\1\uffff\4\144\1\uffff\1\147\1\144\1\147\1\uffff\1\147\1\uffff"+
            "\1\52\1\54\1\147\1\144\1\uffff\1\144\1\45\3\144\1\147\2\144"+
            "\1\147\3\144\1\147\3\144\1\uffff\1\141\1\75\1\144\1\147\2\144"+
            "\1\uffff\1\144\1\uffff\1\144\1\3\1\uffff\1\144\1\77\2\144\1"+
            "\uffff\1\147\1\50\1\63\1\147\4\144\1\75\1\50\1\uffff\2\147\2"+
            "\144\1\3\1\147\1\uffff\1\144\1\147\1\125\1\75\1\3\2\144\1\50"+
            "\1\147\1\113\2\144\1\147\3\144\1\146\1\75\1\134\1\50\1\147\1"+
            "\100\3\144\1\uffff\4\144\1\140\1\147\1\uffff\1\144\1\104\1\143"+
            "\2\144\1\147\5\144\1\uffff\1\76\5\144\1\3\2\144\1\uffff\1\144"+
            "\1\147\2\144\1\46\1\144\1\64\1\144\1\147\1\144\2\uffff\1\144"+
            "\1\3\1\135\2\147\2\144\1\uffff\2\144\1\uffff\1\147\2\144\1\147"+
            "\1\144\3\uffff\1\144\1\147\1\144\1\147\2\144\1\147\1\144\1\147"+
            "\3\144\1\3\1\147\1\104\10\144\1\147\1\144\1\147\1\104\2\144"+
            "\1\uffff\3\147\3\144\1\3\4\144\1\147\5\144\1\75\1\144\1\142"+
            "\2\144\1\uffff\6\144\1\147\1\144\1\uffff\3\144\1\uffff\1\53"+
            "\1\144\1\147\3\144\1\uffff\1\147\1\55\1\147\1\144\1\uffff\1"+
            "\144\1\131\1\144\1\uffff\3\144\1\147\2\144\2\147\3\144\1\147"+
            "\1\144\1\uffff\3\144\1\uffff\1\3\1\144\1\3\1\147\3\144\1\uffff"+
            "\2\3\1\66\1\3\1\uffff\1\47\2\3\1\50\1\47\3\uffff\1\3\3\uffff"+
            "\1\42\4\50\41\uffff\1\144\46\uffff\1\144\61\uffff\1\144\3\uffff"+
            "\1\144\61\uffff\1\144\3\uffff\1\144\27\uffff\1\144\4\uffff\1"+
            "\144",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\3\2\uffff\1\50\3\uffff\1\3\4\uffff\1\3\7\uffff\10\3\1\uffff"+
            "\24\3\1\uffff\1\166\3\3\1\uffff\2\3\1\uffff\4\3\1\uffff\3\3"+
            "\1\uffff\1\3\1\uffff\4\3\1\uffff\20\3\1\uffff\1\167\5\3\1\uffff"+
            "\1\3\1\uffff\1\3\1\50\1\uffff\4\3\1\uffff\12\3\1\uffff\4\3\1"+
            "\50\1\3\1\uffff\2\3\1\156\1\3\1\50\13\3\1\174\1\3\1\162\6\3"+
            "\1\uffff\4\3\1\173\1\3\1\uffff\2\3\1\171\10\3\1\uffff\1\176"+
            "\5\3\1\50\2\3\1\uffff\4\3\1\uffff\5\3\2\uffff\1\3\1\uffff\1"+
            "\165\4\3\1\uffff\2\3\1\uffff\5\3\3\uffff\14\3\1\50\20\3\1\uffff"+
            "\6\3\1\50\14\3\1\170\2\3\1\uffff\10\3\1\uffff\3\3\1\uffff\6"+
            "\3\1\uffff\4\3\1\uffff\1\3\1\161\1\3\1\uffff\15\3\1\uffff\3"+
            "\3\1\uffff\1\50\1\3\1\50\4\3\3\uffff\1\3\2\uffff\1\3\2\uffff"+
            "\2\3\3\uffff\1\50\4\uffff\4\3\41\uffff\1\3\46\uffff\1\3\61\uffff"+
            "\1\3\3\uffff\1\3\61\uffff\1\3\3\uffff\1\3\27\uffff\1\3\4\uffff"+
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\50\6\uffff\1\50\4\uffff\1\50\7\uffff\10\50\1\uffff\7\50"+
            "\1\u0149\14\50\1\uffff\4\50\1\uffff\2\50\1\uffff\4\50\1\uffff"+
            "\3\50\1\uffff\1\50\1\uffff\4\50\1\uffff\20\50\1\uffff\6\50\1"+
            "\uffff\1\50\1\uffff\1\50\2\uffff\4\50\1\uffff\12\50\1\uffff"+
            "\4\50\1\uffff\1\50\1\uffff\4\50\1\uffff\4\50\1\u0148\17\50\1"+
            "\uffff\6\50\1\uffff\1\50\1\u0146\11\50\1\uffff\6\50\1\uffff"+
            "\2\50\1\uffff\12\50\2\uffff\1\50\1\uffff\5\50\1\uffff\2\50\1"+
            "\uffff\5\50\3\uffff\14\50\1\uffff\1\50\1\u0146\13\50\1\u0146"+
            "\2\50\1\uffff\6\50\1\uffff\17\50\1\uffff\10\50\1\uffff\3\50"+
            "\1\uffff\6\50\1\uffff\4\50\1\uffff\3\50\1\uffff\15\50\1\uffff"+
            "\3\50\2\uffff\1\50\1\uffff\4\50\3\uffff\1\50\2\uffff\1\50\2"+
            "\uffff\2\50\10\uffff\4\50\41\uffff\1\50\46\uffff\1\50\61\uffff"+
            "\1\50\3\uffff\1\50\61\uffff\1\50\3\uffff\1\50\27\uffff\1\50"+
            "\4\uffff\1\50",
            "\1\u0151\6\uffff\1\u0155\4\uffff\1\u0154\7\uffff\1\u0162\4"+
            "\u0163\2\u0165\1\u0163\1\uffff\1\u0163\1\u0160\1\u0165\1\u0163"+
            "\1\u0165\2\u0163\1\u0165\3\u0164\1\u0165\2\u0163\1\u0165\2\u0163"+
            "\1\u015e\1\u015b\1\u0163\1\uffff\4\u0163\1\uffff\2\u0163\1\uffff"+
            "\4\u0163\1\uffff\1\u0165\1\u0163\1\u0165\1\uffff\1\u0165\1\uffff"+
            "\1\u014e\1\u0150\1\u0165\1\u0163\1\uffff\1\u0163\1\u014d\3\u0163"+
            "\1\u0165\2\u0163\1\u0165\3\u0163\1\u0165\3\u0163\1\uffff\1\u0163"+
            "\1\u0164\1\u0163\1\u0165\2\u0163\1\uffff\1\u0163\1\uffff\1\u0163"+
            "\2\uffff\1\u0163\1\u0165\2\u0163\1\uffff\1\u0165\1\u015c\1\u0157"+
            "\1\u0165\4\u0163\1\u0164\1\u015d\1\uffff\2\u0165\2\u0163\1\uffff"+
            "\1\u0165\1\uffff\1\u0163\2\u0165\1\u0164\1\uffff\2\u0163\1\u015f"+
            "\2\u0165\2\u0163\1\u0165\3\u0163\1\u0165\1\u0164\1\u0165\1\u015a"+
            "\2\u0165\3\u0163\1\uffff\4\u0163\2\u0165\1\uffff\1\u0163\1\u0165"+
            "\3\u0163\1\u0165\5\u0163\1\uffff\1\u0161\5\u0163\1\uffff\2\u0163"+
            "\1\uffff\1\u0163\1\u0165\2\u0163\1\uffff\1\u0163\1\u0158\1\u0163"+
            "\1\u0165\1\u0163\2\uffff\1\u0163\1\uffff\3\u0165\2\u0163\1\uffff"+
            "\2\u0163\1\uffff\1\u0165\2\u0163\1\u0165\1\u0163\3\uffff\1\u0163"+
            "\1\u0165\1\u0163\1\u0165\2\u0163\1\u0165\1\u0163\1\u0165\3\u0163"+
            "\1\uffff\2\u0165\10\u0163\1\u0165\1\u0163\2\u0165\2\u0163\1"+
            "\uffff\3\u0165\3\u0163\1\uffff\4\u0163\1\u0165\5\u0163\1\u0164"+
            "\4\u0163\1\uffff\6\u0163\1\u0165\1\u0163\1\uffff\3\u0163\1\uffff"+
            "\1\u014f\1\u0163\1\u0165\3\u0163\1\uffff\1\u0165\1\u0156\1\u0165"+
            "\1\u0163\1\uffff\1\u0163\1\u0165\1\u0163\1\uffff\3\u0163\1\u0165"+
            "\2\u0163\2\u0165\3\u0163\1\u0165\1\u0163\1\uffff\3\u0163\2\uffff"+
            "\1\u0163\1\uffff\1\u0165\3\u0163\3\uffff\1\u0159\2\uffff\1\u0166"+
            "\2\uffff\1\u014b\1\u0166\10\uffff\1\u0152\1\u014c\1\u0166\1"+
            "\u0153\41\uffff\1\u0163\46\uffff\1\u0163\61\uffff\1\u0163\3"+
            "\uffff\1\u0163\61\uffff\1\u0163\3\uffff\1\u0163\27\uffff\1\u0163"+
            "\4\uffff\1\u0163",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u02bd\6\uffff\1\u02c1\4\uffff\1\u02c0\7\uffff\1\u02cc\4"+
            "\u02cd\2\u02d0\1\u02cd\1\uffff\1\u02cd\1\u02cb\1\u02d0\1\u02cd"+
            "\1\u02d0\2\u02cd\1\u02d0\3\u02ce\1\u02d0\2\u02cd\1\u02d0\2\u02cd"+
            "\1\u02c9\1\u02c6\1\u02cd\1\uffff\4\u02cd\1\uffff\2\u02cd\1\uffff"+
            "\4\u02cd\1\uffff\1\u02d0\1\u02cd\1\u02d0\1\uffff\1\u02d0\1\uffff"+
            "\1\u02ba\1\u02bc\1\u02d0\1\u02cd\1\uffff\1\u02cd\1\u02b9\3\u02cd"+
            "\1\u02d0\2\u02cd\1\u02d0\3\u02cd\1\u02d0\3\u02cd\1\3\1\u02cd"+
            "\1\u02ce\1\u02cd\1\u02d0\2\u02cd\1\uffff\1\u02cd\1\uffff\1\u02cd"+
            "\2\uffff\1\u02cd\1\u02cf\2\u02cd\1\uffff\1\u02d0\1\u02c7\1\u02c3"+
            "\1\u02d0\4\u02cd\1\u02ce\1\u02c8\1\uffff\2\u02d0\2\u02cd\1\uffff"+
            "\1\u02d0\1\uffff\1\u02cd\2\u02d0\1\u02ce\1\uffff\2\u02cd\1\u02ca"+
            "\2\u02d0\2\u02cd\1\u02d0\3\u02cd\1\u02d0\1\u02ce\1\u02d0\1\u02c5"+
            "\2\u02d0\3\u02cd\1\uffff\4\u02cd\2\u02d0\1\uffff\1\u02cd\1\u02d0"+
            "\3\u02cd\1\u02d0\5\u02cd\1\uffff\1\u02b3\5\u02cd\1\uffff\2\u02cd"+
            "\1\uffff\1\u02cd\1\u02d0\2\u02cd\1\u02b6\1\u02cd\1\u02c4\1\u02cd"+
            "\1\u02d0\1\u02cd\2\uffff\1\u02cd\1\uffff\3\u02d0\2\u02cd\1\uffff"+
            "\2\u02cd\1\uffff\1\u02d0\2\u02cd\1\u02d0\1\u02cd\3\uffff\1\u02cd"+
            "\1\u02d0\1\u02cd\1\u02d0\2\u02cd\1\u02d0\1\u02cd\1\u02d0\3\u02cd"+
            "\1\50\2\u02d0\10\u02cd\1\u02d0\1\u02cd\2\u02d0\2\u02cd\1\uffff"+
            "\3\u02d0\3\u02cd\1\50\4\u02cd\1\u02d0\5\u02cd\1\u02ce\4\u02cd"+
            "\1\uffff\6\u02cd\1\u02d0\1\u02cd\1\uffff\3\u02cd\1\uffff\1\u02bb"+
            "\1\u02cd\1\u02d0\3\u02cd\1\uffff\1\u02d0\1\u02c2\1\u02d0\1\u02cd"+
            "\1\uffff\1\u02cd\1\u02d0\1\u02cd\1\uffff\3\u02cd\1\u02d0\2\u02cd"+
            "\2\u02d0\3\u02cd\1\u02d0\1\u02cd\1\uffff\3\u02cd\2\uffff\1\u02cd"+
            "\1\uffff\1\u02d0\3\u02cd\3\uffff\1\u02b5\2\uffff\1\u02b7\2\uffff"+
            "\1\u02b1\1\u02b7\3\uffff\1\3\3\uffff\1\3\1\u02be\1\u02b8\1\u02b7"+
            "\1\u02bf\41\uffff\1\u02cd\46\uffff\1\u02cd\61\uffff\1\u02cd"+
            "\3\uffff\1\u02cd\61\uffff\1\u02cd\3\uffff\1\u02cd\27\uffff\1"+
            "\u02cd\4\uffff\1\u02cd",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\3\6\uffff\1\3\4\uffff\1\3\7\uffff\10\3\1\uffff\24\3\1\uffff"+
            "\4\3\1\uffff\2\3\1\uffff\4\3\1\uffff\3\3\1\uffff\1\3\1\uffff"+
            "\4\3\1\uffff\20\3\1\uffff\6\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
            "\4\3\1\uffff\12\3\1\uffff\4\3\1\uffff\1\3\1\uffff\4\3\1\uffff"+
            "\24\3\1\uffff\6\3\1\uffff\13\3\1\uffff\6\3\1\uffff\2\3\1\uffff"+
            "\12\3\2\uffff\1\3\1\uffff\5\3\1\uffff\2\3\1\uffff\5\3\3\uffff"+
            "\14\3\1\uffff\20\3\1\uffff\6\3\1\uffff\17\3\1\uffff\10\3\1\uffff"+
            "\3\3\1\uffff\6\3\1\uffff\4\3\1\uffff\3\3\1\uffff\15\3\1\uffff"+
            "\3\3\2\uffff\1\3\1\uffff\4\3\3\uffff\1\u0303\2\uffff\1\3\2\uffff"+
            "\2\3\7\uffff\5\3\41\uffff\1\3\46\uffff\1\3\61\uffff\1\3\3\uffff"+
            "\1\3\61\uffff\1\3\3\uffff\1\3\27\uffff\1\3\4\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "55:29: ( KW_ALL |dist= KW_DISTINCT )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_35 = input.LA(1);

                         
                        int index2_35 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_35);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_36 = input.LA(1);

                         
                        int index2_36 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_36);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_37 = input.LA(1);

                         
                        int index2_37 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_37);

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_42 = input.LA(1);

                         
                        int index2_42 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_42);

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_43 = input.LA(1);

                         
                        int index2_43 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_43);

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_44 = input.LA(1);

                         
                        int index2_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_44);

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_45 = input.LA(1);

                         
                        int index2_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_45);

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_51 = input.LA(1);

                         
                        int index2_51 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_51);

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_52 = input.LA(1);

                         
                        int index2_52 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_52);

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_53 = input.LA(1);

                         
                        int index2_53 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_53);

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_61 = input.LA(1);

                         
                        int index2_61 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_61);

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_63 = input.LA(1);

                         
                        int index2_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_63);

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA2_64 = input.LA(1);

                         
                        int index2_64 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_64);

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA2_68 = input.LA(1);

                         
                        int index2_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_68);

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA2_75 = input.LA(1);

                         
                        int index2_75 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_75);

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA2_80 = input.LA(1);

                         
                        int index2_80 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_80);

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA2_81 = input.LA(1);

                         
                        int index2_81 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_81);

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA2_85 = input.LA(1);

                         
                        int index2_85 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_85);

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA2_89 = input.LA(1);

                         
                        int index2_89 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_89);

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA2_92 = input.LA(1);

                         
                        int index2_92 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_92);

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA2_93 = input.LA(1);

                         
                        int index2_93 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_93);

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA2_96 = input.LA(1);

                         
                        int index2_96 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_96);

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA2_97 = input.LA(1);

                         
                        int index2_97 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_97);

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA2_98 = input.LA(1);

                         
                        int index2_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_98);

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA2_99 = input.LA(1);

                         
                        int index2_99 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_99);

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA2_100 = input.LA(1);

                         
                        int index2_100 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_100);

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA2_102 = input.LA(1);

                         
                        int index2_102 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_102);

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA2_103 = input.LA(1);

                         
                        int index2_103 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_103);

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA2_110 = input.LA(1);

                         
                        int index2_110 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_110);

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA2_113 = input.LA(1);

                         
                        int index2_113 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_113);

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA2_114 = input.LA(1);

                         
                        int index2_114 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_114);

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA2_117 = input.LA(1);

                         
                        int index2_117 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_117);

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA2_118 = input.LA(1);

                         
                        int index2_118 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_118);

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA2_119 = input.LA(1);

                         
                        int index2_119 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_119);

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA2_120 = input.LA(1);

                         
                        int index2_120 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_120);

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA2_121 = input.LA(1);

                         
                        int index2_121 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_121);

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA2_123 = input.LA(1);

                         
                        int index2_123 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_123);

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA2_124 = input.LA(1);

                         
                        int index2_124 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_124);

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA2_126 = input.LA(1);

                         
                        int index2_126 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_126);

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA2_326 = input.LA(1);

                         
                        int index2_326 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_326);

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA2_328 = input.LA(1);

                         
                        int index2_328 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_328);

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA2_329 = input.LA(1);

                         
                        int index2_329 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_329);

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA2_331 = input.LA(1);

                         
                        int index2_331 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_331);

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA2_332 = input.LA(1);

                         
                        int index2_332 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_332);

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA2_333 = input.LA(1);

                         
                        int index2_333 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_333);

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA2_334 = input.LA(1);

                         
                        int index2_334 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_334);

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA2_335 = input.LA(1);

                         
                        int index2_335 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_335);

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA2_336 = input.LA(1);

                         
                        int index2_336 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_336);

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA2_337 = input.LA(1);

                         
                        int index2_337 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_337);

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA2_338 = input.LA(1);

                         
                        int index2_338 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_338);

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA2_339 = input.LA(1);

                         
                        int index2_339 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_339);

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA2_340 = input.LA(1);

                         
                        int index2_340 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_340);

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA2_341 = input.LA(1);

                         
                        int index2_341 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_341);

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA2_342 = input.LA(1);

                         
                        int index2_342 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_342);

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA2_343 = input.LA(1);

                         
                        int index2_343 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_343);

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA2_344 = input.LA(1);

                         
                        int index2_344 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_344);

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA2_345 = input.LA(1);

                         
                        int index2_345 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_345);

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA2_346 = input.LA(1);

                         
                        int index2_346 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_346);

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA2_347 = input.LA(1);

                         
                        int index2_347 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_347);

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA2_348 = input.LA(1);

                         
                        int index2_348 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_348);

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA2_349 = input.LA(1);

                         
                        int index2_349 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_349);

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA2_350 = input.LA(1);

                         
                        int index2_350 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_350);

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA2_351 = input.LA(1);

                         
                        int index2_351 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_351);

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA2_352 = input.LA(1);

                         
                        int index2_352 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_352);

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA2_353 = input.LA(1);

                         
                        int index2_353 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_353);

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA2_354 = input.LA(1);

                         
                        int index2_354 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_354);

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA2_355 = input.LA(1);

                         
                        int index2_355 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_355);

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA2_356 = input.LA(1);

                         
                        int index2_356 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_356);

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA2_357 = input.LA(1);

                         
                        int index2_357 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_357);

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA2_358 = input.LA(1);

                         
                        int index2_358 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_358);

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA2_689 = input.LA(1);

                         
                        int index2_689 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_689);

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA2_691 = input.LA(1);

                         
                        int index2_691 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_691);

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA2_693 = input.LA(1);

                         
                        int index2_693 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_693);

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA2_694 = input.LA(1);

                         
                        int index2_694 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_694);

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA2_695 = input.LA(1);

                         
                        int index2_695 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_695);

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA2_696 = input.LA(1);

                         
                        int index2_696 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_696);

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA2_697 = input.LA(1);

                         
                        int index2_697 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_697);

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA2_698 = input.LA(1);

                         
                        int index2_698 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_698);

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA2_699 = input.LA(1);

                         
                        int index2_699 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_699);

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA2_700 = input.LA(1);

                         
                        int index2_700 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_700);

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA2_701 = input.LA(1);

                         
                        int index2_701 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_701);

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA2_702 = input.LA(1);

                         
                        int index2_702 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_702);

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA2_703 = input.LA(1);

                         
                        int index2_703 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_703);

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA2_704 = input.LA(1);

                         
                        int index2_704 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_704);

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA2_705 = input.LA(1);

                         
                        int index2_705 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_705);

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA2_706 = input.LA(1);

                         
                        int index2_706 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_706);

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA2_707 = input.LA(1);

                         
                        int index2_707 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_707);

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA2_708 = input.LA(1);

                         
                        int index2_708 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_708);

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA2_709 = input.LA(1);

                         
                        int index2_709 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_709);

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA2_710 = input.LA(1);

                         
                        int index2_710 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_710);

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA2_711 = input.LA(1);

                         
                        int index2_711 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_711);

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA2_712 = input.LA(1);

                         
                        int index2_712 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_712);

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA2_713 = input.LA(1);

                         
                        int index2_713 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_713);

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA2_714 = input.LA(1);

                         
                        int index2_714 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_714);

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA2_715 = input.LA(1);

                         
                        int index2_715 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_715);

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA2_716 = input.LA(1);

                         
                        int index2_716 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_716);

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA2_717 = input.LA(1);

                         
                        int index2_717 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_717);

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA2_718 = input.LA(1);

                         
                        int index2_718 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_718);

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA2_719 = input.LA(1);

                         
                        int index2_719 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_719);

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA2_720 = input.LA(1);

                         
                        int index2_720 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_720);

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA2_771 = input.LA(1);

                         
                        int index2_771 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}

                         
                        input.seek(index2_771);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA6_eotS =
        "\103\uffff";
    static final String DFA6_eofS =
        "\103\uffff";
    static final String DFA6_minS =
        "\1\33\3\12\77\uffff";
    static final String DFA6_maxS =
        "\1\u022e\3\u0154\77\uffff";
    static final String DFA6_acceptS =
        "\4\uffff\1\1\1\uffff\1\2\74\uffff";
    static final String DFA6_specialS =
        "\103\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\4\2\2\3\1\2\1\uffff\1\2\2\3\1\2\1\3\2\2\5\3\2\2\1\3\2\2"+
            "\2\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\1\3"+
            "\1\2\1\3\1\uffff\1\3\1\uffff\3\3\1\2\1\uffff\1\2\1\3\3\2\1\3"+
            "\2\2\1\3\3\2\1\3\3\2\1\uffff\1\2\1\3\1\2\1\3\2\2\1\uffff\1\2"+
            "\1\uffff\1\2\2\uffff\1\2\1\3\2\2\1\uffff\1\3\1\uffff\2\3\4\2"+
            "\1\3\2\uffff\2\3\2\2\1\uffff\1\3\1\uffff\1\2\3\3\1\uffff\2\2"+
            "\1\uffff\2\3\2\2\1\3\3\2\3\3\1\uffff\2\3\3\2\1\uffff\4\2\2\3"+
            "\1\uffff\1\2\1\3\3\2\1\3\5\2\2\uffff\5\2\1\uffff\2\2\1\uffff"+
            "\1\2\1\3\2\2\1\uffff\1\2\1\3\1\2\1\3\1\2\2\uffff\1\2\1\uffff"+
            "\3\3\2\2\1\uffff\2\2\1\uffff\1\3\2\2\1\3\1\2\3\uffff\1\2\1\3"+
            "\1\2\1\3\2\2\1\3\1\2\1\3\3\2\1\uffff\2\3\10\2\1\3\1\2\2\3\2"+
            "\2\1\uffff\3\3\3\2\1\uffff\4\2\1\3\5\2\1\3\4\2\1\uffff\6\2\1"+
            "\3\1\2\1\uffff\3\2\1\uffff\1\3\1\2\1\3\3\2\1\uffff\3\3\1\2\1"+
            "\uffff\1\2\1\3\1\2\1\uffff\3\2\1\3\2\2\2\3\3\2\1\3\1\2\1\uffff"+
            "\3\2\2\uffff\1\2\1\uffff\1\3\3\2\70\uffff\1\2\46\uffff\1\2\61"+
            "\uffff\1\2\3\uffff\1\2\61\uffff\1\2\3\uffff\1\2\27\uffff\1\2"+
            "\4\uffff\1\2",
            "\1\4\32\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff"+
            "\1\6\14\uffff\1\6\27\uffff\1\6\32\uffff\1\6\33\uffff\1\6\127"+
            "\uffff\1\6\11\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1"+
            "\6\31\uffff\1\4",
            "\1\4\32\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff"+
            "\1\6\14\uffff\1\6\27\uffff\1\6\32\uffff\1\6\33\uffff\1\6\127"+
            "\uffff\1\6\11\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1"+
            "\6\31\uffff\1\4",
            "\1\4\32\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff"+
            "\1\6\14\uffff\1\6\27\uffff\1\6\32\uffff\1\6\33\uffff\1\6\127"+
            "\uffff\1\6\11\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1"+
            "\6\31\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "78:22: ( aliasList | columnNameTypeList )";
        }
    }
    static final String DFA7_eotS =
        "\u00e2\uffff";
    static final String DFA7_eofS =
        "\1\uffff\3\4\u00de\uffff";
    static final String DFA7_minS =
        "\1\33\3\12\26\uffff\1\7\51\uffff\1\7\51\uffff\1\7\163\uffff";
    static final String DFA7_maxS =
        "\1\u022e\3\u0154\26\uffff\1\u022e\51\uffff\1\u022e\51\uffff\1\u022e"+
        "\163\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\27\uffff\1\2\u00c5\uffff";
    static final String DFA7_specialS =
        "\u00e2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\4\2\2\3\1\2\1\uffff\1\2\2\3\1\2\1\3\2\2\5\3\2\2\1\3\2\2"+
            "\2\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\1\3"+
            "\1\2\1\3\1\uffff\1\3\1\uffff\3\3\1\2\1\uffff\1\2\1\3\3\2\1\3"+
            "\2\2\1\3\3\2\1\3\3\2\1\uffff\1\2\1\3\1\2\1\3\2\2\1\uffff\1\2"+
            "\1\uffff\1\2\2\uffff\1\2\1\3\2\2\1\uffff\1\3\1\uffff\2\3\4\2"+
            "\1\3\2\uffff\2\3\2\2\1\uffff\1\3\1\uffff\1\2\3\3\1\uffff\2\2"+
            "\1\uffff\2\3\2\2\1\3\3\2\3\3\1\uffff\2\3\3\2\1\uffff\4\2\2\3"+
            "\1\uffff\1\2\1\3\3\2\1\3\5\2\2\uffff\5\2\1\uffff\2\2\1\uffff"+
            "\1\2\1\3\2\2\1\uffff\1\2\1\3\1\2\1\3\1\2\2\uffff\1\2\1\uffff"+
            "\3\3\2\2\1\uffff\2\2\1\uffff\1\3\2\2\1\3\1\2\3\uffff\1\2\1\3"+
            "\1\2\1\3\2\2\1\3\1\2\1\3\3\2\1\uffff\2\3\10\2\1\3\1\2\2\3\2"+
            "\2\1\uffff\3\3\3\2\1\uffff\4\2\1\3\5\2\1\3\4\2\1\uffff\6\2\1"+
            "\3\1\2\1\uffff\3\2\1\uffff\1\3\1\2\1\3\3\2\1\uffff\3\3\1\2\1"+
            "\uffff\1\2\1\3\1\2\1\uffff\3\2\1\3\2\2\2\3\3\2\1\3\1\2\1\uffff"+
            "\3\2\2\uffff\1\2\1\uffff\1\3\3\2\70\uffff\1\2\46\uffff\1\2\61"+
            "\uffff\1\2\3\uffff\1\2\61\uffff\1\2\3\uffff\1\2\27\uffff\1\2"+
            "\4\uffff\1\2",
            "\1\4\32\uffff\1\34\6\uffff\3\34\11\uffff\1\34\1\4\30\uffff"+
            "\2\34\2\uffff\1\34\13\uffff\1\4\1\34\10\uffff\1\4\16\uffff\1"+
            "\34\6\uffff\1\4\4\uffff\1\4\1\uffff\1\4\13\uffff\1\4\1\34\1"+
            "\4\13\uffff\1\4\4\uffff\1\4\11\uffff\1\32\5\uffff\1\4\21\uffff"+
            "\1\4\32\uffff\1\4\1\uffff\1\4\22\uffff\1\4\4\uffff\1\4\12\uffff"+
            "\1\34\1\uffff\1\4\7\uffff\2\34\7\uffff\2\34\13\uffff\1\4\1\34"+
            "\16\uffff\1\34\4\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
            "\1\4\32\uffff\1\34\6\uffff\3\34\11\uffff\1\34\1\4\30\uffff"+
            "\2\34\2\uffff\1\34\13\uffff\1\4\1\34\10\uffff\1\4\16\uffff\1"+
            "\34\6\uffff\1\4\4\uffff\1\4\1\uffff\1\4\13\uffff\1\4\1\34\1"+
            "\4\13\uffff\1\4\4\uffff\1\4\11\uffff\1\104\5\uffff\1\4\21\uffff"+
            "\1\4\32\uffff\1\4\1\uffff\1\4\22\uffff\1\4\4\uffff\1\4\12\uffff"+
            "\1\34\1\uffff\1\4\7\uffff\2\34\7\uffff\2\34\13\uffff\1\4\1\34"+
            "\16\uffff\1\34\4\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
            "\1\4\32\uffff\1\34\6\uffff\3\34\11\uffff\1\34\1\4\30\uffff"+
            "\2\34\2\uffff\1\34\13\uffff\1\4\1\34\10\uffff\1\4\16\uffff\1"+
            "\34\6\uffff\1\4\4\uffff\1\4\1\uffff\1\4\13\uffff\1\4\1\34\1"+
            "\4\13\uffff\1\4\4\uffff\1\4\11\uffff\1\156\5\uffff\1\4\21\uffff"+
            "\1\4\32\uffff\1\4\1\uffff\1\4\22\uffff\1\4\4\uffff\1\4\12\uffff"+
            "\1\34\1\uffff\1\4\7\uffff\2\34\7\uffff\2\34\13\uffff\1\4\1\34"+
            "\16\uffff\1\34\4\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\6\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\24\4\1\uffff"+
            "\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff"+
            "\4\4\1\uffff\20\4\1\uffff\6\4\1\uffff\1\4\1\uffff\1\4\2\uffff"+
            "\4\4\1\uffff\12\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
            "\24\4\1\uffff\6\4\1\uffff\13\4\1\uffff\6\4\1\uffff\2\4\1\uffff"+
            "\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff\2\4\1\uffff\5\4\3\uffff"+
            "\14\4\1\uffff\20\4\1\uffff\6\4\1\uffff\17\4\1\uffff\10\4\1\uffff"+
            "\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15\4\1\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\34\1\uffff\1\4\2\uffff"+
            "\1\4\2\uffff\2\4\7\uffff\5\4\41\uffff\1\4\46\uffff\1\4\61\uffff"+
            "\1\4\3\uffff\1\4\61\uffff\1\4\3\uffff\1\4\27\uffff\1\4\4\uffff"+
            "\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\6\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\24\4\1\uffff"+
            "\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff"+
            "\4\4\1\uffff\20\4\1\uffff\6\4\1\uffff\1\4\1\uffff\1\4\2\uffff"+
            "\4\4\1\uffff\12\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
            "\24\4\1\uffff\6\4\1\uffff\13\4\1\uffff\6\4\1\uffff\2\4\1\uffff"+
            "\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff\2\4\1\uffff\5\4\3\uffff"+
            "\14\4\1\uffff\20\4\1\uffff\6\4\1\uffff\17\4\1\uffff\10\4\1\uffff"+
            "\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15\4\1\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\34\1\uffff\1\4\2\uffff"+
            "\1\4\2\uffff\2\4\7\uffff\5\4\41\uffff\1\4\46\uffff\1\4\61\uffff"+
            "\1\4\3\uffff\1\4\61\uffff\1\4\3\uffff\1\4\27\uffff\1\4\4\uffff"+
            "\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\6\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\24\4\1\uffff"+
            "\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff"+
            "\4\4\1\uffff\20\4\1\uffff\6\4\1\uffff\1\4\1\uffff\1\4\2\uffff"+
            "\4\4\1\uffff\12\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
            "\24\4\1\uffff\6\4\1\uffff\13\4\1\uffff\6\4\1\uffff\2\4\1\uffff"+
            "\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff\2\4\1\uffff\5\4\3\uffff"+
            "\14\4\1\uffff\20\4\1\uffff\6\4\1\uffff\17\4\1\uffff\10\4\1\uffff"+
            "\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15\4\1\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\34\1\uffff\1\4\2\uffff"+
            "\1\4\2\uffff\2\4\7\uffff\5\4\41\uffff\1\4\46\uffff\1\4\61\uffff"+
            "\1\4\3\uffff\1\4\61\uffff\1\4\3\uffff\1\4\27\uffff\1\4\4\uffff"+
            "\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "78:65: ( aliasList | columnNameTypeList )";
        }
    }
    static final String DFA17_eotS =
        "\u02b9\uffff";
    static final String DFA17_eofS =
        "\2\uffff\3\5\4\uffff\4\5\5\uffff\3\5\7\uffff\1\5\1\uffff\2\5\u0299"+
        "\uffff";
    static final String DFA17_minS =
        "\1\7\1\uffff\3\4\4\uffff\4\4\5\uffff\3\4\7\uffff\1\4\1\uffff\2\4"+
        "\1\33\56\uffff\1\33\57\uffff\1\33\56\uffff\1\33\57\uffff\1\33\56"+
        "\uffff\1\33\56\uffff\1\33\56\uffff\1\33\56\uffff\1\33\56\uffff\1"+
        "\33\56\uffff\1\33\56\uffff\1\33\56\uffff\1\33\57\uffff\3\0\1\uffff"+
        "\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0"+
        "\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff"+
        "\3\0";
    static final String DFA17_maxS =
        "\1\u022e\1\uffff\3\u022e\4\uffff\4\u022e\5\uffff\3\u022e\7\uffff"+
        "\1\u022e\1\uffff\3\u022e\56\uffff\1\u022e\57\uffff\1\u022e\56\uffff"+
        "\1\u022e\57\uffff\1\u022e\56\uffff\1\u022e\56\uffff\1\u022e\56\uffff"+
        "\1\u022e\56\uffff\1\u022e\56\uffff\1\u022e\56\uffff\1\u022e\56\uffff"+
        "\1\u022e\56\uffff\1\u022e\57\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1"+
        "\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff"+
        "\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\u027f\uffff\1\1\3\uffff\1\1\3\uffff\1\1"+
        "\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff"+
        "\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff";
    static final String DFA17_specialS =
        "\1\0\37\uffff\1\1\56\uffff\1\2\57\uffff\1\3\56\uffff\1\4\57\uffff"+
        "\1\5\56\uffff\1\6\56\uffff\1\7\56\uffff\1\10\56\uffff\1\11\56\uffff"+
        "\1\12\56\uffff\1\13\56\uffff\1\14\56\uffff\1\15\57\uffff\1\16\1"+
        "\17\1\20\1\uffff\1\21\1\22\1\23\1\uffff\1\24\1\25\1\26\1\uffff\1"+
        "\27\1\30\1\31\1\uffff\1\32\1\33\1\34\1\uffff\1\35\1\36\1\37\1\uffff"+
        "\1\40\1\41\1\42\1\uffff\1\43\1\44\1\45\1\uffff\1\46\1\47\1\50\1"+
        "\uffff\1\51\1\52\1\53\1\uffff\1\54\1\55\1\56\1\uffff\1\57\1\60\1"+
        "\61\1\uffff\1\62\1\63\1\64}>";
    static final String[] DFA17_transitionS = {
            "\1\5\6\uffff\1\5\4\uffff\1\5\7\uffff\1\2\4\3\2\37\1\3\1\uffff"+
            "\1\3\1\24\1\37\1\3\1\37\2\3\1\37\3\34\1\37\2\3\1\37\2\3\2\5"+
            "\1\3\1\uffff\4\3\1\uffff\2\3\1\uffff\4\3\1\uffff\1\37\1\3\1"+
            "\37\1\uffff\1\37\1\uffff\1\11\1\13\1\37\1\3\1\uffff\1\3\1\4"+
            "\3\3\1\37\2\3\1\37\3\3\1\37\3\3\1\uffff\1\3\1\34\1\3\1\37\2"+
            "\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\36\2\3\1\uffff\1\37"+
            "\1\5\1\22\1\37\4\3\1\34\1\5\1\uffff\2\37\2\3\1\uffff\1\37\1"+
            "\uffff\1\3\2\37\1\34\1\uffff\2\3\1\5\2\37\2\3\1\37\3\3\1\37"+
            "\1\34\1\37\1\5\2\37\3\3\1\uffff\4\3\2\37\1\uffff\1\3\1\37\3"+
            "\3\1\37\5\3\1\uffff\1\5\5\3\1\uffff\2\3\1\uffff\1\3\1\37\2\3"+
            "\1\5\1\3\1\23\1\3\1\37\1\3\2\uffff\1\3\1\uffff\3\37\2\3\1\uffff"+
            "\2\3\1\uffff\1\37\2\3\1\37\1\3\3\uffff\1\3\1\37\1\3\1\37\2\3"+
            "\1\37\1\3\1\37\3\3\1\uffff\2\37\10\3\1\37\1\3\2\37\2\3\1\uffff"+
            "\3\37\3\3\1\uffff\4\3\1\37\5\3\1\34\4\3\1\uffff\6\3\1\37\1\3"+
            "\1\uffff\3\3\1\uffff\1\12\1\3\1\37\3\3\1\uffff\1\37\1\14\1\37"+
            "\1\3\1\uffff\1\3\1\37\1\3\1\uffff\3\3\1\37\2\3\2\37\3\3\1\37"+
            "\1\3\1\uffff\3\3\2\uffff\1\3\1\uffff\1\37\3\3\3\uffff\1\5\2"+
            "\uffff\1\5\2\uffff\2\5\7\uffff\1\1\4\5\41\uffff\1\3\46\uffff"+
            "\1\3\61\uffff\1\3\3\uffff\1\3\61\uffff\1\3\3\uffff\1\3\27\uffff"+
            "\1\3\4\uffff\1\3",
            "",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\40\2\uffff"+
            "\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5\1\uffff"+
            "\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff"+
            "\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4\5\1\uffff"+
            "\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13\5\1\uffff"+
            "\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff\12\5\2\uffff"+
            "\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff\26\5\1\uffff"+
            "\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff"+
            "\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff"+
            "\1\5\3\uffff\1\5\3\uffff\1\5\45\uffff\1\5\46\uffff\1\5\61\uffff"+
            "\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff\1\5\4\uffff"+
            "\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\117\2\uffff"+
            "\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5\1\uffff"+
            "\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff"+
            "\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4\5\1\uffff"+
            "\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13\5\1\uffff"+
            "\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff\12\5\2\uffff"+
            "\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff\26\5\1\uffff"+
            "\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff"+
            "\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff"+
            "\1\5\3\uffff\1\5\3\uffff\1\5\45\uffff\1\5\46\uffff\1\5\61\uffff"+
            "\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff\1\5\4\uffff"+
            "\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\177\2\uffff"+
            "\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5\1\uffff"+
            "\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff"+
            "\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4\5\1\uffff"+
            "\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13\5\1\uffff"+
            "\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff\12\5\2\uffff"+
            "\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff\26\5\1\uffff"+
            "\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff"+
            "\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff"+
            "\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff\1\5\43\uffff\1\5\46\uffff"+
            "\1\5\61\uffff\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff"+
            "\1\5\4\uffff\1\5",
            "",
            "",
            "",
            "",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u00ae\2"+
            "\uffff\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4"+
            "\5\1\uffff\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13"+
            "\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff"+
            "\12\5\2\uffff\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff"+
            "\26\5\1\uffff\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\45\uffff\1\5\46\uffff"+
            "\1\5\61\uffff\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff"+
            "\1\5\4\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u00de\2"+
            "\uffff\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4"+
            "\5\1\uffff\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13"+
            "\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff"+
            "\12\5\2\uffff\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff"+
            "\26\5\1\uffff\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff\1\5\43\uffff"+
            "\1\5\46\uffff\1\5\61\uffff\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff"+
            "\1\5\27\uffff\1\5\4\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u010d\2"+
            "\uffff\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4"+
            "\5\1\uffff\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13"+
            "\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff"+
            "\12\5\2\uffff\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff"+
            "\26\5\1\uffff\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\45\uffff\1\5\46\uffff"+
            "\1\5\61\uffff\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff"+
            "\1\5\4\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u013c\2"+
            "\uffff\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4"+
            "\5\1\uffff\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13"+
            "\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff"+
            "\12\5\2\uffff\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff"+
            "\26\5\1\uffff\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\45\uffff\1\5\46\uffff"+
            "\1\5\61\uffff\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff"+
            "\1\5\4\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u016b\2"+
            "\uffff\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4"+
            "\5\1\uffff\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13"+
            "\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff"+
            "\12\5\2\uffff\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff"+
            "\26\5\1\uffff\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\45\uffff\1\5\46\uffff"+
            "\1\5\61\uffff\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff"+
            "\1\5\4\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u019a\2"+
            "\uffff\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4"+
            "\5\1\uffff\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13"+
            "\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff"+
            "\12\5\2\uffff\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff"+
            "\26\5\1\uffff\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\45\uffff\1\5\46\uffff"+
            "\1\5\61\uffff\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff"+
            "\1\5\4\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u01c9\2"+
            "\uffff\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4"+
            "\5\1\uffff\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13"+
            "\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff"+
            "\12\5\2\uffff\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff"+
            "\26\5\1\uffff\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\45\uffff\1\5\46\uffff"+
            "\1\5\61\uffff\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff"+
            "\1\5\4\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u01f8\2"+
            "\uffff\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4"+
            "\5\1\uffff\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13"+
            "\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff"+
            "\12\5\2\uffff\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff"+
            "\26\5\1\uffff\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\45\uffff\1\5\46\uffff"+
            "\1\5\61\uffff\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff"+
            "\1\5\4\uffff\1\5",
            "",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u0227\2"+
            "\uffff\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4"+
            "\5\1\uffff\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13"+
            "\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff"+
            "\12\5\2\uffff\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff"+
            "\26\5\1\uffff\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\45\uffff\1\5\46\uffff"+
            "\1\5\61\uffff\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff"+
            "\1\5\4\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u0256\2"+
            "\uffff\2\5\1\uffff\2\5\1\uffff\32\5\2\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\2\5\1\uffff\4"+
            "\5\1\uffff\1\5\1\uffff\7\5\2\uffff\6\5\1\uffff\7\5\1\uffff\13"+
            "\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\11\5\1\uffff"+
            "\12\5\2\uffff\7\5\1\uffff\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff"+
            "\26\5\1\uffff\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff\7\5\1\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\45\uffff\1\5\46\uffff"+
            "\1\5\61\uffff\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff"+
            "\1\5\4\uffff\1\5",
            "\1\u0286\4\u0287\2\u0288\1\u0287\1\uffff\1\u0287\2\u0288\1"+
            "\u0287\1\u0288\2\u0287\5\u0288\2\u0287\1\u0288\2\u0287\2\uffff"+
            "\1\u0287\1\uffff\4\u0287\1\uffff\2\u0287\1\uffff\4\u0287\1\uffff"+
            "\1\u0288\1\u0287\1\u0288\1\uffff\1\u0288\1\uffff\3\u0288\1\u0287"+
            "\1\uffff\1\u0287\1\u0288\3\u0287\1\u0288\2\u0287\1\u0288\3\u0287"+
            "\1\u0288\3\u0287\1\uffff\1\u0287\1\u0288\1\u0287\1\u0288\2\u0287"+
            "\1\uffff\1\u0287\1\uffff\1\u0287\2\uffff\1\u0287\1\u0288\2\u0287"+
            "\1\uffff\1\u0288\1\uffff\2\u0288\4\u0287\1\u0288\2\uffff\2\u0288"+
            "\2\u0287\1\uffff\1\u0288\1\uffff\1\u0287\3\u0288\1\uffff\2\u0287"+
            "\1\uffff\2\u0288\2\u0287\1\u0288\3\u0287\3\u0288\1\uffff\2\u0288"+
            "\3\u0287\1\uffff\4\u0287\2\u0288\1\uffff\1\u0287\1\u0288\3\u0287"+
            "\1\u0288\5\u0287\2\uffff\5\u0287\1\uffff\2\u0287\1\uffff\1\u0287"+
            "\1\u0288\2\u0287\1\uffff\1\u0287\1\u0288\1\u0287\1\u0288\1\u0287"+
            "\2\uffff\1\u0287\1\uffff\3\u0288\2\u0287\1\uffff\2\u0287\1\uffff"+
            "\1\u0288\2\u0287\1\u0288\1\u0287\3\uffff\1\u0287\1\u0288\1\u0287"+
            "\1\u0288\2\u0287\1\u0288\1\u0287\1\u0288\3\u0287\1\uffff\2\u0288"+
            "\10\u0287\1\u0288\1\u0287\2\u0288\2\u0287\1\uffff\3\u0288\3"+
            "\u0287\1\uffff\4\u0287\1\u0288\5\u0287\1\u0288\4\u0287\1\uffff"+
            "\6\u0287\1\u0288\1\u0287\1\uffff\3\u0287\1\uffff\1\u0288\1\u0287"+
            "\1\u0288\3\u0287\1\uffff\3\u0288\1\u0287\1\uffff\1\u0287\1\u0288"+
            "\1\u0287\1\uffff\3\u0287\1\u0288\2\u0287\2\u0288\3\u0287\1\u0288"+
            "\1\u0287\1\uffff\3\u0287\2\uffff\1\u0287\1\uffff\1\u0288\3\u0287"+
            "\22\uffff\1\u0285\45\uffff\1\u0287\46\uffff\1\u0287\61\uffff"+
            "\1\u0287\3\uffff\1\u0287\61\uffff\1\u0287\3\uffff\1\u0287\27"+
            "\uffff\1\u0287\4\uffff\1\u0287",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u028a\4\u028b\2\u028c\1\u028b\1\uffff\1\u028b\2\u028c\1"+
            "\u028b\1\u028c\2\u028b\5\u028c\2\u028b\1\u028c\2\u028b\2\uffff"+
            "\1\u028b\1\uffff\4\u028b\1\uffff\2\u028b\1\uffff\4\u028b\1\uffff"+
            "\1\u028c\1\u028b\1\u028c\1\uffff\1\u028c\1\uffff\3\u028c\1\u028b"+
            "\1\uffff\1\u028b\1\u028c\3\u028b\1\u028c\2\u028b\1\u028c\3\u028b"+
            "\1\u028c\3\u028b\1\uffff\1\u028b\1\u028c\1\u028b\1\u028c\2\u028b"+
            "\1\uffff\1\u028b\1\uffff\1\u028b\2\uffff\1\u028b\1\u028c\2\u028b"+
            "\1\uffff\1\u028c\1\uffff\2\u028c\4\u028b\1\u028c\2\uffff\2\u028c"+
            "\2\u028b\1\uffff\1\u028c\1\uffff\1\u028b\3\u028c\1\uffff\2\u028b"+
            "\1\uffff\2\u028c\2\u028b\1\u028c\3\u028b\3\u028c\1\uffff\2\u028c"+
            "\3\u028b\1\uffff\4\u028b\2\u028c\1\uffff\1\u028b\1\u028c\3\u028b"+
            "\1\u028c\5\u028b\2\uffff\5\u028b\1\uffff\2\u028b\1\uffff\1\u028b"+
            "\1\u028c\2\u028b\1\uffff\1\u028b\1\u028c\1\u028b\1\u028c\1\u028b"+
            "\2\uffff\1\u028b\1\uffff\3\u028c\2\u028b\1\uffff\2\u028b\1\uffff"+
            "\1\u028c\2\u028b\1\u028c\1\u028b\3\uffff\1\u028b\1\u028c\1\u028b"+
            "\1\u028c\2\u028b\1\u028c\1\u028b\1\u028c\3\u028b\1\uffff\2\u028c"+
            "\10\u028b\1\u028c\1\u028b\2\u028c\2\u028b\1\uffff\3\u028c\3"+
            "\u028b\1\uffff\4\u028b\1\u028c\5\u028b\1\u028c\4\u028b\1\uffff"+
            "\6\u028b\1\u028c\1\u028b\1\uffff\3\u028b\1\uffff\1\u028c\1\u028b"+
            "\1\u028c\3\u028b\1\uffff\3\u028c\1\u028b\1\uffff\1\u028b\1\u028c"+
            "\1\u028b\1\uffff\3\u028b\1\u028c\2\u028b\2\u028c\3\u028b\1\u028c"+
            "\1\u028b\1\uffff\3\u028b\2\uffff\1\u028b\1\uffff\1\u028c\3\u028b"+
            "\22\uffff\1\u0289\45\uffff\1\u028b\46\uffff\1\u028b\61\uffff"+
            "\1\u028b\3\uffff\1\u028b\61\uffff\1\u028b\3\uffff\1\u028b\27"+
            "\uffff\1\u028b\4\uffff\1\u028b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u028e\4\u028f\2\u0290\1\u028f\1\uffff\1\u028f\2\u0290\1"+
            "\u028f\1\u0290\2\u028f\5\u0290\2\u028f\1\u0290\2\u028f\2\uffff"+
            "\1\u028f\1\uffff\4\u028f\1\uffff\2\u028f\1\uffff\4\u028f\1\uffff"+
            "\1\u0290\1\u028f\1\u0290\1\uffff\1\u0290\1\uffff\3\u0290\1\u028f"+
            "\1\uffff\1\u028f\1\u0290\3\u028f\1\u0290\2\u028f\1\u0290\3\u028f"+
            "\1\u0290\3\u028f\1\uffff\1\u028f\1\u0290\1\u028f\1\u0290\2\u028f"+
            "\1\uffff\1\u028f\1\uffff\1\u028f\2\uffff\1\u028f\1\u0290\2\u028f"+
            "\1\uffff\1\u0290\1\uffff\2\u0290\4\u028f\1\u0290\2\uffff\2\u0290"+
            "\2\u028f\1\uffff\1\u0290\1\uffff\1\u028f\3\u0290\1\uffff\2\u028f"+
            "\1\uffff\2\u0290\2\u028f\1\u0290\3\u028f\3\u0290\1\uffff\2\u0290"+
            "\3\u028f\1\uffff\4\u028f\2\u0290\1\uffff\1\u028f\1\u0290\3\u028f"+
            "\1\u0290\5\u028f\2\uffff\5\u028f\1\uffff\2\u028f\1\uffff\1\u028f"+
            "\1\u0290\2\u028f\1\uffff\1\u028f\1\u0290\1\u028f\1\u0290\1\u028f"+
            "\2\uffff\1\u028f\1\uffff\3\u0290\2\u028f\1\uffff\2\u028f\1\uffff"+
            "\1\u0290\2\u028f\1\u0290\1\u028f\3\uffff\1\u028f\1\u0290\1\u028f"+
            "\1\u0290\2\u028f\1\u0290\1\u028f\1\u0290\3\u028f\1\uffff\2\u0290"+
            "\10\u028f\1\u0290\1\u028f\2\u0290\2\u028f\1\uffff\3\u0290\3"+
            "\u028f\1\uffff\4\u028f\1\u0290\5\u028f\1\u0290\4\u028f\1\uffff"+
            "\6\u028f\1\u0290\1\u028f\1\uffff\3\u028f\1\uffff\1\u0290\1\u028f"+
            "\1\u0290\3\u028f\1\uffff\3\u0290\1\u028f\1\uffff\1\u028f\1\u0290"+
            "\1\u028f\1\uffff\3\u028f\1\u0290\2\u028f\2\u0290\3\u028f\1\u0290"+
            "\1\u028f\1\uffff\3\u028f\2\uffff\1\u028f\1\uffff\1\u0290\3\u028f"+
            "\22\uffff\1\u028d\45\uffff\1\u028f\46\uffff\1\u028f\61\uffff"+
            "\1\u028f\3\uffff\1\u028f\61\uffff\1\u028f\3\uffff\1\u028f\27"+
            "\uffff\1\u028f\4\uffff\1\u028f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0292\4\u0293\2\u0294\1\u0293\1\uffff\1\u0293\2\u0294\1"+
            "\u0293\1\u0294\2\u0293\5\u0294\2\u0293\1\u0294\2\u0293\2\uffff"+
            "\1\u0293\1\uffff\4\u0293\1\uffff\2\u0293\1\uffff\4\u0293\1\uffff"+
            "\1\u0294\1\u0293\1\u0294\1\uffff\1\u0294\1\uffff\3\u0294\1\u0293"+
            "\1\uffff\1\u0293\1\u0294\3\u0293\1\u0294\2\u0293\1\u0294\3\u0293"+
            "\1\u0294\3\u0293\1\uffff\1\u0293\1\u0294\1\u0293\1\u0294\2\u0293"+
            "\1\uffff\1\u0293\1\uffff\1\u0293\2\uffff\1\u0293\1\u0294\2\u0293"+
            "\1\uffff\1\u0294\1\uffff\2\u0294\4\u0293\1\u0294\2\uffff\2\u0294"+
            "\2\u0293\1\uffff\1\u0294\1\uffff\1\u0293\3\u0294\1\uffff\2\u0293"+
            "\1\uffff\2\u0294\2\u0293\1\u0294\3\u0293\3\u0294\1\uffff\2\u0294"+
            "\3\u0293\1\uffff\4\u0293\2\u0294\1\uffff\1\u0293\1\u0294\3\u0293"+
            "\1\u0294\5\u0293\2\uffff\5\u0293\1\uffff\2\u0293\1\uffff\1\u0293"+
            "\1\u0294\2\u0293\1\uffff\1\u0293\1\u0294\1\u0293\1\u0294\1\u0293"+
            "\2\uffff\1\u0293\1\uffff\3\u0294\2\u0293\1\uffff\2\u0293\1\uffff"+
            "\1\u0294\2\u0293\1\u0294\1\u0293\3\uffff\1\u0293\1\u0294\1\u0293"+
            "\1\u0294\2\u0293\1\u0294\1\u0293\1\u0294\3\u0293\1\uffff\2\u0294"+
            "\10\u0293\1\u0294\1\u0293\2\u0294\2\u0293\1\uffff\3\u0294\3"+
            "\u0293\1\uffff\4\u0293\1\u0294\5\u0293\1\u0294\4\u0293\1\uffff"+
            "\6\u0293\1\u0294\1\u0293\1\uffff\3\u0293\1\uffff\1\u0294\1\u0293"+
            "\1\u0294\3\u0293\1\uffff\3\u0294\1\u0293\1\uffff\1\u0293\1\u0294"+
            "\1\u0293\1\uffff\3\u0293\1\u0294\2\u0293\2\u0294\3\u0293\1\u0294"+
            "\1\u0293\1\uffff\3\u0293\2\uffff\1\u0293\1\uffff\1\u0294\3\u0293"+
            "\22\uffff\1\u0291\45\uffff\1\u0293\46\uffff\1\u0293\61\uffff"+
            "\1\u0293\3\uffff\1\u0293\61\uffff\1\u0293\3\uffff\1\u0293\27"+
            "\uffff\1\u0293\4\uffff\1\u0293",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0296\4\u0297\2\u0298\1\u0297\1\uffff\1\u0297\2\u0298\1"+
            "\u0297\1\u0298\2\u0297\5\u0298\2\u0297\1\u0298\2\u0297\2\uffff"+
            "\1\u0297\1\uffff\4\u0297\1\uffff\2\u0297\1\uffff\4\u0297\1\uffff"+
            "\1\u0298\1\u0297\1\u0298\1\uffff\1\u0298\1\uffff\3\u0298\1\u0297"+
            "\1\uffff\1\u0297\1\u0298\3\u0297\1\u0298\2\u0297\1\u0298\3\u0297"+
            "\1\u0298\3\u0297\1\uffff\1\u0297\1\u0298\1\u0297\1\u0298\2\u0297"+
            "\1\uffff\1\u0297\1\uffff\1\u0297\2\uffff\1\u0297\1\u0298\2\u0297"+
            "\1\uffff\1\u0298\1\uffff\2\u0298\4\u0297\1\u0298\2\uffff\2\u0298"+
            "\2\u0297\1\uffff\1\u0298\1\uffff\1\u0297\3\u0298\1\uffff\2\u0297"+
            "\1\uffff\2\u0298\2\u0297\1\u0298\3\u0297\3\u0298\1\uffff\2\u0298"+
            "\3\u0297\1\uffff\4\u0297\2\u0298\1\uffff\1\u0297\1\u0298\3\u0297"+
            "\1\u0298\5\u0297\2\uffff\5\u0297\1\uffff\2\u0297\1\uffff\1\u0297"+
            "\1\u0298\2\u0297\1\uffff\1\u0297\1\u0298\1\u0297\1\u0298\1\u0297"+
            "\2\uffff\1\u0297\1\uffff\3\u0298\2\u0297\1\uffff\2\u0297\1\uffff"+
            "\1\u0298\2\u0297\1\u0298\1\u0297\3\uffff\1\u0297\1\u0298\1\u0297"+
            "\1\u0298\2\u0297\1\u0298\1\u0297\1\u0298\3\u0297\1\uffff\2\u0298"+
            "\10\u0297\1\u0298\1\u0297\2\u0298\2\u0297\1\uffff\3\u0298\3"+
            "\u0297\1\uffff\4\u0297\1\u0298\5\u0297\1\u0298\4\u0297\1\uffff"+
            "\6\u0297\1\u0298\1\u0297\1\uffff\3\u0297\1\uffff\1\u0298\1\u0297"+
            "\1\u0298\3\u0297\1\uffff\3\u0298\1\u0297\1\uffff\1\u0297\1\u0298"+
            "\1\u0297\1\uffff\3\u0297\1\u0298\2\u0297\2\u0298\3\u0297\1\u0298"+
            "\1\u0297\1\uffff\3\u0297\2\uffff\1\u0297\1\uffff\1\u0298\3\u0297"+
            "\22\uffff\1\u0295\45\uffff\1\u0297\46\uffff\1\u0297\61\uffff"+
            "\1\u0297\3\uffff\1\u0297\61\uffff\1\u0297\3\uffff\1\u0297\27"+
            "\uffff\1\u0297\4\uffff\1\u0297",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u029a\4\u029b\2\u029c\1\u029b\1\uffff\1\u029b\2\u029c\1"+
            "\u029b\1\u029c\2\u029b\5\u029c\2\u029b\1\u029c\2\u029b\2\uffff"+
            "\1\u029b\1\uffff\4\u029b\1\uffff\2\u029b\1\uffff\4\u029b\1\uffff"+
            "\1\u029c\1\u029b\1\u029c\1\uffff\1\u029c\1\uffff\3\u029c\1\u029b"+
            "\1\uffff\1\u029b\1\u029c\3\u029b\1\u029c\2\u029b\1\u029c\3\u029b"+
            "\1\u029c\3\u029b\1\uffff\1\u029b\1\u029c\1\u029b\1\u029c\2\u029b"+
            "\1\uffff\1\u029b\1\uffff\1\u029b\2\uffff\1\u029b\1\u029c\2\u029b"+
            "\1\uffff\1\u029c\1\uffff\2\u029c\4\u029b\1\u029c\2\uffff\2\u029c"+
            "\2\u029b\1\uffff\1\u029c\1\uffff\1\u029b\3\u029c\1\uffff\2\u029b"+
            "\1\uffff\2\u029c\2\u029b\1\u029c\3\u029b\3\u029c\1\uffff\2\u029c"+
            "\3\u029b\1\uffff\4\u029b\2\u029c\1\uffff\1\u029b\1\u029c\3\u029b"+
            "\1\u029c\5\u029b\2\uffff\5\u029b\1\uffff\2\u029b\1\uffff\1\u029b"+
            "\1\u029c\2\u029b\1\uffff\1\u029b\1\u029c\1\u029b\1\u029c\1\u029b"+
            "\2\uffff\1\u029b\1\uffff\3\u029c\2\u029b\1\uffff\2\u029b\1\uffff"+
            "\1\u029c\2\u029b\1\u029c\1\u029b\3\uffff\1\u029b\1\u029c\1\u029b"+
            "\1\u029c\2\u029b\1\u029c\1\u029b\1\u029c\3\u029b\1\uffff\2\u029c"+
            "\10\u029b\1\u029c\1\u029b\2\u029c\2\u029b\1\uffff\3\u029c\3"+
            "\u029b\1\uffff\4\u029b\1\u029c\5\u029b\1\u029c\4\u029b\1\uffff"+
            "\6\u029b\1\u029c\1\u029b\1\uffff\3\u029b\1\uffff\1\u029c\1\u029b"+
            "\1\u029c\3\u029b\1\uffff\3\u029c\1\u029b\1\uffff\1\u029b\1\u029c"+
            "\1\u029b\1\uffff\3\u029b\1\u029c\2\u029b\2\u029c\3\u029b\1\u029c"+
            "\1\u029b\1\uffff\3\u029b\2\uffff\1\u029b\1\uffff\1\u029c\3\u029b"+
            "\22\uffff\1\u0299\45\uffff\1\u029b\46\uffff\1\u029b\61\uffff"+
            "\1\u029b\3\uffff\1\u029b\61\uffff\1\u029b\3\uffff\1\u029b\27"+
            "\uffff\1\u029b\4\uffff\1\u029b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u029e\4\u029f\2\u02a0\1\u029f\1\uffff\1\u029f\2\u02a0\1"+
            "\u029f\1\u02a0\2\u029f\5\u02a0\2\u029f\1\u02a0\2\u029f\2\uffff"+
            "\1\u029f\1\uffff\4\u029f\1\uffff\2\u029f\1\uffff\4\u029f\1\uffff"+
            "\1\u02a0\1\u029f\1\u02a0\1\uffff\1\u02a0\1\uffff\3\u02a0\1\u029f"+
            "\1\uffff\1\u029f\1\u02a0\3\u029f\1\u02a0\2\u029f\1\u02a0\3\u029f"+
            "\1\u02a0\3\u029f\1\uffff\1\u029f\1\u02a0\1\u029f\1\u02a0\2\u029f"+
            "\1\uffff\1\u029f\1\uffff\1\u029f\2\uffff\1\u029f\1\u02a0\2\u029f"+
            "\1\uffff\1\u02a0\1\uffff\2\u02a0\4\u029f\1\u02a0\2\uffff\2\u02a0"+
            "\2\u029f\1\uffff\1\u02a0\1\uffff\1\u029f\3\u02a0\1\uffff\2\u029f"+
            "\1\uffff\2\u02a0\2\u029f\1\u02a0\3\u029f\3\u02a0\1\uffff\2\u02a0"+
            "\3\u029f\1\uffff\4\u029f\2\u02a0\1\uffff\1\u029f\1\u02a0\3\u029f"+
            "\1\u02a0\5\u029f\2\uffff\5\u029f\1\uffff\2\u029f\1\uffff\1\u029f"+
            "\1\u02a0\2\u029f\1\uffff\1\u029f\1\u02a0\1\u029f\1\u02a0\1\u029f"+
            "\2\uffff\1\u029f\1\uffff\3\u02a0\2\u029f\1\uffff\2\u029f\1\uffff"+
            "\1\u02a0\2\u029f\1\u02a0\1\u029f\3\uffff\1\u029f\1\u02a0\1\u029f"+
            "\1\u02a0\2\u029f\1\u02a0\1\u029f\1\u02a0\3\u029f\1\uffff\2\u02a0"+
            "\10\u029f\1\u02a0\1\u029f\2\u02a0\2\u029f\1\uffff\3\u02a0\3"+
            "\u029f\1\uffff\4\u029f\1\u02a0\5\u029f\1\u02a0\4\u029f\1\uffff"+
            "\6\u029f\1\u02a0\1\u029f\1\uffff\3\u029f\1\uffff\1\u02a0\1\u029f"+
            "\1\u02a0\3\u029f\1\uffff\3\u02a0\1\u029f\1\uffff\1\u029f\1\u02a0"+
            "\1\u029f\1\uffff\3\u029f\1\u02a0\2\u029f\2\u02a0\3\u029f\1\u02a0"+
            "\1\u029f\1\uffff\3\u029f\2\uffff\1\u029f\1\uffff\1\u02a0\3\u029f"+
            "\22\uffff\1\u029d\45\uffff\1\u029f\46\uffff\1\u029f\61\uffff"+
            "\1\u029f\3\uffff\1\u029f\61\uffff\1\u029f\3\uffff\1\u029f\27"+
            "\uffff\1\u029f\4\uffff\1\u029f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02a2\4\u02a3\2\u02a4\1\u02a3\1\uffff\1\u02a3\2\u02a4\1"+
            "\u02a3\1\u02a4\2\u02a3\5\u02a4\2\u02a3\1\u02a4\2\u02a3\2\uffff"+
            "\1\u02a3\1\uffff\4\u02a3\1\uffff\2\u02a3\1\uffff\4\u02a3\1\uffff"+
            "\1\u02a4\1\u02a3\1\u02a4\1\uffff\1\u02a4\1\uffff\3\u02a4\1\u02a3"+
            "\1\uffff\1\u02a3\1\u02a4\3\u02a3\1\u02a4\2\u02a3\1\u02a4\3\u02a3"+
            "\1\u02a4\3\u02a3\1\uffff\1\u02a3\1\u02a4\1\u02a3\1\u02a4\2\u02a3"+
            "\1\uffff\1\u02a3\1\uffff\1\u02a3\2\uffff\1\u02a3\1\u02a4\2\u02a3"+
            "\1\uffff\1\u02a4\1\uffff\2\u02a4\4\u02a3\1\u02a4\2\uffff\2\u02a4"+
            "\2\u02a3\1\uffff\1\u02a4\1\uffff\1\u02a3\3\u02a4\1\uffff\2\u02a3"+
            "\1\uffff\2\u02a4\2\u02a3\1\u02a4\3\u02a3\3\u02a4\1\uffff\2\u02a4"+
            "\3\u02a3\1\uffff\4\u02a3\2\u02a4\1\uffff\1\u02a3\1\u02a4\3\u02a3"+
            "\1\u02a4\5\u02a3\2\uffff\5\u02a3\1\uffff\2\u02a3\1\uffff\1\u02a3"+
            "\1\u02a4\2\u02a3\1\uffff\1\u02a3\1\u02a4\1\u02a3\1\u02a4\1\u02a3"+
            "\2\uffff\1\u02a3\1\uffff\3\u02a4\2\u02a3\1\uffff\2\u02a3\1\uffff"+
            "\1\u02a4\2\u02a3\1\u02a4\1\u02a3\3\uffff\1\u02a3\1\u02a4\1\u02a3"+
            "\1\u02a4\2\u02a3\1\u02a4\1\u02a3\1\u02a4\3\u02a3\1\uffff\2\u02a4"+
            "\10\u02a3\1\u02a4\1\u02a3\2\u02a4\2\u02a3\1\uffff\3\u02a4\3"+
            "\u02a3\1\uffff\4\u02a3\1\u02a4\5\u02a3\1\u02a4\4\u02a3\1\uffff"+
            "\6\u02a3\1\u02a4\1\u02a3\1\uffff\3\u02a3\1\uffff\1\u02a4\1\u02a3"+
            "\1\u02a4\3\u02a3\1\uffff\3\u02a4\1\u02a3\1\uffff\1\u02a3\1\u02a4"+
            "\1\u02a3\1\uffff\3\u02a3\1\u02a4\2\u02a3\2\u02a4\3\u02a3\1\u02a4"+
            "\1\u02a3\1\uffff\3\u02a3\2\uffff\1\u02a3\1\uffff\1\u02a4\3\u02a3"+
            "\22\uffff\1\u02a1\45\uffff\1\u02a3\46\uffff\1\u02a3\61\uffff"+
            "\1\u02a3\3\uffff\1\u02a3\61\uffff\1\u02a3\3\uffff\1\u02a3\27"+
            "\uffff\1\u02a3\4\uffff\1\u02a3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02a6\4\u02a7\2\u02a8\1\u02a7\1\uffff\1\u02a7\2\u02a8\1"+
            "\u02a7\1\u02a8\2\u02a7\5\u02a8\2\u02a7\1\u02a8\2\u02a7\2\uffff"+
            "\1\u02a7\1\uffff\4\u02a7\1\uffff\2\u02a7\1\uffff\4\u02a7\1\uffff"+
            "\1\u02a8\1\u02a7\1\u02a8\1\uffff\1\u02a8\1\uffff\3\u02a8\1\u02a7"+
            "\1\uffff\1\u02a7\1\u02a8\3\u02a7\1\u02a8\2\u02a7\1\u02a8\3\u02a7"+
            "\1\u02a8\3\u02a7\1\uffff\1\u02a7\1\u02a8\1\u02a7\1\u02a8\2\u02a7"+
            "\1\uffff\1\u02a7\1\uffff\1\u02a7\2\uffff\1\u02a7\1\u02a8\2\u02a7"+
            "\1\uffff\1\u02a8\1\uffff\2\u02a8\4\u02a7\1\u02a8\2\uffff\2\u02a8"+
            "\2\u02a7\1\uffff\1\u02a8\1\uffff\1\u02a7\3\u02a8\1\uffff\2\u02a7"+
            "\1\uffff\2\u02a8\2\u02a7\1\u02a8\3\u02a7\3\u02a8\1\uffff\2\u02a8"+
            "\3\u02a7\1\uffff\4\u02a7\2\u02a8\1\uffff\1\u02a7\1\u02a8\3\u02a7"+
            "\1\u02a8\5\u02a7\2\uffff\5\u02a7\1\uffff\2\u02a7\1\uffff\1\u02a7"+
            "\1\u02a8\2\u02a7\1\uffff\1\u02a7\1\u02a8\1\u02a7\1\u02a8\1\u02a7"+
            "\2\uffff\1\u02a7\1\uffff\3\u02a8\2\u02a7\1\uffff\2\u02a7\1\uffff"+
            "\1\u02a8\2\u02a7\1\u02a8\1\u02a7\3\uffff\1\u02a7\1\u02a8\1\u02a7"+
            "\1\u02a8\2\u02a7\1\u02a8\1\u02a7\1\u02a8\3\u02a7\1\uffff\2\u02a8"+
            "\10\u02a7\1\u02a8\1\u02a7\2\u02a8\2\u02a7\1\uffff\3\u02a8\3"+
            "\u02a7\1\uffff\4\u02a7\1\u02a8\5\u02a7\1\u02a8\4\u02a7\1\uffff"+
            "\6\u02a7\1\u02a8\1\u02a7\1\uffff\3\u02a7\1\uffff\1\u02a8\1\u02a7"+
            "\1\u02a8\3\u02a7\1\uffff\3\u02a8\1\u02a7\1\uffff\1\u02a7\1\u02a8"+
            "\1\u02a7\1\uffff\3\u02a7\1\u02a8\2\u02a7\2\u02a8\3\u02a7\1\u02a8"+
            "\1\u02a7\1\uffff\3\u02a7\2\uffff\1\u02a7\1\uffff\1\u02a8\3\u02a7"+
            "\22\uffff\1\u02a5\45\uffff\1\u02a7\46\uffff\1\u02a7\61\uffff"+
            "\1\u02a7\3\uffff\1\u02a7\61\uffff\1\u02a7\3\uffff\1\u02a7\27"+
            "\uffff\1\u02a7\4\uffff\1\u02a7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02aa\4\u02ab\2\u02ac\1\u02ab\1\uffff\1\u02ab\2\u02ac\1"+
            "\u02ab\1\u02ac\2\u02ab\5\u02ac\2\u02ab\1\u02ac\2\u02ab\2\uffff"+
            "\1\u02ab\1\uffff\4\u02ab\1\uffff\2\u02ab\1\uffff\4\u02ab\1\uffff"+
            "\1\u02ac\1\u02ab\1\u02ac\1\uffff\1\u02ac\1\uffff\3\u02ac\1\u02ab"+
            "\1\uffff\1\u02ab\1\u02ac\3\u02ab\1\u02ac\2\u02ab\1\u02ac\3\u02ab"+
            "\1\u02ac\3\u02ab\1\uffff\1\u02ab\1\u02ac\1\u02ab\1\u02ac\2\u02ab"+
            "\1\uffff\1\u02ab\1\uffff\1\u02ab\2\uffff\1\u02ab\1\u02ac\2\u02ab"+
            "\1\uffff\1\u02ac\1\uffff\2\u02ac\4\u02ab\1\u02ac\2\uffff\2\u02ac"+
            "\2\u02ab\1\uffff\1\u02ac\1\uffff\1\u02ab\3\u02ac\1\uffff\2\u02ab"+
            "\1\uffff\2\u02ac\2\u02ab\1\u02ac\3\u02ab\3\u02ac\1\uffff\2\u02ac"+
            "\3\u02ab\1\uffff\4\u02ab\2\u02ac\1\uffff\1\u02ab\1\u02ac\3\u02ab"+
            "\1\u02ac\5\u02ab\2\uffff\5\u02ab\1\uffff\2\u02ab\1\uffff\1\u02ab"+
            "\1\u02ac\2\u02ab\1\uffff\1\u02ab\1\u02ac\1\u02ab\1\u02ac\1\u02ab"+
            "\2\uffff\1\u02ab\1\uffff\3\u02ac\2\u02ab\1\uffff\2\u02ab\1\uffff"+
            "\1\u02ac\2\u02ab\1\u02ac\1\u02ab\3\uffff\1\u02ab\1\u02ac\1\u02ab"+
            "\1\u02ac\2\u02ab\1\u02ac\1\u02ab\1\u02ac\3\u02ab\1\uffff\2\u02ac"+
            "\10\u02ab\1\u02ac\1\u02ab\2\u02ac\2\u02ab\1\uffff\3\u02ac\3"+
            "\u02ab\1\uffff\4\u02ab\1\u02ac\5\u02ab\1\u02ac\4\u02ab\1\uffff"+
            "\6\u02ab\1\u02ac\1\u02ab\1\uffff\3\u02ab\1\uffff\1\u02ac\1\u02ab"+
            "\1\u02ac\3\u02ab\1\uffff\3\u02ac\1\u02ab\1\uffff\1\u02ab\1\u02ac"+
            "\1\u02ab\1\uffff\3\u02ab\1\u02ac\2\u02ab\2\u02ac\3\u02ab\1\u02ac"+
            "\1\u02ab\1\uffff\3\u02ab\2\uffff\1\u02ab\1\uffff\1\u02ac\3\u02ab"+
            "\22\uffff\1\u02a9\45\uffff\1\u02ab\46\uffff\1\u02ab\61\uffff"+
            "\1\u02ab\3\uffff\1\u02ab\61\uffff\1\u02ab\3\uffff\1\u02ab\27"+
            "\uffff\1\u02ab\4\uffff\1\u02ab",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02ae\4\u02af\2\u02b0\1\u02af\1\uffff\1\u02af\2\u02b0\1"+
            "\u02af\1\u02b0\2\u02af\5\u02b0\2\u02af\1\u02b0\2\u02af\2\uffff"+
            "\1\u02af\1\uffff\4\u02af\1\uffff\2\u02af\1\uffff\4\u02af\1\uffff"+
            "\1\u02b0\1\u02af\1\u02b0\1\uffff\1\u02b0\1\uffff\3\u02b0\1\u02af"+
            "\1\uffff\1\u02af\1\u02b0\3\u02af\1\u02b0\2\u02af\1\u02b0\3\u02af"+
            "\1\u02b0\3\u02af\1\uffff\1\u02af\1\u02b0\1\u02af\1\u02b0\2\u02af"+
            "\1\uffff\1\u02af\1\uffff\1\u02af\2\uffff\1\u02af\1\u02b0\2\u02af"+
            "\1\uffff\1\u02b0\1\uffff\2\u02b0\4\u02af\1\u02b0\2\uffff\2\u02b0"+
            "\2\u02af\1\uffff\1\u02b0\1\uffff\1\u02af\3\u02b0\1\uffff\2\u02af"+
            "\1\uffff\2\u02b0\2\u02af\1\u02b0\3\u02af\3\u02b0\1\uffff\2\u02b0"+
            "\3\u02af\1\uffff\4\u02af\2\u02b0\1\uffff\1\u02af\1\u02b0\3\u02af"+
            "\1\u02b0\5\u02af\2\uffff\5\u02af\1\uffff\2\u02af\1\uffff\1\u02af"+
            "\1\u02b0\2\u02af\1\uffff\1\u02af\1\u02b0\1\u02af\1\u02b0\1\u02af"+
            "\2\uffff\1\u02af\1\uffff\3\u02b0\2\u02af\1\uffff\2\u02af\1\uffff"+
            "\1\u02b0\2\u02af\1\u02b0\1\u02af\3\uffff\1\u02af\1\u02b0\1\u02af"+
            "\1\u02b0\2\u02af\1\u02b0\1\u02af\1\u02b0\3\u02af\1\uffff\2\u02b0"+
            "\10\u02af\1\u02b0\1\u02af\2\u02b0\2\u02af\1\uffff\3\u02b0\3"+
            "\u02af\1\uffff\4\u02af\1\u02b0\5\u02af\1\u02b0\4\u02af\1\uffff"+
            "\6\u02af\1\u02b0\1\u02af\1\uffff\3\u02af\1\uffff\1\u02b0\1\u02af"+
            "\1\u02b0\3\u02af\1\uffff\3\u02b0\1\u02af\1\uffff\1\u02af\1\u02b0"+
            "\1\u02af\1\uffff\3\u02af\1\u02b0\2\u02af\2\u02b0\3\u02af\1\u02b0"+
            "\1\u02af\1\uffff\3\u02af\2\uffff\1\u02af\1\uffff\1\u02b0\3\u02af"+
            "\22\uffff\1\u02ad\45\uffff\1\u02af\46\uffff\1\u02af\61\uffff"+
            "\1\u02af\3\uffff\1\u02af\61\uffff\1\u02af\3\uffff\1\u02af\27"+
            "\uffff\1\u02af\4\uffff\1\u02af",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02b2\4\u02b3\2\u02b4\1\u02b3\1\uffff\1\u02b3\2\u02b4\1"+
            "\u02b3\1\u02b4\2\u02b3\5\u02b4\2\u02b3\1\u02b4\2\u02b3\2\uffff"+
            "\1\u02b3\1\uffff\4\u02b3\1\uffff\2\u02b3\1\uffff\4\u02b3\1\uffff"+
            "\1\u02b4\1\u02b3\1\u02b4\1\uffff\1\u02b4\1\uffff\3\u02b4\1\u02b3"+
            "\1\uffff\1\u02b3\1\u02b4\3\u02b3\1\u02b4\2\u02b3\1\u02b4\3\u02b3"+
            "\1\u02b4\3\u02b3\1\uffff\1\u02b3\1\u02b4\1\u02b3\1\u02b4\2\u02b3"+
            "\1\uffff\1\u02b3\1\uffff\1\u02b3\2\uffff\1\u02b3\1\u02b4\2\u02b3"+
            "\1\uffff\1\u02b4\1\uffff\2\u02b4\4\u02b3\1\u02b4\2\uffff\2\u02b4"+
            "\2\u02b3\1\uffff\1\u02b4\1\uffff\1\u02b3\3\u02b4\1\uffff\2\u02b3"+
            "\1\uffff\2\u02b4\2\u02b3\1\u02b4\3\u02b3\3\u02b4\1\uffff\2\u02b4"+
            "\3\u02b3\1\uffff\4\u02b3\2\u02b4\1\uffff\1\u02b3\1\u02b4\3\u02b3"+
            "\1\u02b4\5\u02b3\2\uffff\5\u02b3\1\uffff\2\u02b3\1\uffff\1\u02b3"+
            "\1\u02b4\2\u02b3\1\uffff\1\u02b3\1\u02b4\1\u02b3\1\u02b4\1\u02b3"+
            "\2\uffff\1\u02b3\1\uffff\3\u02b4\2\u02b3\1\uffff\2\u02b3\1\uffff"+
            "\1\u02b4\2\u02b3\1\u02b4\1\u02b3\3\uffff\1\u02b3\1\u02b4\1\u02b3"+
            "\1\u02b4\2\u02b3\1\u02b4\1\u02b3\1\u02b4\3\u02b3\1\uffff\2\u02b4"+
            "\10\u02b3\1\u02b4\1\u02b3\2\u02b4\2\u02b3\1\uffff\3\u02b4\3"+
            "\u02b3\1\uffff\4\u02b3\1\u02b4\5\u02b3\1\u02b4\4\u02b3\1\uffff"+
            "\6\u02b3\1\u02b4\1\u02b3\1\uffff\3\u02b3\1\uffff\1\u02b4\1\u02b3"+
            "\1\u02b4\3\u02b3\1\uffff\3\u02b4\1\u02b3\1\uffff\1\u02b3\1\u02b4"+
            "\1\u02b3\1\uffff\3\u02b3\1\u02b4\2\u02b3\2\u02b4\3\u02b3\1\u02b4"+
            "\1\u02b3\1\uffff\3\u02b3\2\uffff\1\u02b3\1\uffff\1\u02b4\3\u02b3"+
            "\22\uffff\1\u02b1\45\uffff\1\u02b3\46\uffff\1\u02b3\61\uffff"+
            "\1\u02b3\3\uffff\1\u02b3\61\uffff\1\u02b3\3\uffff\1\u02b3\27"+
            "\uffff\1\u02b3\4\uffff\1\u02b3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02b6\4\u02b7\2\u02b8\1\u02b7\1\uffff\1\u02b7\2\u02b8\1"+
            "\u02b7\1\u02b8\2\u02b7\5\u02b8\2\u02b7\1\u02b8\2\u02b7\2\uffff"+
            "\1\u02b7\1\uffff\4\u02b7\1\uffff\2\u02b7\1\uffff\4\u02b7\1\uffff"+
            "\1\u02b8\1\u02b7\1\u02b8\1\uffff\1\u02b8\1\uffff\3\u02b8\1\u02b7"+
            "\1\uffff\1\u02b7\1\u02b8\3\u02b7\1\u02b8\2\u02b7\1\u02b8\3\u02b7"+
            "\1\u02b8\3\u02b7\1\uffff\1\u02b7\1\u02b8\1\u02b7\1\u02b8\2\u02b7"+
            "\1\uffff\1\u02b7\1\uffff\1\u02b7\2\uffff\1\u02b7\1\u02b8\2\u02b7"+
            "\1\uffff\1\u02b8\1\uffff\2\u02b8\4\u02b7\1\u02b8\2\uffff\2\u02b8"+
            "\2\u02b7\1\uffff\1\u02b8\1\uffff\1\u02b7\3\u02b8\1\uffff\2\u02b7"+
            "\1\uffff\2\u02b8\2\u02b7\1\u02b8\3\u02b7\3\u02b8\1\uffff\2\u02b8"+
            "\3\u02b7\1\uffff\4\u02b7\2\u02b8\1\uffff\1\u02b7\1\u02b8\3\u02b7"+
            "\1\u02b8\5\u02b7\2\uffff\5\u02b7\1\uffff\2\u02b7\1\uffff\1\u02b7"+
            "\1\u02b8\2\u02b7\1\uffff\1\u02b7\1\u02b8\1\u02b7\1\u02b8\1\u02b7"+
            "\2\uffff\1\u02b7\1\uffff\3\u02b8\2\u02b7\1\uffff\2\u02b7\1\uffff"+
            "\1\u02b8\2\u02b7\1\u02b8\1\u02b7\3\uffff\1\u02b7\1\u02b8\1\u02b7"+
            "\1\u02b8\2\u02b7\1\u02b8\1\u02b7\1\u02b8\3\u02b7\1\uffff\2\u02b8"+
            "\10\u02b7\1\u02b8\1\u02b7\2\u02b8\2\u02b7\1\uffff\3\u02b8\3"+
            "\u02b7\1\uffff\4\u02b7\1\u02b8\5\u02b7\1\u02b8\4\u02b7\1\uffff"+
            "\6\u02b7\1\u02b8\1\u02b7\1\uffff\3\u02b7\1\uffff\1\u02b8\1\u02b7"+
            "\1\u02b8\3\u02b7\1\uffff\3\u02b8\1\u02b7\1\uffff\1\u02b7\1\u02b8"+
            "\1\u02b7\1\uffff\3\u02b7\1\u02b8\2\u02b7\2\u02b8\3\u02b7\1\u02b8"+
            "\1\u02b7\1\uffff\3\u02b7\2\uffff\1\u02b7\1\uffff\1\u02b8\3\u02b7"+
            "\22\uffff\1\u02b5\45\uffff\1\u02b7\46\uffff\1\u02b7\61\uffff"+
            "\1\u02b7\3\uffff\1\u02b7\61\uffff\1\u02b7\3\uffff\1\u02b7\27"+
            "\uffff\1\u02b7\4\uffff\1\u02b7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "126:1: selectItem : ( ( tableAllColumns )=> tableAllColumns -> ^( TOK_SELEXPR tableAllColumns ) | ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR expression ( identifier )* ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_0==STAR) && (synpred1_SelectClauseParser())) {s = 1;}

                        else if ( (LA17_0==Identifier) ) {s = 2;}

                        else if ( ((LA17_0 >= KW_ABORT && LA17_0 <= KW_AFTER)||LA17_0==KW_ANALYZE||LA17_0==KW_ARCHIVE||LA17_0==KW_ASC||(LA17_0 >= KW_AUTOCOMMIT && LA17_0 <= KW_BEFORE)||(LA17_0 >= KW_BUCKET && LA17_0 <= KW_BUCKETS)||(LA17_0 >= KW_CACHE && LA17_0 <= KW_CASCADE)||LA17_0==KW_CHANGE||(LA17_0 >= KW_CLUSTER && LA17_0 <= KW_COLLECTION)||(LA17_0 >= KW_COLUMNS && LA17_0 <= KW_COMMENT)||(LA17_0 >= KW_COMPACT && LA17_0 <= KW_CONCATENATE)||LA17_0==KW_CONTINUE||LA17_0==KW_DATA||LA17_0==KW_DATABASES||(LA17_0 >= KW_DATETIME && LA17_0 <= KW_DBPROPERTIES)||(LA17_0 >= KW_DEFERRED && LA17_0 <= KW_DEFINED)||(LA17_0 >= KW_DELIMITED && LA17_0 <= KW_DESC)||(LA17_0 >= KW_DIRECTORIES && LA17_0 <= KW_DISABLE)||LA17_0==KW_DISTRIBUTE||LA17_0==KW_DOW||(LA17_0 >= KW_DUMP && LA17_0 <= KW_ELEM_TYPE)||LA17_0==KW_ENABLE||LA17_0==KW_ESCAPED||LA17_0==KW_EXCLUSIVE||(LA17_0 >= KW_EXPLAIN && LA17_0 <= KW_EXPORT)||(LA17_0 >= KW_FIELDS && LA17_0 <= KW_FIRST)||(LA17_0 >= KW_FORMAT && LA17_0 <= KW_FORMATTED)||LA17_0==KW_FUNCTIONS||(LA17_0 >= KW_HOUR && LA17_0 <= KW_IDXPROPERTIES)||(LA17_0 >= KW_INDEX && LA17_0 <= KW_INDEXES)||(LA17_0 >= KW_INPATH && LA17_0 <= KW_INPUTFORMAT)||(LA17_0 >= KW_ISOLATION && LA17_0 <= KW_JAR)||(LA17_0 >= KW_KEY && LA17_0 <= KW_LAST)||LA17_0==KW_LEVEL||(LA17_0 >= KW_LIMIT && LA17_0 <= KW_LOAD)||(LA17_0 >= KW_LOCATION && LA17_0 <= KW_LONG)||(LA17_0 >= KW_MAPJOIN && LA17_0 <= KW_METADATA)||(LA17_0 >= KW_MINUTE && LA17_0 <= KW_MONTH)||LA17_0==KW_MSCK||(LA17_0 >= KW_NORELY && LA17_0 <= KW_NOSCAN)||LA17_0==KW_NOVALIDATE||LA17_0==KW_NULLS||LA17_0==KW_OFFSET||LA17_0==KW_OPTION||(LA17_0 >= KW_OUTPUTDRIVER && LA17_0 <= KW_OUTPUTFORMAT)||(LA17_0 >= KW_OVERWRITE && LA17_0 <= KW_OWNER)||(LA17_0 >= KW_PARTITIONED && LA17_0 <= KW_PARTITIONS)||LA17_0==KW_PLUS||LA17_0==KW_PRETTY||LA17_0==KW_PRINCIPALS||(LA17_0 >= KW_PURGE && LA17_0 <= KW_QUARTER)||LA17_0==KW_READ||(LA17_0 >= KW_REBUILD && LA17_0 <= KW_RECORDWRITER)||(LA17_0 >= KW_RELOAD && LA17_0 <= KW_RESTRICT)||LA17_0==KW_REWRITE||(LA17_0 >= KW_ROLE && LA17_0 <= KW_ROLES)||(LA17_0 >= KW_SCHEMA && LA17_0 <= KW_SECOND)||(LA17_0 >= KW_SEMI && LA17_0 <= KW_SERVER)||(LA17_0 >= KW_SETS && LA17_0 <= KW_SKEWED)||(LA17_0 >= KW_SNAPSHOT && LA17_0 <= KW_SSL)||(LA17_0 >= KW_STATISTICS && LA17_0 <= KW_STRUCT)||LA17_0==KW_TABLES||(LA17_0 >= KW_TBLPROPERTIES && LA17_0 <= KW_TERMINATED)||LA17_0==KW_TINYINT||(LA17_0 >= KW_TOUCH && LA17_0 <= KW_TRANSACTIONS)||LA17_0==KW_UNARCHIVE||LA17_0==KW_UNDO||LA17_0==KW_UNIONTYPE||(LA17_0 >= KW_UNLOCK && LA17_0 <= KW_UNSIGNED)||(LA17_0 >= KW_URI && LA17_0 <= KW_USE)||(LA17_0 >= KW_UTC && LA17_0 <= KW_VALIDATE)||LA17_0==KW_VALUE_TYPE||(LA17_0 >= KW_VIEW && LA17_0 <= KW_WEEK)||LA17_0==KW_WHILE||(LA17_0 >= KW_WORK && LA17_0 <= KW_YEAR)||LA17_0==KW_BATCH||LA17_0==KW_DAYOFWEEK||LA17_0==KW_HOLD_DDLTIME||LA17_0==KW_IGNORE||LA17_0==KW_NO_DROP||LA17_0==KW_OFFLINE||LA17_0==KW_PROTECTION||LA17_0==KW_READONLY) ) {s = 3;}

                        else if ( (LA17_0==KW_DATE) ) {s = 4;}

                        else if ( (LA17_0==BigintLiteral||LA17_0==CharSetName||LA17_0==DecimalLiteral||(LA17_0 >= KW_CASE && LA17_0 <= KW_CAST)||LA17_0==KW_EXTRACT||LA17_0==KW_FLOOR||LA17_0==KW_IF||LA17_0==KW_INTERVAL||LA17_0==KW_MAP||LA17_0==KW_NOT||LA17_0==LPAREN||LA17_0==MINUS||(LA17_0 >= Number && LA17_0 <= PLUS)||(LA17_0 >= SmallintLiteral && LA17_0 <= TinyintLiteral)) ) {s = 5;}

                        else if ( (LA17_0==KW_CURRENT_DATE) ) {s = 9;}

                        else if ( (LA17_0==KW_TIMESTAMP) ) {s = 10;}

                        else if ( (LA17_0==KW_CURRENT_TIMESTAMP) ) {s = 11;}

                        else if ( (LA17_0==KW_TRUE) ) {s = 12;}

                        else if ( (LA17_0==KW_FALSE) ) {s = 18;}

                        else if ( (LA17_0==KW_NULL) ) {s = 19;}

                        else if ( (LA17_0==KW_ARRAY) ) {s = 20;}

                        else if ( ((LA17_0 >= KW_BIGINT && LA17_0 <= KW_BOOLEAN)||LA17_0==KW_DOUBLE||LA17_0==KW_FLOAT||LA17_0==KW_GROUPING||LA17_0==KW_INT||LA17_0==KW_SMALLINT) ) {s = 28;}

                        else if ( (LA17_0==KW_EXISTS) ) {s = 30;}

                        else if ( ((LA17_0 >= KW_ALL && LA17_0 <= KW_ALTER)||LA17_0==KW_AS||LA17_0==KW_AUTHORIZATION||LA17_0==KW_BETWEEN||LA17_0==KW_BOTH||LA17_0==KW_BY||LA17_0==KW_CONSTRAINT||LA17_0==KW_CREATE||LA17_0==KW_CUBE||LA17_0==KW_CURSOR||LA17_0==KW_DECIMAL||LA17_0==KW_DELETE||LA17_0==KW_DESCRIBE||LA17_0==KW_DROP||LA17_0==KW_EXTERNAL||LA17_0==KW_FETCH||(LA17_0 >= KW_FOR && LA17_0 <= KW_FOREIGN)||LA17_0==KW_FULL||(LA17_0 >= KW_GRANT && LA17_0 <= KW_GROUP)||(LA17_0 >= KW_IMPORT && LA17_0 <= KW_IN)||LA17_0==KW_INNER||LA17_0==KW_INSERT||LA17_0==KW_INTERSECT||(LA17_0 >= KW_INTO && LA17_0 <= KW_IS)||(LA17_0 >= KW_LATERAL && LA17_0 <= KW_LEFT)||LA17_0==KW_LIKE||LA17_0==KW_LOCAL||LA17_0==KW_NONE||LA17_0==KW_OF||(LA17_0 >= KW_ORDER && LA17_0 <= KW_OUTER)||LA17_0==KW_PARTITION||LA17_0==KW_PERCENT||LA17_0==KW_PRIMARY||LA17_0==KW_PROCEDURE||LA17_0==KW_RANGE||LA17_0==KW_READS||(LA17_0 >= KW_REFERENCES && LA17_0 <= KW_REGEXP)||LA17_0==KW_REVOKE||(LA17_0 >= KW_RIGHT && LA17_0 <= KW_RLIKE)||(LA17_0 >= KW_ROLLUP && LA17_0 <= KW_ROWS)||LA17_0==KW_SET||LA17_0==KW_TABLE||LA17_0==KW_TO||LA17_0==KW_TRIGGER||LA17_0==KW_TRUNCATE||LA17_0==KW_UNION||LA17_0==KW_UPDATE||(LA17_0 >= KW_USER && LA17_0 <= KW_USING)||LA17_0==KW_VALUES||LA17_0==KW_WITH) ) {s = 31;}

                         
                        input.seek(index17_0);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_32 = input.LA(1);

                         
                        int index17_32 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_32==STAR) && (synpred1_SelectClauseParser())) {s = 645;}

                        else if ( (LA17_32==Identifier) ) {s = 646;}

                        else if ( ((LA17_32 >= KW_ABORT && LA17_32 <= KW_AFTER)||LA17_32==KW_ANALYZE||LA17_32==KW_ARCHIVE||LA17_32==KW_ASC||(LA17_32 >= KW_AUTOCOMMIT && LA17_32 <= KW_BEFORE)||(LA17_32 >= KW_BUCKET && LA17_32 <= KW_BUCKETS)||(LA17_32 >= KW_CACHE && LA17_32 <= KW_CASCADE)||LA17_32==KW_CHANGE||(LA17_32 >= KW_CLUSTER && LA17_32 <= KW_COLLECTION)||(LA17_32 >= KW_COLUMNS && LA17_32 <= KW_COMMENT)||(LA17_32 >= KW_COMPACT && LA17_32 <= KW_CONCATENATE)||LA17_32==KW_CONTINUE||LA17_32==KW_DATA||LA17_32==KW_DATABASES||(LA17_32 >= KW_DATETIME && LA17_32 <= KW_DBPROPERTIES)||(LA17_32 >= KW_DEFERRED && LA17_32 <= KW_DEFINED)||(LA17_32 >= KW_DELIMITED && LA17_32 <= KW_DESC)||(LA17_32 >= KW_DIRECTORIES && LA17_32 <= KW_DISABLE)||LA17_32==KW_DISTRIBUTE||LA17_32==KW_DOW||(LA17_32 >= KW_DUMP && LA17_32 <= KW_ELEM_TYPE)||LA17_32==KW_ENABLE||LA17_32==KW_ESCAPED||LA17_32==KW_EXCLUSIVE||(LA17_32 >= KW_EXPLAIN && LA17_32 <= KW_EXPORT)||(LA17_32 >= KW_FIELDS && LA17_32 <= KW_FIRST)||(LA17_32 >= KW_FORMAT && LA17_32 <= KW_FORMATTED)||LA17_32==KW_FUNCTIONS||(LA17_32 >= KW_HOUR && LA17_32 <= KW_IDXPROPERTIES)||(LA17_32 >= KW_INDEX && LA17_32 <= KW_INDEXES)||(LA17_32 >= KW_INPATH && LA17_32 <= KW_INPUTFORMAT)||(LA17_32 >= KW_ISOLATION && LA17_32 <= KW_JAR)||(LA17_32 >= KW_KEY && LA17_32 <= KW_LAST)||LA17_32==KW_LEVEL||(LA17_32 >= KW_LIMIT && LA17_32 <= KW_LOAD)||(LA17_32 >= KW_LOCATION && LA17_32 <= KW_LONG)||(LA17_32 >= KW_MAPJOIN && LA17_32 <= KW_METADATA)||(LA17_32 >= KW_MINUTE && LA17_32 <= KW_MONTH)||LA17_32==KW_MSCK||(LA17_32 >= KW_NORELY && LA17_32 <= KW_NOSCAN)||LA17_32==KW_NOVALIDATE||LA17_32==KW_NULLS||LA17_32==KW_OFFSET||LA17_32==KW_OPTION||(LA17_32 >= KW_OUTPUTDRIVER && LA17_32 <= KW_OUTPUTFORMAT)||(LA17_32 >= KW_OVERWRITE && LA17_32 <= KW_OWNER)||(LA17_32 >= KW_PARTITIONED && LA17_32 <= KW_PARTITIONS)||LA17_32==KW_PLUS||LA17_32==KW_PRETTY||LA17_32==KW_PRINCIPALS||(LA17_32 >= KW_PURGE && LA17_32 <= KW_QUARTER)||LA17_32==KW_READ||(LA17_32 >= KW_REBUILD && LA17_32 <= KW_RECORDWRITER)||(LA17_32 >= KW_RELOAD && LA17_32 <= KW_RESTRICT)||LA17_32==KW_REWRITE||(LA17_32 >= KW_ROLE && LA17_32 <= KW_ROLES)||(LA17_32 >= KW_SCHEMA && LA17_32 <= KW_SECOND)||(LA17_32 >= KW_SEMI && LA17_32 <= KW_SERVER)||(LA17_32 >= KW_SETS && LA17_32 <= KW_SKEWED)||(LA17_32 >= KW_SNAPSHOT && LA17_32 <= KW_SSL)||(LA17_32 >= KW_STATISTICS && LA17_32 <= KW_STRUCT)||LA17_32==KW_TABLES||(LA17_32 >= KW_TBLPROPERTIES && LA17_32 <= KW_TERMINATED)||LA17_32==KW_TINYINT||(LA17_32 >= KW_TOUCH && LA17_32 <= KW_TRANSACTIONS)||LA17_32==KW_UNARCHIVE||LA17_32==KW_UNDO||LA17_32==KW_UNIONTYPE||(LA17_32 >= KW_UNLOCK && LA17_32 <= KW_UNSIGNED)||(LA17_32 >= KW_URI && LA17_32 <= KW_USE)||(LA17_32 >= KW_UTC && LA17_32 <= KW_VALIDATE)||LA17_32==KW_VALUE_TYPE||(LA17_32 >= KW_VIEW && LA17_32 <= KW_WEEK)||LA17_32==KW_WHILE||(LA17_32 >= KW_WORK && LA17_32 <= KW_YEAR)||LA17_32==KW_BATCH||LA17_32==KW_DAYOFWEEK||LA17_32==KW_HOLD_DDLTIME||LA17_32==KW_IGNORE||LA17_32==KW_NO_DROP||LA17_32==KW_OFFLINE||LA17_32==KW_PROTECTION||LA17_32==KW_READONLY) ) {s = 647;}

                        else if ( ((LA17_32 >= KW_ALL && LA17_32 <= KW_ALTER)||(LA17_32 >= KW_ARRAY && LA17_32 <= KW_AS)||LA17_32==KW_AUTHORIZATION||(LA17_32 >= KW_BETWEEN && LA17_32 <= KW_BOTH)||LA17_32==KW_BY||LA17_32==KW_CONSTRAINT||LA17_32==KW_CREATE||LA17_32==KW_CUBE||(LA17_32 >= KW_CURRENT_DATE && LA17_32 <= KW_CURSOR)||LA17_32==KW_DATE||LA17_32==KW_DECIMAL||LA17_32==KW_DELETE||LA17_32==KW_DESCRIBE||LA17_32==KW_DOUBLE||LA17_32==KW_DROP||LA17_32==KW_EXISTS||LA17_32==KW_EXTERNAL||(LA17_32 >= KW_FALSE && LA17_32 <= KW_FETCH)||LA17_32==KW_FLOAT||(LA17_32 >= KW_FOR && LA17_32 <= KW_FOREIGN)||LA17_32==KW_FULL||(LA17_32 >= KW_GRANT && LA17_32 <= KW_GROUPING)||(LA17_32 >= KW_IMPORT && LA17_32 <= KW_IN)||LA17_32==KW_INNER||(LA17_32 >= KW_INSERT && LA17_32 <= KW_INTERSECT)||(LA17_32 >= KW_INTO && LA17_32 <= KW_IS)||(LA17_32 >= KW_LATERAL && LA17_32 <= KW_LEFT)||LA17_32==KW_LIKE||LA17_32==KW_LOCAL||LA17_32==KW_NONE||LA17_32==KW_NULL||LA17_32==KW_OF||(LA17_32 >= KW_ORDER && LA17_32 <= KW_OUTER)||LA17_32==KW_PARTITION||LA17_32==KW_PERCENT||LA17_32==KW_PRIMARY||LA17_32==KW_PROCEDURE||LA17_32==KW_RANGE||LA17_32==KW_READS||(LA17_32 >= KW_REFERENCES && LA17_32 <= KW_REGEXP)||LA17_32==KW_REVOKE||(LA17_32 >= KW_RIGHT && LA17_32 <= KW_RLIKE)||(LA17_32 >= KW_ROLLUP && LA17_32 <= KW_ROWS)||LA17_32==KW_SET||LA17_32==KW_SMALLINT||LA17_32==KW_TABLE||LA17_32==KW_TIMESTAMP||LA17_32==KW_TO||(LA17_32 >= KW_TRIGGER && LA17_32 <= KW_TRUNCATE)||LA17_32==KW_UNION||LA17_32==KW_UPDATE||(LA17_32 >= KW_USER && LA17_32 <= KW_USING)||LA17_32==KW_VALUES||LA17_32==KW_WITH) ) {s = 648;}

                         
                        input.seek(index17_32);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_79 = input.LA(1);

                         
                        int index17_79 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_79==STAR) && (synpred1_SelectClauseParser())) {s = 649;}

                        else if ( (LA17_79==Identifier) ) {s = 650;}

                        else if ( ((LA17_79 >= KW_ABORT && LA17_79 <= KW_AFTER)||LA17_79==KW_ANALYZE||LA17_79==KW_ARCHIVE||LA17_79==KW_ASC||(LA17_79 >= KW_AUTOCOMMIT && LA17_79 <= KW_BEFORE)||(LA17_79 >= KW_BUCKET && LA17_79 <= KW_BUCKETS)||(LA17_79 >= KW_CACHE && LA17_79 <= KW_CASCADE)||LA17_79==KW_CHANGE||(LA17_79 >= KW_CLUSTER && LA17_79 <= KW_COLLECTION)||(LA17_79 >= KW_COLUMNS && LA17_79 <= KW_COMMENT)||(LA17_79 >= KW_COMPACT && LA17_79 <= KW_CONCATENATE)||LA17_79==KW_CONTINUE||LA17_79==KW_DATA||LA17_79==KW_DATABASES||(LA17_79 >= KW_DATETIME && LA17_79 <= KW_DBPROPERTIES)||(LA17_79 >= KW_DEFERRED && LA17_79 <= KW_DEFINED)||(LA17_79 >= KW_DELIMITED && LA17_79 <= KW_DESC)||(LA17_79 >= KW_DIRECTORIES && LA17_79 <= KW_DISABLE)||LA17_79==KW_DISTRIBUTE||LA17_79==KW_DOW||(LA17_79 >= KW_DUMP && LA17_79 <= KW_ELEM_TYPE)||LA17_79==KW_ENABLE||LA17_79==KW_ESCAPED||LA17_79==KW_EXCLUSIVE||(LA17_79 >= KW_EXPLAIN && LA17_79 <= KW_EXPORT)||(LA17_79 >= KW_FIELDS && LA17_79 <= KW_FIRST)||(LA17_79 >= KW_FORMAT && LA17_79 <= KW_FORMATTED)||LA17_79==KW_FUNCTIONS||(LA17_79 >= KW_HOUR && LA17_79 <= KW_IDXPROPERTIES)||(LA17_79 >= KW_INDEX && LA17_79 <= KW_INDEXES)||(LA17_79 >= KW_INPATH && LA17_79 <= KW_INPUTFORMAT)||(LA17_79 >= KW_ISOLATION && LA17_79 <= KW_JAR)||(LA17_79 >= KW_KEY && LA17_79 <= KW_LAST)||LA17_79==KW_LEVEL||(LA17_79 >= KW_LIMIT && LA17_79 <= KW_LOAD)||(LA17_79 >= KW_LOCATION && LA17_79 <= KW_LONG)||(LA17_79 >= KW_MAPJOIN && LA17_79 <= KW_METADATA)||(LA17_79 >= KW_MINUTE && LA17_79 <= KW_MONTH)||LA17_79==KW_MSCK||(LA17_79 >= KW_NORELY && LA17_79 <= KW_NOSCAN)||LA17_79==KW_NOVALIDATE||LA17_79==KW_NULLS||LA17_79==KW_OFFSET||LA17_79==KW_OPTION||(LA17_79 >= KW_OUTPUTDRIVER && LA17_79 <= KW_OUTPUTFORMAT)||(LA17_79 >= KW_OVERWRITE && LA17_79 <= KW_OWNER)||(LA17_79 >= KW_PARTITIONED && LA17_79 <= KW_PARTITIONS)||LA17_79==KW_PLUS||LA17_79==KW_PRETTY||LA17_79==KW_PRINCIPALS||(LA17_79 >= KW_PURGE && LA17_79 <= KW_QUARTER)||LA17_79==KW_READ||(LA17_79 >= KW_REBUILD && LA17_79 <= KW_RECORDWRITER)||(LA17_79 >= KW_RELOAD && LA17_79 <= KW_RESTRICT)||LA17_79==KW_REWRITE||(LA17_79 >= KW_ROLE && LA17_79 <= KW_ROLES)||(LA17_79 >= KW_SCHEMA && LA17_79 <= KW_SECOND)||(LA17_79 >= KW_SEMI && LA17_79 <= KW_SERVER)||(LA17_79 >= KW_SETS && LA17_79 <= KW_SKEWED)||(LA17_79 >= KW_SNAPSHOT && LA17_79 <= KW_SSL)||(LA17_79 >= KW_STATISTICS && LA17_79 <= KW_STRUCT)||LA17_79==KW_TABLES||(LA17_79 >= KW_TBLPROPERTIES && LA17_79 <= KW_TERMINATED)||LA17_79==KW_TINYINT||(LA17_79 >= KW_TOUCH && LA17_79 <= KW_TRANSACTIONS)||LA17_79==KW_UNARCHIVE||LA17_79==KW_UNDO||LA17_79==KW_UNIONTYPE||(LA17_79 >= KW_UNLOCK && LA17_79 <= KW_UNSIGNED)||(LA17_79 >= KW_URI && LA17_79 <= KW_USE)||(LA17_79 >= KW_UTC && LA17_79 <= KW_VALIDATE)||LA17_79==KW_VALUE_TYPE||(LA17_79 >= KW_VIEW && LA17_79 <= KW_WEEK)||LA17_79==KW_WHILE||(LA17_79 >= KW_WORK && LA17_79 <= KW_YEAR)||LA17_79==KW_BATCH||LA17_79==KW_DAYOFWEEK||LA17_79==KW_HOLD_DDLTIME||LA17_79==KW_IGNORE||LA17_79==KW_NO_DROP||LA17_79==KW_OFFLINE||LA17_79==KW_PROTECTION||LA17_79==KW_READONLY) ) {s = 651;}

                        else if ( ((LA17_79 >= KW_ALL && LA17_79 <= KW_ALTER)||(LA17_79 >= KW_ARRAY && LA17_79 <= KW_AS)||LA17_79==KW_AUTHORIZATION||(LA17_79 >= KW_BETWEEN && LA17_79 <= KW_BOTH)||LA17_79==KW_BY||LA17_79==KW_CONSTRAINT||LA17_79==KW_CREATE||LA17_79==KW_CUBE||(LA17_79 >= KW_CURRENT_DATE && LA17_79 <= KW_CURSOR)||LA17_79==KW_DATE||LA17_79==KW_DECIMAL||LA17_79==KW_DELETE||LA17_79==KW_DESCRIBE||LA17_79==KW_DOUBLE||LA17_79==KW_DROP||LA17_79==KW_EXISTS||LA17_79==KW_EXTERNAL||(LA17_79 >= KW_FALSE && LA17_79 <= KW_FETCH)||LA17_79==KW_FLOAT||(LA17_79 >= KW_FOR && LA17_79 <= KW_FOREIGN)||LA17_79==KW_FULL||(LA17_79 >= KW_GRANT && LA17_79 <= KW_GROUPING)||(LA17_79 >= KW_IMPORT && LA17_79 <= KW_IN)||LA17_79==KW_INNER||(LA17_79 >= KW_INSERT && LA17_79 <= KW_INTERSECT)||(LA17_79 >= KW_INTO && LA17_79 <= KW_IS)||(LA17_79 >= KW_LATERAL && LA17_79 <= KW_LEFT)||LA17_79==KW_LIKE||LA17_79==KW_LOCAL||LA17_79==KW_NONE||LA17_79==KW_NULL||LA17_79==KW_OF||(LA17_79 >= KW_ORDER && LA17_79 <= KW_OUTER)||LA17_79==KW_PARTITION||LA17_79==KW_PERCENT||LA17_79==KW_PRIMARY||LA17_79==KW_PROCEDURE||LA17_79==KW_RANGE||LA17_79==KW_READS||(LA17_79 >= KW_REFERENCES && LA17_79 <= KW_REGEXP)||LA17_79==KW_REVOKE||(LA17_79 >= KW_RIGHT && LA17_79 <= KW_RLIKE)||(LA17_79 >= KW_ROLLUP && LA17_79 <= KW_ROWS)||LA17_79==KW_SET||LA17_79==KW_SMALLINT||LA17_79==KW_TABLE||LA17_79==KW_TIMESTAMP||LA17_79==KW_TO||(LA17_79 >= KW_TRIGGER && LA17_79 <= KW_TRUNCATE)||LA17_79==KW_UNION||LA17_79==KW_UPDATE||(LA17_79 >= KW_USER && LA17_79 <= KW_USING)||LA17_79==KW_VALUES||LA17_79==KW_WITH) ) {s = 652;}

                         
                        input.seek(index17_79);

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_127 = input.LA(1);

                         
                        int index17_127 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_127==STAR) && (synpred1_SelectClauseParser())) {s = 653;}

                        else if ( (LA17_127==Identifier) ) {s = 654;}

                        else if ( ((LA17_127 >= KW_ABORT && LA17_127 <= KW_AFTER)||LA17_127==KW_ANALYZE||LA17_127==KW_ARCHIVE||LA17_127==KW_ASC||(LA17_127 >= KW_AUTOCOMMIT && LA17_127 <= KW_BEFORE)||(LA17_127 >= KW_BUCKET && LA17_127 <= KW_BUCKETS)||(LA17_127 >= KW_CACHE && LA17_127 <= KW_CASCADE)||LA17_127==KW_CHANGE||(LA17_127 >= KW_CLUSTER && LA17_127 <= KW_COLLECTION)||(LA17_127 >= KW_COLUMNS && LA17_127 <= KW_COMMENT)||(LA17_127 >= KW_COMPACT && LA17_127 <= KW_CONCATENATE)||LA17_127==KW_CONTINUE||LA17_127==KW_DATA||LA17_127==KW_DATABASES||(LA17_127 >= KW_DATETIME && LA17_127 <= KW_DBPROPERTIES)||(LA17_127 >= KW_DEFERRED && LA17_127 <= KW_DEFINED)||(LA17_127 >= KW_DELIMITED && LA17_127 <= KW_DESC)||(LA17_127 >= KW_DIRECTORIES && LA17_127 <= KW_DISABLE)||LA17_127==KW_DISTRIBUTE||LA17_127==KW_DOW||(LA17_127 >= KW_DUMP && LA17_127 <= KW_ELEM_TYPE)||LA17_127==KW_ENABLE||LA17_127==KW_ESCAPED||LA17_127==KW_EXCLUSIVE||(LA17_127 >= KW_EXPLAIN && LA17_127 <= KW_EXPORT)||(LA17_127 >= KW_FIELDS && LA17_127 <= KW_FIRST)||(LA17_127 >= KW_FORMAT && LA17_127 <= KW_FORMATTED)||LA17_127==KW_FUNCTIONS||(LA17_127 >= KW_HOUR && LA17_127 <= KW_IDXPROPERTIES)||(LA17_127 >= KW_INDEX && LA17_127 <= KW_INDEXES)||(LA17_127 >= KW_INPATH && LA17_127 <= KW_INPUTFORMAT)||(LA17_127 >= KW_ISOLATION && LA17_127 <= KW_JAR)||(LA17_127 >= KW_KEY && LA17_127 <= KW_LAST)||LA17_127==KW_LEVEL||(LA17_127 >= KW_LIMIT && LA17_127 <= KW_LOAD)||(LA17_127 >= KW_LOCATION && LA17_127 <= KW_LONG)||(LA17_127 >= KW_MAPJOIN && LA17_127 <= KW_METADATA)||(LA17_127 >= KW_MINUTE && LA17_127 <= KW_MONTH)||LA17_127==KW_MSCK||(LA17_127 >= KW_NORELY && LA17_127 <= KW_NOSCAN)||LA17_127==KW_NOVALIDATE||LA17_127==KW_NULLS||LA17_127==KW_OFFSET||LA17_127==KW_OPTION||(LA17_127 >= KW_OUTPUTDRIVER && LA17_127 <= KW_OUTPUTFORMAT)||(LA17_127 >= KW_OVERWRITE && LA17_127 <= KW_OWNER)||(LA17_127 >= KW_PARTITIONED && LA17_127 <= KW_PARTITIONS)||LA17_127==KW_PLUS||LA17_127==KW_PRETTY||LA17_127==KW_PRINCIPALS||(LA17_127 >= KW_PURGE && LA17_127 <= KW_QUARTER)||LA17_127==KW_READ||(LA17_127 >= KW_REBUILD && LA17_127 <= KW_RECORDWRITER)||(LA17_127 >= KW_RELOAD && LA17_127 <= KW_RESTRICT)||LA17_127==KW_REWRITE||(LA17_127 >= KW_ROLE && LA17_127 <= KW_ROLES)||(LA17_127 >= KW_SCHEMA && LA17_127 <= KW_SECOND)||(LA17_127 >= KW_SEMI && LA17_127 <= KW_SERVER)||(LA17_127 >= KW_SETS && LA17_127 <= KW_SKEWED)||(LA17_127 >= KW_SNAPSHOT && LA17_127 <= KW_SSL)||(LA17_127 >= KW_STATISTICS && LA17_127 <= KW_STRUCT)||LA17_127==KW_TABLES||(LA17_127 >= KW_TBLPROPERTIES && LA17_127 <= KW_TERMINATED)||LA17_127==KW_TINYINT||(LA17_127 >= KW_TOUCH && LA17_127 <= KW_TRANSACTIONS)||LA17_127==KW_UNARCHIVE||LA17_127==KW_UNDO||LA17_127==KW_UNIONTYPE||(LA17_127 >= KW_UNLOCK && LA17_127 <= KW_UNSIGNED)||(LA17_127 >= KW_URI && LA17_127 <= KW_USE)||(LA17_127 >= KW_UTC && LA17_127 <= KW_VALIDATE)||LA17_127==KW_VALUE_TYPE||(LA17_127 >= KW_VIEW && LA17_127 <= KW_WEEK)||LA17_127==KW_WHILE||(LA17_127 >= KW_WORK && LA17_127 <= KW_YEAR)||LA17_127==KW_BATCH||LA17_127==KW_DAYOFWEEK||LA17_127==KW_HOLD_DDLTIME||LA17_127==KW_IGNORE||LA17_127==KW_NO_DROP||LA17_127==KW_OFFLINE||LA17_127==KW_PROTECTION||LA17_127==KW_READONLY) ) {s = 655;}

                        else if ( ((LA17_127 >= KW_ALL && LA17_127 <= KW_ALTER)||(LA17_127 >= KW_ARRAY && LA17_127 <= KW_AS)||LA17_127==KW_AUTHORIZATION||(LA17_127 >= KW_BETWEEN && LA17_127 <= KW_BOTH)||LA17_127==KW_BY||LA17_127==KW_CONSTRAINT||LA17_127==KW_CREATE||LA17_127==KW_CUBE||(LA17_127 >= KW_CURRENT_DATE && LA17_127 <= KW_CURSOR)||LA17_127==KW_DATE||LA17_127==KW_DECIMAL||LA17_127==KW_DELETE||LA17_127==KW_DESCRIBE||LA17_127==KW_DOUBLE||LA17_127==KW_DROP||LA17_127==KW_EXISTS||LA17_127==KW_EXTERNAL||(LA17_127 >= KW_FALSE && LA17_127 <= KW_FETCH)||LA17_127==KW_FLOAT||(LA17_127 >= KW_FOR && LA17_127 <= KW_FOREIGN)||LA17_127==KW_FULL||(LA17_127 >= KW_GRANT && LA17_127 <= KW_GROUPING)||(LA17_127 >= KW_IMPORT && LA17_127 <= KW_IN)||LA17_127==KW_INNER||(LA17_127 >= KW_INSERT && LA17_127 <= KW_INTERSECT)||(LA17_127 >= KW_INTO && LA17_127 <= KW_IS)||(LA17_127 >= KW_LATERAL && LA17_127 <= KW_LEFT)||LA17_127==KW_LIKE||LA17_127==KW_LOCAL||LA17_127==KW_NONE||LA17_127==KW_NULL||LA17_127==KW_OF||(LA17_127 >= KW_ORDER && LA17_127 <= KW_OUTER)||LA17_127==KW_PARTITION||LA17_127==KW_PERCENT||LA17_127==KW_PRIMARY||LA17_127==KW_PROCEDURE||LA17_127==KW_RANGE||LA17_127==KW_READS||(LA17_127 >= KW_REFERENCES && LA17_127 <= KW_REGEXP)||LA17_127==KW_REVOKE||(LA17_127 >= KW_RIGHT && LA17_127 <= KW_RLIKE)||(LA17_127 >= KW_ROLLUP && LA17_127 <= KW_ROWS)||LA17_127==KW_SET||LA17_127==KW_SMALLINT||LA17_127==KW_TABLE||LA17_127==KW_TIMESTAMP||LA17_127==KW_TO||(LA17_127 >= KW_TRIGGER && LA17_127 <= KW_TRUNCATE)||LA17_127==KW_UNION||LA17_127==KW_UPDATE||(LA17_127 >= KW_USER && LA17_127 <= KW_USING)||LA17_127==KW_VALUES||LA17_127==KW_WITH) ) {s = 656;}

                         
                        input.seek(index17_127);

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_174 = input.LA(1);

                         
                        int index17_174 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_174==STAR) && (synpred1_SelectClauseParser())) {s = 657;}

                        else if ( (LA17_174==Identifier) ) {s = 658;}

                        else if ( ((LA17_174 >= KW_ABORT && LA17_174 <= KW_AFTER)||LA17_174==KW_ANALYZE||LA17_174==KW_ARCHIVE||LA17_174==KW_ASC||(LA17_174 >= KW_AUTOCOMMIT && LA17_174 <= KW_BEFORE)||(LA17_174 >= KW_BUCKET && LA17_174 <= KW_BUCKETS)||(LA17_174 >= KW_CACHE && LA17_174 <= KW_CASCADE)||LA17_174==KW_CHANGE||(LA17_174 >= KW_CLUSTER && LA17_174 <= KW_COLLECTION)||(LA17_174 >= KW_COLUMNS && LA17_174 <= KW_COMMENT)||(LA17_174 >= KW_COMPACT && LA17_174 <= KW_CONCATENATE)||LA17_174==KW_CONTINUE||LA17_174==KW_DATA||LA17_174==KW_DATABASES||(LA17_174 >= KW_DATETIME && LA17_174 <= KW_DBPROPERTIES)||(LA17_174 >= KW_DEFERRED && LA17_174 <= KW_DEFINED)||(LA17_174 >= KW_DELIMITED && LA17_174 <= KW_DESC)||(LA17_174 >= KW_DIRECTORIES && LA17_174 <= KW_DISABLE)||LA17_174==KW_DISTRIBUTE||LA17_174==KW_DOW||(LA17_174 >= KW_DUMP && LA17_174 <= KW_ELEM_TYPE)||LA17_174==KW_ENABLE||LA17_174==KW_ESCAPED||LA17_174==KW_EXCLUSIVE||(LA17_174 >= KW_EXPLAIN && LA17_174 <= KW_EXPORT)||(LA17_174 >= KW_FIELDS && LA17_174 <= KW_FIRST)||(LA17_174 >= KW_FORMAT && LA17_174 <= KW_FORMATTED)||LA17_174==KW_FUNCTIONS||(LA17_174 >= KW_HOUR && LA17_174 <= KW_IDXPROPERTIES)||(LA17_174 >= KW_INDEX && LA17_174 <= KW_INDEXES)||(LA17_174 >= KW_INPATH && LA17_174 <= KW_INPUTFORMAT)||(LA17_174 >= KW_ISOLATION && LA17_174 <= KW_JAR)||(LA17_174 >= KW_KEY && LA17_174 <= KW_LAST)||LA17_174==KW_LEVEL||(LA17_174 >= KW_LIMIT && LA17_174 <= KW_LOAD)||(LA17_174 >= KW_LOCATION && LA17_174 <= KW_LONG)||(LA17_174 >= KW_MAPJOIN && LA17_174 <= KW_METADATA)||(LA17_174 >= KW_MINUTE && LA17_174 <= KW_MONTH)||LA17_174==KW_MSCK||(LA17_174 >= KW_NORELY && LA17_174 <= KW_NOSCAN)||LA17_174==KW_NOVALIDATE||LA17_174==KW_NULLS||LA17_174==KW_OFFSET||LA17_174==KW_OPTION||(LA17_174 >= KW_OUTPUTDRIVER && LA17_174 <= KW_OUTPUTFORMAT)||(LA17_174 >= KW_OVERWRITE && LA17_174 <= KW_OWNER)||(LA17_174 >= KW_PARTITIONED && LA17_174 <= KW_PARTITIONS)||LA17_174==KW_PLUS||LA17_174==KW_PRETTY||LA17_174==KW_PRINCIPALS||(LA17_174 >= KW_PURGE && LA17_174 <= KW_QUARTER)||LA17_174==KW_READ||(LA17_174 >= KW_REBUILD && LA17_174 <= KW_RECORDWRITER)||(LA17_174 >= KW_RELOAD && LA17_174 <= KW_RESTRICT)||LA17_174==KW_REWRITE||(LA17_174 >= KW_ROLE && LA17_174 <= KW_ROLES)||(LA17_174 >= KW_SCHEMA && LA17_174 <= KW_SECOND)||(LA17_174 >= KW_SEMI && LA17_174 <= KW_SERVER)||(LA17_174 >= KW_SETS && LA17_174 <= KW_SKEWED)||(LA17_174 >= KW_SNAPSHOT && LA17_174 <= KW_SSL)||(LA17_174 >= KW_STATISTICS && LA17_174 <= KW_STRUCT)||LA17_174==KW_TABLES||(LA17_174 >= KW_TBLPROPERTIES && LA17_174 <= KW_TERMINATED)||LA17_174==KW_TINYINT||(LA17_174 >= KW_TOUCH && LA17_174 <= KW_TRANSACTIONS)||LA17_174==KW_UNARCHIVE||LA17_174==KW_UNDO||LA17_174==KW_UNIONTYPE||(LA17_174 >= KW_UNLOCK && LA17_174 <= KW_UNSIGNED)||(LA17_174 >= KW_URI && LA17_174 <= KW_USE)||(LA17_174 >= KW_UTC && LA17_174 <= KW_VALIDATE)||LA17_174==KW_VALUE_TYPE||(LA17_174 >= KW_VIEW && LA17_174 <= KW_WEEK)||LA17_174==KW_WHILE||(LA17_174 >= KW_WORK && LA17_174 <= KW_YEAR)||LA17_174==KW_BATCH||LA17_174==KW_DAYOFWEEK||LA17_174==KW_HOLD_DDLTIME||LA17_174==KW_IGNORE||LA17_174==KW_NO_DROP||LA17_174==KW_OFFLINE||LA17_174==KW_PROTECTION||LA17_174==KW_READONLY) ) {s = 659;}

                        else if ( ((LA17_174 >= KW_ALL && LA17_174 <= KW_ALTER)||(LA17_174 >= KW_ARRAY && LA17_174 <= KW_AS)||LA17_174==KW_AUTHORIZATION||(LA17_174 >= KW_BETWEEN && LA17_174 <= KW_BOTH)||LA17_174==KW_BY||LA17_174==KW_CONSTRAINT||LA17_174==KW_CREATE||LA17_174==KW_CUBE||(LA17_174 >= KW_CURRENT_DATE && LA17_174 <= KW_CURSOR)||LA17_174==KW_DATE||LA17_174==KW_DECIMAL||LA17_174==KW_DELETE||LA17_174==KW_DESCRIBE||LA17_174==KW_DOUBLE||LA17_174==KW_DROP||LA17_174==KW_EXISTS||LA17_174==KW_EXTERNAL||(LA17_174 >= KW_FALSE && LA17_174 <= KW_FETCH)||LA17_174==KW_FLOAT||(LA17_174 >= KW_FOR && LA17_174 <= KW_FOREIGN)||LA17_174==KW_FULL||(LA17_174 >= KW_GRANT && LA17_174 <= KW_GROUPING)||(LA17_174 >= KW_IMPORT && LA17_174 <= KW_IN)||LA17_174==KW_INNER||(LA17_174 >= KW_INSERT && LA17_174 <= KW_INTERSECT)||(LA17_174 >= KW_INTO && LA17_174 <= KW_IS)||(LA17_174 >= KW_LATERAL && LA17_174 <= KW_LEFT)||LA17_174==KW_LIKE||LA17_174==KW_LOCAL||LA17_174==KW_NONE||LA17_174==KW_NULL||LA17_174==KW_OF||(LA17_174 >= KW_ORDER && LA17_174 <= KW_OUTER)||LA17_174==KW_PARTITION||LA17_174==KW_PERCENT||LA17_174==KW_PRIMARY||LA17_174==KW_PROCEDURE||LA17_174==KW_RANGE||LA17_174==KW_READS||(LA17_174 >= KW_REFERENCES && LA17_174 <= KW_REGEXP)||LA17_174==KW_REVOKE||(LA17_174 >= KW_RIGHT && LA17_174 <= KW_RLIKE)||(LA17_174 >= KW_ROLLUP && LA17_174 <= KW_ROWS)||LA17_174==KW_SET||LA17_174==KW_SMALLINT||LA17_174==KW_TABLE||LA17_174==KW_TIMESTAMP||LA17_174==KW_TO||(LA17_174 >= KW_TRIGGER && LA17_174 <= KW_TRUNCATE)||LA17_174==KW_UNION||LA17_174==KW_UPDATE||(LA17_174 >= KW_USER && LA17_174 <= KW_USING)||LA17_174==KW_VALUES||LA17_174==KW_WITH) ) {s = 660;}

                         
                        input.seek(index17_174);

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_222 = input.LA(1);

                         
                        int index17_222 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_222==STAR) && (synpred1_SelectClauseParser())) {s = 661;}

                        else if ( (LA17_222==Identifier) ) {s = 662;}

                        else if ( ((LA17_222 >= KW_ABORT && LA17_222 <= KW_AFTER)||LA17_222==KW_ANALYZE||LA17_222==KW_ARCHIVE||LA17_222==KW_ASC||(LA17_222 >= KW_AUTOCOMMIT && LA17_222 <= KW_BEFORE)||(LA17_222 >= KW_BUCKET && LA17_222 <= KW_BUCKETS)||(LA17_222 >= KW_CACHE && LA17_222 <= KW_CASCADE)||LA17_222==KW_CHANGE||(LA17_222 >= KW_CLUSTER && LA17_222 <= KW_COLLECTION)||(LA17_222 >= KW_COLUMNS && LA17_222 <= KW_COMMENT)||(LA17_222 >= KW_COMPACT && LA17_222 <= KW_CONCATENATE)||LA17_222==KW_CONTINUE||LA17_222==KW_DATA||LA17_222==KW_DATABASES||(LA17_222 >= KW_DATETIME && LA17_222 <= KW_DBPROPERTIES)||(LA17_222 >= KW_DEFERRED && LA17_222 <= KW_DEFINED)||(LA17_222 >= KW_DELIMITED && LA17_222 <= KW_DESC)||(LA17_222 >= KW_DIRECTORIES && LA17_222 <= KW_DISABLE)||LA17_222==KW_DISTRIBUTE||LA17_222==KW_DOW||(LA17_222 >= KW_DUMP && LA17_222 <= KW_ELEM_TYPE)||LA17_222==KW_ENABLE||LA17_222==KW_ESCAPED||LA17_222==KW_EXCLUSIVE||(LA17_222 >= KW_EXPLAIN && LA17_222 <= KW_EXPORT)||(LA17_222 >= KW_FIELDS && LA17_222 <= KW_FIRST)||(LA17_222 >= KW_FORMAT && LA17_222 <= KW_FORMATTED)||LA17_222==KW_FUNCTIONS||(LA17_222 >= KW_HOUR && LA17_222 <= KW_IDXPROPERTIES)||(LA17_222 >= KW_INDEX && LA17_222 <= KW_INDEXES)||(LA17_222 >= KW_INPATH && LA17_222 <= KW_INPUTFORMAT)||(LA17_222 >= KW_ISOLATION && LA17_222 <= KW_JAR)||(LA17_222 >= KW_KEY && LA17_222 <= KW_LAST)||LA17_222==KW_LEVEL||(LA17_222 >= KW_LIMIT && LA17_222 <= KW_LOAD)||(LA17_222 >= KW_LOCATION && LA17_222 <= KW_LONG)||(LA17_222 >= KW_MAPJOIN && LA17_222 <= KW_METADATA)||(LA17_222 >= KW_MINUTE && LA17_222 <= KW_MONTH)||LA17_222==KW_MSCK||(LA17_222 >= KW_NORELY && LA17_222 <= KW_NOSCAN)||LA17_222==KW_NOVALIDATE||LA17_222==KW_NULLS||LA17_222==KW_OFFSET||LA17_222==KW_OPTION||(LA17_222 >= KW_OUTPUTDRIVER && LA17_222 <= KW_OUTPUTFORMAT)||(LA17_222 >= KW_OVERWRITE && LA17_222 <= KW_OWNER)||(LA17_222 >= KW_PARTITIONED && LA17_222 <= KW_PARTITIONS)||LA17_222==KW_PLUS||LA17_222==KW_PRETTY||LA17_222==KW_PRINCIPALS||(LA17_222 >= KW_PURGE && LA17_222 <= KW_QUARTER)||LA17_222==KW_READ||(LA17_222 >= KW_REBUILD && LA17_222 <= KW_RECORDWRITER)||(LA17_222 >= KW_RELOAD && LA17_222 <= KW_RESTRICT)||LA17_222==KW_REWRITE||(LA17_222 >= KW_ROLE && LA17_222 <= KW_ROLES)||(LA17_222 >= KW_SCHEMA && LA17_222 <= KW_SECOND)||(LA17_222 >= KW_SEMI && LA17_222 <= KW_SERVER)||(LA17_222 >= KW_SETS && LA17_222 <= KW_SKEWED)||(LA17_222 >= KW_SNAPSHOT && LA17_222 <= KW_SSL)||(LA17_222 >= KW_STATISTICS && LA17_222 <= KW_STRUCT)||LA17_222==KW_TABLES||(LA17_222 >= KW_TBLPROPERTIES && LA17_222 <= KW_TERMINATED)||LA17_222==KW_TINYINT||(LA17_222 >= KW_TOUCH && LA17_222 <= KW_TRANSACTIONS)||LA17_222==KW_UNARCHIVE||LA17_222==KW_UNDO||LA17_222==KW_UNIONTYPE||(LA17_222 >= KW_UNLOCK && LA17_222 <= KW_UNSIGNED)||(LA17_222 >= KW_URI && LA17_222 <= KW_USE)||(LA17_222 >= KW_UTC && LA17_222 <= KW_VALIDATE)||LA17_222==KW_VALUE_TYPE||(LA17_222 >= KW_VIEW && LA17_222 <= KW_WEEK)||LA17_222==KW_WHILE||(LA17_222 >= KW_WORK && LA17_222 <= KW_YEAR)||LA17_222==KW_BATCH||LA17_222==KW_DAYOFWEEK||LA17_222==KW_HOLD_DDLTIME||LA17_222==KW_IGNORE||LA17_222==KW_NO_DROP||LA17_222==KW_OFFLINE||LA17_222==KW_PROTECTION||LA17_222==KW_READONLY) ) {s = 663;}

                        else if ( ((LA17_222 >= KW_ALL && LA17_222 <= KW_ALTER)||(LA17_222 >= KW_ARRAY && LA17_222 <= KW_AS)||LA17_222==KW_AUTHORIZATION||(LA17_222 >= KW_BETWEEN && LA17_222 <= KW_BOTH)||LA17_222==KW_BY||LA17_222==KW_CONSTRAINT||LA17_222==KW_CREATE||LA17_222==KW_CUBE||(LA17_222 >= KW_CURRENT_DATE && LA17_222 <= KW_CURSOR)||LA17_222==KW_DATE||LA17_222==KW_DECIMAL||LA17_222==KW_DELETE||LA17_222==KW_DESCRIBE||LA17_222==KW_DOUBLE||LA17_222==KW_DROP||LA17_222==KW_EXISTS||LA17_222==KW_EXTERNAL||(LA17_222 >= KW_FALSE && LA17_222 <= KW_FETCH)||LA17_222==KW_FLOAT||(LA17_222 >= KW_FOR && LA17_222 <= KW_FOREIGN)||LA17_222==KW_FULL||(LA17_222 >= KW_GRANT && LA17_222 <= KW_GROUPING)||(LA17_222 >= KW_IMPORT && LA17_222 <= KW_IN)||LA17_222==KW_INNER||(LA17_222 >= KW_INSERT && LA17_222 <= KW_INTERSECT)||(LA17_222 >= KW_INTO && LA17_222 <= KW_IS)||(LA17_222 >= KW_LATERAL && LA17_222 <= KW_LEFT)||LA17_222==KW_LIKE||LA17_222==KW_LOCAL||LA17_222==KW_NONE||LA17_222==KW_NULL||LA17_222==KW_OF||(LA17_222 >= KW_ORDER && LA17_222 <= KW_OUTER)||LA17_222==KW_PARTITION||LA17_222==KW_PERCENT||LA17_222==KW_PRIMARY||LA17_222==KW_PROCEDURE||LA17_222==KW_RANGE||LA17_222==KW_READS||(LA17_222 >= KW_REFERENCES && LA17_222 <= KW_REGEXP)||LA17_222==KW_REVOKE||(LA17_222 >= KW_RIGHT && LA17_222 <= KW_RLIKE)||(LA17_222 >= KW_ROLLUP && LA17_222 <= KW_ROWS)||LA17_222==KW_SET||LA17_222==KW_SMALLINT||LA17_222==KW_TABLE||LA17_222==KW_TIMESTAMP||LA17_222==KW_TO||(LA17_222 >= KW_TRIGGER && LA17_222 <= KW_TRUNCATE)||LA17_222==KW_UNION||LA17_222==KW_UPDATE||(LA17_222 >= KW_USER && LA17_222 <= KW_USING)||LA17_222==KW_VALUES||LA17_222==KW_WITH) ) {s = 664;}

                         
                        input.seek(index17_222);

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_269 = input.LA(1);

                         
                        int index17_269 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_269==STAR) && (synpred1_SelectClauseParser())) {s = 665;}

                        else if ( (LA17_269==Identifier) ) {s = 666;}

                        else if ( ((LA17_269 >= KW_ABORT && LA17_269 <= KW_AFTER)||LA17_269==KW_ANALYZE||LA17_269==KW_ARCHIVE||LA17_269==KW_ASC||(LA17_269 >= KW_AUTOCOMMIT && LA17_269 <= KW_BEFORE)||(LA17_269 >= KW_BUCKET && LA17_269 <= KW_BUCKETS)||(LA17_269 >= KW_CACHE && LA17_269 <= KW_CASCADE)||LA17_269==KW_CHANGE||(LA17_269 >= KW_CLUSTER && LA17_269 <= KW_COLLECTION)||(LA17_269 >= KW_COLUMNS && LA17_269 <= KW_COMMENT)||(LA17_269 >= KW_COMPACT && LA17_269 <= KW_CONCATENATE)||LA17_269==KW_CONTINUE||LA17_269==KW_DATA||LA17_269==KW_DATABASES||(LA17_269 >= KW_DATETIME && LA17_269 <= KW_DBPROPERTIES)||(LA17_269 >= KW_DEFERRED && LA17_269 <= KW_DEFINED)||(LA17_269 >= KW_DELIMITED && LA17_269 <= KW_DESC)||(LA17_269 >= KW_DIRECTORIES && LA17_269 <= KW_DISABLE)||LA17_269==KW_DISTRIBUTE||LA17_269==KW_DOW||(LA17_269 >= KW_DUMP && LA17_269 <= KW_ELEM_TYPE)||LA17_269==KW_ENABLE||LA17_269==KW_ESCAPED||LA17_269==KW_EXCLUSIVE||(LA17_269 >= KW_EXPLAIN && LA17_269 <= KW_EXPORT)||(LA17_269 >= KW_FIELDS && LA17_269 <= KW_FIRST)||(LA17_269 >= KW_FORMAT && LA17_269 <= KW_FORMATTED)||LA17_269==KW_FUNCTIONS||(LA17_269 >= KW_HOUR && LA17_269 <= KW_IDXPROPERTIES)||(LA17_269 >= KW_INDEX && LA17_269 <= KW_INDEXES)||(LA17_269 >= KW_INPATH && LA17_269 <= KW_INPUTFORMAT)||(LA17_269 >= KW_ISOLATION && LA17_269 <= KW_JAR)||(LA17_269 >= KW_KEY && LA17_269 <= KW_LAST)||LA17_269==KW_LEVEL||(LA17_269 >= KW_LIMIT && LA17_269 <= KW_LOAD)||(LA17_269 >= KW_LOCATION && LA17_269 <= KW_LONG)||(LA17_269 >= KW_MAPJOIN && LA17_269 <= KW_METADATA)||(LA17_269 >= KW_MINUTE && LA17_269 <= KW_MONTH)||LA17_269==KW_MSCK||(LA17_269 >= KW_NORELY && LA17_269 <= KW_NOSCAN)||LA17_269==KW_NOVALIDATE||LA17_269==KW_NULLS||LA17_269==KW_OFFSET||LA17_269==KW_OPTION||(LA17_269 >= KW_OUTPUTDRIVER && LA17_269 <= KW_OUTPUTFORMAT)||(LA17_269 >= KW_OVERWRITE && LA17_269 <= KW_OWNER)||(LA17_269 >= KW_PARTITIONED && LA17_269 <= KW_PARTITIONS)||LA17_269==KW_PLUS||LA17_269==KW_PRETTY||LA17_269==KW_PRINCIPALS||(LA17_269 >= KW_PURGE && LA17_269 <= KW_QUARTER)||LA17_269==KW_READ||(LA17_269 >= KW_REBUILD && LA17_269 <= KW_RECORDWRITER)||(LA17_269 >= KW_RELOAD && LA17_269 <= KW_RESTRICT)||LA17_269==KW_REWRITE||(LA17_269 >= KW_ROLE && LA17_269 <= KW_ROLES)||(LA17_269 >= KW_SCHEMA && LA17_269 <= KW_SECOND)||(LA17_269 >= KW_SEMI && LA17_269 <= KW_SERVER)||(LA17_269 >= KW_SETS && LA17_269 <= KW_SKEWED)||(LA17_269 >= KW_SNAPSHOT && LA17_269 <= KW_SSL)||(LA17_269 >= KW_STATISTICS && LA17_269 <= KW_STRUCT)||LA17_269==KW_TABLES||(LA17_269 >= KW_TBLPROPERTIES && LA17_269 <= KW_TERMINATED)||LA17_269==KW_TINYINT||(LA17_269 >= KW_TOUCH && LA17_269 <= KW_TRANSACTIONS)||LA17_269==KW_UNARCHIVE||LA17_269==KW_UNDO||LA17_269==KW_UNIONTYPE||(LA17_269 >= KW_UNLOCK && LA17_269 <= KW_UNSIGNED)||(LA17_269 >= KW_URI && LA17_269 <= KW_USE)||(LA17_269 >= KW_UTC && LA17_269 <= KW_VALIDATE)||LA17_269==KW_VALUE_TYPE||(LA17_269 >= KW_VIEW && LA17_269 <= KW_WEEK)||LA17_269==KW_WHILE||(LA17_269 >= KW_WORK && LA17_269 <= KW_YEAR)||LA17_269==KW_BATCH||LA17_269==KW_DAYOFWEEK||LA17_269==KW_HOLD_DDLTIME||LA17_269==KW_IGNORE||LA17_269==KW_NO_DROP||LA17_269==KW_OFFLINE||LA17_269==KW_PROTECTION||LA17_269==KW_READONLY) ) {s = 667;}

                        else if ( ((LA17_269 >= KW_ALL && LA17_269 <= KW_ALTER)||(LA17_269 >= KW_ARRAY && LA17_269 <= KW_AS)||LA17_269==KW_AUTHORIZATION||(LA17_269 >= KW_BETWEEN && LA17_269 <= KW_BOTH)||LA17_269==KW_BY||LA17_269==KW_CONSTRAINT||LA17_269==KW_CREATE||LA17_269==KW_CUBE||(LA17_269 >= KW_CURRENT_DATE && LA17_269 <= KW_CURSOR)||LA17_269==KW_DATE||LA17_269==KW_DECIMAL||LA17_269==KW_DELETE||LA17_269==KW_DESCRIBE||LA17_269==KW_DOUBLE||LA17_269==KW_DROP||LA17_269==KW_EXISTS||LA17_269==KW_EXTERNAL||(LA17_269 >= KW_FALSE && LA17_269 <= KW_FETCH)||LA17_269==KW_FLOAT||(LA17_269 >= KW_FOR && LA17_269 <= KW_FOREIGN)||LA17_269==KW_FULL||(LA17_269 >= KW_GRANT && LA17_269 <= KW_GROUPING)||(LA17_269 >= KW_IMPORT && LA17_269 <= KW_IN)||LA17_269==KW_INNER||(LA17_269 >= KW_INSERT && LA17_269 <= KW_INTERSECT)||(LA17_269 >= KW_INTO && LA17_269 <= KW_IS)||(LA17_269 >= KW_LATERAL && LA17_269 <= KW_LEFT)||LA17_269==KW_LIKE||LA17_269==KW_LOCAL||LA17_269==KW_NONE||LA17_269==KW_NULL||LA17_269==KW_OF||(LA17_269 >= KW_ORDER && LA17_269 <= KW_OUTER)||LA17_269==KW_PARTITION||LA17_269==KW_PERCENT||LA17_269==KW_PRIMARY||LA17_269==KW_PROCEDURE||LA17_269==KW_RANGE||LA17_269==KW_READS||(LA17_269 >= KW_REFERENCES && LA17_269 <= KW_REGEXP)||LA17_269==KW_REVOKE||(LA17_269 >= KW_RIGHT && LA17_269 <= KW_RLIKE)||(LA17_269 >= KW_ROLLUP && LA17_269 <= KW_ROWS)||LA17_269==KW_SET||LA17_269==KW_SMALLINT||LA17_269==KW_TABLE||LA17_269==KW_TIMESTAMP||LA17_269==KW_TO||(LA17_269 >= KW_TRIGGER && LA17_269 <= KW_TRUNCATE)||LA17_269==KW_UNION||LA17_269==KW_UPDATE||(LA17_269 >= KW_USER && LA17_269 <= KW_USING)||LA17_269==KW_VALUES||LA17_269==KW_WITH) ) {s = 668;}

                         
                        input.seek(index17_269);

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_316 = input.LA(1);

                         
                        int index17_316 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_316==STAR) && (synpred1_SelectClauseParser())) {s = 669;}

                        else if ( (LA17_316==Identifier) ) {s = 670;}

                        else if ( ((LA17_316 >= KW_ABORT && LA17_316 <= KW_AFTER)||LA17_316==KW_ANALYZE||LA17_316==KW_ARCHIVE||LA17_316==KW_ASC||(LA17_316 >= KW_AUTOCOMMIT && LA17_316 <= KW_BEFORE)||(LA17_316 >= KW_BUCKET && LA17_316 <= KW_BUCKETS)||(LA17_316 >= KW_CACHE && LA17_316 <= KW_CASCADE)||LA17_316==KW_CHANGE||(LA17_316 >= KW_CLUSTER && LA17_316 <= KW_COLLECTION)||(LA17_316 >= KW_COLUMNS && LA17_316 <= KW_COMMENT)||(LA17_316 >= KW_COMPACT && LA17_316 <= KW_CONCATENATE)||LA17_316==KW_CONTINUE||LA17_316==KW_DATA||LA17_316==KW_DATABASES||(LA17_316 >= KW_DATETIME && LA17_316 <= KW_DBPROPERTIES)||(LA17_316 >= KW_DEFERRED && LA17_316 <= KW_DEFINED)||(LA17_316 >= KW_DELIMITED && LA17_316 <= KW_DESC)||(LA17_316 >= KW_DIRECTORIES && LA17_316 <= KW_DISABLE)||LA17_316==KW_DISTRIBUTE||LA17_316==KW_DOW||(LA17_316 >= KW_DUMP && LA17_316 <= KW_ELEM_TYPE)||LA17_316==KW_ENABLE||LA17_316==KW_ESCAPED||LA17_316==KW_EXCLUSIVE||(LA17_316 >= KW_EXPLAIN && LA17_316 <= KW_EXPORT)||(LA17_316 >= KW_FIELDS && LA17_316 <= KW_FIRST)||(LA17_316 >= KW_FORMAT && LA17_316 <= KW_FORMATTED)||LA17_316==KW_FUNCTIONS||(LA17_316 >= KW_HOUR && LA17_316 <= KW_IDXPROPERTIES)||(LA17_316 >= KW_INDEX && LA17_316 <= KW_INDEXES)||(LA17_316 >= KW_INPATH && LA17_316 <= KW_INPUTFORMAT)||(LA17_316 >= KW_ISOLATION && LA17_316 <= KW_JAR)||(LA17_316 >= KW_KEY && LA17_316 <= KW_LAST)||LA17_316==KW_LEVEL||(LA17_316 >= KW_LIMIT && LA17_316 <= KW_LOAD)||(LA17_316 >= KW_LOCATION && LA17_316 <= KW_LONG)||(LA17_316 >= KW_MAPJOIN && LA17_316 <= KW_METADATA)||(LA17_316 >= KW_MINUTE && LA17_316 <= KW_MONTH)||LA17_316==KW_MSCK||(LA17_316 >= KW_NORELY && LA17_316 <= KW_NOSCAN)||LA17_316==KW_NOVALIDATE||LA17_316==KW_NULLS||LA17_316==KW_OFFSET||LA17_316==KW_OPTION||(LA17_316 >= KW_OUTPUTDRIVER && LA17_316 <= KW_OUTPUTFORMAT)||(LA17_316 >= KW_OVERWRITE && LA17_316 <= KW_OWNER)||(LA17_316 >= KW_PARTITIONED && LA17_316 <= KW_PARTITIONS)||LA17_316==KW_PLUS||LA17_316==KW_PRETTY||LA17_316==KW_PRINCIPALS||(LA17_316 >= KW_PURGE && LA17_316 <= KW_QUARTER)||LA17_316==KW_READ||(LA17_316 >= KW_REBUILD && LA17_316 <= KW_RECORDWRITER)||(LA17_316 >= KW_RELOAD && LA17_316 <= KW_RESTRICT)||LA17_316==KW_REWRITE||(LA17_316 >= KW_ROLE && LA17_316 <= KW_ROLES)||(LA17_316 >= KW_SCHEMA && LA17_316 <= KW_SECOND)||(LA17_316 >= KW_SEMI && LA17_316 <= KW_SERVER)||(LA17_316 >= KW_SETS && LA17_316 <= KW_SKEWED)||(LA17_316 >= KW_SNAPSHOT && LA17_316 <= KW_SSL)||(LA17_316 >= KW_STATISTICS && LA17_316 <= KW_STRUCT)||LA17_316==KW_TABLES||(LA17_316 >= KW_TBLPROPERTIES && LA17_316 <= KW_TERMINATED)||LA17_316==KW_TINYINT||(LA17_316 >= KW_TOUCH && LA17_316 <= KW_TRANSACTIONS)||LA17_316==KW_UNARCHIVE||LA17_316==KW_UNDO||LA17_316==KW_UNIONTYPE||(LA17_316 >= KW_UNLOCK && LA17_316 <= KW_UNSIGNED)||(LA17_316 >= KW_URI && LA17_316 <= KW_USE)||(LA17_316 >= KW_UTC && LA17_316 <= KW_VALIDATE)||LA17_316==KW_VALUE_TYPE||(LA17_316 >= KW_VIEW && LA17_316 <= KW_WEEK)||LA17_316==KW_WHILE||(LA17_316 >= KW_WORK && LA17_316 <= KW_YEAR)||LA17_316==KW_BATCH||LA17_316==KW_DAYOFWEEK||LA17_316==KW_HOLD_DDLTIME||LA17_316==KW_IGNORE||LA17_316==KW_NO_DROP||LA17_316==KW_OFFLINE||LA17_316==KW_PROTECTION||LA17_316==KW_READONLY) ) {s = 671;}

                        else if ( ((LA17_316 >= KW_ALL && LA17_316 <= KW_ALTER)||(LA17_316 >= KW_ARRAY && LA17_316 <= KW_AS)||LA17_316==KW_AUTHORIZATION||(LA17_316 >= KW_BETWEEN && LA17_316 <= KW_BOTH)||LA17_316==KW_BY||LA17_316==KW_CONSTRAINT||LA17_316==KW_CREATE||LA17_316==KW_CUBE||(LA17_316 >= KW_CURRENT_DATE && LA17_316 <= KW_CURSOR)||LA17_316==KW_DATE||LA17_316==KW_DECIMAL||LA17_316==KW_DELETE||LA17_316==KW_DESCRIBE||LA17_316==KW_DOUBLE||LA17_316==KW_DROP||LA17_316==KW_EXISTS||LA17_316==KW_EXTERNAL||(LA17_316 >= KW_FALSE && LA17_316 <= KW_FETCH)||LA17_316==KW_FLOAT||(LA17_316 >= KW_FOR && LA17_316 <= KW_FOREIGN)||LA17_316==KW_FULL||(LA17_316 >= KW_GRANT && LA17_316 <= KW_GROUPING)||(LA17_316 >= KW_IMPORT && LA17_316 <= KW_IN)||LA17_316==KW_INNER||(LA17_316 >= KW_INSERT && LA17_316 <= KW_INTERSECT)||(LA17_316 >= KW_INTO && LA17_316 <= KW_IS)||(LA17_316 >= KW_LATERAL && LA17_316 <= KW_LEFT)||LA17_316==KW_LIKE||LA17_316==KW_LOCAL||LA17_316==KW_NONE||LA17_316==KW_NULL||LA17_316==KW_OF||(LA17_316 >= KW_ORDER && LA17_316 <= KW_OUTER)||LA17_316==KW_PARTITION||LA17_316==KW_PERCENT||LA17_316==KW_PRIMARY||LA17_316==KW_PROCEDURE||LA17_316==KW_RANGE||LA17_316==KW_READS||(LA17_316 >= KW_REFERENCES && LA17_316 <= KW_REGEXP)||LA17_316==KW_REVOKE||(LA17_316 >= KW_RIGHT && LA17_316 <= KW_RLIKE)||(LA17_316 >= KW_ROLLUP && LA17_316 <= KW_ROWS)||LA17_316==KW_SET||LA17_316==KW_SMALLINT||LA17_316==KW_TABLE||LA17_316==KW_TIMESTAMP||LA17_316==KW_TO||(LA17_316 >= KW_TRIGGER && LA17_316 <= KW_TRUNCATE)||LA17_316==KW_UNION||LA17_316==KW_UPDATE||(LA17_316 >= KW_USER && LA17_316 <= KW_USING)||LA17_316==KW_VALUES||LA17_316==KW_WITH) ) {s = 672;}

                         
                        input.seek(index17_316);

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_363 = input.LA(1);

                         
                        int index17_363 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_363==STAR) && (synpred1_SelectClauseParser())) {s = 673;}

                        else if ( (LA17_363==Identifier) ) {s = 674;}

                        else if ( ((LA17_363 >= KW_ABORT && LA17_363 <= KW_AFTER)||LA17_363==KW_ANALYZE||LA17_363==KW_ARCHIVE||LA17_363==KW_ASC||(LA17_363 >= KW_AUTOCOMMIT && LA17_363 <= KW_BEFORE)||(LA17_363 >= KW_BUCKET && LA17_363 <= KW_BUCKETS)||(LA17_363 >= KW_CACHE && LA17_363 <= KW_CASCADE)||LA17_363==KW_CHANGE||(LA17_363 >= KW_CLUSTER && LA17_363 <= KW_COLLECTION)||(LA17_363 >= KW_COLUMNS && LA17_363 <= KW_COMMENT)||(LA17_363 >= KW_COMPACT && LA17_363 <= KW_CONCATENATE)||LA17_363==KW_CONTINUE||LA17_363==KW_DATA||LA17_363==KW_DATABASES||(LA17_363 >= KW_DATETIME && LA17_363 <= KW_DBPROPERTIES)||(LA17_363 >= KW_DEFERRED && LA17_363 <= KW_DEFINED)||(LA17_363 >= KW_DELIMITED && LA17_363 <= KW_DESC)||(LA17_363 >= KW_DIRECTORIES && LA17_363 <= KW_DISABLE)||LA17_363==KW_DISTRIBUTE||LA17_363==KW_DOW||(LA17_363 >= KW_DUMP && LA17_363 <= KW_ELEM_TYPE)||LA17_363==KW_ENABLE||LA17_363==KW_ESCAPED||LA17_363==KW_EXCLUSIVE||(LA17_363 >= KW_EXPLAIN && LA17_363 <= KW_EXPORT)||(LA17_363 >= KW_FIELDS && LA17_363 <= KW_FIRST)||(LA17_363 >= KW_FORMAT && LA17_363 <= KW_FORMATTED)||LA17_363==KW_FUNCTIONS||(LA17_363 >= KW_HOUR && LA17_363 <= KW_IDXPROPERTIES)||(LA17_363 >= KW_INDEX && LA17_363 <= KW_INDEXES)||(LA17_363 >= KW_INPATH && LA17_363 <= KW_INPUTFORMAT)||(LA17_363 >= KW_ISOLATION && LA17_363 <= KW_JAR)||(LA17_363 >= KW_KEY && LA17_363 <= KW_LAST)||LA17_363==KW_LEVEL||(LA17_363 >= KW_LIMIT && LA17_363 <= KW_LOAD)||(LA17_363 >= KW_LOCATION && LA17_363 <= KW_LONG)||(LA17_363 >= KW_MAPJOIN && LA17_363 <= KW_METADATA)||(LA17_363 >= KW_MINUTE && LA17_363 <= KW_MONTH)||LA17_363==KW_MSCK||(LA17_363 >= KW_NORELY && LA17_363 <= KW_NOSCAN)||LA17_363==KW_NOVALIDATE||LA17_363==KW_NULLS||LA17_363==KW_OFFSET||LA17_363==KW_OPTION||(LA17_363 >= KW_OUTPUTDRIVER && LA17_363 <= KW_OUTPUTFORMAT)||(LA17_363 >= KW_OVERWRITE && LA17_363 <= KW_OWNER)||(LA17_363 >= KW_PARTITIONED && LA17_363 <= KW_PARTITIONS)||LA17_363==KW_PLUS||LA17_363==KW_PRETTY||LA17_363==KW_PRINCIPALS||(LA17_363 >= KW_PURGE && LA17_363 <= KW_QUARTER)||LA17_363==KW_READ||(LA17_363 >= KW_REBUILD && LA17_363 <= KW_RECORDWRITER)||(LA17_363 >= KW_RELOAD && LA17_363 <= KW_RESTRICT)||LA17_363==KW_REWRITE||(LA17_363 >= KW_ROLE && LA17_363 <= KW_ROLES)||(LA17_363 >= KW_SCHEMA && LA17_363 <= KW_SECOND)||(LA17_363 >= KW_SEMI && LA17_363 <= KW_SERVER)||(LA17_363 >= KW_SETS && LA17_363 <= KW_SKEWED)||(LA17_363 >= KW_SNAPSHOT && LA17_363 <= KW_SSL)||(LA17_363 >= KW_STATISTICS && LA17_363 <= KW_STRUCT)||LA17_363==KW_TABLES||(LA17_363 >= KW_TBLPROPERTIES && LA17_363 <= KW_TERMINATED)||LA17_363==KW_TINYINT||(LA17_363 >= KW_TOUCH && LA17_363 <= KW_TRANSACTIONS)||LA17_363==KW_UNARCHIVE||LA17_363==KW_UNDO||LA17_363==KW_UNIONTYPE||(LA17_363 >= KW_UNLOCK && LA17_363 <= KW_UNSIGNED)||(LA17_363 >= KW_URI && LA17_363 <= KW_USE)||(LA17_363 >= KW_UTC && LA17_363 <= KW_VALIDATE)||LA17_363==KW_VALUE_TYPE||(LA17_363 >= KW_VIEW && LA17_363 <= KW_WEEK)||LA17_363==KW_WHILE||(LA17_363 >= KW_WORK && LA17_363 <= KW_YEAR)||LA17_363==KW_BATCH||LA17_363==KW_DAYOFWEEK||LA17_363==KW_HOLD_DDLTIME||LA17_363==KW_IGNORE||LA17_363==KW_NO_DROP||LA17_363==KW_OFFLINE||LA17_363==KW_PROTECTION||LA17_363==KW_READONLY) ) {s = 675;}

                        else if ( ((LA17_363 >= KW_ALL && LA17_363 <= KW_ALTER)||(LA17_363 >= KW_ARRAY && LA17_363 <= KW_AS)||LA17_363==KW_AUTHORIZATION||(LA17_363 >= KW_BETWEEN && LA17_363 <= KW_BOTH)||LA17_363==KW_BY||LA17_363==KW_CONSTRAINT||LA17_363==KW_CREATE||LA17_363==KW_CUBE||(LA17_363 >= KW_CURRENT_DATE && LA17_363 <= KW_CURSOR)||LA17_363==KW_DATE||LA17_363==KW_DECIMAL||LA17_363==KW_DELETE||LA17_363==KW_DESCRIBE||LA17_363==KW_DOUBLE||LA17_363==KW_DROP||LA17_363==KW_EXISTS||LA17_363==KW_EXTERNAL||(LA17_363 >= KW_FALSE && LA17_363 <= KW_FETCH)||LA17_363==KW_FLOAT||(LA17_363 >= KW_FOR && LA17_363 <= KW_FOREIGN)||LA17_363==KW_FULL||(LA17_363 >= KW_GRANT && LA17_363 <= KW_GROUPING)||(LA17_363 >= KW_IMPORT && LA17_363 <= KW_IN)||LA17_363==KW_INNER||(LA17_363 >= KW_INSERT && LA17_363 <= KW_INTERSECT)||(LA17_363 >= KW_INTO && LA17_363 <= KW_IS)||(LA17_363 >= KW_LATERAL && LA17_363 <= KW_LEFT)||LA17_363==KW_LIKE||LA17_363==KW_LOCAL||LA17_363==KW_NONE||LA17_363==KW_NULL||LA17_363==KW_OF||(LA17_363 >= KW_ORDER && LA17_363 <= KW_OUTER)||LA17_363==KW_PARTITION||LA17_363==KW_PERCENT||LA17_363==KW_PRIMARY||LA17_363==KW_PROCEDURE||LA17_363==KW_RANGE||LA17_363==KW_READS||(LA17_363 >= KW_REFERENCES && LA17_363 <= KW_REGEXP)||LA17_363==KW_REVOKE||(LA17_363 >= KW_RIGHT && LA17_363 <= KW_RLIKE)||(LA17_363 >= KW_ROLLUP && LA17_363 <= KW_ROWS)||LA17_363==KW_SET||LA17_363==KW_SMALLINT||LA17_363==KW_TABLE||LA17_363==KW_TIMESTAMP||LA17_363==KW_TO||(LA17_363 >= KW_TRIGGER && LA17_363 <= KW_TRUNCATE)||LA17_363==KW_UNION||LA17_363==KW_UPDATE||(LA17_363 >= KW_USER && LA17_363 <= KW_USING)||LA17_363==KW_VALUES||LA17_363==KW_WITH) ) {s = 676;}

                         
                        input.seek(index17_363);

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_410 = input.LA(1);

                         
                        int index17_410 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_410==STAR) && (synpred1_SelectClauseParser())) {s = 677;}

                        else if ( (LA17_410==Identifier) ) {s = 678;}

                        else if ( ((LA17_410 >= KW_ABORT && LA17_410 <= KW_AFTER)||LA17_410==KW_ANALYZE||LA17_410==KW_ARCHIVE||LA17_410==KW_ASC||(LA17_410 >= KW_AUTOCOMMIT && LA17_410 <= KW_BEFORE)||(LA17_410 >= KW_BUCKET && LA17_410 <= KW_BUCKETS)||(LA17_410 >= KW_CACHE && LA17_410 <= KW_CASCADE)||LA17_410==KW_CHANGE||(LA17_410 >= KW_CLUSTER && LA17_410 <= KW_COLLECTION)||(LA17_410 >= KW_COLUMNS && LA17_410 <= KW_COMMENT)||(LA17_410 >= KW_COMPACT && LA17_410 <= KW_CONCATENATE)||LA17_410==KW_CONTINUE||LA17_410==KW_DATA||LA17_410==KW_DATABASES||(LA17_410 >= KW_DATETIME && LA17_410 <= KW_DBPROPERTIES)||(LA17_410 >= KW_DEFERRED && LA17_410 <= KW_DEFINED)||(LA17_410 >= KW_DELIMITED && LA17_410 <= KW_DESC)||(LA17_410 >= KW_DIRECTORIES && LA17_410 <= KW_DISABLE)||LA17_410==KW_DISTRIBUTE||LA17_410==KW_DOW||(LA17_410 >= KW_DUMP && LA17_410 <= KW_ELEM_TYPE)||LA17_410==KW_ENABLE||LA17_410==KW_ESCAPED||LA17_410==KW_EXCLUSIVE||(LA17_410 >= KW_EXPLAIN && LA17_410 <= KW_EXPORT)||(LA17_410 >= KW_FIELDS && LA17_410 <= KW_FIRST)||(LA17_410 >= KW_FORMAT && LA17_410 <= KW_FORMATTED)||LA17_410==KW_FUNCTIONS||(LA17_410 >= KW_HOUR && LA17_410 <= KW_IDXPROPERTIES)||(LA17_410 >= KW_INDEX && LA17_410 <= KW_INDEXES)||(LA17_410 >= KW_INPATH && LA17_410 <= KW_INPUTFORMAT)||(LA17_410 >= KW_ISOLATION && LA17_410 <= KW_JAR)||(LA17_410 >= KW_KEY && LA17_410 <= KW_LAST)||LA17_410==KW_LEVEL||(LA17_410 >= KW_LIMIT && LA17_410 <= KW_LOAD)||(LA17_410 >= KW_LOCATION && LA17_410 <= KW_LONG)||(LA17_410 >= KW_MAPJOIN && LA17_410 <= KW_METADATA)||(LA17_410 >= KW_MINUTE && LA17_410 <= KW_MONTH)||LA17_410==KW_MSCK||(LA17_410 >= KW_NORELY && LA17_410 <= KW_NOSCAN)||LA17_410==KW_NOVALIDATE||LA17_410==KW_NULLS||LA17_410==KW_OFFSET||LA17_410==KW_OPTION||(LA17_410 >= KW_OUTPUTDRIVER && LA17_410 <= KW_OUTPUTFORMAT)||(LA17_410 >= KW_OVERWRITE && LA17_410 <= KW_OWNER)||(LA17_410 >= KW_PARTITIONED && LA17_410 <= KW_PARTITIONS)||LA17_410==KW_PLUS||LA17_410==KW_PRETTY||LA17_410==KW_PRINCIPALS||(LA17_410 >= KW_PURGE && LA17_410 <= KW_QUARTER)||LA17_410==KW_READ||(LA17_410 >= KW_REBUILD && LA17_410 <= KW_RECORDWRITER)||(LA17_410 >= KW_RELOAD && LA17_410 <= KW_RESTRICT)||LA17_410==KW_REWRITE||(LA17_410 >= KW_ROLE && LA17_410 <= KW_ROLES)||(LA17_410 >= KW_SCHEMA && LA17_410 <= KW_SECOND)||(LA17_410 >= KW_SEMI && LA17_410 <= KW_SERVER)||(LA17_410 >= KW_SETS && LA17_410 <= KW_SKEWED)||(LA17_410 >= KW_SNAPSHOT && LA17_410 <= KW_SSL)||(LA17_410 >= KW_STATISTICS && LA17_410 <= KW_STRUCT)||LA17_410==KW_TABLES||(LA17_410 >= KW_TBLPROPERTIES && LA17_410 <= KW_TERMINATED)||LA17_410==KW_TINYINT||(LA17_410 >= KW_TOUCH && LA17_410 <= KW_TRANSACTIONS)||LA17_410==KW_UNARCHIVE||LA17_410==KW_UNDO||LA17_410==KW_UNIONTYPE||(LA17_410 >= KW_UNLOCK && LA17_410 <= KW_UNSIGNED)||(LA17_410 >= KW_URI && LA17_410 <= KW_USE)||(LA17_410 >= KW_UTC && LA17_410 <= KW_VALIDATE)||LA17_410==KW_VALUE_TYPE||(LA17_410 >= KW_VIEW && LA17_410 <= KW_WEEK)||LA17_410==KW_WHILE||(LA17_410 >= KW_WORK && LA17_410 <= KW_YEAR)||LA17_410==KW_BATCH||LA17_410==KW_DAYOFWEEK||LA17_410==KW_HOLD_DDLTIME||LA17_410==KW_IGNORE||LA17_410==KW_NO_DROP||LA17_410==KW_OFFLINE||LA17_410==KW_PROTECTION||LA17_410==KW_READONLY) ) {s = 679;}

                        else if ( ((LA17_410 >= KW_ALL && LA17_410 <= KW_ALTER)||(LA17_410 >= KW_ARRAY && LA17_410 <= KW_AS)||LA17_410==KW_AUTHORIZATION||(LA17_410 >= KW_BETWEEN && LA17_410 <= KW_BOTH)||LA17_410==KW_BY||LA17_410==KW_CONSTRAINT||LA17_410==KW_CREATE||LA17_410==KW_CUBE||(LA17_410 >= KW_CURRENT_DATE && LA17_410 <= KW_CURSOR)||LA17_410==KW_DATE||LA17_410==KW_DECIMAL||LA17_410==KW_DELETE||LA17_410==KW_DESCRIBE||LA17_410==KW_DOUBLE||LA17_410==KW_DROP||LA17_410==KW_EXISTS||LA17_410==KW_EXTERNAL||(LA17_410 >= KW_FALSE && LA17_410 <= KW_FETCH)||LA17_410==KW_FLOAT||(LA17_410 >= KW_FOR && LA17_410 <= KW_FOREIGN)||LA17_410==KW_FULL||(LA17_410 >= KW_GRANT && LA17_410 <= KW_GROUPING)||(LA17_410 >= KW_IMPORT && LA17_410 <= KW_IN)||LA17_410==KW_INNER||(LA17_410 >= KW_INSERT && LA17_410 <= KW_INTERSECT)||(LA17_410 >= KW_INTO && LA17_410 <= KW_IS)||(LA17_410 >= KW_LATERAL && LA17_410 <= KW_LEFT)||LA17_410==KW_LIKE||LA17_410==KW_LOCAL||LA17_410==KW_NONE||LA17_410==KW_NULL||LA17_410==KW_OF||(LA17_410 >= KW_ORDER && LA17_410 <= KW_OUTER)||LA17_410==KW_PARTITION||LA17_410==KW_PERCENT||LA17_410==KW_PRIMARY||LA17_410==KW_PROCEDURE||LA17_410==KW_RANGE||LA17_410==KW_READS||(LA17_410 >= KW_REFERENCES && LA17_410 <= KW_REGEXP)||LA17_410==KW_REVOKE||(LA17_410 >= KW_RIGHT && LA17_410 <= KW_RLIKE)||(LA17_410 >= KW_ROLLUP && LA17_410 <= KW_ROWS)||LA17_410==KW_SET||LA17_410==KW_SMALLINT||LA17_410==KW_TABLE||LA17_410==KW_TIMESTAMP||LA17_410==KW_TO||(LA17_410 >= KW_TRIGGER && LA17_410 <= KW_TRUNCATE)||LA17_410==KW_UNION||LA17_410==KW_UPDATE||(LA17_410 >= KW_USER && LA17_410 <= KW_USING)||LA17_410==KW_VALUES||LA17_410==KW_WITH) ) {s = 680;}

                         
                        input.seek(index17_410);

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_457 = input.LA(1);

                         
                        int index17_457 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_457==STAR) && (synpred1_SelectClauseParser())) {s = 681;}

                        else if ( (LA17_457==Identifier) ) {s = 682;}

                        else if ( ((LA17_457 >= KW_ABORT && LA17_457 <= KW_AFTER)||LA17_457==KW_ANALYZE||LA17_457==KW_ARCHIVE||LA17_457==KW_ASC||(LA17_457 >= KW_AUTOCOMMIT && LA17_457 <= KW_BEFORE)||(LA17_457 >= KW_BUCKET && LA17_457 <= KW_BUCKETS)||(LA17_457 >= KW_CACHE && LA17_457 <= KW_CASCADE)||LA17_457==KW_CHANGE||(LA17_457 >= KW_CLUSTER && LA17_457 <= KW_COLLECTION)||(LA17_457 >= KW_COLUMNS && LA17_457 <= KW_COMMENT)||(LA17_457 >= KW_COMPACT && LA17_457 <= KW_CONCATENATE)||LA17_457==KW_CONTINUE||LA17_457==KW_DATA||LA17_457==KW_DATABASES||(LA17_457 >= KW_DATETIME && LA17_457 <= KW_DBPROPERTIES)||(LA17_457 >= KW_DEFERRED && LA17_457 <= KW_DEFINED)||(LA17_457 >= KW_DELIMITED && LA17_457 <= KW_DESC)||(LA17_457 >= KW_DIRECTORIES && LA17_457 <= KW_DISABLE)||LA17_457==KW_DISTRIBUTE||LA17_457==KW_DOW||(LA17_457 >= KW_DUMP && LA17_457 <= KW_ELEM_TYPE)||LA17_457==KW_ENABLE||LA17_457==KW_ESCAPED||LA17_457==KW_EXCLUSIVE||(LA17_457 >= KW_EXPLAIN && LA17_457 <= KW_EXPORT)||(LA17_457 >= KW_FIELDS && LA17_457 <= KW_FIRST)||(LA17_457 >= KW_FORMAT && LA17_457 <= KW_FORMATTED)||LA17_457==KW_FUNCTIONS||(LA17_457 >= KW_HOUR && LA17_457 <= KW_IDXPROPERTIES)||(LA17_457 >= KW_INDEX && LA17_457 <= KW_INDEXES)||(LA17_457 >= KW_INPATH && LA17_457 <= KW_INPUTFORMAT)||(LA17_457 >= KW_ISOLATION && LA17_457 <= KW_JAR)||(LA17_457 >= KW_KEY && LA17_457 <= KW_LAST)||LA17_457==KW_LEVEL||(LA17_457 >= KW_LIMIT && LA17_457 <= KW_LOAD)||(LA17_457 >= KW_LOCATION && LA17_457 <= KW_LONG)||(LA17_457 >= KW_MAPJOIN && LA17_457 <= KW_METADATA)||(LA17_457 >= KW_MINUTE && LA17_457 <= KW_MONTH)||LA17_457==KW_MSCK||(LA17_457 >= KW_NORELY && LA17_457 <= KW_NOSCAN)||LA17_457==KW_NOVALIDATE||LA17_457==KW_NULLS||LA17_457==KW_OFFSET||LA17_457==KW_OPTION||(LA17_457 >= KW_OUTPUTDRIVER && LA17_457 <= KW_OUTPUTFORMAT)||(LA17_457 >= KW_OVERWRITE && LA17_457 <= KW_OWNER)||(LA17_457 >= KW_PARTITIONED && LA17_457 <= KW_PARTITIONS)||LA17_457==KW_PLUS||LA17_457==KW_PRETTY||LA17_457==KW_PRINCIPALS||(LA17_457 >= KW_PURGE && LA17_457 <= KW_QUARTER)||LA17_457==KW_READ||(LA17_457 >= KW_REBUILD && LA17_457 <= KW_RECORDWRITER)||(LA17_457 >= KW_RELOAD && LA17_457 <= KW_RESTRICT)||LA17_457==KW_REWRITE||(LA17_457 >= KW_ROLE && LA17_457 <= KW_ROLES)||(LA17_457 >= KW_SCHEMA && LA17_457 <= KW_SECOND)||(LA17_457 >= KW_SEMI && LA17_457 <= KW_SERVER)||(LA17_457 >= KW_SETS && LA17_457 <= KW_SKEWED)||(LA17_457 >= KW_SNAPSHOT && LA17_457 <= KW_SSL)||(LA17_457 >= KW_STATISTICS && LA17_457 <= KW_STRUCT)||LA17_457==KW_TABLES||(LA17_457 >= KW_TBLPROPERTIES && LA17_457 <= KW_TERMINATED)||LA17_457==KW_TINYINT||(LA17_457 >= KW_TOUCH && LA17_457 <= KW_TRANSACTIONS)||LA17_457==KW_UNARCHIVE||LA17_457==KW_UNDO||LA17_457==KW_UNIONTYPE||(LA17_457 >= KW_UNLOCK && LA17_457 <= KW_UNSIGNED)||(LA17_457 >= KW_URI && LA17_457 <= KW_USE)||(LA17_457 >= KW_UTC && LA17_457 <= KW_VALIDATE)||LA17_457==KW_VALUE_TYPE||(LA17_457 >= KW_VIEW && LA17_457 <= KW_WEEK)||LA17_457==KW_WHILE||(LA17_457 >= KW_WORK && LA17_457 <= KW_YEAR)||LA17_457==KW_BATCH||LA17_457==KW_DAYOFWEEK||LA17_457==KW_HOLD_DDLTIME||LA17_457==KW_IGNORE||LA17_457==KW_NO_DROP||LA17_457==KW_OFFLINE||LA17_457==KW_PROTECTION||LA17_457==KW_READONLY) ) {s = 683;}

                        else if ( ((LA17_457 >= KW_ALL && LA17_457 <= KW_ALTER)||(LA17_457 >= KW_ARRAY && LA17_457 <= KW_AS)||LA17_457==KW_AUTHORIZATION||(LA17_457 >= KW_BETWEEN && LA17_457 <= KW_BOTH)||LA17_457==KW_BY||LA17_457==KW_CONSTRAINT||LA17_457==KW_CREATE||LA17_457==KW_CUBE||(LA17_457 >= KW_CURRENT_DATE && LA17_457 <= KW_CURSOR)||LA17_457==KW_DATE||LA17_457==KW_DECIMAL||LA17_457==KW_DELETE||LA17_457==KW_DESCRIBE||LA17_457==KW_DOUBLE||LA17_457==KW_DROP||LA17_457==KW_EXISTS||LA17_457==KW_EXTERNAL||(LA17_457 >= KW_FALSE && LA17_457 <= KW_FETCH)||LA17_457==KW_FLOAT||(LA17_457 >= KW_FOR && LA17_457 <= KW_FOREIGN)||LA17_457==KW_FULL||(LA17_457 >= KW_GRANT && LA17_457 <= KW_GROUPING)||(LA17_457 >= KW_IMPORT && LA17_457 <= KW_IN)||LA17_457==KW_INNER||(LA17_457 >= KW_INSERT && LA17_457 <= KW_INTERSECT)||(LA17_457 >= KW_INTO && LA17_457 <= KW_IS)||(LA17_457 >= KW_LATERAL && LA17_457 <= KW_LEFT)||LA17_457==KW_LIKE||LA17_457==KW_LOCAL||LA17_457==KW_NONE||LA17_457==KW_NULL||LA17_457==KW_OF||(LA17_457 >= KW_ORDER && LA17_457 <= KW_OUTER)||LA17_457==KW_PARTITION||LA17_457==KW_PERCENT||LA17_457==KW_PRIMARY||LA17_457==KW_PROCEDURE||LA17_457==KW_RANGE||LA17_457==KW_READS||(LA17_457 >= KW_REFERENCES && LA17_457 <= KW_REGEXP)||LA17_457==KW_REVOKE||(LA17_457 >= KW_RIGHT && LA17_457 <= KW_RLIKE)||(LA17_457 >= KW_ROLLUP && LA17_457 <= KW_ROWS)||LA17_457==KW_SET||LA17_457==KW_SMALLINT||LA17_457==KW_TABLE||LA17_457==KW_TIMESTAMP||LA17_457==KW_TO||(LA17_457 >= KW_TRIGGER && LA17_457 <= KW_TRUNCATE)||LA17_457==KW_UNION||LA17_457==KW_UPDATE||(LA17_457 >= KW_USER && LA17_457 <= KW_USING)||LA17_457==KW_VALUES||LA17_457==KW_WITH) ) {s = 684;}

                         
                        input.seek(index17_457);

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_504 = input.LA(1);

                         
                        int index17_504 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_504==STAR) && (synpred1_SelectClauseParser())) {s = 685;}

                        else if ( (LA17_504==Identifier) ) {s = 686;}

                        else if ( ((LA17_504 >= KW_ABORT && LA17_504 <= KW_AFTER)||LA17_504==KW_ANALYZE||LA17_504==KW_ARCHIVE||LA17_504==KW_ASC||(LA17_504 >= KW_AUTOCOMMIT && LA17_504 <= KW_BEFORE)||(LA17_504 >= KW_BUCKET && LA17_504 <= KW_BUCKETS)||(LA17_504 >= KW_CACHE && LA17_504 <= KW_CASCADE)||LA17_504==KW_CHANGE||(LA17_504 >= KW_CLUSTER && LA17_504 <= KW_COLLECTION)||(LA17_504 >= KW_COLUMNS && LA17_504 <= KW_COMMENT)||(LA17_504 >= KW_COMPACT && LA17_504 <= KW_CONCATENATE)||LA17_504==KW_CONTINUE||LA17_504==KW_DATA||LA17_504==KW_DATABASES||(LA17_504 >= KW_DATETIME && LA17_504 <= KW_DBPROPERTIES)||(LA17_504 >= KW_DEFERRED && LA17_504 <= KW_DEFINED)||(LA17_504 >= KW_DELIMITED && LA17_504 <= KW_DESC)||(LA17_504 >= KW_DIRECTORIES && LA17_504 <= KW_DISABLE)||LA17_504==KW_DISTRIBUTE||LA17_504==KW_DOW||(LA17_504 >= KW_DUMP && LA17_504 <= KW_ELEM_TYPE)||LA17_504==KW_ENABLE||LA17_504==KW_ESCAPED||LA17_504==KW_EXCLUSIVE||(LA17_504 >= KW_EXPLAIN && LA17_504 <= KW_EXPORT)||(LA17_504 >= KW_FIELDS && LA17_504 <= KW_FIRST)||(LA17_504 >= KW_FORMAT && LA17_504 <= KW_FORMATTED)||LA17_504==KW_FUNCTIONS||(LA17_504 >= KW_HOUR && LA17_504 <= KW_IDXPROPERTIES)||(LA17_504 >= KW_INDEX && LA17_504 <= KW_INDEXES)||(LA17_504 >= KW_INPATH && LA17_504 <= KW_INPUTFORMAT)||(LA17_504 >= KW_ISOLATION && LA17_504 <= KW_JAR)||(LA17_504 >= KW_KEY && LA17_504 <= KW_LAST)||LA17_504==KW_LEVEL||(LA17_504 >= KW_LIMIT && LA17_504 <= KW_LOAD)||(LA17_504 >= KW_LOCATION && LA17_504 <= KW_LONG)||(LA17_504 >= KW_MAPJOIN && LA17_504 <= KW_METADATA)||(LA17_504 >= KW_MINUTE && LA17_504 <= KW_MONTH)||LA17_504==KW_MSCK||(LA17_504 >= KW_NORELY && LA17_504 <= KW_NOSCAN)||LA17_504==KW_NOVALIDATE||LA17_504==KW_NULLS||LA17_504==KW_OFFSET||LA17_504==KW_OPTION||(LA17_504 >= KW_OUTPUTDRIVER && LA17_504 <= KW_OUTPUTFORMAT)||(LA17_504 >= KW_OVERWRITE && LA17_504 <= KW_OWNER)||(LA17_504 >= KW_PARTITIONED && LA17_504 <= KW_PARTITIONS)||LA17_504==KW_PLUS||LA17_504==KW_PRETTY||LA17_504==KW_PRINCIPALS||(LA17_504 >= KW_PURGE && LA17_504 <= KW_QUARTER)||LA17_504==KW_READ||(LA17_504 >= KW_REBUILD && LA17_504 <= KW_RECORDWRITER)||(LA17_504 >= KW_RELOAD && LA17_504 <= KW_RESTRICT)||LA17_504==KW_REWRITE||(LA17_504 >= KW_ROLE && LA17_504 <= KW_ROLES)||(LA17_504 >= KW_SCHEMA && LA17_504 <= KW_SECOND)||(LA17_504 >= KW_SEMI && LA17_504 <= KW_SERVER)||(LA17_504 >= KW_SETS && LA17_504 <= KW_SKEWED)||(LA17_504 >= KW_SNAPSHOT && LA17_504 <= KW_SSL)||(LA17_504 >= KW_STATISTICS && LA17_504 <= KW_STRUCT)||LA17_504==KW_TABLES||(LA17_504 >= KW_TBLPROPERTIES && LA17_504 <= KW_TERMINATED)||LA17_504==KW_TINYINT||(LA17_504 >= KW_TOUCH && LA17_504 <= KW_TRANSACTIONS)||LA17_504==KW_UNARCHIVE||LA17_504==KW_UNDO||LA17_504==KW_UNIONTYPE||(LA17_504 >= KW_UNLOCK && LA17_504 <= KW_UNSIGNED)||(LA17_504 >= KW_URI && LA17_504 <= KW_USE)||(LA17_504 >= KW_UTC && LA17_504 <= KW_VALIDATE)||LA17_504==KW_VALUE_TYPE||(LA17_504 >= KW_VIEW && LA17_504 <= KW_WEEK)||LA17_504==KW_WHILE||(LA17_504 >= KW_WORK && LA17_504 <= KW_YEAR)||LA17_504==KW_BATCH||LA17_504==KW_DAYOFWEEK||LA17_504==KW_HOLD_DDLTIME||LA17_504==KW_IGNORE||LA17_504==KW_NO_DROP||LA17_504==KW_OFFLINE||LA17_504==KW_PROTECTION||LA17_504==KW_READONLY) ) {s = 687;}

                        else if ( ((LA17_504 >= KW_ALL && LA17_504 <= KW_ALTER)||(LA17_504 >= KW_ARRAY && LA17_504 <= KW_AS)||LA17_504==KW_AUTHORIZATION||(LA17_504 >= KW_BETWEEN && LA17_504 <= KW_BOTH)||LA17_504==KW_BY||LA17_504==KW_CONSTRAINT||LA17_504==KW_CREATE||LA17_504==KW_CUBE||(LA17_504 >= KW_CURRENT_DATE && LA17_504 <= KW_CURSOR)||LA17_504==KW_DATE||LA17_504==KW_DECIMAL||LA17_504==KW_DELETE||LA17_504==KW_DESCRIBE||LA17_504==KW_DOUBLE||LA17_504==KW_DROP||LA17_504==KW_EXISTS||LA17_504==KW_EXTERNAL||(LA17_504 >= KW_FALSE && LA17_504 <= KW_FETCH)||LA17_504==KW_FLOAT||(LA17_504 >= KW_FOR && LA17_504 <= KW_FOREIGN)||LA17_504==KW_FULL||(LA17_504 >= KW_GRANT && LA17_504 <= KW_GROUPING)||(LA17_504 >= KW_IMPORT && LA17_504 <= KW_IN)||LA17_504==KW_INNER||(LA17_504 >= KW_INSERT && LA17_504 <= KW_INTERSECT)||(LA17_504 >= KW_INTO && LA17_504 <= KW_IS)||(LA17_504 >= KW_LATERAL && LA17_504 <= KW_LEFT)||LA17_504==KW_LIKE||LA17_504==KW_LOCAL||LA17_504==KW_NONE||LA17_504==KW_NULL||LA17_504==KW_OF||(LA17_504 >= KW_ORDER && LA17_504 <= KW_OUTER)||LA17_504==KW_PARTITION||LA17_504==KW_PERCENT||LA17_504==KW_PRIMARY||LA17_504==KW_PROCEDURE||LA17_504==KW_RANGE||LA17_504==KW_READS||(LA17_504 >= KW_REFERENCES && LA17_504 <= KW_REGEXP)||LA17_504==KW_REVOKE||(LA17_504 >= KW_RIGHT && LA17_504 <= KW_RLIKE)||(LA17_504 >= KW_ROLLUP && LA17_504 <= KW_ROWS)||LA17_504==KW_SET||LA17_504==KW_SMALLINT||LA17_504==KW_TABLE||LA17_504==KW_TIMESTAMP||LA17_504==KW_TO||(LA17_504 >= KW_TRIGGER && LA17_504 <= KW_TRUNCATE)||LA17_504==KW_UNION||LA17_504==KW_UPDATE||(LA17_504 >= KW_USER && LA17_504 <= KW_USING)||LA17_504==KW_VALUES||LA17_504==KW_WITH) ) {s = 688;}

                         
                        input.seek(index17_504);

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_551 = input.LA(1);

                         
                        int index17_551 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_551==STAR) && (synpred1_SelectClauseParser())) {s = 689;}

                        else if ( (LA17_551==Identifier) ) {s = 690;}

                        else if ( ((LA17_551 >= KW_ABORT && LA17_551 <= KW_AFTER)||LA17_551==KW_ANALYZE||LA17_551==KW_ARCHIVE||LA17_551==KW_ASC||(LA17_551 >= KW_AUTOCOMMIT && LA17_551 <= KW_BEFORE)||(LA17_551 >= KW_BUCKET && LA17_551 <= KW_BUCKETS)||(LA17_551 >= KW_CACHE && LA17_551 <= KW_CASCADE)||LA17_551==KW_CHANGE||(LA17_551 >= KW_CLUSTER && LA17_551 <= KW_COLLECTION)||(LA17_551 >= KW_COLUMNS && LA17_551 <= KW_COMMENT)||(LA17_551 >= KW_COMPACT && LA17_551 <= KW_CONCATENATE)||LA17_551==KW_CONTINUE||LA17_551==KW_DATA||LA17_551==KW_DATABASES||(LA17_551 >= KW_DATETIME && LA17_551 <= KW_DBPROPERTIES)||(LA17_551 >= KW_DEFERRED && LA17_551 <= KW_DEFINED)||(LA17_551 >= KW_DELIMITED && LA17_551 <= KW_DESC)||(LA17_551 >= KW_DIRECTORIES && LA17_551 <= KW_DISABLE)||LA17_551==KW_DISTRIBUTE||LA17_551==KW_DOW||(LA17_551 >= KW_DUMP && LA17_551 <= KW_ELEM_TYPE)||LA17_551==KW_ENABLE||LA17_551==KW_ESCAPED||LA17_551==KW_EXCLUSIVE||(LA17_551 >= KW_EXPLAIN && LA17_551 <= KW_EXPORT)||(LA17_551 >= KW_FIELDS && LA17_551 <= KW_FIRST)||(LA17_551 >= KW_FORMAT && LA17_551 <= KW_FORMATTED)||LA17_551==KW_FUNCTIONS||(LA17_551 >= KW_HOUR && LA17_551 <= KW_IDXPROPERTIES)||(LA17_551 >= KW_INDEX && LA17_551 <= KW_INDEXES)||(LA17_551 >= KW_INPATH && LA17_551 <= KW_INPUTFORMAT)||(LA17_551 >= KW_ISOLATION && LA17_551 <= KW_JAR)||(LA17_551 >= KW_KEY && LA17_551 <= KW_LAST)||LA17_551==KW_LEVEL||(LA17_551 >= KW_LIMIT && LA17_551 <= KW_LOAD)||(LA17_551 >= KW_LOCATION && LA17_551 <= KW_LONG)||(LA17_551 >= KW_MAPJOIN && LA17_551 <= KW_METADATA)||(LA17_551 >= KW_MINUTE && LA17_551 <= KW_MONTH)||LA17_551==KW_MSCK||(LA17_551 >= KW_NORELY && LA17_551 <= KW_NOSCAN)||LA17_551==KW_NOVALIDATE||LA17_551==KW_NULLS||LA17_551==KW_OFFSET||LA17_551==KW_OPTION||(LA17_551 >= KW_OUTPUTDRIVER && LA17_551 <= KW_OUTPUTFORMAT)||(LA17_551 >= KW_OVERWRITE && LA17_551 <= KW_OWNER)||(LA17_551 >= KW_PARTITIONED && LA17_551 <= KW_PARTITIONS)||LA17_551==KW_PLUS||LA17_551==KW_PRETTY||LA17_551==KW_PRINCIPALS||(LA17_551 >= KW_PURGE && LA17_551 <= KW_QUARTER)||LA17_551==KW_READ||(LA17_551 >= KW_REBUILD && LA17_551 <= KW_RECORDWRITER)||(LA17_551 >= KW_RELOAD && LA17_551 <= KW_RESTRICT)||LA17_551==KW_REWRITE||(LA17_551 >= KW_ROLE && LA17_551 <= KW_ROLES)||(LA17_551 >= KW_SCHEMA && LA17_551 <= KW_SECOND)||(LA17_551 >= KW_SEMI && LA17_551 <= KW_SERVER)||(LA17_551 >= KW_SETS && LA17_551 <= KW_SKEWED)||(LA17_551 >= KW_SNAPSHOT && LA17_551 <= KW_SSL)||(LA17_551 >= KW_STATISTICS && LA17_551 <= KW_STRUCT)||LA17_551==KW_TABLES||(LA17_551 >= KW_TBLPROPERTIES && LA17_551 <= KW_TERMINATED)||LA17_551==KW_TINYINT||(LA17_551 >= KW_TOUCH && LA17_551 <= KW_TRANSACTIONS)||LA17_551==KW_UNARCHIVE||LA17_551==KW_UNDO||LA17_551==KW_UNIONTYPE||(LA17_551 >= KW_UNLOCK && LA17_551 <= KW_UNSIGNED)||(LA17_551 >= KW_URI && LA17_551 <= KW_USE)||(LA17_551 >= KW_UTC && LA17_551 <= KW_VALIDATE)||LA17_551==KW_VALUE_TYPE||(LA17_551 >= KW_VIEW && LA17_551 <= KW_WEEK)||LA17_551==KW_WHILE||(LA17_551 >= KW_WORK && LA17_551 <= KW_YEAR)||LA17_551==KW_BATCH||LA17_551==KW_DAYOFWEEK||LA17_551==KW_HOLD_DDLTIME||LA17_551==KW_IGNORE||LA17_551==KW_NO_DROP||LA17_551==KW_OFFLINE||LA17_551==KW_PROTECTION||LA17_551==KW_READONLY) ) {s = 691;}

                        else if ( ((LA17_551 >= KW_ALL && LA17_551 <= KW_ALTER)||(LA17_551 >= KW_ARRAY && LA17_551 <= KW_AS)||LA17_551==KW_AUTHORIZATION||(LA17_551 >= KW_BETWEEN && LA17_551 <= KW_BOTH)||LA17_551==KW_BY||LA17_551==KW_CONSTRAINT||LA17_551==KW_CREATE||LA17_551==KW_CUBE||(LA17_551 >= KW_CURRENT_DATE && LA17_551 <= KW_CURSOR)||LA17_551==KW_DATE||LA17_551==KW_DECIMAL||LA17_551==KW_DELETE||LA17_551==KW_DESCRIBE||LA17_551==KW_DOUBLE||LA17_551==KW_DROP||LA17_551==KW_EXISTS||LA17_551==KW_EXTERNAL||(LA17_551 >= KW_FALSE && LA17_551 <= KW_FETCH)||LA17_551==KW_FLOAT||(LA17_551 >= KW_FOR && LA17_551 <= KW_FOREIGN)||LA17_551==KW_FULL||(LA17_551 >= KW_GRANT && LA17_551 <= KW_GROUPING)||(LA17_551 >= KW_IMPORT && LA17_551 <= KW_IN)||LA17_551==KW_INNER||(LA17_551 >= KW_INSERT && LA17_551 <= KW_INTERSECT)||(LA17_551 >= KW_INTO && LA17_551 <= KW_IS)||(LA17_551 >= KW_LATERAL && LA17_551 <= KW_LEFT)||LA17_551==KW_LIKE||LA17_551==KW_LOCAL||LA17_551==KW_NONE||LA17_551==KW_NULL||LA17_551==KW_OF||(LA17_551 >= KW_ORDER && LA17_551 <= KW_OUTER)||LA17_551==KW_PARTITION||LA17_551==KW_PERCENT||LA17_551==KW_PRIMARY||LA17_551==KW_PROCEDURE||LA17_551==KW_RANGE||LA17_551==KW_READS||(LA17_551 >= KW_REFERENCES && LA17_551 <= KW_REGEXP)||LA17_551==KW_REVOKE||(LA17_551 >= KW_RIGHT && LA17_551 <= KW_RLIKE)||(LA17_551 >= KW_ROLLUP && LA17_551 <= KW_ROWS)||LA17_551==KW_SET||LA17_551==KW_SMALLINT||LA17_551==KW_TABLE||LA17_551==KW_TIMESTAMP||LA17_551==KW_TO||(LA17_551 >= KW_TRIGGER && LA17_551 <= KW_TRUNCATE)||LA17_551==KW_UNION||LA17_551==KW_UPDATE||(LA17_551 >= KW_USER && LA17_551 <= KW_USING)||LA17_551==KW_VALUES||LA17_551==KW_WITH) ) {s = 692;}

                         
                        input.seek(index17_551);

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_598 = input.LA(1);

                         
                        int index17_598 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_598==STAR) && (synpred1_SelectClauseParser())) {s = 693;}

                        else if ( (LA17_598==Identifier) ) {s = 694;}

                        else if ( ((LA17_598 >= KW_ABORT && LA17_598 <= KW_AFTER)||LA17_598==KW_ANALYZE||LA17_598==KW_ARCHIVE||LA17_598==KW_ASC||(LA17_598 >= KW_AUTOCOMMIT && LA17_598 <= KW_BEFORE)||(LA17_598 >= KW_BUCKET && LA17_598 <= KW_BUCKETS)||(LA17_598 >= KW_CACHE && LA17_598 <= KW_CASCADE)||LA17_598==KW_CHANGE||(LA17_598 >= KW_CLUSTER && LA17_598 <= KW_COLLECTION)||(LA17_598 >= KW_COLUMNS && LA17_598 <= KW_COMMENT)||(LA17_598 >= KW_COMPACT && LA17_598 <= KW_CONCATENATE)||LA17_598==KW_CONTINUE||LA17_598==KW_DATA||LA17_598==KW_DATABASES||(LA17_598 >= KW_DATETIME && LA17_598 <= KW_DBPROPERTIES)||(LA17_598 >= KW_DEFERRED && LA17_598 <= KW_DEFINED)||(LA17_598 >= KW_DELIMITED && LA17_598 <= KW_DESC)||(LA17_598 >= KW_DIRECTORIES && LA17_598 <= KW_DISABLE)||LA17_598==KW_DISTRIBUTE||LA17_598==KW_DOW||(LA17_598 >= KW_DUMP && LA17_598 <= KW_ELEM_TYPE)||LA17_598==KW_ENABLE||LA17_598==KW_ESCAPED||LA17_598==KW_EXCLUSIVE||(LA17_598 >= KW_EXPLAIN && LA17_598 <= KW_EXPORT)||(LA17_598 >= KW_FIELDS && LA17_598 <= KW_FIRST)||(LA17_598 >= KW_FORMAT && LA17_598 <= KW_FORMATTED)||LA17_598==KW_FUNCTIONS||(LA17_598 >= KW_HOUR && LA17_598 <= KW_IDXPROPERTIES)||(LA17_598 >= KW_INDEX && LA17_598 <= KW_INDEXES)||(LA17_598 >= KW_INPATH && LA17_598 <= KW_INPUTFORMAT)||(LA17_598 >= KW_ISOLATION && LA17_598 <= KW_JAR)||(LA17_598 >= KW_KEY && LA17_598 <= KW_LAST)||LA17_598==KW_LEVEL||(LA17_598 >= KW_LIMIT && LA17_598 <= KW_LOAD)||(LA17_598 >= KW_LOCATION && LA17_598 <= KW_LONG)||(LA17_598 >= KW_MAPJOIN && LA17_598 <= KW_METADATA)||(LA17_598 >= KW_MINUTE && LA17_598 <= KW_MONTH)||LA17_598==KW_MSCK||(LA17_598 >= KW_NORELY && LA17_598 <= KW_NOSCAN)||LA17_598==KW_NOVALIDATE||LA17_598==KW_NULLS||LA17_598==KW_OFFSET||LA17_598==KW_OPTION||(LA17_598 >= KW_OUTPUTDRIVER && LA17_598 <= KW_OUTPUTFORMAT)||(LA17_598 >= KW_OVERWRITE && LA17_598 <= KW_OWNER)||(LA17_598 >= KW_PARTITIONED && LA17_598 <= KW_PARTITIONS)||LA17_598==KW_PLUS||LA17_598==KW_PRETTY||LA17_598==KW_PRINCIPALS||(LA17_598 >= KW_PURGE && LA17_598 <= KW_QUARTER)||LA17_598==KW_READ||(LA17_598 >= KW_REBUILD && LA17_598 <= KW_RECORDWRITER)||(LA17_598 >= KW_RELOAD && LA17_598 <= KW_RESTRICT)||LA17_598==KW_REWRITE||(LA17_598 >= KW_ROLE && LA17_598 <= KW_ROLES)||(LA17_598 >= KW_SCHEMA && LA17_598 <= KW_SECOND)||(LA17_598 >= KW_SEMI && LA17_598 <= KW_SERVER)||(LA17_598 >= KW_SETS && LA17_598 <= KW_SKEWED)||(LA17_598 >= KW_SNAPSHOT && LA17_598 <= KW_SSL)||(LA17_598 >= KW_STATISTICS && LA17_598 <= KW_STRUCT)||LA17_598==KW_TABLES||(LA17_598 >= KW_TBLPROPERTIES && LA17_598 <= KW_TERMINATED)||LA17_598==KW_TINYINT||(LA17_598 >= KW_TOUCH && LA17_598 <= KW_TRANSACTIONS)||LA17_598==KW_UNARCHIVE||LA17_598==KW_UNDO||LA17_598==KW_UNIONTYPE||(LA17_598 >= KW_UNLOCK && LA17_598 <= KW_UNSIGNED)||(LA17_598 >= KW_URI && LA17_598 <= KW_USE)||(LA17_598 >= KW_UTC && LA17_598 <= KW_VALIDATE)||LA17_598==KW_VALUE_TYPE||(LA17_598 >= KW_VIEW && LA17_598 <= KW_WEEK)||LA17_598==KW_WHILE||(LA17_598 >= KW_WORK && LA17_598 <= KW_YEAR)||LA17_598==KW_BATCH||LA17_598==KW_DAYOFWEEK||LA17_598==KW_HOLD_DDLTIME||LA17_598==KW_IGNORE||LA17_598==KW_NO_DROP||LA17_598==KW_OFFLINE||LA17_598==KW_PROTECTION||LA17_598==KW_READONLY) ) {s = 695;}

                        else if ( ((LA17_598 >= KW_ALL && LA17_598 <= KW_ALTER)||(LA17_598 >= KW_ARRAY && LA17_598 <= KW_AS)||LA17_598==KW_AUTHORIZATION||(LA17_598 >= KW_BETWEEN && LA17_598 <= KW_BOTH)||LA17_598==KW_BY||LA17_598==KW_CONSTRAINT||LA17_598==KW_CREATE||LA17_598==KW_CUBE||(LA17_598 >= KW_CURRENT_DATE && LA17_598 <= KW_CURSOR)||LA17_598==KW_DATE||LA17_598==KW_DECIMAL||LA17_598==KW_DELETE||LA17_598==KW_DESCRIBE||LA17_598==KW_DOUBLE||LA17_598==KW_DROP||LA17_598==KW_EXISTS||LA17_598==KW_EXTERNAL||(LA17_598 >= KW_FALSE && LA17_598 <= KW_FETCH)||LA17_598==KW_FLOAT||(LA17_598 >= KW_FOR && LA17_598 <= KW_FOREIGN)||LA17_598==KW_FULL||(LA17_598 >= KW_GRANT && LA17_598 <= KW_GROUPING)||(LA17_598 >= KW_IMPORT && LA17_598 <= KW_IN)||LA17_598==KW_INNER||(LA17_598 >= KW_INSERT && LA17_598 <= KW_INTERSECT)||(LA17_598 >= KW_INTO && LA17_598 <= KW_IS)||(LA17_598 >= KW_LATERAL && LA17_598 <= KW_LEFT)||LA17_598==KW_LIKE||LA17_598==KW_LOCAL||LA17_598==KW_NONE||LA17_598==KW_NULL||LA17_598==KW_OF||(LA17_598 >= KW_ORDER && LA17_598 <= KW_OUTER)||LA17_598==KW_PARTITION||LA17_598==KW_PERCENT||LA17_598==KW_PRIMARY||LA17_598==KW_PROCEDURE||LA17_598==KW_RANGE||LA17_598==KW_READS||(LA17_598 >= KW_REFERENCES && LA17_598 <= KW_REGEXP)||LA17_598==KW_REVOKE||(LA17_598 >= KW_RIGHT && LA17_598 <= KW_RLIKE)||(LA17_598 >= KW_ROLLUP && LA17_598 <= KW_ROWS)||LA17_598==KW_SET||LA17_598==KW_SMALLINT||LA17_598==KW_TABLE||LA17_598==KW_TIMESTAMP||LA17_598==KW_TO||(LA17_598 >= KW_TRIGGER && LA17_598 <= KW_TRUNCATE)||LA17_598==KW_UNION||LA17_598==KW_UPDATE||(LA17_598 >= KW_USER && LA17_598 <= KW_USING)||LA17_598==KW_VALUES||LA17_598==KW_WITH) ) {s = 696;}

                         
                        input.seek(index17_598);

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_646 = input.LA(1);

                         
                        int index17_646 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_SelectClauseParser()) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_646);

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_647 = input.LA(1);

                         
                        int index17_647 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_SelectClauseParser()) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_647);

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_648 = input.LA(1);

                         
                        int index17_648 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_SelectClauseParser()) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_648);

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_650 = input.LA(1);

                         
                        int index17_650 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_SelectClauseParser()) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_650);

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_651 = input.LA(1);

                         
                        int index17_651 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_SelectClauseParser()) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_651);

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_652 = input.LA(1);

                         
                        int index17_652 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_SelectClauseParser()) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_652);

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA17_654 = input.LA(1);

                         
                        int index17_654 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_654);

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA17_655 = input.LA(1);

                         
                        int index17_655 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_655);

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA17_656 = input.LA(1);

                         
                        int index17_656 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_656);

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA17_658 = input.LA(1);

                         
                        int index17_658 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_658);

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA17_659 = input.LA(1);

                         
                        int index17_659 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_659);

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA17_660 = input.LA(1);

                         
                        int index17_660 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_660);

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA17_662 = input.LA(1);

                         
                        int index17_662 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_662);

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA17_663 = input.LA(1);

                         
                        int index17_663 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_663);

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA17_664 = input.LA(1);

                         
                        int index17_664 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_664);

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA17_666 = input.LA(1);

                         
                        int index17_666 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_666);

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA17_667 = input.LA(1);

                         
                        int index17_667 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_667);

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA17_668 = input.LA(1);

                         
                        int index17_668 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_668);

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA17_670 = input.LA(1);

                         
                        int index17_670 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_670);

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA17_671 = input.LA(1);

                         
                        int index17_671 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_671);

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA17_672 = input.LA(1);

                         
                        int index17_672 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_672);

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA17_674 = input.LA(1);

                         
                        int index17_674 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_674);

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA17_675 = input.LA(1);

                         
                        int index17_675 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_675);

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA17_676 = input.LA(1);

                         
                        int index17_676 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_676);

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA17_678 = input.LA(1);

                         
                        int index17_678 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_678);

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA17_679 = input.LA(1);

                         
                        int index17_679 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_679);

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA17_680 = input.LA(1);

                         
                        int index17_680 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_680);

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA17_682 = input.LA(1);

                         
                        int index17_682 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_682);

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA17_683 = input.LA(1);

                         
                        int index17_683 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_683);

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA17_684 = input.LA(1);

                         
                        int index17_684 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_684);

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA17_686 = input.LA(1);

                         
                        int index17_686 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_686);

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA17_687 = input.LA(1);

                         
                        int index17_687 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_687);

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA17_688 = input.LA(1);

                         
                        int index17_688 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_688);

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA17_690 = input.LA(1);

                         
                        int index17_690 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_690);

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA17_691 = input.LA(1);

                         
                        int index17_691 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_691);

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA17_692 = input.LA(1);

                         
                        int index17_692 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_692);

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA17_694 = input.LA(1);

                         
                        int index17_694 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_694);

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA17_695 = input.LA(1);

                         
                        int index17_695 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_695);

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA17_696 = input.LA(1);

                         
                        int index17_696 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((useSQL11ReservedKeywordsForIdentifier())&&(useSQL11ReservedKeywordsForIdentifier()))&&synpred1_SelectClauseParser())) ) {s = 693;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index17_696);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA16_eotS =
        "\u01ec\uffff";
    static final String DFA16_eofS =
        "\1\5\1\2\1\uffff\2\2\4\uffff\1\2\2\uffff\2\2\2\uffff\4\2\2\uffff"+
        "\1\2\u01d5\uffff";
    static final String DFA16_minS =
        "\2\12\1\uffff\2\12\4\uffff\1\12\2\uffff\2\12\2\uffff\4\12\2\uffff"+
        "\1\12\117\uffff\1\33\20\uffff\3\7\5\uffff\1\33\20\uffff\3\7\u008d"+
        "\uffff\u00cc\0";
    static final String DFA16_maxS =
        "\2\u022e\1\uffff\2\u0154\4\uffff\1\u0154\2\uffff\2\u0154\2\uffff"+
        "\4\u0154\2\uffff\1\u0154\117\uffff\1\u022e\20\uffff\3\u022e\5\uffff"+
        "\1\u022e\20\uffff\3\u022e\u008d\uffff\u00cc\0";
    static final String DFA16_acceptS =
        "\2\uffff\1\1\2\uffff\1\3\25\uffff\1\2\u01d0\uffff";
    static final String DFA16_specialS =
        "\u0120\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
        "\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77"+
        "\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112"+
        "\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125"+
        "\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140"+
        "\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
        "\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166"+
        "\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1"+
        "\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1"+
        "\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1"+
        "\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1"+
        "\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1"+
        "\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1"+
        "\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1"+
        "\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1"+
        "\u00b9\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1"+
        "\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1"+
        "\u00c9\1\u00ca\1\u00cb}>";
    static final String[] DFA16_transitionS = {
            "\1\5\20\uffff\10\2\1\uffff\2\2\1\1\16\2\2\uffff\1\2\1\uffff"+
            "\1\3\3\2\1\uffff\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\4\2\1\uffff\20\2\1\uffff\1\21\5\2\1\uffff\1\2\1\uffff\1\2\1"+
            "\5\1\uffff\4\2\1\uffff\1\2\1\uffff\7\2\2\uffff\4\2\1\5\1\2\1"+
            "\uffff\2\2\1\4\1\2\1\5\2\2\1\uffff\10\2\1\26\1\2\1\14\1\uffff"+
            "\5\2\1\uffff\4\2\1\20\1\2\1\uffff\2\2\1\23\10\2\1\uffff\1\5"+
            "\5\2\1\5\2\2\1\uffff\4\2\1\uffff\5\2\2\uffff\1\2\1\uffff\1\15"+
            "\4\2\1\uffff\2\2\1\uffff\5\2\3\uffff\14\2\1\5\20\2\1\uffff\6"+
            "\2\1\5\14\2\1\22\2\2\1\uffff\10\2\1\uffff\3\2\1\uffff\6\2\1"+
            "\uffff\4\2\1\uffff\1\2\1\11\1\2\1\uffff\15\2\1\uffff\3\2\1\uffff"+
            "\1\5\1\2\1\5\4\2\16\uffff\1\5\51\uffff\1\2\46\uffff\1\2\61\uffff"+
            "\1\2\3\uffff\1\2\61\uffff\1\2\3\uffff\1\2\27\uffff\1\2\4\uffff"+
            "\1\2",
            "\1\2\20\uffff\10\2\1\uffff\21\2\2\uffff\1\2\1\uffff\4\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
            "\20\2\1\uffff\6\2\1\uffff\1\2\1\uffff\2\2\1\uffff\4\2\1\uffff"+
            "\1\2\1\uffff\7\2\2\uffff\6\2\1\uffff\7\2\1\uffff\13\2\1\uffff"+
            "\5\2\1\uffff\6\2\1\uffff\13\2\1\uffff\11\2\1\uffff\4\2\1\uffff"+
            "\5\2\2\uffff\1\2\1\uffff\5\2\1\uffff\2\2\1\uffff\5\2\3\uffff"+
            "\35\2\1\uffff\26\2\1\uffff\10\2\1\uffff\3\2\1\uffff\6\2\1\uffff"+
            "\4\2\1\uffff\3\2\1\uffff\15\2\1\uffff\3\2\1\uffff\7\2\3\uffff"+
            "\1\33\12\uffff\1\2\51\uffff\1\2\46\uffff\1\2\61\uffff\1\2\3"+
            "\uffff\1\2\61\uffff\1\2\3\uffff\1\2\27\uffff\1\2\4\uffff\1\2",
            "",
            "\1\2\47\uffff\1\5\6\uffff\1\2\50\uffff\1\2\11\uffff\1\2\25"+
            "\uffff\1\2\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2"+
            "\13\uffff\1\2\4\uffff\1\2\11\uffff\1\2\5\uffff\1\2\21\uffff"+
            "\1\2\34\uffff\1\2\27\uffff\1\2\14\uffff\1\2\35\uffff\1\2\24"+
            "\uffff\1\2\1\uffff\1\2\22\uffff\1\2",
            "\1\2\47\uffff\1\5\6\uffff\1\2\50\uffff\1\2\11\uffff\1\2\25"+
            "\uffff\1\2\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2"+
            "\13\uffff\1\2\4\uffff\1\2\11\uffff\1\2\5\uffff\1\2\21\uffff"+
            "\1\2\34\uffff\1\2\27\uffff\1\2\14\uffff\1\2\35\uffff\1\2\24"+
            "\uffff\1\2\1\uffff\1\2\22\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\2\25\uffff\1\5\30\uffff\1\2\47\uffff\1\5\1\2\11\uffff\1"+
            "\2\25\uffff\1\146\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff"+
            "\1\2\13\uffff\1\2\4\uffff\1\2\11\uffff\1\170\5\uffff\1\2\21"+
            "\uffff\1\2\34\uffff\1\171\27\uffff\1\167\14\uffff\1\2\35\uffff"+
            "\1\2\24\uffff\1\2\1\uffff\1\2\7\uffff\1\5\12\uffff\1\2",
            "",
            "",
            "\1\2\25\uffff\1\5\30\uffff\1\2\47\uffff\1\5\1\2\11\uffff\1"+
            "\2\25\uffff\1\177\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff"+
            "\1\2\13\uffff\1\2\4\uffff\1\2\11\uffff\1\u0091\5\uffff\1\2\21"+
            "\uffff\1\2\34\uffff\1\u0092\27\uffff\1\u0090\14\uffff\1\2\35"+
            "\uffff\1\2\24\uffff\1\2\1\uffff\1\2\7\uffff\1\5\12\uffff\1\2",
            "\1\2\47\uffff\1\5\6\uffff\1\2\50\uffff\1\2\11\uffff\1\2\25"+
            "\uffff\1\2\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2"+
            "\13\uffff\1\2\4\uffff\1\2\11\uffff\1\2\5\uffff\1\2\21\uffff"+
            "\1\2\34\uffff\1\2\27\uffff\1\2\14\uffff\1\2\35\uffff\1\2\24"+
            "\uffff\1\2\1\uffff\1\2\22\uffff\1\2",
            "",
            "",
            "\1\2\56\uffff\1\2\50\uffff\1\2\11\uffff\1\2\25\uffff\1\2\4"+
            "\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2\13\uffff\1\2"+
            "\4\uffff\1\2\11\uffff\1\2\5\uffff\1\2\21\uffff\1\2\34\uffff"+
            "\1\2\27\uffff\1\2\14\uffff\1\2\35\uffff\1\2\20\uffff\1\5\3\uffff"+
            "\1\2\1\uffff\1\2\22\uffff\1\2",
            "\1\2\47\uffff\1\5\6\uffff\1\2\50\uffff\1\2\11\uffff\1\2\25"+
            "\uffff\1\2\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2"+
            "\13\uffff\1\2\4\uffff\1\2\11\uffff\1\2\5\uffff\1\2\21\uffff"+
            "\1\2\34\uffff\1\2\27\uffff\1\2\14\uffff\1\2\35\uffff\1\2\24"+
            "\uffff\1\2\1\uffff\1\2\22\uffff\1\2",
            "\1\2\47\uffff\1\5\6\uffff\1\2\50\uffff\1\2\11\uffff\1\2\25"+
            "\uffff\1\2\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2"+
            "\13\uffff\1\2\4\uffff\1\2\11\uffff\1\2\5\uffff\1\2\21\uffff"+
            "\1\2\34\uffff\1\2\27\uffff\1\2\14\uffff\1\2\35\uffff\1\2\24"+
            "\uffff\1\2\1\uffff\1\2\22\uffff\1\2",
            "\1\2\56\uffff\1\2\50\uffff\1\2\11\uffff\1\2\25\uffff\1\2\4"+
            "\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2\13\uffff\1\2"+
            "\4\uffff\1\2\11\uffff\1\2\5\uffff\1\2\21\uffff\1\2\34\uffff"+
            "\1\2\27\uffff\1\2\14\uffff\1\2\35\uffff\1\2\24\uffff\1\2\1\uffff"+
            "\1\2\15\uffff\1\5\4\uffff\1\2",
            "",
            "",
            "\1\2\56\uffff\1\2\50\uffff\1\2\11\uffff\1\2\25\uffff\1\2\4"+
            "\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2\1\uffff\1\5"+
            "\11\uffff\1\2\4\uffff\1\2\11\uffff\1\2\5\uffff\1\2\21\uffff"+
            "\1\2\5\uffff\1\5\26\uffff\1\2\27\uffff\1\2\14\uffff\1\2\35\uffff"+
            "\1\2\24\uffff\1\2\1\uffff\1\2\22\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0122\4\u0123\2\u0124\1\u0123\1\uffff\1\u0123\2\u0124\1"+
            "\u0123\1\u0124\2\u0123\5\u0124\2\u0123\1\u0124\2\u0123\2\uffff"+
            "\1\u0123\1\uffff\4\u0123\1\uffff\2\u0123\1\uffff\4\u0123\1\uffff"+
            "\1\u0124\1\u0123\1\u0124\1\uffff\1\u0124\1\uffff\3\u0124\1\u0123"+
            "\1\uffff\1\u0123\1\u0124\3\u0123\1\u0124\2\u0123\1\u0124\3\u0123"+
            "\1\u0124\3\u0123\1\uffff\1\u0123\1\u0124\1\u0123\1\u0124\2\u0123"+
            "\1\uffff\1\u0123\1\uffff\1\u0123\2\uffff\1\u0123\1\u0124\2\u0123"+
            "\1\uffff\1\u0124\1\uffff\2\u0124\4\u0123\1\u0124\2\uffff\2\u0124"+
            "\2\u0123\1\uffff\1\u0124\1\uffff\1\u0123\3\u0124\1\uffff\2\u0123"+
            "\1\uffff\2\u0124\2\u0123\1\u0124\3\u0123\3\u0124\1\uffff\2\u0124"+
            "\3\u0123\1\uffff\4\u0123\2\u0124\1\uffff\1\u0123\1\u0124\3\u0123"+
            "\1\u0124\5\u0123\2\uffff\5\u0123\1\uffff\2\u0123\1\uffff\1\u0123"+
            "\1\u0124\2\u0123\1\uffff\1\u0123\1\u0124\1\u0123\1\u0124\1\u0123"+
            "\2\uffff\1\u0123\1\uffff\3\u0124\2\u0123\1\uffff\2\u0123\1\uffff"+
            "\1\u0124\2\u0123\1\u0124\1\u0123\3\uffff\1\u0123\1\u0124\1\u0123"+
            "\1\u0124\2\u0123\1\u0124\1\u0123\1\u0124\3\u0123\1\uffff\2\u0124"+
            "\10\u0123\1\u0124\1\u0123\2\u0124\2\u0123\1\uffff\3\u0124\3"+
            "\u0123\1\uffff\4\u0123\1\u0124\5\u0123\1\u0124\4\u0123\1\uffff"+
            "\6\u0123\1\u0124\1\u0123\1\uffff\3\u0123\1\uffff\1\u0124\1\u0123"+
            "\1\u0124\3\u0123\1\uffff\3\u0124\1\u0123\1\uffff\1\u0123\1\u0124"+
            "\1\u0123\1\u0121\3\u0123\1\u0124\2\u0123\2\u0124\3\u0123\1\u0124"+
            "\1\u0123\1\uffff\3\u0123\2\uffff\1\u0123\1\uffff\1\u0124\3\u0123"+
            "\3\uffff\1\u0120\64\uffff\1\u0123\46\uffff\1\u0123\61\uffff"+
            "\1\u0123\3\uffff\1\u0123\61\uffff\1\u0123\3\uffff\1\u0123\27"+
            "\uffff\1\u0123\4\uffff\1\u0123",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0134\6\uffff\1\u0138\1\uffff\1\u0125\2\uffff\1\u0137\7"+
            "\uffff\1\u0129\4\u012a\1\u0126\1\u0146\1\u012a\1\uffff\1\u012a"+
            "\1\u013b\1\u0146\1\u012a\1\u0146\2\u012a\1\u0146\3\u0143\1\u0146"+
            "\2\u012a\1\u0146\2\u012a\1\u0141\1\u013e\1\u012a\1\uffff\4\u012a"+
            "\1\uffff\2\u012a\1\uffff\4\u012a\1\uffff\1\u0146\1\u012a\1\u0146"+
            "\1\uffff\1\u0146\1\uffff\1\u0130\1\u0132\1\u0146\1\u012a\1\uffff"+
            "\1\u012a\1\u012b\3\u012a\1\u0146\2\u012a\1\u0146\3\u012a\1\u0146"+
            "\3\u012a\1\u0127\1\u012a\1\u0143\1\u012a\1\u0146\2\u012a\1\uffff"+
            "\1\u012a\1\uffff\1\u012a\2\uffff\1\u012a\1\u0145\2\u012a\1\uffff"+
            "\1\u0146\1\u013f\1\u0139\1\u0146\4\u012a\1\u0143\1\u0140\1\uffff"+
            "\2\u0146\2\u012a\1\uffff\1\u0146\1\uffff\1\u012a\2\u0146\1\u0143"+
            "\1\uffff\2\u012a\1\u0142\2\u0146\2\u012a\1\u0146\3\u012a\1\u0146"+
            "\1\u0143\1\u0146\1\u013d\2\u0146\3\u012a\1\uffff\4\u012a\2\u0146"+
            "\1\uffff\1\u012a\1\u0146\3\u012a\1\u0146\5\u012a\1\uffff\1\u0144"+
            "\5\u012a\1\uffff\2\u012a\1\uffff\1\u012a\1\u0146\2\u012a\1\u012c"+
            "\1\u012a\1\u013a\1\u012a\1\u0146\1\u012a\2\uffff\1\u012a\1\uffff"+
            "\3\u0146\2\u012a\1\uffff\2\u012a\1\uffff\1\u0146\2\u012a\1\u0146"+
            "\1\u012a\3\uffff\1\u012a\1\u0146\1\u012a\1\u0146\2\u012a\1\u0146"+
            "\1\u012a\1\u0146\3\u012a\1\uffff\2\u0146\10\u012a\1\u0146\1"+
            "\u012a\2\u0146\2\u012a\1\uffff\3\u0146\3\u012a\1\uffff\4\u012a"+
            "\1\u0146\5\u012a\1\u0143\4\u012a\1\uffff\6\u012a\1\u0146\1\u012a"+
            "\1\uffff\3\u012a\1\uffff\1\u0131\1\u012a\1\u0146\3\u012a\1\u0147"+
            "\1\u0146\1\u0133\1\u0146\1\u012a\1\uffff\1\u012a\1\u0146\1\u012a"+
            "\1\uffff\3\u012a\1\u0146\2\u012a\2\u0146\3\u012a\1\u0146\1\u012a"+
            "\1\uffff\3\u012a\2\uffff\1\u012a\1\uffff\1\u0146\3\u012a\3\uffff"+
            "\1\u013c\2\uffff\1\u012d\2\uffff\1\u012e\1\u012d\7\uffff\1\u0128"+
            "\1\u0135\1\u012f\1\u012d\1\u0136\41\uffff\1\u012a\46\uffff\1"+
            "\u012a\61\uffff\1\u012a\3\uffff\1\u012a\61\uffff\1\u012a\3\uffff"+
            "\1\u012a\27\uffff\1\u012a\4\uffff\1\u012a",
            "\1\u0154\6\uffff\1\u0158\4\uffff\1\u0157\7\uffff\1\u0149\4"+
            "\u014a\2\u0166\1\u014a\1\uffff\1\u014a\1\u015b\1\u0166\1\u014a"+
            "\1\u0166\2\u014a\1\u0166\3\u0163\1\u0166\2\u014a\1\u0166\2\u014a"+
            "\1\u0161\1\u015e\1\u014a\1\uffff\4\u014a\1\uffff\2\u014a\1\uffff"+
            "\4\u014a\1\uffff\1\u0166\1\u014a\1\u0166\1\uffff\1\u0166\1\uffff"+
            "\1\u0150\1\u0152\1\u0166\1\u014a\1\uffff\1\u014a\1\u014b\3\u014a"+
            "\1\u0166\2\u014a\1\u0166\3\u014a\1\u0166\3\u014a\1\uffff\1\u014a"+
            "\1\u0163\1\u014a\1\u0166\2\u014a\1\uffff\1\u014a\1\uffff\1\u014a"+
            "\2\uffff\1\u014a\1\u0165\2\u014a\1\uffff\1\u0166\1\u015f\1\u0159"+
            "\1\u0166\4\u014a\1\u0163\1\u0160\1\uffff\2\u0166\2\u014a\1\uffff"+
            "\1\u0166\1\uffff\1\u014a\2\u0166\1\u0163\1\uffff\2\u014a\1\u0162"+
            "\2\u0166\2\u014a\1\u0166\3\u014a\1\u0166\1\u0163\1\u0166\1\u015d"+
            "\2\u0166\3\u014a\1\uffff\4\u014a\2\u0166\1\uffff\1\u014a\1\u0166"+
            "\3\u014a\1\u0166\5\u014a\1\uffff\1\u0164\5\u014a\1\uffff\2\u014a"+
            "\1\uffff\1\u014a\1\u0166\2\u014a\1\u014c\1\u014a\1\u015a\1\u014a"+
            "\1\u0166\1\u014a\2\uffff\1\u014a\1\uffff\3\u0166\2\u014a\1\uffff"+
            "\2\u014a\1\uffff\1\u0166\2\u014a\1\u0166\1\u014a\3\uffff\1\u014a"+
            "\1\u0166\1\u014a\1\u0166\2\u014a\1\u0166\1\u014a\1\u0166\3\u014a"+
            "\1\uffff\2\u0166\10\u014a\1\u0166\1\u014a\2\u0166\2\u014a\1"+
            "\uffff\3\u0166\3\u014a\1\uffff\4\u014a\1\u0166\5\u014a\1\u0163"+
            "\4\u014a\1\uffff\6\u014a\1\u0166\1\u014a\1\uffff\3\u014a\1\uffff"+
            "\1\u0151\1\u014a\1\u0166\3\u014a\1\uffff\1\u0166\1\u0153\1\u0166"+
            "\1\u014a\1\uffff\1\u014a\1\u0166\1\u014a\1\uffff\3\u014a\1\u0166"+
            "\2\u014a\2\u0166\3\u014a\1\u0166\1\u014a\1\uffff\3\u014a\2\uffff"+
            "\1\u014a\1\uffff\1\u0166\3\u014a\3\uffff\1\u015c\2\uffff\1\u014d"+
            "\2\uffff\1\u014e\1\u014d\7\uffff\1\u0148\1\u0155\1\u014f\1\u014d"+
            "\1\u0156\41\uffff\1\u014a\46\uffff\1\u014a\61\uffff\1\u014a"+
            "\3\uffff\1\u014a\61\uffff\1\u014a\3\uffff\1\u014a\27\uffff\1"+
            "\u014a\4\uffff\1\u014a",
            "\1\u0173\6\uffff\1\u0177\4\uffff\1\u0176\7\uffff\1\u0168\4"+
            "\u0169\2\u0185\1\u0169\1\uffff\1\u0169\1\u017a\1\u0185\1\u0169"+
            "\1\u0185\2\u0169\1\u0185\3\u0182\1\u0185\2\u0169\1\u0185\2\u0169"+
            "\1\u0180\1\u017d\1\u0169\1\uffff\4\u0169\1\uffff\2\u0169\1\uffff"+
            "\4\u0169\1\uffff\1\u0185\1\u0169\1\u0185\1\uffff\1\u0185\1\uffff"+
            "\1\u016f\1\u0171\1\u0185\1\u0169\1\uffff\1\u0169\1\u016a\3\u0169"+
            "\1\u0185\2\u0169\1\u0185\3\u0169\1\u0185\3\u0169\1\uffff\1\u0169"+
            "\1\u0182\1\u0169\1\u0185\2\u0169\1\uffff\1\u0169\1\uffff\1\u0169"+
            "\2\uffff\1\u0169\1\u0184\2\u0169\1\uffff\1\u0185\1\u017e\1\u0178"+
            "\1\u0185\4\u0169\1\u0182\1\u017f\1\uffff\2\u0185\2\u0169\1\uffff"+
            "\1\u0185\1\uffff\1\u0169\2\u0185\1\u0182\1\uffff\2\u0169\1\u0181"+
            "\2\u0185\2\u0169\1\u0185\3\u0169\1\u0185\1\u0182\1\u0185\1\u017c"+
            "\2\u0185\3\u0169\1\uffff\4\u0169\2\u0185\1\uffff\1\u0169\1\u0185"+
            "\3\u0169\1\u0185\5\u0169\1\uffff\1\u0183\5\u0169\1\uffff\2\u0169"+
            "\1\uffff\1\u0169\1\u0185\2\u0169\1\u016b\1\u0169\1\u0179\1\u0169"+
            "\1\u0185\1\u0169\2\uffff\1\u0169\1\uffff\3\u0185\2\u0169\1\uffff"+
            "\2\u0169\1\uffff\1\u0185\2\u0169\1\u0185\1\u0169\3\uffff\1\u0169"+
            "\1\u0185\1\u0169\1\u0185\2\u0169\1\u0185\1\u0169\1\u0185\3\u0169"+
            "\1\uffff\2\u0185\10\u0169\1\u0185\1\u0169\2\u0185\2\u0169\1"+
            "\uffff\3\u0185\3\u0169\1\uffff\4\u0169\1\u0185\5\u0169\1\u0182"+
            "\4\u0169\1\uffff\6\u0169\1\u0185\1\u0169\1\uffff\3\u0169\1\uffff"+
            "\1\u0170\1\u0169\1\u0185\3\u0169\1\uffff\1\u0185\1\u0172\1\u0185"+
            "\1\u0169\1\uffff\1\u0169\1\u0185\1\u0169\1\uffff\3\u0169\1\u0185"+
            "\2\u0169\2\u0185\3\u0169\1\u0185\1\u0169\1\uffff\3\u0169\2\uffff"+
            "\1\u0169\1\uffff\1\u0185\3\u0169\3\uffff\1\u017b\2\uffff\1\u016c"+
            "\2\uffff\1\u016d\1\u016c\7\uffff\1\u0167\1\u0174\1\u016e\1\u016c"+
            "\1\u0175\41\uffff\1\u0169\46\uffff\1\u0169\61\uffff\1\u0169"+
            "\3\uffff\1\u0169\61\uffff\1\u0169\3\uffff\1\u0169\27\uffff\1"+
            "\u0169\4\uffff\1\u0169",
            "",
            "",
            "",
            "",
            "",
            "\1\u0188\4\u0189\2\u018a\1\u0189\1\uffff\1\u0189\2\u018a\1"+
            "\u0189\1\u018a\2\u0189\5\u018a\2\u0189\1\u018a\2\u0189\2\uffff"+
            "\1\u0189\1\uffff\4\u0189\1\uffff\2\u0189\1\uffff\4\u0189\1\uffff"+
            "\1\u018a\1\u0189\1\u018a\1\uffff\1\u018a\1\uffff\3\u018a\1\u0189"+
            "\1\uffff\1\u0189\1\u018a\3\u0189\1\u018a\2\u0189\1\u018a\3\u0189"+
            "\1\u018a\3\u0189\1\uffff\1\u0189\1\u018a\1\u0189\1\u018a\2\u0189"+
            "\1\uffff\1\u0189\1\uffff\1\u0189\2\uffff\1\u0189\1\u018a\2\u0189"+
            "\1\uffff\1\u018a\1\uffff\2\u018a\4\u0189\1\u018a\2\uffff\2\u018a"+
            "\2\u0189\1\uffff\1\u018a\1\uffff\1\u0189\3\u018a\1\uffff\2\u0189"+
            "\1\uffff\2\u018a\2\u0189\1\u018a\3\u0189\3\u018a\1\uffff\2\u018a"+
            "\3\u0189\1\uffff\4\u0189\2\u018a\1\uffff\1\u0189\1\u018a\3\u0189"+
            "\1\u018a\5\u0189\2\uffff\5\u0189\1\uffff\2\u0189\1\uffff\1\u0189"+
            "\1\u018a\2\u0189\1\uffff\1\u0189\1\u018a\1\u0189\1\u018a\1\u0189"+
            "\2\uffff\1\u0189\1\uffff\3\u018a\2\u0189\1\uffff\2\u0189\1\uffff"+
            "\1\u018a\2\u0189\1\u018a\1\u0189\3\uffff\1\u0189\1\u018a\1\u0189"+
            "\1\u018a\2\u0189\1\u018a\1\u0189\1\u018a\3\u0189\1\uffff\2\u018a"+
            "\10\u0189\1\u018a\1\u0189\2\u018a\2\u0189\1\uffff\3\u018a\3"+
            "\u0189\1\uffff\4\u0189\1\u018a\5\u0189\1\u018a\4\u0189\1\uffff"+
            "\6\u0189\1\u018a\1\u0189\1\uffff\3\u0189\1\uffff\1\u018a\1\u0189"+
            "\1\u018a\3\u0189\1\uffff\3\u018a\1\u0189\1\uffff\1\u0189\1\u018a"+
            "\1\u0189\1\u0187\3\u0189\1\u018a\2\u0189\2\u018a\3\u0189\1\u018a"+
            "\1\u0189\1\uffff\3\u0189\2\uffff\1\u0189\1\uffff\1\u018a\3\u0189"+
            "\3\uffff\1\u0186\64\uffff\1\u0189\46\uffff\1\u0189\61\uffff"+
            "\1\u0189\3\uffff\1\u0189\61\uffff\1\u0189\3\uffff\1\u0189\27"+
            "\uffff\1\u0189\4\uffff\1\u0189",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u019a\6\uffff\1\u019e\1\uffff\1\u018b\2\uffff\1\u019d\7"+
            "\uffff\1\u018f\4\u0190\1\u018c\1\u01ac\1\u0190\1\uffff\1\u0190"+
            "\1\u01a1\1\u01ac\1\u0190\1\u01ac\2\u0190\1\u01ac\3\u01a9\1\u01ac"+
            "\2\u0190\1\u01ac\2\u0190\1\u01a7\1\u01a4\1\u0190\1\uffff\4\u0190"+
            "\1\uffff\2\u0190\1\uffff\4\u0190\1\uffff\1\u01ac\1\u0190\1\u01ac"+
            "\1\uffff\1\u01ac\1\uffff\1\u0196\1\u0198\1\u01ac\1\u0190\1\uffff"+
            "\1\u0190\1\u0191\3\u0190\1\u01ac\2\u0190\1\u01ac\3\u0190\1\u01ac"+
            "\3\u0190\1\u018d\1\u0190\1\u01a9\1\u0190\1\u01ac\2\u0190\1\uffff"+
            "\1\u0190\1\uffff\1\u0190\2\uffff\1\u0190\1\u01ab\2\u0190\1\uffff"+
            "\1\u01ac\1\u01a5\1\u019f\1\u01ac\4\u0190\1\u01a9\1\u01a6\1\uffff"+
            "\2\u01ac\2\u0190\1\uffff\1\u01ac\1\uffff\1\u0190\2\u01ac\1\u01a9"+
            "\1\uffff\2\u0190\1\u01a8\2\u01ac\2\u0190\1\u01ac\3\u0190\1\u01ac"+
            "\1\u01a9\1\u01ac\1\u01a3\2\u01ac\3\u0190\1\uffff\4\u0190\2\u01ac"+
            "\1\uffff\1\u0190\1\u01ac\3\u0190\1\u01ac\5\u0190\1\uffff\1\u01aa"+
            "\5\u0190\1\uffff\2\u0190\1\uffff\1\u0190\1\u01ac\2\u0190\1\u0192"+
            "\1\u0190\1\u01a0\1\u0190\1\u01ac\1\u0190\2\uffff\1\u0190\1\uffff"+
            "\3\u01ac\2\u0190\1\uffff\2\u0190\1\uffff\1\u01ac\2\u0190\1\u01ac"+
            "\1\u0190\3\uffff\1\u0190\1\u01ac\1\u0190\1\u01ac\2\u0190\1\u01ac"+
            "\1\u0190\1\u01ac\3\u0190\1\uffff\2\u01ac\10\u0190\1\u01ac\1"+
            "\u0190\2\u01ac\2\u0190\1\uffff\3\u01ac\3\u0190\1\uffff\4\u0190"+
            "\1\u01ac\5\u0190\1\u01a9\4\u0190\1\uffff\6\u0190\1\u01ac\1\u0190"+
            "\1\uffff\3\u0190\1\uffff\1\u0197\1\u0190\1\u01ac\3\u0190\1\u01ad"+
            "\1\u01ac\1\u0199\1\u01ac\1\u0190\1\uffff\1\u0190\1\u01ac\1\u0190"+
            "\1\uffff\3\u0190\1\u01ac\2\u0190\2\u01ac\3\u0190\1\u01ac\1\u0190"+
            "\1\uffff\3\u0190\2\uffff\1\u0190\1\uffff\1\u01ac\3\u0190\3\uffff"+
            "\1\u01a2\2\uffff\1\u0193\2\uffff\1\u0194\1\u0193\7\uffff\1\u018e"+
            "\1\u019b\1\u0195\1\u0193\1\u019c\41\uffff\1\u0190\46\uffff\1"+
            "\u0190\61\uffff\1\u0190\3\uffff\1\u0190\61\uffff\1\u0190\3\uffff"+
            "\1\u0190\27\uffff\1\u0190\4\uffff\1\u0190",
            "\1\u01ba\6\uffff\1\u01be\4\uffff\1\u01bd\7\uffff\1\u01af\4"+
            "\u01b0\2\u01cc\1\u01b0\1\uffff\1\u01b0\1\u01c1\1\u01cc\1\u01b0"+
            "\1\u01cc\2\u01b0\1\u01cc\3\u01c9\1\u01cc\2\u01b0\1\u01cc\2\u01b0"+
            "\1\u01c7\1\u01c4\1\u01b0\1\uffff\4\u01b0\1\uffff\2\u01b0\1\uffff"+
            "\4\u01b0\1\uffff\1\u01cc\1\u01b0\1\u01cc\1\uffff\1\u01cc\1\uffff"+
            "\1\u01b6\1\u01b8\1\u01cc\1\u01b0\1\uffff\1\u01b0\1\u01b1\3\u01b0"+
            "\1\u01cc\2\u01b0\1\u01cc\3\u01b0\1\u01cc\3\u01b0\1\uffff\1\u01b0"+
            "\1\u01c9\1\u01b0\1\u01cc\2\u01b0\1\uffff\1\u01b0\1\uffff\1\u01b0"+
            "\2\uffff\1\u01b0\1\u01cb\2\u01b0\1\uffff\1\u01cc\1\u01c5\1\u01bf"+
            "\1\u01cc\4\u01b0\1\u01c9\1\u01c6\1\uffff\2\u01cc\2\u01b0\1\uffff"+
            "\1\u01cc\1\uffff\1\u01b0\2\u01cc\1\u01c9\1\uffff\2\u01b0\1\u01c8"+
            "\2\u01cc\2\u01b0\1\u01cc\3\u01b0\1\u01cc\1\u01c9\1\u01cc\1\u01c3"+
            "\2\u01cc\3\u01b0\1\uffff\4\u01b0\2\u01cc\1\uffff\1\u01b0\1\u01cc"+
            "\3\u01b0\1\u01cc\5\u01b0\1\uffff\1\u01ca\5\u01b0\1\uffff\2\u01b0"+
            "\1\uffff\1\u01b0\1\u01cc\2\u01b0\1\u01b2\1\u01b0\1\u01c0\1\u01b0"+
            "\1\u01cc\1\u01b0\2\uffff\1\u01b0\1\uffff\3\u01cc\2\u01b0\1\uffff"+
            "\2\u01b0\1\uffff\1\u01cc\2\u01b0\1\u01cc\1\u01b0\3\uffff\1\u01b0"+
            "\1\u01cc\1\u01b0\1\u01cc\2\u01b0\1\u01cc\1\u01b0\1\u01cc\3\u01b0"+
            "\1\uffff\2\u01cc\10\u01b0\1\u01cc\1\u01b0\2\u01cc\2\u01b0\1"+
            "\uffff\3\u01cc\3\u01b0\1\uffff\4\u01b0\1\u01cc\5\u01b0\1\u01c9"+
            "\4\u01b0\1\uffff\6\u01b0\1\u01cc\1\u01b0\1\uffff\3\u01b0\1\uffff"+
            "\1\u01b7\1\u01b0\1\u01cc\3\u01b0\1\uffff\1\u01cc\1\u01b9\1\u01cc"+
            "\1\u01b0\1\uffff\1\u01b0\1\u01cc\1\u01b0\1\uffff\3\u01b0\1\u01cc"+
            "\2\u01b0\2\u01cc\3\u01b0\1\u01cc\1\u01b0\1\uffff\3\u01b0\2\uffff"+
            "\1\u01b0\1\uffff\1\u01cc\3\u01b0\3\uffff\1\u01c2\2\uffff\1\u01b3"+
            "\2\uffff\1\u01b4\1\u01b3\7\uffff\1\u01ae\1\u01bb\1\u01b5\1\u01b3"+
            "\1\u01bc\41\uffff\1\u01b0\46\uffff\1\u01b0\61\uffff\1\u01b0"+
            "\3\uffff\1\u01b0\61\uffff\1\u01b0\3\uffff\1\u01b0\27\uffff\1"+
            "\u01b0\4\uffff\1\u01b0",
            "\1\u01d9\6\uffff\1\u01dd\4\uffff\1\u01dc\7\uffff\1\u01ce\4"+
            "\u01cf\2\u01eb\1\u01cf\1\uffff\1\u01cf\1\u01e0\1\u01eb\1\u01cf"+
            "\1\u01eb\2\u01cf\1\u01eb\3\u01e8\1\u01eb\2\u01cf\1\u01eb\2\u01cf"+
            "\1\u01e6\1\u01e3\1\u01cf\1\uffff\4\u01cf\1\uffff\2\u01cf\1\uffff"+
            "\4\u01cf\1\uffff\1\u01eb\1\u01cf\1\u01eb\1\uffff\1\u01eb\1\uffff"+
            "\1\u01d5\1\u01d7\1\u01eb\1\u01cf\1\uffff\1\u01cf\1\u01d0\3\u01cf"+
            "\1\u01eb\2\u01cf\1\u01eb\3\u01cf\1\u01eb\3\u01cf\1\uffff\1\u01cf"+
            "\1\u01e8\1\u01cf\1\u01eb\2\u01cf\1\uffff\1\u01cf\1\uffff\1\u01cf"+
            "\2\uffff\1\u01cf\1\u01ea\2\u01cf\1\uffff\1\u01eb\1\u01e4\1\u01de"+
            "\1\u01eb\4\u01cf\1\u01e8\1\u01e5\1\uffff\2\u01eb\2\u01cf\1\uffff"+
            "\1\u01eb\1\uffff\1\u01cf\2\u01eb\1\u01e8\1\uffff\2\u01cf\1\u01e7"+
            "\2\u01eb\2\u01cf\1\u01eb\3\u01cf\1\u01eb\1\u01e8\1\u01eb\1\u01e2"+
            "\2\u01eb\3\u01cf\1\uffff\4\u01cf\2\u01eb\1\uffff\1\u01cf\1\u01eb"+
            "\3\u01cf\1\u01eb\5\u01cf\1\uffff\1\u01e9\5\u01cf\1\uffff\2\u01cf"+
            "\1\uffff\1\u01cf\1\u01eb\2\u01cf\1\u01d1\1\u01cf\1\u01df\1\u01cf"+
            "\1\u01eb\1\u01cf\2\uffff\1\u01cf\1\uffff\3\u01eb\2\u01cf\1\uffff"+
            "\2\u01cf\1\uffff\1\u01eb\2\u01cf\1\u01eb\1\u01cf\3\uffff\1\u01cf"+
            "\1\u01eb\1\u01cf\1\u01eb\2\u01cf\1\u01eb\1\u01cf\1\u01eb\3\u01cf"+
            "\1\uffff\2\u01eb\10\u01cf\1\u01eb\1\u01cf\2\u01eb\2\u01cf\1"+
            "\uffff\3\u01eb\3\u01cf\1\uffff\4\u01cf\1\u01eb\5\u01cf\1\u01e8"+
            "\4\u01cf\1\uffff\6\u01cf\1\u01eb\1\u01cf\1\uffff\3\u01cf\1\uffff"+
            "\1\u01d6\1\u01cf\1\u01eb\3\u01cf\1\uffff\1\u01eb\1\u01d8\1\u01eb"+
            "\1\u01cf\1\uffff\1\u01cf\1\u01eb\1\u01cf\1\uffff\3\u01cf\1\u01eb"+
            "\2\u01cf\2\u01eb\3\u01cf\1\u01eb\1\u01cf\1\uffff\3\u01cf\2\uffff"+
            "\1\u01cf\1\uffff\1\u01eb\3\u01cf\3\uffff\1\u01e1\2\uffff\1\u01d2"+
            "\2\uffff\1\u01d3\1\u01d2\7\uffff\1\u01cd\1\u01da\1\u01d4\1\u01d2"+
            "\1\u01db\41\uffff\1\u01cf\46\uffff\1\u01cf\61\uffff\1\u01cf"+
            "\3\uffff\1\u01cf\61\uffff\1\u01cf\3\uffff\1\u01cf\27\uffff\1"+
            "\u01cf\4\uffff\1\u01cf",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "133:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_288 = input.LA(1);

                         
                        int index16_288 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_288);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_289 = input.LA(1);

                         
                        int index16_289 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_289);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_290 = input.LA(1);

                         
                        int index16_290 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_290);

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_291 = input.LA(1);

                         
                        int index16_291 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_291);

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_292 = input.LA(1);

                         
                        int index16_292 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_292);

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_293 = input.LA(1);

                         
                        int index16_293 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_293);

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_294 = input.LA(1);

                         
                        int index16_294 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_294);

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_295 = input.LA(1);

                         
                        int index16_295 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_295);

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_296 = input.LA(1);

                         
                        int index16_296 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_296);

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_297 = input.LA(1);

                         
                        int index16_297 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_297);

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_298 = input.LA(1);

                         
                        int index16_298 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_298);

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_299 = input.LA(1);

                         
                        int index16_299 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_299);

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_300 = input.LA(1);

                         
                        int index16_300 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_300);

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA16_301 = input.LA(1);

                         
                        int index16_301 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_301);

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA16_302 = input.LA(1);

                         
                        int index16_302 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_302);

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA16_303 = input.LA(1);

                         
                        int index16_303 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_303);

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA16_304 = input.LA(1);

                         
                        int index16_304 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_304);

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA16_305 = input.LA(1);

                         
                        int index16_305 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_305);

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA16_306 = input.LA(1);

                         
                        int index16_306 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_306);

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA16_307 = input.LA(1);

                         
                        int index16_307 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_307);

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA16_308 = input.LA(1);

                         
                        int index16_308 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_308);

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA16_309 = input.LA(1);

                         
                        int index16_309 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_309);

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA16_310 = input.LA(1);

                         
                        int index16_310 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_310);

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA16_311 = input.LA(1);

                         
                        int index16_311 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_311);

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA16_312 = input.LA(1);

                         
                        int index16_312 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_312);

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA16_313 = input.LA(1);

                         
                        int index16_313 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_313);

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA16_314 = input.LA(1);

                         
                        int index16_314 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_314);

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA16_315 = input.LA(1);

                         
                        int index16_315 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_315);

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA16_316 = input.LA(1);

                         
                        int index16_316 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_316);

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA16_317 = input.LA(1);

                         
                        int index16_317 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_317);

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA16_318 = input.LA(1);

                         
                        int index16_318 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_318);

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA16_319 = input.LA(1);

                         
                        int index16_319 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_319);

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA16_320 = input.LA(1);

                         
                        int index16_320 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_320);

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA16_321 = input.LA(1);

                         
                        int index16_321 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_321);

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA16_322 = input.LA(1);

                         
                        int index16_322 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_322);

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA16_323 = input.LA(1);

                         
                        int index16_323 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_323);

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA16_324 = input.LA(1);

                         
                        int index16_324 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_324);

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA16_325 = input.LA(1);

                         
                        int index16_325 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_325);

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA16_326 = input.LA(1);

                         
                        int index16_326 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_326);

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA16_327 = input.LA(1);

                         
                        int index16_327 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_327);

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA16_328 = input.LA(1);

                         
                        int index16_328 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_328);

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA16_329 = input.LA(1);

                         
                        int index16_329 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_329);

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA16_330 = input.LA(1);

                         
                        int index16_330 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_330);

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA16_331 = input.LA(1);

                         
                        int index16_331 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_331);

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA16_332 = input.LA(1);

                         
                        int index16_332 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_332);

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA16_333 = input.LA(1);

                         
                        int index16_333 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_333);

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA16_334 = input.LA(1);

                         
                        int index16_334 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_334);

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA16_335 = input.LA(1);

                         
                        int index16_335 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_335);

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA16_336 = input.LA(1);

                         
                        int index16_336 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_336);

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA16_337 = input.LA(1);

                         
                        int index16_337 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_337);

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA16_338 = input.LA(1);

                         
                        int index16_338 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_338);

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA16_339 = input.LA(1);

                         
                        int index16_339 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_339);

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA16_340 = input.LA(1);

                         
                        int index16_340 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_340);

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA16_341 = input.LA(1);

                         
                        int index16_341 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_341);

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA16_342 = input.LA(1);

                         
                        int index16_342 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_342);

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA16_343 = input.LA(1);

                         
                        int index16_343 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_343);

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA16_344 = input.LA(1);

                         
                        int index16_344 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_344);

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA16_345 = input.LA(1);

                         
                        int index16_345 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_345);

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA16_346 = input.LA(1);

                         
                        int index16_346 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_346);

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA16_347 = input.LA(1);

                         
                        int index16_347 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_347);

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA16_348 = input.LA(1);

                         
                        int index16_348 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_348);

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA16_349 = input.LA(1);

                         
                        int index16_349 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_349);

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA16_350 = input.LA(1);

                         
                        int index16_350 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_350);

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA16_351 = input.LA(1);

                         
                        int index16_351 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_351);

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA16_352 = input.LA(1);

                         
                        int index16_352 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_352);

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA16_353 = input.LA(1);

                         
                        int index16_353 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_353);

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA16_354 = input.LA(1);

                         
                        int index16_354 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_354);

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA16_355 = input.LA(1);

                         
                        int index16_355 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_355);

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA16_356 = input.LA(1);

                         
                        int index16_356 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_356);

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA16_357 = input.LA(1);

                         
                        int index16_357 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_357);

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA16_358 = input.LA(1);

                         
                        int index16_358 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_358);

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA16_359 = input.LA(1);

                         
                        int index16_359 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_359);

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA16_360 = input.LA(1);

                         
                        int index16_360 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_360);

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA16_361 = input.LA(1);

                         
                        int index16_361 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_361);

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA16_362 = input.LA(1);

                         
                        int index16_362 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_362);

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA16_363 = input.LA(1);

                         
                        int index16_363 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_363);

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA16_364 = input.LA(1);

                         
                        int index16_364 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_364);

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA16_365 = input.LA(1);

                         
                        int index16_365 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_365);

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA16_366 = input.LA(1);

                         
                        int index16_366 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_366);

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA16_367 = input.LA(1);

                         
                        int index16_367 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_367);

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA16_368 = input.LA(1);

                         
                        int index16_368 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_368);

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA16_369 = input.LA(1);

                         
                        int index16_369 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_369);

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA16_370 = input.LA(1);

                         
                        int index16_370 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_370);

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA16_371 = input.LA(1);

                         
                        int index16_371 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_371);

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA16_372 = input.LA(1);

                         
                        int index16_372 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_372);

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA16_373 = input.LA(1);

                         
                        int index16_373 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_373);

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA16_374 = input.LA(1);

                         
                        int index16_374 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_374);

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA16_375 = input.LA(1);

                         
                        int index16_375 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_375);

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA16_376 = input.LA(1);

                         
                        int index16_376 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_376);

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA16_377 = input.LA(1);

                         
                        int index16_377 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_377);

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA16_378 = input.LA(1);

                         
                        int index16_378 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_378);

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA16_379 = input.LA(1);

                         
                        int index16_379 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_379);

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA16_380 = input.LA(1);

                         
                        int index16_380 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_380);

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA16_381 = input.LA(1);

                         
                        int index16_381 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_381);

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA16_382 = input.LA(1);

                         
                        int index16_382 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_382);

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA16_383 = input.LA(1);

                         
                        int index16_383 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_383);

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA16_384 = input.LA(1);

                         
                        int index16_384 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_384);

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA16_385 = input.LA(1);

                         
                        int index16_385 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_385);

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA16_386 = input.LA(1);

                         
                        int index16_386 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_386);

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA16_387 = input.LA(1);

                         
                        int index16_387 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_387);

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA16_388 = input.LA(1);

                         
                        int index16_388 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_388);

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA16_389 = input.LA(1);

                         
                        int index16_389 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_389);

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA16_390 = input.LA(1);

                         
                        int index16_390 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_390);

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA16_391 = input.LA(1);

                         
                        int index16_391 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_391);

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA16_392 = input.LA(1);

                         
                        int index16_392 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_392);

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA16_393 = input.LA(1);

                         
                        int index16_393 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_393);

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA16_394 = input.LA(1);

                         
                        int index16_394 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_394);

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA16_395 = input.LA(1);

                         
                        int index16_395 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_395);

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA16_396 = input.LA(1);

                         
                        int index16_396 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_396);

                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA16_397 = input.LA(1);

                         
                        int index16_397 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_397);

                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA16_398 = input.LA(1);

                         
                        int index16_398 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_398);

                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA16_399 = input.LA(1);

                         
                        int index16_399 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_399);

                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA16_400 = input.LA(1);

                         
                        int index16_400 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_400);

                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA16_401 = input.LA(1);

                         
                        int index16_401 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_401);

                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA16_402 = input.LA(1);

                         
                        int index16_402 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_402);

                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA16_403 = input.LA(1);

                         
                        int index16_403 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_403);

                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA16_404 = input.LA(1);

                         
                        int index16_404 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_404);

                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA16_405 = input.LA(1);

                         
                        int index16_405 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_405);

                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA16_406 = input.LA(1);

                         
                        int index16_406 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_406);

                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA16_407 = input.LA(1);

                         
                        int index16_407 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_407);

                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA16_408 = input.LA(1);

                         
                        int index16_408 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_408);

                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA16_409 = input.LA(1);

                         
                        int index16_409 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_409);

                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA16_410 = input.LA(1);

                         
                        int index16_410 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_410);

                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA16_411 = input.LA(1);

                         
                        int index16_411 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_411);

                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA16_412 = input.LA(1);

                         
                        int index16_412 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_412);

                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA16_413 = input.LA(1);

                         
                        int index16_413 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_413);

                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA16_414 = input.LA(1);

                         
                        int index16_414 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_414);

                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA16_415 = input.LA(1);

                         
                        int index16_415 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_415);

                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA16_416 = input.LA(1);

                         
                        int index16_416 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_416);

                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA16_417 = input.LA(1);

                         
                        int index16_417 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_417);

                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA16_418 = input.LA(1);

                         
                        int index16_418 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_418);

                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA16_419 = input.LA(1);

                         
                        int index16_419 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_419);

                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA16_420 = input.LA(1);

                         
                        int index16_420 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_420);

                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA16_421 = input.LA(1);

                         
                        int index16_421 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_421);

                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA16_422 = input.LA(1);

                         
                        int index16_422 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_422);

                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA16_423 = input.LA(1);

                         
                        int index16_423 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_423);

                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA16_424 = input.LA(1);

                         
                        int index16_424 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_424);

                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA16_425 = input.LA(1);

                         
                        int index16_425 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_425);

                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA16_426 = input.LA(1);

                         
                        int index16_426 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_426);

                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA16_427 = input.LA(1);

                         
                        int index16_427 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_427);

                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA16_428 = input.LA(1);

                         
                        int index16_428 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_428);

                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA16_429 = input.LA(1);

                         
                        int index16_429 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_429);

                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA16_430 = input.LA(1);

                         
                        int index16_430 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_430);

                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA16_431 = input.LA(1);

                         
                        int index16_431 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_431);

                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA16_432 = input.LA(1);

                         
                        int index16_432 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_432);

                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA16_433 = input.LA(1);

                         
                        int index16_433 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_433);

                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA16_434 = input.LA(1);

                         
                        int index16_434 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_434);

                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA16_435 = input.LA(1);

                         
                        int index16_435 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_435);

                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA16_436 = input.LA(1);

                         
                        int index16_436 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_436);

                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA16_437 = input.LA(1);

                         
                        int index16_437 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_437);

                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        int LA16_438 = input.LA(1);

                         
                        int index16_438 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_438);

                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        int LA16_439 = input.LA(1);

                         
                        int index16_439 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_439);

                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        int LA16_440 = input.LA(1);

                         
                        int index16_440 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_440);

                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        int LA16_441 = input.LA(1);

                         
                        int index16_441 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_441);

                        if ( s>=0 ) return s;
                        break;
                    case 154 : 
                        int LA16_442 = input.LA(1);

                         
                        int index16_442 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_442);

                        if ( s>=0 ) return s;
                        break;
                    case 155 : 
                        int LA16_443 = input.LA(1);

                         
                        int index16_443 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_443);

                        if ( s>=0 ) return s;
                        break;
                    case 156 : 
                        int LA16_444 = input.LA(1);

                         
                        int index16_444 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_444);

                        if ( s>=0 ) return s;
                        break;
                    case 157 : 
                        int LA16_445 = input.LA(1);

                         
                        int index16_445 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_445);

                        if ( s>=0 ) return s;
                        break;
                    case 158 : 
                        int LA16_446 = input.LA(1);

                         
                        int index16_446 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_446);

                        if ( s>=0 ) return s;
                        break;
                    case 159 : 
                        int LA16_447 = input.LA(1);

                         
                        int index16_447 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_447);

                        if ( s>=0 ) return s;
                        break;
                    case 160 : 
                        int LA16_448 = input.LA(1);

                         
                        int index16_448 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_448);

                        if ( s>=0 ) return s;
                        break;
                    case 161 : 
                        int LA16_449 = input.LA(1);

                         
                        int index16_449 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_449);

                        if ( s>=0 ) return s;
                        break;
                    case 162 : 
                        int LA16_450 = input.LA(1);

                         
                        int index16_450 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_450);

                        if ( s>=0 ) return s;
                        break;
                    case 163 : 
                        int LA16_451 = input.LA(1);

                         
                        int index16_451 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_451);

                        if ( s>=0 ) return s;
                        break;
                    case 164 : 
                        int LA16_452 = input.LA(1);

                         
                        int index16_452 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_452);

                        if ( s>=0 ) return s;
                        break;
                    case 165 : 
                        int LA16_453 = input.LA(1);

                         
                        int index16_453 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_453);

                        if ( s>=0 ) return s;
                        break;
                    case 166 : 
                        int LA16_454 = input.LA(1);

                         
                        int index16_454 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_454);

                        if ( s>=0 ) return s;
                        break;
                    case 167 : 
                        int LA16_455 = input.LA(1);

                         
                        int index16_455 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_455);

                        if ( s>=0 ) return s;
                        break;
                    case 168 : 
                        int LA16_456 = input.LA(1);

                         
                        int index16_456 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_456);

                        if ( s>=0 ) return s;
                        break;
                    case 169 : 
                        int LA16_457 = input.LA(1);

                         
                        int index16_457 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_457);

                        if ( s>=0 ) return s;
                        break;
                    case 170 : 
                        int LA16_458 = input.LA(1);

                         
                        int index16_458 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_458);

                        if ( s>=0 ) return s;
                        break;
                    case 171 : 
                        int LA16_459 = input.LA(1);

                         
                        int index16_459 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_459);

                        if ( s>=0 ) return s;
                        break;
                    case 172 : 
                        int LA16_460 = input.LA(1);

                         
                        int index16_460 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_460);

                        if ( s>=0 ) return s;
                        break;
                    case 173 : 
                        int LA16_461 = input.LA(1);

                         
                        int index16_461 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_461);

                        if ( s>=0 ) return s;
                        break;
                    case 174 : 
                        int LA16_462 = input.LA(1);

                         
                        int index16_462 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_462);

                        if ( s>=0 ) return s;
                        break;
                    case 175 : 
                        int LA16_463 = input.LA(1);

                         
                        int index16_463 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_463);

                        if ( s>=0 ) return s;
                        break;
                    case 176 : 
                        int LA16_464 = input.LA(1);

                         
                        int index16_464 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_464);

                        if ( s>=0 ) return s;
                        break;
                    case 177 : 
                        int LA16_465 = input.LA(1);

                         
                        int index16_465 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_465);

                        if ( s>=0 ) return s;
                        break;
                    case 178 : 
                        int LA16_466 = input.LA(1);

                         
                        int index16_466 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_466);

                        if ( s>=0 ) return s;
                        break;
                    case 179 : 
                        int LA16_467 = input.LA(1);

                         
                        int index16_467 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_467);

                        if ( s>=0 ) return s;
                        break;
                    case 180 : 
                        int LA16_468 = input.LA(1);

                         
                        int index16_468 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_468);

                        if ( s>=0 ) return s;
                        break;
                    case 181 : 
                        int LA16_469 = input.LA(1);

                         
                        int index16_469 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_469);

                        if ( s>=0 ) return s;
                        break;
                    case 182 : 
                        int LA16_470 = input.LA(1);

                         
                        int index16_470 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_470);

                        if ( s>=0 ) return s;
                        break;
                    case 183 : 
                        int LA16_471 = input.LA(1);

                         
                        int index16_471 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_471);

                        if ( s>=0 ) return s;
                        break;
                    case 184 : 
                        int LA16_472 = input.LA(1);

                         
                        int index16_472 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_472);

                        if ( s>=0 ) return s;
                        break;
                    case 185 : 
                        int LA16_473 = input.LA(1);

                         
                        int index16_473 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_473);

                        if ( s>=0 ) return s;
                        break;
                    case 186 : 
                        int LA16_474 = input.LA(1);

                         
                        int index16_474 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_474);

                        if ( s>=0 ) return s;
                        break;
                    case 187 : 
                        int LA16_475 = input.LA(1);

                         
                        int index16_475 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_475);

                        if ( s>=0 ) return s;
                        break;
                    case 188 : 
                        int LA16_476 = input.LA(1);

                         
                        int index16_476 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_476);

                        if ( s>=0 ) return s;
                        break;
                    case 189 : 
                        int LA16_477 = input.LA(1);

                         
                        int index16_477 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_477);

                        if ( s>=0 ) return s;
                        break;
                    case 190 : 
                        int LA16_478 = input.LA(1);

                         
                        int index16_478 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_478);

                        if ( s>=0 ) return s;
                        break;
                    case 191 : 
                        int LA16_479 = input.LA(1);

                         
                        int index16_479 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_479);

                        if ( s>=0 ) return s;
                        break;
                    case 192 : 
                        int LA16_480 = input.LA(1);

                         
                        int index16_480 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_480);

                        if ( s>=0 ) return s;
                        break;
                    case 193 : 
                        int LA16_481 = input.LA(1);

                         
                        int index16_481 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_481);

                        if ( s>=0 ) return s;
                        break;
                    case 194 : 
                        int LA16_482 = input.LA(1);

                         
                        int index16_482 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_482);

                        if ( s>=0 ) return s;
                        break;
                    case 195 : 
                        int LA16_483 = input.LA(1);

                         
                        int index16_483 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_483);

                        if ( s>=0 ) return s;
                        break;
                    case 196 : 
                        int LA16_484 = input.LA(1);

                         
                        int index16_484 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_484);

                        if ( s>=0 ) return s;
                        break;
                    case 197 : 
                        int LA16_485 = input.LA(1);

                         
                        int index16_485 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_485);

                        if ( s>=0 ) return s;
                        break;
                    case 198 : 
                        int LA16_486 = input.LA(1);

                         
                        int index16_486 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_486);

                        if ( s>=0 ) return s;
                        break;
                    case 199 : 
                        int LA16_487 = input.LA(1);

                         
                        int index16_487 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_487);

                        if ( s>=0 ) return s;
                        break;
                    case 200 : 
                        int LA16_488 = input.LA(1);

                         
                        int index16_488 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_488);

                        if ( s>=0 ) return s;
                        break;
                    case 201 : 
                        int LA16_489 = input.LA(1);

                         
                        int index16_489 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_489);

                        if ( s>=0 ) return s;
                        break;
                    case 202 : 
                        int LA16_490 = input.LA(1);

                         
                        int index16_490 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_490);

                        if ( s>=0 ) return s;
                        break;
                    case 203 : 
                        int LA16_491 = input.LA(1);

                         
                        int index16_491 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index16_491);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA14_eotS =
        "\u0109\uffff";
    static final String DFA14_eofS =
        "\1\uffff\1\2\4\uffff\2\5\4\uffff\1\5\2\uffff\2\5\2\uffff\4\5\2\uffff"+
        "\1\5\u00ef\uffff";
    static final String DFA14_minS =
        "\1\33\1\12\4\uffff\2\12\4\uffff\1\12\2\uffff\2\12\2\uffff\4\12\2"+
        "\uffff\1\12\65\uffff\1\0\20\uffff\3\0\5\uffff\1\0\20\uffff\3\0\u008d"+
        "\uffff";
    static final String DFA14_maxS =
        "\2\u022e\4\uffff\2\u0154\4\uffff\1\u0154\2\uffff\2\u0154\2\uffff"+
        "\4\u0154\2\uffff\1\u0154\65\uffff\1\0\20\uffff\3\0\5\uffff\1\0\20"+
        "\uffff\3\0\u008d\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\u0103\uffff";
    static final String DFA14_specialS =
        "\117\uffff\1\0\20\uffff\1\1\1\2\1\3\5\uffff\1\4\20\uffff\1\5\1\6"+
        "\1\7\u008d\uffff}>";
    static final String[] DFA14_transitionS = {
            "\10\2\1\uffff\2\2\1\1\16\2\2\uffff\1\2\1\uffff\4\2\1\uffff\2"+
            "\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\20"+
            "\2\1\uffff\6\2\1\uffff\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\1"+
            "\2\1\uffff\7\2\2\uffff\4\2\1\uffff\1\2\1\uffff\4\2\1\uffff\2"+
            "\2\1\uffff\13\2\1\uffff\5\2\1\uffff\6\2\1\uffff\13\2\2\uffff"+
            "\5\2\1\uffff\2\2\1\uffff\4\2\1\uffff\5\2\2\uffff\1\2\1\uffff"+
            "\5\2\1\uffff\2\2\1\uffff\5\2\3\uffff\14\2\1\uffff\20\2\1\uffff"+
            "\6\2\1\uffff\17\2\1\uffff\10\2\1\uffff\3\2\1\uffff\6\2\1\uffff"+
            "\4\2\1\uffff\3\2\1\uffff\15\2\1\uffff\3\2\2\uffff\1\2\1\uffff"+
            "\4\2\70\uffff\1\2\46\uffff\1\2\61\uffff\1\2\3\uffff\1\2\61\uffff"+
            "\1\2\3\uffff\1\2\27\uffff\1\2\4\uffff\1\2",
            "\1\2\20\uffff\10\5\1\uffff\21\5\2\uffff\1\5\1\uffff\1\6\3\5"+
            "\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\1\24\5\5\1\uffff\1\5\1\uffff\1\5\1\2\1"+
            "\uffff\4\5\1\uffff\1\5\1\uffff\7\5\2\uffff\4\5\1\2\1\5\1\uffff"+
            "\2\5\1\7\1\5\1\2\2\5\1\uffff\10\5\1\31\1\5\1\17\1\uffff\5\5"+
            "\1\uffff\4\5\1\23\1\5\1\uffff\2\5\1\26\10\5\1\uffff\1\2\5\5"+
            "\1\2\2\5\1\uffff\4\5\1\uffff\5\5\2\uffff\1\5\1\uffff\1\20\4"+
            "\5\1\uffff\2\5\1\uffff\5\5\3\uffff\14\5\1\2\20\5\1\uffff\6\5"+
            "\1\2\14\5\1\25\2\5\1\uffff\10\5\1\uffff\3\5\1\uffff\6\5\1\uffff"+
            "\4\5\1\uffff\1\5\1\14\1\5\1\uffff\15\5\1\uffff\3\5\1\uffff\1"+
            "\2\1\5\1\2\4\5\16\uffff\1\2\51\uffff\1\5\46\uffff\1\5\61\uffff"+
            "\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff\1\5\4\uffff"+
            "\1\5",
            "",
            "",
            "",
            "",
            "\1\5\47\uffff\1\2\6\uffff\1\5\50\uffff\1\5\11\uffff\1\5\25"+
            "\uffff\1\5\4\uffff\1\5\1\uffff\1\5\13\uffff\1\5\1\uffff\1\5"+
            "\13\uffff\1\5\4\uffff\1\5\11\uffff\1\5\5\uffff\1\5\21\uffff"+
            "\1\5\34\uffff\1\5\27\uffff\1\5\14\uffff\1\5\35\uffff\1\5\24"+
            "\uffff\1\5\1\uffff\1\5\22\uffff\1\5",
            "\1\5\47\uffff\1\2\6\uffff\1\5\50\uffff\1\5\11\uffff\1\5\25"+
            "\uffff\1\5\4\uffff\1\5\1\uffff\1\5\13\uffff\1\5\1\uffff\1\5"+
            "\13\uffff\1\5\4\uffff\1\5\11\uffff\1\5\5\uffff\1\5\21\uffff"+
            "\1\5\34\uffff\1\5\27\uffff\1\5\14\uffff\1\5\35\uffff\1\5\24"+
            "\uffff\1\5\1\uffff\1\5\22\uffff\1\5",
            "",
            "",
            "",
            "",
            "\1\5\25\uffff\1\2\30\uffff\1\5\47\uffff\1\2\1\5\11\uffff\1"+
            "\5\25\uffff\1\117\4\uffff\1\5\1\uffff\1\5\13\uffff\1\5\1\uffff"+
            "\1\5\13\uffff\1\5\4\uffff\1\5\11\uffff\1\141\5\uffff\1\5\21"+
            "\uffff\1\5\34\uffff\1\142\27\uffff\1\140\14\uffff\1\5\35\uffff"+
            "\1\5\24\uffff\1\5\1\uffff\1\5\7\uffff\1\2\12\uffff\1\5",
            "",
            "",
            "\1\5\25\uffff\1\2\30\uffff\1\5\47\uffff\1\2\1\5\11\uffff\1"+
            "\5\25\uffff\1\150\4\uffff\1\5\1\uffff\1\5\13\uffff\1\5\1\uffff"+
            "\1\5\13\uffff\1\5\4\uffff\1\5\11\uffff\1\172\5\uffff\1\5\21"+
            "\uffff\1\5\34\uffff\1\173\27\uffff\1\171\14\uffff\1\5\35\uffff"+
            "\1\5\24\uffff\1\5\1\uffff\1\5\7\uffff\1\2\12\uffff\1\5",
            "\1\5\47\uffff\1\2\6\uffff\1\5\50\uffff\1\5\11\uffff\1\5\25"+
            "\uffff\1\5\4\uffff\1\5\1\uffff\1\5\13\uffff\1\5\1\uffff\1\5"+
            "\13\uffff\1\5\4\uffff\1\5\11\uffff\1\5\5\uffff\1\5\21\uffff"+
            "\1\5\34\uffff\1\5\27\uffff\1\5\14\uffff\1\5\35\uffff\1\5\24"+
            "\uffff\1\5\1\uffff\1\5\22\uffff\1\5",
            "",
            "",
            "\1\5\56\uffff\1\5\50\uffff\1\5\11\uffff\1\5\25\uffff\1\5\4"+
            "\uffff\1\5\1\uffff\1\5\13\uffff\1\5\1\uffff\1\5\13\uffff\1\5"+
            "\4\uffff\1\5\11\uffff\1\5\5\uffff\1\5\21\uffff\1\5\34\uffff"+
            "\1\5\27\uffff\1\5\14\uffff\1\5\35\uffff\1\5\20\uffff\1\2\3\uffff"+
            "\1\5\1\uffff\1\5\22\uffff\1\5",
            "\1\5\47\uffff\1\2\6\uffff\1\5\50\uffff\1\5\11\uffff\1\5\25"+
            "\uffff\1\5\4\uffff\1\5\1\uffff\1\5\13\uffff\1\5\1\uffff\1\5"+
            "\13\uffff\1\5\4\uffff\1\5\11\uffff\1\5\5\uffff\1\5\21\uffff"+
            "\1\5\34\uffff\1\5\27\uffff\1\5\14\uffff\1\5\35\uffff\1\5\24"+
            "\uffff\1\5\1\uffff\1\5\22\uffff\1\5",
            "\1\5\47\uffff\1\2\6\uffff\1\5\50\uffff\1\5\11\uffff\1\5\25"+
            "\uffff\1\5\4\uffff\1\5\1\uffff\1\5\13\uffff\1\5\1\uffff\1\5"+
            "\13\uffff\1\5\4\uffff\1\5\11\uffff\1\5\5\uffff\1\5\21\uffff"+
            "\1\5\34\uffff\1\5\27\uffff\1\5\14\uffff\1\5\35\uffff\1\5\24"+
            "\uffff\1\5\1\uffff\1\5\22\uffff\1\5",
            "\1\5\56\uffff\1\5\50\uffff\1\5\11\uffff\1\5\25\uffff\1\5\4"+
            "\uffff\1\5\1\uffff\1\5\13\uffff\1\5\1\uffff\1\5\13\uffff\1\5"+
            "\4\uffff\1\5\11\uffff\1\5\5\uffff\1\5\21\uffff\1\5\34\uffff"+
            "\1\5\27\uffff\1\5\14\uffff\1\5\35\uffff\1\5\24\uffff\1\5\1\uffff"+
            "\1\5\15\uffff\1\2\4\uffff\1\5",
            "",
            "",
            "\1\5\56\uffff\1\5\50\uffff\1\5\11\uffff\1\5\25\uffff\1\5\4"+
            "\uffff\1\5\1\uffff\1\5\13\uffff\1\5\1\uffff\1\5\1\uffff\1\2"+
            "\11\uffff\1\5\4\uffff\1\5\11\uffff\1\5\5\uffff\1\5\21\uffff"+
            "\1\5\5\uffff\1\2\26\uffff\1\5\27\uffff\1\5\14\uffff\1\5\35\uffff"+
            "\1\5\24\uffff\1\5\1\uffff\1\5\22\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "133:9: ( KW_AS )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_79 = input.LA(1);

                         
                        int index14_79 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index14_79);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_96 = input.LA(1);

                         
                        int index14_96 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index14_96);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_97 = input.LA(1);

                         
                        int index14_97 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index14_97);

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_98 = input.LA(1);

                         
                        int index14_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index14_98);

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_104 = input.LA(1);

                         
                        int index14_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index14_104);

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_121 = input.LA(1);

                         
                        int index14_121 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index14_121);

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_122 = input.LA(1);

                         
                        int index14_122 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index14_122);

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_123 = input.LA(1);

                         
                        int index14_123 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index14_123);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA19_eotS =
        "\103\uffff";
    static final String DFA19_eofS =
        "\103\uffff";
    static final String DFA19_minS =
        "\1\33\3\12\77\uffff";
    static final String DFA19_maxS =
        "\1\u022e\3\u0154\77\uffff";
    static final String DFA19_acceptS =
        "\4\uffff\1\1\1\uffff\1\2\74\uffff";
    static final String DFA19_specialS =
        "\103\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\4\2\2\3\1\2\1\uffff\1\2\2\3\1\2\1\3\2\2\5\3\2\2\1\3\2\2"+
            "\2\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\1\3"+
            "\1\2\1\3\1\uffff\1\3\1\uffff\3\3\1\2\1\uffff\1\2\1\3\3\2\1\3"+
            "\2\2\1\3\3\2\1\3\3\2\1\uffff\1\2\1\3\1\2\1\3\2\2\1\uffff\1\2"+
            "\1\uffff\1\2\2\uffff\1\2\1\3\2\2\1\uffff\1\3\1\uffff\2\3\4\2"+
            "\1\3\2\uffff\2\3\2\2\1\uffff\1\3\1\uffff\1\2\3\3\1\uffff\2\2"+
            "\1\uffff\2\3\2\2\1\3\3\2\3\3\1\uffff\2\3\3\2\1\uffff\4\2\2\3"+
            "\1\uffff\1\2\1\3\3\2\1\3\5\2\2\uffff\5\2\1\uffff\2\2\1\uffff"+
            "\1\2\1\3\2\2\1\uffff\1\2\1\3\1\2\1\3\1\2\2\uffff\1\2\1\uffff"+
            "\3\3\2\2\1\uffff\2\2\1\uffff\1\3\2\2\1\3\1\2\3\uffff\1\2\1\3"+
            "\1\2\1\3\2\2\1\3\1\2\1\3\3\2\1\uffff\2\3\10\2\1\3\1\2\2\3\2"+
            "\2\1\uffff\3\3\3\2\1\uffff\4\2\1\3\5\2\1\3\4\2\1\uffff\6\2\1"+
            "\3\1\2\1\uffff\3\2\1\uffff\1\3\1\2\1\3\3\2\1\uffff\3\3\1\2\1"+
            "\uffff\1\2\1\3\1\2\1\uffff\3\2\1\3\2\2\2\3\3\2\1\3\1\2\1\uffff"+
            "\3\2\2\uffff\1\2\1\uffff\1\3\3\2\70\uffff\1\2\46\uffff\1\2\61"+
            "\uffff\1\2\3\uffff\1\2\61\uffff\1\2\3\uffff\1\2\27\uffff\1\2"+
            "\4\uffff\1\2",
            "\1\4\32\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff"+
            "\1\6\14\uffff\1\6\27\uffff\1\6\32\uffff\1\6\33\uffff\1\6\127"+
            "\uffff\1\6\11\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1"+
            "\6\31\uffff\1\4",
            "\1\4\32\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff"+
            "\1\6\14\uffff\1\6\27\uffff\1\6\32\uffff\1\6\33\uffff\1\6\127"+
            "\uffff\1\6\11\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1"+
            "\6\31\uffff\1\4",
            "\1\4\32\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff"+
            "\1\6\14\uffff\1\6\27\uffff\1\6\32\uffff\1\6\33\uffff\1\6\127"+
            "\uffff\1\6\11\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1"+
            "\6\31\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "145:22: ( aliasList | columnNameTypeList )";
        }
    }
    static final String DFA20_eotS =
        "\u00e2\uffff";
    static final String DFA20_eofS =
        "\1\uffff\3\4\u00de\uffff";
    static final String DFA20_minS =
        "\1\33\3\12\26\uffff\1\7\51\uffff\1\7\51\uffff\1\7\163\uffff";
    static final String DFA20_maxS =
        "\1\u022e\3\u0154\26\uffff\1\u022e\51\uffff\1\u022e\51\uffff\1\u022e"+
        "\163\uffff";
    static final String DFA20_acceptS =
        "\4\uffff\1\1\27\uffff\1\2\u00c5\uffff";
    static final String DFA20_specialS =
        "\u00e2\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\4\2\2\3\1\2\1\uffff\1\2\2\3\1\2\1\3\2\2\5\3\2\2\1\3\2\2"+
            "\2\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\1\3"+
            "\1\2\1\3\1\uffff\1\3\1\uffff\3\3\1\2\1\uffff\1\2\1\3\3\2\1\3"+
            "\2\2\1\3\3\2\1\3\3\2\1\uffff\1\2\1\3\1\2\1\3\2\2\1\uffff\1\2"+
            "\1\uffff\1\2\2\uffff\1\2\1\3\2\2\1\uffff\1\3\1\uffff\2\3\4\2"+
            "\1\3\2\uffff\2\3\2\2\1\uffff\1\3\1\uffff\1\2\3\3\1\uffff\2\2"+
            "\1\uffff\2\3\2\2\1\3\3\2\3\3\1\uffff\2\3\3\2\1\uffff\4\2\2\3"+
            "\1\uffff\1\2\1\3\3\2\1\3\5\2\2\uffff\5\2\1\uffff\2\2\1\uffff"+
            "\1\2\1\3\2\2\1\uffff\1\2\1\3\1\2\1\3\1\2\2\uffff\1\2\1\uffff"+
            "\3\3\2\2\1\uffff\2\2\1\uffff\1\3\2\2\1\3\1\2\3\uffff\1\2\1\3"+
            "\1\2\1\3\2\2\1\3\1\2\1\3\3\2\1\uffff\2\3\10\2\1\3\1\2\2\3\2"+
            "\2\1\uffff\3\3\3\2\1\uffff\4\2\1\3\5\2\1\3\4\2\1\uffff\6\2\1"+
            "\3\1\2\1\uffff\3\2\1\uffff\1\3\1\2\1\3\3\2\1\uffff\3\3\1\2\1"+
            "\uffff\1\2\1\3\1\2\1\uffff\3\2\1\3\2\2\2\3\3\2\1\3\1\2\1\uffff"+
            "\3\2\2\uffff\1\2\1\uffff\1\3\3\2\70\uffff\1\2\46\uffff\1\2\61"+
            "\uffff\1\2\3\uffff\1\2\61\uffff\1\2\3\uffff\1\2\27\uffff\1\2"+
            "\4\uffff\1\2",
            "\1\4\32\uffff\1\34\6\uffff\3\34\11\uffff\1\34\1\4\30\uffff"+
            "\2\34\2\uffff\1\34\13\uffff\1\4\1\34\10\uffff\1\4\16\uffff\1"+
            "\34\6\uffff\1\4\4\uffff\1\4\1\uffff\1\4\13\uffff\1\4\1\34\1"+
            "\4\13\uffff\1\4\4\uffff\1\4\11\uffff\1\32\5\uffff\1\4\21\uffff"+
            "\1\4\32\uffff\1\4\1\uffff\1\4\22\uffff\1\4\4\uffff\1\4\12\uffff"+
            "\1\34\1\uffff\1\4\7\uffff\2\34\7\uffff\2\34\13\uffff\1\4\1\34"+
            "\16\uffff\1\34\4\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
            "\1\4\32\uffff\1\34\6\uffff\3\34\11\uffff\1\34\1\4\30\uffff"+
            "\2\34\2\uffff\1\34\13\uffff\1\4\1\34\10\uffff\1\4\16\uffff\1"+
            "\34\6\uffff\1\4\4\uffff\1\4\1\uffff\1\4\13\uffff\1\4\1\34\1"+
            "\4\13\uffff\1\4\4\uffff\1\4\11\uffff\1\104\5\uffff\1\4\21\uffff"+
            "\1\4\32\uffff\1\4\1\uffff\1\4\22\uffff\1\4\4\uffff\1\4\12\uffff"+
            "\1\34\1\uffff\1\4\7\uffff\2\34\7\uffff\2\34\13\uffff\1\4\1\34"+
            "\16\uffff\1\34\4\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
            "\1\4\32\uffff\1\34\6\uffff\3\34\11\uffff\1\34\1\4\30\uffff"+
            "\2\34\2\uffff\1\34\13\uffff\1\4\1\34\10\uffff\1\4\16\uffff\1"+
            "\34\6\uffff\1\4\4\uffff\1\4\1\uffff\1\4\13\uffff\1\4\1\34\1"+
            "\4\13\uffff\1\4\4\uffff\1\4\11\uffff\1\156\5\uffff\1\4\21\uffff"+
            "\1\4\32\uffff\1\4\1\uffff\1\4\22\uffff\1\4\4\uffff\1\4\12\uffff"+
            "\1\34\1\uffff\1\4\7\uffff\2\34\7\uffff\2\34\13\uffff\1\4\1\34"+
            "\16\uffff\1\34\4\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\6\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\24\4\1\uffff"+
            "\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff"+
            "\4\4\1\uffff\20\4\1\uffff\6\4\1\uffff\1\4\1\uffff\1\4\2\uffff"+
            "\4\4\1\uffff\12\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
            "\24\4\1\uffff\6\4\1\uffff\13\4\1\uffff\6\4\1\uffff\2\4\1\uffff"+
            "\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff\2\4\1\uffff\5\4\3\uffff"+
            "\14\4\1\uffff\20\4\1\uffff\6\4\1\uffff\17\4\1\uffff\10\4\1\uffff"+
            "\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15\4\1\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\34\1\uffff\1\4\2\uffff"+
            "\1\4\2\uffff\2\4\7\uffff\5\4\41\uffff\1\4\46\uffff\1\4\61\uffff"+
            "\1\4\3\uffff\1\4\61\uffff\1\4\3\uffff\1\4\27\uffff\1\4\4\uffff"+
            "\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\6\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\24\4\1\uffff"+
            "\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff"+
            "\4\4\1\uffff\20\4\1\uffff\6\4\1\uffff\1\4\1\uffff\1\4\2\uffff"+
            "\4\4\1\uffff\12\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
            "\24\4\1\uffff\6\4\1\uffff\13\4\1\uffff\6\4\1\uffff\2\4\1\uffff"+
            "\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff\2\4\1\uffff\5\4\3\uffff"+
            "\14\4\1\uffff\20\4\1\uffff\6\4\1\uffff\17\4\1\uffff\10\4\1\uffff"+
            "\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15\4\1\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\34\1\uffff\1\4\2\uffff"+
            "\1\4\2\uffff\2\4\7\uffff\5\4\41\uffff\1\4\46\uffff\1\4\61\uffff"+
            "\1\4\3\uffff\1\4\61\uffff\1\4\3\uffff\1\4\27\uffff\1\4\4\uffff"+
            "\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\6\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\24\4\1\uffff"+
            "\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff"+
            "\4\4\1\uffff\20\4\1\uffff\6\4\1\uffff\1\4\1\uffff\1\4\2\uffff"+
            "\4\4\1\uffff\12\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
            "\24\4\1\uffff\6\4\1\uffff\13\4\1\uffff\6\4\1\uffff\2\4\1\uffff"+
            "\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff\2\4\1\uffff\5\4\3\uffff"+
            "\14\4\1\uffff\20\4\1\uffff\6\4\1\uffff\17\4\1\uffff\10\4\1\uffff"+
            "\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15\4\1\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\34\1\uffff\1\4\2\uffff"+
            "\1\4\2\uffff\2\4\7\uffff\5\4\41\uffff\1\4\46\uffff\1\4\61\uffff"+
            "\1\4\3\uffff\1\4\61\uffff\1\4\3\uffff\1\4\27\uffff\1\4\4\uffff"+
            "\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "145:65: ( aliasList | columnNameTypeList )";
        }
    }
    static final String DFA23_eotS =
        "\u01b5\uffff";
    static final String DFA23_eofS =
        "\u01b5\uffff";
    static final String DFA23_minS =
        "\1\7\1\uffff\3\4\4\uffff\4\4\5\uffff\3\4\7\uffff\1\4\1\uffff\2\4"+
        "\1\33\32\uffff\1\33\33\uffff\1\33\32\uffff\1\33\33\uffff\1\33\32"+
        "\uffff\1\33\32\uffff\1\33\32\uffff\1\33\32\uffff\1\33\32\uffff\1"+
        "\33\32\uffff\1\33\32\uffff\1\33\32\uffff\1\33\33\uffff\3\0\1\uffff"+
        "\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0"+
        "\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff"+
        "\3\0";
    static final String DFA23_maxS =
        "\1\u022e\1\uffff\2\u0158\1\u015a\4\uffff\1\u0158\1\u015a\2\u0158"+
        "\5\uffff\3\u0158\7\uffff\1\u0158\1\uffff\2\u0158\1\u022e\32\uffff"+
        "\1\u022e\33\uffff\1\u022e\32\uffff\1\u022e\33\uffff\1\u022e\32\uffff"+
        "\1\u022e\32\uffff\1\u022e\32\uffff\1\u022e\32\uffff\1\u022e\32\uffff"+
        "\1\u022e\32\uffff\1\u022e\32\uffff\1\u022e\32\uffff\1\u022e\33\uffff"+
        "\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0"+
        "\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff"+
        "\3\0\1\uffff\3\0";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\u017b\uffff\1\1\3\uffff\1\1\3\uffff\1\1"+
        "\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff"+
        "\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff";
    static final String DFA23_specialS =
        "\1\0\37\uffff\1\1\32\uffff\1\2\33\uffff\1\3\32\uffff\1\4\33\uffff"+
        "\1\5\32\uffff\1\6\32\uffff\1\7\32\uffff\1\10\32\uffff\1\11\32\uffff"+
        "\1\12\32\uffff\1\13\32\uffff\1\14\32\uffff\1\15\33\uffff\1\16\1"+
        "\17\1\20\1\uffff\1\21\1\22\1\23\1\uffff\1\24\1\25\1\26\1\uffff\1"+
        "\27\1\30\1\31\1\uffff\1\32\1\33\1\34\1\uffff\1\35\1\36\1\37\1\uffff"+
        "\1\40\1\41\1\42\1\uffff\1\43\1\44\1\45\1\uffff\1\46\1\47\1\50\1"+
        "\uffff\1\51\1\52\1\53\1\uffff\1\54\1\55\1\56\1\uffff\1\57\1\60\1"+
        "\61\1\uffff\1\62\1\63\1\64}>";
    static final String[] DFA23_transitionS = {
            "\1\5\6\uffff\1\5\4\uffff\1\5\7\uffff\1\2\4\3\2\37\1\3\1\uffff"+
            "\1\3\1\24\1\37\1\3\1\37\2\3\1\37\3\34\1\37\2\3\1\37\2\3\2\5"+
            "\1\3\1\uffff\4\3\1\uffff\2\3\1\uffff\4\3\1\uffff\1\37\1\3\1"+
            "\37\1\uffff\1\37\1\uffff\1\11\1\13\1\37\1\3\1\uffff\1\3\1\4"+
            "\3\3\1\37\2\3\1\37\3\3\1\37\3\3\1\uffff\1\3\1\34\1\3\1\37\2"+
            "\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\36\2\3\1\uffff\1\37"+
            "\1\5\1\22\1\37\4\3\1\34\1\5\1\uffff\2\37\2\3\1\uffff\1\37\1"+
            "\uffff\1\3\2\37\1\34\1\uffff\2\3\1\5\2\37\2\3\1\37\3\3\1\37"+
            "\1\34\1\37\1\5\2\37\3\3\1\uffff\4\3\2\37\1\uffff\1\3\1\37\3"+
            "\3\1\37\5\3\1\uffff\1\5\5\3\1\uffff\2\3\1\uffff\1\3\1\37\2\3"+
            "\1\5\1\3\1\23\1\3\1\37\1\3\2\uffff\1\3\1\uffff\3\37\2\3\1\uffff"+
            "\2\3\1\uffff\1\37\2\3\1\37\1\3\3\uffff\1\3\1\37\1\3\1\37\2\3"+
            "\1\37\1\3\1\37\3\3\1\uffff\2\37\10\3\1\37\1\3\2\37\2\3\1\uffff"+
            "\3\37\3\3\1\uffff\4\3\1\37\5\3\1\34\4\3\1\uffff\6\3\1\37\1\3"+
            "\1\uffff\3\3\1\uffff\1\12\1\3\1\37\3\3\1\uffff\1\37\1\14\1\37"+
            "\1\3\1\uffff\1\3\1\37\1\3\1\uffff\3\3\1\37\2\3\2\37\3\3\1\37"+
            "\1\3\1\uffff\3\3\2\uffff\1\3\1\uffff\1\37\3\3\3\uffff\1\5\2"+
            "\uffff\1\5\2\uffff\2\5\7\uffff\1\1\4\5\41\uffff\1\3\46\uffff"+
            "\1\3\61\uffff\1\3\3\uffff\1\3\61\uffff\1\3\3\uffff\1\3\27\uffff"+
            "\1\3\4\uffff\1\3",
            "",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\40\2\uffff"+
            "\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1\5\13\uffff"+
            "\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\73\2\uffff"+
            "\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1\5\13\uffff"+
            "\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\127\2\uffff"+
            "\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1\5\13\uffff"+
            "\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\162\2\uffff"+
            "\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1\5\13\uffff"+
            "\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff\4\5\1\uffff"+
            "\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u008e\2"+
            "\uffff\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1"+
            "\5\13\uffff\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff"+
            "\1\5\2\uffff\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff"+
            "\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u00a9\2"+
            "\uffff\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1"+
            "\5\13\uffff\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff"+
            "\1\5\2\uffff\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff"+
            "\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u00c4\2"+
            "\uffff\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1"+
            "\5\13\uffff\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff"+
            "\1\5\2\uffff\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff"+
            "\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u00df\2"+
            "\uffff\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1"+
            "\5\13\uffff\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff"+
            "\1\5\2\uffff\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff"+
            "\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u00fa\2"+
            "\uffff\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1"+
            "\5\13\uffff\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff"+
            "\1\5\2\uffff\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff"+
            "\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u0115\2"+
            "\uffff\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1"+
            "\5\13\uffff\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff"+
            "\1\5\2\uffff\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff"+
            "\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u0130\2"+
            "\uffff\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1"+
            "\5\13\uffff\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff"+
            "\1\5\2\uffff\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff"+
            "\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5",
            "",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u014b\2"+
            "\uffff\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1"+
            "\5\13\uffff\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff"+
            "\1\5\2\uffff\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff"+
            "\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5",
            "\3\5\3\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\uffff\1\u0166\2"+
            "\uffff\2\5\1\uffff\2\5\11\uffff\1\5\7\uffff\1\5\142\uffff\1"+
            "\5\13\uffff\1\5\14\uffff\1\5\30\uffff\1\5\10\uffff\1\5\34\uffff"+
            "\1\5\2\uffff\1\5\13\uffff\1\5\4\uffff\1\5\71\uffff\1\5\22\uffff"+
            "\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5",
            "\1\u0182\4\u0183\2\u0184\1\u0183\1\uffff\1\u0183\2\u0184\1"+
            "\u0183\1\u0184\2\u0183\5\u0184\2\u0183\1\u0184\2\u0183\2\uffff"+
            "\1\u0183\1\uffff\4\u0183\1\uffff\2\u0183\1\uffff\4\u0183\1\uffff"+
            "\1\u0184\1\u0183\1\u0184\1\uffff\1\u0184\1\uffff\3\u0184\1\u0183"+
            "\1\uffff\1\u0183\1\u0184\3\u0183\1\u0184\2\u0183\1\u0184\3\u0183"+
            "\1\u0184\3\u0183\1\uffff\1\u0183\1\u0184\1\u0183\1\u0184\2\u0183"+
            "\1\uffff\1\u0183\1\uffff\1\u0183\2\uffff\1\u0183\1\u0184\2\u0183"+
            "\1\uffff\1\u0184\1\uffff\2\u0184\4\u0183\1\u0184\2\uffff\2\u0184"+
            "\2\u0183\1\uffff\1\u0184\1\uffff\1\u0183\3\u0184\1\uffff\2\u0183"+
            "\1\uffff\2\u0184\2\u0183\1\u0184\3\u0183\3\u0184\1\uffff\2\u0184"+
            "\3\u0183\1\uffff\4\u0183\2\u0184\1\uffff\1\u0183\1\u0184\3\u0183"+
            "\1\u0184\5\u0183\2\uffff\5\u0183\1\uffff\2\u0183\1\uffff\1\u0183"+
            "\1\u0184\2\u0183\1\uffff\1\u0183\1\u0184\1\u0183\1\u0184\1\u0183"+
            "\2\uffff\1\u0183\1\uffff\3\u0184\2\u0183\1\uffff\2\u0183\1\uffff"+
            "\1\u0184\2\u0183\1\u0184\1\u0183\3\uffff\1\u0183\1\u0184\1\u0183"+
            "\1\u0184\2\u0183\1\u0184\1\u0183\1\u0184\3\u0183\1\uffff\2\u0184"+
            "\10\u0183\1\u0184\1\u0183\2\u0184\2\u0183\1\uffff\3\u0184\3"+
            "\u0183\1\uffff\4\u0183\1\u0184\5\u0183\1\u0184\4\u0183\1\uffff"+
            "\6\u0183\1\u0184\1\u0183\1\uffff\3\u0183\1\uffff\1\u0184\1\u0183"+
            "\1\u0184\3\u0183\1\uffff\3\u0184\1\u0183\1\uffff\1\u0183\1\u0184"+
            "\1\u0183\1\uffff\3\u0183\1\u0184\2\u0183\2\u0184\3\u0183\1\u0184"+
            "\1\u0183\1\uffff\3\u0183\2\uffff\1\u0183\1\uffff\1\u0184\3\u0183"+
            "\22\uffff\1\u0181\45\uffff\1\u0183\46\uffff\1\u0183\61\uffff"+
            "\1\u0183\3\uffff\1\u0183\61\uffff\1\u0183\3\uffff\1\u0183\27"+
            "\uffff\1\u0183\4\uffff\1\u0183",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0186\4\u0187\2\u0188\1\u0187\1\uffff\1\u0187\2\u0188\1"+
            "\u0187\1\u0188\2\u0187\5\u0188\2\u0187\1\u0188\2\u0187\2\uffff"+
            "\1\u0187\1\uffff\4\u0187\1\uffff\2\u0187\1\uffff\4\u0187\1\uffff"+
            "\1\u0188\1\u0187\1\u0188\1\uffff\1\u0188\1\uffff\3\u0188\1\u0187"+
            "\1\uffff\1\u0187\1\u0188\3\u0187\1\u0188\2\u0187\1\u0188\3\u0187"+
            "\1\u0188\3\u0187\1\uffff\1\u0187\1\u0188\1\u0187\1\u0188\2\u0187"+
            "\1\uffff\1\u0187\1\uffff\1\u0187\2\uffff\1\u0187\1\u0188\2\u0187"+
            "\1\uffff\1\u0188\1\uffff\2\u0188\4\u0187\1\u0188\2\uffff\2\u0188"+
            "\2\u0187\1\uffff\1\u0188\1\uffff\1\u0187\3\u0188\1\uffff\2\u0187"+
            "\1\uffff\2\u0188\2\u0187\1\u0188\3\u0187\3\u0188\1\uffff\2\u0188"+
            "\3\u0187\1\uffff\4\u0187\2\u0188\1\uffff\1\u0187\1\u0188\3\u0187"+
            "\1\u0188\5\u0187\2\uffff\5\u0187\1\uffff\2\u0187\1\uffff\1\u0187"+
            "\1\u0188\2\u0187\1\uffff\1\u0187\1\u0188\1\u0187\1\u0188\1\u0187"+
            "\2\uffff\1\u0187\1\uffff\3\u0188\2\u0187\1\uffff\2\u0187\1\uffff"+
            "\1\u0188\2\u0187\1\u0188\1\u0187\3\uffff\1\u0187\1\u0188\1\u0187"+
            "\1\u0188\2\u0187\1\u0188\1\u0187\1\u0188\3\u0187\1\uffff\2\u0188"+
            "\10\u0187\1\u0188\1\u0187\2\u0188\2\u0187\1\uffff\3\u0188\3"+
            "\u0187\1\uffff\4\u0187\1\u0188\5\u0187\1\u0188\4\u0187\1\uffff"+
            "\6\u0187\1\u0188\1\u0187\1\uffff\3\u0187\1\uffff\1\u0188\1\u0187"+
            "\1\u0188\3\u0187\1\uffff\3\u0188\1\u0187\1\uffff\1\u0187\1\u0188"+
            "\1\u0187\1\uffff\3\u0187\1\u0188\2\u0187\2\u0188\3\u0187\1\u0188"+
            "\1\u0187\1\uffff\3\u0187\2\uffff\1\u0187\1\uffff\1\u0188\3\u0187"+
            "\22\uffff\1\u0185\45\uffff\1\u0187\46\uffff\1\u0187\61\uffff"+
            "\1\u0187\3\uffff\1\u0187\61\uffff\1\u0187\3\uffff\1\u0187\27"+
            "\uffff\1\u0187\4\uffff\1\u0187",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u018a\4\u018b\2\u018c\1\u018b\1\uffff\1\u018b\2\u018c\1"+
            "\u018b\1\u018c\2\u018b\5\u018c\2\u018b\1\u018c\2\u018b\2\uffff"+
            "\1\u018b\1\uffff\4\u018b\1\uffff\2\u018b\1\uffff\4\u018b\1\uffff"+
            "\1\u018c\1\u018b\1\u018c\1\uffff\1\u018c\1\uffff\3\u018c\1\u018b"+
            "\1\uffff\1\u018b\1\u018c\3\u018b\1\u018c\2\u018b\1\u018c\3\u018b"+
            "\1\u018c\3\u018b\1\uffff\1\u018b\1\u018c\1\u018b\1\u018c\2\u018b"+
            "\1\uffff\1\u018b\1\uffff\1\u018b\2\uffff\1\u018b\1\u018c\2\u018b"+
            "\1\uffff\1\u018c\1\uffff\2\u018c\4\u018b\1\u018c\2\uffff\2\u018c"+
            "\2\u018b\1\uffff\1\u018c\1\uffff\1\u018b\3\u018c\1\uffff\2\u018b"+
            "\1\uffff\2\u018c\2\u018b\1\u018c\3\u018b\3\u018c\1\uffff\2\u018c"+
            "\3\u018b\1\uffff\4\u018b\2\u018c\1\uffff\1\u018b\1\u018c\3\u018b"+
            "\1\u018c\5\u018b\2\uffff\5\u018b\1\uffff\2\u018b\1\uffff\1\u018b"+
            "\1\u018c\2\u018b\1\uffff\1\u018b\1\u018c\1\u018b\1\u018c\1\u018b"+
            "\2\uffff\1\u018b\1\uffff\3\u018c\2\u018b\1\uffff\2\u018b\1\uffff"+
            "\1\u018c\2\u018b\1\u018c\1\u018b\3\uffff\1\u018b\1\u018c\1\u018b"+
            "\1\u018c\2\u018b\1\u018c\1\u018b\1\u018c\3\u018b\1\uffff\2\u018c"+
            "\10\u018b\1\u018c\1\u018b\2\u018c\2\u018b\1\uffff\3\u018c\3"+
            "\u018b\1\uffff\4\u018b\1\u018c\5\u018b\1\u018c\4\u018b\1\uffff"+
            "\6\u018b\1\u018c\1\u018b\1\uffff\3\u018b\1\uffff\1\u018c\1\u018b"+
            "\1\u018c\3\u018b\1\uffff\3\u018c\1\u018b\1\uffff\1\u018b\1\u018c"+
            "\1\u018b\1\uffff\3\u018b\1\u018c\2\u018b\2\u018c\3\u018b\1\u018c"+
            "\1\u018b\1\uffff\3\u018b\2\uffff\1\u018b\1\uffff\1\u018c\3\u018b"+
            "\22\uffff\1\u0189\45\uffff\1\u018b\46\uffff\1\u018b\61\uffff"+
            "\1\u018b\3\uffff\1\u018b\61\uffff\1\u018b\3\uffff\1\u018b\27"+
            "\uffff\1\u018b\4\uffff\1\u018b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u018e\4\u018f\2\u0190\1\u018f\1\uffff\1\u018f\2\u0190\1"+
            "\u018f\1\u0190\2\u018f\5\u0190\2\u018f\1\u0190\2\u018f\2\uffff"+
            "\1\u018f\1\uffff\4\u018f\1\uffff\2\u018f\1\uffff\4\u018f\1\uffff"+
            "\1\u0190\1\u018f\1\u0190\1\uffff\1\u0190\1\uffff\3\u0190\1\u018f"+
            "\1\uffff\1\u018f\1\u0190\3\u018f\1\u0190\2\u018f\1\u0190\3\u018f"+
            "\1\u0190\3\u018f\1\uffff\1\u018f\1\u0190\1\u018f\1\u0190\2\u018f"+
            "\1\uffff\1\u018f\1\uffff\1\u018f\2\uffff\1\u018f\1\u0190\2\u018f"+
            "\1\uffff\1\u0190\1\uffff\2\u0190\4\u018f\1\u0190\2\uffff\2\u0190"+
            "\2\u018f\1\uffff\1\u0190\1\uffff\1\u018f\3\u0190\1\uffff\2\u018f"+
            "\1\uffff\2\u0190\2\u018f\1\u0190\3\u018f\3\u0190\1\uffff\2\u0190"+
            "\3\u018f\1\uffff\4\u018f\2\u0190\1\uffff\1\u018f\1\u0190\3\u018f"+
            "\1\u0190\5\u018f\2\uffff\5\u018f\1\uffff\2\u018f\1\uffff\1\u018f"+
            "\1\u0190\2\u018f\1\uffff\1\u018f\1\u0190\1\u018f\1\u0190\1\u018f"+
            "\2\uffff\1\u018f\1\uffff\3\u0190\2\u018f\1\uffff\2\u018f\1\uffff"+
            "\1\u0190\2\u018f\1\u0190\1\u018f\3\uffff\1\u018f\1\u0190\1\u018f"+
            "\1\u0190\2\u018f\1\u0190\1\u018f\1\u0190\3\u018f\1\uffff\2\u0190"+
            "\10\u018f\1\u0190\1\u018f\2\u0190\2\u018f\1\uffff\3\u0190\3"+
            "\u018f\1\uffff\4\u018f\1\u0190\5\u018f\1\u0190\4\u018f\1\uffff"+
            "\6\u018f\1\u0190\1\u018f\1\uffff\3\u018f\1\uffff\1\u0190\1\u018f"+
            "\1\u0190\3\u018f\1\uffff\3\u0190\1\u018f\1\uffff\1\u018f\1\u0190"+
            "\1\u018f\1\uffff\3\u018f\1\u0190\2\u018f\2\u0190\3\u018f\1\u0190"+
            "\1\u018f\1\uffff\3\u018f\2\uffff\1\u018f\1\uffff\1\u0190\3\u018f"+
            "\22\uffff\1\u018d\45\uffff\1\u018f\46\uffff\1\u018f\61\uffff"+
            "\1\u018f\3\uffff\1\u018f\61\uffff\1\u018f\3\uffff\1\u018f\27"+
            "\uffff\1\u018f\4\uffff\1\u018f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0192\4\u0193\2\u0194\1\u0193\1\uffff\1\u0193\2\u0194\1"+
            "\u0193\1\u0194\2\u0193\5\u0194\2\u0193\1\u0194\2\u0193\2\uffff"+
            "\1\u0193\1\uffff\4\u0193\1\uffff\2\u0193\1\uffff\4\u0193\1\uffff"+
            "\1\u0194\1\u0193\1\u0194\1\uffff\1\u0194\1\uffff\3\u0194\1\u0193"+
            "\1\uffff\1\u0193\1\u0194\3\u0193\1\u0194\2\u0193\1\u0194\3\u0193"+
            "\1\u0194\3\u0193\1\uffff\1\u0193\1\u0194\1\u0193\1\u0194\2\u0193"+
            "\1\uffff\1\u0193\1\uffff\1\u0193\2\uffff\1\u0193\1\u0194\2\u0193"+
            "\1\uffff\1\u0194\1\uffff\2\u0194\4\u0193\1\u0194\2\uffff\2\u0194"+
            "\2\u0193\1\uffff\1\u0194\1\uffff\1\u0193\3\u0194\1\uffff\2\u0193"+
            "\1\uffff\2\u0194\2\u0193\1\u0194\3\u0193\3\u0194\1\uffff\2\u0194"+
            "\3\u0193\1\uffff\4\u0193\2\u0194\1\uffff\1\u0193\1\u0194\3\u0193"+
            "\1\u0194\5\u0193\2\uffff\5\u0193\1\uffff\2\u0193\1\uffff\1\u0193"+
            "\1\u0194\2\u0193\1\uffff\1\u0193\1\u0194\1\u0193\1\u0194\1\u0193"+
            "\2\uffff\1\u0193\1\uffff\3\u0194\2\u0193\1\uffff\2\u0193\1\uffff"+
            "\1\u0194\2\u0193\1\u0194\1\u0193\3\uffff\1\u0193\1\u0194\1\u0193"+
            "\1\u0194\2\u0193\1\u0194\1\u0193\1\u0194\3\u0193\1\uffff\2\u0194"+
            "\10\u0193\1\u0194\1\u0193\2\u0194\2\u0193\1\uffff\3\u0194\3"+
            "\u0193\1\uffff\4\u0193\1\u0194\5\u0193\1\u0194\4\u0193\1\uffff"+
            "\6\u0193\1\u0194\1\u0193\1\uffff\3\u0193\1\uffff\1\u0194\1\u0193"+
            "\1\u0194\3\u0193\1\uffff\3\u0194\1\u0193\1\uffff\1\u0193\1\u0194"+
            "\1\u0193\1\uffff\3\u0193\1\u0194\2\u0193\2\u0194\3\u0193\1\u0194"+
            "\1\u0193\1\uffff\3\u0193\2\uffff\1\u0193\1\uffff\1\u0194\3\u0193"+
            "\22\uffff\1\u0191\45\uffff\1\u0193\46\uffff\1\u0193\61\uffff"+
            "\1\u0193\3\uffff\1\u0193\61\uffff\1\u0193\3\uffff\1\u0193\27"+
            "\uffff\1\u0193\4\uffff\1\u0193",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0196\4\u0197\2\u0198\1\u0197\1\uffff\1\u0197\2\u0198\1"+
            "\u0197\1\u0198\2\u0197\5\u0198\2\u0197\1\u0198\2\u0197\2\uffff"+
            "\1\u0197\1\uffff\4\u0197\1\uffff\2\u0197\1\uffff\4\u0197\1\uffff"+
            "\1\u0198\1\u0197\1\u0198\1\uffff\1\u0198\1\uffff\3\u0198\1\u0197"+
            "\1\uffff\1\u0197\1\u0198\3\u0197\1\u0198\2\u0197\1\u0198\3\u0197"+
            "\1\u0198\3\u0197\1\uffff\1\u0197\1\u0198\1\u0197\1\u0198\2\u0197"+
            "\1\uffff\1\u0197\1\uffff\1\u0197\2\uffff\1\u0197\1\u0198\2\u0197"+
            "\1\uffff\1\u0198\1\uffff\2\u0198\4\u0197\1\u0198\2\uffff\2\u0198"+
            "\2\u0197\1\uffff\1\u0198\1\uffff\1\u0197\3\u0198\1\uffff\2\u0197"+
            "\1\uffff\2\u0198\2\u0197\1\u0198\3\u0197\3\u0198\1\uffff\2\u0198"+
            "\3\u0197\1\uffff\4\u0197\2\u0198\1\uffff\1\u0197\1\u0198\3\u0197"+
            "\1\u0198\5\u0197\2\uffff\5\u0197\1\uffff\2\u0197\1\uffff\1\u0197"+
            "\1\u0198\2\u0197\1\uffff\1\u0197\1\u0198\1\u0197\1\u0198\1\u0197"+
            "\2\uffff\1\u0197\1\uffff\3\u0198\2\u0197\1\uffff\2\u0197\1\uffff"+
            "\1\u0198\2\u0197\1\u0198\1\u0197\3\uffff\1\u0197\1\u0198\1\u0197"+
            "\1\u0198\2\u0197\1\u0198\1\u0197\1\u0198\3\u0197\1\uffff\2\u0198"+
            "\10\u0197\1\u0198\1\u0197\2\u0198\2\u0197\1\uffff\3\u0198\3"+
            "\u0197\1\uffff\4\u0197\1\u0198\5\u0197\1\u0198\4\u0197\1\uffff"+
            "\6\u0197\1\u0198\1\u0197\1\uffff\3\u0197\1\uffff\1\u0198\1\u0197"+
            "\1\u0198\3\u0197\1\uffff\3\u0198\1\u0197\1\uffff\1\u0197\1\u0198"+
            "\1\u0197\1\uffff\3\u0197\1\u0198\2\u0197\2\u0198\3\u0197\1\u0198"+
            "\1\u0197\1\uffff\3\u0197\2\uffff\1\u0197\1\uffff\1\u0198\3\u0197"+
            "\22\uffff\1\u0195\45\uffff\1\u0197\46\uffff\1\u0197\61\uffff"+
            "\1\u0197\3\uffff\1\u0197\61\uffff\1\u0197\3\uffff\1\u0197\27"+
            "\uffff\1\u0197\4\uffff\1\u0197",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u019a\4\u019b\2\u019c\1\u019b\1\uffff\1\u019b\2\u019c\1"+
            "\u019b\1\u019c\2\u019b\5\u019c\2\u019b\1\u019c\2\u019b\2\uffff"+
            "\1\u019b\1\uffff\4\u019b\1\uffff\2\u019b\1\uffff\4\u019b\1\uffff"+
            "\1\u019c\1\u019b\1\u019c\1\uffff\1\u019c\1\uffff\3\u019c\1\u019b"+
            "\1\uffff\1\u019b\1\u019c\3\u019b\1\u019c\2\u019b\1\u019c\3\u019b"+
            "\1\u019c\3\u019b\1\uffff\1\u019b\1\u019c\1\u019b\1\u019c\2\u019b"+
            "\1\uffff\1\u019b\1\uffff\1\u019b\2\uffff\1\u019b\1\u019c\2\u019b"+
            "\1\uffff\1\u019c\1\uffff\2\u019c\4\u019b\1\u019c\2\uffff\2\u019c"+
            "\2\u019b\1\uffff\1\u019c\1\uffff\1\u019b\3\u019c\1\uffff\2\u019b"+
            "\1\uffff\2\u019c\2\u019b\1\u019c\3\u019b\3\u019c\1\uffff\2\u019c"+
            "\3\u019b\1\uffff\4\u019b\2\u019c\1\uffff\1\u019b\1\u019c\3\u019b"+
            "\1\u019c\5\u019b\2\uffff\5\u019b\1\uffff\2\u019b\1\uffff\1\u019b"+
            "\1\u019c\2\u019b\1\uffff\1\u019b\1\u019c\1\u019b\1\u019c\1\u019b"+
            "\2\uffff\1\u019b\1\uffff\3\u019c\2\u019b\1\uffff\2\u019b\1\uffff"+
            "\1\u019c\2\u019b\1\u019c\1\u019b\3\uffff\1\u019b\1\u019c\1\u019b"+
            "\1\u019c\2\u019b\1\u019c\1\u019b\1\u019c\3\u019b\1\uffff\2\u019c"+
            "\10\u019b\1\u019c\1\u019b\2\u019c\2\u019b\1\uffff\3\u019c\3"+
            "\u019b\1\uffff\4\u019b\1\u019c\5\u019b\1\u019c\4\u019b\1\uffff"+
            "\6\u019b\1\u019c\1\u019b\1\uffff\3\u019b\1\uffff\1\u019c\1\u019b"+
            "\1\u019c\3\u019b\1\uffff\3\u019c\1\u019b\1\uffff\1\u019b\1\u019c"+
            "\1\u019b\1\uffff\3\u019b\1\u019c\2\u019b\2\u019c\3\u019b\1\u019c"+
            "\1\u019b\1\uffff\3\u019b\2\uffff\1\u019b\1\uffff\1\u019c\3\u019b"+
            "\22\uffff\1\u0199\45\uffff\1\u019b\46\uffff\1\u019b\61\uffff"+
            "\1\u019b\3\uffff\1\u019b\61\uffff\1\u019b\3\uffff\1\u019b\27"+
            "\uffff\1\u019b\4\uffff\1\u019b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u019e\4\u019f\2\u01a0\1\u019f\1\uffff\1\u019f\2\u01a0\1"+
            "\u019f\1\u01a0\2\u019f\5\u01a0\2\u019f\1\u01a0\2\u019f\2\uffff"+
            "\1\u019f\1\uffff\4\u019f\1\uffff\2\u019f\1\uffff\4\u019f\1\uffff"+
            "\1\u01a0\1\u019f\1\u01a0\1\uffff\1\u01a0\1\uffff\3\u01a0\1\u019f"+
            "\1\uffff\1\u019f\1\u01a0\3\u019f\1\u01a0\2\u019f\1\u01a0\3\u019f"+
            "\1\u01a0\3\u019f\1\uffff\1\u019f\1\u01a0\1\u019f\1\u01a0\2\u019f"+
            "\1\uffff\1\u019f\1\uffff\1\u019f\2\uffff\1\u019f\1\u01a0\2\u019f"+
            "\1\uffff\1\u01a0\1\uffff\2\u01a0\4\u019f\1\u01a0\2\uffff\2\u01a0"+
            "\2\u019f\1\uffff\1\u01a0\1\uffff\1\u019f\3\u01a0\1\uffff\2\u019f"+
            "\1\uffff\2\u01a0\2\u019f\1\u01a0\3\u019f\3\u01a0\1\uffff\2\u01a0"+
            "\3\u019f\1\uffff\4\u019f\2\u01a0\1\uffff\1\u019f\1\u01a0\3\u019f"+
            "\1\u01a0\5\u019f\2\uffff\5\u019f\1\uffff\2\u019f\1\uffff\1\u019f"+
            "\1\u01a0\2\u019f\1\uffff\1\u019f\1\u01a0\1\u019f\1\u01a0\1\u019f"+
            "\2\uffff\1\u019f\1\uffff\3\u01a0\2\u019f\1\uffff\2\u019f\1\uffff"+
            "\1\u01a0\2\u019f\1\u01a0\1\u019f\3\uffff\1\u019f\1\u01a0\1\u019f"+
            "\1\u01a0\2\u019f\1\u01a0\1\u019f\1\u01a0\3\u019f\1\uffff\2\u01a0"+
            "\10\u019f\1\u01a0\1\u019f\2\u01a0\2\u019f\1\uffff\3\u01a0\3"+
            "\u019f\1\uffff\4\u019f\1\u01a0\5\u019f\1\u01a0\4\u019f\1\uffff"+
            "\6\u019f\1\u01a0\1\u019f\1\uffff\3\u019f\1\uffff\1\u01a0\1\u019f"+
            "\1\u01a0\3\u019f\1\uffff\3\u01a0\1\u019f\1\uffff\1\u019f\1\u01a0"+
            "\1\u019f\1\uffff\3\u019f\1\u01a0\2\u019f\2\u01a0\3\u019f\1\u01a0"+
            "\1\u019f\1\uffff\3\u019f\2\uffff\1\u019f\1\uffff\1\u01a0\3\u019f"+
            "\22\uffff\1\u019d\45\uffff\1\u019f\46\uffff\1\u019f\61\uffff"+
            "\1\u019f\3\uffff\1\u019f\61\uffff\1\u019f\3\uffff\1\u019f\27"+
            "\uffff\1\u019f\4\uffff\1\u019f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01a2\4\u01a3\2\u01a4\1\u01a3\1\uffff\1\u01a3\2\u01a4\1"+
            "\u01a3\1\u01a4\2\u01a3\5\u01a4\2\u01a3\1\u01a4\2\u01a3\2\uffff"+
            "\1\u01a3\1\uffff\4\u01a3\1\uffff\2\u01a3\1\uffff\4\u01a3\1\uffff"+
            "\1\u01a4\1\u01a3\1\u01a4\1\uffff\1\u01a4\1\uffff\3\u01a4\1\u01a3"+
            "\1\uffff\1\u01a3\1\u01a4\3\u01a3\1\u01a4\2\u01a3\1\u01a4\3\u01a3"+
            "\1\u01a4\3\u01a3\1\uffff\1\u01a3\1\u01a4\1\u01a3\1\u01a4\2\u01a3"+
            "\1\uffff\1\u01a3\1\uffff\1\u01a3\2\uffff\1\u01a3\1\u01a4\2\u01a3"+
            "\1\uffff\1\u01a4\1\uffff\2\u01a4\4\u01a3\1\u01a4\2\uffff\2\u01a4"+
            "\2\u01a3\1\uffff\1\u01a4\1\uffff\1\u01a3\3\u01a4\1\uffff\2\u01a3"+
            "\1\uffff\2\u01a4\2\u01a3\1\u01a4\3\u01a3\3\u01a4\1\uffff\2\u01a4"+
            "\3\u01a3\1\uffff\4\u01a3\2\u01a4\1\uffff\1\u01a3\1\u01a4\3\u01a3"+
            "\1\u01a4\5\u01a3\2\uffff\5\u01a3\1\uffff\2\u01a3\1\uffff\1\u01a3"+
            "\1\u01a4\2\u01a3\1\uffff\1\u01a3\1\u01a4\1\u01a3\1\u01a4\1\u01a3"+
            "\2\uffff\1\u01a3\1\uffff\3\u01a4\2\u01a3\1\uffff\2\u01a3\1\uffff"+
            "\1\u01a4\2\u01a3\1\u01a4\1\u01a3\3\uffff\1\u01a3\1\u01a4\1\u01a3"+
            "\1\u01a4\2\u01a3\1\u01a4\1\u01a3\1\u01a4\3\u01a3\1\uffff\2\u01a4"+
            "\10\u01a3\1\u01a4\1\u01a3\2\u01a4\2\u01a3\1\uffff\3\u01a4\3"+
            "\u01a3\1\uffff\4\u01a3\1\u01a4\5\u01a3\1\u01a4\4\u01a3\1\uffff"+
            "\6\u01a3\1\u01a4\1\u01a3\1\uffff\3\u01a3\1\uffff\1\u01a4\1\u01a3"+
            "\1\u01a4\3\u01a3\1\uffff\3\u01a4\1\u01a3\1\uffff\1\u01a3\1\u01a4"+
            "\1\u01a3\1\uffff\3\u01a3\1\u01a4\2\u01a3\2\u01a4\3\u01a3\1\u01a4"+
            "\1\u01a3\1\uffff\3\u01a3\2\uffff\1\u01a3\1\uffff\1\u01a4\3\u01a3"+
            "\22\uffff\1\u01a1\45\uffff\1\u01a3\46\uffff\1\u01a3\61\uffff"+
            "\1\u01a3\3\uffff\1\u01a3\61\uffff\1\u01a3\3\uffff\1\u01a3\27"+
            "\uffff\1\u01a3\4\uffff\1\u01a3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01a6\4\u01a7\2\u01a8\1\u01a7\1\uffff\1\u01a7\2\u01a8\1"+
            "\u01a7\1\u01a8\2\u01a7\5\u01a8\2\u01a7\1\u01a8\2\u01a7\2\uffff"+
            "\1\u01a7\1\uffff\4\u01a7\1\uffff\2\u01a7\1\uffff\4\u01a7\1\uffff"+
            "\1\u01a8\1\u01a7\1\u01a8\1\uffff\1\u01a8\1\uffff\3\u01a8\1\u01a7"+
            "\1\uffff\1\u01a7\1\u01a8\3\u01a7\1\u01a8\2\u01a7\1\u01a8\3\u01a7"+
            "\1\u01a8\3\u01a7\1\uffff\1\u01a7\1\u01a8\1\u01a7\1\u01a8\2\u01a7"+
            "\1\uffff\1\u01a7\1\uffff\1\u01a7\2\uffff\1\u01a7\1\u01a8\2\u01a7"+
            "\1\uffff\1\u01a8\1\uffff\2\u01a8\4\u01a7\1\u01a8\2\uffff\2\u01a8"+
            "\2\u01a7\1\uffff\1\u01a8\1\uffff\1\u01a7\3\u01a8\1\uffff\2\u01a7"+
            "\1\uffff\2\u01a8\2\u01a7\1\u01a8\3\u01a7\3\u01a8\1\uffff\2\u01a8"+
            "\3\u01a7\1\uffff\4\u01a7\2\u01a8\1\uffff\1\u01a7\1\u01a8\3\u01a7"+
            "\1\u01a8\5\u01a7\2\uffff\5\u01a7\1\uffff\2\u01a7\1\uffff\1\u01a7"+
            "\1\u01a8\2\u01a7\1\uffff\1\u01a7\1\u01a8\1\u01a7\1\u01a8\1\u01a7"+
            "\2\uffff\1\u01a7\1\uffff\3\u01a8\2\u01a7\1\uffff\2\u01a7\1\uffff"+
            "\1\u01a8\2\u01a7\1\u01a8\1\u01a7\3\uffff\1\u01a7\1\u01a8\1\u01a7"+
            "\1\u01a8\2\u01a7\1\u01a8\1\u01a7\1\u01a8\3\u01a7\1\uffff\2\u01a8"+
            "\10\u01a7\1\u01a8\1\u01a7\2\u01a8\2\u01a7\1\uffff\3\u01a8\3"+
            "\u01a7\1\uffff\4\u01a7\1\u01a8\5\u01a7\1\u01a8\4\u01a7\1\uffff"+
            "\6\u01a7\1\u01a8\1\u01a7\1\uffff\3\u01a7\1\uffff\1\u01a8\1\u01a7"+
            "\1\u01a8\3\u01a7\1\uffff\3\u01a8\1\u01a7\1\uffff\1\u01a7\1\u01a8"+
            "\1\u01a7\1\uffff\3\u01a7\1\u01a8\2\u01a7\2\u01a8\3\u01a7\1\u01a8"+
            "\1\u01a7\1\uffff\3\u01a7\2\uffff\1\u01a7\1\uffff\1\u01a8\3\u01a7"+
            "\22\uffff\1\u01a5\45\uffff\1\u01a7\46\uffff\1\u01a7\61\uffff"+
            "\1\u01a7\3\uffff\1\u01a7\61\uffff\1\u01a7\3\uffff\1\u01a7\27"+
            "\uffff\1\u01a7\4\uffff\1\u01a7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01aa\4\u01ab\2\u01ac\1\u01ab\1\uffff\1\u01ab\2\u01ac\1"+
            "\u01ab\1\u01ac\2\u01ab\5\u01ac\2\u01ab\1\u01ac\2\u01ab\2\uffff"+
            "\1\u01ab\1\uffff\4\u01ab\1\uffff\2\u01ab\1\uffff\4\u01ab\1\uffff"+
            "\1\u01ac\1\u01ab\1\u01ac\1\uffff\1\u01ac\1\uffff\3\u01ac\1\u01ab"+
            "\1\uffff\1\u01ab\1\u01ac\3\u01ab\1\u01ac\2\u01ab\1\u01ac\3\u01ab"+
            "\1\u01ac\3\u01ab\1\uffff\1\u01ab\1\u01ac\1\u01ab\1\u01ac\2\u01ab"+
            "\1\uffff\1\u01ab\1\uffff\1\u01ab\2\uffff\1\u01ab\1\u01ac\2\u01ab"+
            "\1\uffff\1\u01ac\1\uffff\2\u01ac\4\u01ab\1\u01ac\2\uffff\2\u01ac"+
            "\2\u01ab\1\uffff\1\u01ac\1\uffff\1\u01ab\3\u01ac\1\uffff\2\u01ab"+
            "\1\uffff\2\u01ac\2\u01ab\1\u01ac\3\u01ab\3\u01ac\1\uffff\2\u01ac"+
            "\3\u01ab\1\uffff\4\u01ab\2\u01ac\1\uffff\1\u01ab\1\u01ac\3\u01ab"+
            "\1\u01ac\5\u01ab\2\uffff\5\u01ab\1\uffff\2\u01ab\1\uffff\1\u01ab"+
            "\1\u01ac\2\u01ab\1\uffff\1\u01ab\1\u01ac\1\u01ab\1\u01ac\1\u01ab"+
            "\2\uffff\1\u01ab\1\uffff\3\u01ac\2\u01ab\1\uffff\2\u01ab\1\uffff"+
            "\1\u01ac\2\u01ab\1\u01ac\1\u01ab\3\uffff\1\u01ab\1\u01ac\1\u01ab"+
            "\1\u01ac\2\u01ab\1\u01ac\1\u01ab\1\u01ac\3\u01ab\1\uffff\2\u01ac"+
            "\10\u01ab\1\u01ac\1\u01ab\2\u01ac\2\u01ab\1\uffff\3\u01ac\3"+
            "\u01ab\1\uffff\4\u01ab\1\u01ac\5\u01ab\1\u01ac\4\u01ab\1\uffff"+
            "\6\u01ab\1\u01ac\1\u01ab\1\uffff\3\u01ab\1\uffff\1\u01ac\1\u01ab"+
            "\1\u01ac\3\u01ab\1\uffff\3\u01ac\1\u01ab\1\uffff\1\u01ab\1\u01ac"+
            "\1\u01ab\1\uffff\3\u01ab\1\u01ac\2\u01ab\2\u01ac\3\u01ab\1\u01ac"+
            "\1\u01ab\1\uffff\3\u01ab\2\uffff\1\u01ab\1\uffff\1\u01ac\3\u01ab"+
            "\22\uffff\1\u01a9\45\uffff\1\u01ab\46\uffff\1\u01ab\61\uffff"+
            "\1\u01ab\3\uffff\1\u01ab\61\uffff\1\u01ab\3\uffff\1\u01ab\27"+
            "\uffff\1\u01ab\4\uffff\1\u01ab",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01ae\4\u01af\2\u01b0\1\u01af\1\uffff\1\u01af\2\u01b0\1"+
            "\u01af\1\u01b0\2\u01af\5\u01b0\2\u01af\1\u01b0\2\u01af\2\uffff"+
            "\1\u01af\1\uffff\4\u01af\1\uffff\2\u01af\1\uffff\4\u01af\1\uffff"+
            "\1\u01b0\1\u01af\1\u01b0\1\uffff\1\u01b0\1\uffff\3\u01b0\1\u01af"+
            "\1\uffff\1\u01af\1\u01b0\3\u01af\1\u01b0\2\u01af\1\u01b0\3\u01af"+
            "\1\u01b0\3\u01af\1\uffff\1\u01af\1\u01b0\1\u01af\1\u01b0\2\u01af"+
            "\1\uffff\1\u01af\1\uffff\1\u01af\2\uffff\1\u01af\1\u01b0\2\u01af"+
            "\1\uffff\1\u01b0\1\uffff\2\u01b0\4\u01af\1\u01b0\2\uffff\2\u01b0"+
            "\2\u01af\1\uffff\1\u01b0\1\uffff\1\u01af\3\u01b0\1\uffff\2\u01af"+
            "\1\uffff\2\u01b0\2\u01af\1\u01b0\3\u01af\3\u01b0\1\uffff\2\u01b0"+
            "\3\u01af\1\uffff\4\u01af\2\u01b0\1\uffff\1\u01af\1\u01b0\3\u01af"+
            "\1\u01b0\5\u01af\2\uffff\5\u01af\1\uffff\2\u01af\1\uffff\1\u01af"+
            "\1\u01b0\2\u01af\1\uffff\1\u01af\1\u01b0\1\u01af\1\u01b0\1\u01af"+
            "\2\uffff\1\u01af\1\uffff\3\u01b0\2\u01af\1\uffff\2\u01af\1\uffff"+
            "\1\u01b0\2\u01af\1\u01b0\1\u01af\3\uffff\1\u01af\1\u01b0\1\u01af"+
            "\1\u01b0\2\u01af\1\u01b0\1\u01af\1\u01b0\3\u01af\1\uffff\2\u01b0"+
            "\10\u01af\1\u01b0\1\u01af\2\u01b0\2\u01af\1\uffff\3\u01b0\3"+
            "\u01af\1\uffff\4\u01af\1\u01b0\5\u01af\1\u01b0\4\u01af\1\uffff"+
            "\6\u01af\1\u01b0\1\u01af\1\uffff\3\u01af\1\uffff\1\u01b0\1\u01af"+
            "\1\u01b0\3\u01af\1\uffff\3\u01b0\1\u01af\1\uffff\1\u01af\1\u01b0"+
            "\1\u01af\1\uffff\3\u01af\1\u01b0\2\u01af\2\u01b0\3\u01af\1\u01b0"+
            "\1\u01af\1\uffff\3\u01af\2\uffff\1\u01af\1\uffff\1\u01b0\3\u01af"+
            "\22\uffff\1\u01ad\45\uffff\1\u01af\46\uffff\1\u01af\61\uffff"+
            "\1\u01af\3\uffff\1\u01af\61\uffff\1\u01af\3\uffff\1\u01af\27"+
            "\uffff\1\u01af\4\uffff\1\u01af",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01b2\4\u01b3\2\u01b4\1\u01b3\1\uffff\1\u01b3\2\u01b4\1"+
            "\u01b3\1\u01b4\2\u01b3\5\u01b4\2\u01b3\1\u01b4\2\u01b3\2\uffff"+
            "\1\u01b3\1\uffff\4\u01b3\1\uffff\2\u01b3\1\uffff\4\u01b3\1\uffff"+
            "\1\u01b4\1\u01b3\1\u01b4\1\uffff\1\u01b4\1\uffff\3\u01b4\1\u01b3"+
            "\1\uffff\1\u01b3\1\u01b4\3\u01b3\1\u01b4\2\u01b3\1\u01b4\3\u01b3"+
            "\1\u01b4\3\u01b3\1\uffff\1\u01b3\1\u01b4\1\u01b3\1\u01b4\2\u01b3"+
            "\1\uffff\1\u01b3\1\uffff\1\u01b3\2\uffff\1\u01b3\1\u01b4\2\u01b3"+
            "\1\uffff\1\u01b4\1\uffff\2\u01b4\4\u01b3\1\u01b4\2\uffff\2\u01b4"+
            "\2\u01b3\1\uffff\1\u01b4\1\uffff\1\u01b3\3\u01b4\1\uffff\2\u01b3"+
            "\1\uffff\2\u01b4\2\u01b3\1\u01b4\3\u01b3\3\u01b4\1\uffff\2\u01b4"+
            "\3\u01b3\1\uffff\4\u01b3\2\u01b4\1\uffff\1\u01b3\1\u01b4\3\u01b3"+
            "\1\u01b4\5\u01b3\2\uffff\5\u01b3\1\uffff\2\u01b3\1\uffff\1\u01b3"+
            "\1\u01b4\2\u01b3\1\uffff\1\u01b3\1\u01b4\1\u01b3\1\u01b4\1\u01b3"+
            "\2\uffff\1\u01b3\1\uffff\3\u01b4\2\u01b3\1\uffff\2\u01b3\1\uffff"+
            "\1\u01b4\2\u01b3\1\u01b4\1\u01b3\3\uffff\1\u01b3\1\u01b4\1\u01b3"+
            "\1\u01b4\2\u01b3\1\u01b4\1\u01b3\1\u01b4\3\u01b3\1\uffff\2\u01b4"+
            "\10\u01b3\1\u01b4\1\u01b3\2\u01b4\2\u01b3\1\uffff\3\u01b4\3"+
            "\u01b3\1\uffff\4\u01b3\1\u01b4\5\u01b3\1\u01b4\4\u01b3\1\uffff"+
            "\6\u01b3\1\u01b4\1\u01b3\1\uffff\3\u01b3\1\uffff\1\u01b4\1\u01b3"+
            "\1\u01b4\3\u01b3\1\uffff\3\u01b4\1\u01b3\1\uffff\1\u01b3\1\u01b4"+
            "\1\u01b3\1\uffff\3\u01b3\1\u01b4\2\u01b3\2\u01b4\3\u01b3\1\u01b4"+
            "\1\u01b3\1\uffff\3\u01b3\2\uffff\1\u01b3\1\uffff\1\u01b4\3\u01b3"+
            "\22\uffff\1\u01b1\45\uffff\1\u01b3\46\uffff\1\u01b3\61\uffff"+
            "\1\u01b3\3\uffff\1\u01b3\61\uffff\1\u01b3\3\uffff\1\u01b3\27"+
            "\uffff\1\u01b3\4\uffff\1\u01b3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "150:1: selectExpression : ( ( tableAllColumns )=> tableAllColumns | expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_0==STAR) && (synpred2_SelectClauseParser())) {s = 1;}

                        else if ( (LA23_0==Identifier) ) {s = 2;}

                        else if ( ((LA23_0 >= KW_ABORT && LA23_0 <= KW_AFTER)||LA23_0==KW_ANALYZE||LA23_0==KW_ARCHIVE||LA23_0==KW_ASC||(LA23_0 >= KW_AUTOCOMMIT && LA23_0 <= KW_BEFORE)||(LA23_0 >= KW_BUCKET && LA23_0 <= KW_BUCKETS)||(LA23_0 >= KW_CACHE && LA23_0 <= KW_CASCADE)||LA23_0==KW_CHANGE||(LA23_0 >= KW_CLUSTER && LA23_0 <= KW_COLLECTION)||(LA23_0 >= KW_COLUMNS && LA23_0 <= KW_COMMENT)||(LA23_0 >= KW_COMPACT && LA23_0 <= KW_CONCATENATE)||LA23_0==KW_CONTINUE||LA23_0==KW_DATA||LA23_0==KW_DATABASES||(LA23_0 >= KW_DATETIME && LA23_0 <= KW_DBPROPERTIES)||(LA23_0 >= KW_DEFERRED && LA23_0 <= KW_DEFINED)||(LA23_0 >= KW_DELIMITED && LA23_0 <= KW_DESC)||(LA23_0 >= KW_DIRECTORIES && LA23_0 <= KW_DISABLE)||LA23_0==KW_DISTRIBUTE||LA23_0==KW_DOW||(LA23_0 >= KW_DUMP && LA23_0 <= KW_ELEM_TYPE)||LA23_0==KW_ENABLE||LA23_0==KW_ESCAPED||LA23_0==KW_EXCLUSIVE||(LA23_0 >= KW_EXPLAIN && LA23_0 <= KW_EXPORT)||(LA23_0 >= KW_FIELDS && LA23_0 <= KW_FIRST)||(LA23_0 >= KW_FORMAT && LA23_0 <= KW_FORMATTED)||LA23_0==KW_FUNCTIONS||(LA23_0 >= KW_HOUR && LA23_0 <= KW_IDXPROPERTIES)||(LA23_0 >= KW_INDEX && LA23_0 <= KW_INDEXES)||(LA23_0 >= KW_INPATH && LA23_0 <= KW_INPUTFORMAT)||(LA23_0 >= KW_ISOLATION && LA23_0 <= KW_JAR)||(LA23_0 >= KW_KEY && LA23_0 <= KW_LAST)||LA23_0==KW_LEVEL||(LA23_0 >= KW_LIMIT && LA23_0 <= KW_LOAD)||(LA23_0 >= KW_LOCATION && LA23_0 <= KW_LONG)||(LA23_0 >= KW_MAPJOIN && LA23_0 <= KW_METADATA)||(LA23_0 >= KW_MINUTE && LA23_0 <= KW_MONTH)||LA23_0==KW_MSCK||(LA23_0 >= KW_NORELY && LA23_0 <= KW_NOSCAN)||LA23_0==KW_NOVALIDATE||LA23_0==KW_NULLS||LA23_0==KW_OFFSET||LA23_0==KW_OPTION||(LA23_0 >= KW_OUTPUTDRIVER && LA23_0 <= KW_OUTPUTFORMAT)||(LA23_0 >= KW_OVERWRITE && LA23_0 <= KW_OWNER)||(LA23_0 >= KW_PARTITIONED && LA23_0 <= KW_PARTITIONS)||LA23_0==KW_PLUS||LA23_0==KW_PRETTY||LA23_0==KW_PRINCIPALS||(LA23_0 >= KW_PURGE && LA23_0 <= KW_QUARTER)||LA23_0==KW_READ||(LA23_0 >= KW_REBUILD && LA23_0 <= KW_RECORDWRITER)||(LA23_0 >= KW_RELOAD && LA23_0 <= KW_RESTRICT)||LA23_0==KW_REWRITE||(LA23_0 >= KW_ROLE && LA23_0 <= KW_ROLES)||(LA23_0 >= KW_SCHEMA && LA23_0 <= KW_SECOND)||(LA23_0 >= KW_SEMI && LA23_0 <= KW_SERVER)||(LA23_0 >= KW_SETS && LA23_0 <= KW_SKEWED)||(LA23_0 >= KW_SNAPSHOT && LA23_0 <= KW_SSL)||(LA23_0 >= KW_STATISTICS && LA23_0 <= KW_STRUCT)||LA23_0==KW_TABLES||(LA23_0 >= KW_TBLPROPERTIES && LA23_0 <= KW_TERMINATED)||LA23_0==KW_TINYINT||(LA23_0 >= KW_TOUCH && LA23_0 <= KW_TRANSACTIONS)||LA23_0==KW_UNARCHIVE||LA23_0==KW_UNDO||LA23_0==KW_UNIONTYPE||(LA23_0 >= KW_UNLOCK && LA23_0 <= KW_UNSIGNED)||(LA23_0 >= KW_URI && LA23_0 <= KW_USE)||(LA23_0 >= KW_UTC && LA23_0 <= KW_VALIDATE)||LA23_0==KW_VALUE_TYPE||(LA23_0 >= KW_VIEW && LA23_0 <= KW_WEEK)||LA23_0==KW_WHILE||(LA23_0 >= KW_WORK && LA23_0 <= KW_YEAR)||LA23_0==KW_BATCH||LA23_0==KW_DAYOFWEEK||LA23_0==KW_HOLD_DDLTIME||LA23_0==KW_IGNORE||LA23_0==KW_NO_DROP||LA23_0==KW_OFFLINE||LA23_0==KW_PROTECTION||LA23_0==KW_READONLY) ) {s = 3;}

                        else if ( (LA23_0==KW_DATE) ) {s = 4;}

                        else if ( (LA23_0==BigintLiteral||LA23_0==CharSetName||LA23_0==DecimalLiteral||(LA23_0 >= KW_CASE && LA23_0 <= KW_CAST)||LA23_0==KW_EXTRACT||LA23_0==KW_FLOOR||LA23_0==KW_IF||LA23_0==KW_INTERVAL||LA23_0==KW_MAP||LA23_0==KW_NOT||LA23_0==LPAREN||LA23_0==MINUS||(LA23_0 >= Number && LA23_0 <= PLUS)||(LA23_0 >= SmallintLiteral && LA23_0 <= TinyintLiteral)) ) {s = 5;}

                        else if ( (LA23_0==KW_CURRENT_DATE) ) {s = 9;}

                        else if ( (LA23_0==KW_TIMESTAMP) ) {s = 10;}

                        else if ( (LA23_0==KW_CURRENT_TIMESTAMP) ) {s = 11;}

                        else if ( (LA23_0==KW_TRUE) ) {s = 12;}

                        else if ( (LA23_0==KW_FALSE) ) {s = 18;}

                        else if ( (LA23_0==KW_NULL) ) {s = 19;}

                        else if ( (LA23_0==KW_ARRAY) ) {s = 20;}

                        else if ( ((LA23_0 >= KW_BIGINT && LA23_0 <= KW_BOOLEAN)||LA23_0==KW_DOUBLE||LA23_0==KW_FLOAT||LA23_0==KW_GROUPING||LA23_0==KW_INT||LA23_0==KW_SMALLINT) ) {s = 28;}

                        else if ( (LA23_0==KW_EXISTS) ) {s = 30;}

                        else if ( ((LA23_0 >= KW_ALL && LA23_0 <= KW_ALTER)||LA23_0==KW_AS||LA23_0==KW_AUTHORIZATION||LA23_0==KW_BETWEEN||LA23_0==KW_BOTH||LA23_0==KW_BY||LA23_0==KW_CONSTRAINT||LA23_0==KW_CREATE||LA23_0==KW_CUBE||LA23_0==KW_CURSOR||LA23_0==KW_DECIMAL||LA23_0==KW_DELETE||LA23_0==KW_DESCRIBE||LA23_0==KW_DROP||LA23_0==KW_EXTERNAL||LA23_0==KW_FETCH||(LA23_0 >= KW_FOR && LA23_0 <= KW_FOREIGN)||LA23_0==KW_FULL||(LA23_0 >= KW_GRANT && LA23_0 <= KW_GROUP)||(LA23_0 >= KW_IMPORT && LA23_0 <= KW_IN)||LA23_0==KW_INNER||LA23_0==KW_INSERT||LA23_0==KW_INTERSECT||(LA23_0 >= KW_INTO && LA23_0 <= KW_IS)||(LA23_0 >= KW_LATERAL && LA23_0 <= KW_LEFT)||LA23_0==KW_LIKE||LA23_0==KW_LOCAL||LA23_0==KW_NONE||LA23_0==KW_OF||(LA23_0 >= KW_ORDER && LA23_0 <= KW_OUTER)||LA23_0==KW_PARTITION||LA23_0==KW_PERCENT||LA23_0==KW_PRIMARY||LA23_0==KW_PROCEDURE||LA23_0==KW_RANGE||LA23_0==KW_READS||(LA23_0 >= KW_REFERENCES && LA23_0 <= KW_REGEXP)||LA23_0==KW_REVOKE||(LA23_0 >= KW_RIGHT && LA23_0 <= KW_RLIKE)||(LA23_0 >= KW_ROLLUP && LA23_0 <= KW_ROWS)||LA23_0==KW_SET||LA23_0==KW_TABLE||LA23_0==KW_TO||LA23_0==KW_TRIGGER||LA23_0==KW_TRUNCATE||LA23_0==KW_UNION||LA23_0==KW_UPDATE||(LA23_0 >= KW_USER && LA23_0 <= KW_USING)||LA23_0==KW_VALUES||LA23_0==KW_WITH) ) {s = 31;}

                         
                        input.seek(index23_0);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_32 = input.LA(1);

                         
                        int index23_32 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_32==STAR) && (synpred2_SelectClauseParser())) {s = 385;}

                        else if ( (LA23_32==Identifier) ) {s = 386;}

                        else if ( ((LA23_32 >= KW_ABORT && LA23_32 <= KW_AFTER)||LA23_32==KW_ANALYZE||LA23_32==KW_ARCHIVE||LA23_32==KW_ASC||(LA23_32 >= KW_AUTOCOMMIT && LA23_32 <= KW_BEFORE)||(LA23_32 >= KW_BUCKET && LA23_32 <= KW_BUCKETS)||(LA23_32 >= KW_CACHE && LA23_32 <= KW_CASCADE)||LA23_32==KW_CHANGE||(LA23_32 >= KW_CLUSTER && LA23_32 <= KW_COLLECTION)||(LA23_32 >= KW_COLUMNS && LA23_32 <= KW_COMMENT)||(LA23_32 >= KW_COMPACT && LA23_32 <= KW_CONCATENATE)||LA23_32==KW_CONTINUE||LA23_32==KW_DATA||LA23_32==KW_DATABASES||(LA23_32 >= KW_DATETIME && LA23_32 <= KW_DBPROPERTIES)||(LA23_32 >= KW_DEFERRED && LA23_32 <= KW_DEFINED)||(LA23_32 >= KW_DELIMITED && LA23_32 <= KW_DESC)||(LA23_32 >= KW_DIRECTORIES && LA23_32 <= KW_DISABLE)||LA23_32==KW_DISTRIBUTE||LA23_32==KW_DOW||(LA23_32 >= KW_DUMP && LA23_32 <= KW_ELEM_TYPE)||LA23_32==KW_ENABLE||LA23_32==KW_ESCAPED||LA23_32==KW_EXCLUSIVE||(LA23_32 >= KW_EXPLAIN && LA23_32 <= KW_EXPORT)||(LA23_32 >= KW_FIELDS && LA23_32 <= KW_FIRST)||(LA23_32 >= KW_FORMAT && LA23_32 <= KW_FORMATTED)||LA23_32==KW_FUNCTIONS||(LA23_32 >= KW_HOUR && LA23_32 <= KW_IDXPROPERTIES)||(LA23_32 >= KW_INDEX && LA23_32 <= KW_INDEXES)||(LA23_32 >= KW_INPATH && LA23_32 <= KW_INPUTFORMAT)||(LA23_32 >= KW_ISOLATION && LA23_32 <= KW_JAR)||(LA23_32 >= KW_KEY && LA23_32 <= KW_LAST)||LA23_32==KW_LEVEL||(LA23_32 >= KW_LIMIT && LA23_32 <= KW_LOAD)||(LA23_32 >= KW_LOCATION && LA23_32 <= KW_LONG)||(LA23_32 >= KW_MAPJOIN && LA23_32 <= KW_METADATA)||(LA23_32 >= KW_MINUTE && LA23_32 <= KW_MONTH)||LA23_32==KW_MSCK||(LA23_32 >= KW_NORELY && LA23_32 <= KW_NOSCAN)||LA23_32==KW_NOVALIDATE||LA23_32==KW_NULLS||LA23_32==KW_OFFSET||LA23_32==KW_OPTION||(LA23_32 >= KW_OUTPUTDRIVER && LA23_32 <= KW_OUTPUTFORMAT)||(LA23_32 >= KW_OVERWRITE && LA23_32 <= KW_OWNER)||(LA23_32 >= KW_PARTITIONED && LA23_32 <= KW_PARTITIONS)||LA23_32==KW_PLUS||LA23_32==KW_PRETTY||LA23_32==KW_PRINCIPALS||(LA23_32 >= KW_PURGE && LA23_32 <= KW_QUARTER)||LA23_32==KW_READ||(LA23_32 >= KW_REBUILD && LA23_32 <= KW_RECORDWRITER)||(LA23_32 >= KW_RELOAD && LA23_32 <= KW_RESTRICT)||LA23_32==KW_REWRITE||(LA23_32 >= KW_ROLE && LA23_32 <= KW_ROLES)||(LA23_32 >= KW_SCHEMA && LA23_32 <= KW_SECOND)||(LA23_32 >= KW_SEMI && LA23_32 <= KW_SERVER)||(LA23_32 >= KW_SETS && LA23_32 <= KW_SKEWED)||(LA23_32 >= KW_SNAPSHOT && LA23_32 <= KW_SSL)||(LA23_32 >= KW_STATISTICS && LA23_32 <= KW_STRUCT)||LA23_32==KW_TABLES||(LA23_32 >= KW_TBLPROPERTIES && LA23_32 <= KW_TERMINATED)||LA23_32==KW_TINYINT||(LA23_32 >= KW_TOUCH && LA23_32 <= KW_TRANSACTIONS)||LA23_32==KW_UNARCHIVE||LA23_32==KW_UNDO||LA23_32==KW_UNIONTYPE||(LA23_32 >= KW_UNLOCK && LA23_32 <= KW_UNSIGNED)||(LA23_32 >= KW_URI && LA23_32 <= KW_USE)||(LA23_32 >= KW_UTC && LA23_32 <= KW_VALIDATE)||LA23_32==KW_VALUE_TYPE||(LA23_32 >= KW_VIEW && LA23_32 <= KW_WEEK)||LA23_32==KW_WHILE||(LA23_32 >= KW_WORK && LA23_32 <= KW_YEAR)||LA23_32==KW_BATCH||LA23_32==KW_DAYOFWEEK||LA23_32==KW_HOLD_DDLTIME||LA23_32==KW_IGNORE||LA23_32==KW_NO_DROP||LA23_32==KW_OFFLINE||LA23_32==KW_PROTECTION||LA23_32==KW_READONLY) ) {s = 387;}

                        else if ( ((LA23_32 >= KW_ALL && LA23_32 <= KW_ALTER)||(LA23_32 >= KW_ARRAY && LA23_32 <= KW_AS)||LA23_32==KW_AUTHORIZATION||(LA23_32 >= KW_BETWEEN && LA23_32 <= KW_BOTH)||LA23_32==KW_BY||LA23_32==KW_CONSTRAINT||LA23_32==KW_CREATE||LA23_32==KW_CUBE||(LA23_32 >= KW_CURRENT_DATE && LA23_32 <= KW_CURSOR)||LA23_32==KW_DATE||LA23_32==KW_DECIMAL||LA23_32==KW_DELETE||LA23_32==KW_DESCRIBE||LA23_32==KW_DOUBLE||LA23_32==KW_DROP||LA23_32==KW_EXISTS||LA23_32==KW_EXTERNAL||(LA23_32 >= KW_FALSE && LA23_32 <= KW_FETCH)||LA23_32==KW_FLOAT||(LA23_32 >= KW_FOR && LA23_32 <= KW_FOREIGN)||LA23_32==KW_FULL||(LA23_32 >= KW_GRANT && LA23_32 <= KW_GROUPING)||(LA23_32 >= KW_IMPORT && LA23_32 <= KW_IN)||LA23_32==KW_INNER||(LA23_32 >= KW_INSERT && LA23_32 <= KW_INTERSECT)||(LA23_32 >= KW_INTO && LA23_32 <= KW_IS)||(LA23_32 >= KW_LATERAL && LA23_32 <= KW_LEFT)||LA23_32==KW_LIKE||LA23_32==KW_LOCAL||LA23_32==KW_NONE||LA23_32==KW_NULL||LA23_32==KW_OF||(LA23_32 >= KW_ORDER && LA23_32 <= KW_OUTER)||LA23_32==KW_PARTITION||LA23_32==KW_PERCENT||LA23_32==KW_PRIMARY||LA23_32==KW_PROCEDURE||LA23_32==KW_RANGE||LA23_32==KW_READS||(LA23_32 >= KW_REFERENCES && LA23_32 <= KW_REGEXP)||LA23_32==KW_REVOKE||(LA23_32 >= KW_RIGHT && LA23_32 <= KW_RLIKE)||(LA23_32 >= KW_ROLLUP && LA23_32 <= KW_ROWS)||LA23_32==KW_SET||LA23_32==KW_SMALLINT||LA23_32==KW_TABLE||LA23_32==KW_TIMESTAMP||LA23_32==KW_TO||(LA23_32 >= KW_TRIGGER && LA23_32 <= KW_TRUNCATE)||LA23_32==KW_UNION||LA23_32==KW_UPDATE||(LA23_32 >= KW_USER && LA23_32 <= KW_USING)||LA23_32==KW_VALUES||LA23_32==KW_WITH) ) {s = 388;}

                         
                        input.seek(index23_32);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_59 = input.LA(1);

                         
                        int index23_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_59==STAR) && (synpred2_SelectClauseParser())) {s = 389;}

                        else if ( (LA23_59==Identifier) ) {s = 390;}

                        else if ( ((LA23_59 >= KW_ABORT && LA23_59 <= KW_AFTER)||LA23_59==KW_ANALYZE||LA23_59==KW_ARCHIVE||LA23_59==KW_ASC||(LA23_59 >= KW_AUTOCOMMIT && LA23_59 <= KW_BEFORE)||(LA23_59 >= KW_BUCKET && LA23_59 <= KW_BUCKETS)||(LA23_59 >= KW_CACHE && LA23_59 <= KW_CASCADE)||LA23_59==KW_CHANGE||(LA23_59 >= KW_CLUSTER && LA23_59 <= KW_COLLECTION)||(LA23_59 >= KW_COLUMNS && LA23_59 <= KW_COMMENT)||(LA23_59 >= KW_COMPACT && LA23_59 <= KW_CONCATENATE)||LA23_59==KW_CONTINUE||LA23_59==KW_DATA||LA23_59==KW_DATABASES||(LA23_59 >= KW_DATETIME && LA23_59 <= KW_DBPROPERTIES)||(LA23_59 >= KW_DEFERRED && LA23_59 <= KW_DEFINED)||(LA23_59 >= KW_DELIMITED && LA23_59 <= KW_DESC)||(LA23_59 >= KW_DIRECTORIES && LA23_59 <= KW_DISABLE)||LA23_59==KW_DISTRIBUTE||LA23_59==KW_DOW||(LA23_59 >= KW_DUMP && LA23_59 <= KW_ELEM_TYPE)||LA23_59==KW_ENABLE||LA23_59==KW_ESCAPED||LA23_59==KW_EXCLUSIVE||(LA23_59 >= KW_EXPLAIN && LA23_59 <= KW_EXPORT)||(LA23_59 >= KW_FIELDS && LA23_59 <= KW_FIRST)||(LA23_59 >= KW_FORMAT && LA23_59 <= KW_FORMATTED)||LA23_59==KW_FUNCTIONS||(LA23_59 >= KW_HOUR && LA23_59 <= KW_IDXPROPERTIES)||(LA23_59 >= KW_INDEX && LA23_59 <= KW_INDEXES)||(LA23_59 >= KW_INPATH && LA23_59 <= KW_INPUTFORMAT)||(LA23_59 >= KW_ISOLATION && LA23_59 <= KW_JAR)||(LA23_59 >= KW_KEY && LA23_59 <= KW_LAST)||LA23_59==KW_LEVEL||(LA23_59 >= KW_LIMIT && LA23_59 <= KW_LOAD)||(LA23_59 >= KW_LOCATION && LA23_59 <= KW_LONG)||(LA23_59 >= KW_MAPJOIN && LA23_59 <= KW_METADATA)||(LA23_59 >= KW_MINUTE && LA23_59 <= KW_MONTH)||LA23_59==KW_MSCK||(LA23_59 >= KW_NORELY && LA23_59 <= KW_NOSCAN)||LA23_59==KW_NOVALIDATE||LA23_59==KW_NULLS||LA23_59==KW_OFFSET||LA23_59==KW_OPTION||(LA23_59 >= KW_OUTPUTDRIVER && LA23_59 <= KW_OUTPUTFORMAT)||(LA23_59 >= KW_OVERWRITE && LA23_59 <= KW_OWNER)||(LA23_59 >= KW_PARTITIONED && LA23_59 <= KW_PARTITIONS)||LA23_59==KW_PLUS||LA23_59==KW_PRETTY||LA23_59==KW_PRINCIPALS||(LA23_59 >= KW_PURGE && LA23_59 <= KW_QUARTER)||LA23_59==KW_READ||(LA23_59 >= KW_REBUILD && LA23_59 <= KW_RECORDWRITER)||(LA23_59 >= KW_RELOAD && LA23_59 <= KW_RESTRICT)||LA23_59==KW_REWRITE||(LA23_59 >= KW_ROLE && LA23_59 <= KW_ROLES)||(LA23_59 >= KW_SCHEMA && LA23_59 <= KW_SECOND)||(LA23_59 >= KW_SEMI && LA23_59 <= KW_SERVER)||(LA23_59 >= KW_SETS && LA23_59 <= KW_SKEWED)||(LA23_59 >= KW_SNAPSHOT && LA23_59 <= KW_SSL)||(LA23_59 >= KW_STATISTICS && LA23_59 <= KW_STRUCT)||LA23_59==KW_TABLES||(LA23_59 >= KW_TBLPROPERTIES && LA23_59 <= KW_TERMINATED)||LA23_59==KW_TINYINT||(LA23_59 >= KW_TOUCH && LA23_59 <= KW_TRANSACTIONS)||LA23_59==KW_UNARCHIVE||LA23_59==KW_UNDO||LA23_59==KW_UNIONTYPE||(LA23_59 >= KW_UNLOCK && LA23_59 <= KW_UNSIGNED)||(LA23_59 >= KW_URI && LA23_59 <= KW_USE)||(LA23_59 >= KW_UTC && LA23_59 <= KW_VALIDATE)||LA23_59==KW_VALUE_TYPE||(LA23_59 >= KW_VIEW && LA23_59 <= KW_WEEK)||LA23_59==KW_WHILE||(LA23_59 >= KW_WORK && LA23_59 <= KW_YEAR)||LA23_59==KW_BATCH||LA23_59==KW_DAYOFWEEK||LA23_59==KW_HOLD_DDLTIME||LA23_59==KW_IGNORE||LA23_59==KW_NO_DROP||LA23_59==KW_OFFLINE||LA23_59==KW_PROTECTION||LA23_59==KW_READONLY) ) {s = 391;}

                        else if ( ((LA23_59 >= KW_ALL && LA23_59 <= KW_ALTER)||(LA23_59 >= KW_ARRAY && LA23_59 <= KW_AS)||LA23_59==KW_AUTHORIZATION||(LA23_59 >= KW_BETWEEN && LA23_59 <= KW_BOTH)||LA23_59==KW_BY||LA23_59==KW_CONSTRAINT||LA23_59==KW_CREATE||LA23_59==KW_CUBE||(LA23_59 >= KW_CURRENT_DATE && LA23_59 <= KW_CURSOR)||LA23_59==KW_DATE||LA23_59==KW_DECIMAL||LA23_59==KW_DELETE||LA23_59==KW_DESCRIBE||LA23_59==KW_DOUBLE||LA23_59==KW_DROP||LA23_59==KW_EXISTS||LA23_59==KW_EXTERNAL||(LA23_59 >= KW_FALSE && LA23_59 <= KW_FETCH)||LA23_59==KW_FLOAT||(LA23_59 >= KW_FOR && LA23_59 <= KW_FOREIGN)||LA23_59==KW_FULL||(LA23_59 >= KW_GRANT && LA23_59 <= KW_GROUPING)||(LA23_59 >= KW_IMPORT && LA23_59 <= KW_IN)||LA23_59==KW_INNER||(LA23_59 >= KW_INSERT && LA23_59 <= KW_INTERSECT)||(LA23_59 >= KW_INTO && LA23_59 <= KW_IS)||(LA23_59 >= KW_LATERAL && LA23_59 <= KW_LEFT)||LA23_59==KW_LIKE||LA23_59==KW_LOCAL||LA23_59==KW_NONE||LA23_59==KW_NULL||LA23_59==KW_OF||(LA23_59 >= KW_ORDER && LA23_59 <= KW_OUTER)||LA23_59==KW_PARTITION||LA23_59==KW_PERCENT||LA23_59==KW_PRIMARY||LA23_59==KW_PROCEDURE||LA23_59==KW_RANGE||LA23_59==KW_READS||(LA23_59 >= KW_REFERENCES && LA23_59 <= KW_REGEXP)||LA23_59==KW_REVOKE||(LA23_59 >= KW_RIGHT && LA23_59 <= KW_RLIKE)||(LA23_59 >= KW_ROLLUP && LA23_59 <= KW_ROWS)||LA23_59==KW_SET||LA23_59==KW_SMALLINT||LA23_59==KW_TABLE||LA23_59==KW_TIMESTAMP||LA23_59==KW_TO||(LA23_59 >= KW_TRIGGER && LA23_59 <= KW_TRUNCATE)||LA23_59==KW_UNION||LA23_59==KW_UPDATE||(LA23_59 >= KW_USER && LA23_59 <= KW_USING)||LA23_59==KW_VALUES||LA23_59==KW_WITH) ) {s = 392;}

                         
                        input.seek(index23_59);

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_87 = input.LA(1);

                         
                        int index23_87 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_87==STAR) && (synpred2_SelectClauseParser())) {s = 393;}

                        else if ( (LA23_87==Identifier) ) {s = 394;}

                        else if ( ((LA23_87 >= KW_ABORT && LA23_87 <= KW_AFTER)||LA23_87==KW_ANALYZE||LA23_87==KW_ARCHIVE||LA23_87==KW_ASC||(LA23_87 >= KW_AUTOCOMMIT && LA23_87 <= KW_BEFORE)||(LA23_87 >= KW_BUCKET && LA23_87 <= KW_BUCKETS)||(LA23_87 >= KW_CACHE && LA23_87 <= KW_CASCADE)||LA23_87==KW_CHANGE||(LA23_87 >= KW_CLUSTER && LA23_87 <= KW_COLLECTION)||(LA23_87 >= KW_COLUMNS && LA23_87 <= KW_COMMENT)||(LA23_87 >= KW_COMPACT && LA23_87 <= KW_CONCATENATE)||LA23_87==KW_CONTINUE||LA23_87==KW_DATA||LA23_87==KW_DATABASES||(LA23_87 >= KW_DATETIME && LA23_87 <= KW_DBPROPERTIES)||(LA23_87 >= KW_DEFERRED && LA23_87 <= KW_DEFINED)||(LA23_87 >= KW_DELIMITED && LA23_87 <= KW_DESC)||(LA23_87 >= KW_DIRECTORIES && LA23_87 <= KW_DISABLE)||LA23_87==KW_DISTRIBUTE||LA23_87==KW_DOW||(LA23_87 >= KW_DUMP && LA23_87 <= KW_ELEM_TYPE)||LA23_87==KW_ENABLE||LA23_87==KW_ESCAPED||LA23_87==KW_EXCLUSIVE||(LA23_87 >= KW_EXPLAIN && LA23_87 <= KW_EXPORT)||(LA23_87 >= KW_FIELDS && LA23_87 <= KW_FIRST)||(LA23_87 >= KW_FORMAT && LA23_87 <= KW_FORMATTED)||LA23_87==KW_FUNCTIONS||(LA23_87 >= KW_HOUR && LA23_87 <= KW_IDXPROPERTIES)||(LA23_87 >= KW_INDEX && LA23_87 <= KW_INDEXES)||(LA23_87 >= KW_INPATH && LA23_87 <= KW_INPUTFORMAT)||(LA23_87 >= KW_ISOLATION && LA23_87 <= KW_JAR)||(LA23_87 >= KW_KEY && LA23_87 <= KW_LAST)||LA23_87==KW_LEVEL||(LA23_87 >= KW_LIMIT && LA23_87 <= KW_LOAD)||(LA23_87 >= KW_LOCATION && LA23_87 <= KW_LONG)||(LA23_87 >= KW_MAPJOIN && LA23_87 <= KW_METADATA)||(LA23_87 >= KW_MINUTE && LA23_87 <= KW_MONTH)||LA23_87==KW_MSCK||(LA23_87 >= KW_NORELY && LA23_87 <= KW_NOSCAN)||LA23_87==KW_NOVALIDATE||LA23_87==KW_NULLS||LA23_87==KW_OFFSET||LA23_87==KW_OPTION||(LA23_87 >= KW_OUTPUTDRIVER && LA23_87 <= KW_OUTPUTFORMAT)||(LA23_87 >= KW_OVERWRITE && LA23_87 <= KW_OWNER)||(LA23_87 >= KW_PARTITIONED && LA23_87 <= KW_PARTITIONS)||LA23_87==KW_PLUS||LA23_87==KW_PRETTY||LA23_87==KW_PRINCIPALS||(LA23_87 >= KW_PURGE && LA23_87 <= KW_QUARTER)||LA23_87==KW_READ||(LA23_87 >= KW_REBUILD && LA23_87 <= KW_RECORDWRITER)||(LA23_87 >= KW_RELOAD && LA23_87 <= KW_RESTRICT)||LA23_87==KW_REWRITE||(LA23_87 >= KW_ROLE && LA23_87 <= KW_ROLES)||(LA23_87 >= KW_SCHEMA && LA23_87 <= KW_SECOND)||(LA23_87 >= KW_SEMI && LA23_87 <= KW_SERVER)||(LA23_87 >= KW_SETS && LA23_87 <= KW_SKEWED)||(LA23_87 >= KW_SNAPSHOT && LA23_87 <= KW_SSL)||(LA23_87 >= KW_STATISTICS && LA23_87 <= KW_STRUCT)||LA23_87==KW_TABLES||(LA23_87 >= KW_TBLPROPERTIES && LA23_87 <= KW_TERMINATED)||LA23_87==KW_TINYINT||(LA23_87 >= KW_TOUCH && LA23_87 <= KW_TRANSACTIONS)||LA23_87==KW_UNARCHIVE||LA23_87==KW_UNDO||LA23_87==KW_UNIONTYPE||(LA23_87 >= KW_UNLOCK && LA23_87 <= KW_UNSIGNED)||(LA23_87 >= KW_URI && LA23_87 <= KW_USE)||(LA23_87 >= KW_UTC && LA23_87 <= KW_VALIDATE)||LA23_87==KW_VALUE_TYPE||(LA23_87 >= KW_VIEW && LA23_87 <= KW_WEEK)||LA23_87==KW_WHILE||(LA23_87 >= KW_WORK && LA23_87 <= KW_YEAR)||LA23_87==KW_BATCH||LA23_87==KW_DAYOFWEEK||LA23_87==KW_HOLD_DDLTIME||LA23_87==KW_IGNORE||LA23_87==KW_NO_DROP||LA23_87==KW_OFFLINE||LA23_87==KW_PROTECTION||LA23_87==KW_READONLY) ) {s = 395;}

                        else if ( ((LA23_87 >= KW_ALL && LA23_87 <= KW_ALTER)||(LA23_87 >= KW_ARRAY && LA23_87 <= KW_AS)||LA23_87==KW_AUTHORIZATION||(LA23_87 >= KW_BETWEEN && LA23_87 <= KW_BOTH)||LA23_87==KW_BY||LA23_87==KW_CONSTRAINT||LA23_87==KW_CREATE||LA23_87==KW_CUBE||(LA23_87 >= KW_CURRENT_DATE && LA23_87 <= KW_CURSOR)||LA23_87==KW_DATE||LA23_87==KW_DECIMAL||LA23_87==KW_DELETE||LA23_87==KW_DESCRIBE||LA23_87==KW_DOUBLE||LA23_87==KW_DROP||LA23_87==KW_EXISTS||LA23_87==KW_EXTERNAL||(LA23_87 >= KW_FALSE && LA23_87 <= KW_FETCH)||LA23_87==KW_FLOAT||(LA23_87 >= KW_FOR && LA23_87 <= KW_FOREIGN)||LA23_87==KW_FULL||(LA23_87 >= KW_GRANT && LA23_87 <= KW_GROUPING)||(LA23_87 >= KW_IMPORT && LA23_87 <= KW_IN)||LA23_87==KW_INNER||(LA23_87 >= KW_INSERT && LA23_87 <= KW_INTERSECT)||(LA23_87 >= KW_INTO && LA23_87 <= KW_IS)||(LA23_87 >= KW_LATERAL && LA23_87 <= KW_LEFT)||LA23_87==KW_LIKE||LA23_87==KW_LOCAL||LA23_87==KW_NONE||LA23_87==KW_NULL||LA23_87==KW_OF||(LA23_87 >= KW_ORDER && LA23_87 <= KW_OUTER)||LA23_87==KW_PARTITION||LA23_87==KW_PERCENT||LA23_87==KW_PRIMARY||LA23_87==KW_PROCEDURE||LA23_87==KW_RANGE||LA23_87==KW_READS||(LA23_87 >= KW_REFERENCES && LA23_87 <= KW_REGEXP)||LA23_87==KW_REVOKE||(LA23_87 >= KW_RIGHT && LA23_87 <= KW_RLIKE)||(LA23_87 >= KW_ROLLUP && LA23_87 <= KW_ROWS)||LA23_87==KW_SET||LA23_87==KW_SMALLINT||LA23_87==KW_TABLE||LA23_87==KW_TIMESTAMP||LA23_87==KW_TO||(LA23_87 >= KW_TRIGGER && LA23_87 <= KW_TRUNCATE)||LA23_87==KW_UNION||LA23_87==KW_UPDATE||(LA23_87 >= KW_USER && LA23_87 <= KW_USING)||LA23_87==KW_VALUES||LA23_87==KW_WITH) ) {s = 396;}

                         
                        input.seek(index23_87);

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_114 = input.LA(1);

                         
                        int index23_114 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_114==STAR) && (synpred2_SelectClauseParser())) {s = 397;}

                        else if ( (LA23_114==Identifier) ) {s = 398;}

                        else if ( ((LA23_114 >= KW_ABORT && LA23_114 <= KW_AFTER)||LA23_114==KW_ANALYZE||LA23_114==KW_ARCHIVE||LA23_114==KW_ASC||(LA23_114 >= KW_AUTOCOMMIT && LA23_114 <= KW_BEFORE)||(LA23_114 >= KW_BUCKET && LA23_114 <= KW_BUCKETS)||(LA23_114 >= KW_CACHE && LA23_114 <= KW_CASCADE)||LA23_114==KW_CHANGE||(LA23_114 >= KW_CLUSTER && LA23_114 <= KW_COLLECTION)||(LA23_114 >= KW_COLUMNS && LA23_114 <= KW_COMMENT)||(LA23_114 >= KW_COMPACT && LA23_114 <= KW_CONCATENATE)||LA23_114==KW_CONTINUE||LA23_114==KW_DATA||LA23_114==KW_DATABASES||(LA23_114 >= KW_DATETIME && LA23_114 <= KW_DBPROPERTIES)||(LA23_114 >= KW_DEFERRED && LA23_114 <= KW_DEFINED)||(LA23_114 >= KW_DELIMITED && LA23_114 <= KW_DESC)||(LA23_114 >= KW_DIRECTORIES && LA23_114 <= KW_DISABLE)||LA23_114==KW_DISTRIBUTE||LA23_114==KW_DOW||(LA23_114 >= KW_DUMP && LA23_114 <= KW_ELEM_TYPE)||LA23_114==KW_ENABLE||LA23_114==KW_ESCAPED||LA23_114==KW_EXCLUSIVE||(LA23_114 >= KW_EXPLAIN && LA23_114 <= KW_EXPORT)||(LA23_114 >= KW_FIELDS && LA23_114 <= KW_FIRST)||(LA23_114 >= KW_FORMAT && LA23_114 <= KW_FORMATTED)||LA23_114==KW_FUNCTIONS||(LA23_114 >= KW_HOUR && LA23_114 <= KW_IDXPROPERTIES)||(LA23_114 >= KW_INDEX && LA23_114 <= KW_INDEXES)||(LA23_114 >= KW_INPATH && LA23_114 <= KW_INPUTFORMAT)||(LA23_114 >= KW_ISOLATION && LA23_114 <= KW_JAR)||(LA23_114 >= KW_KEY && LA23_114 <= KW_LAST)||LA23_114==KW_LEVEL||(LA23_114 >= KW_LIMIT && LA23_114 <= KW_LOAD)||(LA23_114 >= KW_LOCATION && LA23_114 <= KW_LONG)||(LA23_114 >= KW_MAPJOIN && LA23_114 <= KW_METADATA)||(LA23_114 >= KW_MINUTE && LA23_114 <= KW_MONTH)||LA23_114==KW_MSCK||(LA23_114 >= KW_NORELY && LA23_114 <= KW_NOSCAN)||LA23_114==KW_NOVALIDATE||LA23_114==KW_NULLS||LA23_114==KW_OFFSET||LA23_114==KW_OPTION||(LA23_114 >= KW_OUTPUTDRIVER && LA23_114 <= KW_OUTPUTFORMAT)||(LA23_114 >= KW_OVERWRITE && LA23_114 <= KW_OWNER)||(LA23_114 >= KW_PARTITIONED && LA23_114 <= KW_PARTITIONS)||LA23_114==KW_PLUS||LA23_114==KW_PRETTY||LA23_114==KW_PRINCIPALS||(LA23_114 >= KW_PURGE && LA23_114 <= KW_QUARTER)||LA23_114==KW_READ||(LA23_114 >= KW_REBUILD && LA23_114 <= KW_RECORDWRITER)||(LA23_114 >= KW_RELOAD && LA23_114 <= KW_RESTRICT)||LA23_114==KW_REWRITE||(LA23_114 >= KW_ROLE && LA23_114 <= KW_ROLES)||(LA23_114 >= KW_SCHEMA && LA23_114 <= KW_SECOND)||(LA23_114 >= KW_SEMI && LA23_114 <= KW_SERVER)||(LA23_114 >= KW_SETS && LA23_114 <= KW_SKEWED)||(LA23_114 >= KW_SNAPSHOT && LA23_114 <= KW_SSL)||(LA23_114 >= KW_STATISTICS && LA23_114 <= KW_STRUCT)||LA23_114==KW_TABLES||(LA23_114 >= KW_TBLPROPERTIES && LA23_114 <= KW_TERMINATED)||LA23_114==KW_TINYINT||(LA23_114 >= KW_TOUCH && LA23_114 <= KW_TRANSACTIONS)||LA23_114==KW_UNARCHIVE||LA23_114==KW_UNDO||LA23_114==KW_UNIONTYPE||(LA23_114 >= KW_UNLOCK && LA23_114 <= KW_UNSIGNED)||(LA23_114 >= KW_URI && LA23_114 <= KW_USE)||(LA23_114 >= KW_UTC && LA23_114 <= KW_VALIDATE)||LA23_114==KW_VALUE_TYPE||(LA23_114 >= KW_VIEW && LA23_114 <= KW_WEEK)||LA23_114==KW_WHILE||(LA23_114 >= KW_WORK && LA23_114 <= KW_YEAR)||LA23_114==KW_BATCH||LA23_114==KW_DAYOFWEEK||LA23_114==KW_HOLD_DDLTIME||LA23_114==KW_IGNORE||LA23_114==KW_NO_DROP||LA23_114==KW_OFFLINE||LA23_114==KW_PROTECTION||LA23_114==KW_READONLY) ) {s = 399;}

                        else if ( ((LA23_114 >= KW_ALL && LA23_114 <= KW_ALTER)||(LA23_114 >= KW_ARRAY && LA23_114 <= KW_AS)||LA23_114==KW_AUTHORIZATION||(LA23_114 >= KW_BETWEEN && LA23_114 <= KW_BOTH)||LA23_114==KW_BY||LA23_114==KW_CONSTRAINT||LA23_114==KW_CREATE||LA23_114==KW_CUBE||(LA23_114 >= KW_CURRENT_DATE && LA23_114 <= KW_CURSOR)||LA23_114==KW_DATE||LA23_114==KW_DECIMAL||LA23_114==KW_DELETE||LA23_114==KW_DESCRIBE||LA23_114==KW_DOUBLE||LA23_114==KW_DROP||LA23_114==KW_EXISTS||LA23_114==KW_EXTERNAL||(LA23_114 >= KW_FALSE && LA23_114 <= KW_FETCH)||LA23_114==KW_FLOAT||(LA23_114 >= KW_FOR && LA23_114 <= KW_FOREIGN)||LA23_114==KW_FULL||(LA23_114 >= KW_GRANT && LA23_114 <= KW_GROUPING)||(LA23_114 >= KW_IMPORT && LA23_114 <= KW_IN)||LA23_114==KW_INNER||(LA23_114 >= KW_INSERT && LA23_114 <= KW_INTERSECT)||(LA23_114 >= KW_INTO && LA23_114 <= KW_IS)||(LA23_114 >= KW_LATERAL && LA23_114 <= KW_LEFT)||LA23_114==KW_LIKE||LA23_114==KW_LOCAL||LA23_114==KW_NONE||LA23_114==KW_NULL||LA23_114==KW_OF||(LA23_114 >= KW_ORDER && LA23_114 <= KW_OUTER)||LA23_114==KW_PARTITION||LA23_114==KW_PERCENT||LA23_114==KW_PRIMARY||LA23_114==KW_PROCEDURE||LA23_114==KW_RANGE||LA23_114==KW_READS||(LA23_114 >= KW_REFERENCES && LA23_114 <= KW_REGEXP)||LA23_114==KW_REVOKE||(LA23_114 >= KW_RIGHT && LA23_114 <= KW_RLIKE)||(LA23_114 >= KW_ROLLUP && LA23_114 <= KW_ROWS)||LA23_114==KW_SET||LA23_114==KW_SMALLINT||LA23_114==KW_TABLE||LA23_114==KW_TIMESTAMP||LA23_114==KW_TO||(LA23_114 >= KW_TRIGGER && LA23_114 <= KW_TRUNCATE)||LA23_114==KW_UNION||LA23_114==KW_UPDATE||(LA23_114 >= KW_USER && LA23_114 <= KW_USING)||LA23_114==KW_VALUES||LA23_114==KW_WITH) ) {s = 400;}

                         
                        input.seek(index23_114);

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_142 = input.LA(1);

                         
                        int index23_142 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_142==STAR) && (synpred2_SelectClauseParser())) {s = 401;}

                        else if ( (LA23_142==Identifier) ) {s = 402;}

                        else if ( ((LA23_142 >= KW_ABORT && LA23_142 <= KW_AFTER)||LA23_142==KW_ANALYZE||LA23_142==KW_ARCHIVE||LA23_142==KW_ASC||(LA23_142 >= KW_AUTOCOMMIT && LA23_142 <= KW_BEFORE)||(LA23_142 >= KW_BUCKET && LA23_142 <= KW_BUCKETS)||(LA23_142 >= KW_CACHE && LA23_142 <= KW_CASCADE)||LA23_142==KW_CHANGE||(LA23_142 >= KW_CLUSTER && LA23_142 <= KW_COLLECTION)||(LA23_142 >= KW_COLUMNS && LA23_142 <= KW_COMMENT)||(LA23_142 >= KW_COMPACT && LA23_142 <= KW_CONCATENATE)||LA23_142==KW_CONTINUE||LA23_142==KW_DATA||LA23_142==KW_DATABASES||(LA23_142 >= KW_DATETIME && LA23_142 <= KW_DBPROPERTIES)||(LA23_142 >= KW_DEFERRED && LA23_142 <= KW_DEFINED)||(LA23_142 >= KW_DELIMITED && LA23_142 <= KW_DESC)||(LA23_142 >= KW_DIRECTORIES && LA23_142 <= KW_DISABLE)||LA23_142==KW_DISTRIBUTE||LA23_142==KW_DOW||(LA23_142 >= KW_DUMP && LA23_142 <= KW_ELEM_TYPE)||LA23_142==KW_ENABLE||LA23_142==KW_ESCAPED||LA23_142==KW_EXCLUSIVE||(LA23_142 >= KW_EXPLAIN && LA23_142 <= KW_EXPORT)||(LA23_142 >= KW_FIELDS && LA23_142 <= KW_FIRST)||(LA23_142 >= KW_FORMAT && LA23_142 <= KW_FORMATTED)||LA23_142==KW_FUNCTIONS||(LA23_142 >= KW_HOUR && LA23_142 <= KW_IDXPROPERTIES)||(LA23_142 >= KW_INDEX && LA23_142 <= KW_INDEXES)||(LA23_142 >= KW_INPATH && LA23_142 <= KW_INPUTFORMAT)||(LA23_142 >= KW_ISOLATION && LA23_142 <= KW_JAR)||(LA23_142 >= KW_KEY && LA23_142 <= KW_LAST)||LA23_142==KW_LEVEL||(LA23_142 >= KW_LIMIT && LA23_142 <= KW_LOAD)||(LA23_142 >= KW_LOCATION && LA23_142 <= KW_LONG)||(LA23_142 >= KW_MAPJOIN && LA23_142 <= KW_METADATA)||(LA23_142 >= KW_MINUTE && LA23_142 <= KW_MONTH)||LA23_142==KW_MSCK||(LA23_142 >= KW_NORELY && LA23_142 <= KW_NOSCAN)||LA23_142==KW_NOVALIDATE||LA23_142==KW_NULLS||LA23_142==KW_OFFSET||LA23_142==KW_OPTION||(LA23_142 >= KW_OUTPUTDRIVER && LA23_142 <= KW_OUTPUTFORMAT)||(LA23_142 >= KW_OVERWRITE && LA23_142 <= KW_OWNER)||(LA23_142 >= KW_PARTITIONED && LA23_142 <= KW_PARTITIONS)||LA23_142==KW_PLUS||LA23_142==KW_PRETTY||LA23_142==KW_PRINCIPALS||(LA23_142 >= KW_PURGE && LA23_142 <= KW_QUARTER)||LA23_142==KW_READ||(LA23_142 >= KW_REBUILD && LA23_142 <= KW_RECORDWRITER)||(LA23_142 >= KW_RELOAD && LA23_142 <= KW_RESTRICT)||LA23_142==KW_REWRITE||(LA23_142 >= KW_ROLE && LA23_142 <= KW_ROLES)||(LA23_142 >= KW_SCHEMA && LA23_142 <= KW_SECOND)||(LA23_142 >= KW_SEMI && LA23_142 <= KW_SERVER)||(LA23_142 >= KW_SETS && LA23_142 <= KW_SKEWED)||(LA23_142 >= KW_SNAPSHOT && LA23_142 <= KW_SSL)||(LA23_142 >= KW_STATISTICS && LA23_142 <= KW_STRUCT)||LA23_142==KW_TABLES||(LA23_142 >= KW_TBLPROPERTIES && LA23_142 <= KW_TERMINATED)||LA23_142==KW_TINYINT||(LA23_142 >= KW_TOUCH && LA23_142 <= KW_TRANSACTIONS)||LA23_142==KW_UNARCHIVE||LA23_142==KW_UNDO||LA23_142==KW_UNIONTYPE||(LA23_142 >= KW_UNLOCK && LA23_142 <= KW_UNSIGNED)||(LA23_142 >= KW_URI && LA23_142 <= KW_USE)||(LA23_142 >= KW_UTC && LA23_142 <= KW_VALIDATE)||LA23_142==KW_VALUE_TYPE||(LA23_142 >= KW_VIEW && LA23_142 <= KW_WEEK)||LA23_142==KW_WHILE||(LA23_142 >= KW_WORK && LA23_142 <= KW_YEAR)||LA23_142==KW_BATCH||LA23_142==KW_DAYOFWEEK||LA23_142==KW_HOLD_DDLTIME||LA23_142==KW_IGNORE||LA23_142==KW_NO_DROP||LA23_142==KW_OFFLINE||LA23_142==KW_PROTECTION||LA23_142==KW_READONLY) ) {s = 403;}

                        else if ( ((LA23_142 >= KW_ALL && LA23_142 <= KW_ALTER)||(LA23_142 >= KW_ARRAY && LA23_142 <= KW_AS)||LA23_142==KW_AUTHORIZATION||(LA23_142 >= KW_BETWEEN && LA23_142 <= KW_BOTH)||LA23_142==KW_BY||LA23_142==KW_CONSTRAINT||LA23_142==KW_CREATE||LA23_142==KW_CUBE||(LA23_142 >= KW_CURRENT_DATE && LA23_142 <= KW_CURSOR)||LA23_142==KW_DATE||LA23_142==KW_DECIMAL||LA23_142==KW_DELETE||LA23_142==KW_DESCRIBE||LA23_142==KW_DOUBLE||LA23_142==KW_DROP||LA23_142==KW_EXISTS||LA23_142==KW_EXTERNAL||(LA23_142 >= KW_FALSE && LA23_142 <= KW_FETCH)||LA23_142==KW_FLOAT||(LA23_142 >= KW_FOR && LA23_142 <= KW_FOREIGN)||LA23_142==KW_FULL||(LA23_142 >= KW_GRANT && LA23_142 <= KW_GROUPING)||(LA23_142 >= KW_IMPORT && LA23_142 <= KW_IN)||LA23_142==KW_INNER||(LA23_142 >= KW_INSERT && LA23_142 <= KW_INTERSECT)||(LA23_142 >= KW_INTO && LA23_142 <= KW_IS)||(LA23_142 >= KW_LATERAL && LA23_142 <= KW_LEFT)||LA23_142==KW_LIKE||LA23_142==KW_LOCAL||LA23_142==KW_NONE||LA23_142==KW_NULL||LA23_142==KW_OF||(LA23_142 >= KW_ORDER && LA23_142 <= KW_OUTER)||LA23_142==KW_PARTITION||LA23_142==KW_PERCENT||LA23_142==KW_PRIMARY||LA23_142==KW_PROCEDURE||LA23_142==KW_RANGE||LA23_142==KW_READS||(LA23_142 >= KW_REFERENCES && LA23_142 <= KW_REGEXP)||LA23_142==KW_REVOKE||(LA23_142 >= KW_RIGHT && LA23_142 <= KW_RLIKE)||(LA23_142 >= KW_ROLLUP && LA23_142 <= KW_ROWS)||LA23_142==KW_SET||LA23_142==KW_SMALLINT||LA23_142==KW_TABLE||LA23_142==KW_TIMESTAMP||LA23_142==KW_TO||(LA23_142 >= KW_TRIGGER && LA23_142 <= KW_TRUNCATE)||LA23_142==KW_UNION||LA23_142==KW_UPDATE||(LA23_142 >= KW_USER && LA23_142 <= KW_USING)||LA23_142==KW_VALUES||LA23_142==KW_WITH) ) {s = 404;}

                         
                        input.seek(index23_142);

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_169 = input.LA(1);

                         
                        int index23_169 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_169==STAR) && (synpred2_SelectClauseParser())) {s = 405;}

                        else if ( (LA23_169==Identifier) ) {s = 406;}

                        else if ( ((LA23_169 >= KW_ABORT && LA23_169 <= KW_AFTER)||LA23_169==KW_ANALYZE||LA23_169==KW_ARCHIVE||LA23_169==KW_ASC||(LA23_169 >= KW_AUTOCOMMIT && LA23_169 <= KW_BEFORE)||(LA23_169 >= KW_BUCKET && LA23_169 <= KW_BUCKETS)||(LA23_169 >= KW_CACHE && LA23_169 <= KW_CASCADE)||LA23_169==KW_CHANGE||(LA23_169 >= KW_CLUSTER && LA23_169 <= KW_COLLECTION)||(LA23_169 >= KW_COLUMNS && LA23_169 <= KW_COMMENT)||(LA23_169 >= KW_COMPACT && LA23_169 <= KW_CONCATENATE)||LA23_169==KW_CONTINUE||LA23_169==KW_DATA||LA23_169==KW_DATABASES||(LA23_169 >= KW_DATETIME && LA23_169 <= KW_DBPROPERTIES)||(LA23_169 >= KW_DEFERRED && LA23_169 <= KW_DEFINED)||(LA23_169 >= KW_DELIMITED && LA23_169 <= KW_DESC)||(LA23_169 >= KW_DIRECTORIES && LA23_169 <= KW_DISABLE)||LA23_169==KW_DISTRIBUTE||LA23_169==KW_DOW||(LA23_169 >= KW_DUMP && LA23_169 <= KW_ELEM_TYPE)||LA23_169==KW_ENABLE||LA23_169==KW_ESCAPED||LA23_169==KW_EXCLUSIVE||(LA23_169 >= KW_EXPLAIN && LA23_169 <= KW_EXPORT)||(LA23_169 >= KW_FIELDS && LA23_169 <= KW_FIRST)||(LA23_169 >= KW_FORMAT && LA23_169 <= KW_FORMATTED)||LA23_169==KW_FUNCTIONS||(LA23_169 >= KW_HOUR && LA23_169 <= KW_IDXPROPERTIES)||(LA23_169 >= KW_INDEX && LA23_169 <= KW_INDEXES)||(LA23_169 >= KW_INPATH && LA23_169 <= KW_INPUTFORMAT)||(LA23_169 >= KW_ISOLATION && LA23_169 <= KW_JAR)||(LA23_169 >= KW_KEY && LA23_169 <= KW_LAST)||LA23_169==KW_LEVEL||(LA23_169 >= KW_LIMIT && LA23_169 <= KW_LOAD)||(LA23_169 >= KW_LOCATION && LA23_169 <= KW_LONG)||(LA23_169 >= KW_MAPJOIN && LA23_169 <= KW_METADATA)||(LA23_169 >= KW_MINUTE && LA23_169 <= KW_MONTH)||LA23_169==KW_MSCK||(LA23_169 >= KW_NORELY && LA23_169 <= KW_NOSCAN)||LA23_169==KW_NOVALIDATE||LA23_169==KW_NULLS||LA23_169==KW_OFFSET||LA23_169==KW_OPTION||(LA23_169 >= KW_OUTPUTDRIVER && LA23_169 <= KW_OUTPUTFORMAT)||(LA23_169 >= KW_OVERWRITE && LA23_169 <= KW_OWNER)||(LA23_169 >= KW_PARTITIONED && LA23_169 <= KW_PARTITIONS)||LA23_169==KW_PLUS||LA23_169==KW_PRETTY||LA23_169==KW_PRINCIPALS||(LA23_169 >= KW_PURGE && LA23_169 <= KW_QUARTER)||LA23_169==KW_READ||(LA23_169 >= KW_REBUILD && LA23_169 <= KW_RECORDWRITER)||(LA23_169 >= KW_RELOAD && LA23_169 <= KW_RESTRICT)||LA23_169==KW_REWRITE||(LA23_169 >= KW_ROLE && LA23_169 <= KW_ROLES)||(LA23_169 >= KW_SCHEMA && LA23_169 <= KW_SECOND)||(LA23_169 >= KW_SEMI && LA23_169 <= KW_SERVER)||(LA23_169 >= KW_SETS && LA23_169 <= KW_SKEWED)||(LA23_169 >= KW_SNAPSHOT && LA23_169 <= KW_SSL)||(LA23_169 >= KW_STATISTICS && LA23_169 <= KW_STRUCT)||LA23_169==KW_TABLES||(LA23_169 >= KW_TBLPROPERTIES && LA23_169 <= KW_TERMINATED)||LA23_169==KW_TINYINT||(LA23_169 >= KW_TOUCH && LA23_169 <= KW_TRANSACTIONS)||LA23_169==KW_UNARCHIVE||LA23_169==KW_UNDO||LA23_169==KW_UNIONTYPE||(LA23_169 >= KW_UNLOCK && LA23_169 <= KW_UNSIGNED)||(LA23_169 >= KW_URI && LA23_169 <= KW_USE)||(LA23_169 >= KW_UTC && LA23_169 <= KW_VALIDATE)||LA23_169==KW_VALUE_TYPE||(LA23_169 >= KW_VIEW && LA23_169 <= KW_WEEK)||LA23_169==KW_WHILE||(LA23_169 >= KW_WORK && LA23_169 <= KW_YEAR)||LA23_169==KW_BATCH||LA23_169==KW_DAYOFWEEK||LA23_169==KW_HOLD_DDLTIME||LA23_169==KW_IGNORE||LA23_169==KW_NO_DROP||LA23_169==KW_OFFLINE||LA23_169==KW_PROTECTION||LA23_169==KW_READONLY) ) {s = 407;}

                        else if ( ((LA23_169 >= KW_ALL && LA23_169 <= KW_ALTER)||(LA23_169 >= KW_ARRAY && LA23_169 <= KW_AS)||LA23_169==KW_AUTHORIZATION||(LA23_169 >= KW_BETWEEN && LA23_169 <= KW_BOTH)||LA23_169==KW_BY||LA23_169==KW_CONSTRAINT||LA23_169==KW_CREATE||LA23_169==KW_CUBE||(LA23_169 >= KW_CURRENT_DATE && LA23_169 <= KW_CURSOR)||LA23_169==KW_DATE||LA23_169==KW_DECIMAL||LA23_169==KW_DELETE||LA23_169==KW_DESCRIBE||LA23_169==KW_DOUBLE||LA23_169==KW_DROP||LA23_169==KW_EXISTS||LA23_169==KW_EXTERNAL||(LA23_169 >= KW_FALSE && LA23_169 <= KW_FETCH)||LA23_169==KW_FLOAT||(LA23_169 >= KW_FOR && LA23_169 <= KW_FOREIGN)||LA23_169==KW_FULL||(LA23_169 >= KW_GRANT && LA23_169 <= KW_GROUPING)||(LA23_169 >= KW_IMPORT && LA23_169 <= KW_IN)||LA23_169==KW_INNER||(LA23_169 >= KW_INSERT && LA23_169 <= KW_INTERSECT)||(LA23_169 >= KW_INTO && LA23_169 <= KW_IS)||(LA23_169 >= KW_LATERAL && LA23_169 <= KW_LEFT)||LA23_169==KW_LIKE||LA23_169==KW_LOCAL||LA23_169==KW_NONE||LA23_169==KW_NULL||LA23_169==KW_OF||(LA23_169 >= KW_ORDER && LA23_169 <= KW_OUTER)||LA23_169==KW_PARTITION||LA23_169==KW_PERCENT||LA23_169==KW_PRIMARY||LA23_169==KW_PROCEDURE||LA23_169==KW_RANGE||LA23_169==KW_READS||(LA23_169 >= KW_REFERENCES && LA23_169 <= KW_REGEXP)||LA23_169==KW_REVOKE||(LA23_169 >= KW_RIGHT && LA23_169 <= KW_RLIKE)||(LA23_169 >= KW_ROLLUP && LA23_169 <= KW_ROWS)||LA23_169==KW_SET||LA23_169==KW_SMALLINT||LA23_169==KW_TABLE||LA23_169==KW_TIMESTAMP||LA23_169==KW_TO||(LA23_169 >= KW_TRIGGER && LA23_169 <= KW_TRUNCATE)||LA23_169==KW_UNION||LA23_169==KW_UPDATE||(LA23_169 >= KW_USER && LA23_169 <= KW_USING)||LA23_169==KW_VALUES||LA23_169==KW_WITH) ) {s = 408;}

                         
                        input.seek(index23_169);

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_196 = input.LA(1);

                         
                        int index23_196 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_196==STAR) && (synpred2_SelectClauseParser())) {s = 409;}

                        else if ( (LA23_196==Identifier) ) {s = 410;}

                        else if ( ((LA23_196 >= KW_ABORT && LA23_196 <= KW_AFTER)||LA23_196==KW_ANALYZE||LA23_196==KW_ARCHIVE||LA23_196==KW_ASC||(LA23_196 >= KW_AUTOCOMMIT && LA23_196 <= KW_BEFORE)||(LA23_196 >= KW_BUCKET && LA23_196 <= KW_BUCKETS)||(LA23_196 >= KW_CACHE && LA23_196 <= KW_CASCADE)||LA23_196==KW_CHANGE||(LA23_196 >= KW_CLUSTER && LA23_196 <= KW_COLLECTION)||(LA23_196 >= KW_COLUMNS && LA23_196 <= KW_COMMENT)||(LA23_196 >= KW_COMPACT && LA23_196 <= KW_CONCATENATE)||LA23_196==KW_CONTINUE||LA23_196==KW_DATA||LA23_196==KW_DATABASES||(LA23_196 >= KW_DATETIME && LA23_196 <= KW_DBPROPERTIES)||(LA23_196 >= KW_DEFERRED && LA23_196 <= KW_DEFINED)||(LA23_196 >= KW_DELIMITED && LA23_196 <= KW_DESC)||(LA23_196 >= KW_DIRECTORIES && LA23_196 <= KW_DISABLE)||LA23_196==KW_DISTRIBUTE||LA23_196==KW_DOW||(LA23_196 >= KW_DUMP && LA23_196 <= KW_ELEM_TYPE)||LA23_196==KW_ENABLE||LA23_196==KW_ESCAPED||LA23_196==KW_EXCLUSIVE||(LA23_196 >= KW_EXPLAIN && LA23_196 <= KW_EXPORT)||(LA23_196 >= KW_FIELDS && LA23_196 <= KW_FIRST)||(LA23_196 >= KW_FORMAT && LA23_196 <= KW_FORMATTED)||LA23_196==KW_FUNCTIONS||(LA23_196 >= KW_HOUR && LA23_196 <= KW_IDXPROPERTIES)||(LA23_196 >= KW_INDEX && LA23_196 <= KW_INDEXES)||(LA23_196 >= KW_INPATH && LA23_196 <= KW_INPUTFORMAT)||(LA23_196 >= KW_ISOLATION && LA23_196 <= KW_JAR)||(LA23_196 >= KW_KEY && LA23_196 <= KW_LAST)||LA23_196==KW_LEVEL||(LA23_196 >= KW_LIMIT && LA23_196 <= KW_LOAD)||(LA23_196 >= KW_LOCATION && LA23_196 <= KW_LONG)||(LA23_196 >= KW_MAPJOIN && LA23_196 <= KW_METADATA)||(LA23_196 >= KW_MINUTE && LA23_196 <= KW_MONTH)||LA23_196==KW_MSCK||(LA23_196 >= KW_NORELY && LA23_196 <= KW_NOSCAN)||LA23_196==KW_NOVALIDATE||LA23_196==KW_NULLS||LA23_196==KW_OFFSET||LA23_196==KW_OPTION||(LA23_196 >= KW_OUTPUTDRIVER && LA23_196 <= KW_OUTPUTFORMAT)||(LA23_196 >= KW_OVERWRITE && LA23_196 <= KW_OWNER)||(LA23_196 >= KW_PARTITIONED && LA23_196 <= KW_PARTITIONS)||LA23_196==KW_PLUS||LA23_196==KW_PRETTY||LA23_196==KW_PRINCIPALS||(LA23_196 >= KW_PURGE && LA23_196 <= KW_QUARTER)||LA23_196==KW_READ||(LA23_196 >= KW_REBUILD && LA23_196 <= KW_RECORDWRITER)||(LA23_196 >= KW_RELOAD && LA23_196 <= KW_RESTRICT)||LA23_196==KW_REWRITE||(LA23_196 >= KW_ROLE && LA23_196 <= KW_ROLES)||(LA23_196 >= KW_SCHEMA && LA23_196 <= KW_SECOND)||(LA23_196 >= KW_SEMI && LA23_196 <= KW_SERVER)||(LA23_196 >= KW_SETS && LA23_196 <= KW_SKEWED)||(LA23_196 >= KW_SNAPSHOT && LA23_196 <= KW_SSL)||(LA23_196 >= KW_STATISTICS && LA23_196 <= KW_STRUCT)||LA23_196==KW_TABLES||(LA23_196 >= KW_TBLPROPERTIES && LA23_196 <= KW_TERMINATED)||LA23_196==KW_TINYINT||(LA23_196 >= KW_TOUCH && LA23_196 <= KW_TRANSACTIONS)||LA23_196==KW_UNARCHIVE||LA23_196==KW_UNDO||LA23_196==KW_UNIONTYPE||(LA23_196 >= KW_UNLOCK && LA23_196 <= KW_UNSIGNED)||(LA23_196 >= KW_URI && LA23_196 <= KW_USE)||(LA23_196 >= KW_UTC && LA23_196 <= KW_VALIDATE)||LA23_196==KW_VALUE_TYPE||(LA23_196 >= KW_VIEW && LA23_196 <= KW_WEEK)||LA23_196==KW_WHILE||(LA23_196 >= KW_WORK && LA23_196 <= KW_YEAR)||LA23_196==KW_BATCH||LA23_196==KW_DAYOFWEEK||LA23_196==KW_HOLD_DDLTIME||LA23_196==KW_IGNORE||LA23_196==KW_NO_DROP||LA23_196==KW_OFFLINE||LA23_196==KW_PROTECTION||LA23_196==KW_READONLY) ) {s = 411;}

                        else if ( ((LA23_196 >= KW_ALL && LA23_196 <= KW_ALTER)||(LA23_196 >= KW_ARRAY && LA23_196 <= KW_AS)||LA23_196==KW_AUTHORIZATION||(LA23_196 >= KW_BETWEEN && LA23_196 <= KW_BOTH)||LA23_196==KW_BY||LA23_196==KW_CONSTRAINT||LA23_196==KW_CREATE||LA23_196==KW_CUBE||(LA23_196 >= KW_CURRENT_DATE && LA23_196 <= KW_CURSOR)||LA23_196==KW_DATE||LA23_196==KW_DECIMAL||LA23_196==KW_DELETE||LA23_196==KW_DESCRIBE||LA23_196==KW_DOUBLE||LA23_196==KW_DROP||LA23_196==KW_EXISTS||LA23_196==KW_EXTERNAL||(LA23_196 >= KW_FALSE && LA23_196 <= KW_FETCH)||LA23_196==KW_FLOAT||(LA23_196 >= KW_FOR && LA23_196 <= KW_FOREIGN)||LA23_196==KW_FULL||(LA23_196 >= KW_GRANT && LA23_196 <= KW_GROUPING)||(LA23_196 >= KW_IMPORT && LA23_196 <= KW_IN)||LA23_196==KW_INNER||(LA23_196 >= KW_INSERT && LA23_196 <= KW_INTERSECT)||(LA23_196 >= KW_INTO && LA23_196 <= KW_IS)||(LA23_196 >= KW_LATERAL && LA23_196 <= KW_LEFT)||LA23_196==KW_LIKE||LA23_196==KW_LOCAL||LA23_196==KW_NONE||LA23_196==KW_NULL||LA23_196==KW_OF||(LA23_196 >= KW_ORDER && LA23_196 <= KW_OUTER)||LA23_196==KW_PARTITION||LA23_196==KW_PERCENT||LA23_196==KW_PRIMARY||LA23_196==KW_PROCEDURE||LA23_196==KW_RANGE||LA23_196==KW_READS||(LA23_196 >= KW_REFERENCES && LA23_196 <= KW_REGEXP)||LA23_196==KW_REVOKE||(LA23_196 >= KW_RIGHT && LA23_196 <= KW_RLIKE)||(LA23_196 >= KW_ROLLUP && LA23_196 <= KW_ROWS)||LA23_196==KW_SET||LA23_196==KW_SMALLINT||LA23_196==KW_TABLE||LA23_196==KW_TIMESTAMP||LA23_196==KW_TO||(LA23_196 >= KW_TRIGGER && LA23_196 <= KW_TRUNCATE)||LA23_196==KW_UNION||LA23_196==KW_UPDATE||(LA23_196 >= KW_USER && LA23_196 <= KW_USING)||LA23_196==KW_VALUES||LA23_196==KW_WITH) ) {s = 412;}

                         
                        input.seek(index23_196);

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_223 = input.LA(1);

                         
                        int index23_223 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_223==STAR) && (synpred2_SelectClauseParser())) {s = 413;}

                        else if ( (LA23_223==Identifier) ) {s = 414;}

                        else if ( ((LA23_223 >= KW_ABORT && LA23_223 <= KW_AFTER)||LA23_223==KW_ANALYZE||LA23_223==KW_ARCHIVE||LA23_223==KW_ASC||(LA23_223 >= KW_AUTOCOMMIT && LA23_223 <= KW_BEFORE)||(LA23_223 >= KW_BUCKET && LA23_223 <= KW_BUCKETS)||(LA23_223 >= KW_CACHE && LA23_223 <= KW_CASCADE)||LA23_223==KW_CHANGE||(LA23_223 >= KW_CLUSTER && LA23_223 <= KW_COLLECTION)||(LA23_223 >= KW_COLUMNS && LA23_223 <= KW_COMMENT)||(LA23_223 >= KW_COMPACT && LA23_223 <= KW_CONCATENATE)||LA23_223==KW_CONTINUE||LA23_223==KW_DATA||LA23_223==KW_DATABASES||(LA23_223 >= KW_DATETIME && LA23_223 <= KW_DBPROPERTIES)||(LA23_223 >= KW_DEFERRED && LA23_223 <= KW_DEFINED)||(LA23_223 >= KW_DELIMITED && LA23_223 <= KW_DESC)||(LA23_223 >= KW_DIRECTORIES && LA23_223 <= KW_DISABLE)||LA23_223==KW_DISTRIBUTE||LA23_223==KW_DOW||(LA23_223 >= KW_DUMP && LA23_223 <= KW_ELEM_TYPE)||LA23_223==KW_ENABLE||LA23_223==KW_ESCAPED||LA23_223==KW_EXCLUSIVE||(LA23_223 >= KW_EXPLAIN && LA23_223 <= KW_EXPORT)||(LA23_223 >= KW_FIELDS && LA23_223 <= KW_FIRST)||(LA23_223 >= KW_FORMAT && LA23_223 <= KW_FORMATTED)||LA23_223==KW_FUNCTIONS||(LA23_223 >= KW_HOUR && LA23_223 <= KW_IDXPROPERTIES)||(LA23_223 >= KW_INDEX && LA23_223 <= KW_INDEXES)||(LA23_223 >= KW_INPATH && LA23_223 <= KW_INPUTFORMAT)||(LA23_223 >= KW_ISOLATION && LA23_223 <= KW_JAR)||(LA23_223 >= KW_KEY && LA23_223 <= KW_LAST)||LA23_223==KW_LEVEL||(LA23_223 >= KW_LIMIT && LA23_223 <= KW_LOAD)||(LA23_223 >= KW_LOCATION && LA23_223 <= KW_LONG)||(LA23_223 >= KW_MAPJOIN && LA23_223 <= KW_METADATA)||(LA23_223 >= KW_MINUTE && LA23_223 <= KW_MONTH)||LA23_223==KW_MSCK||(LA23_223 >= KW_NORELY && LA23_223 <= KW_NOSCAN)||LA23_223==KW_NOVALIDATE||LA23_223==KW_NULLS||LA23_223==KW_OFFSET||LA23_223==KW_OPTION||(LA23_223 >= KW_OUTPUTDRIVER && LA23_223 <= KW_OUTPUTFORMAT)||(LA23_223 >= KW_OVERWRITE && LA23_223 <= KW_OWNER)||(LA23_223 >= KW_PARTITIONED && LA23_223 <= KW_PARTITIONS)||LA23_223==KW_PLUS||LA23_223==KW_PRETTY||LA23_223==KW_PRINCIPALS||(LA23_223 >= KW_PURGE && LA23_223 <= KW_QUARTER)||LA23_223==KW_READ||(LA23_223 >= KW_REBUILD && LA23_223 <= KW_RECORDWRITER)||(LA23_223 >= KW_RELOAD && LA23_223 <= KW_RESTRICT)||LA23_223==KW_REWRITE||(LA23_223 >= KW_ROLE && LA23_223 <= KW_ROLES)||(LA23_223 >= KW_SCHEMA && LA23_223 <= KW_SECOND)||(LA23_223 >= KW_SEMI && LA23_223 <= KW_SERVER)||(LA23_223 >= KW_SETS && LA23_223 <= KW_SKEWED)||(LA23_223 >= KW_SNAPSHOT && LA23_223 <= KW_SSL)||(LA23_223 >= KW_STATISTICS && LA23_223 <= KW_STRUCT)||LA23_223==KW_TABLES||(LA23_223 >= KW_TBLPROPERTIES && LA23_223 <= KW_TERMINATED)||LA23_223==KW_TINYINT||(LA23_223 >= KW_TOUCH && LA23_223 <= KW_TRANSACTIONS)||LA23_223==KW_UNARCHIVE||LA23_223==KW_UNDO||LA23_223==KW_UNIONTYPE||(LA23_223 >= KW_UNLOCK && LA23_223 <= KW_UNSIGNED)||(LA23_223 >= KW_URI && LA23_223 <= KW_USE)||(LA23_223 >= KW_UTC && LA23_223 <= KW_VALIDATE)||LA23_223==KW_VALUE_TYPE||(LA23_223 >= KW_VIEW && LA23_223 <= KW_WEEK)||LA23_223==KW_WHILE||(LA23_223 >= KW_WORK && LA23_223 <= KW_YEAR)||LA23_223==KW_BATCH||LA23_223==KW_DAYOFWEEK||LA23_223==KW_HOLD_DDLTIME||LA23_223==KW_IGNORE||LA23_223==KW_NO_DROP||LA23_223==KW_OFFLINE||LA23_223==KW_PROTECTION||LA23_223==KW_READONLY) ) {s = 415;}

                        else if ( ((LA23_223 >= KW_ALL && LA23_223 <= KW_ALTER)||(LA23_223 >= KW_ARRAY && LA23_223 <= KW_AS)||LA23_223==KW_AUTHORIZATION||(LA23_223 >= KW_BETWEEN && LA23_223 <= KW_BOTH)||LA23_223==KW_BY||LA23_223==KW_CONSTRAINT||LA23_223==KW_CREATE||LA23_223==KW_CUBE||(LA23_223 >= KW_CURRENT_DATE && LA23_223 <= KW_CURSOR)||LA23_223==KW_DATE||LA23_223==KW_DECIMAL||LA23_223==KW_DELETE||LA23_223==KW_DESCRIBE||LA23_223==KW_DOUBLE||LA23_223==KW_DROP||LA23_223==KW_EXISTS||LA23_223==KW_EXTERNAL||(LA23_223 >= KW_FALSE && LA23_223 <= KW_FETCH)||LA23_223==KW_FLOAT||(LA23_223 >= KW_FOR && LA23_223 <= KW_FOREIGN)||LA23_223==KW_FULL||(LA23_223 >= KW_GRANT && LA23_223 <= KW_GROUPING)||(LA23_223 >= KW_IMPORT && LA23_223 <= KW_IN)||LA23_223==KW_INNER||(LA23_223 >= KW_INSERT && LA23_223 <= KW_INTERSECT)||(LA23_223 >= KW_INTO && LA23_223 <= KW_IS)||(LA23_223 >= KW_LATERAL && LA23_223 <= KW_LEFT)||LA23_223==KW_LIKE||LA23_223==KW_LOCAL||LA23_223==KW_NONE||LA23_223==KW_NULL||LA23_223==KW_OF||(LA23_223 >= KW_ORDER && LA23_223 <= KW_OUTER)||LA23_223==KW_PARTITION||LA23_223==KW_PERCENT||LA23_223==KW_PRIMARY||LA23_223==KW_PROCEDURE||LA23_223==KW_RANGE||LA23_223==KW_READS||(LA23_223 >= KW_REFERENCES && LA23_223 <= KW_REGEXP)||LA23_223==KW_REVOKE||(LA23_223 >= KW_RIGHT && LA23_223 <= KW_RLIKE)||(LA23_223 >= KW_ROLLUP && LA23_223 <= KW_ROWS)||LA23_223==KW_SET||LA23_223==KW_SMALLINT||LA23_223==KW_TABLE||LA23_223==KW_TIMESTAMP||LA23_223==KW_TO||(LA23_223 >= KW_TRIGGER && LA23_223 <= KW_TRUNCATE)||LA23_223==KW_UNION||LA23_223==KW_UPDATE||(LA23_223 >= KW_USER && LA23_223 <= KW_USING)||LA23_223==KW_VALUES||LA23_223==KW_WITH) ) {s = 416;}

                         
                        input.seek(index23_223);

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_250 = input.LA(1);

                         
                        int index23_250 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_250==STAR) && (synpred2_SelectClauseParser())) {s = 417;}

                        else if ( (LA23_250==Identifier) ) {s = 418;}

                        else if ( ((LA23_250 >= KW_ABORT && LA23_250 <= KW_AFTER)||LA23_250==KW_ANALYZE||LA23_250==KW_ARCHIVE||LA23_250==KW_ASC||(LA23_250 >= KW_AUTOCOMMIT && LA23_250 <= KW_BEFORE)||(LA23_250 >= KW_BUCKET && LA23_250 <= KW_BUCKETS)||(LA23_250 >= KW_CACHE && LA23_250 <= KW_CASCADE)||LA23_250==KW_CHANGE||(LA23_250 >= KW_CLUSTER && LA23_250 <= KW_COLLECTION)||(LA23_250 >= KW_COLUMNS && LA23_250 <= KW_COMMENT)||(LA23_250 >= KW_COMPACT && LA23_250 <= KW_CONCATENATE)||LA23_250==KW_CONTINUE||LA23_250==KW_DATA||LA23_250==KW_DATABASES||(LA23_250 >= KW_DATETIME && LA23_250 <= KW_DBPROPERTIES)||(LA23_250 >= KW_DEFERRED && LA23_250 <= KW_DEFINED)||(LA23_250 >= KW_DELIMITED && LA23_250 <= KW_DESC)||(LA23_250 >= KW_DIRECTORIES && LA23_250 <= KW_DISABLE)||LA23_250==KW_DISTRIBUTE||LA23_250==KW_DOW||(LA23_250 >= KW_DUMP && LA23_250 <= KW_ELEM_TYPE)||LA23_250==KW_ENABLE||LA23_250==KW_ESCAPED||LA23_250==KW_EXCLUSIVE||(LA23_250 >= KW_EXPLAIN && LA23_250 <= KW_EXPORT)||(LA23_250 >= KW_FIELDS && LA23_250 <= KW_FIRST)||(LA23_250 >= KW_FORMAT && LA23_250 <= KW_FORMATTED)||LA23_250==KW_FUNCTIONS||(LA23_250 >= KW_HOUR && LA23_250 <= KW_IDXPROPERTIES)||(LA23_250 >= KW_INDEX && LA23_250 <= KW_INDEXES)||(LA23_250 >= KW_INPATH && LA23_250 <= KW_INPUTFORMAT)||(LA23_250 >= KW_ISOLATION && LA23_250 <= KW_JAR)||(LA23_250 >= KW_KEY && LA23_250 <= KW_LAST)||LA23_250==KW_LEVEL||(LA23_250 >= KW_LIMIT && LA23_250 <= KW_LOAD)||(LA23_250 >= KW_LOCATION && LA23_250 <= KW_LONG)||(LA23_250 >= KW_MAPJOIN && LA23_250 <= KW_METADATA)||(LA23_250 >= KW_MINUTE && LA23_250 <= KW_MONTH)||LA23_250==KW_MSCK||(LA23_250 >= KW_NORELY && LA23_250 <= KW_NOSCAN)||LA23_250==KW_NOVALIDATE||LA23_250==KW_NULLS||LA23_250==KW_OFFSET||LA23_250==KW_OPTION||(LA23_250 >= KW_OUTPUTDRIVER && LA23_250 <= KW_OUTPUTFORMAT)||(LA23_250 >= KW_OVERWRITE && LA23_250 <= KW_OWNER)||(LA23_250 >= KW_PARTITIONED && LA23_250 <= KW_PARTITIONS)||LA23_250==KW_PLUS||LA23_250==KW_PRETTY||LA23_250==KW_PRINCIPALS||(LA23_250 >= KW_PURGE && LA23_250 <= KW_QUARTER)||LA23_250==KW_READ||(LA23_250 >= KW_REBUILD && LA23_250 <= KW_RECORDWRITER)||(LA23_250 >= KW_RELOAD && LA23_250 <= KW_RESTRICT)||LA23_250==KW_REWRITE||(LA23_250 >= KW_ROLE && LA23_250 <= KW_ROLES)||(LA23_250 >= KW_SCHEMA && LA23_250 <= KW_SECOND)||(LA23_250 >= KW_SEMI && LA23_250 <= KW_SERVER)||(LA23_250 >= KW_SETS && LA23_250 <= KW_SKEWED)||(LA23_250 >= KW_SNAPSHOT && LA23_250 <= KW_SSL)||(LA23_250 >= KW_STATISTICS && LA23_250 <= KW_STRUCT)||LA23_250==KW_TABLES||(LA23_250 >= KW_TBLPROPERTIES && LA23_250 <= KW_TERMINATED)||LA23_250==KW_TINYINT||(LA23_250 >= KW_TOUCH && LA23_250 <= KW_TRANSACTIONS)||LA23_250==KW_UNARCHIVE||LA23_250==KW_UNDO||LA23_250==KW_UNIONTYPE||(LA23_250 >= KW_UNLOCK && LA23_250 <= KW_UNSIGNED)||(LA23_250 >= KW_URI && LA23_250 <= KW_USE)||(LA23_250 >= KW_UTC && LA23_250 <= KW_VALIDATE)||LA23_250==KW_VALUE_TYPE||(LA23_250 >= KW_VIEW && LA23_250 <= KW_WEEK)||LA23_250==KW_WHILE||(LA23_250 >= KW_WORK && LA23_250 <= KW_YEAR)||LA23_250==KW_BATCH||LA23_250==KW_DAYOFWEEK||LA23_250==KW_HOLD_DDLTIME||LA23_250==KW_IGNORE||LA23_250==KW_NO_DROP||LA23_250==KW_OFFLINE||LA23_250==KW_PROTECTION||LA23_250==KW_READONLY) ) {s = 419;}

                        else if ( ((LA23_250 >= KW_ALL && LA23_250 <= KW_ALTER)||(LA23_250 >= KW_ARRAY && LA23_250 <= KW_AS)||LA23_250==KW_AUTHORIZATION||(LA23_250 >= KW_BETWEEN && LA23_250 <= KW_BOTH)||LA23_250==KW_BY||LA23_250==KW_CONSTRAINT||LA23_250==KW_CREATE||LA23_250==KW_CUBE||(LA23_250 >= KW_CURRENT_DATE && LA23_250 <= KW_CURSOR)||LA23_250==KW_DATE||LA23_250==KW_DECIMAL||LA23_250==KW_DELETE||LA23_250==KW_DESCRIBE||LA23_250==KW_DOUBLE||LA23_250==KW_DROP||LA23_250==KW_EXISTS||LA23_250==KW_EXTERNAL||(LA23_250 >= KW_FALSE && LA23_250 <= KW_FETCH)||LA23_250==KW_FLOAT||(LA23_250 >= KW_FOR && LA23_250 <= KW_FOREIGN)||LA23_250==KW_FULL||(LA23_250 >= KW_GRANT && LA23_250 <= KW_GROUPING)||(LA23_250 >= KW_IMPORT && LA23_250 <= KW_IN)||LA23_250==KW_INNER||(LA23_250 >= KW_INSERT && LA23_250 <= KW_INTERSECT)||(LA23_250 >= KW_INTO && LA23_250 <= KW_IS)||(LA23_250 >= KW_LATERAL && LA23_250 <= KW_LEFT)||LA23_250==KW_LIKE||LA23_250==KW_LOCAL||LA23_250==KW_NONE||LA23_250==KW_NULL||LA23_250==KW_OF||(LA23_250 >= KW_ORDER && LA23_250 <= KW_OUTER)||LA23_250==KW_PARTITION||LA23_250==KW_PERCENT||LA23_250==KW_PRIMARY||LA23_250==KW_PROCEDURE||LA23_250==KW_RANGE||LA23_250==KW_READS||(LA23_250 >= KW_REFERENCES && LA23_250 <= KW_REGEXP)||LA23_250==KW_REVOKE||(LA23_250 >= KW_RIGHT && LA23_250 <= KW_RLIKE)||(LA23_250 >= KW_ROLLUP && LA23_250 <= KW_ROWS)||LA23_250==KW_SET||LA23_250==KW_SMALLINT||LA23_250==KW_TABLE||LA23_250==KW_TIMESTAMP||LA23_250==KW_TO||(LA23_250 >= KW_TRIGGER && LA23_250 <= KW_TRUNCATE)||LA23_250==KW_UNION||LA23_250==KW_UPDATE||(LA23_250 >= KW_USER && LA23_250 <= KW_USING)||LA23_250==KW_VALUES||LA23_250==KW_WITH) ) {s = 420;}

                         
                        input.seek(index23_250);

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA23_277 = input.LA(1);

                         
                        int index23_277 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_277==STAR) && (synpred2_SelectClauseParser())) {s = 421;}

                        else if ( (LA23_277==Identifier) ) {s = 422;}

                        else if ( ((LA23_277 >= KW_ABORT && LA23_277 <= KW_AFTER)||LA23_277==KW_ANALYZE||LA23_277==KW_ARCHIVE||LA23_277==KW_ASC||(LA23_277 >= KW_AUTOCOMMIT && LA23_277 <= KW_BEFORE)||(LA23_277 >= KW_BUCKET && LA23_277 <= KW_BUCKETS)||(LA23_277 >= KW_CACHE && LA23_277 <= KW_CASCADE)||LA23_277==KW_CHANGE||(LA23_277 >= KW_CLUSTER && LA23_277 <= KW_COLLECTION)||(LA23_277 >= KW_COLUMNS && LA23_277 <= KW_COMMENT)||(LA23_277 >= KW_COMPACT && LA23_277 <= KW_CONCATENATE)||LA23_277==KW_CONTINUE||LA23_277==KW_DATA||LA23_277==KW_DATABASES||(LA23_277 >= KW_DATETIME && LA23_277 <= KW_DBPROPERTIES)||(LA23_277 >= KW_DEFERRED && LA23_277 <= KW_DEFINED)||(LA23_277 >= KW_DELIMITED && LA23_277 <= KW_DESC)||(LA23_277 >= KW_DIRECTORIES && LA23_277 <= KW_DISABLE)||LA23_277==KW_DISTRIBUTE||LA23_277==KW_DOW||(LA23_277 >= KW_DUMP && LA23_277 <= KW_ELEM_TYPE)||LA23_277==KW_ENABLE||LA23_277==KW_ESCAPED||LA23_277==KW_EXCLUSIVE||(LA23_277 >= KW_EXPLAIN && LA23_277 <= KW_EXPORT)||(LA23_277 >= KW_FIELDS && LA23_277 <= KW_FIRST)||(LA23_277 >= KW_FORMAT && LA23_277 <= KW_FORMATTED)||LA23_277==KW_FUNCTIONS||(LA23_277 >= KW_HOUR && LA23_277 <= KW_IDXPROPERTIES)||(LA23_277 >= KW_INDEX && LA23_277 <= KW_INDEXES)||(LA23_277 >= KW_INPATH && LA23_277 <= KW_INPUTFORMAT)||(LA23_277 >= KW_ISOLATION && LA23_277 <= KW_JAR)||(LA23_277 >= KW_KEY && LA23_277 <= KW_LAST)||LA23_277==KW_LEVEL||(LA23_277 >= KW_LIMIT && LA23_277 <= KW_LOAD)||(LA23_277 >= KW_LOCATION && LA23_277 <= KW_LONG)||(LA23_277 >= KW_MAPJOIN && LA23_277 <= KW_METADATA)||(LA23_277 >= KW_MINUTE && LA23_277 <= KW_MONTH)||LA23_277==KW_MSCK||(LA23_277 >= KW_NORELY && LA23_277 <= KW_NOSCAN)||LA23_277==KW_NOVALIDATE||LA23_277==KW_NULLS||LA23_277==KW_OFFSET||LA23_277==KW_OPTION||(LA23_277 >= KW_OUTPUTDRIVER && LA23_277 <= KW_OUTPUTFORMAT)||(LA23_277 >= KW_OVERWRITE && LA23_277 <= KW_OWNER)||(LA23_277 >= KW_PARTITIONED && LA23_277 <= KW_PARTITIONS)||LA23_277==KW_PLUS||LA23_277==KW_PRETTY||LA23_277==KW_PRINCIPALS||(LA23_277 >= KW_PURGE && LA23_277 <= KW_QUARTER)||LA23_277==KW_READ||(LA23_277 >= KW_REBUILD && LA23_277 <= KW_RECORDWRITER)||(LA23_277 >= KW_RELOAD && LA23_277 <= KW_RESTRICT)||LA23_277==KW_REWRITE||(LA23_277 >= KW_ROLE && LA23_277 <= KW_ROLES)||(LA23_277 >= KW_SCHEMA && LA23_277 <= KW_SECOND)||(LA23_277 >= KW_SEMI && LA23_277 <= KW_SERVER)||(LA23_277 >= KW_SETS && LA23_277 <= KW_SKEWED)||(LA23_277 >= KW_SNAPSHOT && LA23_277 <= KW_SSL)||(LA23_277 >= KW_STATISTICS && LA23_277 <= KW_STRUCT)||LA23_277==KW_TABLES||(LA23_277 >= KW_TBLPROPERTIES && LA23_277 <= KW_TERMINATED)||LA23_277==KW_TINYINT||(LA23_277 >= KW_TOUCH && LA23_277 <= KW_TRANSACTIONS)||LA23_277==KW_UNARCHIVE||LA23_277==KW_UNDO||LA23_277==KW_UNIONTYPE||(LA23_277 >= KW_UNLOCK && LA23_277 <= KW_UNSIGNED)||(LA23_277 >= KW_URI && LA23_277 <= KW_USE)||(LA23_277 >= KW_UTC && LA23_277 <= KW_VALIDATE)||LA23_277==KW_VALUE_TYPE||(LA23_277 >= KW_VIEW && LA23_277 <= KW_WEEK)||LA23_277==KW_WHILE||(LA23_277 >= KW_WORK && LA23_277 <= KW_YEAR)||LA23_277==KW_BATCH||LA23_277==KW_DAYOFWEEK||LA23_277==KW_HOLD_DDLTIME||LA23_277==KW_IGNORE||LA23_277==KW_NO_DROP||LA23_277==KW_OFFLINE||LA23_277==KW_PROTECTION||LA23_277==KW_READONLY) ) {s = 423;}

                        else if ( ((LA23_277 >= KW_ALL && LA23_277 <= KW_ALTER)||(LA23_277 >= KW_ARRAY && LA23_277 <= KW_AS)||LA23_277==KW_AUTHORIZATION||(LA23_277 >= KW_BETWEEN && LA23_277 <= KW_BOTH)||LA23_277==KW_BY||LA23_277==KW_CONSTRAINT||LA23_277==KW_CREATE||LA23_277==KW_CUBE||(LA23_277 >= KW_CURRENT_DATE && LA23_277 <= KW_CURSOR)||LA23_277==KW_DATE||LA23_277==KW_DECIMAL||LA23_277==KW_DELETE||LA23_277==KW_DESCRIBE||LA23_277==KW_DOUBLE||LA23_277==KW_DROP||LA23_277==KW_EXISTS||LA23_277==KW_EXTERNAL||(LA23_277 >= KW_FALSE && LA23_277 <= KW_FETCH)||LA23_277==KW_FLOAT||(LA23_277 >= KW_FOR && LA23_277 <= KW_FOREIGN)||LA23_277==KW_FULL||(LA23_277 >= KW_GRANT && LA23_277 <= KW_GROUPING)||(LA23_277 >= KW_IMPORT && LA23_277 <= KW_IN)||LA23_277==KW_INNER||(LA23_277 >= KW_INSERT && LA23_277 <= KW_INTERSECT)||(LA23_277 >= KW_INTO && LA23_277 <= KW_IS)||(LA23_277 >= KW_LATERAL && LA23_277 <= KW_LEFT)||LA23_277==KW_LIKE||LA23_277==KW_LOCAL||LA23_277==KW_NONE||LA23_277==KW_NULL||LA23_277==KW_OF||(LA23_277 >= KW_ORDER && LA23_277 <= KW_OUTER)||LA23_277==KW_PARTITION||LA23_277==KW_PERCENT||LA23_277==KW_PRIMARY||LA23_277==KW_PROCEDURE||LA23_277==KW_RANGE||LA23_277==KW_READS||(LA23_277 >= KW_REFERENCES && LA23_277 <= KW_REGEXP)||LA23_277==KW_REVOKE||(LA23_277 >= KW_RIGHT && LA23_277 <= KW_RLIKE)||(LA23_277 >= KW_ROLLUP && LA23_277 <= KW_ROWS)||LA23_277==KW_SET||LA23_277==KW_SMALLINT||LA23_277==KW_TABLE||LA23_277==KW_TIMESTAMP||LA23_277==KW_TO||(LA23_277 >= KW_TRIGGER && LA23_277 <= KW_TRUNCATE)||LA23_277==KW_UNION||LA23_277==KW_UPDATE||(LA23_277 >= KW_USER && LA23_277 <= KW_USING)||LA23_277==KW_VALUES||LA23_277==KW_WITH) ) {s = 424;}

                         
                        input.seek(index23_277);

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA23_304 = input.LA(1);

                         
                        int index23_304 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_304==STAR) && (synpred2_SelectClauseParser())) {s = 425;}

                        else if ( (LA23_304==Identifier) ) {s = 426;}

                        else if ( ((LA23_304 >= KW_ABORT && LA23_304 <= KW_AFTER)||LA23_304==KW_ANALYZE||LA23_304==KW_ARCHIVE||LA23_304==KW_ASC||(LA23_304 >= KW_AUTOCOMMIT && LA23_304 <= KW_BEFORE)||(LA23_304 >= KW_BUCKET && LA23_304 <= KW_BUCKETS)||(LA23_304 >= KW_CACHE && LA23_304 <= KW_CASCADE)||LA23_304==KW_CHANGE||(LA23_304 >= KW_CLUSTER && LA23_304 <= KW_COLLECTION)||(LA23_304 >= KW_COLUMNS && LA23_304 <= KW_COMMENT)||(LA23_304 >= KW_COMPACT && LA23_304 <= KW_CONCATENATE)||LA23_304==KW_CONTINUE||LA23_304==KW_DATA||LA23_304==KW_DATABASES||(LA23_304 >= KW_DATETIME && LA23_304 <= KW_DBPROPERTIES)||(LA23_304 >= KW_DEFERRED && LA23_304 <= KW_DEFINED)||(LA23_304 >= KW_DELIMITED && LA23_304 <= KW_DESC)||(LA23_304 >= KW_DIRECTORIES && LA23_304 <= KW_DISABLE)||LA23_304==KW_DISTRIBUTE||LA23_304==KW_DOW||(LA23_304 >= KW_DUMP && LA23_304 <= KW_ELEM_TYPE)||LA23_304==KW_ENABLE||LA23_304==KW_ESCAPED||LA23_304==KW_EXCLUSIVE||(LA23_304 >= KW_EXPLAIN && LA23_304 <= KW_EXPORT)||(LA23_304 >= KW_FIELDS && LA23_304 <= KW_FIRST)||(LA23_304 >= KW_FORMAT && LA23_304 <= KW_FORMATTED)||LA23_304==KW_FUNCTIONS||(LA23_304 >= KW_HOUR && LA23_304 <= KW_IDXPROPERTIES)||(LA23_304 >= KW_INDEX && LA23_304 <= KW_INDEXES)||(LA23_304 >= KW_INPATH && LA23_304 <= KW_INPUTFORMAT)||(LA23_304 >= KW_ISOLATION && LA23_304 <= KW_JAR)||(LA23_304 >= KW_KEY && LA23_304 <= KW_LAST)||LA23_304==KW_LEVEL||(LA23_304 >= KW_LIMIT && LA23_304 <= KW_LOAD)||(LA23_304 >= KW_LOCATION && LA23_304 <= KW_LONG)||(LA23_304 >= KW_MAPJOIN && LA23_304 <= KW_METADATA)||(LA23_304 >= KW_MINUTE && LA23_304 <= KW_MONTH)||LA23_304==KW_MSCK||(LA23_304 >= KW_NORELY && LA23_304 <= KW_NOSCAN)||LA23_304==KW_NOVALIDATE||LA23_304==KW_NULLS||LA23_304==KW_OFFSET||LA23_304==KW_OPTION||(LA23_304 >= KW_OUTPUTDRIVER && LA23_304 <= KW_OUTPUTFORMAT)||(LA23_304 >= KW_OVERWRITE && LA23_304 <= KW_OWNER)||(LA23_304 >= KW_PARTITIONED && LA23_304 <= KW_PARTITIONS)||LA23_304==KW_PLUS||LA23_304==KW_PRETTY||LA23_304==KW_PRINCIPALS||(LA23_304 >= KW_PURGE && LA23_304 <= KW_QUARTER)||LA23_304==KW_READ||(LA23_304 >= KW_REBUILD && LA23_304 <= KW_RECORDWRITER)||(LA23_304 >= KW_RELOAD && LA23_304 <= KW_RESTRICT)||LA23_304==KW_REWRITE||(LA23_304 >= KW_ROLE && LA23_304 <= KW_ROLES)||(LA23_304 >= KW_SCHEMA && LA23_304 <= KW_SECOND)||(LA23_304 >= KW_SEMI && LA23_304 <= KW_SERVER)||(LA23_304 >= KW_SETS && LA23_304 <= KW_SKEWED)||(LA23_304 >= KW_SNAPSHOT && LA23_304 <= KW_SSL)||(LA23_304 >= KW_STATISTICS && LA23_304 <= KW_STRUCT)||LA23_304==KW_TABLES||(LA23_304 >= KW_TBLPROPERTIES && LA23_304 <= KW_TERMINATED)||LA23_304==KW_TINYINT||(LA23_304 >= KW_TOUCH && LA23_304 <= KW_TRANSACTIONS)||LA23_304==KW_UNARCHIVE||LA23_304==KW_UNDO||LA23_304==KW_UNIONTYPE||(LA23_304 >= KW_UNLOCK && LA23_304 <= KW_UNSIGNED)||(LA23_304 >= KW_URI && LA23_304 <= KW_USE)||(LA23_304 >= KW_UTC && LA23_304 <= KW_VALIDATE)||LA23_304==KW_VALUE_TYPE||(LA23_304 >= KW_VIEW && LA23_304 <= KW_WEEK)||LA23_304==KW_WHILE||(LA23_304 >= KW_WORK && LA23_304 <= KW_YEAR)||LA23_304==KW_BATCH||LA23_304==KW_DAYOFWEEK||LA23_304==KW_HOLD_DDLTIME||LA23_304==KW_IGNORE||LA23_304==KW_NO_DROP||LA23_304==KW_OFFLINE||LA23_304==KW_PROTECTION||LA23_304==KW_READONLY) ) {s = 427;}

                        else if ( ((LA23_304 >= KW_ALL && LA23_304 <= KW_ALTER)||(LA23_304 >= KW_ARRAY && LA23_304 <= KW_AS)||LA23_304==KW_AUTHORIZATION||(LA23_304 >= KW_BETWEEN && LA23_304 <= KW_BOTH)||LA23_304==KW_BY||LA23_304==KW_CONSTRAINT||LA23_304==KW_CREATE||LA23_304==KW_CUBE||(LA23_304 >= KW_CURRENT_DATE && LA23_304 <= KW_CURSOR)||LA23_304==KW_DATE||LA23_304==KW_DECIMAL||LA23_304==KW_DELETE||LA23_304==KW_DESCRIBE||LA23_304==KW_DOUBLE||LA23_304==KW_DROP||LA23_304==KW_EXISTS||LA23_304==KW_EXTERNAL||(LA23_304 >= KW_FALSE && LA23_304 <= KW_FETCH)||LA23_304==KW_FLOAT||(LA23_304 >= KW_FOR && LA23_304 <= KW_FOREIGN)||LA23_304==KW_FULL||(LA23_304 >= KW_GRANT && LA23_304 <= KW_GROUPING)||(LA23_304 >= KW_IMPORT && LA23_304 <= KW_IN)||LA23_304==KW_INNER||(LA23_304 >= KW_INSERT && LA23_304 <= KW_INTERSECT)||(LA23_304 >= KW_INTO && LA23_304 <= KW_IS)||(LA23_304 >= KW_LATERAL && LA23_304 <= KW_LEFT)||LA23_304==KW_LIKE||LA23_304==KW_LOCAL||LA23_304==KW_NONE||LA23_304==KW_NULL||LA23_304==KW_OF||(LA23_304 >= KW_ORDER && LA23_304 <= KW_OUTER)||LA23_304==KW_PARTITION||LA23_304==KW_PERCENT||LA23_304==KW_PRIMARY||LA23_304==KW_PROCEDURE||LA23_304==KW_RANGE||LA23_304==KW_READS||(LA23_304 >= KW_REFERENCES && LA23_304 <= KW_REGEXP)||LA23_304==KW_REVOKE||(LA23_304 >= KW_RIGHT && LA23_304 <= KW_RLIKE)||(LA23_304 >= KW_ROLLUP && LA23_304 <= KW_ROWS)||LA23_304==KW_SET||LA23_304==KW_SMALLINT||LA23_304==KW_TABLE||LA23_304==KW_TIMESTAMP||LA23_304==KW_TO||(LA23_304 >= KW_TRIGGER && LA23_304 <= KW_TRUNCATE)||LA23_304==KW_UNION||LA23_304==KW_UPDATE||(LA23_304 >= KW_USER && LA23_304 <= KW_USING)||LA23_304==KW_VALUES||LA23_304==KW_WITH) ) {s = 428;}

                         
                        input.seek(index23_304);

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA23_331 = input.LA(1);

                         
                        int index23_331 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_331==STAR) && (synpred2_SelectClauseParser())) {s = 429;}

                        else if ( (LA23_331==Identifier) ) {s = 430;}

                        else if ( ((LA23_331 >= KW_ABORT && LA23_331 <= KW_AFTER)||LA23_331==KW_ANALYZE||LA23_331==KW_ARCHIVE||LA23_331==KW_ASC||(LA23_331 >= KW_AUTOCOMMIT && LA23_331 <= KW_BEFORE)||(LA23_331 >= KW_BUCKET && LA23_331 <= KW_BUCKETS)||(LA23_331 >= KW_CACHE && LA23_331 <= KW_CASCADE)||LA23_331==KW_CHANGE||(LA23_331 >= KW_CLUSTER && LA23_331 <= KW_COLLECTION)||(LA23_331 >= KW_COLUMNS && LA23_331 <= KW_COMMENT)||(LA23_331 >= KW_COMPACT && LA23_331 <= KW_CONCATENATE)||LA23_331==KW_CONTINUE||LA23_331==KW_DATA||LA23_331==KW_DATABASES||(LA23_331 >= KW_DATETIME && LA23_331 <= KW_DBPROPERTIES)||(LA23_331 >= KW_DEFERRED && LA23_331 <= KW_DEFINED)||(LA23_331 >= KW_DELIMITED && LA23_331 <= KW_DESC)||(LA23_331 >= KW_DIRECTORIES && LA23_331 <= KW_DISABLE)||LA23_331==KW_DISTRIBUTE||LA23_331==KW_DOW||(LA23_331 >= KW_DUMP && LA23_331 <= KW_ELEM_TYPE)||LA23_331==KW_ENABLE||LA23_331==KW_ESCAPED||LA23_331==KW_EXCLUSIVE||(LA23_331 >= KW_EXPLAIN && LA23_331 <= KW_EXPORT)||(LA23_331 >= KW_FIELDS && LA23_331 <= KW_FIRST)||(LA23_331 >= KW_FORMAT && LA23_331 <= KW_FORMATTED)||LA23_331==KW_FUNCTIONS||(LA23_331 >= KW_HOUR && LA23_331 <= KW_IDXPROPERTIES)||(LA23_331 >= KW_INDEX && LA23_331 <= KW_INDEXES)||(LA23_331 >= KW_INPATH && LA23_331 <= KW_INPUTFORMAT)||(LA23_331 >= KW_ISOLATION && LA23_331 <= KW_JAR)||(LA23_331 >= KW_KEY && LA23_331 <= KW_LAST)||LA23_331==KW_LEVEL||(LA23_331 >= KW_LIMIT && LA23_331 <= KW_LOAD)||(LA23_331 >= KW_LOCATION && LA23_331 <= KW_LONG)||(LA23_331 >= KW_MAPJOIN && LA23_331 <= KW_METADATA)||(LA23_331 >= KW_MINUTE && LA23_331 <= KW_MONTH)||LA23_331==KW_MSCK||(LA23_331 >= KW_NORELY && LA23_331 <= KW_NOSCAN)||LA23_331==KW_NOVALIDATE||LA23_331==KW_NULLS||LA23_331==KW_OFFSET||LA23_331==KW_OPTION||(LA23_331 >= KW_OUTPUTDRIVER && LA23_331 <= KW_OUTPUTFORMAT)||(LA23_331 >= KW_OVERWRITE && LA23_331 <= KW_OWNER)||(LA23_331 >= KW_PARTITIONED && LA23_331 <= KW_PARTITIONS)||LA23_331==KW_PLUS||LA23_331==KW_PRETTY||LA23_331==KW_PRINCIPALS||(LA23_331 >= KW_PURGE && LA23_331 <= KW_QUARTER)||LA23_331==KW_READ||(LA23_331 >= KW_REBUILD && LA23_331 <= KW_RECORDWRITER)||(LA23_331 >= KW_RELOAD && LA23_331 <= KW_RESTRICT)||LA23_331==KW_REWRITE||(LA23_331 >= KW_ROLE && LA23_331 <= KW_ROLES)||(LA23_331 >= KW_SCHEMA && LA23_331 <= KW_SECOND)||(LA23_331 >= KW_SEMI && LA23_331 <= KW_SERVER)||(LA23_331 >= KW_SETS && LA23_331 <= KW_SKEWED)||(LA23_331 >= KW_SNAPSHOT && LA23_331 <= KW_SSL)||(LA23_331 >= KW_STATISTICS && LA23_331 <= KW_STRUCT)||LA23_331==KW_TABLES||(LA23_331 >= KW_TBLPROPERTIES && LA23_331 <= KW_TERMINATED)||LA23_331==KW_TINYINT||(LA23_331 >= KW_TOUCH && LA23_331 <= KW_TRANSACTIONS)||LA23_331==KW_UNARCHIVE||LA23_331==KW_UNDO||LA23_331==KW_UNIONTYPE||(LA23_331 >= KW_UNLOCK && LA23_331 <= KW_UNSIGNED)||(LA23_331 >= KW_URI && LA23_331 <= KW_USE)||(LA23_331 >= KW_UTC && LA23_331 <= KW_VALIDATE)||LA23_331==KW_VALUE_TYPE||(LA23_331 >= KW_VIEW && LA23_331 <= KW_WEEK)||LA23_331==KW_WHILE||(LA23_331 >= KW_WORK && LA23_331 <= KW_YEAR)||LA23_331==KW_BATCH||LA23_331==KW_DAYOFWEEK||LA23_331==KW_HOLD_DDLTIME||LA23_331==KW_IGNORE||LA23_331==KW_NO_DROP||LA23_331==KW_OFFLINE||LA23_331==KW_PROTECTION||LA23_331==KW_READONLY) ) {s = 431;}

                        else if ( ((LA23_331 >= KW_ALL && LA23_331 <= KW_ALTER)||(LA23_331 >= KW_ARRAY && LA23_331 <= KW_AS)||LA23_331==KW_AUTHORIZATION||(LA23_331 >= KW_BETWEEN && LA23_331 <= KW_BOTH)||LA23_331==KW_BY||LA23_331==KW_CONSTRAINT||LA23_331==KW_CREATE||LA23_331==KW_CUBE||(LA23_331 >= KW_CURRENT_DATE && LA23_331 <= KW_CURSOR)||LA23_331==KW_DATE||LA23_331==KW_DECIMAL||LA23_331==KW_DELETE||LA23_331==KW_DESCRIBE||LA23_331==KW_DOUBLE||LA23_331==KW_DROP||LA23_331==KW_EXISTS||LA23_331==KW_EXTERNAL||(LA23_331 >= KW_FALSE && LA23_331 <= KW_FETCH)||LA23_331==KW_FLOAT||(LA23_331 >= KW_FOR && LA23_331 <= KW_FOREIGN)||LA23_331==KW_FULL||(LA23_331 >= KW_GRANT && LA23_331 <= KW_GROUPING)||(LA23_331 >= KW_IMPORT && LA23_331 <= KW_IN)||LA23_331==KW_INNER||(LA23_331 >= KW_INSERT && LA23_331 <= KW_INTERSECT)||(LA23_331 >= KW_INTO && LA23_331 <= KW_IS)||(LA23_331 >= KW_LATERAL && LA23_331 <= KW_LEFT)||LA23_331==KW_LIKE||LA23_331==KW_LOCAL||LA23_331==KW_NONE||LA23_331==KW_NULL||LA23_331==KW_OF||(LA23_331 >= KW_ORDER && LA23_331 <= KW_OUTER)||LA23_331==KW_PARTITION||LA23_331==KW_PERCENT||LA23_331==KW_PRIMARY||LA23_331==KW_PROCEDURE||LA23_331==KW_RANGE||LA23_331==KW_READS||(LA23_331 >= KW_REFERENCES && LA23_331 <= KW_REGEXP)||LA23_331==KW_REVOKE||(LA23_331 >= KW_RIGHT && LA23_331 <= KW_RLIKE)||(LA23_331 >= KW_ROLLUP && LA23_331 <= KW_ROWS)||LA23_331==KW_SET||LA23_331==KW_SMALLINT||LA23_331==KW_TABLE||LA23_331==KW_TIMESTAMP||LA23_331==KW_TO||(LA23_331 >= KW_TRIGGER && LA23_331 <= KW_TRUNCATE)||LA23_331==KW_UNION||LA23_331==KW_UPDATE||(LA23_331 >= KW_USER && LA23_331 <= KW_USING)||LA23_331==KW_VALUES||LA23_331==KW_WITH) ) {s = 432;}

                         
                        input.seek(index23_331);

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA23_358 = input.LA(1);

                         
                        int index23_358 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA23_358==STAR) && (synpred2_SelectClauseParser())) {s = 433;}

                        else if ( (LA23_358==Identifier) ) {s = 434;}

                        else if ( ((LA23_358 >= KW_ABORT && LA23_358 <= KW_AFTER)||LA23_358==KW_ANALYZE||LA23_358==KW_ARCHIVE||LA23_358==KW_ASC||(LA23_358 >= KW_AUTOCOMMIT && LA23_358 <= KW_BEFORE)||(LA23_358 >= KW_BUCKET && LA23_358 <= KW_BUCKETS)||(LA23_358 >= KW_CACHE && LA23_358 <= KW_CASCADE)||LA23_358==KW_CHANGE||(LA23_358 >= KW_CLUSTER && LA23_358 <= KW_COLLECTION)||(LA23_358 >= KW_COLUMNS && LA23_358 <= KW_COMMENT)||(LA23_358 >= KW_COMPACT && LA23_358 <= KW_CONCATENATE)||LA23_358==KW_CONTINUE||LA23_358==KW_DATA||LA23_358==KW_DATABASES||(LA23_358 >= KW_DATETIME && LA23_358 <= KW_DBPROPERTIES)||(LA23_358 >= KW_DEFERRED && LA23_358 <= KW_DEFINED)||(LA23_358 >= KW_DELIMITED && LA23_358 <= KW_DESC)||(LA23_358 >= KW_DIRECTORIES && LA23_358 <= KW_DISABLE)||LA23_358==KW_DISTRIBUTE||LA23_358==KW_DOW||(LA23_358 >= KW_DUMP && LA23_358 <= KW_ELEM_TYPE)||LA23_358==KW_ENABLE||LA23_358==KW_ESCAPED||LA23_358==KW_EXCLUSIVE||(LA23_358 >= KW_EXPLAIN && LA23_358 <= KW_EXPORT)||(LA23_358 >= KW_FIELDS && LA23_358 <= KW_FIRST)||(LA23_358 >= KW_FORMAT && LA23_358 <= KW_FORMATTED)||LA23_358==KW_FUNCTIONS||(LA23_358 >= KW_HOUR && LA23_358 <= KW_IDXPROPERTIES)||(LA23_358 >= KW_INDEX && LA23_358 <= KW_INDEXES)||(LA23_358 >= KW_INPATH && LA23_358 <= KW_INPUTFORMAT)||(LA23_358 >= KW_ISOLATION && LA23_358 <= KW_JAR)||(LA23_358 >= KW_KEY && LA23_358 <= KW_LAST)||LA23_358==KW_LEVEL||(LA23_358 >= KW_LIMIT && LA23_358 <= KW_LOAD)||(LA23_358 >= KW_LOCATION && LA23_358 <= KW_LONG)||(LA23_358 >= KW_MAPJOIN && LA23_358 <= KW_METADATA)||(LA23_358 >= KW_MINUTE && LA23_358 <= KW_MONTH)||LA23_358==KW_MSCK||(LA23_358 >= KW_NORELY && LA23_358 <= KW_NOSCAN)||LA23_358==KW_NOVALIDATE||LA23_358==KW_NULLS||LA23_358==KW_OFFSET||LA23_358==KW_OPTION||(LA23_358 >= KW_OUTPUTDRIVER && LA23_358 <= KW_OUTPUTFORMAT)||(LA23_358 >= KW_OVERWRITE && LA23_358 <= KW_OWNER)||(LA23_358 >= KW_PARTITIONED && LA23_358 <= KW_PARTITIONS)||LA23_358==KW_PLUS||LA23_358==KW_PRETTY||LA23_358==KW_PRINCIPALS||(LA23_358 >= KW_PURGE && LA23_358 <= KW_QUARTER)||LA23_358==KW_READ||(LA23_358 >= KW_REBUILD && LA23_358 <= KW_RECORDWRITER)||(LA23_358 >= KW_RELOAD && LA23_358 <= KW_RESTRICT)||LA23_358==KW_REWRITE||(LA23_358 >= KW_ROLE && LA23_358 <= KW_ROLES)||(LA23_358 >= KW_SCHEMA && LA23_358 <= KW_SECOND)||(LA23_358 >= KW_SEMI && LA23_358 <= KW_SERVER)||(LA23_358 >= KW_SETS && LA23_358 <= KW_SKEWED)||(LA23_358 >= KW_SNAPSHOT && LA23_358 <= KW_SSL)||(LA23_358 >= KW_STATISTICS && LA23_358 <= KW_STRUCT)||LA23_358==KW_TABLES||(LA23_358 >= KW_TBLPROPERTIES && LA23_358 <= KW_TERMINATED)||LA23_358==KW_TINYINT||(LA23_358 >= KW_TOUCH && LA23_358 <= KW_TRANSACTIONS)||LA23_358==KW_UNARCHIVE||LA23_358==KW_UNDO||LA23_358==KW_UNIONTYPE||(LA23_358 >= KW_UNLOCK && LA23_358 <= KW_UNSIGNED)||(LA23_358 >= KW_URI && LA23_358 <= KW_USE)||(LA23_358 >= KW_UTC && LA23_358 <= KW_VALIDATE)||LA23_358==KW_VALUE_TYPE||(LA23_358 >= KW_VIEW && LA23_358 <= KW_WEEK)||LA23_358==KW_WHILE||(LA23_358 >= KW_WORK && LA23_358 <= KW_YEAR)||LA23_358==KW_BATCH||LA23_358==KW_DAYOFWEEK||LA23_358==KW_HOLD_DDLTIME||LA23_358==KW_IGNORE||LA23_358==KW_NO_DROP||LA23_358==KW_OFFLINE||LA23_358==KW_PROTECTION||LA23_358==KW_READONLY) ) {s = 435;}

                        else if ( ((LA23_358 >= KW_ALL && LA23_358 <= KW_ALTER)||(LA23_358 >= KW_ARRAY && LA23_358 <= KW_AS)||LA23_358==KW_AUTHORIZATION||(LA23_358 >= KW_BETWEEN && LA23_358 <= KW_BOTH)||LA23_358==KW_BY||LA23_358==KW_CONSTRAINT||LA23_358==KW_CREATE||LA23_358==KW_CUBE||(LA23_358 >= KW_CURRENT_DATE && LA23_358 <= KW_CURSOR)||LA23_358==KW_DATE||LA23_358==KW_DECIMAL||LA23_358==KW_DELETE||LA23_358==KW_DESCRIBE||LA23_358==KW_DOUBLE||LA23_358==KW_DROP||LA23_358==KW_EXISTS||LA23_358==KW_EXTERNAL||(LA23_358 >= KW_FALSE && LA23_358 <= KW_FETCH)||LA23_358==KW_FLOAT||(LA23_358 >= KW_FOR && LA23_358 <= KW_FOREIGN)||LA23_358==KW_FULL||(LA23_358 >= KW_GRANT && LA23_358 <= KW_GROUPING)||(LA23_358 >= KW_IMPORT && LA23_358 <= KW_IN)||LA23_358==KW_INNER||(LA23_358 >= KW_INSERT && LA23_358 <= KW_INTERSECT)||(LA23_358 >= KW_INTO && LA23_358 <= KW_IS)||(LA23_358 >= KW_LATERAL && LA23_358 <= KW_LEFT)||LA23_358==KW_LIKE||LA23_358==KW_LOCAL||LA23_358==KW_NONE||LA23_358==KW_NULL||LA23_358==KW_OF||(LA23_358 >= KW_ORDER && LA23_358 <= KW_OUTER)||LA23_358==KW_PARTITION||LA23_358==KW_PERCENT||LA23_358==KW_PRIMARY||LA23_358==KW_PROCEDURE||LA23_358==KW_RANGE||LA23_358==KW_READS||(LA23_358 >= KW_REFERENCES && LA23_358 <= KW_REGEXP)||LA23_358==KW_REVOKE||(LA23_358 >= KW_RIGHT && LA23_358 <= KW_RLIKE)||(LA23_358 >= KW_ROLLUP && LA23_358 <= KW_ROWS)||LA23_358==KW_SET||LA23_358==KW_SMALLINT||LA23_358==KW_TABLE||LA23_358==KW_TIMESTAMP||LA23_358==KW_TO||(LA23_358 >= KW_TRIGGER && LA23_358 <= KW_TRUNCATE)||LA23_358==KW_UNION||LA23_358==KW_UPDATE||(LA23_358 >= KW_USER && LA23_358 <= KW_USING)||LA23_358==KW_VALUES||LA23_358==KW_WITH) ) {s = 436;}

                         
                        input.seek(index23_358);

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA23_386 = input.LA(1);

                         
                        int index23_386 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_SelectClauseParser()) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_386);

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA23_387 = input.LA(1);

                         
                        int index23_387 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_SelectClauseParser()) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_387);

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA23_388 = input.LA(1);

                         
                        int index23_388 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_SelectClauseParser()) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_388);

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA23_390 = input.LA(1);

                         
                        int index23_390 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_SelectClauseParser()) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_390);

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA23_391 = input.LA(1);

                         
                        int index23_391 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_SelectClauseParser()) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_391);

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA23_392 = input.LA(1);

                         
                        int index23_392 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_SelectClauseParser()) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_392);

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA23_394 = input.LA(1);

                         
                        int index23_394 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_394);

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA23_395 = input.LA(1);

                         
                        int index23_395 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_395);

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA23_396 = input.LA(1);

                         
                        int index23_396 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_396);

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA23_398 = input.LA(1);

                         
                        int index23_398 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_398);

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA23_399 = input.LA(1);

                         
                        int index23_399 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_399);

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA23_400 = input.LA(1);

                         
                        int index23_400 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_400);

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA23_402 = input.LA(1);

                         
                        int index23_402 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_402);

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA23_403 = input.LA(1);

                         
                        int index23_403 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_403);

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA23_404 = input.LA(1);

                         
                        int index23_404 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_404);

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA23_406 = input.LA(1);

                         
                        int index23_406 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_406);

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA23_407 = input.LA(1);

                         
                        int index23_407 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_407);

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA23_408 = input.LA(1);

                         
                        int index23_408 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_408);

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA23_410 = input.LA(1);

                         
                        int index23_410 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_410);

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA23_411 = input.LA(1);

                         
                        int index23_411 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_411);

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA23_412 = input.LA(1);

                         
                        int index23_412 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_412);

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA23_414 = input.LA(1);

                         
                        int index23_414 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_414);

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA23_415 = input.LA(1);

                         
                        int index23_415 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_415);

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA23_416 = input.LA(1);

                         
                        int index23_416 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_416);

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA23_418 = input.LA(1);

                         
                        int index23_418 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_418);

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA23_419 = input.LA(1);

                         
                        int index23_419 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_419);

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA23_420 = input.LA(1);

                         
                        int index23_420 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_420);

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA23_422 = input.LA(1);

                         
                        int index23_422 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_422);

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA23_423 = input.LA(1);

                         
                        int index23_423 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_423);

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA23_424 = input.LA(1);

                         
                        int index23_424 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_424);

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA23_426 = input.LA(1);

                         
                        int index23_426 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_426);

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA23_427 = input.LA(1);

                         
                        int index23_427 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_427);

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA23_428 = input.LA(1);

                         
                        int index23_428 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_428);

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA23_430 = input.LA(1);

                         
                        int index23_430 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_430);

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA23_431 = input.LA(1);

                         
                        int index23_431 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_431);

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA23_432 = input.LA(1);

                         
                        int index23_432 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_432);

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA23_434 = input.LA(1);

                         
                        int index23_434 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_434);

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA23_435 = input.LA(1);

                         
                        int index23_435 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_435);

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA23_436 = input.LA(1);

                         
                        int index23_436 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (((synpred2_SelectClauseParser()&&synpred2_SelectClauseParser())&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 433;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}

                         
                        input.seek(index23_436);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA26_eotS =
        "\121\uffff";
    static final String DFA26_eofS =
        "\121\uffff";
    static final String DFA26_minS =
        "\1\33\1\uffff\3\62\1\53\2\62\1\uffff\1\53\107\uffff";
    static final String DFA26_maxS =
        "\1\u022e\1\uffff\6\u0154\1\uffff\1\u0154\107\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\11\uffff\1\2\105\uffff";
    static final String DFA26_specialS =
        "\121\uffff}>";
    static final String[] DFA26_transitionS = {
            "\10\1\1\uffff\21\1\2\uffff\1\1\1\uffff\1\7\3\1\1\uffff\2\1\1"+
            "\uffff\4\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\20\1"+
            "\1\uffff\1\2\5\1\1\uffff\1\1\1\uffff\1\1\2\uffff\4\1\1\uffff"+
            "\1\1\1\uffff\7\1\2\uffff\4\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\2\1\1\uffff\13\1\1\uffff\5\1\1\uffff\6\1\1\uffff\13\1\2\uffff"+
            "\5\1\1\uffff\2\1\1\uffff\4\1\1\uffff\5\1\2\uffff\1\1\1\uffff"+
            "\1\4\4\1\1\uffff\2\1\1\uffff\1\3\4\1\3\uffff\6\1\1\11\5\1\1"+
            "\uffff\20\1\1\uffff\2\1\1\5\3\1\1\uffff\14\1\1\6\2\1\1\uffff"+
            "\10\1\1\uffff\3\1\1\uffff\6\1\1\uffff\4\1\1\uffff\3\1\1\uffff"+
            "\15\1\1\uffff\3\1\2\uffff\1\1\1\uffff\4\1\16\uffff\1\13\51\uffff"+
            "\1\1\46\uffff\1\1\61\uffff\1\1\3\uffff\1\1\61\uffff\1\1\3\uffff"+
            "\1\1\27\uffff\1\1\4\uffff\1\1",
            "",
            "\1\13\6\uffff\1\1\50\uffff\1\1\147\uffff\1\1\10\uffff\1\1\15"+
            "\uffff\1\1\31\uffff\1\1\20\uffff\1\1\107\uffff\1\1",
            "\1\13\6\uffff\1\1\50\uffff\1\1\147\uffff\1\1\10\uffff\1\1\15"+
            "\uffff\1\1\31\uffff\1\1\20\uffff\1\1\107\uffff\1\1",
            "\1\13\6\uffff\1\1\50\uffff\1\1\147\uffff\1\1\10\uffff\1\1\15"+
            "\uffff\1\1\31\uffff\1\1\20\uffff\1\1\107\uffff\1\1",
            "\1\13\15\uffff\1\1\21\uffff\1\13\26\uffff\1\1\147\uffff\1\1"+
            "\10\uffff\1\1\15\uffff\1\1\31\uffff\1\1\20\uffff\1\1\33\uffff"+
            "\1\13\46\uffff\1\13\4\uffff\1\1",
            "\1\13\6\uffff\1\1\50\uffff\1\1\147\uffff\1\1\10\uffff\1\1\15"+
            "\uffff\1\1\31\uffff\1\1\20\uffff\1\1\107\uffff\1\1",
            "\1\13\6\uffff\1\1\50\uffff\1\1\147\uffff\1\1\10\uffff\1\1\15"+
            "\uffff\1\1\31\uffff\1\1\20\uffff\1\1\107\uffff\1\1",
            "",
            "\1\13\15\uffff\1\1\21\uffff\1\13\26\uffff\1\1\147\uffff\1\1"+
            "\10\uffff\1\1\15\uffff\1\1\31\uffff\1\1\20\uffff\1\1\33\uffff"+
            "\1\13\46\uffff\1\13\4\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "185:26: ( identifier )?";
        }
    }
 

    public static final BitSet FOLLOW_KW_SELECT_in_selectClause71 = new BitSet(new long[]{0xDEFFFFF7F8094080L,0xDFFBCAFFFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEFFEEFF7FFFL,0x400000001F01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_hintClause_in_selectClause73 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFFFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEFFEEFF7FFFL,0x400000001F01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_KW_ALL_in_selectClause79 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001F01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_KW_DISTINCT_in_selectClause85 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001F01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_selectList_in_selectClause89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRANSFORM_in_selectClause123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_selectTrfmClause_in_selectClause125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trfmClause_in_selectClause196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectItem_in_selectList239 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_selectList243 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001F01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_selectItem_in_selectList246 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause285 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001F01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_selectExpressionList_in_selectTrfmClause287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400004000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_recordWriter_in_selectTrfmClause301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_KW_USING_in_selectTrfmClause307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_StringLiteral_in_selectTrfmClause309 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000000000L,0x0400002000000000L});
    public static final BitSet FOLLOW_KW_AS_in_selectTrfmClause317 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000023DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause321 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_aliasList_in_selectTrfmClause324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400002000000000L});
    public static final BitSet FOLLOW_aliasList_in_selectTrfmClause337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400002000000000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400002000000000L});
    public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_recordReader_in_selectTrfmClause357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_hintClause420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STAR_in_hintClause422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PLUS_in_hintClause424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_hintList_in_hintClause426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STAR_in_hintClause428 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DIVIDE_in_hintClause430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hintItem_in_hintList469 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_hintList472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_hintItem_in_hintList474 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_hintName_in_hintItem512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_hintItem515 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_hintArgs_in_hintItem517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_hintItem519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MAPJOIN_in_hintName563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STREAMTABLE_in_hintName575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hintArgName_in_hintArgs610 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_hintArgs613 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_hintArgName_in_hintArgs615 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_identifier_in_hintArgName657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableAllColumns_in_selectItem694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_selectItem716 = new BitSet(new long[]{0xDE9FFFF7F8000002L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_KW_AS_in_selectItem726 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_selectItem729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AS_in_selectItem735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_selectItem737 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_selectItem739 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_selectItem742 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_selectItem744 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_selectItem748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MAP_in_trfmClause803 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001F01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_selectExpressionList_in_trfmClause808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400004000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_KW_REDUCE_in_trfmClause818 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001F01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_selectExpressionList_in_trfmClause820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400004000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_rowFormat_in_trfmClause830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_recordWriter_in_trfmClause834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_KW_USING_in_trfmClause840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_StringLiteral_in_trfmClause842 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000000000L,0x0400002000000000L});
    public static final BitSet FOLLOW_KW_AS_in_trfmClause850 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000023DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_LPAREN_in_trfmClause854 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_aliasList_in_trfmClause857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_trfmClause864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400002000000000L});
    public static final BitSet FOLLOW_aliasList_in_trfmClause870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400002000000000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400002000000000L});
    public static final BitSet FOLLOW_rowFormat_in_trfmClause886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_recordReader_in_trfmClause890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableAllColumns_in_selectExpression959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_selectExpression971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpression_in_selectExpressionList1002 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_selectExpressionList1005 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001F01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_selectExpression_in_selectExpressionList1007 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_WINDOW_in_window_clause1046 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_window_defn_in_window_clause1048 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_window_clause1051 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_window_defn_in_window_clause1053 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_identifier_in_window_defn1089 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_KW_AS_in_window_defn1091 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000023DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_window_specification_in_window_defn1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_window_specification1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_window_specification1135 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000010003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_window_specification1137 = new BitSet(new long[]{0x0200000000000000L,0x0000000400000000L,0x0000000000000000L,0x0800000200080400L,0x0000000000001000L,0x0000000000100000L});
    public static final BitSet FOLLOW_partitioningSpec_in_window_specification1140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000200000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_window_frame_in_window_specification1143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_window_specification1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_window_range_expression_in_window_frame1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_window_value_expression_in_window_frame1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression1200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_window_frame_start_boundary_in_window_range_expression1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression1218 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KW_BETWEEN_in_window_range_expression1220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression1224 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_KW_AND_in_window_range_expression1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression1264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_window_frame_start_boundary_in_window_value_expression1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression1282 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KW_BETWEEN_in_window_value_expression1284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1288 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_KW_AND_in_window_value_expression1290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_start_boundary1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_KW_ROW_in_window_frame_start_boundary1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_window_frame_start_boundary1362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1395 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_boundary1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_KW_ROW_in_window_frame_boundary1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_window_frame_boundary1437 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableAllColumns_in_synpred1_SelectClauseParser689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableAllColumns_in_synpred2_SelectClauseParser954 = new BitSet(new long[]{0x0000000000000002L});

}