# Tables
---
```sql
mysql> SHOW TABLES;
+-------------------+
| Tables_in_unifind |
+-------------------+
| college           |
| contact           |
| course            |
| users             |
| admin             |
+-------------------+
```
# Attributes of Tables
---
## TABLE COLLEGE
```sql
-- This is a MySQL code for creating Table College
CREATE TABLE COLLEGE
(CID INT NOT NULL,
CNAME VARCHAR(100) NOT NULL,
LOCATION VARCHAR(100) NOT NULL,
SEATS INT NOT NULL,
STUDENROLL INT NOT NULL,
FEES DECIMAL(5) NOT NULL,
EXPENDITURE DECIMAL NOT NULL,
GRADRATE DECIMAL(10,5) NOT NULL,
RANKING INT NOT NULL,
SCHOLARSHIP VARCHAR(3) NOT NULL,
GRADE DECIMAL(10,5) NOT NULL,
PRIMARY KEY (CID));

-- OUTPUT:
mysql> SHOW COLUMNS FROM college;
+-------------+---------------+------+-----+---------+-------+
| Field       | Type          | Null | Key | Default | Extra |
+-------------+---------------+------+-----+---------+-------+
| CID         | int           | NO   | PRI | NULL    |       |
| CNAME       | varchar(100)  | NO   |     | NULL    |       |
| LOCATION    | varchar(100)  | NO   |     | NULL    |       |
| SEATS       | int           | NO   |     | NULL    |       |
| STUDENROLL  | int           | NO   |     | NULL    |       |
| FEES        | decimal(5,0)  | NO   |     | NULL    |       |
| EXPENDITURE | decimal(10,0) | NO   |     | NULL    |       |
| GRADRATE    | decimal(10,5) | NO   |     | NULL    |       |
| RANKING     | int           | NO   |     | NULL    |       |
| SCHOLARSHIP | varchar(3)    | NO   |     | NULL    |       |
| GRADE       | decimal(10,5) | NO   |     | NULL    |       |
+-------------+---------------+------+-----+---------+-------+
```
## TABLE COURSE
```sql
-- This is a MySQL code for creating Table Course
CREATE TABLE COURSE(
COID INT NOT NULL,
USID_FK INT NOT NULL,
CID_FK INT NOT NULL,
CONAME VARCHAR(100) NOT NULL,
CODURATION DECIMAL NOT NULL,
CREDIT INT NOT NULL,
PRIMARY KEY (COID),
FOREIGN KEY (CID_FK)REFERENCES COLLEGE(CID));

-- OUTPUT:
mysql> SHOW COLUMNS FROM course;
+------------+---------------+------+-----+---------+-------+
| Field      | Type          | Null | Key | Default | Extra |
+------------+---------------+------+-----+---------+-------+
| COID       | int           | NO   | PRI | NULL    |       |
| USID_FK    | int           | NO   |     | NULL    |       |
| CID_FK     | int           | NO   | MUL | NULL    |       |
| CONAME     | varchar(100)  | NO   |     | NULL    |       |
| CODURATION | decimal(10,0) | NO   |     | NULL    |       |
| CREDIT     | int           | NO   |     | NULL    |       |
+------------+---------------+------+-----+---------+-------+
```
## TABLE CONTACT
```sql
-- This is a MySQL code for creating Table Contact
CREATE TABLE CONTACT(
CID_FK INT NOT NULL,
CON1 BIGINT NOT NULL,
CON2 BIGINT NOT NULL,
FOREIGN KEY (CID_FK)REFERENCES COLLEGE(CID));

-- OUTPUT:
mysql> SHOW COLUMNS FROM contact;
+--------+--------+------+-----+---------+-------+
| Field  | Type   | Null | Key | Default | Extra |
+--------+--------+------+-----+---------+-------+
| CID_FK | int    | NO   | MUL | NULL    |       |
| CON1   | bigint | NO   |     | NULL    |       |
| CON2   | bigint | NO   |     | NULL    |       |
+--------+--------+------+-----+---------+-------+
```
## TABLE USERS
```sql
-- This is a MySQL code for creating Table Users
CREATE TABLE USERS(
USID INT NOT NULL AUTO_INCREMENT,
FULLNAME VARCHAR(40) NOT NULL,
EMAIL VARCHAR(40) NOT NULL,
DOB VARCHAR(10) NOT NULL,
GENDER VARCHAR(20) NOT NULL,
CONTACT BIGINT NOT NULL,
USNAME VARCHAR(20) NOT NULL,
USPASSWORD INT NOT NULL,
PRIMARY KEY (USID));

-- OUTPUT:
mysql> SHOW COLUMNS FROM users;
+------------+-------------+------+-----+---------+----------------+
| Field      | Type        | Null | Key | Default | Extra          |
+------------+-------------+------+-----+---------+----------------+
| USID       | int         | NO   | PRI | NULL    | auto_increment |
| FULLNAME   | varchar(40) | NO   |     | NULL    |                |
| EMAIL      | varchar(40) | NO   |     | NULL    |                |
| DOB        | varchar(10) | NO   |     | NULL    |                |
| GENDER     | varchar(20) | NO   |     | NULL    |                |
| CONTACT    | bigint      | NO   |     | NULL    |                |
| USNAME     | varchar(20) | NO   |     | NULL    |                |
| USPASSWORD | int         | NO   |     | NULL    |                |
+------------+-------------+------+-----+---------+----------------+
```
## TABLE ADMIN
```sql
-- This is a MySQL code for creating Table Users
CREATE TABLE ADMIN(
ADMID INT NOT NULL,
ADMNAME VARCHAR(20) NOT NULL,
ADMPASSWORD INT NOT NULL,
PRIMARY KEY (ADMID));

-- OUTPUT:
mysql> SHOW COLUMNS FROM admin;
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| ADMID       | int         | NO   | PRI | NULL    |       |
| ADMNAME     | varchar(20) | NO   |     | NULL    |       |
| ADMPASSWORD | int         | NO   |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
```

# Records of Tables
---
## TABLE COLLEGE
```sql
-- This is a MySQL code for inserting records into Table College
INSERT INTO COLLEGE VALUES (1,'HARVARD UNIVERSITY','USA',1232,721,3300,7041,100,1,'YES',10);
INSERT INTO COLLEGE VALUES (2,'Stanford University','USA',1924,512,6450,10527,98.66,2,'Yes',9.997);
INSERT INTO COLLEGE VALUES (3,'Massachusetts Institute of Technology','USA',1097,336,3750,8735,97.54,3,'Yes', 9.995);
INSERT INTO COLLEGE VALUES (4,'University of Cambridge','UK',349,137,5450,19016,96.81,1,'Yes', 9.89);
INSERT INTO COLLEGE VALUES (5,'University of Oxford','UK',146,55,4120,10922,96.46,2,'Yes',9.86);
INSERT INTO COLLEGE VALUES (6,'Columbia University','USA',479, 158,3335,9727,96.14,4,'Yes',9.86);
INSERT INTO COLLEGE VALUES (7,'University of California','USA',340,103,5720,8861,92.25,5,'Yes',9.76);
INSERT INTO COLLEGE VALUES (8,'University of Chicago','USA',1720,489,4826,11487,90.7,6,'Yes',9.69);
INSERT INTO COLLEGE VALUES (9,'Princeton University','USA',839,227,4400,11644,89.42,7,'Yes',9.55);
INSERT INTO COLLEGE VALUES (10,'Cornell University','USA',498,172,3380,8991,86.79,8,'Yes',9.54);
INSERT INTO COLLEGE VALUES (11,'Yale University','USA',1425,472,5406,10932,86.61,9,'Yes', 9.52);
INSERT INTO COLLEGE VALUES (12,'California Institute of Technology','USA',1900,484,4440,11711,84.4,10,'Yes',9.51);
INSERT INTO COLLEGE VALUES (13,'University of Pennsylvania','USA',780,290,4785,7940,77.6,11,'Yes',9.48);
INSERT INTO COLLEGE VALUES (14,'University of California-Los Angeles','USA',1080,385,4552,9305,76.91,12,'Yes',9.46);
INSERT INTO COLLEGE VALUES (15,'Johns Hopkins University','USA',313,157,3640,8127,71.6,13,'Yes',9.42);
INSERT INTO COLLEGE VALUES (16,'New York University','USA',1093,	220,4780,7355,68.39,14,	'Yes',9.42);
INSERT INTO COLLEGE VALUES (17,'University of Michigan-Ann Arbor','USA',992,418,5300,21424,68.36,15,'Yes',9.40);
INSERT INTO COLLEGE VALUES (18,'University of California-San Diego','USA',908,423,3520,7994,66.59,16,'Yes',9.39);
INSERT INTO COLLEGE VALUES (19,'Northwestern University','USA',704,322,3090,10908,66.56, 17,'Yes',9.36);
INSERT INTO COLLEGE VALUES (20,'University of Wisconsin-Madison','USA',2001,1016,3592,4010,64.51,18,'No',9.34);
INSERT INTO COLLEGE VALUES (21,'University of California-San Francisco','USA',661,252,3336,42926,63.69,19,'Yes',9.32);
INSERT INTO COLLEGE VALUES (22,'University College London','UK',4664,1910,2540,5854,62.27,3,'No',9.30);
INSERT INTO COLLEGE VALUES (23,'Duke University','USA',516,219,4124,6584,61.55,20,'Yes',9.30);
INSERT INTO COLLEGE VALUES (24,'Rockefeller University','USA',10308,3761,4850,4602,61.28,21,'No',9.29);
INSERT INTO COLLEGE VALUES (25,'University of Texas at Austin','USA',334,166,3922,14579,61.14,22,'Yes',9.26);    
INSERT INTO COLLEGE VALUES (26,'University of Washington - Seattle','USA',1729,951,2650,4739,60.61,23,'No',9.25);
INSERT INTO COLLEGE VALUES (27,'University of Toronto','Canada',1700,491,5920,7100,60.04,1,'Yes',9.23);
INSERT INTO COLLEGE VALUES (28,'University of Illinois at Urbana-Champaign','USA',6791,3070,3933,6642,59.94,24,'No',9.21);
INSERT INTO COLLEGE VALUES (29,'Imperial College London','UK',513,257,4372,7836,59.61,4,'Yes', 9.20);
INSERT INTO COLLEGE VALUES (30,'University of North Carolina at Chapel Hill','USA',798,295,4342,11361,57.09,25,'Yes',9.16);
INSERT INTO COLLEGE VALUES (31,'University of Virginia','USA',556,172,4135,6523,56.73,26,'Yes',9.14);
INSERT INTO COLLEGE VALUES (32,'McGill University','Canada',483,206,4100,6136,56.49,2,'Yes',9.12);
INSERT INTO COLLEGE VALUES (33,'Purdue University','USA',1366,662,4410,8086,56.39,27,'Yes',9.10);
INSERT INTO COLLEGE VALUES (34,'Dartmouth College','USA',192,111,4300,9337,56.35,28,'Yes',9.09);
INSERT INTO COLLEGE VALUES (35,'University of Pittsburgh - Pittsburgh Campus','USA',838,285,6206,13894,55.63,29,'Yes',9.06);
INSERT INTO COLLEGE VALUES (36,'Pennsylvania State University','USA',1402,531,8124,12580,55.54,30,'Yes',9.00);
INSERT INTO COLLEGE VALUES (37,'University of Minnesota, Twin Cities','USA',784,279,5360,9084,55.51,31,'Yes',8.95);
INSERT INTO COLLEGE VALUES (38,'Ohio State University, Columbus','USA',5349,2367,3920,7503,55.39,32,'Yes',8.93);
INSERT INTO COLLEGE VALUES (39,'Rutgers University-New Brunswick','USA',850,348,5400,8954,55.23,33,'Yes',8.91);
INSERT INTO COLLEGE VALUES (40,'University of Southern California','USA',707,308,2950,6668,55.12,34,'Yes',8.88);
INSERT INTO COLLEGE VALUES (41,'Washington University in St. Louis','USA',494,129,4850,7550,55.03,35,'Yes',8.85);
INSERT INTO COLLEGE VALUES (42,'University of California, Davis','USA',974,481,3664,7614,54.85,36,'Yes',8.83);
INSERT INTO COLLEGE VALUES (43,'University of Colorado Boulder','USA',923,284,3616,12957,54.62,37,'Yes',8.80);
INSERT INTO COLLEGE VALUES (44,'University of Edinburgh','UK',877,546,2700,3752,54.39,5,'Yes',8.77);
INSERT INTO COLLEGE VALUES (45,'University of Florida','USA',327,114,4100,16364,54.18,38,'Yes',8.74);
INSERT INTO COLLEGE VALUES (46,'Carnegie Mellon University','USA',2330,640,5510,10941,54,39,'No',8.74);
INSERT INTO COLLEGE VALUES (47,'University of British Columbia','Canada',1221,480,3940,10511,53.92,3,'Yes',8.71);
INSERT INTO COLLEGE VALUES (48,'University of California, Santa Barbara','USA',184,122,3580,8324,53.63,40,'Yes',8.70);
INSERT INTO COLLEGE VALUES (49,'Boston University','USA',384,104,2900,7623,53.43,41,'Yes',8.69);
INSERT INTO COLLEGE VALUES (50,'University of Manchester','UK',1150,542,3396,6817,53.38,6,'Yes',8.67);
INSERT INTO College VALUES(51,'University of Arizona','USA',588,287,4325,8649,53.26,42,'Yes',8.65);
INSERT INTO College VALUES(52,'Vanderbilt University','USA',336,156,2700,8377,53.05,43,'Yes',8.64);
INSERT INTO College VALUES(53,'University of Utah','USA',3028,1025,2948,7041,52.89,44,'Yes',8.61);
INSERT INTO College VALUES(54,'University of Maryland, College Park','USA',358,181,4350,6259,52.72,45,'Yes',8.59);
INSERT INTO College VALUES(55,'University of Texas Southwestern Medical Center','USA',514,209,3990,9073,52.5,46,'Yes',8.57);
INSERT INTO College VALUES(56,'Ruprecht Karl University of Heidelberg','Germany',13007,3810,6810,16836,52.32,1,'Yes',8.54);
INSERT INTO College VALUES(57,'University of Notre Dame','USA',1019,418,5885,20447,52.27,47,'No',8.53);
INSERT INTO College VALUES(58,'Ludwig Maximilian University of Munich','Germany',7333,3076,3352,6918,52.16,2,'Yes',8.51);
INSERT INTO College VALUES(59,'Georgia Institute of Technology','USA',330,151,6270,15387,52.08,48,'Yes',8.50);
INSERT INTO College VALUES(60,'University of Rochester','USA',3414,1061,4440,7671,52.03,49,'Yes',8.46);
INSERT INTO College VALUES(61,'Brown University','USA',2743,740,6750,17150,52.01,50,'Yes',8.44);
INSERT INTO College VALUES(62,'Emory University','USA',274,158,5879,5935,51.85,51,'No',8.41);
INSERT INTO College VALUES(63,'University of California','USA',1228,1202,2370,4900,51.51,52,'Yes',8.40);
INSERT INTO College VALUES(64,'University of Texas MD Anderson Cancer Center','USA',351,155,3597,8355,51.51,53,'Yes',8.37);
INSERT INTO College VALUES(65,'Kings College London','UK',673,292,4725,8655,51.31,7,'Yes',8.35);
INSERT INTO College VALUES(66,'Tufts University','USA',5402,4615,3580,7916,51.22,54,'Yes',8.34);
INSERT INTO College VALUES(67,'Arizona State University','USA',3239,1462,5926,20440,51.13,55,'Yes',8.31);
INSERT INTO College VALUES(68,'Technical University of Munich','Germany',810,313,6750,17449,50.58,3,'Yes',8.28);
INSERT INTO College VALUES(69,'Texas A&M University, College Station','USA',3813,862,4750,13675,50.43,56,'Yes',8.25);
INSERT INTO College VALUES(70,'Case Western Reserve University','USA',2037,700,4650,9511,50.28,57,'Yes',8.22);
INSERT INTO College VALUES(71,'Indiana University - Bloomington','USA',494,224,6250,7117,50.26,58,'Yes',8.17);
INSERT INTO College VALUES(72,'University of Alberta','Canada',604,213,4600,7922,50.25,4,'Yes',8.14);
INSERT INTO College VALUES(73,'Georgetown University','USA',247,247,5300,8985,49.92,59,'Yes',8.11);
INSERT INTO College VALUES(74,'Michigan State University','USA',3817,1650,4877,8453,49.74,60,'Yes',8.09);
INSERT INTO College VALUES(75,'Rice University','USA',3294,1483,4368,7268,49.73,61,'Yes',8.09);
INSERT INTO College VALUES(76,'Baylor College of Medicine','USA',1512,913,3710,7786,49.7,62,'Yes',8.07);
INSERT INTO College VALUES(77,'University of Bristol','UK',1339,657,2790,3739,49.59,8,'Yes',8.03);
INSERT INTO College VALUES(78,'University of Colorado Denver','USA',587,298,3070,5391,49.48,63,'Yes',8.01);
INSERT INTO College VALUES(79,'University of Glasgow','UK',2193,753,5340,7972,49.45,9,'No',7.99);
INSERT INTO College VALUES(80,'Western University','Canada',90,35,2812,7976,49.31,5,'No',7.97);
INSERT INTO College VALUES(81,'University of Miami','USA',1579,489,3957,17960,49.09,64,'Yes',7.97);
INSERT INTO College VALUES(82,'Stony Brook University','USA',5201,1191,5690,24386,49.09,65,'Yes',7.95);
INSERT INTO College VALUES(83,'University of Texas at Dallas','USA',991,352,3880,7666,49.05,66,'Yes',7.93);
INSERT INTO College VALUES(84,'University of Nottingham','UK',951,464,3150,6716,49.02,10,'Yes',7.91);
INSERT INTO College VALUES(85,'University of Iowa','USA',1427,434,3775,7364,49.01,67,'Yes',7.90);
INSERT INTO College VALUES(86,'Southern Methodist University','USA',3156,713,4730,19733,48.99,68,'Yes',7.88);
INSERT INTO College VALUES(87,'Icahn School of Medicine at Mount Sinai','USA',940,363,4690,6318,48.96,69,'Yes',7.87);
INSERT INTO College VALUES(88,'University of Alabama at Birmingham','USA',880,291,4100,8425,48.79,70,'Yes',7.85);
INSERT INTO College VALUES(89,'Free University of Berlin','Germany',1465,505,6408,12751,48.78,4,'Yes',7.81);
INSERT INTO College VALUES(90,'University of Southampton','UK',3433,527,4840,7697,48.77,11,'Yes',7.77);
INSERT INTO College VALUES(91,'McMaster University','Canada',607,198,5285,10961,48.74,6,'Yes',7.76);
INSERT INTO College VALUES(92,'University of Montreal','Canada',1090,616,4410,6897,48.72,7,'Yes',7.73);
INSERT INTO College VALUES(93,'University of Birmingham','UK',312,90,5400,9583,48.7,12,'No',7.71);
INSERT INTO College VALUES(94,'Humboldt University of Berlin','Germany',434,210,3490,9685,48.64,5,'Yes',7.68);
INSERT INTO College VALUES(95,'University of California, Santa Cruz','USA',396,203,6643,13025,48.59,71,'Yes',7.65);
INSERT INTO College VALUES(96,'Albert Ludwig University of Freiburg','Germany',1113,401,3660,8444,48.57,6,'Yes',7.62);
INSERT INTO College VALUES(97,'University of Tübingen','Germany',2532,902,4444,4900,48.56,7,'Yes',7.60);
INSERT INTO College VALUES(98,'University of Cincinnati','USA',4101,1436,3288,5501,48.56,72,'Yes',7.58);
INSERT INTO College VALUES(99,'University of Bonn','Germany',2011,1007,3603,6413,48.54,8,'Yes',7.57);
INSERT INTO College VALUES(100,'Wake Forest University','USA',146,88,3080,3365,48.52,73,'Yes', 7.54);

-- OUTPUT:
mysql> SELECT * FROM college;
+-----+-------------------------------------------------+----------+-------+------------+------+-------------+-----------+---------+-------------+----------+
| CID | CNAME                                           | LOCATION | SEATS | STUDENROLL | FEES | EXPENDITURE | GRADRATE  | RANKING | SCHOLARSHIP | GRADE    |
+-----+-------------------------------------------------+----------+-------+------------+------+-------------+-----------+---------+-------------+----------+
|   1 | HARVARD UNIVERSITY                              | USA      |  1232 |        721 | 3300 |        7041 | 100.00000 |       1 | YES         | 10.00000 |
|   2 | Stanford University                             | USA      |  1924 |        512 | 6450 |       10527 |  98.66000 |       2 | Yes         |  9.99700 |
|   3 | Massachusetts Institute of Technology           | USA      |  1097 |        336 | 3750 |        8735 |  97.54000 |       3 | Yes         |  9.99500 |
|   4 | University of Cambridge                         | UK       |   349 |        137 | 5450 |       19016 |  96.81000 |       1 | Yes         |  9.89000 |
|   5 | University of Oxford                            | UK       |   146 |         55 | 4120 |       10922 |  96.46000 |       2 | Yes         |  9.86000 |
|   6 | Columbia University                             | USA      |   479 |        158 | 3335 |        9727 |  96.14000 |       4 | Yes         |  9.86000 |
|   7 | University of California                        | USA      |   340 |        103 | 5720 |        8861 |  92.25000 |       5 | Yes         |  9.76000 |
|   8 | University of Chicago                           | USA      |  1720 |        489 | 4826 |       11487 |  90.70000 |       6 | Yes         |  9.69000 |
|   9 | Princeton University                            | USA      |   839 |        227 | 4400 |       11644 |  89.42000 |       7 | Yes         |  9.55000 |
|  10 | Cornell University                              | USA      |   498 |        172 | 3380 |        8991 |  86.79000 |       8 | Yes         |  9.54000 |
|  11 | Yale University                                 | USA      |  1425 |        472 | 5406 |       10932 |  86.61000 |       9 | Yes         |  9.52000 |
|  12 | California Institute of Technology              | USA      |  1900 |        484 | 4440 |       11711 |  84.40000 |      10 | Yes         |  9.51000 |
|  13 | University of Pennsylvania                      | USA      |   780 |        290 | 4785 |        7940 |  77.60000 |      11 | Yes         |  9.48000 |
|  14 | University of California-Los Angeles            | USA      |  1080 |        385 | 4552 |        9305 |  76.91000 |      12 | Yes         |  9.46000 |
|  15 | Johns Hopkins University                        | USA      |   313 |        157 | 3640 |        8127 |  71.60000 |      13 | Yes         |  9.42000 |
|  16 | New York University                             | USA      |  1093 |        220 | 4780 |        7355 |  68.39000 |      14 | Yes         |  9.42000 |
|  17 | University of Michigan-Ann Arbor                | USA      |   992 |        418 | 5300 |       21424 |  68.36000 |      15 | Yes         |  9.40000 |
|  18 | University of California-San Diego              | USA      |   908 |        423 | 3520 |        7994 |  66.59000 |      16 | Yes         |  9.39000 |
|  19 | Northwestern University                         | USA      |   704 |        322 | 3090 |       10908 |  66.56000 |      17 | Yes         |  9.36000 |
|  20 | University of Wisconsin-Madison                 | USA      |  2001 |       1016 | 3592 |        4010 |  64.51000 |      18 | No          |  9.34000 |
|  21 | University of California-San Francisco          | USA      |   661 |        252 | 3336 |       42926 |  63.69000 |      19 | Yes         |  9.32000 |
|  22 | University College London                       | UK       |  4664 |       1910 | 2540 |        5854 |  62.27000 |       3 | No          |  9.30000 |
|  23 | Duke University                                 | USA      |   516 |        219 | 4124 |        6584 |  61.55000 |      20 | Yes         |  9.30000 |
|  24 | Rockefeller University                          | USA      | 10308 |       3761 | 4850 |        4602 |  61.28000 |      21 | No          |  9.29000 |
|  25 | University of Texas at Austin                   | USA      |   334 |        166 | 3922 |       14579 |  61.14000 |      22 | Yes         |  9.26000 |
|  26 | University of Washington - Seattle              | USA      |  1729 |        951 | 2650 |        4739 |  60.61000 |      23 | No          |  9.25000 |
|  27 | University of Toronto                           | Canada   |  1700 |        491 | 5920 |        7100 |  60.04000 |       1 | Yes         |  9.23000 |
|  28 | University of Illinois at Urbana-Champaign      | USA      |  6791 |       3070 | 3933 |        6642 |  59.94000 |      24 | No          |  9.21000 |
|  29 | Imperial College London                         | UK       |   513 |        257 | 4372 |        7836 |  59.61000 |       4 | Yes         |  9.20000 |
|  30 | University of North Carolina at Chapel Hill     | USA      |   798 |        295 | 4342 |       11361 |  57.09000 |      25 | Yes         |  9.16000 |
|  31 | University of Virginia                          | USA      |   556 |        172 | 4135 |        6523 |  56.73000 |      26 | Yes         |  9.14000 |
|  32 | McGill University                               | Canada   |   483 |        206 | 4100 |        6136 |  56.49000 |       2 | Yes         |  9.12000 |
|  33 | Purdue University                               | USA      |  1366 |        662 | 4410 |        8086 |  56.39000 |      27 | Yes         |  9.10000 |
|  34 | Dartmouth College                               | USA      |   192 |        111 | 4300 |        9337 |  56.35000 |      28 | Yes         |  9.09000 |
|  35 | University of Pittsburgh - Pittsburgh Campus    | USA      |   838 |        285 | 6206 |       13894 |  55.63000 |      29 | Yes         |  9.06000 |
|  36 | Pennsylvania State University                   | USA      |  1402 |        531 | 8124 |       12580 |  55.54000 |      30 | Yes         |  9.00000 |
|  37 | University of Minnesota, Twin Cities            | USA      |   784 |        279 | 5360 |        9084 |  55.51000 |      31 | Yes         |  8.95000 |
|  38 | Ohio State University, Columbus                 | USA      |  5349 |       2367 | 3920 |        7503 |  55.39000 |      32 | Yes         |  8.93000 |
|  39 | Rutgers University-New Brunswick                | USA      |   850 |        348 | 5400 |        8954 |  55.23000 |      33 | Yes         |  8.91000 |
|  40 | University of Southern California               | USA      |   707 |        308 | 2950 |        6668 |  55.12000 |      34 | Yes         |  8.88000 |
|  41 | Washington University in St. Louis              | USA      |   494 |        129 | 4850 |        7550 |  55.03000 |      35 | Yes         |  8.85000 |
|  42 | University of California, Davis                 | USA      |   974 |        481 | 3664 |        7614 |  54.85000 |      36 | Yes         |  8.83000 |
|  43 | University of Colorado Boulder                  | USA      |   923 |        284 | 3616 |       12957 |  54.62000 |      37 | Yes         |  8.80000 |
|  44 | University of Edinburgh                         | UK       |   877 |        546 | 2700 |        3752 |  54.39000 |       5 | Yes         |  8.77000 |
|  45 | University of Florida                           | USA      |   327 |        114 | 4100 |       16364 |  54.18000 |      38 | Yes         |  8.74000 |
|  46 | Carnegie Mellon University                      | USA      |  2330 |        640 | 5510 |       10941 |  54.00000 |      39 | No          |  8.74000 |
|  47 | University of British Columbia                  | Canada   |  1221 |        480 | 3940 |       10511 |  53.92000 |       3 | Yes         |  8.71000 |
|  48 | University of California, Santa Barbara         | USA      |   184 |        122 | 3580 |        8324 |  53.63000 |      40 | Yes         |  8.70000 |
|  49 | Boston University                               | USA      |   384 |        104 | 2900 |        7623 |  53.43000 |      41 | Yes         |  8.69000 |
|  50 | University of Manchester                        | UK       |  1150 |        542 | 3396 |        6817 |  53.38000 |       6 | Yes         |  8.67000 |
|  51 | University of Arizona                           | USA      |   588 |        287 | 4325 |        8649 |  53.26000 |      42 | Yes         |  8.65000 |
|  52 | Vanderbilt University                           | USA      |   336 |        156 | 2700 |        8377 |  53.05000 |      43 | Yes         |  8.64000 |
|  53 | University of Utah                              | USA      |  3028 |       1025 | 2948 |        7041 |  52.89000 |      44 | Yes         |  8.61000 |
|  54 | University of Maryland, College Park            | USA      |   358 |        181 | 4350 |        6259 |  52.72000 |      45 | Yes         |  8.59000 |
|  55 | University of Texas Southwestern Medical Center | USA      |   514 |        209 | 3990 |        9073 |  52.50000 |      46 | Yes         |  8.57000 |
|  56 | Ruprecht Karl University of Heidelberg          | Germany  | 13007 |       3810 | 6810 |       16836 |  52.32000 |       1 | Yes         |  8.54000 |
|  57 | University of Notre Dame                        | USA      |  1019 |        418 | 5885 |       20447 |  52.27000 |      47 | No          |  8.53000 |
|  58 | Ludwig Maximilian University of Munich          | Germany  |  7333 |       3076 | 3352 |        6918 |  52.16000 |       2 | Yes         |  8.51000 |
|  59 | Georgia Institute of Technology                 | USA      |   330 |        151 | 6270 |       15387 |  52.08000 |      48 | Yes         |  8.50000 |
|  60 | University of Rochester                         | USA      |  3414 |       1061 | 4440 |        7671 |  52.03000 |      49 | Yes         |  8.46000 |
|  61 | Brown University                                | USA      |  2743 |        740 | 6750 |       17150 |  52.01000 |      50 | Yes         |  8.44000 |
|  62 | Emory University                                | USA      |   274 |        158 | 5879 |        5935 |  51.85000 |      51 | No          |  8.41000 |
|  63 | University of California                        | USA      |  1228 |       1202 | 2370 |        4900 |  51.51000 |      52 | Yes         |  8.40000 |
|  64 | University of Texas MD Anderson Cancer Center   | USA      |   351 |        155 | 3597 |        8355 |  51.51000 |      53 | Yes         |  8.37000 |
|  65 | Kings College London                            | UK       |   673 |        292 | 4725 |        8655 |  51.31000 |       7 | Yes         |  8.35000 |
|  66 | Tufts University                                | USA      |  5402 |       4615 | 3580 |        7916 |  51.22000 |      54 | Yes         |  8.34000 |
|  67 | Arizona State University                        | USA      |  3239 |       1462 | 5926 |       20440 |  51.13000 |      55 | Yes         |  8.31000 |
|  68 | Technical University of Munich                  | Germany  |   810 |        313 | 6750 |       17449 |  50.58000 |       3 | Yes         |  8.28000 |
|  69 | Texas A&M University, College Station           | USA      |  3813 |        862 | 4750 |       13675 |  50.43000 |      56 | Yes         |  8.25000 |
|  70 | Case Western Reserve University                 | USA      |  2037 |        700 | 4650 |        9511 |  50.28000 |      57 | Yes         |  8.22000 |
|  71 | Indiana University - Bloomington                | USA      |   494 |        224 | 6250 |        7117 |  50.26000 |      58 | Yes         |  8.17000 |
|  72 | University of Alberta                           | Canada   |   604 |        213 | 4600 |        7922 |  50.25000 |       4 | Yes         |  8.14000 |
|  73 | Georgetown University                           | USA      |   247 |        247 | 5300 |        8985 |  49.92000 |      59 | Yes         |  8.11000 |
|  74 | Michigan State University                       | USA      |  3817 |       1650 | 4877 |        8453 |  49.74000 |      60 | Yes         |  8.09000 |
|  75 | Rice University                                 | USA      |  3294 |       1483 | 4368 |        7268 |  49.73000 |      61 | Yes         |  8.09000 |
|  76 | Baylor College of Medicine                      | USA      |  1512 |        913 | 3710 |        7786 |  49.70000 |      62 | Yes         |  8.07000 |
|  77 | University of Bristol                           | UK       |  1339 |        657 | 2790 |        3739 |  49.59000 |       8 | Yes         |  8.03000 |
|  78 | University of Colorado Denver                   | USA      |   587 |        298 | 3070 |        5391 |  49.48000 |      63 | Yes         |  8.01000 |
|  79 | University of Glasgow                           | UK       |  2193 |        753 | 5340 |        7972 |  49.45000 |       9 | No          |  7.99000 |
|  80 | Western University                              | Canada   |    90 |         35 | 2812 |        7976 |  49.31000 |       5 | No          |  7.97000 |
|  81 | University of Miami                             | USA      |  1579 |        489 | 3957 |       17960 |  49.09000 |      64 | Yes         |  7.97000 |
|  82 | Stony Brook University                          | USA      |  5201 |       1191 | 5690 |       24386 |  49.09000 |      65 | Yes         |  7.95000 |
|  83 | University of Texas at Dallas                   | USA      |   991 |        352 | 3880 |        7666 |  49.05000 |      66 | Yes         |  7.93000 |
|  84 | University of Nottingham                        | UK       |   951 |        464 | 3150 |        6716 |  49.02000 |      10 | Yes         |  7.91000 |
|  85 | University of Iowa                              | USA      |  1427 |        434 | 3775 |        7364 |  49.01000 |      67 | Yes         |  7.90000 |
|  86 | Southern Methodist University                   | USA      |  3156 |        713 | 4730 |       19733 |  48.99000 |      68 | Yes         |  7.88000 |
|  87 | Icahn School of Medicine at Mount Sinai         | USA      |   940 |        363 | 4690 |        6318 |  48.96000 |      69 | Yes         |  7.87000 |
|  88 | University of Alabama at Birmingham             | USA      |   880 |        291 | 4100 |        8425 |  48.79000 |      70 | Yes         |  7.85000 |
|  89 | Free University of Berlin                       | Germany  |  1465 |        505 | 6408 |       12751 |  48.78000 |       4 | Yes         |  7.81000 |
|  90 | University of Southampton                       | UK       |  3433 |        527 | 4840 |        7697 |  48.77000 |      11 | Yes         |  7.77000 |
|  91 | McMaster University                             | Canada   |   607 |        198 | 5285 |       10961 |  48.74000 |       6 | Yes         |  7.76000 |
|  92 | University of Montreal                          | Canada   |  1090 |        616 | 4410 |        6897 |  48.72000 |       7 | Yes         |  7.73000 |
|  93 | University of Birmingham                        | UK       |   312 |         90 | 5400 |        9583 |  48.70000 |      12 | No          |  7.71000 |
|  94 | Humboldt University of Berlin                   | Germany  |   434 |        210 | 3490 |        9685 |  48.64000 |       5 | Yes         |  7.68000 |
|  95 | University of California, Santa Cruz            | USA      |   396 |        203 | 6643 |       13025 |  48.59000 |      71 | Yes         |  7.65000 |
|  96 | Albert Ludwig University of Freiburg            | Germany  |  1113 |        401 | 3660 |        8444 |  48.57000 |       6 | Yes         |  7.62000 |
|  97 | University of Tübingen                          | Germany  |  2532 |        902 | 4444 |        4900 |  48.56000 |       7 | Yes         |  7.60000 |
|  98 | University of Cincinnati                        | USA      |  4101 |       1436 | 3288 |        5501 |  48.56000 |      72 | Yes         |  7.58000 |
|  99 | University of Bonn                              | Germany  |  2011 |       1007 | 3603 |        6413 |  48.54000 |       8 | Yes         |  7.57000 |
| 100 | Wake Forest University                          | USA      |   146 |         88 | 3080 |        3365 |  48.52000 |      73 | Yes         |  7.54000 |
+-----+-------------------------------------------------+----------+-------+------------+------+-------------+-----------+---------+-------------+----------+
```
## TABLE COURSE
```sql
-- This is a MySQL code for inserting records into Table Course
INSERT INTO COURSE VALUES(22101,1001,1,	'Electrical Engineering',1,120);
INSERT INTO COURSE VALUES(22102,1002,2,	'Computer Science',1,100);
INSERT INTO COURSE VALUES(22103,1003,3,	'Computer Science',2,120);
INSERT INTO COURSE VALUES(22104,1004,4,	'Civil Engineering',2,100);
INSERT INTO COURSE VALUES(22105,1005,5,	'Civil Engineering',2,100);
INSERT INTO COURSE VALUES(22106,1006,6,	'Mechanical Engineering',1,60);
INSERT INTO COURSE VALUES(22107,1007,7,	'Electrical Engineering',2,100);
INSERT INTO COURSE VALUES(22108,1008,8,	'Computer Science',2,100);
INSERT INTO COURSE VALUES(22109,1009,9,	'Civil Engineering',2,60);
INSERT INTO COURSE VALUES(22110,1010,10,'Electrical Engineering',1,120);
INSERT INTO COURSE VALUES(22111,1011,11,'Computer Science',1,60);
INSERT INTO COURSE VALUES(22112,1012,12,'Electrical Engineering',1,120);
INSERT INTO COURSE VALUES(22113,1013,13,'Electrical Engineering',2,120);
INSERT INTO COURSE VALUES(22114,1014,14,'Mechanical Engineering',1,120);
INSERT INTO COURSE VALUES(22115,1015,15,'Computer Science',2,120);
INSERT INTO COURSE VALUES(22116,1016,16,'Mechanical Engineering',2,100);
INSERT INTO COURSE VALUES(22117,1017,17,'Electrical Engineering',1,120);
INSERT INTO COURSE VALUES(22118,1018,18,'Mechanical Engineering',2,60);
INSERT INTO COURSE VALUES(22119,1019,19,'Computer Science',2,60);
INSERT INTO COURSE VALUES(22120,1020,20,'Mechanical Engineering',2,100);
INSERT INTO COURSE VALUES(22121,1021,21,'Civil Engineering',1,120);
INSERT INTO COURSE VALUES(22122,1022,22,'Mechanical Engineering',1,100);
INSERT INTO COURSE VALUES(22123,1023,23,'Mechanical Engineering',1,120);
INSERT INTO COURSE VALUES(22124,1024,24,'Electrical Engineering',1,120);
INSERT INTO COURSE VALUES(22125,1025,25,'Mechanical Engineering',2,120);
INSERT INTO COURSE VALUES(22126,1026,26,'Civil Engineering',2,120);
INSERT INTO COURSE VALUES(22127,1027,27,'Mechanical Engineering',1,60);
INSERT INTO COURSE VALUES(22128,1028,28,'Computer Science',1,100);
INSERT INTO COURSE VALUES(22129,1029,29,'Civil Engineering',1,100);
INSERT INTO COURSE VALUES(22130,1030,30,'Computer Science',2,100);
INSERT INTO COURSE VALUES(22131,1031,31,'Mechanical Engineering',1,120);
INSERT INTO COURSE VALUES(22132,1032,32,'Computer Science',2,120);
INSERT INTO COURSE VALUES(22133,1033,33,'Civil Engineering',1,100);
INSERT INTO COURSE VALUES(22134,1034,34,'Electrical Engineering',1,100);
INSERT INTO COURSE VALUES(22135,1035,35,'Mechanical Engineering',2,120);
INSERT INTO COURSE VALUES(22136,1036,36,'Mechanical Engineering',2,100);
INSERT INTO COURSE VALUES(22137,1037,37,'Computer Science',1,60);
INSERT INTO COURSE VALUES(22138,1038,38,'Civil Engineering',1,120);
INSERT INTO COURSE VALUES(22139,1039,39,'Computer Science',1,60);
INSERT INTO COURSE VALUES(22140,1040,40,'Electrical Engineering',1,100);
INSERT INTO COURSE VALUES(22141,1041,41,'Electrical Engineering',1,100);
INSERT INTO COURSE VALUES(22142,1042,42,'Civil Engineering',1,100);
INSERT INTO COURSE VALUES(22143,1043,43,'Mechanical Engineering',1,60);
INSERT INTO COURSE VALUES(22144,1044,44,'Civil Engineering',2,	120);
INSERT INTO COURSE VALUES(22145,1045,45,'Electrical Engineering',2,100);
INSERT INTO COURSE VALUES(22146,1046,46,'Mechanical Engineering',2,100);
INSERT INTO COURSE VALUES(22147,1047,47,'Civil Engineering',1,60);
INSERT INTO COURSE VALUES(22148,1048,48,'Electrical Engineering',1,60);
INSERT INTO COURSE VALUES(22149, 1049,49,'Electrical Engineering',2,120);
INSERT INTO COURSE VALUES(22150,1050,50,'Civil Engineering',2,100);
INSERT INTO COURSE VALUES (22151,1051,51,'Electrical Engineering',2,120);
INSERT INTO COURSE VALUES (22152,1052,52,'Mechanical Engineering',2,100);
INSERT INTO COURSE VALUES (22153,1053,53,'Computer Science',2,100);
INSERT INTO COURSE VALUES (22154,1054,54,'Civil Engineering',1,100);
INSERT INTO COURSE VALUES (22155,1055,55,'Mechanical Engineering',2,60);
INSERT INTO COURSE VALUES (22156,1056,56,'Computer Science',2,120);
INSERT INTO COURSE VALUES (22157,1057,57,'Electrical Engineering',1,120);
INSERT INTO COURSE VALUES (22158,1058,58,'Electrical Engineering',2,120);
INSERT INTO COURSE VALUES (22159,1059,59,'Electrical Engineering',2,120);
INSERT INTO COURSE VALUES (22160,1060,60,'Mechanical Engineering',2,60);
INSERT INTO COURSE VALUES (22161,1061,61,'Civil Engineering',1,100);
INSERT INTO COURSE VALUES (22162,1062,62,'Civil Engineering',2,60);
INSERT INTO COURSE VALUES (22163,1063,63,'Electrical Engineering',2,60);
INSERT INTO COURSE VALUES (22164,1064,64,'Computer Science',2,60);
INSERT INTO COURSE VALUES (22165,1065,65,'Mechanical Engineering',1,100);
INSERT INTO COURSE VALUES (22166,1066,66,'Computer Science',1,120);
INSERT INTO COURSE VALUES (22167,1067,67,'Computer Science',1,100);
INSERT INTO COURSE VALUES (22268,1168,68,'Civil Engineering',1,100);
INSERT INTO COURSE VALUES (22269,1169,69,'Computer Science',1,120);
INSERT INTO COURSE VALUES (22270,1170,70,'Mechanical Engineering',1,60);
INSERT INTO COURSE VALUES (22271,1171,71,'Electrical Engineering',2,120);
INSERT INTO COURSE VALUES (22272,1172,72,'Computer Science',1,100);
INSERT INTO COURSE VALUES (22273,1173,73,'Electrical Engineering',2,60);
INSERT INTO COURSE VALUES (22274,1174,74,'Civil Engineering',2,100);
INSERT INTO COURSE VALUES (22275,1175,75,'Computer Science',2,60);
INSERT INTO COURSE VALUES (22276,1176,76,'Mechanical Engineering',1,60);
INSERT INTO COURSE VALUES (22277,1177,77,'Civil Engineering',2,60);
INSERT INTO COURSE VALUES (22278,1178,78,'Computer Science',2,100);
INSERT INTO COURSE VALUES (22279,1179,79,'Electrical Engineering',2,120);
INSERT INTO COURSE VALUES (22280,1180,80,'Computer Science',1,100);
INSERT INTO COURSE VALUES (22181,1081,81,'Electrical Engineering',2,100);
INSERT INTO COURSE VALUES (22182,1082,82,'Civil Engineering',1,100);
INSERT INTO COURSE VALUES (22183,1083,83,'Computer Science',2,120);
INSERT INTO COURSE VALUES (22184,1084,84,'Mechanical Engineering',1,100);
INSERT INTO COURSE VALUES (22185,1085,85,'Mechanical Engineering',2,100);
INSERT INTO COURSE VALUES (22186,1086,86,'Civil Engineering',1,120);
INSERT INTO COURSE VALUES (22187,1087,87,'Electrical Engineering',2,100);
INSERT INTO COURSE VALUES (22188,1088,88,'Civil Engineering',2,120);
INSERT INTO COURSE VALUES (22189,1089,89,'Electrical Engineering',1,100);
INSERT INTO COURSE VALUES (22190,1090,90,'Electrical Engineering',2,100);
INSERT INTO COURSE VALUES (22191,1091,91,'Civil Engineering',1,100);
INSERT INTO COURSE VALUES (22192,1092,92,'Civil Engineering',2,120);
INSERT INTO COURSE VALUES (22193,1093,93,'Civil Engineering',2,120);
INSERT INTO COURSE VALUES (22194,1094,94,'Electrical Engineering',1,60);
INSERT INTO COURSE VALUES (22195,1095,95,'Mechanical Engineering',2,60);
INSERT INTO COURSE VALUES (22196,1096,96,'Electrical Engineering',1,60);
INSERT INTO COURSE VALUES (22197,1097,97,'Electrical Engineering',2,120);
INSERT INTO COURSE VALUES (22198,1098,98,'Computer Science',1,100);
INSERT INTO COURSE VALUES (22199,1099,99,'Mechanical Engineering',2,100);
INSERT INTO COURSE VALUES (22200,1100,100,'Computer Science',2,120);

-- OUTPUT:
mysql> SELECT * FROM course;
+-------+---------+--------+------------------------+------------+--------+
| COID  | USID_FK | CID_FK | CONAME                 | CODURATION | CREDIT |
+-------+---------+--------+------------------------+------------+--------+
| 22101 |    1001 |      1 | Electrical Engineering |          1 |    120 |
| 22102 |    1002 |      2 | Computer Science       |          1 |    100 |
| 22103 |    1003 |      3 | Computer Science       |          2 |    120 |
| 22104 |    1004 |      4 | Civil Engineering      |          2 |    100 |
| 22105 |    1005 |      5 | Civil Engineering      |          2 |    100 |
| 22106 |    1006 |      6 | Mechanical Engineering |          1 |     60 |
| 22107 |    1007 |      7 | Electrical Engineering |          2 |    100 |
| 22108 |    1008 |      8 | Computer Science       |          2 |    100 |
| 22109 |    1009 |      9 | Civil Engineering      |          2 |     60 |
| 22110 |    1010 |     10 | Electrical Engineering |          1 |    120 |
| 22111 |    1011 |     11 | Computer Science       |          1 |     60 |
| 22112 |    1012 |     12 | Electrical Engineering |          1 |    120 |
| 22113 |    1013 |     13 | Electrical Engineering |          2 |    120 |
| 22114 |    1014 |     14 | Mechanical Engineering |          1 |    120 |
| 22115 |    1015 |     15 | Computer Science       |          2 |    120 |
| 22116 |    1016 |     16 | Mechanical Engineering |          2 |    100 |
| 22117 |    1017 |     17 | Electrical Engineering |          1 |    120 |
| 22118 |    1018 |     18 | Mechanical Engineering |          2 |     60 |
| 22119 |    1019 |     19 | Computer Science       |          2 |     60 |
| 22120 |    1020 |     20 | Mechanical Engineering |          2 |    100 |
| 22121 |    1021 |     21 | Civil Engineering      |          1 |    120 |
| 22122 |    1022 |     22 | Mechanical Engineering |          1 |    100 |
| 22123 |    1023 |     23 | Mechanical Engineering |          1 |    120 |
| 22124 |    1024 |     24 | Electrical Engineering |          1 |    120 |
| 22125 |    1025 |     25 | Mechanical Engineering |          2 |    120 |
| 22126 |    1026 |     26 | Civil Engineering      |          2 |    120 |
| 22127 |    1027 |     27 | Mechanical Engineering |          1 |     60 |
| 22128 |    1028 |     28 | Computer Science       |          1 |    100 |
| 22129 |    1029 |     29 | Civil Engineering      |          1 |    100 |
| 22130 |    1030 |     30 | Computer Science       |          2 |    100 |
| 22131 |    1031 |     31 | Mechanical Engineering |          1 |    120 |
| 22132 |    1032 |     32 | Computer Science       |          2 |    120 |
| 22133 |    1033 |     33 | Civil Engineering      |          1 |    100 |
| 22134 |    1034 |     34 | Electrical Engineering |          1 |    100 |
| 22135 |    1035 |     35 | Mechanical Engineering |          2 |    120 |
| 22136 |    1036 |     36 | Mechanical Engineering |          2 |    100 |
| 22137 |    1037 |     37 | Computer Science       |          1 |     60 |
| 22138 |    1038 |     38 | Civil Engineering      |          1 |    120 |
| 22139 |    1039 |     39 | Computer Science       |          1 |     60 |
| 22140 |    1040 |     40 | Electrical Engineering |          1 |    100 |
| 22141 |    1041 |     41 | Electrical Engineering |          1 |    100 |
| 22142 |    1042 |     42 | Civil Engineering      |          1 |    100 |
| 22143 |    1043 |     43 | Mechanical Engineering |          1 |     60 |
| 22144 |    1044 |     44 | Civil Engineering      |          2 |    120 |
| 22145 |    1045 |     45 | Electrical Engineering |          2 |    100 |
| 22146 |    1046 |     46 | Mechanical Engineering |          2 |    100 |
| 22147 |    1047 |     47 | Civil Engineering      |          1 |     60 |
| 22148 |    1048 |     48 | Electrical Engineering |          1 |     60 |
| 22149 |    1049 |     49 | Electrical Engineering |          2 |    120 |
| 22150 |    1050 |     50 | Civil Engineering      |          2 |    100 |
| 22151 |    1051 |     51 | Electrical Engineering |          2 |    120 |
| 22152 |    1052 |     52 | Mechanical Engineering |          2 |    100 |
| 22153 |    1053 |     53 | Computer Science       |          2 |    100 |
| 22154 |    1054 |     54 | Civil Engineering      |          1 |    100 |
| 22155 |    1055 |     55 | Mechanical Engineering |          2 |     60 |
| 22156 |    1056 |     56 | Computer Science       |          2 |    120 |
| 22157 |    1057 |     57 | Electrical Engineering |          1 |    120 |
| 22158 |    1058 |     58 | Electrical Engineering |          2 |    120 |
| 22159 |    1059 |     59 | Electrical Engineering |          2 |    120 |
| 22160 |    1060 |     60 | Mechanical Engineering |          2 |     60 |
| 22161 |    1061 |     61 | Civil Engineering      |          1 |    100 |
| 22162 |    1062 |     62 | Civil Engineering      |          2 |     60 |
| 22163 |    1063 |     63 | Electrical Engineering |          2 |     60 |
| 22164 |    1064 |     64 | Computer Science       |          2 |     60 |
| 22165 |    1065 |     65 | Mechanical Engineering |          1 |    100 |
| 22166 |    1066 |     66 | Computer Science       |          1 |    120 |
| 22167 |    1067 |     67 | Computer Science       |          1 |    100 |
| 22268 |    1168 |     68 | Civil Engineering      |          1 |    100 |
| 22269 |    1169 |     69 | Computer Science       |          1 |    120 |
| 22270 |    1170 |     70 | Mechanical Engineering |          1 |     60 |
| 22271 |    1171 |     71 | Electrical Engineering |          2 |    120 |
| 22272 |    1172 |     72 | Computer Science       |          1 |    100 |
| 22273 |    1173 |     73 | Electrical Engineering |          2 |     60 |
| 22274 |    1174 |     74 | Civil Engineering      |          2 |    100 |
| 22275 |    1175 |     75 | Computer Science       |          2 |     60 |
| 22276 |    1176 |     76 | Mechanical Engineering |          1 |     60 |
| 22277 |    1177 |     77 | Civil Engineering      |          2 |     60 |
| 22278 |    1178 |     78 | Computer Science       |          2 |    100 |
| 22279 |    1179 |     79 | Electrical Engineering |          2 |    120 |
| 22280 |    1180 |     80 | Computer Science       |          1 |    100 |
| 22181 |    1081 |     81 | Electrical Engineering |          2 |    100 |
| 22182 |    1082 |     82 | Civil Engineering      |          1 |    100 |
| 22183 |    1083 |     83 | Computer Science       |          2 |    120 |
| 22184 |    1084 |     84 | Mechanical Engineering |          1 |    100 |
| 22185 |    1085 |     85 | Mechanical Engineering |          2 |    100 |
| 22186 |    1086 |     86 | Civil Engineering      |          1 |    120 |
| 22187 |    1087 |     87 | Electrical Engineering |          2 |    100 |
| 22188 |    1088 |     88 | Civil Engineering      |          2 |    120 |
| 22189 |    1089 |     89 | Electrical Engineering |          1 |    100 |
| 22190 |    1090 |     90 | Electrical Engineering |          2 |    100 |
| 22191 |    1091 |     91 | Civil Engineering      |          1 |    100 |
| 22192 |    1092 |     92 | Civil Engineering      |          2 |    120 |
| 22193 |    1093 |     93 | Civil Engineering      |          2 |    120 |
| 22194 |    1094 |     94 | Electrical Engineering |          1 |     60 |
| 22195 |    1095 |     95 | Mechanical Engineering |          2 |     60 |
| 22196 |    1096 |     96 | Electrical Engineering |          1 |     60 |
| 22197 |    1097 |     97 | Electrical Engineering |          2 |    120 |
| 22198 |    1098 |     98 | Computer Science       |          1 |    100 |
| 22199 |    1099 |     99 | Mechanical Engineering |          2 |    100 |
| 22200 |    1100 |    100 | Computer Science       |          2 |    120 |
+-------+---------+--------+------------------------+------------+--------+
```
## TABLE CONTACT
```sql
-- This is a MySQL code for inserting records into Table Contact
INSERT INTO CONTACT VALUES (1,3565708377,5982265770);
INSERT INTO CONTACT VALUES (2,3504600518,3602508012);
INSERT INTO CONTACT VALUES (3,7117465215,5075259241);
INSERT INTO CONTACT VALUES (4,3749496959,5312830528);
INSERT INTO CONTACT VALUES (5,8656352373,3333269047);
INSERT INTO CONTACT VALUES (6,1691392718,3522787288);
INSERT INTO CONTACT VALUES (7,6728031215,5434040180);
INSERT INTO CONTACT VALUES (8,1645999996,2302499496);
INSERT INTO CONTACT VALUES (9,4928985081,1871672687);
INSERT INTO CONTACT VALUES (10,8965734843,9846866348);
INSERT INTO CONTACT VALUES (11,2865492183,3227973139);
INSERT INTO CONTACT VALUES (12,8453131609,7173370972);
INSERT INTO CONTACT VALUES (13,1582716234,8349390703);
INSERT INTO CONTACT VALUES (14,4815052078,5511938705);
INSERT INTO CONTACT VALUES (15,4996573847,4659364553);
INSERT INTO CONTACT VALUES (16,3606024649,8558430613);
INSERT INTO CONTACT VALUES (17,1921069024,8085402549);
INSERT INTO CONTACT VALUES (18,5719652031,1762320498);
INSERT INTO CONTACT VALUES (19,2545847958,2311622089);
INSERT INTO CONTACT VALUES (20,6295146801,7723578792);
INSERT INTO CONTACT VALUES (21,8898983205,5137638133);
INSERT INTO CONTACT VALUES (22,2337437178,7127103106);
INSERT INTO CONTACT VALUES (23,6564690726,8643980583);
INSERT INTO CONTACT VALUES (24,3422486476,3893597167);
INSERT INTO CONTACT VALUES (25,8101706506,6678644707);
INSERT INTO CONTACT VALUES (26,3774172207,6855067343);
INSERT INTO CONTACT VALUES (27,6375613884,1441806238);
INSERT INTO CONTACT VALUES (28,4457717334,7749036544);
INSERT INTO CONTACT VALUES (29,4168817233,6485464872);
INSERT INTO CONTACT VALUES (30,7837181215,3647755695);
INSERT INTO CONTACT VALUES (31,6815620745,2256486166);
INSERT INTO CONTACT VALUES (32,5468612943,7058948007);
INSERT INTO CONTACT VALUES (33,7068638869,6368227039);
INSERT INTO CONTACT VALUES (34,7007344171,7575985307);
INSERT INTO CONTACT VALUES (35,3148693718,7701352188);
INSERT INTO CONTACT VALUES (36,7759129623,2145704552);
INSERT INTO CONTACT VALUES (37,4586792600,4235270089);
INSERT INTO CONTACT VALUES (38,6837433439,2683712025);
INSERT INTO CONTACT VALUES (39,1091622420,2609869768);
INSERT INTO CONTACT VALUES (40,8272812929,3866040655);
INSERT INTO CONTACT VALUES (41,6321558054,9693469455);
INSERT INTO CONTACT VALUES (42,4294071249,2872126547);
INSERT INTO CONTACT VALUES (43,1132606287,3709429325);
INSERT INTO CONTACT VALUES (44,2846106687,3236563387);
INSERT INTO CONTACT VALUES (45,7203753858,9987537716);
INSERT INTO CONTACT VALUES (46,6623278121,4893305894);
INSERT INTO CONTACT VALUES (47,1549214216,5328955016);
INSERT INTO CONTACT VALUES (48,9243755073,8667650785);
INSERT INTO CONTACT VALUES (49,6894312533,1591222958);
INSERT INTO CONTACT VALUES (50,4247053065,4414958068);
INSERT INTO CONTACT VALUES (51,3287274801,2004415048);
INSERT INTO CONTACT VALUES(52,8117217816,9807175357);
INSERT INTO CONTACT VALUES(53,8079590265,9066243626);
INSERT INTO CONTACT VALUES(54,8707895687,1387851360);
INSERT INTO CONTACT VALUES(55,9963762779,2446485370);
INSERT INTO CONTACT VALUES(56,4833887210,6831557754);
INSERT INTO CONTACT VALUES(57,6061884791,8452195012);
INSERT INTO CONTACT VALUES(58,3144847312,4526777867);
INSERT INTO CONTACT VALUES(59,6234734058,9536194089);
INSERT INTO CONTACT VALUES(60,9976165903,8492410444);
INSERT INTO CONTACT VALUES(61,6525838914,8411333272);
INSERT INTO CONTACT VALUES(62,7062642724,7778979964);
INSERT INTO CONTACT VALUES(63,4254443120,6064778298);
INSERT INTO CONTACT VALUES(64,5062179464,9454108037);
INSERT INTO CONTACT VALUES(65,6938145040,4335447203);
INSERT INTO CONTACT VALUES(66,8803249325,5612515233);
INSERT INTO CONTACT VALUES(67,4364228119,4176398321);
INSERT INTO CONTACT VALUES(68,7359075042,3605907957);
INSERT INTO CONTACT VALUES(69,9563567570,8267052082);
INSERT INTO CONTACT VALUES(70,8733818450,5817056214);
INSERT INTO CONTACT VALUES(71,1974113902,5144755586);
INSERT INTO CONTACT VALUES(72,1719775474,4842458638);
INSERT INTO CONTACT VALUES(73,8251846357,1832124464);
INSERT INTO CONTACT VALUES(74,7911164099,6009912958);
INSERT INTO CONTACT VALUES(75,5784445547,3037995531);
INSERT INTO CONTACT VALUES(76,9527119300,7173369304);
INSERT INTO CONTACT VALUES(77,1187766290,6177537527);
INSERT INTO CONTACT VALUES(78,3258404768,3021010881);
INSERT INTO CONTACT VALUES(79,8309726240,7835965131);
INSERT INTO CONTACT VALUES(80,8024151896,6534036684);
INSERT INTO CONTACT VALUES(81,2051268926,1647280240);
INSERT INTO CONTACT VALUES(82,7544495831,5672526904);
INSERT INTO CONTACT VALUES(83,2237947128,7245630562);
INSERT INTO CONTACT VALUES(84,4192329034,4257804075);
INSERT INTO CONTACT VALUES(85,5399787042,8582326167);
INSERT INTO CONTACT VALUES(86,8677741143,9346329300);
INSERT INTO CONTACT VALUES(87,5018139148,6496418880);
INSERT INTO CONTACT VALUES(88,7452183723,2883741511);
INSERT INTO CONTACT VALUES(89,6438110217,3782734811);
INSERT INTO CONTACT VALUES(90,3483409097,7959996271);
INSERT INTO CONTACT VALUES(91,7776756157,7853625700);
INSERT INTO CONTACT VALUES(92,9191258190,4569110863);
INSERT INTO CONTACT VALUES(93,1709779077,8696255783);
INSERT INTO CONTACT VALUES(94,3842358959,7113300371);
INSERT INTO CONTACT VALUES(95,3197122393,3652128611);
INSERT INTO CONTACT VALUES(96,3071652082,3162746079);
INSERT INTO CONTACT VALUES(97,3329222180,6735138205);
INSERT INTO CONTACT VALUES(98,9455294591,1216202608);
INSERT INTO CONTACT VALUES(99,9592443017,6648514852);
INSERT INTO CONTACT VALUES(100,8473599602,2619689095);

-- OUTPUT:
mysql> SELECT * FROM contact;
+--------+------------+------------+
| CID_FK | CON1       | CON2       |
+--------+------------+------------+
|      1 | 3565708377 | 5982265770 |
|      2 | 3504600518 | 3602508012 |
|      3 | 7117465215 | 5075259241 |
|      4 | 3749496959 | 5312830528 |
|      5 | 8656352373 | 3333269047 |
|      6 | 1691392718 | 3522787288 |
|      7 | 6728031215 | 5434040180 |
|      8 | 1645999996 | 2302499496 |
|      9 | 4928985081 | 1871672687 |
|     10 | 8965734843 | 9846866348 |
|     11 | 2865492183 | 3227973139 |
|     12 | 8453131609 | 7173370972 |
|     13 | 1582716234 | 8349390703 |
|     14 | 4815052078 | 5511938705 |
|     15 | 4996573847 | 4659364553 |
|     16 | 3606024649 | 8558430613 |
|     17 | 1921069024 | 8085402549 |
|     18 | 5719652031 | 1762320498 |
|     19 | 2545847958 | 2311622089 |
|     20 | 6295146801 | 7723578792 |
|     21 | 8898983205 | 5137638133 |
|     22 | 2337437178 | 7127103106 |
|     23 | 6564690726 | 8643980583 |
|     24 | 3422486476 | 3893597167 |
|     25 | 8101706506 | 6678644707 |
|     26 | 3774172207 | 6855067343 |
|     27 | 6375613884 | 1441806238 |
|     28 | 4457717334 | 7749036544 |
|     29 | 4168817233 | 6485464872 |
|     30 | 7837181215 | 3647755695 |
|     31 | 6815620745 | 2256486166 |
|     32 | 5468612943 | 7058948007 |
|     33 | 7068638869 | 6368227039 |
|     34 | 7007344171 | 7575985307 |
|     35 | 3148693718 | 7701352188 |
|     36 | 7759129623 | 2145704552 |
|     37 | 4586792600 | 4235270089 |
|     38 | 6837433439 | 2683712025 |
|     39 | 1091622420 | 2609869768 |
|     40 | 8272812929 | 3866040655 |
|     41 | 6321558054 | 9693469455 |
|     42 | 4294071249 | 2872126547 |
|     43 | 1132606287 | 3709429325 |
|     44 | 2846106687 | 3236563387 |
|     45 | 7203753858 | 9987537716 |
|     46 | 6623278121 | 4893305894 |
|     47 | 1549214216 | 5328955016 |
|     48 | 9243755073 | 8667650785 |
|     49 | 6894312533 | 1591222958 |
|     50 | 4247053065 | 4414958068 |
|     51 | 3287274801 | 2004415048 |
|     52 | 8117217816 | 9807175357 |
|     53 | 8079590265 | 9066243626 |
|     54 | 8707895687 | 1387851360 |
|     55 | 9963762779 | 2446485370 |
|     56 | 4833887210 | 6831557754 |
|     57 | 6061884791 | 8452195012 |
|     58 | 3144847312 | 4526777867 |
|     59 | 6234734058 | 9536194089 |
|     60 | 9976165903 | 8492410444 |
|     61 | 6525838914 | 8411333272 |
|     62 | 7062642724 | 7778979964 |
|     63 | 4254443120 | 6064778298 |
|     64 | 5062179464 | 9454108037 |
|     65 | 6938145040 | 4335447203 |
|     66 | 8803249325 | 5612515233 |
|     67 | 4364228119 | 4176398321 |
|     68 | 7359075042 | 3605907957 |
|     69 | 9563567570 | 8267052082 |
|     70 | 8733818450 | 5817056214 |
|     71 | 1974113902 | 5144755586 |
|     72 | 1719775474 | 4842458638 |
|     73 | 8251846357 | 1832124464 |
|     74 | 7911164099 | 6009912958 |
|     75 | 5784445547 | 3037995531 |
|     76 | 9527119300 | 7173369304 |
|     77 | 1187766290 | 6177537527 |
|     78 | 3258404768 | 3021010881 |
|     79 | 8309726240 | 7835965131 |
|     80 | 8024151896 | 6534036684 |
|     81 | 2051268926 | 1647280240 |
|     82 | 7544495831 | 5672526904 |
|     83 | 2237947128 | 7245630562 |
|     84 | 4192329034 | 4257804075 |
|     85 | 5399787042 | 8582326167 |
|     86 | 8677741143 | 9346329300 |
|     87 | 5018139148 | 6496418880 |
|     88 | 7452183723 | 2883741511 |
|     89 | 6438110217 | 3782734811 |
|     90 | 3483409097 | 7959996271 |
|     91 | 7776756157 | 7853625700 |
|     92 | 9191258190 | 4569110863 |
|     93 | 1709779077 | 8696255783 |
|     94 | 3842358959 | 7113300371 |
|     95 | 3197122393 | 3652128611 |
|     96 | 3071652082 | 3162746079 |
|     97 | 3329222180 | 6735138205 |
|     98 | 9455294591 | 1216202608 |
|     99 | 9592443017 | 6648514852 |
|    100 | 8473599602 | 2619689095 |
+--------+------------+------------+
```
# DEMO

https://github.com/Anuprita579/UniFind/assets/141035951/407d0a60-7138-4667-9551-138b5cdff597

# REPORT

[MiniProject_Report_FINAL.pdf](https://github.com/Anuprita579/UniFind/files/13031764/MiniProject_Report_FINAL.pdf)

# PRESENTATION

[UniFind_D10A_CollegeSearchPortal_Final (1).pptx](https://github.com/Anuprita579/UniFind/files/13031777/UniFind_D10A_CollegeSearchPortal_Final.1.pptx)




