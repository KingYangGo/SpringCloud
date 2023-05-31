###### 查看Mysql身份验证插件

select Host,User,plugin from mysql.user;

###### 修改身份验证插件

本地连接

alter user root@localhost identified with mysql_native_password by '123456';

FLUSH PRIVILEGES；

远程连接

alter user root@'%' identified with mysql_native_password by '123456';

FLUSH PRIVILEGES；