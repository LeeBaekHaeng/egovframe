# egovframe 3.9.0

## 1. mariadb-10.5.5-winx64

### 1.1 mariadb-install-db.exe 실행

```
cd C:\EGOVFRAME390\mariadb-10.5.5-winx64\bin
mariadb-install-db.exe
```

### 1.2 my.ini 수정

C:\EGOVFRAME390\mariadb-10.5.5-winx64\data\my.ini
```
[mysqld]
datadir=C:/EGOVFRAME390/mariadb-10.5.5-winx64/data
**port=3306
**character-set-server=utf8
[client]
**port=3306
plugin-dir=C:/EGOVFRAME390/mariadb-10.5.5-winx64/lib/plugin
```

### 1.3 mysqld.exe 실행

```
cd C:\EGOVFRAME390\mariadb-10.5.5-winx64\bin
mysqld.exe
```

### 1.4 MariaDB connection
```
Server Host: localhost
Port: 3306
Username: root
Password:
```
