# egovframe 3.9.0

## mariadb-10.5.5-winx64

### mariadb-install-db.exe 실행

```
cd C:\EGOVFRAME390\mariadb-10.5.5-winx64\bin
mariadb-install-db.exe
```

### my.ini 수정

C:\EGOVFRAME390\mariadb-10.5.5-winx64\data\my.ini
```
[mysqld]
datadir=C:/EGOVFRAME390/mariadb-10.5.5-winx64/data
[client]
plugin-dir=C:/EGOVFRAME390/mariadb-10.5.5-winx64/lib/plugin
```

### mysqld.exe 실행

```
cd C:\EGOVFRAME390\mariadb-10.5.5-winx64\bin
mysqld.exe
```
