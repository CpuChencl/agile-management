# agile-management
Agile Management Platform

##Technology Stack
* JDK *v7+*
* Spring Core *v4.2.4*
* Spring MVC *v4.2.4*
* Spring Security *v4.0.3*
* Redis *v3.0.6*
* Bootstrap *v3.3.6*
* AngularJS *unknown*
* JQuery *v2.1.4*
* EditorMD Plugin *unknown*
* UEditor Plugin *unknown*
* MySQL *v5.6+*
* Tomcat *v7+*
* Maven *v3+*

##Database Initialization
Read ***application.sql*** under this project.

##MySQL Server Configuration
Modify ***/etc/mysql/my.cnf*** and add snippet as follows:
```    
[mysql]
lower_case_table_names=1
max_allowed_packet = 50M
```

##Start
Enter the project directory, then execute:
```
mvn -DskipTests clean package tomcat7:run
```
Then visit ***http://localhost:8080/login*** in the browser. Login Account: root/root
