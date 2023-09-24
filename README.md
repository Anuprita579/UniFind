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



