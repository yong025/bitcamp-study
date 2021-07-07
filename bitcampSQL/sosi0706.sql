SQL> select * from sosi0706
  2  ;
select * from sosi0706
              *
ERROR at line 1:
ORA-00942: table or view does not exist 


SQL> edit  C:\Users\stell\git\bitcamp-study\bitcampSQL\sosi.sql

SQL> 
SQL> 
SQL> @  C:\Users\stell\git\bitcamp-study\bitcampSQL\sosi.sql
drop table sosi
           *
ERROR at line 1:
ORA-00942: table or view does not exist 



Table created.

SQL> clear screen

SQL> @  C:\Users\stell\git\bitcamp-study\bitcampSQL\sosi.sql

Table dropped.


Table created.

SQL> select * from sosi;

no rows selected

SQL> @  C:\Users\stell\git\bitcamp-study\bitcampSQL\sosi.sql
create table sosi(
             *
ERROR at line 1:
ORA-00955: name is already used by an existing object 


SQL> desc sosi;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(4)
 NAME                                               VARCHAR2(20)
 SALARY                                             NUMBER
 BIRTH                                              DATE
 EMAIL                                              VARCHAR2(20)
 GRADE                                              VARCHAR2(4)

SQL> clear sosi;
SP2-0158: unknown CLEAR option "sosi"
SQL> commi;
SP2-0042: unknown command "commi" - rest of line ignored.
SQL> commit;

Commit complete.

SQL> clear screen

SQL> insert sosi(id,name,salary,birth,email,grade)
  2  values (7789,'hong',79,sysdate,'bc@sk.com','F');
insert sosi(id,name,salary,birth,email,grade)
       *
ERROR at line 1:
ORA-00925: missing INTO keyword 


SQL> desc sosi;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(4)
 NAME                                               VARCHAR2(20)
 SALARY                                             NUMBER
 BIRTH                                              DATE
 EMAIL                                              VARCHAR2(20)
 GRADE                                              VARCHAR2(4)

SQL> insert sosi values(7788, 'hong', '79,sysdate,'bc@sk.com','F');
ERROR:
ORA-01756: quoted string not properly terminated 


SQL> insert  into sosi(id,name,salary,birth,email,grade)
  2    values(7789, 'hong', 79, sysdate, 'bc@sk.com', 'F');

1 row created.

SQL> insert  into sosi(id,name,salary,birth,email,grade)
  2    values(7790, 'lee', 23, sysdate, 'bb@sk.com', 'C');

1 row created.

SQL> insert  into sosi
  2   values(7754, 'kim', 57, sysdate, 'aa@sk.com', 'A');

1 row created.

SQL> select * from sosi;

        ID NAME                                         SALARY BIRTH            
---------- ---------------------------------------- ---------- --------         
EMAIL                                    GRADE                                  
---------------------------------------- --------                               
      7789 hong                                             79 21/07/06         
bc@sk.com                                F                                      
                                                                                
      7790 lee                                              23 21/07/06         
bb@sk.com                                C                                      
                                                                                
      7754 kim                                              57 21/07/06         
aa@sk.com                                A                                      
                                                                                

SQL> clear screen

SQL> solumn name format a10;
SP2-0734: unknown command beginning "solumn nam..." - rest of line ignored.
SQL> column name format a10;
SQL> col email for a10;
SQL> col name for a10;
SQL> select * from sosi;

        ID NAME           SALARY BIRTH    EMAIL      GRADE                      
---------- ---------- ---------- -------- ---------- --------                   
      7789 hong               79 21/07/06 bc@sk.com  F                          
      7790 lee                23 21/07/06 bb@sk.com  C                          
      7754 kim                57 21/07/06 aa@sk.com  A                          

SQL> col id for 999;
SQL> select * from sosi;

  ID NAME           SALARY BIRTH    EMAIL      GRADE                            
---- ---------- ---------- -------- ---------- --------                         
#### hong               79 21/07/06 bc@sk.com  F                                
#### lee                23 21/07/06 bb@sk.com  C                                
#### kim                57 21/07/06 aa@sk.com  A                                

SQL> col id for 9999;
SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL      GRADE                           
----- ---------- ---------- -------- ---------- --------                        
 7789 hong               79 21/07/06 bc@sk.com  F                               
 7790 lee                23 21/07/06 bb@sk.com  C                               
 7754 kim                57 21/07/06 aa@sk.com  A                               

SQL> col grade for a3;
SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL      GRA                             
----- ---------- ---------- -------- ---------- ---                             
 7789 hong               79 21/07/06 bc@sk.com  F                               
 7790 lee                23 21/07/06 bb@sk.com  C                               
 7754 kim                57 21/07/06 aa@sk.com  A                               

SQL> col grade for a6;
SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL      GRADE                           
----- ---------- ---------- -------- ---------- ------                          
 7789 hong               79 21/07/06 bc@sk.com  F                               
 7790 lee                23 21/07/06 bb@sk.com  C                               
 7754 kim                57 21/07/06 aa@sk.com  A                               

SQL> insert into sosi
  2  values(7, '김고은', 100, to_date('17/12/12'), 'aa@girl/com', 'A');

1 row created.

SQL> values(2, '티파니', 90, to_date('17/11/13'), 'BB@girl.com', 'B');
SP2-0734: unknown command beginning "values(2, ..." - rest of line ignored.
SQL> insert into sosi
  2  values(2, '티파니', 90, to_date('17/11/13'), 'BB@girl.com', 'B');

1 row created.

SQL> insert into sosi
  2  values(3, '제니', 120, to_date('17/10/26'), 'dd@girl.com', 'C');

1 row created.

SQL> insert into sosi
  2  values(4, '수영', 90, sysdate, 'cc@girl.com', 'A');

1 row created.

SQL> commit;

Commit complete.

SQL> insert into sosi
  2  values(6, '태연', 100, to_date('19/12/12'), 'ee@girl.com', 'A');

1 row created.

SQL> commit;

Commit complete.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL      GRADE                           
----- ---------- ---------- -------- ---------- ------                          
 7789 hong               79 21/07/06 bc@sk.com  F                               
 7790 lee                23 21/07/06 bb@sk.com  C                               
 7754 kim                57 21/07/06 aa@sk.com  A                               
    7 김고은            100 17/12/12 aa@girl/co A                               
                                     m                                          
                                                                                
    2 티파니             90 17/11/13 BB@girl.co B                               
                                     m                                          
                                                                                
    3 제니              120 17/10/26 dd@girl.co C                               
                                     m                                          

   ID NAME           SALARY BIRTH    EMAIL      GRADE                           
----- ---------- ---------- -------- ---------- ------                          
                                                                                
    4 수영               90 21/07/06 cc@girl.co A                               
                                     m                                          
                                                                                
    6 태연              100 19/12/12 ee@girl.co A                               
                                     m                                          
                                                                                

8 rows selected.

SQL> col email for a14;
SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 김고은            100 17/12/12 aa@girl/com    A                           
    2 티파니             90 17/11/13 BB@girl.com    B                           
    3 제니              120 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

8 rows selected.

SQL> select name,salary, grade from sosi;

NAME           SALARY GRADE                                                     
---------- ---------- ------                                                    
hong               79 F                                                         
lee                23 C                                                         
kim                57 A                                                         
김고은            100 A                                                         
티파니             90 B                                                         
제니              120 C                                                         
수영               90 A                                                         
태연              100 A                                                         

8 rows selected.

SQL> commit;

Commit complete.

SQL> 
SQL> select name,salary, grade from sosi where id = 2;

NAME           SALARY GRADE                                                     
---------- ---------- ------                                                    
티파니             90 B                                                         

SQL> select id, name,salary, grade from sosi where id = 2;

   ID NAME           SALARY GRADE                                               
----- ---------- ---------- ------                                              
    2 티파니             90 B                                                   

SQL> select rownum, id, name, salary, birth, email, grade from sosi;

    ROWNUM    ID NAME           SALARY BIRTH    EMAIL          GRADE            
---------- ----- ---------- ---------- -------- -------------- ------           
         1  7789 hong               79 21/07/06 bc@sk.com      F                
         2  7790 lee                23 21/07/06 bb@sk.com      C                
         3  7754 kim                57 21/07/06 aa@sk.com      A                
         4     7 김고은            100 17/12/12 aa@girl/com    A                
         5     2 티파니             90 17/11/13 BB@girl.com    B                
         6     3 제니              120 17/10/26 dd@girl.com    C                
         7     4 수영               90 21/07/06 cc@girl.com    A                
         8     6 태연              100 19/12/12 ee@girl.com    A                

8 rows selected.

SQL> select rownum, * from sosi;
select rownum, * from sosi
               *
ERROR at line 1:
ORA-00936: missing expression 


SQL> select rownum, s. * from s;
select rownum, s. * from s
                         *
ERROR at line 1:
ORA-00942: table or view does not exist 


SQL> select rownum, s. * from sosi s;

    ROWNUM    ID NAME           SALARY BIRTH    EMAIL          GRADE            
---------- ----- ---------- ---------- -------- -------------- ------           
         1  7789 hong               79 21/07/06 bc@sk.com      F                
         2  7790 lee                23 21/07/06 bb@sk.com      C                
         3  7754 kim                57 21/07/06 aa@sk.com      A                
         4     7 김고은            100 17/12/12 aa@girl/com    A                
         5     2 티파니             90 17/11/13 BB@girl.com    B                
         6     3 제니              120 17/10/26 dd@girl.com    C                
         7     4 수영               90 21/07/06 cc@girl.com    A                
         8     6 태연              100 19/12/12 ee@girl.com    A                

8 rows selected.

SQL> select * from sosi where grade = 'b';

no rows selected

SQL> select * from sosi where grade = 'B';

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
    2 티파니             90 17/11/13 BB@girl.com    B                           

SQL> select * from sosi where grade = 'A';

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 김고은            100 17/12/12 aa@girl/com    A                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

SQL> select * from siso where id = 2;
select * from siso where id = 2
              *
ERROR at line 1:
ORA-00942: table or view does not exist 


SQL> select * from siso where id = 4;
select * from siso where id = 4
              *
ERROR at line 1:
ORA-00942: table or view does not exist 


SQL> select * from sosi where id = 4;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
    4 수영               90 21/07/06 cc@girl.com    A                           

SQL> select * from sosi where id = 2;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
    2 티파니             90 17/11/13 BB@girl.com    B                           

SQL> select * from sosi where salary = 100;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
    7 김고은            100 17/12/12 aa@girl/com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

SQL> select * from sosi where salary <= 100;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 김고은            100 17/12/12 aa@girl/com    A                           
    2 티파니             90 17/11/13 BB@girl.com    B                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

7 rows selected.

SQL> select * from sosi where id <= 100;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
    2 티파니             90 17/11/13 BB@girl.com    B                           
    3 제니              120 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           
    7 김고은            100 17/12/12 aa@girl/com    A                           

SQL> select * from sosi where salary = 100;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
    7 김고은            100 17/12/12 aa@girl/com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

SQL> select * from sosi where salary > 100;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
    3 제니              120 17/10/26 dd@girl.com    C                           

SQL> clear screen

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 김고은            100 17/12/12 aa@girl/com    A                           
    2 티파니             90 17/11/13 BB@girl.com    B                           
    3 제니              120 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

8 rows selected.

SQL> update sosi set id = 2100 where id=2;

1 row updated.

SQL> update sosi set id = 3000 where id=3;

1 row updated.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 김고은            100 17/12/12 aa@girl/com    A                           
 2100 티파니             90 17/11/13 BB@girl.com    B                           
 3000 제니              120 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

8 rows selected.

SQL> commit;

Commit complete.

SQL> update sosi set email = aa@girl.com where id=7;
update sosi set email = aa@girl.com where id=7
*
ERROR at line 1:
ORA-04054: database link GIRL.COM does not exist 


SQL> update sosi set email = 'aa@girl.com' where id=7;

1 row updated.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 김고은            100 17/12/12 aa@girl.com    A                           
 2100 티파니             90 17/11/13 BB@girl.com    B                           
 3000 제니              120 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

8 rows selected.

SQL> commit;

Commit complete.

SQL> rollback;

Rollback complete.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 김고은            100 17/12/12 aa@girl.com    A                           
 2100 티파니             90 17/11/13 BB@girl.com    B                           
 3000 제니              120 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

8 rows selected.

SQL> update sosi set name ='bit';

8 rows updated.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 bit                79 21/07/06 bc@sk.com      F                           
 7790 bit                23 21/07/06 bb@sk.com      C                           
 7754 bit                57 21/07/06 aa@sk.com      A                           
    7 bit               100 17/12/12 aa@girl.com    A                           
 2100 bit                90 17/11/13 BB@girl.com    B                           
 3000 bit               120 17/10/26 dd@girl.com    C                           
    4 bit                90 21/07/06 cc@girl.com    A                           
    6 bit               100 19/12/12 ee@girl.com    A                           

8 rows selected.

SQL> rollback;

Rollback complete.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 김고은            100 17/12/12 aa@girl.com    A                           
 2100 티파니             90 17/11/13 BB@girl.com    B                           
 3000 제니              120 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

8 rows selected.

SQL> commit;

Commit complete.

SQL> update sosi set name ='고길동' where id = 2100;

1 row updated.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 김고은            100 17/12/12 aa@girl.com    A                           
 2100 고길동             90 17/11/13 BB@girl.com    B                           
 3000 제니              120 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

8 rows selected.

SQL> update sosi set name ='고갈비' where salary = 100, birth=to_date('17/12/12');
update sosi set name ='고갈비' where salary = 100, birth=to_date('17/12/12')
                                                    *
ERROR at line 1:
ORA-00933: SQL command not properly ended 


SQL> update sosi set name ='고갈비' where salary = 100, birth=to_char('17/12/12');
update sosi set name ='고갈비' where salary = 100, birth=to_char('17/12/12')
                                                    *
ERROR at line 1:
ORA-00933: SQL command not properly ended 


SQL> update sosi set name ='고갈비' where  birth=to_date('17/12/12');

1 row updated.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 고갈비            100 17/12/12 aa@girl.com    A                           
 2100 고길동             90 17/11/13 BB@girl.com    B                           
 3000 제니              120 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

8 rows selected.

SQL> update sosi set name ='고갈갈' where salary = 100, birth=to_char('17/12/12');
update sosi set name ='고갈갈' where salary = 100, birth=to_char('17/12/12')
                                                    *
ERROR at line 1:
ORA-00933: SQL command not properly ended 


SQL> update sosi set
  2  name='고갈갈', salary=100, birth=to_char('20/07/05'),
  3  email='lee@ko.comy where id =2100;
ERROR:
ORA-01756: quoted string not properly terminated 


SQL> update sosi set
  2  name='고갈갈', salary=100, birth=to_date('20/07/05'),
  3  where id = 3000;
where id = 3000
   *
ERROR at line 3:
ORA-01747: invalid user.table.column, table.column, or column specification 


SQL>  update sosi set name='고길동', salary=100,
  2       birth=to_char('20/07/05'),
  3       email='lee@ko.com', grade='A' where id=2100 ;

1 row updated.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 고갈비            100 17/12/12 aa@girl.com    A                           
 2100 고길동            100 20/07/05 lee@ko.com     A                           
 3000 제니              120 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

8 rows selected.

SQL> update sosi set name='cake', salary= 21, where id=3000;
update sosi set name='cake', salary= 21, where id=3000
                                         *
ERROR at line 1:
ORA-01747: invalid user.table.column, table.column, or column specification 


SQL> update sosi set name='cake', salary= 21 where id=3000;

1 row updated.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 고갈비            100 17/12/12 aa@girl.com    A                           
 2100 고길동            100 20/07/05 lee@ko.com     A                           
 3000 cake               21 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           

8 rows selected.

SQL> commit;

Commit complete.

SQL> insert into sosi(
  2  d;
d
*
ERROR at line 2:
ORA-00917: missing comma 


SQL> insert into sosi
  2  values(6673, 'LA', 55, sysdate, 'ca@naver.com', 'F');

1 row created.

SQL> values(6623, 'LB', 33, to_date('19/12/12'), 'cb@naver.com', 'F');
SP2-0734: unknown command beginning "values(662..." - rest of line ignored.
SQL> values(6672, 'LB', 33, to_date('19/12/12'), 'cb@naver.com', 'F');
SP2-0734: unknown command beginning "values(667..." - rest of line ignored.
SQL> insert into sosi
  2  values(6672, 'LB', 33, to_date('19/12/12'), 'cb@naver.com', 'F');

1 row created.

SQL> insert into sosi
  2  values(6671, 'LC', 23, to_date('19/12/04'), 'ck@naver.com', 'F');

1 row created.

SQL> clear screen

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 고갈비            100 17/12/12 aa@girl.com    A                           
 2100 고길동            100 20/07/05 lee@ko.com     A                           
 3000 cake               21 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           
 6673 LA                 55 21/07/06 ca@naver.com   F                           
 6672 LB                 33 19/12/12 cb@naver.com   F                           
 6671 LC                 23 19/12/04 ck@naver.com   F                           

11 rows selected.

SQL> delete from sosi where id = 6671;

1 row deleted.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 고갈비            100 17/12/12 aa@girl.com    A                           
 2100 고길동            100 20/07/05 lee@ko.com     A                           
 3000 cake               21 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           
 6673 LA                 55 21/07/06 ca@naver.com   F                           
 6672 LB                 33 19/12/12 cb@naver.com   F                           

10 rows selected.

SQL> insert into sosi
  2  values(6671, 'LC', 23, to_char('19/12/04'), 'ck@naver.com', 'F');

1 row created.

SQL> select * from sosi;

   ID NAME           SALARY BIRTH    EMAIL          GRADE                       
----- ---------- ---------- -------- -------------- ------                      
 7789 hong               79 21/07/06 bc@sk.com      F                           
 7790 lee                23 21/07/06 bb@sk.com      C                           
 7754 kim                57 21/07/06 aa@sk.com      A                           
    7 고갈비            100 17/12/12 aa@girl.com    A                           
 2100 고길동            100 20/07/05 lee@ko.com     A                           
 3000 cake               21 17/10/26 dd@girl.com    C                           
    4 수영               90 21/07/06 cc@girl.com    A                           
    6 태연              100 19/12/12 ee@girl.com    A                           
 6673 LA                 55 21/07/06 ca@naver.com   F                           
 6672 LB                 33 19/12/12 cb@naver.com   F                           
 6671 LC                 23 19/12/04 ck@naver.com   F                           

11 rows selected.

SQL> spool off
