// $ANTLR 3.4 FromClauseParser.g 2017-07-25 10:01:46

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
public class HiveParser_FromClauseParser extends Parser {
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


    public HiveParser_FromClauseParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_FromClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
    public String getGrammarFileName() { return "FromClauseParser.g"; }


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


    public static class tableAllColumns_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableAllColumns"
    // FromClauseParser.g:51:1: tableAllColumns : ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) );
    public final HiveParser_FromClauseParser.tableAllColumns_return tableAllColumns() throws RecognitionException {
        HiveParser_FromClauseParser.tableAllColumns_return retval = new HiveParser_FromClauseParser.tableAllColumns_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token STAR1=null;
        Token DOT3=null;
        Token STAR4=null;
        HiveParser_FromClauseParser.tableName_return tableName2 =null;


        ASTNode STAR1_tree=null;
        ASTNode DOT3_tree=null;
        ASTNode STAR4_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        try {
            // FromClauseParser.g:52:5: ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt1=1;
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
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // FromClauseParser.g:52:7: STAR
                    {
                    STAR1=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns57); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(STAR1);


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
                    // 53:9: -> ^( TOK_ALLCOLREF )
                    {
                        // FromClauseParser.g:53:12: ^( TOK_ALLCOLREF )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:54:7: tableName DOT STAR
                    {
                    pushFollow(FOLLOW_tableName_in_tableAllColumns79);
                    tableName2=tableName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableName.add(tableName2.getTree());

                    DOT3=(Token)match(input,DOT,FOLLOW_DOT_in_tableAllColumns81); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT3);


                    STAR4=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns83); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(STAR4);


                    // AST REWRITE
                    // elements: tableName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 55:9: -> ^( TOK_ALLCOLREF tableName )
                    {
                        // FromClauseParser.g:55:12: ^( TOK_ALLCOLREF tableName )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableName.nextTree());

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
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableAllColumns"


    public static class tableOrColumn_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableOrColumn"
    // FromClauseParser.g:59:1: tableOrColumn : identifier -> ^( TOK_TABLE_OR_COL identifier ) ;
    public final HiveParser_FromClauseParser.tableOrColumn_return tableOrColumn() throws RecognitionException {
        HiveParser_FromClauseParser.tableOrColumn_return retval = new HiveParser_FromClauseParser.tableOrColumn_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier5 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("table or column identifier", state); 
        try {
            // FromClauseParser.g:62:5: ( identifier -> ^( TOK_TABLE_OR_COL identifier ) )
            // FromClauseParser.g:63:5: identifier
            {
            pushFollow(FOLLOW_identifier_in_tableOrColumn131);
            identifier5=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier5.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 63:16: -> ^( TOK_TABLE_OR_COL identifier )
            {
                // FromClauseParser.g:63:19: ^( TOK_TABLE_OR_COL identifier )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABLE_OR_COL, "TOK_TABLE_OR_COL")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

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
    // $ANTLR end "tableOrColumn"


    public static class expressionList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
    // FromClauseParser.g:66:1: expressionList : expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) ;
    public final HiveParser_FromClauseParser.expressionList_return expressionList() throws RecognitionException {
        HiveParser_FromClauseParser.expressionList_return retval = new HiveParser_FromClauseParser.expressionList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA7=null;
        HiveParser_IdentifiersParser.expression_return expression6 =null;

        HiveParser_IdentifiersParser.expression_return expression8 =null;


        ASTNode COMMA7_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("expression list", state); 
        try {
            // FromClauseParser.g:69:5: ( expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) )
            // FromClauseParser.g:70:5: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList170);
            expression6=gHiveParser.expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

            // FromClauseParser.g:70:16: ( COMMA expression )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // FromClauseParser.g:70:17: COMMA expression
            	    {
            	    COMMA7=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList173); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA7);


            	    pushFollow(FOLLOW_expression_in_expressionList175);
            	    expression8=gHiveParser.expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression8.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 70:36: -> ^( TOK_EXPLIST ( expression )+ )
            {
                // FromClauseParser.g:70:39: ^( TOK_EXPLIST ( expression )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST")
                , root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

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
    // $ANTLR end "expressionList"


    public static class aliasList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aliasList"
    // FromClauseParser.g:73:1: aliasList : identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) ;
    public final HiveParser_FromClauseParser.aliasList_return aliasList() throws RecognitionException {
        HiveParser_FromClauseParser.aliasList_return retval = new HiveParser_FromClauseParser.aliasList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA10=null;
        HiveParser_IdentifiersParser.identifier_return identifier9 =null;

        HiveParser_IdentifiersParser.identifier_return identifier11 =null;


        ASTNode COMMA10_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("alias list", state); 
        try {
            // FromClauseParser.g:76:5: ( identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) )
            // FromClauseParser.g:77:5: identifier ( COMMA identifier )*
            {
            pushFollow(FOLLOW_identifier_in_aliasList217);
            identifier9=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier9.getTree());

            // FromClauseParser.g:77:16: ( COMMA identifier )*
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // FromClauseParser.g:77:17: COMMA identifier
            	    {
            	    COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_aliasList220); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA10);


            	    pushFollow(FOLLOW_identifier_in_aliasList222);
            	    identifier11=gHiveParser.identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier11.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 77:36: -> ^( TOK_ALIASLIST ( identifier )+ )
            {
                // FromClauseParser.g:77:39: ^( TOK_ALIASLIST ( identifier )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALIASLIST, "TOK_ALIASLIST")
                , root_1);

                if ( !(stream_identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
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
    // $ANTLR end "aliasList"


    public static class fromClause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromClause"
    // FromClauseParser.g:82:1: fromClause : KW_FROM fromSource -> ^( TOK_FROM fromSource ) ;
    public final HiveParser_FromClauseParser.fromClause_return fromClause() throws RecognitionException {
        HiveParser_FromClauseParser.fromClause_return retval = new HiveParser_FromClauseParser.fromClause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_FROM12=null;
        HiveParser_FromClauseParser.fromSource_return fromSource13 =null;


        ASTNode KW_FROM12_tree=null;
        RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
        RewriteRuleSubtreeStream stream_fromSource=new RewriteRuleSubtreeStream(adaptor,"rule fromSource");
         gParent.pushMsg("from clause", state); 
        try {
            // FromClauseParser.g:85:5: ( KW_FROM fromSource -> ^( TOK_FROM fromSource ) )
            // FromClauseParser.g:86:5: KW_FROM fromSource
            {
            KW_FROM12=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_fromClause266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FROM.add(KW_FROM12);


            pushFollow(FOLLOW_fromSource_in_fromClause268);
            fromSource13=fromSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fromSource.add(fromSource13.getTree());

            // AST REWRITE
            // elements: fromSource
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 86:24: -> ^( TOK_FROM fromSource )
            {
                // FromClauseParser.g:86:27: ^( TOK_FROM fromSource )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_FROM, "TOK_FROM")
                , root_1);

                adaptor.addChild(root_1, stream_fromSource.nextTree());

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
    // $ANTLR end "fromClause"


    public static class fromSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromSource"
    // FromClauseParser.g:89:1: fromSource : ( ( virtualTableSource )=> virtualTableSource | uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ | joinSource );
    public final HiveParser_FromClauseParser.fromSource_return fromSource() throws RecognitionException {
        HiveParser_FromClauseParser.fromSource_return retval = new HiveParser_FromClauseParser.fromSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA17=null;
        HiveParser_FromClauseParser.virtualTableSource_return virtualTableSource14 =null;

        HiveParser_FromClauseParser.uniqueJoinToken_return uniqueJoinToken15 =null;

        HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource16 =null;

        HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource18 =null;

        HiveParser_FromClauseParser.joinSource_return joinSource19 =null;


        ASTNode COMMA17_tree=null;

         gParent.pushMsg("join source", state); 
        try {
            // FromClauseParser.g:92:5: ( ( virtualTableSource )=> virtualTableSource | uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ | joinSource )
            int alt5=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                switch ( input.LA(2) ) {
                case KW_VALUES:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        int LA5_17 = input.LA(4);

                        if ( (synpred1_FromClauseParser()) ) {
                            alt5=1;
                        }
                        else if ( (true) ) {
                            alt5=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 17, input);

                            throw nvae;

                        }
                        }
                        break;
                    case COMMA:
                    case DOT:
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
                    case KW_CROSS:
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
                    case KW_JOIN:
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
                    case KW_TABLESAMPLE:
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
                    case RPAREN:
                    case KW_BATCH:
                    case KW_DAYOFWEEK:
                    case KW_HOLD_DDLTIME:
                    case KW_IGNORE:
                    case KW_NO_DROP:
                    case KW_OFFLINE:
                    case KW_PROTECTION:
                    case KW_READONLY:
                        {
                        alt5=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;

                    }

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
                case KW_FROM:
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
                case KW_REDUCE:
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
                case KW_SELECT:
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
                case KW_BATCH:
                case KW_DAYOFWEEK:
                case KW_HOLD_DDLTIME:
                case KW_IGNORE:
                case KW_NO_DROP:
                case KW_OFFLINE:
                case KW_PROTECTION:
                case KW_READONLY:
                    {
                    alt5=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }

                }
                break;
            case KW_UNIQUEJOIN:
                {
                alt5=2;
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
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // FromClauseParser.g:93:5: ( virtualTableSource )=> virtualTableSource
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_virtualTableSource_in_fromSource313);
                    virtualTableSource14=virtualTableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, virtualTableSource14.getTree());

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:95:5: uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_uniqueJoinToken_in_fromSource326);
                    uniqueJoinToken15=uniqueJoinToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(uniqueJoinToken15.getTree(), root_0);

                    pushFollow(FOLLOW_uniqueJoinSource_in_fromSource329);
                    uniqueJoinSource16=uniqueJoinSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource16.getTree());

                    // FromClauseParser.g:95:39: ( COMMA ! uniqueJoinSource )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt4=1;
                            }
                            break;

                        }

                        switch (alt4) {
                    	case 1 :
                    	    // FromClauseParser.g:95:40: COMMA ! uniqueJoinSource
                    	    {
                    	    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_fromSource332); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_uniqueJoinSource_in_fromSource335);
                    	    uniqueJoinSource18=uniqueJoinSource();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource18.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // FromClauseParser.g:97:5: joinSource
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_joinSource_in_fromSource349);
                    joinSource19=joinSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, joinSource19.getTree());

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
    // $ANTLR end "fromSource"


    public static class atomjoinSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomjoinSource"
    // FromClauseParser.g:101:1: atomjoinSource : ( tableSource ( lateralView ^)* | ( subQuerySource )=> subQuerySource ( lateralView ^)* | partitionedTableFunction ( lateralView ^)* | LPAREN ! joinSource RPAREN !);
    public final HiveParser_FromClauseParser.atomjoinSource_return atomjoinSource() throws RecognitionException {
        HiveParser_FromClauseParser.atomjoinSource_return retval = new HiveParser_FromClauseParser.atomjoinSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN26=null;
        Token RPAREN28=null;
        HiveParser_FromClauseParser.tableSource_return tableSource20 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView21 =null;

        HiveParser_FromClauseParser.subQuerySource_return subQuerySource22 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView23 =null;

        HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction24 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView25 =null;

        HiveParser_FromClauseParser.joinSource_return joinSource27 =null;


        ASTNode LPAREN26_tree=null;
        ASTNode RPAREN28_tree=null;

         gParent.pushMsg("joinSource", state); 
        try {
            // FromClauseParser.g:104:5: ( tableSource ( lateralView ^)* | ( subQuerySource )=> subQuerySource ( lateralView ^)* | partitionedTableFunction ( lateralView ^)* | LPAREN ! joinSource RPAREN !)
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // FromClauseParser.g:105:5: tableSource ( lateralView ^)*
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_tableSource_in_atomjoinSource381);
                    tableSource20=tableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource20.getTree());

                    // FromClauseParser.g:105:17: ( lateralView ^)*
                    loop6:
                    do {
                        int alt6=2;
                        switch ( input.LA(1) ) {
                        case KW_LATERAL:
                            {
                            alt6=1;
                            }
                            break;

                        }

                        switch (alt6) {
                    	case 1 :
                    	    // FromClauseParser.g:105:18: lateralView ^
                    	    {
                    	    pushFollow(FOLLOW_lateralView_in_atomjoinSource384);
                    	    lateralView21=lateralView();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView21.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // FromClauseParser.g:107:5: ( subQuerySource )=> subQuerySource ( lateralView ^)*
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_subQuerySource_in_atomjoinSource405);
                    subQuerySource22=subQuerySource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource22.getTree());

                    // FromClauseParser.g:107:40: ( lateralView ^)*
                    loop7:
                    do {
                        int alt7=2;
                        switch ( input.LA(1) ) {
                        case KW_LATERAL:
                            {
                            alt7=1;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // FromClauseParser.g:107:41: lateralView ^
                    	    {
                    	    pushFollow(FOLLOW_lateralView_in_atomjoinSource408);
                    	    lateralView23=lateralView();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView23.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // FromClauseParser.g:109:5: partitionedTableFunction ( lateralView ^)*
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_partitionedTableFunction_in_atomjoinSource423);
                    partitionedTableFunction24=partitionedTableFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction24.getTree());

                    // FromClauseParser.g:109:30: ( lateralView ^)*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case KW_LATERAL:
                            {
                            alt8=1;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // FromClauseParser.g:109:31: lateralView ^
                    	    {
                    	    pushFollow(FOLLOW_lateralView_in_atomjoinSource426);
                    	    lateralView25=lateralView();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView25.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // FromClauseParser.g:111:5: LPAREN ! joinSource RPAREN !
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    LPAREN26=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atomjoinSource441); if (state.failed) return retval;

                    pushFollow(FOLLOW_joinSource_in_atomjoinSource444);
                    joinSource27=joinSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, joinSource27.getTree());

                    RPAREN28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atomjoinSource446); if (state.failed) return retval;

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
    // $ANTLR end "atomjoinSource"


    public static class joinSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinSource"
    // FromClauseParser.g:114:1: joinSource : atomjoinSource ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?)? )* ;
    public final HiveParser_FromClauseParser.joinSource_return joinSource() throws RecognitionException {
        HiveParser_FromClauseParser.joinSource_return retval = new HiveParser_FromClauseParser.joinSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ON32=null;
        HiveParser_FromClauseParser.atomjoinSource_return atomjoinSource29 =null;

        HiveParser_FromClauseParser.joinToken_return joinToken30 =null;

        HiveParser_FromClauseParser.joinSourcePart_return joinSourcePart31 =null;

        HiveParser_IdentifiersParser.expression_return expression33 =null;


        ASTNode KW_ON32_tree=null;

        try {
            // FromClauseParser.g:115:5: ( atomjoinSource ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?)? )* )
            // FromClauseParser.g:116:5: atomjoinSource ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?)? )*
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_atomjoinSource_in_joinSource468);
            atomjoinSource29=atomjoinSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, atomjoinSource29.getTree());

            // FromClauseParser.g:116:20: ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?)? )*
            loop11:
            do {
                int alt11=2;
                switch ( input.LA(1) ) {
                case COMMA:
                case KW_CROSS:
                case KW_FULL:
                case KW_INNER:
                case KW_JOIN:
                case KW_LEFT:
                case KW_RIGHT:
                    {
                    alt11=1;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // FromClauseParser.g:116:21: joinToken ^ joinSourcePart ( KW_ON ! expression {...}?)?
            	    {
            	    pushFollow(FOLLOW_joinToken_in_joinSource471);
            	    joinToken30=joinToken();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(joinToken30.getTree(), root_0);

            	    pushFollow(FOLLOW_joinSourcePart_in_joinSource474);
            	    joinSourcePart31=joinSourcePart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, joinSourcePart31.getTree());

            	    // FromClauseParser.g:116:47: ( KW_ON ! expression {...}?)?
            	    int alt10=2;
            	    switch ( input.LA(1) ) {
            	        case KW_ON:
            	            {
            	            alt10=1;
            	            }
            	            break;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // FromClauseParser.g:116:48: KW_ON ! expression {...}?
            	            {
            	            KW_ON32=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_joinSource477); if (state.failed) return retval;

            	            pushFollow(FOLLOW_expression_in_joinSource480);
            	            expression33=gHiveParser.expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression33.getTree());

            	            if ( !(((joinToken30!=null?((Token)joinToken30.start):null).getType() != COMMA)) ) {
            	                if (state.backtracking>0) {state.failed=true; return retval;}
            	                throw new FailedPredicateException(input, "joinSource", "$joinToken.start.getType() != COMMA");
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "joinSource"


    public static class joinSourcePart_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinSourcePart"
    // FromClauseParser.g:120:1: joinSourcePart : ( tableSource | subQuerySource | partitionedTableFunction ) ( lateralView ^)* ;
    public final HiveParser_FromClauseParser.joinSourcePart_return joinSourcePart() throws RecognitionException {
        HiveParser_FromClauseParser.joinSourcePart_return retval = new HiveParser_FromClauseParser.joinSourcePart_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_FromClauseParser.tableSource_return tableSource34 =null;

        HiveParser_FromClauseParser.subQuerySource_return subQuerySource35 =null;

        HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction36 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView37 =null;



         gParent.pushMsg("joinSourcePart", state); 
        try {
            // FromClauseParser.g:123:5: ( ( tableSource | subQuerySource | partitionedTableFunction ) ( lateralView ^)* )
            // FromClauseParser.g:124:5: ( tableSource | subQuerySource | partitionedTableFunction ) ( lateralView ^)*
            {
            root_0 = (ASTNode)adaptor.nil();


            // FromClauseParser.g:124:5: ( tableSource | subQuerySource | partitionedTableFunction )
            int alt12=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                switch ( input.LA(2) ) {
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case KW_ON:
                        {
                        alt12=3;
                        }
                        break;
                    case StringLiteral:
                        {
                        alt12=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case EOF:
                case COMMA:
                case DOT:
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
                case KW_CROSS:
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
                case KW_EXCEPT:
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
                case KW_HAVING:
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
                case KW_JOIN:
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
                case KW_MINUS:
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
                case KW_ON:
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
                case KW_REDUCE:
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
                case KW_SELECT:
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
                case KW_TABLESAMPLE:
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
                case KW_WHERE:
                case KW_WHILE:
                case KW_WINDOW:
                case KW_WITH:
                case KW_WORK:
                case KW_WRITE:
                case KW_YEAR:
                case RPAREN:
                case KW_BATCH:
                case KW_DAYOFWEEK:
                case KW_HOLD_DDLTIME:
                case KW_IGNORE:
                case KW_NO_DROP:
                case KW_OFFLINE:
                case KW_PROTECTION:
                case KW_READONLY:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }

                }
                break;
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
                alt12=1;
                }
                break;
            case LPAREN:
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
                    // FromClauseParser.g:124:6: tableSource
                    {
                    pushFollow(FOLLOW_tableSource_in_joinSourcePart519);
                    tableSource34=tableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource34.getTree());

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:124:20: subQuerySource
                    {
                    pushFollow(FOLLOW_subQuerySource_in_joinSourcePart523);
                    subQuerySource35=subQuerySource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource35.getTree());

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:124:37: partitionedTableFunction
                    {
                    pushFollow(FOLLOW_partitionedTableFunction_in_joinSourcePart527);
                    partitionedTableFunction36=partitionedTableFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction36.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:124:63: ( lateralView ^)*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case KW_LATERAL:
                    {
                    alt13=1;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // FromClauseParser.g:124:64: lateralView ^
            	    {
            	    pushFollow(FOLLOW_lateralView_in_joinSourcePart531);
            	    lateralView37=lateralView();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView37.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "joinSourcePart"


    public static class uniqueJoinSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uniqueJoinSource"
    // FromClauseParser.g:127:1: uniqueJoinSource : ( KW_PRESERVE )? uniqueJoinTableSource uniqueJoinExpr ;
    public final HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource() throws RecognitionException {
        HiveParser_FromClauseParser.uniqueJoinSource_return retval = new HiveParser_FromClauseParser.uniqueJoinSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_PRESERVE38=null;
        HiveParser_FromClauseParser.uniqueJoinTableSource_return uniqueJoinTableSource39 =null;

        HiveParser_FromClauseParser.uniqueJoinExpr_return uniqueJoinExpr40 =null;


        ASTNode KW_PRESERVE38_tree=null;

         gParent.pushMsg("unique join source", state); 
        try {
            // FromClauseParser.g:130:5: ( ( KW_PRESERVE )? uniqueJoinTableSource uniqueJoinExpr )
            // FromClauseParser.g:130:7: ( KW_PRESERVE )? uniqueJoinTableSource uniqueJoinExpr
            {
            root_0 = (ASTNode)adaptor.nil();


            // FromClauseParser.g:130:7: ( KW_PRESERVE )?
            int alt14=2;
            switch ( input.LA(1) ) {
                case KW_PRESERVE:
                    {
                    alt14=1;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // FromClauseParser.g:130:7: KW_PRESERVE
                    {
                    KW_PRESERVE38=(Token)match(input,KW_PRESERVE,FOLLOW_KW_PRESERVE_in_uniqueJoinSource561); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_PRESERVE38_tree = 
                    (ASTNode)adaptor.create(KW_PRESERVE38)
                    ;
                    adaptor.addChild(root_0, KW_PRESERVE38_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_uniqueJoinTableSource_in_uniqueJoinSource564);
            uniqueJoinTableSource39=uniqueJoinTableSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinTableSource39.getTree());

            pushFollow(FOLLOW_uniqueJoinExpr_in_uniqueJoinSource566);
            uniqueJoinExpr40=uniqueJoinExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinExpr40.getTree());

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
    // $ANTLR end "uniqueJoinSource"


    public static class uniqueJoinExpr_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uniqueJoinExpr"
    // FromClauseParser.g:133:1: uniqueJoinExpr : LPAREN ! expressionList RPAREN !;
    public final HiveParser_FromClauseParser.uniqueJoinExpr_return uniqueJoinExpr() throws RecognitionException {
        HiveParser_FromClauseParser.uniqueJoinExpr_return retval = new HiveParser_FromClauseParser.uniqueJoinExpr_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN41=null;
        Token RPAREN43=null;
        HiveParser_FromClauseParser.expressionList_return expressionList42 =null;


        ASTNode LPAREN41_tree=null;
        ASTNode RPAREN43_tree=null;

         gParent.pushMsg("unique join expression list", state); 
        try {
            // FromClauseParser.g:136:5: ( LPAREN ! expressionList RPAREN !)
            // FromClauseParser.g:136:7: LPAREN ! expressionList RPAREN !
            {
            root_0 = (ASTNode)adaptor.nil();


            LPAREN41=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_uniqueJoinExpr593); if (state.failed) return retval;

            pushFollow(FOLLOW_expressionList_in_uniqueJoinExpr596);
            expressionList42=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList42.getTree());

            RPAREN43=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_uniqueJoinExpr598); if (state.failed) return retval;

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
    // $ANTLR end "uniqueJoinExpr"


    public static class uniqueJoinToken_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uniqueJoinToken"
    // FromClauseParser.g:139:1: uniqueJoinToken : KW_UNIQUEJOIN -> TOK_UNIQUEJOIN ;
    public final HiveParser_FromClauseParser.uniqueJoinToken_return uniqueJoinToken() throws RecognitionException {
        HiveParser_FromClauseParser.uniqueJoinToken_return retval = new HiveParser_FromClauseParser.uniqueJoinToken_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_UNIQUEJOIN44=null;

        ASTNode KW_UNIQUEJOIN44_tree=null;
        RewriteRuleTokenStream stream_KW_UNIQUEJOIN=new RewriteRuleTokenStream(adaptor,"token KW_UNIQUEJOIN");

         gParent.pushMsg("unique join", state); 
        try {
            // FromClauseParser.g:142:5: ( KW_UNIQUEJOIN -> TOK_UNIQUEJOIN )
            // FromClauseParser.g:142:7: KW_UNIQUEJOIN
            {
            KW_UNIQUEJOIN44=(Token)match(input,KW_UNIQUEJOIN,FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken626); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_UNIQUEJOIN.add(KW_UNIQUEJOIN44);


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
            // 142:21: -> TOK_UNIQUEJOIN
            {
                adaptor.addChild(root_0, 
                (ASTNode)adaptor.create(TOK_UNIQUEJOIN, "TOK_UNIQUEJOIN")
                );

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
    // $ANTLR end "uniqueJoinToken"


    public static class joinToken_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinToken"
    // FromClauseParser.g:144:1: joinToken : ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | COMMA -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN );
    public final HiveParser_FromClauseParser.joinToken_return joinToken() throws RecognitionException {
        HiveParser_FromClauseParser.joinToken_return retval = new HiveParser_FromClauseParser.joinToken_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_JOIN45=null;
        Token KW_INNER46=null;
        Token KW_JOIN47=null;
        Token COMMA48=null;
        Token KW_CROSS49=null;
        Token KW_JOIN50=null;
        Token KW_LEFT51=null;
        Token KW_OUTER52=null;
        Token KW_JOIN53=null;
        Token KW_RIGHT54=null;
        Token KW_OUTER55=null;
        Token KW_JOIN56=null;
        Token KW_FULL57=null;
        Token KW_OUTER58=null;
        Token KW_JOIN59=null;
        Token KW_LEFT60=null;
        Token KW_SEMI61=null;
        Token KW_JOIN62=null;

        ASTNode KW_JOIN45_tree=null;
        ASTNode KW_INNER46_tree=null;
        ASTNode KW_JOIN47_tree=null;
        ASTNode COMMA48_tree=null;
        ASTNode KW_CROSS49_tree=null;
        ASTNode KW_JOIN50_tree=null;
        ASTNode KW_LEFT51_tree=null;
        ASTNode KW_OUTER52_tree=null;
        ASTNode KW_JOIN53_tree=null;
        ASTNode KW_RIGHT54_tree=null;
        ASTNode KW_OUTER55_tree=null;
        ASTNode KW_JOIN56_tree=null;
        ASTNode KW_FULL57_tree=null;
        ASTNode KW_OUTER58_tree=null;
        ASTNode KW_JOIN59_tree=null;
        ASTNode KW_LEFT60_tree=null;
        ASTNode KW_SEMI61_tree=null;
        ASTNode KW_JOIN62_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_RIGHT=new RewriteRuleTokenStream(adaptor,"token KW_RIGHT");
        RewriteRuleTokenStream stream_KW_CROSS=new RewriteRuleTokenStream(adaptor,"token KW_CROSS");
        RewriteRuleTokenStream stream_KW_FULL=new RewriteRuleTokenStream(adaptor,"token KW_FULL");
        RewriteRuleTokenStream stream_KW_JOIN=new RewriteRuleTokenStream(adaptor,"token KW_JOIN");
        RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
        RewriteRuleTokenStream stream_KW_SEMI=new RewriteRuleTokenStream(adaptor,"token KW_SEMI");
        RewriteRuleTokenStream stream_KW_LEFT=new RewriteRuleTokenStream(adaptor,"token KW_LEFT");
        RewriteRuleTokenStream stream_KW_INNER=new RewriteRuleTokenStream(adaptor,"token KW_INNER");

         gParent.pushMsg("join type specifier", state); 
        try {
            // FromClauseParser.g:147:5: ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | COMMA -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN )
            int alt18=8;
            switch ( input.LA(1) ) {
            case KW_JOIN:
                {
                alt18=1;
                }
                break;
            case KW_INNER:
                {
                alt18=2;
                }
                break;
            case COMMA:
                {
                alt18=3;
                }
                break;
            case KW_CROSS:
                {
                alt18=4;
                }
                break;
            case KW_LEFT:
                {
                switch ( input.LA(2) ) {
                case KW_SEMI:
                    {
                    alt18=8;
                    }
                    break;
                case KW_JOIN:
                case KW_OUTER:
                    {
                    alt18=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 5, input);

                    throw nvae;

                }

                }
                break;
            case KW_RIGHT:
                {
                alt18=6;
                }
                break;
            case KW_FULL:
                {
                alt18=7;
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
                    // FromClauseParser.g:148:7: KW_JOIN
                    {
                    KW_JOIN45=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN45);


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
                    // 148:36: -> TOK_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_JOIN, "TOK_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:149:7: KW_INNER KW_JOIN
                    {
                    KW_INNER46=(Token)match(input,KW_INNER,FOLLOW_KW_INNER_in_joinToken691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_INNER.add(KW_INNER46);


                    KW_JOIN47=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN47);


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
                    // 149:36: -> TOK_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_JOIN, "TOK_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:150:7: COMMA
                    {
                    COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinToken717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA48);


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
                    // 150:36: -> TOK_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_JOIN, "TOK_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // FromClauseParser.g:151:7: KW_CROSS KW_JOIN
                    {
                    KW_CROSS49=(Token)match(input,KW_CROSS,FOLLOW_KW_CROSS_in_joinToken752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CROSS.add(KW_CROSS49);


                    KW_JOIN50=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN50);


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
                    // 151:36: -> TOK_CROSSJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_CROSSJOIN, "TOK_CROSSJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // FromClauseParser.g:152:7: KW_LEFT ( KW_OUTER )? KW_JOIN
                    {
                    KW_LEFT51=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT51);


                    // FromClauseParser.g:152:16: ( KW_OUTER )?
                    int alt15=2;
                    switch ( input.LA(1) ) {
                        case KW_OUTER:
                            {
                            alt15=1;
                            }
                            break;
                    }

                    switch (alt15) {
                        case 1 :
                            // FromClauseParser.g:152:17: KW_OUTER
                            {
                            KW_OUTER52=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken782); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER52);


                            }
                            break;

                    }


                    KW_JOIN53=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken786); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN53);


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
                    // 152:36: -> TOK_LEFTOUTERJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_LEFTOUTERJOIN, "TOK_LEFTOUTERJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // FromClauseParser.g:153:7: KW_RIGHT ( KW_OUTER )? KW_JOIN
                    {
                    KW_RIGHT54=(Token)match(input,KW_RIGHT,FOLLOW_KW_RIGHT_in_joinToken798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_RIGHT.add(KW_RIGHT54);


                    // FromClauseParser.g:153:16: ( KW_OUTER )?
                    int alt16=2;
                    switch ( input.LA(1) ) {
                        case KW_OUTER:
                            {
                            alt16=1;
                            }
                            break;
                    }

                    switch (alt16) {
                        case 1 :
                            // FromClauseParser.g:153:17: KW_OUTER
                            {
                            KW_OUTER55=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken801); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER55);


                            }
                            break;

                    }


                    KW_JOIN56=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN56);


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
                    // 153:36: -> TOK_RIGHTOUTERJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_RIGHTOUTERJOIN, "TOK_RIGHTOUTERJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // FromClauseParser.g:154:7: KW_FULL ( KW_OUTER )? KW_JOIN
                    {
                    KW_FULL57=(Token)match(input,KW_FULL,FOLLOW_KW_FULL_in_joinToken817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FULL.add(KW_FULL57);


                    // FromClauseParser.g:154:16: ( KW_OUTER )?
                    int alt17=2;
                    switch ( input.LA(1) ) {
                        case KW_OUTER:
                            {
                            alt17=1;
                            }
                            break;
                    }

                    switch (alt17) {
                        case 1 :
                            // FromClauseParser.g:154:17: KW_OUTER
                            {
                            KW_OUTER58=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken821); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER58);


                            }
                            break;

                    }


                    KW_JOIN59=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken825); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN59);


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
                    // 154:36: -> TOK_FULLOUTERJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_FULLOUTERJOIN, "TOK_FULLOUTERJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // FromClauseParser.g:155:7: KW_LEFT KW_SEMI KW_JOIN
                    {
                    KW_LEFT60=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken837); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT60);


                    KW_SEMI61=(Token)match(input,KW_SEMI,FOLLOW_KW_SEMI_in_joinToken839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SEMI.add(KW_SEMI61);


                    KW_JOIN62=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN62);


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
                    // 155:36: -> TOK_LEFTSEMIJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_LEFTSEMIJOIN, "TOK_LEFTSEMIJOIN")
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
    // $ANTLR end "joinToken"


    public static class lateralView_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lateralView"
    // FromClauseParser.g:158:1: lateralView : ( ( KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) );
    public final HiveParser_FromClauseParser.lateralView_return lateralView() throws RecognitionException {
        HiveParser_FromClauseParser.lateralView_return retval = new HiveParser_FromClauseParser.lateralView_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_LATERAL63=null;
        Token KW_VIEW64=null;
        Token KW_OUTER65=null;
        Token KW_AS68=null;
        Token COMMA70=null;
        Token KW_LATERAL72=null;
        Token KW_VIEW73=null;
        Token KW_AS76=null;
        Token COMMA78=null;
        HiveParser_IdentifiersParser.function_return function66 =null;

        HiveParser_FromClauseParser.tableAlias_return tableAlias67 =null;

        HiveParser_IdentifiersParser.identifier_return identifier69 =null;

        HiveParser_IdentifiersParser.identifier_return identifier71 =null;

        HiveParser_IdentifiersParser.function_return function74 =null;

        HiveParser_FromClauseParser.tableAlias_return tableAlias75 =null;

        HiveParser_IdentifiersParser.identifier_return identifier77 =null;

        HiveParser_IdentifiersParser.identifier_return identifier79 =null;


        ASTNode KW_LATERAL63_tree=null;
        ASTNode KW_VIEW64_tree=null;
        ASTNode KW_OUTER65_tree=null;
        ASTNode KW_AS68_tree=null;
        ASTNode COMMA70_tree=null;
        ASTNode KW_LATERAL72_tree=null;
        ASTNode KW_VIEW73_tree=null;
        ASTNode KW_AS76_tree=null;
        ASTNode COMMA78_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_VIEW=new RewriteRuleTokenStream(adaptor,"token KW_VIEW");
        RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_LATERAL=new RewriteRuleTokenStream(adaptor,"token KW_LATERAL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        RewriteRuleSubtreeStream stream_tableAlias=new RewriteRuleSubtreeStream(adaptor,"rule tableAlias");
        gParent.pushMsg("lateral view", state); 
        try {
            // FromClauseParser.g:161:2: ( ( KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) )
            int alt23=2;
            switch ( input.LA(1) ) {
            case KW_LATERAL:
                {
                switch ( input.LA(2) ) {
                case KW_VIEW:
                    {
                    switch ( input.LA(3) ) {
                    case KW_OUTER:
                        {
                        int LA23_3 = input.LA(4);

                        if ( (synpred3_FromClauseParser()) ) {
                            alt23=1;
                        }
                        else if ( (true) ) {
                            alt23=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 3, input);

                            throw nvae;

                        }
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
                    case KW_NOVALIDATE:
                    case KW_NULL:
                    case KW_NULLS:
                    case KW_OF:
                    case KW_OFFSET:
                    case KW_OPTION:
                    case KW_ORDER:
                    case KW_OUT:
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
                        alt23=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // FromClauseParser.g:162:2: ( KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
                    {
                    KW_LATERAL63=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL63);


                    KW_VIEW64=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW64);


                    KW_OUTER65=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_lateralView889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER65);


                    pushFollow(FOLLOW_function_in_lateralView891);
                    function66=gHiveParser.function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function.add(function66.getTree());

                    pushFollow(FOLLOW_tableAlias_in_lateralView893);
                    tableAlias67=tableAlias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias67.getTree());

                    // FromClauseParser.g:162:83: ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
                    int alt20=2;
                    switch ( input.LA(1) ) {
                        case KW_AS:
                            {
                            alt20=1;
                            }
                            break;
                    }

                    switch (alt20) {
                        case 1 :
                            // FromClauseParser.g:162:84: KW_AS identifier ( ( COMMA )=> COMMA identifier )*
                            {
                            KW_AS68=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView896); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS68);


                            pushFollow(FOLLOW_identifier_in_lateralView898);
                            identifier69=gHiveParser.identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier69.getTree());

                            // FromClauseParser.g:162:101: ( ( COMMA )=> COMMA identifier )*
                            loop19:
                            do {
                                int alt19=2;
                                alt19 = dfa19.predict(input);
                                switch (alt19) {
                            	case 1 :
                            	    // FromClauseParser.g:162:102: ( COMMA )=> COMMA identifier
                            	    {
                            	    COMMA70=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView906); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA70);


                            	    pushFollow(FOLLOW_identifier_in_lateralView908);
                            	    identifier71=gHiveParser.identifier();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_identifier.add(identifier71.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: identifier, function, tableAlias
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 163:2: -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
                    {
                        // FromClauseParser.g:163:5: ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_LATERAL_VIEW_OUTER, "TOK_LATERAL_VIEW_OUTER")
                        , root_1);

                        // FromClauseParser.g:163:30: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) )
                        {
                        ASTNode root_2 = (ASTNode)adaptor.nil();
                        root_2 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_2);

                        // FromClauseParser.g:163:43: ^( TOK_SELEXPR function ( identifier )* tableAlias )
                        {
                        ASTNode root_3 = (ASTNode)adaptor.nil();
                        root_3 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_3);

                        adaptor.addChild(root_3, stream_function.nextTree());

                        // FromClauseParser.g:163:66: ( identifier )*
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_3, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_3, stream_tableAlias.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

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
                    // FromClauseParser.g:165:2: KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
                    {
                    KW_LATERAL72=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL72);


                    KW_VIEW73=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW73);


                    pushFollow(FOLLOW_function_in_lateralView944);
                    function74=gHiveParser.function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function.add(function74.getTree());

                    pushFollow(FOLLOW_tableAlias_in_lateralView946);
                    tableAlias75=tableAlias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias75.getTree());

                    // FromClauseParser.g:165:41: ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
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
                            // FromClauseParser.g:165:42: KW_AS identifier ( ( COMMA )=> COMMA identifier )*
                            {
                            KW_AS76=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView949); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS76);


                            pushFollow(FOLLOW_identifier_in_lateralView951);
                            identifier77=gHiveParser.identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier77.getTree());

                            // FromClauseParser.g:165:59: ( ( COMMA )=> COMMA identifier )*
                            loop21:
                            do {
                                int alt21=2;
                                alt21 = dfa21.predict(input);
                                switch (alt21) {
                            	case 1 :
                            	    // FromClauseParser.g:165:60: ( COMMA )=> COMMA identifier
                            	    {
                            	    COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView959); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA78);


                            	    pushFollow(FOLLOW_identifier_in_lateralView961);
                            	    identifier79=gHiveParser.identifier();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_identifier.add(identifier79.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: function, tableAlias, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 166:2: -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
                    {
                        // FromClauseParser.g:166:5: ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_LATERAL_VIEW, "TOK_LATERAL_VIEW")
                        , root_1);

                        // FromClauseParser.g:166:24: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) )
                        {
                        ASTNode root_2 = (ASTNode)adaptor.nil();
                        root_2 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_2);

                        // FromClauseParser.g:166:37: ^( TOK_SELEXPR function ( identifier )* tableAlias )
                        {
                        ASTNode root_3 = (ASTNode)adaptor.nil();
                        root_3 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_3);

                        adaptor.addChild(root_3, stream_function.nextTree());

                        // FromClauseParser.g:166:60: ( identifier )*
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_3, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_3, stream_tableAlias.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

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
            if ( state.backtracking==0 ) {gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lateralView"


    public static class tableAlias_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableAlias"
    // FromClauseParser.g:169:1: tableAlias : identifier -> ^( TOK_TABALIAS identifier ) ;
    public final HiveParser_FromClauseParser.tableAlias_return tableAlias() throws RecognitionException {
        HiveParser_FromClauseParser.tableAlias_return retval = new HiveParser_FromClauseParser.tableAlias_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier80 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        gParent.pushMsg("table alias", state); 
        try {
            // FromClauseParser.g:172:5: ( identifier -> ^( TOK_TABALIAS identifier ) )
            // FromClauseParser.g:173:5: identifier
            {
            pushFollow(FOLLOW_identifier_in_tableAlias1015);
            identifier80=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier80.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 173:16: -> ^( TOK_TABALIAS identifier )
            {
                // FromClauseParser.g:173:19: ^( TOK_TABALIAS identifier )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABALIAS, "TOK_TABALIAS")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

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
            if ( state.backtracking==0 ) {gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableAlias"


    public static class tableBucketSample_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableBucketSample"
    // FromClauseParser.g:176:1: tableBucketSample : KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) ;
    public final HiveParser_FromClauseParser.tableBucketSample_return tableBucketSample() throws RecognitionException {
        HiveParser_FromClauseParser.tableBucketSample_return retval = new HiveParser_FromClauseParser.tableBucketSample_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token numerator=null;
        Token denominator=null;
        Token KW_TABLESAMPLE81=null;
        Token LPAREN82=null;
        Token KW_BUCKET83=null;
        Token KW_OUT84=null;
        Token KW_OF85=null;
        Token KW_ON86=null;
        Token COMMA87=null;
        Token RPAREN88=null;
        List list_expr=null;
        RuleReturnScope expr = null;
        ASTNode numerator_tree=null;
        ASTNode denominator_tree=null;
        ASTNode KW_TABLESAMPLE81_tree=null;
        ASTNode LPAREN82_tree=null;
        ASTNode KW_BUCKET83_tree=null;
        ASTNode KW_OUT84_tree=null;
        ASTNode KW_OF85_tree=null;
        ASTNode KW_ON86_tree=null;
        ASTNode COMMA87_tree=null;
        ASTNode RPAREN88_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
        RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_OUT=new RewriteRuleTokenStream(adaptor,"token KW_OUT");
        RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_BUCKET=new RewriteRuleTokenStream(adaptor,"token KW_BUCKET");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("table bucket sample specification", state); 
        try {
            // FromClauseParser.g:179:5: ( KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) )
            // FromClauseParser.g:180:5: KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN
            {
            KW_TABLESAMPLE81=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_tableBucketSample1054); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE81);


            LPAREN82=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tableBucketSample1056); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN82);


            KW_BUCKET83=(Token)match(input,KW_BUCKET,FOLLOW_KW_BUCKET_in_tableBucketSample1058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BUCKET.add(KW_BUCKET83);


            // FromClauseParser.g:180:37: (numerator= Number )
            // FromClauseParser.g:180:38: numerator= Number
            {
            numerator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample1063); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Number.add(numerator);


            }


            KW_OUT84=(Token)match(input,KW_OUT,FOLLOW_KW_OUT_in_tableBucketSample1066); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OUT.add(KW_OUT84);


            KW_OF85=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_tableBucketSample1068); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF85);


            // FromClauseParser.g:180:69: (denominator= Number )
            // FromClauseParser.g:180:70: denominator= Number
            {
            denominator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample1073); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Number.add(denominator);


            }


            // FromClauseParser.g:180:90: ( KW_ON expr+= expression ( COMMA expr+= expression )* )?
            int alt25=2;
            switch ( input.LA(1) ) {
                case KW_ON:
                    {
                    alt25=1;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // FromClauseParser.g:180:91: KW_ON expr+= expression ( COMMA expr+= expression )*
                    {
                    KW_ON86=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_tableBucketSample1077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON86);


                    pushFollow(FOLLOW_expression_in_tableBucketSample1081);
                    expr=gHiveParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
                    if (list_expr==null) list_expr=new ArrayList();
                    list_expr.add(expr.getTree());


                    // FromClauseParser.g:180:114: ( COMMA expr+= expression )*
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
                    	    // FromClauseParser.g:180:115: COMMA expr+= expression
                    	    {
                    	    COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_tableBucketSample1084); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA87);


                    	    pushFollow(FOLLOW_expression_in_tableBucketSample1088);
                    	    expr=gHiveParser.expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
                    	    if (list_expr==null) list_expr=new ArrayList();
                    	    list_expr.add(expr.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN88=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tableBucketSample1094); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN88);


            // AST REWRITE
            // elements: denominator, numerator, expr
            // token labels: denominator, numerator
            // rule labels: retval
            // token list labels: 
            // rule list labels: expr
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_denominator=new RewriteRuleTokenStream(adaptor,"token denominator",denominator);
            RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
            root_0 = (ASTNode)adaptor.nil();
            // 180:149: -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
            {
                // FromClauseParser.g:180:152: ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABLEBUCKETSAMPLE, "TOK_TABLEBUCKETSAMPLE")
                , root_1);

                adaptor.addChild(root_1, stream_numerator.nextNode());

                adaptor.addChild(root_1, stream_denominator.nextNode());

                // FromClauseParser.g:180:201: ( $expr)*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // $ANTLR end "tableBucketSample"


    public static class splitSample_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "splitSample"
    // FromClauseParser.g:183:1: splitSample : ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) );
    public final HiveParser_FromClauseParser.splitSample_return splitSample() throws RecognitionException {
        HiveParser_FromClauseParser.splitSample_return retval = new HiveParser_FromClauseParser.splitSample_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token numerator=null;
        Token percent=null;
        Token KW_TABLESAMPLE89=null;
        Token LPAREN90=null;
        Token KW_ROWS91=null;
        Token RPAREN92=null;
        Token KW_TABLESAMPLE93=null;
        Token LPAREN94=null;
        Token RPAREN95=null;

        ASTNode numerator_tree=null;
        ASTNode percent_tree=null;
        ASTNode KW_TABLESAMPLE89_tree=null;
        ASTNode LPAREN90_tree=null;
        ASTNode KW_ROWS91_tree=null;
        ASTNode RPAREN92_tree=null;
        ASTNode KW_TABLESAMPLE93_tree=null;
        ASTNode LPAREN94_tree=null;
        ASTNode RPAREN95_tree=null;
        RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_PERCENT=new RewriteRuleTokenStream(adaptor,"token KW_PERCENT");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ByteLengthLiteral=new RewriteRuleTokenStream(adaptor,"token ByteLengthLiteral");

         gParent.pushMsg("table split sample specification", state); 
        try {
            // FromClauseParser.g:186:5: ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) )
            int alt27=2;
            switch ( input.LA(1) ) {
            case KW_TABLESAMPLE:
                {
                switch ( input.LA(2) ) {
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case Number:
                        {
                        alt27=1;
                        }
                        break;
                    case ByteLengthLiteral:
                        {
                        alt27=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // FromClauseParser.g:187:5: KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN
                    {
                    KW_TABLESAMPLE89=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample1141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE89);


                    LPAREN90=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample1143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN90);


                    // FromClauseParser.g:187:28: (numerator= Number )
                    // FromClauseParser.g:187:29: numerator= Number
                    {
                    numerator=(Token)match(input,Number,FOLLOW_Number_in_splitSample1149); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Number.add(numerator);


                    }


                    // FromClauseParser.g:187:47: (percent= KW_PERCENT | KW_ROWS )
                    int alt26=2;
                    switch ( input.LA(1) ) {
                    case KW_PERCENT:
                        {
                        alt26=1;
                        }
                        break;
                    case KW_ROWS:
                        {
                        alt26=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }

                    switch (alt26) {
                        case 1 :
                            // FromClauseParser.g:187:48: percent= KW_PERCENT
                            {
                            percent=(Token)match(input,KW_PERCENT,FOLLOW_KW_PERCENT_in_splitSample1155); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_PERCENT.add(percent);


                            }
                            break;
                        case 2 :
                            // FromClauseParser.g:187:67: KW_ROWS
                            {
                            KW_ROWS91=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_splitSample1157); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS91);


                            }
                            break;

                    }


                    RPAREN92=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample1160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN92);


                    // AST REWRITE
                    // elements: numerator, numerator
                    // token labels: numerator
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 188:5: -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
                    if (percent != null) {
                        // FromClauseParser.g:188:27: ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (ASTNode)adaptor.create(TOK_PERCENT, "TOK_PERCENT")
                        );

                        adaptor.addChild(root_1, stream_numerator.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 189:5: -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
                    {
                        // FromClauseParser.g:189:8: ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (ASTNode)adaptor.create(TOK_ROWCOUNT, "TOK_ROWCOUNT")
                        );

                        adaptor.addChild(root_1, stream_numerator.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:191:5: KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN
                    {
                    KW_TABLESAMPLE93=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample1204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE93);


                    LPAREN94=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample1206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN94);


                    // FromClauseParser.g:191:28: (numerator= ByteLengthLiteral )
                    // FromClauseParser.g:191:29: numerator= ByteLengthLiteral
                    {
                    numerator=(Token)match(input,ByteLengthLiteral,FOLLOW_ByteLengthLiteral_in_splitSample1212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ByteLengthLiteral.add(numerator);


                    }


                    RPAREN95=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample1215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN95);


                    // AST REWRITE
                    // elements: numerator
                    // token labels: numerator
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 192:5: -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
                    {
                        // FromClauseParser.g:192:8: ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (ASTNode)adaptor.create(TOK_LENGTH, "TOK_LENGTH")
                        );

                        adaptor.addChild(root_1, stream_numerator.nextNode());

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
    // $ANTLR end "splitSample"


    public static class tableSample_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableSample"
    // FromClauseParser.g:195:1: tableSample : ( tableBucketSample | splitSample );
    public final HiveParser_FromClauseParser.tableSample_return tableSample() throws RecognitionException {
        HiveParser_FromClauseParser.tableSample_return retval = new HiveParser_FromClauseParser.tableSample_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_FromClauseParser.tableBucketSample_return tableBucketSample96 =null;

        HiveParser_FromClauseParser.splitSample_return splitSample97 =null;



         gParent.pushMsg("table sample specification", state); 
        try {
            // FromClauseParser.g:198:5: ( tableBucketSample | splitSample )
            int alt28=2;
            switch ( input.LA(1) ) {
            case KW_TABLESAMPLE:
                {
                switch ( input.LA(2) ) {
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case KW_BUCKET:
                        {
                        alt28=1;
                        }
                        break;
                    case ByteLengthLiteral:
                    case Number:
                        {
                        alt28=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // FromClauseParser.g:199:5: tableBucketSample
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_tableBucketSample_in_tableSample1261);
                    tableBucketSample96=tableBucketSample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableBucketSample96.getTree());

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:200:5: splitSample
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_splitSample_in_tableSample1269);
                    splitSample97=splitSample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, splitSample97.getTree());

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
    // $ANTLR end "tableSample"


    public static class tableSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableSource"
    // FromClauseParser.g:203:1: tableSource : tabname= tableName (props= tableProperties )? (ts= tableSample )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ) ;
    public final HiveParser_FromClauseParser.tableSource_return tableSource() throws RecognitionException {
        HiveParser_FromClauseParser.tableSource_return retval = new HiveParser_FromClauseParser.tableSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_AS98=null;
        HiveParser_FromClauseParser.tableName_return tabname =null;

        HiveParser.tableProperties_return props =null;

        HiveParser_FromClauseParser.tableSample_return ts =null;

        HiveParser_IdentifiersParser.identifier_return alias =null;


        ASTNode KW_AS98_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_tableSample=new RewriteRuleSubtreeStream(adaptor,"rule tableSample");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
         gParent.pushMsg("table source", state); 
        try {
            // FromClauseParser.g:206:5: (tabname= tableName (props= tableProperties )? (ts= tableSample )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ) )
            // FromClauseParser.g:206:7: tabname= tableName (props= tableProperties )? (ts= tableSample )? ( ( KW_AS )? alias= identifier )?
            {
            pushFollow(FOLLOW_tableName_in_tableSource1298);
            tabname=tableName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableName.add(tabname.getTree());

            // FromClauseParser.g:206:30: (props= tableProperties )?
            int alt29=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt29=1;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // FromClauseParser.g:206:30: props= tableProperties
                    {
                    pushFollow(FOLLOW_tableProperties_in_tableSource1302);
                    props=gHiveParser.tableProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableProperties.add(props.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:206:50: (ts= tableSample )?
            int alt30=2;
            switch ( input.LA(1) ) {
                case KW_TABLESAMPLE:
                    {
                    alt30=1;
                    }
                    break;
            }

            switch (alt30) {
                case 1 :
                    // FromClauseParser.g:206:50: ts= tableSample
                    {
                    pushFollow(FOLLOW_tableSample_in_tableSource1307);
                    ts=tableSample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableSample.add(ts.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:206:64: ( ( KW_AS )? alias= identifier )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // FromClauseParser.g:206:65: ( KW_AS )? alias= identifier
                    {
                    // FromClauseParser.g:206:65: ( KW_AS )?
                    int alt31=2;
                    alt31 = dfa31.predict(input);
                    switch (alt31) {
                        case 1 :
                            // FromClauseParser.g:206:65: KW_AS
                            {
                            KW_AS98=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_tableSource1311); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS98);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_identifier_in_tableSource1316);
                    alias=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(alias.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: alias, props, tabname, ts
            // token labels: 
            // rule labels: tabname, alias, retval, props, ts
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_tabname=new RewriteRuleSubtreeStream(adaptor,"rule tabname",tabname!=null?tabname.tree:null);
            RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias",alias!=null?alias.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_props=new RewriteRuleSubtreeStream(adaptor,"rule props",props!=null?props.tree:null);
            RewriteRuleSubtreeStream stream_ts=new RewriteRuleSubtreeStream(adaptor,"rule ts",ts!=null?ts.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 207:5: -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? )
            {
                // FromClauseParser.g:207:8: ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABREF, "TOK_TABREF")
                , root_1);

                adaptor.addChild(root_1, stream_tabname.nextTree());

                // FromClauseParser.g:207:31: ( $props)?
                if ( stream_props.hasNext() ) {
                    adaptor.addChild(root_1, stream_props.nextTree());

                }
                stream_props.reset();

                // FromClauseParser.g:207:39: ( $ts)?
                if ( stream_ts.hasNext() ) {
                    adaptor.addChild(root_1, stream_ts.nextTree());

                }
                stream_ts.reset();

                // FromClauseParser.g:207:44: ( $alias)?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextTree());

                }
                stream_alias.reset();

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
    // $ANTLR end "tableSource"


    public static class uniqueJoinTableSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uniqueJoinTableSource"
    // FromClauseParser.g:210:1: uniqueJoinTableSource : tabname= tableName (ts= tableSample )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? ) ;
    public final HiveParser_FromClauseParser.uniqueJoinTableSource_return uniqueJoinTableSource() throws RecognitionException {
        HiveParser_FromClauseParser.uniqueJoinTableSource_return retval = new HiveParser_FromClauseParser.uniqueJoinTableSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_AS99=null;
        HiveParser_FromClauseParser.tableName_return tabname =null;

        HiveParser_FromClauseParser.tableSample_return ts =null;

        HiveParser_IdentifiersParser.identifier_return alias =null;


        ASTNode KW_AS99_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_tableSample=new RewriteRuleSubtreeStream(adaptor,"rule tableSample");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
         gParent.pushMsg("unique join table source", state); 
        try {
            // FromClauseParser.g:213:5: (tabname= tableName (ts= tableSample )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? ) )
            // FromClauseParser.g:213:7: tabname= tableName (ts= tableSample )? ( ( KW_AS )? alias= identifier )?
            {
            pushFollow(FOLLOW_tableName_in_uniqueJoinTableSource1372);
            tabname=tableName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableName.add(tabname.getTree());

            // FromClauseParser.g:213:27: (ts= tableSample )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case KW_TABLESAMPLE:
                    {
                    alt33=1;
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // FromClauseParser.g:213:27: ts= tableSample
                    {
                    pushFollow(FOLLOW_tableSample_in_uniqueJoinTableSource1376);
                    ts=tableSample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableSample.add(ts.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:213:41: ( ( KW_AS )? alias= identifier )?
            int alt35=2;
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
                    alt35=1;
                    }
                    break;
            }

            switch (alt35) {
                case 1 :
                    // FromClauseParser.g:213:42: ( KW_AS )? alias= identifier
                    {
                    // FromClauseParser.g:213:42: ( KW_AS )?
                    int alt34=2;
                    switch ( input.LA(1) ) {
                        case KW_AS:
                            {
                            switch ( input.LA(2) ) {
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
                                    alt34=1;
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    switch (alt34) {
                        case 1 :
                            // FromClauseParser.g:213:42: KW_AS
                            {
                            KW_AS99=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_uniqueJoinTableSource1380); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS99);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_identifier_in_uniqueJoinTableSource1385);
                    alias=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(alias.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ts, tabname, alias
            // token labels: 
            // rule labels: tabname, alias, retval, ts
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_tabname=new RewriteRuleSubtreeStream(adaptor,"rule tabname",tabname!=null?tabname.tree:null);
            RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias",alias!=null?alias.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ts=new RewriteRuleSubtreeStream(adaptor,"rule ts",ts!=null?ts.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 214:5: -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? )
            {
                // FromClauseParser.g:214:8: ^( TOK_TABREF $tabname ( $ts)? ( $alias)? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABREF, "TOK_TABREF")
                , root_1);

                adaptor.addChild(root_1, stream_tabname.nextTree());

                // FromClauseParser.g:214:31: ( $ts)?
                if ( stream_ts.hasNext() ) {
                    adaptor.addChild(root_1, stream_ts.nextTree());

                }
                stream_ts.reset();

                // FromClauseParser.g:214:36: ( $alias)?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextTree());

                }
                stream_alias.reset();

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
    // $ANTLR end "uniqueJoinTableSource"


    public static class tableName_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableName"
    // FromClauseParser.g:217:1: tableName : (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) );
    public final HiveParser_FromClauseParser.tableName_return tableName() throws RecognitionException {
        HiveParser_FromClauseParser.tableName_return retval = new HiveParser_FromClauseParser.tableName_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token DOT100=null;
        HiveParser_IdentifiersParser.identifier_return db =null;

        HiveParser_IdentifiersParser.identifier_return tab =null;


        ASTNode DOT100_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("table name", state); 
        try {
            // FromClauseParser.g:220:5: (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // FromClauseParser.g:221:5: db= identifier DOT tab= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_tableName1441);
                    db=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(db.getTree());

                    DOT100=(Token)match(input,DOT,FOLLOW_DOT_in_tableName1443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT100);


                    pushFollow(FOLLOW_identifier_in_tableName1447);
                    tab=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());

                    // AST REWRITE
                    // elements: tab, db
                    // token labels: 
                    // rule labels: tab, db, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.tree:null);
                    RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 222:5: -> ^( TOK_TABNAME $db $tab)
                    {
                        // FromClauseParser.g:222:8: ^( TOK_TABNAME $db $tab)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_TABNAME, "TOK_TABNAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_db.nextTree());

                        adaptor.addChild(root_1, stream_tab.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:224:5: tab= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_tableName1477);
                    tab=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());

                    // AST REWRITE
                    // elements: tab
                    // token labels: 
                    // rule labels: tab, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 225:5: -> ^( TOK_TABNAME $tab)
                    {
                        // FromClauseParser.g:225:8: ^( TOK_TABNAME $tab)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_TABNAME, "TOK_TABNAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_tab.nextTree());

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
    // $ANTLR end "tableName"


    public static class viewName_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "viewName"
    // FromClauseParser.g:228:1: viewName : (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) ;
    public final HiveParser_FromClauseParser.viewName_return viewName() throws RecognitionException {
        HiveParser_FromClauseParser.viewName_return retval = new HiveParser_FromClauseParser.viewName_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token DOT101=null;
        HiveParser_IdentifiersParser.identifier_return db =null;

        HiveParser_IdentifiersParser.identifier_return view =null;


        ASTNode DOT101_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("view name", state); 
        try {
            // FromClauseParser.g:231:5: ( (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) )
            // FromClauseParser.g:232:5: (db= identifier DOT )? view= identifier
            {
            // FromClauseParser.g:232:5: (db= identifier DOT )?
            int alt37=2;
            switch ( input.LA(1) ) {
                case Identifier:
                    {
                    switch ( input.LA(2) ) {
                        case DOT:
                            {
                            alt37=1;
                            }
                            break;
                    }

                    }
                    break;
                case KW_ABORT:
                case KW_ADD:
                case KW_ADMIN:
                case KW_AFTER:
                case KW_ANALYZE:
                case KW_ARCHIVE:
                case KW_ASC:
                case KW_AUTOCOMMIT:
                case KW_BEFORE:
                case KW_BUCKET:
                case KW_BUCKETS:
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
                case KW_CONTINUE:
                case KW_DATA:
                case KW_DATABASES:
                case KW_DATETIME:
                case KW_DAY:
                case KW_DBPROPERTIES:
                case KW_DEFERRED:
                case KW_DEFINED:
                case KW_DELIMITED:
                case KW_DEPENDENCY:
                case KW_DESC:
                case KW_DIRECTORIES:
                case KW_DIRECTORY:
                case KW_DISABLE:
                case KW_DISTRIBUTE:
                case KW_DOW:
                case KW_DUMP:
                case KW_ELEM_TYPE:
                case KW_ENABLE:
                case KW_ESCAPED:
                case KW_EXCLUSIVE:
                case KW_EXPLAIN:
                case KW_EXPORT:
                case KW_FIELDS:
                case KW_FILE:
                case KW_FILEFORMAT:
                case KW_FIRST:
                case KW_FORMAT:
                case KW_FORMATTED:
                case KW_FUNCTIONS:
                case KW_HOUR:
                case KW_IDXPROPERTIES:
                case KW_INDEX:
                case KW_INDEXES:
                case KW_INPATH:
                case KW_INPUTDRIVER:
                case KW_INPUTFORMAT:
                case KW_ISOLATION:
                case KW_ITEMS:
                case KW_JAR:
                case KW_KEY:
                case KW_KEYS:
                case KW_KEY_TYPE:
                case KW_LAST:
                case KW_LEVEL:
                case KW_LIMIT:
                case KW_LINES:
                case KW_LOAD:
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
                case KW_NORELY:
                case KW_NOSCAN:
                case KW_NOVALIDATE:
                case KW_NULLS:
                case KW_OFFSET:
                case KW_OPTION:
                case KW_OUTPUTDRIVER:
                case KW_OUTPUTFORMAT:
                case KW_OVERWRITE:
                case KW_OWNER:
                case KW_PARTITIONED:
                case KW_PARTITIONS:
                case KW_PLUS:
                case KW_PRETTY:
                case KW_PRINCIPALS:
                case KW_PURGE:
                case KW_QUARTER:
                case KW_READ:
                case KW_REBUILD:
                case KW_RECORDREADER:
                case KW_RECORDWRITER:
                case KW_RELOAD:
                case KW_RELY:
                case KW_RENAME:
                case KW_REPAIR:
                case KW_REPL:
                case KW_REPLACE:
                case KW_REPLICATION:
                case KW_RESTRICT:
                case KW_REWRITE:
                case KW_ROLE:
                case KW_ROLES:
                case KW_SCHEMA:
                case KW_SCHEMAS:
                case KW_SECOND:
                case KW_SEMI:
                case KW_SERDE:
                case KW_SERDEPROPERTIES:
                case KW_SERVER:
                case KW_SETS:
                case KW_SHARED:
                case KW_SHOW:
                case KW_SHOW_DATABASE:
                case KW_SKEWED:
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
                case KW_TABLES:
                case KW_TBLPROPERTIES:
                case KW_TEMPORARY:
                case KW_TERMINATED:
                case KW_TINYINT:
                case KW_TOUCH:
                case KW_TRANSACTION:
                case KW_TRANSACTIONS:
                case KW_UNARCHIVE:
                case KW_UNDO:
                case KW_UNIONTYPE:
                case KW_UNLOCK:
                case KW_UNSET:
                case KW_UNSIGNED:
                case KW_URI:
                case KW_USE:
                case KW_UTC:
                case KW_UTCTIMESTAMP:
                case KW_VALIDATE:
                case KW_VALUE_TYPE:
                case KW_VIEW:
                case KW_VIEWS:
                case KW_WEEK:
                case KW_WHILE:
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
                    switch ( input.LA(2) ) {
                        case DOT:
                            {
                            alt37=1;
                            }
                            break;
                    }

                    }
                    break;
                case KW_ALL:
                case KW_ALTER:
                case KW_ARRAY:
                case KW_AS:
                case KW_AUTHORIZATION:
                case KW_BETWEEN:
                case KW_BIGINT:
                case KW_BINARY:
                case KW_BOOLEAN:
                case KW_BOTH:
                case KW_BY:
                case KW_CONSTRAINT:
                case KW_CREATE:
                case KW_CUBE:
                case KW_CURRENT_DATE:
                case KW_CURRENT_TIMESTAMP:
                case KW_CURSOR:
                case KW_DATE:
                case KW_DECIMAL:
                case KW_DELETE:
                case KW_DESCRIBE:
                case KW_DOUBLE:
                case KW_DROP:
                case KW_EXISTS:
                case KW_EXTERNAL:
                case KW_FALSE:
                case KW_FETCH:
                case KW_FLOAT:
                case KW_FOR:
                case KW_FOREIGN:
                case KW_FULL:
                case KW_GRANT:
                case KW_GROUP:
                case KW_GROUPING:
                case KW_IMPORT:
                case KW_IN:
                case KW_INNER:
                case KW_INSERT:
                case KW_INT:
                case KW_INTERSECT:
                case KW_INTO:
                case KW_IS:
                case KW_LATERAL:
                case KW_LEFT:
                case KW_LIKE:
                case KW_LOCAL:
                case KW_NONE:
                case KW_NULL:
                case KW_OF:
                case KW_ORDER:
                case KW_OUT:
                case KW_OUTER:
                case KW_PARTITION:
                case KW_PERCENT:
                case KW_PRIMARY:
                case KW_PROCEDURE:
                case KW_RANGE:
                case KW_READS:
                case KW_REFERENCES:
                case KW_REGEXP:
                case KW_REVOKE:
                case KW_RIGHT:
                case KW_RLIKE:
                case KW_ROLLUP:
                case KW_ROW:
                case KW_ROWS:
                case KW_SET:
                case KW_SMALLINT:
                case KW_TABLE:
                case KW_TIMESTAMP:
                case KW_TO:
                case KW_TRIGGER:
                case KW_TRUE:
                case KW_TRUNCATE:
                case KW_UNION:
                case KW_UPDATE:
                case KW_USER:
                case KW_USING:
                case KW_VALUES:
                case KW_WITH:
                    {
                    switch ( input.LA(2) ) {
                        case DOT:
                            {
                            alt37=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt37) {
                case 1 :
                    // FromClauseParser.g:232:6: db= identifier DOT
                    {
                    pushFollow(FOLLOW_identifier_in_viewName1524);
                    db=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(db.getTree());

                    DOT101=(Token)match(input,DOT,FOLLOW_DOT_in_viewName1526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT101);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_viewName1532);
            view=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(view.getTree());

            // AST REWRITE
            // elements: view, db
            // token labels: 
            // rule labels: view, db, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_view=new RewriteRuleSubtreeStream(adaptor,"rule view",view!=null?view.tree:null);
            RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 233:5: -> ^( TOK_TABNAME ( $db)? $view)
            {
                // FromClauseParser.g:233:8: ^( TOK_TABNAME ( $db)? $view)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABNAME, "TOK_TABNAME")
                , root_1);

                // FromClauseParser.g:233:23: ( $db)?
                if ( stream_db.hasNext() ) {
                    adaptor.addChild(root_1, stream_db.nextTree());

                }
                stream_db.reset();

                adaptor.addChild(root_1, stream_view.nextTree());

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
    // $ANTLR end "viewName"


    public static class subQuerySource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subQuerySource"
    // FromClauseParser.g:236:1: subQuerySource : LPAREN queryStatementExpression RPAREN ( KW_AS )? identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) ;
    public final HiveParser_FromClauseParser.subQuerySource_return subQuerySource() throws RecognitionException {
        HiveParser_FromClauseParser.subQuerySource_return retval = new HiveParser_FromClauseParser.subQuerySource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN102=null;
        Token RPAREN104=null;
        Token KW_AS105=null;
        HiveParser.queryStatementExpression_return queryStatementExpression103 =null;

        HiveParser_IdentifiersParser.identifier_return identifier106 =null;


        ASTNode LPAREN102_tree=null;
        ASTNode RPAREN104_tree=null;
        ASTNode KW_AS105_tree=null;
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_queryStatementExpression=new RewriteRuleSubtreeStream(adaptor,"rule queryStatementExpression");
         gParent.pushMsg("subquery source", state); 
        try {
            // FromClauseParser.g:239:5: ( LPAREN queryStatementExpression RPAREN ( KW_AS )? identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) )
            // FromClauseParser.g:240:5: LPAREN queryStatementExpression RPAREN ( KW_AS )? identifier
            {
            LPAREN102=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subQuerySource1580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN102);


            pushFollow(FOLLOW_queryStatementExpression_in_subQuerySource1582);
            queryStatementExpression103=gHiveParser.queryStatementExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_queryStatementExpression.add(queryStatementExpression103.getTree());

            RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subQuerySource1584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN104);


            // FromClauseParser.g:240:44: ( KW_AS )?
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // FromClauseParser.g:240:44: KW_AS
                    {
                    KW_AS105=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_subQuerySource1586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS105);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_subQuerySource1589);
            identifier106=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier106.getTree());

            // AST REWRITE
            // elements: identifier, queryStatementExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 240:62: -> ^( TOK_SUBQUERY queryStatementExpression identifier )
            {
                // FromClauseParser.g:240:65: ^( TOK_SUBQUERY queryStatementExpression identifier )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SUBQUERY, "TOK_SUBQUERY")
                , root_1);

                adaptor.addChild(root_1, stream_queryStatementExpression.nextTree());

                adaptor.addChild(root_1, stream_identifier.nextTree());

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
    // $ANTLR end "subQuerySource"


    public static class partitioningSpec_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitioningSpec"
    // FromClauseParser.g:244:1: partitioningSpec : ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) );
    public final HiveParser_FromClauseParser.partitioningSpec_return partitioningSpec() throws RecognitionException {
        HiveParser_FromClauseParser.partitioningSpec_return retval = new HiveParser_FromClauseParser.partitioningSpec_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.partitionByClause_return partitionByClause107 =null;

        HiveParser_IdentifiersParser.orderByClause_return orderByClause108 =null;

        HiveParser_IdentifiersParser.orderByClause_return orderByClause109 =null;

        HiveParser_IdentifiersParser.distributeByClause_return distributeByClause110 =null;

        HiveParser_IdentifiersParser.sortByClause_return sortByClause111 =null;

        HiveParser_IdentifiersParser.sortByClause_return sortByClause112 =null;

        HiveParser_IdentifiersParser.clusterByClause_return clusterByClause113 =null;


        RewriteRuleSubtreeStream stream_clusterByClause=new RewriteRuleSubtreeStream(adaptor,"rule clusterByClause");
        RewriteRuleSubtreeStream stream_sortByClause=new RewriteRuleSubtreeStream(adaptor,"rule sortByClause");
        RewriteRuleSubtreeStream stream_partitionByClause=new RewriteRuleSubtreeStream(adaptor,"rule partitionByClause");
        RewriteRuleSubtreeStream stream_distributeByClause=new RewriteRuleSubtreeStream(adaptor,"rule distributeByClause");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
         gParent.pushMsg("partitioningSpec clause", state); 
        try {
            // FromClauseParser.g:247:4: ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) )
            int alt41=5;
            switch ( input.LA(1) ) {
            case KW_PARTITION:
                {
                alt41=1;
                }
                break;
            case KW_ORDER:
                {
                alt41=2;
                }
                break;
            case KW_DISTRIBUTE:
                {
                alt41=3;
                }
                break;
            case KW_SORT:
                {
                alt41=4;
                }
                break;
            case KW_CLUSTER:
                {
                alt41=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // FromClauseParser.g:248:4: partitionByClause ( orderByClause )?
                    {
                    pushFollow(FOLLOW_partitionByClause_in_partitioningSpec1630);
                    partitionByClause107=gHiveParser.partitionByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partitionByClause.add(partitionByClause107.getTree());

                    // FromClauseParser.g:248:22: ( orderByClause )?
                    int alt39=2;
                    switch ( input.LA(1) ) {
                        case KW_ORDER:
                            {
                            alt39=1;
                            }
                            break;
                    }

                    switch (alt39) {
                        case 1 :
                            // FromClauseParser.g:248:22: orderByClause
                            {
                            pushFollow(FOLLOW_orderByClause_in_partitioningSpec1632);
                            orderByClause108=gHiveParser.orderByClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause108.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: partitionByClause, orderByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 248:37: -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
                    {
                        // FromClauseParser.g:248:40: ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_partitionByClause.nextTree());

                        // FromClauseParser.g:248:81: ( orderByClause )?
                        if ( stream_orderByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_orderByClause.nextTree());

                        }
                        stream_orderByClause.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:249:4: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_partitioningSpec1651);
                    orderByClause109=gHiveParser.orderByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause109.getTree());

                    // AST REWRITE
                    // elements: orderByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 249:18: -> ^( TOK_PARTITIONINGSPEC orderByClause )
                    {
                        // FromClauseParser.g:249:21: ^( TOK_PARTITIONINGSPEC orderByClause )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_orderByClause.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:250:4: distributeByClause ( sortByClause )?
                    {
                    pushFollow(FOLLOW_distributeByClause_in_partitioningSpec1666);
                    distributeByClause110=gHiveParser.distributeByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_distributeByClause.add(distributeByClause110.getTree());

                    // FromClauseParser.g:250:23: ( sortByClause )?
                    int alt40=2;
                    switch ( input.LA(1) ) {
                        case KW_SORT:
                            {
                            alt40=1;
                            }
                            break;
                    }

                    switch (alt40) {
                        case 1 :
                            // FromClauseParser.g:250:23: sortByClause
                            {
                            pushFollow(FOLLOW_sortByClause_in_partitioningSpec1668);
                            sortByClause111=gHiveParser.sortByClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause111.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: sortByClause, distributeByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 250:37: -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
                    {
                        // FromClauseParser.g:250:40: ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_distributeByClause.nextTree());

                        // FromClauseParser.g:250:82: ( sortByClause )?
                        if ( stream_sortByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_sortByClause.nextTree());

                        }
                        stream_sortByClause.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // FromClauseParser.g:251:4: sortByClause
                    {
                    pushFollow(FOLLOW_sortByClause_in_partitioningSpec1687);
                    sortByClause112=gHiveParser.sortByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause112.getTree());

                    // AST REWRITE
                    // elements: sortByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 251:17: -> ^( TOK_PARTITIONINGSPEC sortByClause )
                    {
                        // FromClauseParser.g:251:20: ^( TOK_PARTITIONINGSPEC sortByClause )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_sortByClause.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // FromClauseParser.g:252:4: clusterByClause
                    {
                    pushFollow(FOLLOW_clusterByClause_in_partitioningSpec1702);
                    clusterByClause113=gHiveParser.clusterByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_clusterByClause.add(clusterByClause113.getTree());

                    // AST REWRITE
                    // elements: clusterByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 252:20: -> ^( TOK_PARTITIONINGSPEC clusterByClause )
                    {
                        // FromClauseParser.g:252:23: ^( TOK_PARTITIONINGSPEC clusterByClause )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_clusterByClause.nextTree());

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
    // $ANTLR end "partitioningSpec"


    public static class partitionTableFunctionSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionTableFunctionSource"
    // FromClauseParser.g:255:1: partitionTableFunctionSource : ( subQuerySource | tableSource | partitionedTableFunction );
    public final HiveParser_FromClauseParser.partitionTableFunctionSource_return partitionTableFunctionSource() throws RecognitionException {
        HiveParser_FromClauseParser.partitionTableFunctionSource_return retval = new HiveParser_FromClauseParser.partitionTableFunctionSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_FromClauseParser.subQuerySource_return subQuerySource114 =null;

        HiveParser_FromClauseParser.tableSource_return tableSource115 =null;

        HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction116 =null;



         gParent.pushMsg("partitionTableFunctionSource clause", state); 
        try {
            // FromClauseParser.g:258:4: ( subQuerySource | tableSource | partitionedTableFunction )
            int alt42=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt42=1;
                }
                break;
            case Identifier:
                {
                switch ( input.LA(2) ) {
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case KW_ON:
                        {
                        alt42=3;
                        }
                        break;
                    case StringLiteral:
                        {
                        alt42=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case EOF:
                case DOT:
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
                case KW_TABLESAMPLE:
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
                case RPAREN:
                case KW_BATCH:
                case KW_DAYOFWEEK:
                case KW_HOLD_DDLTIME:
                case KW_IGNORE:
                case KW_NO_DROP:
                case KW_OFFLINE:
                case KW_PROTECTION:
                case KW_READONLY:
                    {
                    alt42=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;

                }

                }
                break;
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
                alt42=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // FromClauseParser.g:259:4: subQuerySource
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_subQuerySource_in_partitionTableFunctionSource1739);
                    subQuerySource114=subQuerySource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource114.getTree());

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:260:4: tableSource
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_tableSource_in_partitionTableFunctionSource1746);
                    tableSource115=tableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource115.getTree());

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:261:4: partitionedTableFunction
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource1753);
                    partitionedTableFunction116=partitionedTableFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction116.getTree());

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
    // $ANTLR end "partitionTableFunctionSource"


    public static class partitionedTableFunction_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionedTableFunction"
    // FromClauseParser.g:264:1: partitionedTableFunction : name= Identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= Identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* ) ;
    public final HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction() throws RecognitionException {
        HiveParser_FromClauseParser.partitionedTableFunction_return retval = new HiveParser_FromClauseParser.partitionedTableFunction_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token name=null;
        Token alias=null;
        Token LPAREN117=null;
        Token KW_ON118=null;
        Token Identifier119=null;
        Token LPAREN120=null;
        Token RPAREN122=null;
        Token COMMA123=null;
        Token Identifier124=null;
        Token LPAREN125=null;
        Token RPAREN127=null;
        Token RPAREN128=null;
        HiveParser_FromClauseParser.partitionTableFunctionSource_return ptfsrc =null;

        HiveParser_FromClauseParser.partitioningSpec_return spec =null;

        HiveParser_IdentifiersParser.expression_return expression121 =null;

        HiveParser_IdentifiersParser.expression_return expression126 =null;


        ASTNode name_tree=null;
        ASTNode alias_tree=null;
        ASTNode LPAREN117_tree=null;
        ASTNode KW_ON118_tree=null;
        ASTNode Identifier119_tree=null;
        ASTNode LPAREN120_tree=null;
        ASTNode RPAREN122_tree=null;
        ASTNode COMMA123_tree=null;
        ASTNode Identifier124_tree=null;
        ASTNode LPAREN125_tree=null;
        ASTNode RPAREN127_tree=null;
        ASTNode RPAREN128_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_partitionTableFunctionSource=new RewriteRuleSubtreeStream(adaptor,"rule partitionTableFunctionSource");
        RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");
         gParent.pushMsg("ptf clause", state); 
        try {
            // FromClauseParser.g:267:4: (name= Identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= Identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* ) )
            // FromClauseParser.g:268:4: name= Identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= Identifier )?
            {
            name=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1784); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(name);


            LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1786); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN117);


            KW_ON118=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_partitionedTableFunction1788); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON118);


            // FromClauseParser.g:269:4: ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) )
            // FromClauseParser.g:269:5: ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? )
            {
            // FromClauseParser.g:269:39: (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? )
            // FromClauseParser.g:269:40: ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )?
            {
            pushFollow(FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction1804);
            ptfsrc=partitionTableFunctionSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_partitionTableFunctionSource.add(ptfsrc.getTree());

            // FromClauseParser.g:269:80: (spec= partitioningSpec )?
            int alt43=2;
            switch ( input.LA(1) ) {
                case KW_CLUSTER:
                case KW_DISTRIBUTE:
                case KW_ORDER:
                case KW_PARTITION:
                case KW_SORT:
                    {
                    alt43=1;
                    }
                    break;
            }

            switch (alt43) {
                case 1 :
                    // FromClauseParser.g:269:80: spec= partitioningSpec
                    {
                    pushFollow(FOLLOW_partitioningSpec_in_partitionedTableFunction1808);
                    spec=partitioningSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partitioningSpec.add(spec.getTree());

                    }
                    break;

            }


            }


            }


            // FromClauseParser.g:270:4: ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Identifier) && (synpred7_FromClauseParser())) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // FromClauseParser.g:270:5: ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )*
                    {
                    Identifier119=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1830); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier119);


                    LPAREN120=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN120);


                    pushFollow(FOLLOW_expression_in_partitionedTableFunction1834);
                    expression121=gHiveParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression121.getTree());

                    RPAREN122=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN122);


                    // FromClauseParser.g:270:83: ( COMMA Identifier LPAREN expression RPAREN )*
                    loop44:
                    do {
                        int alt44=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt44=1;
                            }
                            break;

                        }

                        switch (alt44) {
                    	case 1 :
                    	    // FromClauseParser.g:270:85: COMMA Identifier LPAREN expression RPAREN
                    	    {
                    	    COMMA123=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionedTableFunction1840); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA123);


                    	    Identifier124=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1842); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Identifier.add(Identifier124);


                    	    LPAREN125=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1844); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN125);


                    	    pushFollow(FOLLOW_expression_in_partitionedTableFunction1846);
                    	    expression126=gHiveParser.expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression126.getTree());

                    	    RPAREN127=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1848); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN127);


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }


            // FromClauseParser.g:271:4: ( ( RPAREN )=> ( RPAREN ) )
            // FromClauseParser.g:271:5: ( RPAREN )=> ( RPAREN )
            {
            // FromClauseParser.g:271:17: ( RPAREN )
            // FromClauseParser.g:271:18: RPAREN
            {
            RPAREN128=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1865); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN128);


            }


            }


            // FromClauseParser.g:271:27: ( ( Identifier )=>alias= Identifier )?
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // FromClauseParser.g:271:28: ( Identifier )=>alias= Identifier
                    {
                    alias=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(alias);


                    }
                    break;

            }


            // AST REWRITE
            // elements: name, spec, ptfsrc, alias, expression
            // token labels: name, alias
            // rule labels: ptfsrc, spec, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_alias=new RewriteRuleTokenStream(adaptor,"token alias",alias);
            RewriteRuleSubtreeStream stream_ptfsrc=new RewriteRuleSubtreeStream(adaptor,"rule ptfsrc",ptfsrc!=null?ptfsrc.tree:null);
            RewriteRuleSubtreeStream stream_spec=new RewriteRuleSubtreeStream(adaptor,"rule spec",spec!=null?spec.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 272:4: -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* )
            {
                // FromClauseParser.g:272:9: ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_PTBLFUNCTION, "TOK_PTBLFUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextNode());

                // FromClauseParser.g:272:35: ( $alias)?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextNode());

                }
                stream_alias.reset();

                adaptor.addChild(root_1, stream_ptfsrc.nextTree());

                // FromClauseParser.g:272:51: ( $spec)?
                if ( stream_spec.hasNext() ) {
                    adaptor.addChild(root_1, stream_spec.nextTree());

                }
                stream_spec.reset();

                // FromClauseParser.g:272:57: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

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
    // $ANTLR end "partitionedTableFunction"


    public static class whereClause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereClause"
    // FromClauseParser.g:277:1: whereClause : KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) ;
    public final HiveParser_FromClauseParser.whereClause_return whereClause() throws RecognitionException {
        HiveParser_FromClauseParser.whereClause_return retval = new HiveParser_FromClauseParser.whereClause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_WHERE129=null;
        HiveParser_FromClauseParser.searchCondition_return searchCondition130 =null;


        ASTNode KW_WHERE129_tree=null;
        RewriteRuleTokenStream stream_KW_WHERE=new RewriteRuleTokenStream(adaptor,"token KW_WHERE");
        RewriteRuleSubtreeStream stream_searchCondition=new RewriteRuleSubtreeStream(adaptor,"rule searchCondition");
         gParent.pushMsg("where clause", state); 
        try {
            // FromClauseParser.g:280:5: ( KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) )
            // FromClauseParser.g:281:5: KW_WHERE searchCondition
            {
            KW_WHERE129=(Token)match(input,KW_WHERE,FOLLOW_KW_WHERE_in_whereClause1941); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_WHERE.add(KW_WHERE129);


            pushFollow(FOLLOW_searchCondition_in_whereClause1943);
            searchCondition130=searchCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_searchCondition.add(searchCondition130.getTree());

            // AST REWRITE
            // elements: searchCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 281:30: -> ^( TOK_WHERE searchCondition )
            {
                // FromClauseParser.g:281:33: ^( TOK_WHERE searchCondition )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_WHERE, "TOK_WHERE")
                , root_1);

                adaptor.addChild(root_1, stream_searchCondition.nextTree());

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
    // $ANTLR end "whereClause"


    public static class searchCondition_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "searchCondition"
    // FromClauseParser.g:284:1: searchCondition : expression ;
    public final HiveParser_FromClauseParser.searchCondition_return searchCondition() throws RecognitionException {
        HiveParser_FromClauseParser.searchCondition_return retval = new HiveParser_FromClauseParser.searchCondition_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.expression_return expression131 =null;



         gParent.pushMsg("search condition", state); 
        try {
            // FromClauseParser.g:287:5: ( expression )
            // FromClauseParser.g:288:5: expression
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_expression_in_searchCondition1982);
            expression131=gHiveParser.expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression131.getTree());

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
    // $ANTLR end "searchCondition"


    public static class valueRowConstructor_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "valueRowConstructor"
    // FromClauseParser.g:297:1: valueRowConstructor : LPAREN precedenceUnaryPrefixExpression ( COMMA precedenceUnaryPrefixExpression )* RPAREN -> ^( TOK_VALUE_ROW ( precedenceUnaryPrefixExpression )+ ) ;
    public final HiveParser_FromClauseParser.valueRowConstructor_return valueRowConstructor() throws RecognitionException {
        HiveParser_FromClauseParser.valueRowConstructor_return retval = new HiveParser_FromClauseParser.valueRowConstructor_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN132=null;
        Token COMMA134=null;
        Token RPAREN136=null;
        HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression133 =null;

        HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression135 =null;


        ASTNode LPAREN132_tree=null;
        ASTNode COMMA134_tree=null;
        ASTNode RPAREN136_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleSubtreeStream stream_precedenceUnaryPrefixExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceUnaryPrefixExpression");
         gParent.pushMsg("value row constructor", state); 
        try {
            // FromClauseParser.g:300:5: ( LPAREN precedenceUnaryPrefixExpression ( COMMA precedenceUnaryPrefixExpression )* RPAREN -> ^( TOK_VALUE_ROW ( precedenceUnaryPrefixExpression )+ ) )
            // FromClauseParser.g:301:5: LPAREN precedenceUnaryPrefixExpression ( COMMA precedenceUnaryPrefixExpression )* RPAREN
            {
            LPAREN132=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_valueRowConstructor2019); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN132);


            pushFollow(FOLLOW_precedenceUnaryPrefixExpression_in_valueRowConstructor2021);
            precedenceUnaryPrefixExpression133=gHiveParser.precedenceUnaryPrefixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_precedenceUnaryPrefixExpression.add(precedenceUnaryPrefixExpression133.getTree());

            // FromClauseParser.g:301:44: ( COMMA precedenceUnaryPrefixExpression )*
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt47=1;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // FromClauseParser.g:301:45: COMMA precedenceUnaryPrefixExpression
            	    {
            	    COMMA134=(Token)match(input,COMMA,FOLLOW_COMMA_in_valueRowConstructor2024); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA134);


            	    pushFollow(FOLLOW_precedenceUnaryPrefixExpression_in_valueRowConstructor2026);
            	    precedenceUnaryPrefixExpression135=gHiveParser.precedenceUnaryPrefixExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_precedenceUnaryPrefixExpression.add(precedenceUnaryPrefixExpression135.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            RPAREN136=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_valueRowConstructor2030); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN136);


            // AST REWRITE
            // elements: precedenceUnaryPrefixExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 301:92: -> ^( TOK_VALUE_ROW ( precedenceUnaryPrefixExpression )+ )
            {
                // FromClauseParser.g:301:95: ^( TOK_VALUE_ROW ( precedenceUnaryPrefixExpression )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_VALUE_ROW, "TOK_VALUE_ROW")
                , root_1);

                if ( !(stream_precedenceUnaryPrefixExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_precedenceUnaryPrefixExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_precedenceUnaryPrefixExpression.nextTree());

                }
                stream_precedenceUnaryPrefixExpression.reset();

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
    // $ANTLR end "valueRowConstructor"


    public static class valuesTableConstructor_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "valuesTableConstructor"
    // FromClauseParser.g:304:1: valuesTableConstructor : valueRowConstructor ( COMMA valueRowConstructor )* -> ^( TOK_VALUES_TABLE ( valueRowConstructor )+ ) ;
    public final HiveParser_FromClauseParser.valuesTableConstructor_return valuesTableConstructor() throws RecognitionException {
        HiveParser_FromClauseParser.valuesTableConstructor_return retval = new HiveParser_FromClauseParser.valuesTableConstructor_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA138=null;
        HiveParser_FromClauseParser.valueRowConstructor_return valueRowConstructor137 =null;

        HiveParser_FromClauseParser.valueRowConstructor_return valueRowConstructor139 =null;


        ASTNode COMMA138_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_valueRowConstructor=new RewriteRuleSubtreeStream(adaptor,"rule valueRowConstructor");
         gParent.pushMsg("values table constructor", state); 
        try {
            // FromClauseParser.g:307:5: ( valueRowConstructor ( COMMA valueRowConstructor )* -> ^( TOK_VALUES_TABLE ( valueRowConstructor )+ ) )
            // FromClauseParser.g:308:5: valueRowConstructor ( COMMA valueRowConstructor )*
            {
            pushFollow(FOLLOW_valueRowConstructor_in_valuesTableConstructor2070);
            valueRowConstructor137=valueRowConstructor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_valueRowConstructor.add(valueRowConstructor137.getTree());

            // FromClauseParser.g:308:25: ( COMMA valueRowConstructor )*
            loop48:
            do {
                int alt48=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt48=1;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // FromClauseParser.g:308:26: COMMA valueRowConstructor
            	    {
            	    COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_valuesTableConstructor2073); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA138);


            	    pushFollow(FOLLOW_valueRowConstructor_in_valuesTableConstructor2075);
            	    valueRowConstructor139=valueRowConstructor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_valueRowConstructor.add(valueRowConstructor139.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            // AST REWRITE
            // elements: valueRowConstructor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 308:54: -> ^( TOK_VALUES_TABLE ( valueRowConstructor )+ )
            {
                // FromClauseParser.g:308:57: ^( TOK_VALUES_TABLE ( valueRowConstructor )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_VALUES_TABLE, "TOK_VALUES_TABLE")
                , root_1);

                if ( !(stream_valueRowConstructor.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_valueRowConstructor.hasNext() ) {
                    adaptor.addChild(root_1, stream_valueRowConstructor.nextTree());

                }
                stream_valueRowConstructor.reset();

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
    // $ANTLR end "valuesTableConstructor"


    public static class valuesClause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "valuesClause"
    // FromClauseParser.g:316:1: valuesClause : KW_VALUES valuesTableConstructor -> valuesTableConstructor ;
    public final HiveParser_FromClauseParser.valuesClause_return valuesClause() throws RecognitionException {
        HiveParser_FromClauseParser.valuesClause_return retval = new HiveParser_FromClauseParser.valuesClause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_VALUES140=null;
        HiveParser_FromClauseParser.valuesTableConstructor_return valuesTableConstructor141 =null;


        ASTNode KW_VALUES140_tree=null;
        RewriteRuleTokenStream stream_KW_VALUES=new RewriteRuleTokenStream(adaptor,"token KW_VALUES");
        RewriteRuleSubtreeStream stream_valuesTableConstructor=new RewriteRuleSubtreeStream(adaptor,"rule valuesTableConstructor");
         gParent.pushMsg("values clause", state); 
        try {
            // FromClauseParser.g:319:5: ( KW_VALUES valuesTableConstructor -> valuesTableConstructor )
            // FromClauseParser.g:320:5: KW_VALUES valuesTableConstructor
            {
            KW_VALUES140=(Token)match(input,KW_VALUES,FOLLOW_KW_VALUES_in_valuesClause2119); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_VALUES.add(KW_VALUES140);


            pushFollow(FOLLOW_valuesTableConstructor_in_valuesClause2121);
            valuesTableConstructor141=valuesTableConstructor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_valuesTableConstructor.add(valuesTableConstructor141.getTree());

            // AST REWRITE
            // elements: valuesTableConstructor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 320:38: -> valuesTableConstructor
            {
                adaptor.addChild(root_0, stream_valuesTableConstructor.nextTree());

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
    // $ANTLR end "valuesClause"


    public static class virtualTableSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "virtualTableSource"
    // FromClauseParser.g:327:1: virtualTableSource : LPAREN valuesClause RPAREN tableNameColList -> ^( TOK_VIRTUAL_TABLE tableNameColList valuesClause ) ;
    public final HiveParser_FromClauseParser.virtualTableSource_return virtualTableSource() throws RecognitionException {
        HiveParser_FromClauseParser.virtualTableSource_return retval = new HiveParser_FromClauseParser.virtualTableSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN142=null;
        Token RPAREN144=null;
        HiveParser_FromClauseParser.valuesClause_return valuesClause143 =null;

        HiveParser_FromClauseParser.tableNameColList_return tableNameColList145 =null;


        ASTNode LPAREN142_tree=null;
        ASTNode RPAREN144_tree=null;
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleSubtreeStream stream_valuesClause=new RewriteRuleSubtreeStream(adaptor,"rule valuesClause");
        RewriteRuleSubtreeStream stream_tableNameColList=new RewriteRuleSubtreeStream(adaptor,"rule tableNameColList");
         gParent.pushMsg("virtual table source", state); 
        try {
            // FromClauseParser.g:330:4: ( LPAREN valuesClause RPAREN tableNameColList -> ^( TOK_VIRTUAL_TABLE tableNameColList valuesClause ) )
            // FromClauseParser.g:331:4: LPAREN valuesClause RPAREN tableNameColList
            {
            LPAREN142=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_virtualTableSource2156); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN142);


            pushFollow(FOLLOW_valuesClause_in_virtualTableSource2158);
            valuesClause143=valuesClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_valuesClause.add(valuesClause143.getTree());

            RPAREN144=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_virtualTableSource2160); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN144);


            pushFollow(FOLLOW_tableNameColList_in_virtualTableSource2162);
            tableNameColList145=tableNameColList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableNameColList.add(tableNameColList145.getTree());

            // AST REWRITE
            // elements: tableNameColList, valuesClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 331:48: -> ^( TOK_VIRTUAL_TABLE tableNameColList valuesClause )
            {
                // FromClauseParser.g:331:51: ^( TOK_VIRTUAL_TABLE tableNameColList valuesClause )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_VIRTUAL_TABLE, "TOK_VIRTUAL_TABLE")
                , root_1);

                adaptor.addChild(root_1, stream_tableNameColList.nextTree());

                adaptor.addChild(root_1, stream_valuesClause.nextTree());

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
    // $ANTLR end "virtualTableSource"


    public static class tableNameColList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableNameColList"
    // FromClauseParser.g:337:1: tableNameColList : ( KW_AS )? identifier LPAREN identifier ( COMMA identifier )* RPAREN -> ^( TOK_VIRTUAL_TABREF ^( TOK_TABNAME identifier ) ^( TOK_COL_NAME ( identifier )+ ) ) ;
    public final HiveParser_FromClauseParser.tableNameColList_return tableNameColList() throws RecognitionException {
        HiveParser_FromClauseParser.tableNameColList_return retval = new HiveParser_FromClauseParser.tableNameColList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_AS146=null;
        Token LPAREN148=null;
        Token COMMA150=null;
        Token RPAREN152=null;
        HiveParser_IdentifiersParser.identifier_return identifier147 =null;

        HiveParser_IdentifiersParser.identifier_return identifier149 =null;

        HiveParser_IdentifiersParser.identifier_return identifier151 =null;


        ASTNode KW_AS146_tree=null;
        ASTNode LPAREN148_tree=null;
        ASTNode COMMA150_tree=null;
        ASTNode RPAREN152_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("from source", state); 
        try {
            // FromClauseParser.g:340:5: ( ( KW_AS )? identifier LPAREN identifier ( COMMA identifier )* RPAREN -> ^( TOK_VIRTUAL_TABREF ^( TOK_TABNAME identifier ) ^( TOK_COL_NAME ( identifier )+ ) ) )
            // FromClauseParser.g:341:5: ( KW_AS )? identifier LPAREN identifier ( COMMA identifier )* RPAREN
            {
            // FromClauseParser.g:341:5: ( KW_AS )?
            int alt49=2;
            switch ( input.LA(1) ) {
                case KW_AS:
                    {
                    switch ( input.LA(2) ) {
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
                            alt49=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt49) {
                case 1 :
                    // FromClauseParser.g:341:5: KW_AS
                    {
                    KW_AS146=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_tableNameColList2203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS146);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_tableNameColList2206);
            identifier147=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier147.getTree());

            LPAREN148=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tableNameColList2208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN148);


            pushFollow(FOLLOW_identifier_in_tableNameColList2210);
            identifier149=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier149.getTree());

            // FromClauseParser.g:341:41: ( COMMA identifier )*
            loop50:
            do {
                int alt50=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt50=1;
                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // FromClauseParser.g:341:42: COMMA identifier
            	    {
            	    COMMA150=(Token)match(input,COMMA,FOLLOW_COMMA_in_tableNameColList2213); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA150);


            	    pushFollow(FOLLOW_identifier_in_tableNameColList2215);
            	    identifier151=gHiveParser.identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier151.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            RPAREN152=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tableNameColList2219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN152);


            // AST REWRITE
            // elements: identifier, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 341:68: -> ^( TOK_VIRTUAL_TABREF ^( TOK_TABNAME identifier ) ^( TOK_COL_NAME ( identifier )+ ) )
            {
                // FromClauseParser.g:341:71: ^( TOK_VIRTUAL_TABREF ^( TOK_TABNAME identifier ) ^( TOK_COL_NAME ( identifier )+ ) )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_VIRTUAL_TABREF, "TOK_VIRTUAL_TABREF")
                , root_1);

                // FromClauseParser.g:341:92: ^( TOK_TABNAME identifier )
                {
                ASTNode root_2 = (ASTNode)adaptor.nil();
                root_2 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABNAME, "TOK_TABNAME")
                , root_2);

                adaptor.addChild(root_2, stream_identifier.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // FromClauseParser.g:341:118: ^( TOK_COL_NAME ( identifier )+ )
                {
                ASTNode root_2 = (ASTNode)adaptor.nil();
                root_2 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_COL_NAME, "TOK_COL_NAME")
                , root_2);

                if ( !(stream_identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                adaptor.addChild(root_1, root_2);
                }

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
    // $ANTLR end "tableNameColList"

    // $ANTLR start synpred1_FromClauseParser
    public final void synpred1_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:93:5: ( virtualTableSource )
        // FromClauseParser.g:93:6: virtualTableSource
        {
        pushFollow(FOLLOW_virtualTableSource_in_synpred1_FromClauseParser308);
        virtualTableSource();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_FromClauseParser

    // $ANTLR start synpred2_FromClauseParser
    public final void synpred2_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:107:5: ( subQuerySource )
        // FromClauseParser.g:107:6: subQuerySource
        {
        pushFollow(FOLLOW_subQuerySource_in_synpred2_FromClauseParser400);
        subQuerySource();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_FromClauseParser

    // $ANTLR start synpred3_FromClauseParser
    public final void synpred3_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:162:2: ( KW_LATERAL KW_VIEW KW_OUTER )
        // FromClauseParser.g:162:3: KW_LATERAL KW_VIEW KW_OUTER
        {
        match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_synpred3_FromClauseParser876); if (state.failed) return ;

        match(input,KW_VIEW,FOLLOW_KW_VIEW_in_synpred3_FromClauseParser878); if (state.failed) return ;

        match(input,KW_OUTER,FOLLOW_KW_OUTER_in_synpred3_FromClauseParser880); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_FromClauseParser

    // $ANTLR start synpred4_FromClauseParser
    public final void synpred4_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:162:102: ( COMMA )
        // FromClauseParser.g:162:103: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred4_FromClauseParser902); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_FromClauseParser

    // $ANTLR start synpred5_FromClauseParser
    public final void synpred5_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:165:60: ( COMMA )
        // FromClauseParser.g:165:61: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred5_FromClauseParser955); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_FromClauseParser

    // $ANTLR start synpred7_FromClauseParser
    public final void synpred7_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:270:5: ( Identifier LPAREN expression RPAREN )
        // FromClauseParser.g:270:6: Identifier LPAREN expression RPAREN
        {
        match(input,Identifier,FOLLOW_Identifier_in_synpred7_FromClauseParser1818); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred7_FromClauseParser1820); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred7_FromClauseParser1822);
        gHiveParser.expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred7_FromClauseParser1824); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_FromClauseParser

    // $ANTLR start synpred9_FromClauseParser
    public final void synpred9_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:271:28: ( Identifier )
        // FromClauseParser.g:271:29: Identifier
        {
        match(input,Identifier,FOLLOW_Identifier_in_synpred9_FromClauseParser1871); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_FromClauseParser

    // Delegated rules

    public final boolean synpred9_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA9_eotS =
        "\137\uffff";
    static final String DFA9_eofS =
        "\1\uffff\1\2\135\uffff";
    static final String DFA9_minS =
        "\1\33\1\12\2\uffff\1\33\1\u00c6\41\uffff\1\12\1\uffff\1\12\3\uffff"+
        "\1\33\5\uffff\3\0\3\uffff\2\0\1\uffff\1\0\2\uffff\3\0\1\uffff\2"+
        "\0\20\uffff\4\0\6\uffff";
    static final String DFA9_maxS =
        "\2\u022e\2\uffff\1\u022e\1\u015a\41\uffff\1\u022e\1\uffff\1\u022e"+
        "\3\uffff\1\u022e\5\uffff\3\0\3\uffff\2\0\1\uffff\1\0\2\uffff\3\0"+
        "\1\uffff\2\0\20\uffff\4\0\6\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\1\45\uffff\1\2\1\uffff\3\2\1\uffff\1\4\2\uffff\1\3\55"+
        "\uffff";
    static final String DFA9_specialS =
        "\4\uffff\1\0\56\uffff\1\1\1\2\1\3\3\uffff\1\4\1\5\1\uffff\1\6\2"+
        "\uffff\1\7\1\10\1\11\1\uffff\1\12\1\13\20\uffff\1\14\1\15\1\16\1"+
        "\17\6\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\7\2\1\uffff\21\2\2\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1"+
            "\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\20\2"+
            "\1\uffff\6\2\1\uffff\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\1\2"+
            "\1\uffff\7\2\2\uffff\4\2\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2"+
            "\1\uffff\13\2\1\uffff\5\2\1\uffff\6\2\1\uffff\13\2\2\uffff\5"+
            "\2\1\uffff\2\2\1\uffff\4\2\1\uffff\5\2\2\uffff\1\2\1\uffff\5"+
            "\2\1\uffff\2\2\1\uffff\5\2\3\uffff\14\2\1\uffff\20\2\1\uffff"+
            "\6\2\1\uffff\17\2\1\uffff\10\2\1\uffff\3\2\1\uffff\6\2\1\uffff"+
            "\4\2\1\uffff\3\2\1\uffff\15\2\1\uffff\3\2\2\uffff\1\2\1\uffff"+
            "\4\2\3\uffff\1\4\64\uffff\1\2\46\uffff\1\2\61\uffff\1\2\3\uffff"+
            "\1\2\61\uffff\1\2\3\uffff\1\2\27\uffff\1\2\4\uffff\1\2",
            "\1\2\7\uffff\1\2\10\uffff\10\2\1\uffff\21\2\2\uffff\1\2\1\uffff"+
            "\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\5\2\1\uffff\4\2\1\uffff"+
            "\20\2\1\uffff\6\2\1\uffff\1\2\1\uffff\2\2\1\uffff\4\2\1\uffff"+
            "\1\2\1\uffff\7\2\2\uffff\4\2\1\uffff\1\2\1\uffff\7\2\1\uffff"+
            "\13\2\1\uffff\14\2\1\uffff\13\2\1\uffff\11\2\1\uffff\4\2\1\uffff"+
            "\5\2\2\uffff\1\2\1\uffff\5\2\1\uffff\2\2\1\uffff\5\2\3\uffff"+
            "\35\2\1\uffff\26\2\1\uffff\14\2\1\uffff\6\2\1\uffff\4\2\1\uffff"+
            "\3\2\1\uffff\15\2\1\uffff\3\2\1\uffff\7\2\3\uffff\1\5\12\uffff"+
            "\1\2\51\uffff\1\2\46\uffff\1\2\61\uffff\1\2\3\uffff\1\2\61\uffff"+
            "\1\2\3\uffff\1\2\27\uffff\1\2\4\uffff\1\2",
            "",
            "",
            "\10\56\1\uffff\21\56\2\uffff\1\56\1\uffff\4\56\1\uffff\2\56"+
            "\1\uffff\4\56\1\uffff\3\56\1\uffff\1\56\1\uffff\4\56\1\uffff"+
            "\20\56\1\uffff\6\56\1\uffff\1\56\1\uffff\1\56\2\uffff\4\56\1"+
            "\uffff\1\56\1\uffff\7\56\2\uffff\4\56\1\50\1\56\1\uffff\4\56"+
            "\1\uffff\2\56\1\uffff\10\56\1\51\2\56\1\uffff\5\56\1\uffff\6"+
            "\56\1\uffff\13\56\1\uffff\1\53\5\56\1\uffff\2\56\1\uffff\4\56"+
            "\1\uffff\5\56\2\uffff\1\56\1\uffff\5\56\1\uffff\2\56\1\uffff"+
            "\5\56\3\uffff\14\56\1\54\20\56\1\uffff\6\56\1\52\17\56\1\uffff"+
            "\10\56\1\uffff\3\56\1\uffff\6\56\1\uffff\4\56\1\uffff\3\56\1"+
            "\uffff\15\56\1\uffff\3\56\2\uffff\1\56\1\uffff\1\47\3\56\3\uffff"+
            "\1\55\64\uffff\1\56\46\uffff\1\56\61\uffff\1\56\3\uffff\1\56"+
            "\61\uffff\1\56\3\uffff\1\56\27\uffff\1\56\4\uffff\1\56",
            "\1\61\u0093\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56\7\uffff\1\56\10\uffff\1\63\4\64\2\101\1\64\1\uffff\1"+
            "\64\1\101\1\65\1\64\1\101\2\64\5\101\2\64\1\101\2\64\2\uffff"+
            "\1\64\1\uffff\4\64\1\uffff\2\64\1\uffff\4\64\1\uffff\1\101\1"+
            "\64\1\101\1\56\1\101\1\uffff\3\101\1\64\1\uffff\1\64\1\101\3"+
            "\64\1\101\2\64\1\101\3\64\1\101\3\64\1\uffff\1\64\1\101\1\64"+
            "\1\101\2\64\1\uffff\1\64\1\uffff\1\64\2\uffff\1\64\1\101\2\64"+
            "\1\uffff\1\101\1\uffff\2\101\4\64\1\101\2\uffff\2\101\2\64\1"+
            "\uffff\1\100\1\uffff\1\64\3\101\1\uffff\2\64\1\uffff\2\101\2"+
            "\64\1\72\3\64\3\101\1\uffff\2\101\3\64\1\56\4\64\1\71\1\74\1"+
            "\uffff\1\64\1\101\3\64\1\101\5\64\2\uffff\5\64\1\uffff\2\64"+
            "\1\uffff\1\64\1\101\2\64\1\uffff\1\64\1\101\1\64\1\101\1\64"+
            "\2\uffff\1\64\1\uffff\3\101\2\64\1\uffff\2\64\1\uffff\1\101"+
            "\2\64\1\101\1\64\3\uffff\1\64\1\101\1\64\1\101\2\64\1\101\1"+
            "\64\1\101\3\64\1\uffff\2\101\10\64\1\101\1\64\1\77\1\101\2\64"+
            "\1\uffff\3\101\3\64\1\uffff\4\64\1\101\5\64\1\101\4\64\1\uffff"+
            "\6\64\1\101\1\64\1\56\3\64\1\uffff\1\101\1\64\1\101\3\64\1\uffff"+
            "\3\101\1\64\1\uffff\1\64\1\101\1\64\1\uffff\3\64\1\101\2\64"+
            "\2\101\3\64\1\101\1\64\1\uffff\3\64\2\uffff\1\64\1\uffff\1\101"+
            "\3\64\3\uffff\1\56\12\uffff\1\56\51\uffff\1\64\46\uffff\1\64"+
            "\61\uffff\1\64\3\uffff\1\64\61\uffff\1\64\3\uffff\1\64\27\uffff"+
            "\1\64\4\uffff\1\64",
            "",
            "\1\56\7\uffff\1\56\10\uffff\10\56\1\uffff\21\56\2\uffff\1\56"+
            "\1\uffff\4\56\1\uffff\2\56\1\uffff\4\56\1\uffff\5\56\1\uffff"+
            "\4\56\1\uffff\20\56\1\uffff\6\56\1\uffff\1\56\1\uffff\1\56\2"+
            "\uffff\4\56\1\uffff\1\56\1\uffff\7\56\2\uffff\4\56\1\uffff\1"+
            "\56\1\uffff\4\56\1\uffff\2\56\1\uffff\13\56\1\uffff\1\104\13"+
            "\56\1\uffff\13\56\2\uffff\5\56\1\uffff\2\56\1\uffff\4\56\1\uffff"+
            "\5\56\2\uffff\1\56\1\uffff\5\56\1\uffff\1\103\1\56\1\uffff\5"+
            "\56\3\uffff\14\56\1\uffff\20\56\1\uffff\6\56\1\uffff\17\56\1"+
            "\uffff\14\56\1\uffff\6\56\1\uffff\4\56\1\uffff\3\56\1\uffff"+
            "\15\56\1\uffff\3\56\2\uffff\1\56\1\uffff\4\56\3\uffff\1\56\12"+
            "\uffff\1\56\51\uffff\1\56\46\uffff\1\56\61\uffff\1\56\3\uffff"+
            "\1\56\61\uffff\1\56\3\uffff\1\56\27\uffff\1\56\4\uffff\1\56",
            "",
            "",
            "",
            "\10\56\1\uffff\21\56\2\uffff\1\56\1\uffff\4\56\1\uffff\2\56"+
            "\1\uffff\4\56\1\uffff\3\56\1\uffff\1\56\1\uffff\4\56\1\uffff"+
            "\20\56\1\uffff\6\56\1\uffff\1\56\1\uffff\1\56\2\uffff\4\56\1"+
            "\uffff\1\56\1\uffff\7\56\2\uffff\6\56\1\uffff\4\56\1\uffff\2"+
            "\56\1\uffff\13\56\1\uffff\5\56\1\uffff\6\56\1\uffff\13\56\1"+
            "\uffff\1\126\5\56\1\uffff\2\56\1\uffff\4\56\1\uffff\5\56\2\uffff"+
            "\1\56\1\uffff\5\56\1\uffff\2\56\1\uffff\5\56\3\uffff\14\56\1"+
            "\127\20\56\1\uffff\6\56\1\125\17\56\1\uffff\10\56\1\uffff\3"+
            "\56\1\uffff\6\56\1\uffff\4\56\1\uffff\3\56\1\uffff\15\56\1\uffff"+
            "\3\56\2\uffff\1\56\1\uffff\4\56\3\uffff\1\130\64\uffff\1\56"+
            "\46\uffff\1\56\61\uffff\1\56\3\uffff\1\56\61\uffff\1\56\3\uffff"+
            "\1\56\27\uffff\1\56\4\uffff\1\56",
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
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
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
            "",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "101:1: atomjoinSource : ( tableSource ( lateralView ^)* | ( subQuerySource )=> subQuerySource ( lateralView ^)* | partitionedTableFunction ( lateralView ^)* | LPAREN ! joinSource RPAREN !);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA9_4==KW_WITH) ) {s = 39;}

                        else if ( (LA9_4==KW_FROM) && (synpred2_FromClauseParser())) {s = 40;}

                        else if ( (LA9_4==KW_INSERT) ) {s = 41;}

                        else if ( (LA9_4==KW_SELECT) && (synpred2_FromClauseParser())) {s = 42;}

                        else if ( (LA9_4==KW_MAP) && (synpred2_FromClauseParser())) {s = 43;}

                        else if ( (LA9_4==KW_REDUCE) && (synpred2_FromClauseParser())) {s = 44;}

                        else if ( (LA9_4==LPAREN) ) {s = 45;}

                        else if ( ((LA9_4 >= Identifier && LA9_4 <= KW_ANALYZE)||(LA9_4 >= KW_ARCHIVE && LA9_4 <= KW_CASCADE)||LA9_4==KW_CHANGE||(LA9_4 >= KW_CLUSTER && LA9_4 <= KW_COLLECTION)||(LA9_4 >= KW_COLUMNS && LA9_4 <= KW_COMMENT)||(LA9_4 >= KW_COMPACT && LA9_4 <= KW_CONCATENATE)||(LA9_4 >= KW_CONSTRAINT && LA9_4 <= KW_CREATE)||LA9_4==KW_CUBE||(LA9_4 >= KW_CURRENT_DATE && LA9_4 <= KW_DATA)||(LA9_4 >= KW_DATABASES && LA9_4 <= KW_DISABLE)||(LA9_4 >= KW_DISTRIBUTE && LA9_4 <= KW_ELEM_TYPE)||LA9_4==KW_ENABLE||LA9_4==KW_ESCAPED||(LA9_4 >= KW_EXCLUSIVE && LA9_4 <= KW_EXPORT)||LA9_4==KW_EXTERNAL||(LA9_4 >= KW_FALSE && LA9_4 <= KW_FLOAT)||(LA9_4 >= KW_FOR && LA9_4 <= KW_FORMATTED)||LA9_4==KW_FULL||(LA9_4 >= KW_FUNCTIONS && LA9_4 <= KW_GROUPING)||(LA9_4 >= KW_HOUR && LA9_4 <= KW_IDXPROPERTIES)||(LA9_4 >= KW_IMPORT && LA9_4 <= KW_INPUTFORMAT)||(LA9_4 >= KW_INT && LA9_4 <= KW_INTERSECT)||(LA9_4 >= KW_INTO && LA9_4 <= KW_JAR)||(LA9_4 >= KW_KEY && LA9_4 <= KW_LEFT)||(LA9_4 >= KW_LEVEL && LA9_4 <= KW_LONG)||(LA9_4 >= KW_MAPJOIN && LA9_4 <= KW_METADATA)||(LA9_4 >= KW_MINUTE && LA9_4 <= KW_MONTH)||(LA9_4 >= KW_MSCK && LA9_4 <= KW_NOSCAN)||(LA9_4 >= KW_NOVALIDATE && LA9_4 <= KW_OFFSET)||LA9_4==KW_OPTION||(LA9_4 >= KW_ORDER && LA9_4 <= KW_OUTPUTFORMAT)||(LA9_4 >= KW_OVERWRITE && LA9_4 <= KW_OWNER)||(LA9_4 >= KW_PARTITION && LA9_4 <= KW_PLUS)||(LA9_4 >= KW_PRETTY && LA9_4 <= KW_RECORDWRITER)||(LA9_4 >= KW_REFERENCES && LA9_4 <= KW_ROLES)||(LA9_4 >= KW_ROLLUP && LA9_4 <= KW_SECOND)||(LA9_4 >= KW_SEMI && LA9_4 <= KW_SSL)||(LA9_4 >= KW_STATISTICS && LA9_4 <= KW_TABLES)||(LA9_4 >= KW_TBLPROPERTIES && LA9_4 <= KW_TERMINATED)||(LA9_4 >= KW_TIMESTAMP && LA9_4 <= KW_TRANSACTIONS)||(LA9_4 >= KW_TRIGGER && LA9_4 <= KW_UNARCHIVE)||(LA9_4 >= KW_UNDO && LA9_4 <= KW_UNIONTYPE)||(LA9_4 >= KW_UNLOCK && LA9_4 <= KW_VALUE_TYPE)||(LA9_4 >= KW_VIEW && LA9_4 <= KW_WEEK)||LA9_4==KW_WHILE||(LA9_4 >= KW_WORK && LA9_4 <= KW_YEAR)||LA9_4==KW_BATCH||LA9_4==KW_DAYOFWEEK||LA9_4==KW_HOLD_DDLTIME||LA9_4==KW_IGNORE||LA9_4==KW_NO_DROP||LA9_4==KW_OFFLINE||LA9_4==KW_PROTECTION||LA9_4==KW_READONLY) ) {s = 46;}

                         
                        input.seek(index9_4);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_51 = input.LA(1);

                         
                        int index9_51 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_51);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_52 = input.LA(1);

                         
                        int index9_52 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_52);

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_53 = input.LA(1);

                         
                        int index9_53 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_53);

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_57 = input.LA(1);

                         
                        int index9_57 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_57);

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_58 = input.LA(1);

                         
                        int index9_58 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_58);

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_60 = input.LA(1);

                         
                        int index9_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_60);

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_63 = input.LA(1);

                         
                        int index9_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_63);

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_64 = input.LA(1);

                         
                        int index9_64 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_64);

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_65 = input.LA(1);

                         
                        int index9_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_65);

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_67 = input.LA(1);

                         
                        int index9_67 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_67);

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA9_68 = input.LA(1);

                         
                        int index9_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_68);

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA9_85 = input.LA(1);

                         
                        int index9_85 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_85);

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA9_86 = input.LA(1);

                         
                        int index9_86 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_86);

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA9_87 = input.LA(1);

                         
                        int index9_87 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_87);

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA9_88 = input.LA(1);

                         
                        int index9_88 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FromClauseParser()) ) {s = 44;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index9_88);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA19_eotS =
        "\u008b\uffff";
    static final String DFA19_eofS =
        "\1\1\u008a\uffff";
    static final String DFA19_minS =
        "\1\12\2\uffff\1\33\31\uffff\3\0\153\uffff";
    static final String DFA19_maxS =
        "\1\u0154\2\uffff\1\u022e\31\uffff\3\0\153\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\102\uffff\1\1\106\uffff";
    static final String DFA19_specialS =
        "\35\uffff\1\0\1\1\1\2\153\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\3\56\uffff\1\1\17\uffff\1\1\30\uffff\1\1\11\uffff\1\1\26"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1\3\uffff\1\1\1"+
            "\uffff\1\1\6\uffff\1\1\4\uffff\2\1\3\uffff\1\1\11\uffff\1\1"+
            "\5\uffff\1\1\15\uffff\1\1\3\uffff\1\1\34\uffff\1\1\14\uffff"+
            "\1\1\12\uffff\1\1\14\uffff\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff"+
            "\1\1\22\uffff\1\1",
            "",
            "",
            "\1\35\4\36\2\37\1\36\1\uffff\1\36\2\37\1\36\1\37\2\36\5\37"+
            "\2\36\1\37\2\36\2\uffff\1\36\1\uffff\4\36\1\uffff\2\36\1\uffff"+
            "\4\36\1\uffff\1\37\1\36\1\37\1\uffff\1\37\1\uffff\3\37\1\36"+
            "\1\uffff\1\36\1\37\3\36\1\37\2\36\1\37\3\36\1\37\3\36\1\uffff"+
            "\1\36\1\37\1\36\1\37\2\36\1\uffff\1\36\1\uffff\1\36\2\uffff"+
            "\1\36\1\37\2\36\1\uffff\1\37\1\uffff\2\37\4\36\1\37\2\uffff"+
            "\2\37\2\36\1\uffff\1\37\1\uffff\1\36\3\37\1\uffff\2\36\1\uffff"+
            "\2\37\2\36\1\37\3\36\3\37\1\uffff\2\37\3\36\1\uffff\4\36\2\37"+
            "\1\uffff\1\36\1\37\3\36\1\37\5\36\2\uffff\5\36\1\uffff\2\36"+
            "\1\uffff\1\36\1\37\2\36\1\uffff\1\36\1\37\1\36\1\37\1\36\2\uffff"+
            "\1\36\1\uffff\3\37\2\36\1\uffff\2\36\1\uffff\1\37\2\36\1\37"+
            "\1\36\3\uffff\1\36\1\37\1\36\1\37\2\36\1\37\1\36\1\37\3\36\1"+
            "\uffff\2\37\10\36\1\37\1\36\2\37\2\36\1\uffff\3\37\3\36\1\uffff"+
            "\4\36\1\37\5\36\1\37\4\36\1\uffff\6\36\1\37\1\36\1\uffff\3\36"+
            "\1\uffff\1\37\1\36\1\37\3\36\1\uffff\3\37\1\36\1\uffff\1\36"+
            "\1\37\1\36\1\uffff\3\36\1\37\2\36\2\37\3\36\1\37\1\36\1\uffff"+
            "\3\36\2\uffff\1\36\1\uffff\1\37\3\36\3\uffff\1\1\64\uffff\1"+
            "\36\46\uffff\1\36\61\uffff\1\36\3\uffff\1\36\61\uffff\1\36\3"+
            "\uffff\1\36\27\uffff\1\36\4\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 162:101: ( ( COMMA )=> COMMA identifier )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_29 = input.LA(1);

                         
                        int index19_29 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_FromClauseParser()) ) {s = 68;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_29);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_30 = input.LA(1);

                         
                        int index19_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_FromClauseParser()) ) {s = 68;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_30);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_31 = input.LA(1);

                         
                        int index19_31 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_FromClauseParser()) ) {s = 68;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_31);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA21_eotS =
        "\u008b\uffff";
    static final String DFA21_eofS =
        "\1\1\u008a\uffff";
    static final String DFA21_minS =
        "\1\12\2\uffff\1\33\31\uffff\3\0\153\uffff";
    static final String DFA21_maxS =
        "\1\u0154\2\uffff\1\u022e\31\uffff\3\0\153\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\102\uffff\1\1\106\uffff";
    static final String DFA21_specialS =
        "\35\uffff\1\0\1\1\1\2\153\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\3\56\uffff\1\1\17\uffff\1\1\30\uffff\1\1\11\uffff\1\1\26"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1\3\uffff\1\1\1"+
            "\uffff\1\1\6\uffff\1\1\4\uffff\2\1\3\uffff\1\1\11\uffff\1\1"+
            "\5\uffff\1\1\15\uffff\1\1\3\uffff\1\1\34\uffff\1\1\14\uffff"+
            "\1\1\12\uffff\1\1\14\uffff\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff"+
            "\1\1\22\uffff\1\1",
            "",
            "",
            "\1\35\4\36\2\37\1\36\1\uffff\1\36\2\37\1\36\1\37\2\36\5\37"+
            "\2\36\1\37\2\36\2\uffff\1\36\1\uffff\4\36\1\uffff\2\36\1\uffff"+
            "\4\36\1\uffff\1\37\1\36\1\37\1\uffff\1\37\1\uffff\3\37\1\36"+
            "\1\uffff\1\36\1\37\3\36\1\37\2\36\1\37\3\36\1\37\3\36\1\uffff"+
            "\1\36\1\37\1\36\1\37\2\36\1\uffff\1\36\1\uffff\1\36\2\uffff"+
            "\1\36\1\37\2\36\1\uffff\1\37\1\uffff\2\37\4\36\1\37\2\uffff"+
            "\2\37\2\36\1\uffff\1\37\1\uffff\1\36\3\37\1\uffff\2\36\1\uffff"+
            "\2\37\2\36\1\37\3\36\3\37\1\uffff\2\37\3\36\1\uffff\4\36\2\37"+
            "\1\uffff\1\36\1\37\3\36\1\37\5\36\2\uffff\5\36\1\uffff\2\36"+
            "\1\uffff\1\36\1\37\2\36\1\uffff\1\36\1\37\1\36\1\37\1\36\2\uffff"+
            "\1\36\1\uffff\3\37\2\36\1\uffff\2\36\1\uffff\1\37\2\36\1\37"+
            "\1\36\3\uffff\1\36\1\37\1\36\1\37\2\36\1\37\1\36\1\37\3\36\1"+
            "\uffff\2\37\10\36\1\37\1\36\2\37\2\36\1\uffff\3\37\3\36\1\uffff"+
            "\4\36\1\37\5\36\1\37\4\36\1\uffff\6\36\1\37\1\36\1\uffff\3\36"+
            "\1\uffff\1\37\1\36\1\37\3\36\1\uffff\3\37\1\36\1\uffff\1\36"+
            "\1\37\1\36\1\uffff\3\36\1\37\2\36\2\37\3\36\1\37\1\36\1\uffff"+
            "\3\36\2\uffff\1\36\1\uffff\1\37\3\36\3\uffff\1\1\64\uffff\1"+
            "\36\46\uffff\1\36\61\uffff\1\36\3\uffff\1\36\61\uffff\1\36\3"+
            "\uffff\1\36\27\uffff\1\36\4\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 165:59: ( ( COMMA )=> COMMA identifier )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_29 = input.LA(1);

                         
                        int index21_29 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_FromClauseParser()) ) {s = 68;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index21_29);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_30 = input.LA(1);

                         
                        int index21_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_FromClauseParser()) ) {s = 68;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index21_30);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_31 = input.LA(1);

                         
                        int index21_31 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_FromClauseParser()) ) {s = 68;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index21_31);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA32_eotS =
        "\u02e9\uffff";
    static final String DFA32_eofS =
        "\1\6\1\uffff\4\1\1\uffff\1\1\2\uffff\3\1\1\uffff\1\1\4\uffff\1\1"+
        "\2\uffff\2\1\2\uffff\4\1\u02cb\uffff";
    static final String DFA32_minS =
        "\1\12\1\uffff\4\12\1\uffff\1\12\2\uffff\3\12\1\uffff\1\12\4\uffff"+
        "\1\12\2\uffff\2\12\2\uffff\4\12\141\uffff\1\0\37\uffff\1\0\36\uffff"+
        "\1\0\36\uffff\1\0\147\uffff\3\7\36\uffff\3\7\u00be\uffff\u00c2\0";
    static final String DFA32_maxS =
        "\1\u022e\1\uffff\4\u0154\1\uffff\1\u0154\2\uffff\3\u0154\1\uffff"+
        "\1\u0154\4\uffff\1\u0154\2\uffff\2\u0154\2\uffff\4\u0154\141\uffff"+
        "\1\0\37\uffff\1\0\36\uffff\1\0\36\uffff\1\0\147\uffff\3\u022e\36"+
        "\uffff\3\u022e\u00be\uffff\u00c2\0";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\u02e2\uffff";
    static final String DFA32_specialS =
        "\177\uffff\1\0\37\uffff\1\1\36\uffff\1\2\36\uffff\1\3\u0149\uffff"+
        "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1"+
        "\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
        "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
        "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
        "\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103"+
        "\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116"+
        "\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131"+
        "\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144"+
        "\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
        "\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172"+
        "\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1"+
        "\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1"+
        "\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1"+
        "\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
        "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1"+
        "\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1"+
        "\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1"+
        "\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1"+
        "\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1"+
        "\u00c4\1\u00c5}>";
    static final String[] DFA32_transitionS = {
            "\1\6\20\uffff\1\2\7\1\1\uffff\21\1\2\uffff\1\1\1\uffff\1\3\3"+
            "\1\1\uffff\2\1\1\uffff\4\1\1\uffff\3\1\1\6\1\1\1\uffff\4\1\1"+
            "\uffff\20\1\1\uffff\1\33\5\1\1\uffff\1\1\1\uffff\1\1\1\6\1\uffff"+
            "\4\1\1\uffff\1\1\1\uffff\7\1\2\uffff\4\1\1\uffff\1\13\1\uffff"+
            "\2\1\1\16\1\1\1\6\2\1\1\uffff\4\1\1\5\3\1\1\14\1\1\1\26\1\uffff"+
            "\5\1\1\6\4\1\1\4\1\7\1\uffff\2\1\1\35\10\1\1\uffff\1\6\5\1\1"+
            "\6\2\1\1\uffff\4\1\1\uffff\5\1\1\6\1\uffff\1\1\1\uffff\1\27"+
            "\4\1\1\uffff\2\1\1\uffff\1\32\4\1\3\uffff\14\1\1\6\14\1\1\12"+
            "\3\1\1\uffff\6\1\1\6\14\1\1\34\2\1\1\uffff\10\1\1\uffff\3\1"+
            "\1\uffff\6\1\1\uffff\4\1\1\uffff\1\1\1\23\1\1\1\uffff\15\1\1"+
            "\uffff\3\1\1\uffff\1\6\1\1\1\6\4\1\16\uffff\1\6\51\uffff\1\1"+
            "\46\uffff\1\1\61\uffff\1\1\3\uffff\1\1\61\uffff\1\1\3\uffff"+
            "\1\1\27\uffff\1\1\4\uffff\1\1",
            "",
            "\1\1\20\uffff\1\1\35\uffff\1\1\17\uffff\1\1\30\uffff\1\1\11"+
            "\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1"+
            "\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\4\uffff\2\1\3\uffff\1\1"+
            "\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1\1\10\uffff"+
            "\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff\1\1\35"+
            "\uffff\1\1\24\uffff\1\1\1\uffff\1\1\7\uffff\1\6\12\uffff\1\1",
            "\1\1\20\uffff\1\1\26\uffff\1\6\6\uffff\1\1\17\uffff\1\1\30"+
            "\uffff\1\1\11\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1"+
            "\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\4\uffff\2\1"+
            "\3\uffff\1\1\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1"+
            "\1\10\uffff\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff"+
            "\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1\22\uffff\1\1",
            "\1\1\20\uffff\1\1\35\uffff\1\1\17\uffff\1\1\30\uffff\1\1\11"+
            "\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1"+
            "\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\4\uffff\2\1\3\uffff\1\1"+
            "\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1\1\10\uffff"+
            "\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff\1\1\35"+
            "\uffff\1\1\20\uffff\1\6\3\uffff\1\1\1\uffff\1\1\22\uffff\1\1",
            "\1\1\20\uffff\1\1\35\uffff\1\1\17\uffff\1\1\30\uffff\1\1\11"+
            "\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1"+
            "\3\uffff\1\1\1\uffff\1\1\6\uffff\1\177\4\uffff\2\1\3\uffff\1"+
            "\1\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1\1\10\uffff"+
            "\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff\1\1\35"+
            "\uffff\1\1\24\uffff\1\1\1\uffff\1\1\22\uffff\1\1",
            "",
            "\1\1\20\uffff\1\1\35\uffff\1\1\17\uffff\1\1\30\uffff\1\1\11"+
            "\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1"+
            "\3\uffff\1\1\1\uffff\1\1\6\uffff\1\u009f\4\uffff\2\1\3\uffff"+
            "\1\1\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\6\6\uffff\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\1\6"+
            "\13\uffff\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1\22\uffff"+
            "\1\1",
            "",
            "",
            "\1\1\20\uffff\1\1\35\uffff\1\1\17\uffff\1\1\30\uffff\1\1\11"+
            "\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1"+
            "\3\uffff\1\1\1\uffff\1\1\6\uffff\1\u00be\4\uffff\2\1\3\uffff"+
            "\1\1\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\6\6\uffff\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff"+
            "\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1\22\uffff\1\1",
            "\1\1\20\uffff\1\1\35\uffff\1\1\17\uffff\1\1\30\uffff\1\1\11"+
            "\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1"+
            "\3\uffff\1\1\1\uffff\1\1\6\uffff\1\u00dd\4\uffff\2\1\3\uffff"+
            "\1\1\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\6\6\uffff\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff"+
            "\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1\22\uffff\1\1",
            "\1\1\20\uffff\1\1\35\uffff\1\1\17\uffff\1\1\30\uffff\1\1\11"+
            "\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1"+
            "\3\uffff\1\1\1\uffff\1\1\1\uffff\1\6\4\uffff\1\1\4\uffff\2\1"+
            "\3\uffff\1\1\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1"+
            "\1\5\uffff\1\6\2\uffff\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff"+
            "\1\1\14\uffff\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1\22\uffff"+
            "\1\1",
            "",
            "\1\1\20\uffff\1\1\26\uffff\1\6\6\uffff\1\1\17\uffff\1\1\30"+
            "\uffff\1\1\11\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1"+
            "\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\4\uffff\2\1"+
            "\3\uffff\1\1\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1"+
            "\1\10\uffff\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff"+
            "\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1\22\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\1\20\uffff\1\1\4\uffff\1\6\30\uffff\1\1\17\uffff\1\1\27"+
            "\uffff\1\6\1\1\11\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\4\uffff"+
            "\2\1\3\uffff\1\1\11\uffff\1\u0146\5\uffff\1\1\15\uffff\1\1\3"+
            "\uffff\1\1\10\uffff\1\1\23\uffff\1\u0147\14\uffff\1\1\12\uffff"+
            "\1\u0145\14\uffff\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1"+
            "\7\uffff\1\6\12\uffff\1\1",
            "",
            "",
            "\1\1\20\uffff\1\1\4\uffff\1\6\30\uffff\1\1\17\uffff\1\1\27"+
            "\uffff\1\6\1\1\11\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\4\uffff"+
            "\2\1\3\uffff\1\1\11\uffff\1\u0167\5\uffff\1\1\15\uffff\1\1\3"+
            "\uffff\1\1\10\uffff\1\1\23\uffff\1\u0168\14\uffff\1\1\12\uffff"+
            "\1\u0166\14\uffff\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1"+
            "\7\uffff\1\6\12\uffff\1\1",
            "\1\1\20\uffff\1\1\26\uffff\1\6\6\uffff\1\1\17\uffff\1\1\30"+
            "\uffff\1\1\11\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1"+
            "\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\4\uffff\2\1"+
            "\3\uffff\1\1\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1"+
            "\1\10\uffff\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff"+
            "\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1\22\uffff\1\1",
            "",
            "",
            "\1\1\20\uffff\1\1\26\uffff\1\6\6\uffff\1\1\17\uffff\1\1\30"+
            "\uffff\1\1\11\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1"+
            "\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\4\uffff\2\1"+
            "\3\uffff\1\1\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1"+
            "\1\10\uffff\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff"+
            "\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1\22\uffff\1\1",
            "\1\1\20\uffff\1\1\26\uffff\1\6\6\uffff\1\1\17\uffff\1\1\30"+
            "\uffff\1\1\11\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1"+
            "\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\4\uffff\2\1"+
            "\3\uffff\1\1\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1"+
            "\1\10\uffff\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff"+
            "\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1\22\uffff\1\1",
            "\1\1\20\uffff\1\1\26\uffff\1\6\6\uffff\1\1\17\uffff\1\1\30"+
            "\uffff\1\1\11\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1"+
            "\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\4\uffff\2\1"+
            "\3\uffff\1\1\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1"+
            "\1\10\uffff\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff"+
            "\1\1\35\uffff\1\1\24\uffff\1\1\1\uffff\1\1\22\uffff\1\1",
            "\1\1\20\uffff\1\1\35\uffff\1\1\17\uffff\1\1\30\uffff\1\1\11"+
            "\uffff\1\1\26\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1"+
            "\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\4\uffff\2\1\3\uffff\1\1"+
            "\11\uffff\1\1\5\uffff\1\1\15\uffff\1\1\3\uffff\1\1\10\uffff"+
            "\1\1\23\uffff\1\1\14\uffff\1\1\12\uffff\1\1\14\uffff\1\1\35"+
            "\uffff\1\1\24\uffff\1\1\1\uffff\1\1\15\uffff\1\6\4\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\u0236\6\uffff\1\u023a\1\uffff\1\u0227\2\uffff\1\u0239\7"+
            "\uffff\1\u022b\4\u022c\1\u0228\1\u0248\1\u022c\1\uffff\1\u022c"+
            "\1\u023d\1\u0248\1\u022c\1\u0248\2\u022c\1\u0248\3\u0245\1\u0248"+
            "\2\u022c\1\u0248\2\u022c\1\u0243\1\u0240\1\u022c\1\uffff\4\u022c"+
            "\1\uffff\2\u022c\1\uffff\4\u022c\1\uffff\1\u0248\1\u022c\1\u0248"+
            "\1\uffff\1\u0248\1\uffff\1\u0232\1\u0234\1\u0248\1\u022c\1\uffff"+
            "\1\u022c\1\u022d\3\u022c\1\u0248\2\u022c\1\u0248\3\u022c\1\u0248"+
            "\3\u022c\1\u0229\1\u022c\1\u0245\1\u022c\1\u0248\2\u022c\1\uffff"+
            "\1\u022c\1\uffff\1\u022c\2\uffff\1\u022c\1\u0247\2\u022c\1\uffff"+
            "\1\u0248\1\u0241\1\u023b\1\u0248\4\u022c\1\u0245\1\u0242\1\uffff"+
            "\2\u0248\2\u022c\1\uffff\1\u0248\1\uffff\1\u022c\2\u0248\1\u0245"+
            "\1\uffff\2\u022c\1\u0244\2\u0248\2\u022c\1\u0248\3\u022c\1\u0248"+
            "\1\u0245\1\u0248\1\u023f\2\u0248\3\u022c\1\uffff\4\u022c\2\u0248"+
            "\1\uffff\1\u022c\1\u0248\3\u022c\1\u0248\5\u022c\1\uffff\1\u0246"+
            "\5\u022c\1\uffff\2\u022c\1\uffff\1\u022c\1\u0248\2\u022c\1\u022e"+
            "\1\u022c\1\u023c\1\u022c\1\u0248\1\u022c\2\uffff\1\u022c\1\uffff"+
            "\3\u0248\2\u022c\1\uffff\2\u022c\1\uffff\1\u0248\2\u022c\1\u0248"+
            "\1\u022c\3\uffff\1\u022c\1\u0248\1\u022c\1\u0248\2\u022c\1\u0248"+
            "\1\u022c\1\u0248\3\u022c\1\uffff\2\u0248\10\u022c\1\u0248\1"+
            "\u022c\2\u0248\2\u022c\1\uffff\3\u0248\3\u022c\1\uffff\4\u022c"+
            "\1\u0248\5\u022c\1\u0245\4\u022c\1\uffff\6\u022c\1\u0248\1\u022c"+
            "\1\uffff\3\u022c\1\uffff\1\u0233\1\u022c\1\u0248\3\u022c\1\u0249"+
            "\1\u0248\1\u0235\1\u0248\1\u022c\1\uffff\1\u022c\1\u0248\1\u022c"+
            "\1\uffff\3\u022c\1\u0248\2\u022c\2\u0248\3\u022c\1\u0248\1\u022c"+
            "\1\uffff\3\u022c\2\uffff\1\u022c\1\uffff\1\u0248\3\u022c\3\uffff"+
            "\1\u023e\2\uffff\1\u022f\2\uffff\1\u0230\1\u022f\7\uffff\1\u022a"+
            "\1\u0237\1\u0231\1\u022f\1\u0238\41\uffff\1\u022c\46\uffff\1"+
            "\u022c\61\uffff\1\u022c\3\uffff\1\u022c\61\uffff\1\u022c\3\uffff"+
            "\1\u022c\27\uffff\1\u022c\4\uffff\1\u022c",
            "\1\u0256\6\uffff\1\u025a\4\uffff\1\u0259\7\uffff\1\u024b\4"+
            "\u024c\2\u0268\1\u024c\1\uffff\1\u024c\1\u025d\1\u0268\1\u024c"+
            "\1\u0268\2\u024c\1\u0268\3\u0265\1\u0268\2\u024c\1\u0268\2\u024c"+
            "\1\u0263\1\u0260\1\u024c\1\uffff\4\u024c\1\uffff\2\u024c\1\uffff"+
            "\4\u024c\1\uffff\1\u0268\1\u024c\1\u0268\1\uffff\1\u0268\1\uffff"+
            "\1\u0252\1\u0254\1\u0268\1\u024c\1\uffff\1\u024c\1\u024d\3\u024c"+
            "\1\u0268\2\u024c\1\u0268\3\u024c\1\u0268\3\u024c\1\uffff\1\u024c"+
            "\1\u0265\1\u024c\1\u0268\2\u024c\1\uffff\1\u024c\1\uffff\1\u024c"+
            "\2\uffff\1\u024c\1\u0267\2\u024c\1\uffff\1\u0268\1\u0261\1\u025b"+
            "\1\u0268\4\u024c\1\u0265\1\u0262\1\uffff\2\u0268\2\u024c\1\uffff"+
            "\1\u0268\1\uffff\1\u024c\2\u0268\1\u0265\1\uffff\2\u024c\1\u0264"+
            "\2\u0268\2\u024c\1\u0268\3\u024c\1\u0268\1\u0265\1\u0268\1\u025f"+
            "\2\u0268\3\u024c\1\uffff\4\u024c\2\u0268\1\uffff\1\u024c\1\u0268"+
            "\3\u024c\1\u0268\5\u024c\1\uffff\1\u0266\5\u024c\1\uffff\2\u024c"+
            "\1\uffff\1\u024c\1\u0268\2\u024c\1\u024e\1\u024c\1\u025c\1\u024c"+
            "\1\u0268\1\u024c\2\uffff\1\u024c\1\uffff\3\u0268\2\u024c\1\uffff"+
            "\2\u024c\1\uffff\1\u0268\2\u024c\1\u0268\1\u024c\3\uffff\1\u024c"+
            "\1\u0268\1\u024c\1\u0268\2\u024c\1\u0268\1\u024c\1\u0268\3\u024c"+
            "\1\uffff\2\u0268\10\u024c\1\u0268\1\u024c\2\u0268\2\u024c\1"+
            "\uffff\3\u0268\3\u024c\1\uffff\4\u024c\1\u0268\5\u024c\1\u0265"+
            "\4\u024c\1\uffff\6\u024c\1\u0268\1\u024c\1\uffff\3\u024c\1\uffff"+
            "\1\u0253\1\u024c\1\u0268\3\u024c\1\uffff\1\u0268\1\u0255\1\u0268"+
            "\1\u024c\1\uffff\1\u024c\1\u0268\1\u024c\1\uffff\3\u024c\1\u0268"+
            "\2\u024c\2\u0268\3\u024c\1\u0268\1\u024c\1\uffff\3\u024c\2\uffff"+
            "\1\u024c\1\uffff\1\u0268\3\u024c\3\uffff\1\u025e\2\uffff\1\u024f"+
            "\2\uffff\1\u0250\1\u024f\7\uffff\1\u024a\1\u0257\1\u0251\1\u024f"+
            "\1\u0258\41\uffff\1\u024c\46\uffff\1\u024c\61\uffff\1\u024c"+
            "\3\uffff\1\u024c\61\uffff\1\u024c\3\uffff\1\u024c\27\uffff\1"+
            "\u024c\4\uffff\1\u024c",
            "\1\u0275\6\uffff\1\u0279\4\uffff\1\u0278\7\uffff\1\u026a\4"+
            "\u026b\2\u0287\1\u026b\1\uffff\1\u026b\1\u027c\1\u0287\1\u026b"+
            "\1\u0287\2\u026b\1\u0287\3\u0284\1\u0287\2\u026b\1\u0287\2\u026b"+
            "\1\u0282\1\u027f\1\u026b\1\uffff\4\u026b\1\uffff\2\u026b\1\uffff"+
            "\4\u026b\1\uffff\1\u0287\1\u026b\1\u0287\1\uffff\1\u0287\1\uffff"+
            "\1\u0271\1\u0273\1\u0287\1\u026b\1\uffff\1\u026b\1\u026c\3\u026b"+
            "\1\u0287\2\u026b\1\u0287\3\u026b\1\u0287\3\u026b\1\uffff\1\u026b"+
            "\1\u0284\1\u026b\1\u0287\2\u026b\1\uffff\1\u026b\1\uffff\1\u026b"+
            "\2\uffff\1\u026b\1\u0286\2\u026b\1\uffff\1\u0287\1\u0280\1\u027a"+
            "\1\u0287\4\u026b\1\u0284\1\u0281\1\uffff\2\u0287\2\u026b\1\uffff"+
            "\1\u0287\1\uffff\1\u026b\2\u0287\1\u0284\1\uffff\2\u026b\1\u0283"+
            "\2\u0287\2\u026b\1\u0287\3\u026b\1\u0287\1\u0284\1\u0287\1\u027e"+
            "\2\u0287\3\u026b\1\uffff\4\u026b\2\u0287\1\uffff\1\u026b\1\u0287"+
            "\3\u026b\1\u0287\5\u026b\1\uffff\1\u0285\5\u026b\1\uffff\2\u026b"+
            "\1\uffff\1\u026b\1\u0287\2\u026b\1\u026d\1\u026b\1\u027b\1\u026b"+
            "\1\u0287\1\u026b\2\uffff\1\u026b\1\uffff\3\u0287\2\u026b\1\uffff"+
            "\2\u026b\1\uffff\1\u0287\2\u026b\1\u0287\1\u026b\3\uffff\1\u026b"+
            "\1\u0287\1\u026b\1\u0287\2\u026b\1\u0287\1\u026b\1\u0287\3\u026b"+
            "\1\uffff\2\u0287\10\u026b\1\u0287\1\u026b\2\u0287\2\u026b\1"+
            "\uffff\3\u0287\3\u026b\1\uffff\4\u026b\1\u0287\5\u026b\1\u0284"+
            "\4\u026b\1\uffff\6\u026b\1\u0287\1\u026b\1\uffff\3\u026b\1\uffff"+
            "\1\u0272\1\u026b\1\u0287\3\u026b\1\uffff\1\u0287\1\u0274\1\u0287"+
            "\1\u026b\1\uffff\1\u026b\1\u0287\1\u026b\1\uffff\3\u026b\1\u0287"+
            "\2\u026b\2\u0287\3\u026b\1\u0287\1\u026b\1\uffff\3\u026b\2\uffff"+
            "\1\u026b\1\uffff\1\u0287\3\u026b\3\uffff\1\u027d\2\uffff\1\u026e"+
            "\2\uffff\1\u026f\1\u026e\7\uffff\1\u0269\1\u0276\1\u0270\1\u026e"+
            "\1\u0277\41\uffff\1\u026b\46\uffff\1\u026b\61\uffff\1\u026b"+
            "\3\uffff\1\u026b\61\uffff\1\u026b\3\uffff\1\u026b\27\uffff\1"+
            "\u026b\4\uffff\1\u026b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0297\6\uffff\1\u029b\1\uffff\1\u0288\2\uffff\1\u029a\7"+
            "\uffff\1\u028c\4\u028d\1\u0289\1\u02a9\1\u028d\1\uffff\1\u028d"+
            "\1\u029e\1\u02a9\1\u028d\1\u02a9\2\u028d\1\u02a9\3\u02a6\1\u02a9"+
            "\2\u028d\1\u02a9\2\u028d\1\u02a4\1\u02a1\1\u028d\1\uffff\4\u028d"+
            "\1\uffff\2\u028d\1\uffff\4\u028d\1\uffff\1\u02a9\1\u028d\1\u02a9"+
            "\1\uffff\1\u02a9\1\uffff\1\u0293\1\u0295\1\u02a9\1\u028d\1\uffff"+
            "\1\u028d\1\u028e\3\u028d\1\u02a9\2\u028d\1\u02a9\3\u028d\1\u02a9"+
            "\3\u028d\1\u028a\1\u028d\1\u02a6\1\u028d\1\u02a9\2\u028d\1\uffff"+
            "\1\u028d\1\uffff\1\u028d\2\uffff\1\u028d\1\u02a8\2\u028d\1\uffff"+
            "\1\u02a9\1\u02a2\1\u029c\1\u02a9\4\u028d\1\u02a6\1\u02a3\1\uffff"+
            "\2\u02a9\2\u028d\1\uffff\1\u02a9\1\uffff\1\u028d\2\u02a9\1\u02a6"+
            "\1\uffff\2\u028d\1\u02a5\2\u02a9\2\u028d\1\u02a9\3\u028d\1\u02a9"+
            "\1\u02a6\1\u02a9\1\u02a0\2\u02a9\3\u028d\1\uffff\4\u028d\2\u02a9"+
            "\1\uffff\1\u028d\1\u02a9\3\u028d\1\u02a9\5\u028d\1\uffff\1\u02a7"+
            "\5\u028d\1\uffff\2\u028d\1\uffff\1\u028d\1\u02a9\2\u028d\1\u028f"+
            "\1\u028d\1\u029d\1\u028d\1\u02a9\1\u028d\2\uffff\1\u028d\1\uffff"+
            "\3\u02a9\2\u028d\1\uffff\2\u028d\1\uffff\1\u02a9\2\u028d\1\u02a9"+
            "\1\u028d\3\uffff\1\u028d\1\u02a9\1\u028d\1\u02a9\2\u028d\1\u02a9"+
            "\1\u028d\1\u02a9\3\u028d\1\uffff\2\u02a9\10\u028d\1\u02a9\1"+
            "\u028d\2\u02a9\2\u028d\1\uffff\3\u02a9\3\u028d\1\uffff\4\u028d"+
            "\1\u02a9\5\u028d\1\u02a6\4\u028d\1\uffff\6\u028d\1\u02a9\1\u028d"+
            "\1\uffff\3\u028d\1\uffff\1\u0294\1\u028d\1\u02a9\3\u028d\1\u02aa"+
            "\1\u02a9\1\u0296\1\u02a9\1\u028d\1\uffff\1\u028d\1\u02a9\1\u028d"+
            "\1\uffff\3\u028d\1\u02a9\2\u028d\2\u02a9\3\u028d\1\u02a9\1\u028d"+
            "\1\uffff\3\u028d\2\uffff\1\u028d\1\uffff\1\u02a9\3\u028d\3\uffff"+
            "\1\u029f\2\uffff\1\u0290\2\uffff\1\u0291\1\u0290\7\uffff\1\u028b"+
            "\1\u0298\1\u0292\1\u0290\1\u0299\41\uffff\1\u028d\46\uffff\1"+
            "\u028d\61\uffff\1\u028d\3\uffff\1\u028d\61\uffff\1\u028d\3\uffff"+
            "\1\u028d\27\uffff\1\u028d\4\uffff\1\u028d",
            "\1\u02b7\6\uffff\1\u02bb\4\uffff\1\u02ba\7\uffff\1\u02ac\4"+
            "\u02ad\2\u02c9\1\u02ad\1\uffff\1\u02ad\1\u02be\1\u02c9\1\u02ad"+
            "\1\u02c9\2\u02ad\1\u02c9\3\u02c6\1\u02c9\2\u02ad\1\u02c9\2\u02ad"+
            "\1\u02c4\1\u02c1\1\u02ad\1\uffff\4\u02ad\1\uffff\2\u02ad\1\uffff"+
            "\4\u02ad\1\uffff\1\u02c9\1\u02ad\1\u02c9\1\uffff\1\u02c9\1\uffff"+
            "\1\u02b3\1\u02b5\1\u02c9\1\u02ad\1\uffff\1\u02ad\1\u02ae\3\u02ad"+
            "\1\u02c9\2\u02ad\1\u02c9\3\u02ad\1\u02c9\3\u02ad\1\uffff\1\u02ad"+
            "\1\u02c6\1\u02ad\1\u02c9\2\u02ad\1\uffff\1\u02ad\1\uffff\1\u02ad"+
            "\2\uffff\1\u02ad\1\u02c8\2\u02ad\1\uffff\1\u02c9\1\u02c2\1\u02bc"+
            "\1\u02c9\4\u02ad\1\u02c6\1\u02c3\1\uffff\2\u02c9\2\u02ad\1\uffff"+
            "\1\u02c9\1\uffff\1\u02ad\2\u02c9\1\u02c6\1\uffff\2\u02ad\1\u02c5"+
            "\2\u02c9\2\u02ad\1\u02c9\3\u02ad\1\u02c9\1\u02c6\1\u02c9\1\u02c0"+
            "\2\u02c9\3\u02ad\1\uffff\4\u02ad\2\u02c9\1\uffff\1\u02ad\1\u02c9"+
            "\3\u02ad\1\u02c9\5\u02ad\1\uffff\1\u02c7\5\u02ad\1\uffff\2\u02ad"+
            "\1\uffff\1\u02ad\1\u02c9\2\u02ad\1\u02af\1\u02ad\1\u02bd\1\u02ad"+
            "\1\u02c9\1\u02ad\2\uffff\1\u02ad\1\uffff\3\u02c9\2\u02ad\1\uffff"+
            "\2\u02ad\1\uffff\1\u02c9\2\u02ad\1\u02c9\1\u02ad\3\uffff\1\u02ad"+
            "\1\u02c9\1\u02ad\1\u02c9\2\u02ad\1\u02c9\1\u02ad\1\u02c9\3\u02ad"+
            "\1\uffff\2\u02c9\10\u02ad\1\u02c9\1\u02ad\2\u02c9\2\u02ad\1"+
            "\uffff\3\u02c9\3\u02ad\1\uffff\4\u02ad\1\u02c9\5\u02ad\1\u02c6"+
            "\4\u02ad\1\uffff\6\u02ad\1\u02c9\1\u02ad\1\uffff\3\u02ad\1\uffff"+
            "\1\u02b4\1\u02ad\1\u02c9\3\u02ad\1\uffff\1\u02c9\1\u02b6\1\u02c9"+
            "\1\u02ad\1\uffff\1\u02ad\1\u02c9\1\u02ad\1\uffff\3\u02ad\1\u02c9"+
            "\2\u02ad\2\u02c9\3\u02ad\1\u02c9\1\u02ad\1\uffff\3\u02ad\2\uffff"+
            "\1\u02ad\1\uffff\1\u02c9\3\u02ad\3\uffff\1\u02bf\2\uffff\1\u02b0"+
            "\2\uffff\1\u02b1\1\u02b0\7\uffff\1\u02ab\1\u02b8\1\u02b2\1\u02b0"+
            "\1\u02b9\41\uffff\1\u02ad\46\uffff\1\u02ad\61\uffff\1\u02ad"+
            "\3\uffff\1\u02ad\61\uffff\1\u02ad\3\uffff\1\u02ad\27\uffff\1"+
            "\u02ad\4\uffff\1\u02ad",
            "\1\u02d6\6\uffff\1\u02da\4\uffff\1\u02d9\7\uffff\1\u02cb\4"+
            "\u02cc\2\u02e8\1\u02cc\1\uffff\1\u02cc\1\u02dd\1\u02e8\1\u02cc"+
            "\1\u02e8\2\u02cc\1\u02e8\3\u02e5\1\u02e8\2\u02cc\1\u02e8\2\u02cc"+
            "\1\u02e3\1\u02e0\1\u02cc\1\uffff\4\u02cc\1\uffff\2\u02cc\1\uffff"+
            "\4\u02cc\1\uffff\1\u02e8\1\u02cc\1\u02e8\1\uffff\1\u02e8\1\uffff"+
            "\1\u02d2\1\u02d4\1\u02e8\1\u02cc\1\uffff\1\u02cc\1\u02cd\3\u02cc"+
            "\1\u02e8\2\u02cc\1\u02e8\3\u02cc\1\u02e8\3\u02cc\1\uffff\1\u02cc"+
            "\1\u02e5\1\u02cc\1\u02e8\2\u02cc\1\uffff\1\u02cc\1\uffff\1\u02cc"+
            "\2\uffff\1\u02cc\1\u02e7\2\u02cc\1\uffff\1\u02e8\1\u02e1\1\u02db"+
            "\1\u02e8\4\u02cc\1\u02e5\1\u02e2\1\uffff\2\u02e8\2\u02cc\1\uffff"+
            "\1\u02e8\1\uffff\1\u02cc\2\u02e8\1\u02e5\1\uffff\2\u02cc\1\u02e4"+
            "\2\u02e8\2\u02cc\1\u02e8\3\u02cc\1\u02e8\1\u02e5\1\u02e8\1\u02df"+
            "\2\u02e8\3\u02cc\1\uffff\4\u02cc\2\u02e8\1\uffff\1\u02cc\1\u02e8"+
            "\3\u02cc\1\u02e8\5\u02cc\1\uffff\1\u02e6\5\u02cc\1\uffff\2\u02cc"+
            "\1\uffff\1\u02cc\1\u02e8\2\u02cc\1\u02ce\1\u02cc\1\u02dc\1\u02cc"+
            "\1\u02e8\1\u02cc\2\uffff\1\u02cc\1\uffff\3\u02e8\2\u02cc\1\uffff"+
            "\2\u02cc\1\uffff\1\u02e8\2\u02cc\1\u02e8\1\u02cc\3\uffff\1\u02cc"+
            "\1\u02e8\1\u02cc\1\u02e8\2\u02cc\1\u02e8\1\u02cc\1\u02e8\3\u02cc"+
            "\1\uffff\2\u02e8\10\u02cc\1\u02e8\1\u02cc\2\u02e8\2\u02cc\1"+
            "\uffff\3\u02e8\3\u02cc\1\uffff\4\u02cc\1\u02e8\5\u02cc\1\u02e5"+
            "\4\u02cc\1\uffff\6\u02cc\1\u02e8\1\u02cc\1\uffff\3\u02cc\1\uffff"+
            "\1\u02d3\1\u02cc\1\u02e8\3\u02cc\1\uffff\1\u02e8\1\u02d5\1\u02e8"+
            "\1\u02cc\1\uffff\1\u02cc\1\u02e8\1\u02cc\1\uffff\3\u02cc\1\u02e8"+
            "\2\u02cc\2\u02e8\3\u02cc\1\u02e8\1\u02cc\1\uffff\3\u02cc\2\uffff"+
            "\1\u02cc\1\uffff\1\u02e8\3\u02cc\3\uffff\1\u02de\2\uffff\1\u02cf"+
            "\2\uffff\1\u02d0\1\u02cf\7\uffff\1\u02ca\1\u02d7\1\u02d1\1\u02cf"+
            "\1\u02d8\41\uffff\1\u02cc\46\uffff\1\u02cc\61\uffff\1\u02cc"+
            "\3\uffff\1\u02cc\61\uffff\1\u02cc\3\uffff\1\u02cc\27\uffff\1"+
            "\u02cc\4\uffff\1\u02cc",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\uffff"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "206:64: ( ( KW_AS )? alias= identifier )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_127 = input.LA(1);

                         
                        int index32_127 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_127);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_159 = input.LA(1);

                         
                        int index32_159 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_159);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_190 = input.LA(1);

                         
                        int index32_190 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_190);

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_221 = input.LA(1);

                         
                        int index32_221 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_221);

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_551 = input.LA(1);

                         
                        int index32_551 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_551);

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_552 = input.LA(1);

                         
                        int index32_552 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_552);

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_553 = input.LA(1);

                         
                        int index32_553 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_553);

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_554 = input.LA(1);

                         
                        int index32_554 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_554);

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_555 = input.LA(1);

                         
                        int index32_555 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_555);

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_556 = input.LA(1);

                         
                        int index32_556 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_556);

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_557 = input.LA(1);

                         
                        int index32_557 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_557);

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_558 = input.LA(1);

                         
                        int index32_558 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_558);

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_559 = input.LA(1);

                         
                        int index32_559 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_559);

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA32_560 = input.LA(1);

                         
                        int index32_560 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_560);

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA32_561 = input.LA(1);

                         
                        int index32_561 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_561);

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA32_562 = input.LA(1);

                         
                        int index32_562 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_562);

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA32_563 = input.LA(1);

                         
                        int index32_563 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_563);

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA32_564 = input.LA(1);

                         
                        int index32_564 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_564);

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA32_565 = input.LA(1);

                         
                        int index32_565 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_565);

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA32_566 = input.LA(1);

                         
                        int index32_566 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_566);

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA32_567 = input.LA(1);

                         
                        int index32_567 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_567);

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA32_568 = input.LA(1);

                         
                        int index32_568 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_568);

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA32_569 = input.LA(1);

                         
                        int index32_569 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_569);

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA32_570 = input.LA(1);

                         
                        int index32_570 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_570);

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA32_571 = input.LA(1);

                         
                        int index32_571 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_571);

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA32_572 = input.LA(1);

                         
                        int index32_572 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_572);

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA32_573 = input.LA(1);

                         
                        int index32_573 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_573);

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA32_574 = input.LA(1);

                         
                        int index32_574 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_574);

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA32_575 = input.LA(1);

                         
                        int index32_575 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_575);

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA32_576 = input.LA(1);

                         
                        int index32_576 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_576);

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA32_577 = input.LA(1);

                         
                        int index32_577 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_577);

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA32_578 = input.LA(1);

                         
                        int index32_578 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_578);

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA32_579 = input.LA(1);

                         
                        int index32_579 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_579);

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA32_580 = input.LA(1);

                         
                        int index32_580 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_580);

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA32_581 = input.LA(1);

                         
                        int index32_581 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_581);

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA32_582 = input.LA(1);

                         
                        int index32_582 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_582);

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA32_583 = input.LA(1);

                         
                        int index32_583 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_583);

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA32_584 = input.LA(1);

                         
                        int index32_584 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_584);

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA32_585 = input.LA(1);

                         
                        int index32_585 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_585);

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA32_586 = input.LA(1);

                         
                        int index32_586 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_586);

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA32_587 = input.LA(1);

                         
                        int index32_587 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_587);

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA32_588 = input.LA(1);

                         
                        int index32_588 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_588);

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA32_589 = input.LA(1);

                         
                        int index32_589 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_589);

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA32_590 = input.LA(1);

                         
                        int index32_590 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_590);

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA32_591 = input.LA(1);

                         
                        int index32_591 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_591);

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA32_592 = input.LA(1);

                         
                        int index32_592 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_592);

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA32_593 = input.LA(1);

                         
                        int index32_593 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_593);

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA32_594 = input.LA(1);

                         
                        int index32_594 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_594);

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA32_595 = input.LA(1);

                         
                        int index32_595 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_595);

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA32_596 = input.LA(1);

                         
                        int index32_596 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_596);

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA32_597 = input.LA(1);

                         
                        int index32_597 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_597);

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA32_598 = input.LA(1);

                         
                        int index32_598 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_598);

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA32_599 = input.LA(1);

                         
                        int index32_599 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_599);

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA32_600 = input.LA(1);

                         
                        int index32_600 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_600);

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA32_601 = input.LA(1);

                         
                        int index32_601 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_601);

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA32_602 = input.LA(1);

                         
                        int index32_602 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_602);

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA32_603 = input.LA(1);

                         
                        int index32_603 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_603);

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA32_604 = input.LA(1);

                         
                        int index32_604 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_604);

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA32_605 = input.LA(1);

                         
                        int index32_605 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_605);

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA32_606 = input.LA(1);

                         
                        int index32_606 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_606);

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA32_607 = input.LA(1);

                         
                        int index32_607 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_607);

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA32_608 = input.LA(1);

                         
                        int index32_608 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_608);

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA32_609 = input.LA(1);

                         
                        int index32_609 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_609);

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA32_610 = input.LA(1);

                         
                        int index32_610 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_610);

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA32_611 = input.LA(1);

                         
                        int index32_611 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_611);

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA32_612 = input.LA(1);

                         
                        int index32_612 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_612);

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA32_613 = input.LA(1);

                         
                        int index32_613 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_613);

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA32_614 = input.LA(1);

                         
                        int index32_614 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_614);

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA32_615 = input.LA(1);

                         
                        int index32_615 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_615);

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA32_616 = input.LA(1);

                         
                        int index32_616 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_616);

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA32_617 = input.LA(1);

                         
                        int index32_617 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_617);

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA32_618 = input.LA(1);

                         
                        int index32_618 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_618);

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA32_619 = input.LA(1);

                         
                        int index32_619 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_619);

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA32_620 = input.LA(1);

                         
                        int index32_620 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_620);

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA32_621 = input.LA(1);

                         
                        int index32_621 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_621);

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA32_622 = input.LA(1);

                         
                        int index32_622 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_622);

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA32_623 = input.LA(1);

                         
                        int index32_623 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_623);

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA32_624 = input.LA(1);

                         
                        int index32_624 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_624);

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA32_625 = input.LA(1);

                         
                        int index32_625 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_625);

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA32_626 = input.LA(1);

                         
                        int index32_626 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_626);

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA32_627 = input.LA(1);

                         
                        int index32_627 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_627);

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA32_628 = input.LA(1);

                         
                        int index32_628 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_628);

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA32_629 = input.LA(1);

                         
                        int index32_629 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_629);

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA32_630 = input.LA(1);

                         
                        int index32_630 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_630);

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA32_631 = input.LA(1);

                         
                        int index32_631 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_631);

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA32_632 = input.LA(1);

                         
                        int index32_632 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_632);

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA32_633 = input.LA(1);

                         
                        int index32_633 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_633);

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA32_634 = input.LA(1);

                         
                        int index32_634 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_634);

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA32_635 = input.LA(1);

                         
                        int index32_635 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_635);

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA32_636 = input.LA(1);

                         
                        int index32_636 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_636);

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA32_637 = input.LA(1);

                         
                        int index32_637 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_637);

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA32_638 = input.LA(1);

                         
                        int index32_638 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_638);

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA32_639 = input.LA(1);

                         
                        int index32_639 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_639);

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA32_640 = input.LA(1);

                         
                        int index32_640 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_640);

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA32_641 = input.LA(1);

                         
                        int index32_641 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_641);

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA32_642 = input.LA(1);

                         
                        int index32_642 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_642);

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA32_643 = input.LA(1);

                         
                        int index32_643 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_643);

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA32_644 = input.LA(1);

                         
                        int index32_644 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_644);

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA32_645 = input.LA(1);

                         
                        int index32_645 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_645);

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA32_646 = input.LA(1);

                         
                        int index32_646 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_646);

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA32_647 = input.LA(1);

                         
                        int index32_647 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_647);

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA32_648 = input.LA(1);

                         
                        int index32_648 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_648);

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA32_649 = input.LA(1);

                         
                        int index32_649 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_649);

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA32_650 = input.LA(1);

                         
                        int index32_650 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_650);

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA32_651 = input.LA(1);

                         
                        int index32_651 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_651);

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA32_652 = input.LA(1);

                         
                        int index32_652 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_652);

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA32_653 = input.LA(1);

                         
                        int index32_653 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_653);

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA32_654 = input.LA(1);

                         
                        int index32_654 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_654);

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA32_655 = input.LA(1);

                         
                        int index32_655 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_655);

                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA32_656 = input.LA(1);

                         
                        int index32_656 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_656);

                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA32_657 = input.LA(1);

                         
                        int index32_657 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_657);

                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA32_658 = input.LA(1);

                         
                        int index32_658 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_658);

                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA32_659 = input.LA(1);

                         
                        int index32_659 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_659);

                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA32_660 = input.LA(1);

                         
                        int index32_660 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_660);

                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA32_661 = input.LA(1);

                         
                        int index32_661 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_661);

                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA32_662 = input.LA(1);

                         
                        int index32_662 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_662);

                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA32_663 = input.LA(1);

                         
                        int index32_663 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_663);

                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA32_664 = input.LA(1);

                         
                        int index32_664 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_664);

                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA32_665 = input.LA(1);

                         
                        int index32_665 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_665);

                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA32_666 = input.LA(1);

                         
                        int index32_666 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_666);

                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA32_667 = input.LA(1);

                         
                        int index32_667 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_667);

                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA32_668 = input.LA(1);

                         
                        int index32_668 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_668);

                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA32_669 = input.LA(1);

                         
                        int index32_669 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_669);

                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA32_670 = input.LA(1);

                         
                        int index32_670 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_670);

                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA32_671 = input.LA(1);

                         
                        int index32_671 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_671);

                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA32_672 = input.LA(1);

                         
                        int index32_672 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_672);

                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA32_673 = input.LA(1);

                         
                        int index32_673 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_673);

                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA32_674 = input.LA(1);

                         
                        int index32_674 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_674);

                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA32_675 = input.LA(1);

                         
                        int index32_675 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_675);

                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA32_676 = input.LA(1);

                         
                        int index32_676 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_676);

                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA32_677 = input.LA(1);

                         
                        int index32_677 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_677);

                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA32_678 = input.LA(1);

                         
                        int index32_678 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_678);

                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA32_679 = input.LA(1);

                         
                        int index32_679 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_679);

                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA32_680 = input.LA(1);

                         
                        int index32_680 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_680);

                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA32_681 = input.LA(1);

                         
                        int index32_681 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_681);

                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA32_682 = input.LA(1);

                         
                        int index32_682 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_682);

                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA32_683 = input.LA(1);

                         
                        int index32_683 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_683);

                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA32_684 = input.LA(1);

                         
                        int index32_684 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_684);

                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA32_685 = input.LA(1);

                         
                        int index32_685 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_685);

                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA32_686 = input.LA(1);

                         
                        int index32_686 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_686);

                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA32_687 = input.LA(1);

                         
                        int index32_687 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_687);

                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA32_688 = input.LA(1);

                         
                        int index32_688 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_688);

                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA32_689 = input.LA(1);

                         
                        int index32_689 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_689);

                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA32_690 = input.LA(1);

                         
                        int index32_690 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_690);

                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA32_691 = input.LA(1);

                         
                        int index32_691 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_691);

                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA32_692 = input.LA(1);

                         
                        int index32_692 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_692);

                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA32_693 = input.LA(1);

                         
                        int index32_693 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_693);

                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA32_694 = input.LA(1);

                         
                        int index32_694 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_694);

                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA32_695 = input.LA(1);

                         
                        int index32_695 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_695);

                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA32_696 = input.LA(1);

                         
                        int index32_696 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_696);

                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        int LA32_697 = input.LA(1);

                         
                        int index32_697 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_697);

                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        int LA32_698 = input.LA(1);

                         
                        int index32_698 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_698);

                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        int LA32_699 = input.LA(1);

                         
                        int index32_699 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_699);

                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        int LA32_700 = input.LA(1);

                         
                        int index32_700 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_700);

                        if ( s>=0 ) return s;
                        break;
                    case 154 : 
                        int LA32_701 = input.LA(1);

                         
                        int index32_701 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_701);

                        if ( s>=0 ) return s;
                        break;
                    case 155 : 
                        int LA32_702 = input.LA(1);

                         
                        int index32_702 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_702);

                        if ( s>=0 ) return s;
                        break;
                    case 156 : 
                        int LA32_703 = input.LA(1);

                         
                        int index32_703 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_703);

                        if ( s>=0 ) return s;
                        break;
                    case 157 : 
                        int LA32_704 = input.LA(1);

                         
                        int index32_704 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_704);

                        if ( s>=0 ) return s;
                        break;
                    case 158 : 
                        int LA32_705 = input.LA(1);

                         
                        int index32_705 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_705);

                        if ( s>=0 ) return s;
                        break;
                    case 159 : 
                        int LA32_706 = input.LA(1);

                         
                        int index32_706 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_706);

                        if ( s>=0 ) return s;
                        break;
                    case 160 : 
                        int LA32_707 = input.LA(1);

                         
                        int index32_707 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_707);

                        if ( s>=0 ) return s;
                        break;
                    case 161 : 
                        int LA32_708 = input.LA(1);

                         
                        int index32_708 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_708);

                        if ( s>=0 ) return s;
                        break;
                    case 162 : 
                        int LA32_709 = input.LA(1);

                         
                        int index32_709 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_709);

                        if ( s>=0 ) return s;
                        break;
                    case 163 : 
                        int LA32_710 = input.LA(1);

                         
                        int index32_710 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_710);

                        if ( s>=0 ) return s;
                        break;
                    case 164 : 
                        int LA32_711 = input.LA(1);

                         
                        int index32_711 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_711);

                        if ( s>=0 ) return s;
                        break;
                    case 165 : 
                        int LA32_712 = input.LA(1);

                         
                        int index32_712 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_712);

                        if ( s>=0 ) return s;
                        break;
                    case 166 : 
                        int LA32_713 = input.LA(1);

                         
                        int index32_713 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_713);

                        if ( s>=0 ) return s;
                        break;
                    case 167 : 
                        int LA32_714 = input.LA(1);

                         
                        int index32_714 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_714);

                        if ( s>=0 ) return s;
                        break;
                    case 168 : 
                        int LA32_715 = input.LA(1);

                         
                        int index32_715 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_715);

                        if ( s>=0 ) return s;
                        break;
                    case 169 : 
                        int LA32_716 = input.LA(1);

                         
                        int index32_716 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_716);

                        if ( s>=0 ) return s;
                        break;
                    case 170 : 
                        int LA32_717 = input.LA(1);

                         
                        int index32_717 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_717);

                        if ( s>=0 ) return s;
                        break;
                    case 171 : 
                        int LA32_718 = input.LA(1);

                         
                        int index32_718 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_718);

                        if ( s>=0 ) return s;
                        break;
                    case 172 : 
                        int LA32_719 = input.LA(1);

                         
                        int index32_719 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_719);

                        if ( s>=0 ) return s;
                        break;
                    case 173 : 
                        int LA32_720 = input.LA(1);

                         
                        int index32_720 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_720);

                        if ( s>=0 ) return s;
                        break;
                    case 174 : 
                        int LA32_721 = input.LA(1);

                         
                        int index32_721 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_721);

                        if ( s>=0 ) return s;
                        break;
                    case 175 : 
                        int LA32_722 = input.LA(1);

                         
                        int index32_722 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_722);

                        if ( s>=0 ) return s;
                        break;
                    case 176 : 
                        int LA32_723 = input.LA(1);

                         
                        int index32_723 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_723);

                        if ( s>=0 ) return s;
                        break;
                    case 177 : 
                        int LA32_724 = input.LA(1);

                         
                        int index32_724 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_724);

                        if ( s>=0 ) return s;
                        break;
                    case 178 : 
                        int LA32_725 = input.LA(1);

                         
                        int index32_725 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_725);

                        if ( s>=0 ) return s;
                        break;
                    case 179 : 
                        int LA32_726 = input.LA(1);

                         
                        int index32_726 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_726);

                        if ( s>=0 ) return s;
                        break;
                    case 180 : 
                        int LA32_727 = input.LA(1);

                         
                        int index32_727 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_727);

                        if ( s>=0 ) return s;
                        break;
                    case 181 : 
                        int LA32_728 = input.LA(1);

                         
                        int index32_728 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_728);

                        if ( s>=0 ) return s;
                        break;
                    case 182 : 
                        int LA32_729 = input.LA(1);

                         
                        int index32_729 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_729);

                        if ( s>=0 ) return s;
                        break;
                    case 183 : 
                        int LA32_730 = input.LA(1);

                         
                        int index32_730 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_730);

                        if ( s>=0 ) return s;
                        break;
                    case 184 : 
                        int LA32_731 = input.LA(1);

                         
                        int index32_731 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_731);

                        if ( s>=0 ) return s;
                        break;
                    case 185 : 
                        int LA32_732 = input.LA(1);

                         
                        int index32_732 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_732);

                        if ( s>=0 ) return s;
                        break;
                    case 186 : 
                        int LA32_733 = input.LA(1);

                         
                        int index32_733 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_733);

                        if ( s>=0 ) return s;
                        break;
                    case 187 : 
                        int LA32_734 = input.LA(1);

                         
                        int index32_734 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_734);

                        if ( s>=0 ) return s;
                        break;
                    case 188 : 
                        int LA32_735 = input.LA(1);

                         
                        int index32_735 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_735);

                        if ( s>=0 ) return s;
                        break;
                    case 189 : 
                        int LA32_736 = input.LA(1);

                         
                        int index32_736 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_736);

                        if ( s>=0 ) return s;
                        break;
                    case 190 : 
                        int LA32_737 = input.LA(1);

                         
                        int index32_737 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_737);

                        if ( s>=0 ) return s;
                        break;
                    case 191 : 
                        int LA32_738 = input.LA(1);

                         
                        int index32_738 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_738);

                        if ( s>=0 ) return s;
                        break;
                    case 192 : 
                        int LA32_739 = input.LA(1);

                         
                        int index32_739 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_739);

                        if ( s>=0 ) return s;
                        break;
                    case 193 : 
                        int LA32_740 = input.LA(1);

                         
                        int index32_740 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_740);

                        if ( s>=0 ) return s;
                        break;
                    case 194 : 
                        int LA32_741 = input.LA(1);

                         
                        int index32_741 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_741);

                        if ( s>=0 ) return s;
                        break;
                    case 195 : 
                        int LA32_742 = input.LA(1);

                         
                        int index32_742 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_742);

                        if ( s>=0 ) return s;
                        break;
                    case 196 : 
                        int LA32_743 = input.LA(1);

                         
                        int index32_743 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_743);

                        if ( s>=0 ) return s;
                        break;
                    case 197 : 
                        int LA32_744 = input.LA(1);

                         
                        int index32_744 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index32_744);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA31_eotS =
        "\u021a\uffff";
    static final String DFA31_eofS =
        "\1\uffff\1\2\3\uffff\4\41\1\uffff\1\41\2\uffff\3\41\1\uffff\1\41"+
        "\4\uffff\1\41\2\uffff\2\41\2\uffff\4\41\u01f9\uffff";
    static final String DFA31_minS =
        "\1\33\1\12\3\uffff\4\12\1\uffff\1\12\2\uffff\3\12\1\uffff\1\12\4"+
        "\uffff\1\12\2\uffff\2\12\2\uffff\4\12\141\uffff\1\0\37\uffff\1\0"+
        "\36\uffff\1\0\36\uffff\1\0\147\uffff\3\0\36\uffff\3\0\u00ae\uffff";
    static final String DFA31_maxS =
        "\2\u022e\3\uffff\4\u0154\1\uffff\1\u0154\2\uffff\3\u0154\1\uffff"+
        "\1\u0154\4\uffff\1\u0154\2\uffff\2\u0154\2\uffff\4\u0154\141\uffff"+
        "\1\0\37\uffff\1\0\36\uffff\1\0\36\uffff\1\0\147\uffff\3\0\36\uffff"+
        "\3\0\u00ae\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\36\uffff\1\1\u01f8\uffff";
    static final String DFA31_specialS =
        "\u0082\uffff\1\0\37\uffff\1\1\36\uffff\1\2\36\uffff\1\3\147\uffff"+
        "\1\4\1\5\1\6\36\uffff\1\7\1\10\1\11\u00ae\uffff}>";
    static final String[] DFA31_transitionS = {
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
            "\1\2\20\uffff\1\5\7\41\1\uffff\21\41\2\uffff\1\41\1\uffff\1"+
            "\6\3\41\1\uffff\2\41\1\uffff\4\41\1\uffff\3\41\1\2\1\41\1\uffff"+
            "\4\41\1\uffff\20\41\1\uffff\1\36\5\41\1\uffff\1\41\1\uffff\1"+
            "\41\1\2\1\uffff\4\41\1\uffff\1\41\1\uffff\7\41\2\uffff\4\41"+
            "\1\uffff\1\16\1\uffff\2\41\1\21\1\41\1\2\2\41\1\uffff\4\41\1"+
            "\10\3\41\1\17\1\41\1\31\1\uffff\5\41\1\2\4\41\1\7\1\12\1\uffff"+
            "\2\41\1\40\10\41\1\uffff\1\2\5\41\1\2\2\41\1\uffff\4\41\1\uffff"+
            "\5\41\1\2\1\uffff\1\41\1\uffff\1\32\4\41\1\uffff\2\41\1\uffff"+
            "\1\35\4\41\3\uffff\14\41\1\2\14\41\1\15\3\41\1\uffff\6\41\1"+
            "\2\14\41\1\37\2\41\1\uffff\10\41\1\uffff\3\41\1\uffff\6\41\1"+
            "\uffff\4\41\1\uffff\1\41\1\26\1\41\1\uffff\15\41\1\uffff\3\41"+
            "\1\uffff\1\2\1\41\1\2\4\41\16\uffff\1\2\51\uffff\1\41\46\uffff"+
            "\1\41\61\uffff\1\41\3\uffff\1\41\61\uffff\1\41\3\uffff\1\41"+
            "\27\uffff\1\41\4\uffff\1\41",
            "",
            "",
            "",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4\uffff\2"+
            "\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41\3"+
            "\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41\12\uffff"+
            "\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff\1\41"+
            "\7\uffff\1\2\12\uffff\1\41",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4\uffff\2"+
            "\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41\3"+
            "\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41\12\uffff"+
            "\1\41\14\uffff\1\41\35\uffff\1\41\20\uffff\1\2\3\uffff\1\41"+
            "\1\uffff\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\u0082\4\uffff"+
            "\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41"+
            "\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41\12\uffff"+
            "\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff\1\41"+
            "\22\uffff\1\41",
            "",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\u00a2\4\uffff"+
            "\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41"+
            "\3\uffff\1\41\1\uffff\1\2\6\uffff\1\41\23\uffff\1\41\14\uffff"+
            "\1\41\12\uffff\1\41\1\2\13\uffff\1\41\35\uffff\1\41\24\uffff"+
            "\1\41\1\uffff\1\41\22\uffff\1\41",
            "",
            "",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\u00c1\4\uffff"+
            "\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41"+
            "\3\uffff\1\41\1\uffff\1\2\6\uffff\1\41\23\uffff\1\41\14\uffff"+
            "\1\41\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41"+
            "\1\uffff\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\u00e0\4\uffff"+
            "\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41"+
            "\3\uffff\1\41\1\uffff\1\2\6\uffff\1\41\23\uffff\1\41\14\uffff"+
            "\1\41\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41"+
            "\1\uffff\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\1\uffff\1\2\4\uffff\1"+
            "\41\4\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15"+
            "\uffff\1\41\3\uffff\1\41\5\uffff\1\2\2\uffff\1\41\23\uffff\1"+
            "\41\14\uffff\1\41\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41"+
            "\24\uffff\1\41\1\uffff\1\41\22\uffff\1\41",
            "",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "",
            "",
            "",
            "",
            "\1\41\20\uffff\1\41\4\uffff\1\2\30\uffff\1\41\17\uffff\1\41"+
            "\27\uffff\1\2\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41"+
            "\1\uffff\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff"+
            "\1\41\4\uffff\2\41\3\uffff\1\41\11\uffff\1\u0149\5\uffff\1\41"+
            "\15\uffff\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\u014a\14"+
            "\uffff\1\41\12\uffff\1\u0148\14\uffff\1\41\35\uffff\1\41\24"+
            "\uffff\1\41\1\uffff\1\41\7\uffff\1\2\12\uffff\1\41",
            "",
            "",
            "\1\41\20\uffff\1\41\4\uffff\1\2\30\uffff\1\41\17\uffff\1\41"+
            "\27\uffff\1\2\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41"+
            "\1\uffff\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff"+
            "\1\41\4\uffff\2\41\3\uffff\1\41\11\uffff\1\u016a\5\uffff\1\41"+
            "\15\uffff\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\u016b\14"+
            "\uffff\1\41\12\uffff\1\u0169\14\uffff\1\41\35\uffff\1\41\24"+
            "\uffff\1\41\1\uffff\1\41\7\uffff\1\2\12\uffff\1\41",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "",
            "",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4\uffff\2"+
            "\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41\3"+
            "\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41\12\uffff"+
            "\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff\1\41"+
            "\15\uffff\1\2\4\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "206:65: ( KW_AS )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_130 = input.LA(1);

                         
                        int index31_130 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index31_130);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_162 = input.LA(1);

                         
                        int index31_162 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index31_162);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_193 = input.LA(1);

                         
                        int index31_193 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index31_193);

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_224 = input.LA(1);

                         
                        int index31_224 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index31_224);

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_328 = input.LA(1);

                         
                        int index31_328 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index31_328);

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_329 = input.LA(1);

                         
                        int index31_329 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index31_329);

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_330 = input.LA(1);

                         
                        int index31_330 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index31_330);

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_361 = input.LA(1);

                         
                        int index31_361 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index31_361);

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_362 = input.LA(1);

                         
                        int index31_362 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index31_362);

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_363 = input.LA(1);

                         
                        int index31_363 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index31_363);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA36_eotS =
        "\u00f1\uffff";
    static final String DFA36_eofS =
        "\1\uffff\3\5\u00ed\uffff";
    static final String DFA36_minS =
        "\1\33\3\12\1\33\112\uffff\1\33\112\uffff\1\33\126\uffff";
    static final String DFA36_maxS =
        "\5\u022e\112\uffff\1\u022e\112\uffff\1\u022e\126\uffff";
    static final String DFA36_acceptS =
        "\5\uffff\1\2\u00e0\uffff\1\1\12\uffff";
    static final String DFA36_specialS =
        "\u00f1\uffff}>";
    static final String[] DFA36_transitionS = {
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
            "\1\5\7\uffff\1\4\10\uffff\10\5\1\uffff\21\5\2\uffff\1\5\1\uffff"+
            "\4\5\1\uffff\2\5\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5\1\uffff"+
            "\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\7\5\1\uffff\1\5\1\uffff"+
            "\7\5\2\uffff\6\5\1\uffff\23\5\1\uffff\14\5\1\uffff\13\5\1\uffff"+
            "\11\5\1\uffff\13\5\1\uffff\1\5\1\uffff\5\5\1\uffff\2\5\1\uffff"+
            "\5\5\3\uffff\35\5\1\uffff\26\5\1\uffff\14\5\1\uffff\6\5\1\uffff"+
            "\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff\7\5\3\uffff"+
            "\1\5\12\uffff\1\5\51\uffff\1\5\46\uffff\1\5\61\uffff\1\5\3\uffff"+
            "\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff\1\5\4\uffff\1\5",
            "\1\5\7\uffff\1\117\10\uffff\10\5\1\uffff\21\5\2\uffff\1\5\1"+
            "\uffff\4\5\1\uffff\2\5\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5\1"+
            "\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\7\5\1\uffff\1\5"+
            "\1\uffff\7\5\2\uffff\6\5\1\uffff\23\5\1\uffff\14\5\1\uffff\13"+
            "\5\1\uffff\11\5\1\uffff\13\5\1\uffff\1\5\1\uffff\5\5\1\uffff"+
            "\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff\26\5\1\uffff\14\5\1\uffff"+
            "\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff"+
            "\7\5\3\uffff\1\5\12\uffff\1\5\51\uffff\1\5\46\uffff\1\5\61\uffff"+
            "\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff\1\5\4\uffff"+
            "\1\5",
            "\1\5\7\uffff\1\u009a\10\uffff\10\5\1\uffff\21\5\2\uffff\1\5"+
            "\1\uffff\4\5\1\uffff\2\5\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5"+
            "\1\uffff\20\5\1\uffff\6\5\1\uffff\1\5\1\uffff\7\5\1\uffff\1"+
            "\5\1\uffff\7\5\2\uffff\6\5\1\uffff\23\5\1\uffff\14\5\1\uffff"+
            "\13\5\1\uffff\11\5\1\uffff\13\5\1\uffff\1\5\1\uffff\5\5\1\uffff"+
            "\2\5\1\uffff\5\5\3\uffff\35\5\1\uffff\26\5\1\uffff\14\5\1\uffff"+
            "\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff\3\5\1\uffff"+
            "\7\5\3\uffff\1\5\12\uffff\1\5\51\uffff\1\5\46\uffff\1\5\61\uffff"+
            "\1\5\3\uffff\1\5\61\uffff\1\5\3\uffff\1\5\27\uffff\1\5\4\uffff"+
            "\1\5",
            "\10\u00e6\1\uffff\21\u00e6\2\uffff\1\u00e6\1\uffff\4\u00e6"+
            "\1\uffff\2\u00e6\1\uffff\4\u00e6\1\uffff\3\u00e6\1\uffff\1\u00e6"+
            "\1\uffff\4\u00e6\1\uffff\20\u00e6\1\uffff\6\u00e6\1\uffff\1"+
            "\u00e6\1\uffff\1\u00e6\2\uffff\4\u00e6\1\uffff\1\u00e6\1\uffff"+
            "\7\u00e6\2\uffff\4\u00e6\1\uffff\1\u00e6\1\uffff\4\u00e6\1\uffff"+
            "\2\u00e6\1\uffff\13\u00e6\1\uffff\5\u00e6\1\uffff\6\u00e6\1"+
            "\uffff\13\u00e6\2\uffff\5\u00e6\1\uffff\2\u00e6\1\uffff\4\u00e6"+
            "\1\uffff\5\u00e6\2\uffff\1\u00e6\1\uffff\5\u00e6\1\uffff\2\u00e6"+
            "\1\uffff\5\u00e6\3\uffff\14\u00e6\1\uffff\20\u00e6\1\uffff\6"+
            "\u00e6\1\uffff\17\u00e6\1\uffff\10\u00e6\1\uffff\3\u00e6\1\uffff"+
            "\6\u00e6\1\uffff\4\u00e6\1\uffff\3\u00e6\1\uffff\15\u00e6\1"+
            "\uffff\3\u00e6\2\uffff\1\u00e6\1\uffff\4\u00e6\22\uffff\1\5"+
            "\45\uffff\1\u00e6\46\uffff\1\u00e6\61\uffff\1\u00e6\3\uffff"+
            "\1\u00e6\61\uffff\1\u00e6\3\uffff\1\u00e6\27\uffff\1\u00e6\4"+
            "\uffff\1\u00e6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\10\u00e6\1\uffff\21\u00e6\2\uffff\1\u00e6\1\uffff\4\u00e6"+
            "\1\uffff\2\u00e6\1\uffff\4\u00e6\1\uffff\3\u00e6\1\uffff\1\u00e6"+
            "\1\uffff\4\u00e6\1\uffff\20\u00e6\1\uffff\6\u00e6\1\uffff\1"+
            "\u00e6\1\uffff\1\u00e6\2\uffff\4\u00e6\1\uffff\1\u00e6\1\uffff"+
            "\7\u00e6\2\uffff\4\u00e6\1\uffff\1\u00e6\1\uffff\4\u00e6\1\uffff"+
            "\2\u00e6\1\uffff\13\u00e6\1\uffff\5\u00e6\1\uffff\6\u00e6\1"+
            "\uffff\13\u00e6\2\uffff\5\u00e6\1\uffff\2\u00e6\1\uffff\4\u00e6"+
            "\1\uffff\5\u00e6\2\uffff\1\u00e6\1\uffff\5\u00e6\1\uffff\2\u00e6"+
            "\1\uffff\5\u00e6\3\uffff\14\u00e6\1\uffff\20\u00e6\1\uffff\6"+
            "\u00e6\1\uffff\17\u00e6\1\uffff\10\u00e6\1\uffff\3\u00e6\1\uffff"+
            "\6\u00e6\1\uffff\4\u00e6\1\uffff\3\u00e6\1\uffff\15\u00e6\1"+
            "\uffff\3\u00e6\2\uffff\1\u00e6\1\uffff\4\u00e6\22\uffff\1\5"+
            "\45\uffff\1\u00e6\46\uffff\1\u00e6\61\uffff\1\u00e6\3\uffff"+
            "\1\u00e6\61\uffff\1\u00e6\3\uffff\1\u00e6\27\uffff\1\u00e6\4"+
            "\uffff\1\u00e6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\10\u00e6\1\uffff\21\u00e6\2\uffff\1\u00e6\1\uffff\4\u00e6"+
            "\1\uffff\2\u00e6\1\uffff\4\u00e6\1\uffff\3\u00e6\1\uffff\1\u00e6"+
            "\1\uffff\4\u00e6\1\uffff\20\u00e6\1\uffff\6\u00e6\1\uffff\1"+
            "\u00e6\1\uffff\1\u00e6\2\uffff\4\u00e6\1\uffff\1\u00e6\1\uffff"+
            "\7\u00e6\2\uffff\4\u00e6\1\uffff\1\u00e6\1\uffff\4\u00e6\1\uffff"+
            "\2\u00e6\1\uffff\13\u00e6\1\uffff\5\u00e6\1\uffff\6\u00e6\1"+
            "\uffff\13\u00e6\2\uffff\5\u00e6\1\uffff\2\u00e6\1\uffff\4\u00e6"+
            "\1\uffff\5\u00e6\2\uffff\1\u00e6\1\uffff\5\u00e6\1\uffff\2\u00e6"+
            "\1\uffff\5\u00e6\3\uffff\14\u00e6\1\uffff\20\u00e6\1\uffff\6"+
            "\u00e6\1\uffff\17\u00e6\1\uffff\10\u00e6\1\uffff\3\u00e6\1\uffff"+
            "\6\u00e6\1\uffff\4\u00e6\1\uffff\3\u00e6\1\uffff\15\u00e6\1"+
            "\uffff\3\u00e6\2\uffff\1\u00e6\1\uffff\4\u00e6\22\uffff\1\5"+
            "\45\uffff\1\u00e6\46\uffff\1\u00e6\61\uffff\1\u00e6\3\uffff"+
            "\1\u00e6\61\uffff\1\u00e6\3\uffff\1\u00e6\27\uffff\1\u00e6\4"+
            "\uffff\1\u00e6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "217:1: tableName : (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) );";
        }
    }
    static final String DFA38_eotS =
        "\u021a\uffff";
    static final String DFA38_eofS =
        "\1\uffff\1\2\3\uffff\4\41\1\uffff\1\41\2\uffff\3\41\1\uffff\1\41"+
        "\4\uffff\1\41\2\uffff\2\41\2\uffff\4\41\u01f9\uffff";
    static final String DFA38_minS =
        "\1\33\1\12\3\uffff\4\12\1\uffff\1\12\2\uffff\3\12\1\uffff\1\12\4"+
        "\uffff\1\12\2\uffff\2\12\2\uffff\4\12\141\uffff\1\0\37\uffff\1\0"+
        "\36\uffff\1\0\36\uffff\1\0\147\uffff\3\0\36\uffff\3\0\u00ae\uffff";
    static final String DFA38_maxS =
        "\2\u022e\3\uffff\4\u0154\1\uffff\1\u0154\2\uffff\3\u0154\1\uffff"+
        "\1\u0154\4\uffff\1\u0154\2\uffff\2\u0154\2\uffff\4\u0154\141\uffff"+
        "\1\0\37\uffff\1\0\36\uffff\1\0\36\uffff\1\0\147\uffff\3\0\36\uffff"+
        "\3\0\u00ae\uffff";
    static final String DFA38_acceptS =
        "\2\uffff\1\2\36\uffff\1\1\u01f8\uffff";
    static final String DFA38_specialS =
        "\u0082\uffff\1\0\37\uffff\1\1\36\uffff\1\2\36\uffff\1\3\147\uffff"+
        "\1\4\1\5\1\6\36\uffff\1\7\1\10\1\11\u00ae\uffff}>";
    static final String[] DFA38_transitionS = {
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
            "\1\2\20\uffff\1\5\7\41\1\uffff\21\41\2\uffff\1\41\1\uffff\1"+
            "\6\3\41\1\uffff\2\41\1\uffff\4\41\1\uffff\3\41\1\2\1\41\1\uffff"+
            "\4\41\1\uffff\20\41\1\uffff\1\36\5\41\1\uffff\1\41\1\uffff\1"+
            "\41\1\2\1\uffff\4\41\1\uffff\1\41\1\uffff\7\41\2\uffff\4\41"+
            "\1\uffff\1\16\1\uffff\2\41\1\21\1\41\1\2\2\41\1\uffff\4\41\1"+
            "\10\3\41\1\17\1\41\1\31\1\uffff\5\41\1\2\4\41\1\7\1\12\1\uffff"+
            "\2\41\1\40\10\41\1\uffff\1\2\5\41\1\2\2\41\1\uffff\4\41\1\uffff"+
            "\5\41\1\2\1\uffff\1\41\1\uffff\1\32\4\41\1\uffff\2\41\1\uffff"+
            "\1\35\4\41\3\uffff\14\41\1\2\14\41\1\15\3\41\1\uffff\6\41\1"+
            "\2\14\41\1\37\2\41\1\uffff\10\41\1\uffff\3\41\1\uffff\6\41\1"+
            "\uffff\4\41\1\uffff\1\41\1\26\1\41\1\uffff\15\41\1\uffff\3\41"+
            "\1\uffff\1\2\1\41\1\2\4\41\16\uffff\1\2\51\uffff\1\41\46\uffff"+
            "\1\41\61\uffff\1\41\3\uffff\1\41\61\uffff\1\41\3\uffff\1\41"+
            "\27\uffff\1\41\4\uffff\1\41",
            "",
            "",
            "",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4\uffff\2"+
            "\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41\3"+
            "\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41\12\uffff"+
            "\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff\1\41"+
            "\7\uffff\1\2\12\uffff\1\41",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4\uffff\2"+
            "\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41\3"+
            "\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41\12\uffff"+
            "\1\41\14\uffff\1\41\35\uffff\1\41\20\uffff\1\2\3\uffff\1\41"+
            "\1\uffff\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\u0082\4\uffff"+
            "\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41"+
            "\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41\12\uffff"+
            "\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff\1\41"+
            "\22\uffff\1\41",
            "",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\u00a2\4\uffff"+
            "\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41"+
            "\3\uffff\1\41\1\uffff\1\2\6\uffff\1\41\23\uffff\1\41\14\uffff"+
            "\1\41\12\uffff\1\41\1\2\13\uffff\1\41\35\uffff\1\41\24\uffff"+
            "\1\41\1\uffff\1\41\22\uffff\1\41",
            "",
            "",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\u00c1\4\uffff"+
            "\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41"+
            "\3\uffff\1\41\1\uffff\1\2\6\uffff\1\41\23\uffff\1\41\14\uffff"+
            "\1\41\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41"+
            "\1\uffff\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\u00e0\4\uffff"+
            "\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41"+
            "\3\uffff\1\41\1\uffff\1\2\6\uffff\1\41\23\uffff\1\41\14\uffff"+
            "\1\41\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41"+
            "\1\uffff\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\1\uffff\1\2\4\uffff\1"+
            "\41\4\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15"+
            "\uffff\1\41\3\uffff\1\41\5\uffff\1\2\2\uffff\1\41\23\uffff\1"+
            "\41\14\uffff\1\41\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41"+
            "\24\uffff\1\41\1\uffff\1\41\22\uffff\1\41",
            "",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "",
            "",
            "",
            "",
            "\1\41\20\uffff\1\41\4\uffff\1\2\30\uffff\1\41\17\uffff\1\41"+
            "\27\uffff\1\2\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41"+
            "\1\uffff\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff"+
            "\1\41\4\uffff\2\41\3\uffff\1\41\11\uffff\1\u0149\5\uffff\1\41"+
            "\15\uffff\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\u014a\14"+
            "\uffff\1\41\12\uffff\1\u0148\14\uffff\1\41\35\uffff\1\41\24"+
            "\uffff\1\41\1\uffff\1\41\7\uffff\1\2\12\uffff\1\41",
            "",
            "",
            "\1\41\20\uffff\1\41\4\uffff\1\2\30\uffff\1\41\17\uffff\1\41"+
            "\27\uffff\1\2\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41"+
            "\1\uffff\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff"+
            "\1\41\4\uffff\2\41\3\uffff\1\41\11\uffff\1\u016a\5\uffff\1\41"+
            "\15\uffff\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\u016b\14"+
            "\uffff\1\41\12\uffff\1\u0169\14\uffff\1\41\35\uffff\1\41\24"+
            "\uffff\1\41\1\uffff\1\41\7\uffff\1\2\12\uffff\1\41",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "",
            "",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\26\uffff\1\2\6\uffff\1\41\17\uffff\1\41"+
            "\30\uffff\1\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff"+
            "\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4"+
            "\uffff\2\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff"+
            "\1\41\3\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41"+
            "\12\uffff\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff"+
            "\1\41\22\uffff\1\41",
            "\1\41\20\uffff\1\41\35\uffff\1\41\17\uffff\1\41\30\uffff\1"+
            "\41\11\uffff\1\41\26\uffff\1\41\3\uffff\1\41\1\uffff\1\41\7"+
            "\uffff\1\41\3\uffff\1\41\1\uffff\1\41\6\uffff\1\41\4\uffff\2"+
            "\41\3\uffff\1\41\11\uffff\1\41\5\uffff\1\41\15\uffff\1\41\3"+
            "\uffff\1\41\10\uffff\1\41\23\uffff\1\41\14\uffff\1\41\12\uffff"+
            "\1\41\14\uffff\1\41\35\uffff\1\41\24\uffff\1\41\1\uffff\1\41"+
            "\15\uffff\1\2\4\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "240:44: ( KW_AS )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_130 = input.LA(1);

                         
                        int index38_130 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index38_130);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_162 = input.LA(1);

                         
                        int index38_162 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index38_162);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_193 = input.LA(1);

                         
                        int index38_193 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index38_193);

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_224 = input.LA(1);

                         
                        int index38_224 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index38_224);

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_328 = input.LA(1);

                         
                        int index38_328 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index38_328);

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_329 = input.LA(1);

                         
                        int index38_329 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index38_329);

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_330 = input.LA(1);

                         
                        int index38_330 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index38_330);

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA38_361 = input.LA(1);

                         
                        int index38_361 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index38_361);

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA38_362 = input.LA(1);

                         
                        int index38_362 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index38_362);

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA38_363 = input.LA(1);

                         
                        int index38_363 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 33;}

                        else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}

                         
                        input.seek(index38_363);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA46_eotS =
        "\76\uffff";
    static final String DFA46_eofS =
        "\1\2\1\50\74\uffff";
    static final String DFA46_minS =
        "\2\12\74\uffff";
    static final String DFA46_maxS =
        "\2\u0154\74\uffff";
    static final String DFA46_acceptS =
        "\2\uffff\1\2\35\uffff\36\1";
    static final String DFA46_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\2\20\uffff\1\1\35\uffff\1\2\17\uffff\1\2\30\uffff\1\2\11"+
            "\uffff\1\2\26\uffff\1\2\3\uffff\1\2\1\uffff\1\2\7\uffff\1\2"+
            "\3\uffff\1\2\1\uffff\1\2\6\uffff\1\2\4\uffff\2\2\3\uffff\1\2"+
            "\11\uffff\1\2\5\uffff\1\2\15\uffff\1\2\3\uffff\1\2\10\uffff"+
            "\1\2\23\uffff\1\2\14\uffff\1\2\12\uffff\1\2\14\uffff\1\2\35"+
            "\uffff\1\2\24\uffff\1\2\1\uffff\1\2\22\uffff\1\2",
            "\1\43\20\uffff\1\75\35\uffff\1\66\17\uffff\1\44\30\uffff\1"+
            "\67\11\uffff\1\63\26\uffff\1\47\3\uffff\1\56\1\uffff\1\57\7"+
            "\uffff\1\42\3\uffff\1\51\1\uffff\1\62\6\uffff\1\41\4\uffff\1"+
            "\40\1\45\3\uffff\1\71\11\uffff\1\53\5\uffff\1\64\15\uffff\1"+
            "\73\3\uffff\1\65\10\uffff\1\74\23\uffff\1\54\14\uffff\1\46\12"+
            "\uffff\1\52\14\uffff\1\70\35\uffff\1\61\24\uffff\1\55\1\uffff"+
            "\1\60\7\uffff\1\2\12\uffff\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "271:27: ( ( Identifier )=>alias= Identifier )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_1 = input.LA(1);

                         
                        int index46_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA46_1==LPAREN) ) {s = 2;}

                        else if ( (LA46_1==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 32;}

                        else if ( (LA46_1==KW_JOIN) && (synpred9_FromClauseParser())) {s = 33;}

                        else if ( (LA46_1==KW_INNER) && (synpred9_FromClauseParser())) {s = 34;}

                        else if ( (LA46_1==COMMA) && (synpred9_FromClauseParser())) {s = 35;}

                        else if ( (LA46_1==KW_CROSS) && (synpred9_FromClauseParser())) {s = 36;}

                        else if ( (LA46_1==KW_LEFT) && (synpred9_FromClauseParser())) {s = 37;}

                        else if ( (LA46_1==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 38;}

                        else if ( (LA46_1==KW_FULL) && (synpred9_FromClauseParser())) {s = 39;}

                        else if ( (LA46_1==EOF) && (synpred9_FromClauseParser())) {s = 40;}

                        else if ( (LA46_1==KW_INSERT) && (synpred9_FromClauseParser())) {s = 41;}

                        else if ( (LA46_1==KW_SELECT) && (synpred9_FromClauseParser())) {s = 42;}

                        else if ( (LA46_1==KW_MAP) && (synpred9_FromClauseParser())) {s = 43;}

                        else if ( (LA46_1==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 44;}

                        else if ( (LA46_1==KW_WHERE) && (synpred9_FromClauseParser())) {s = 45;}

                        else if ( (LA46_1==KW_GROUP) && (synpred9_FromClauseParser())) {s = 46;}

                        else if ( (LA46_1==KW_HAVING) && (synpred9_FromClauseParser())) {s = 47;}

                        else if ( (LA46_1==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 48;}

                        else if ( (LA46_1==KW_UNION) && (synpred9_FromClauseParser())) {s = 49;}

                        else if ( (LA46_1==KW_INTERSECT) && (synpred9_FromClauseParser())) {s = 50;}

                        else if ( (LA46_1==KW_EXCEPT) && (synpred9_FromClauseParser())) {s = 51;}

                        else if ( (LA46_1==KW_MINUS) && (synpred9_FromClauseParser())) {s = 52;}

                        else if ( (LA46_1==KW_ORDER) && (synpred9_FromClauseParser())) {s = 53;}

                        else if ( (LA46_1==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 54;}

                        else if ( (LA46_1==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 55;}

                        else if ( (LA46_1==KW_SORT) && (synpred9_FromClauseParser())) {s = 56;}

                        else if ( (LA46_1==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 57;}

                        else if ( (LA46_1==RPAREN) && (synpred9_FromClauseParser())) {s = 58;}

                        else if ( (LA46_1==KW_ON) && (synpred9_FromClauseParser())) {s = 59;}

                        else if ( (LA46_1==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 60;}

                        else if ( (LA46_1==Identifier) && (synpred9_FromClauseParser())) {s = 61;}

                         
                        input.seek(index46_1);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_STAR_in_tableAllColumns57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_tableAllColumns79 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DOT_in_tableAllColumns81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STAR_in_tableAllColumns83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_tableOrColumn131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList170 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_expressionList173 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001E01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_expression_in_expressionList175 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_identifier_in_aliasList217 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_aliasList220 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_aliasList222 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_FROM_in_fromClause266 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFFEF7EEFF7FFFL,0x400000000000023DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_fromSource_in_fromClause268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_virtualTableSource_in_fromSource313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uniqueJoinToken_in_fromSource326 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FFCFB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_uniqueJoinSource_in_fromSource329 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_fromSource332 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FFCFB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_uniqueJoinSource_in_fromSource335 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_joinSource_in_fromSource349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableSource_in_atomjoinSource381 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_lateralView_in_atomjoinSource384 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_subQuerySource_in_atomjoinSource405 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_lateralView_in_atomjoinSource408 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_partitionedTableFunction_in_atomjoinSource423 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_lateralView_in_atomjoinSource426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_atomjoinSource441 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000023DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_joinSource_in_atomjoinSource444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_atomjoinSource446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomjoinSource_in_joinSource468 = new BitSet(new long[]{0x0000000000000402L,0x0000000000000200L,0x0000001040020008L,0x0010000000000000L});
    public static final BitSet FOLLOW_joinToken_in_joinSource471 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000023DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_joinSourcePart_in_joinSource474 = new BitSet(new long[]{0x0000000000000402L,0x0000000000000200L,0x0000001040020008L,0x0010000000000040L});
    public static final BitSet FOLLOW_KW_ON_in_joinSource477 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001E01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_expression_in_joinSource480 = new BitSet(new long[]{0x0000000000000402L,0x0000000000000200L,0x0000001040020008L,0x0010000000000000L});
    public static final BitSet FOLLOW_tableSource_in_joinSourcePart519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_subQuerySource_in_joinSourcePart523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_partitionedTableFunction_in_joinSourcePart527 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_lateralView_in_joinSourcePart531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_KW_PRESERVE_in_uniqueJoinSource561 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_uniqueJoinTableSource_in_uniqueJoinSource564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_uniqueJoinExpr_in_uniqueJoinSource566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_uniqueJoinExpr593 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001E01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_expressionList_in_uniqueJoinExpr596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_uniqueJoinExpr598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_INNER_in_joinToken691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_joinToken717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CROSS_in_joinToken752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LEFT_in_joinToken778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RIGHT_in_joinToken798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FULL_in_joinToken817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LEFT_in_joinToken837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KW_SEMI_in_joinToken839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LATERAL_in_lateralView885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KW_VIEW_in_lateralView887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KW_OUTER_in_lateralView889 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6FDFFDFBEFFFDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_function_in_lateralView891 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_tableAlias_in_lateralView893 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_KW_AS_in_lateralView896 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_lateralView898 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_lateralView906 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_lateralView908 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_LATERAL_in_lateralView940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KW_VIEW_in_lateralView942 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6FDFFDFBEFFFDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_function_in_lateralView944 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_tableAlias_in_lateralView946 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_KW_AS_in_lateralView949 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_lateralView951 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_lateralView959 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_lateralView961 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_identifier_in_tableAlias1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TABLESAMPLE_in_tableBucketSample1054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_tableBucketSample1056 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_KW_BUCKET_in_tableBucketSample1058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_Number_in_tableBucketSample1063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KW_OUT_in_tableBucketSample1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KW_OF_in_tableBucketSample1068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_Number_in_tableBucketSample1073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_KW_ON_in_tableBucketSample1077 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001E01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_expression_in_tableBucketSample1081 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_tableBucketSample1084 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001E01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_expression_in_tableBucketSample1088 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_tableBucketSample1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_splitSample1143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_Number_in_splitSample1149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000400000L});
    public static final BitSet FOLLOW_KW_PERCENT_in_splitSample1155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_KW_ROWS_in_splitSample1157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_splitSample1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample1204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_splitSample1206 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ByteLengthLiteral_in_splitSample1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_splitSample1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableBucketSample_in_tableSample1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_splitSample_in_tableSample1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_tableSource1298 = new BitSet(new long[]{0xDE9FFFF7F8000002L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EFFF7FFFL,0x400000000000023DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_tableProperties_in_tableSource1302 = new BitSet(new long[]{0xDE9FFFF7F8000002L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EFFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_tableSample_in_tableSource1307 = new BitSet(new long[]{0xDE9FFFF7F8000002L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_KW_AS_in_tableSource1311 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_tableSource1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_uniqueJoinTableSource1372 = new BitSet(new long[]{0xDE9FFFF7F8000002L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EFFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_tableSample_in_uniqueJoinTableSource1376 = new BitSet(new long[]{0xDE9FFFF7F8000002L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_KW_AS_in_uniqueJoinTableSource1380 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_uniqueJoinTableSource1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_tableName1441 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DOT_in_tableName1443 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_tableName1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_tableName1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_viewName1524 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DOT_in_viewName1526 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_viewName1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_subQuerySource1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000200004L,0x8000008000000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_queryStatementExpression_in_subQuerySource1582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_subQuerySource1584 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_KW_AS_in_subQuerySource1586 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_subQuerySource1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partitionByClause_in_partitioningSpec1630 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distributeByClause_in_partitioningSpec1666 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_sortByClause_in_partitioningSpec1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sortByClause_in_partitioningSpec1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clusterByClause_in_partitioningSpec1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuerySource_in_partitionTableFunctionSource1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableSource_in_partitionTableFunctionSource1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KW_ON_in_partitionedTableFunction1788 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000023DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction1804 = new BitSet(new long[]{0x0200000008000000L,0x0000000400000000L,0x0000000000000000L,0x0000000000080400L,0x0000000000001000L,0x0000000000100000L});
    public static final BitSet FOLLOW_partitioningSpec_in_partitionedTableFunction1808 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1832 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001E01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_expression_in_partitionedTableFunction1834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1836 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_partitionedTableFunction1840 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1844 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001E01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_expression_in_partitionedTableFunction1846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1848 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1865 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHERE_in_whereClause1941 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001E01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_searchCondition_in_whereClause1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_searchCondition1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_valueRowConstructor2019 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000001E01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_precedenceUnaryPrefixExpression_in_valueRowConstructor2021 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_valueRowConstructor2024 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000001E01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_precedenceUnaryPrefixExpression_in_valueRowConstructor2026 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_valueRowConstructor2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueRowConstructor_in_valuesTableConstructor2070 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_valuesTableConstructor2073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_valueRowConstructor_in_valuesTableConstructor2075 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_VALUES_in_valuesClause2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_valuesTableConstructor_in_valuesClause2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_virtualTableSource2156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_valuesClause_in_virtualTableSource2158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_virtualTableSource2160 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_tableNameColList_in_virtualTableSource2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AS_in_tableNameColList2203 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_tableNameColList2206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_tableNameColList2208 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_tableNameColList2210 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_tableNameColList2213 = new BitSet(new long[]{0xDE9FFFF7F8000000L,0xCFEBCAFDFFFEF5DEL,0xF6F9FFDFBEFFEDEBL,0x7EFFFF7FF8FB7D3EL,0x3BFFEEF7EEFF7FFFL,0x400000000000003DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_identifier_in_tableNameColList2215 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_tableNameColList2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_virtualTableSource_in_synpred1_FromClauseParser308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuerySource_in_synpred2_FromClauseParser400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LATERAL_in_synpred3_FromClauseParser876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KW_VIEW_in_synpred3_FromClauseParser878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KW_OUTER_in_synpred3_FromClauseParser880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred4_FromClauseParser902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred5_FromClauseParser955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred7_FromClauseParser1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_synpred7_FromClauseParser1820 = new BitSet(new long[]{0xDEFFFFF7F8084080L,0xDFFBCAFDFFFEF5DEL,0xF6FDFFDFBFFFFDEBL,0x7EFFFF7FF8FB7D3FL,0x3BFFEEF7EEFF7FFFL,0x400000001E01923DL,0x0000002000000000L,0x0000000008800000L,0x0000420000022000L});
    public static final BitSet FOLLOW_expression_in_synpred7_FromClauseParser1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred7_FromClauseParser1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred9_FromClauseParser1871 = new BitSet(new long[]{0x0000000000000002L});

}