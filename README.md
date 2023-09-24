# Tables
---
![WhatsApp Image 2023-09-24 at 01 23 40](https://github.com/Anuprita579/UniFind/assets/141035951/4b2d0baa-42ee-49be-8c0c-646ca92e12e9)
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
```
![WhatsApp Image 2023-09-24 at 01 22 47](https://github.com/Anuprita579/UniFind/assets/141035951/6dec65fa-37f7-49a1-bc69-33444bd5cf5d)
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
```
![WhatsApp Image 2023-09-24 at 01 21 32](https://github.com/Anuprita579/UniFind/assets/141035951/0ec2f183-64c2-4363-9e03-8b121121ef7c)
## TABLE CONTACT
```sql
-- This is a MySQL code for creating Table Contact
CREATE TABLE CONTACT(
CID_FK INT NOT NULL,
CON1 BIGINT NOT NULL,
CON2 BIGINT NOT NULL,
FOREIGN KEY (CID_FK)REFERENCES COLLEGE(CID));
```
![WhatsApp Image 2023-09-24 at 01 20 48](https://github.com/Anuprita579/UniFind/assets/141035951/9230bb73-6197-4101-a241-60f5938a0824)
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
```
![WhatsApp Image 2023-09-24 at 01 27 03](https://github.com/Anuprita579/UniFind/assets/141035951/cb3cb326-5a50-4527-9886-25cab264bcd6)
![WhatsApp Image 2023-09-24 at 01 27 40](https://github.com/Anuprita579/UniFind/assets/141035951/3354e5c6-554b-42fc-921b-f27d518cb5f2)
![WhatsApp Image 2023-09-24 at 01 28 23](https://github.com/Anuprita579/UniFind/assets/141035951/d8911ed0-e585-4eb1-93d6-a8571295b872)
![WhatsApp Image 2023-09-24 at 01 28 50](https://github.com/Anuprita579/UniFind/assets/141035951/ce96fe8b-5334-4741-b6e2-1cef4cdacc25)
![WhatsApp Image 2023-09-24 at 01 29 16](https://github.com/Anuprita579/UniFind/assets/141035951/c570e741-07e1-4ef2-a5a2-a05f19c18441)
## TABLE COURSE
![WhatsApp Image 2023-09-24 at 01 30 06](https://github.com/Anuprita579/UniFind/assets/141035951/b1660af2-6ed7-469e-a9bf-8e6a9749358d)
![WhatsApp Image 2023-09-24 at 01 30 40](https://github.com/Anuprita579/UniFind/assets/141035951/96df7fc3-6709-48f9-835d-08cf7fac29e7)
![WhatsApp Image 2023-09-24 at 01 31 07](https://github.com/Anuprita579/UniFind/assets/141035951/77ef7160-e841-4931-9a90-3342dfef67c7)
## TABLE CONTACT
![WhatsApp Image 2023-09-24 at 01 31 49](https://github.com/Anuprita579/UniFind/assets/141035951/e96afd90-c798-463a-9cc2-1151ba03102a)
![WhatsApp Image 2023-09-24 at 01 32 26](https://github.com/Anuprita579/UniFind/assets/141035951/8d54880c-b28d-4ca0-a766-95458e83fd4c)
![WhatsApp Image 2023-09-24 at 01 33 05](https://github.com/Anuprita579/UniFind/assets/141035951/51357a0f-b18b-4d89-96f9-1210b56e6752)



