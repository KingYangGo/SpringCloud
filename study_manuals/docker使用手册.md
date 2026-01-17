##### **配置镜像加速器命令：**

sudo mkdir -p /etc/docker sudo tee /etc/docker/daemon.json <<-'EOF' { "registry-mirrors": ["https://a8a1l2ae.mirror.aliyuncs.com"] } 

EOF 
 
sudo systemctl daemon-reload 

sudo systemctl restart docker

 

#### **私服仓库**

docker run -d -p 5000:5000 -v /ykuse/myregistry/:/tmp/registry --privileged=true registry

#### **curl验证私服库上有什么镜像**

curl -XGET http://172.17.0.1:5000/v2/_catalog

#### **pull到本地并运行**

docker pull 172.17.0.1:5000/ykubuntu:1.3

 

#### **Docker搭建Mysql**

docker run -d -p 3306:3306 --privileged=true -v /ykuse/mysql/log:/var/log/mysql -v /ykuse/mysql/data:/var/lib/mysql -v /ykuse/mysql/conf:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=123456 --name mysql mysql:5.7

Docker exec -it mysql bash

Vim /ykuse/mysql/conf/my.cnf

[client]

default_character_set=utf8

[mysqld]

skip-grant-tables

collation_server = utf8_general_ci

character_set_server = utf8

server_id=101

binlog-ignore-db=mysql

log-bin=mall-mysql-bin

binlog_cache_size=1M

binlog_format=mixed

expire_logs_days=7

slave_skip_errors=1062

mysql -uroot -p

flush privileges;

set password for 'root'@'localhost'=password('root');

设置远程访问

GRANT ALL PRIVILEGES ON *.* TO 'root'@'%'IDENTIFIED BY 'root' WITH GRANT OPTION;

flush privileges;

#### **window启动mysql服务**

net start mysql

修改密码

alter user 'root'@'localhost' identified by 'youpassword';

flush privileges;

 

#### **Docker待搭建Redis**

 

docker run -p 6379:6379 --name myr3 --privileged=true 

-v /app/redis/redis.conf:/etc/redis/redis.conf 

-v /app/redis/data:/data -d redis:6.0.8 

redis-server /etc/redis/redis.conf #redis 服务读取配置以前是bash

 

Docker exec -it mymysql

进入命令行

Redis-cli

#### Docker容器搭建nginx

docker run -p 80:80 --name nginx -d nginx:1.10

docker container cp nginx:/etc/nginx  //复制nginx容器的配置到当前目录下

docker run -p 80:80 --name nginx -v /mydata/nginx/html:/usr/share/nginx/html -v /mydata/nginx/logs:/var/log/nginx -v /mydata/nginx/conf:/etc/nginx  -d nginx:1.10

set number

#### Linux搭建Mysql报错

##### **mysqld: Can‘t read dir of ‘/etc/mysql/conf.d/‘ (Errcode: 2 - No such file or directory**

 [(83条消息) mysqld: Can‘t read dir of ‘/etc/mysql/conf.d/‘ (Errcode: 2 - No such file or directory_倒在程序员大门前的博客-CSDN博客](https://blog.csdn.net/qq_45564783/article/details/126440171)

#### 设置容器实例跟随docker自动启动

docker update nginx --restart=always

docker update elasticsearch --restart=always

#### 搭建elasticsearch

/mydata/elasticsearch/config/elasticsearch.yml : /usr/share/elasticsearch/config/elasticsearch.yml

/mydata/elasticsearch/data : /usr/share/elasticsearch/data

/mydata/elasticsearch/plugins : /usr/share/elasticsearch/plugins

#### window安装nginx

**start nginx**

nginx -s reload

nginx -s stop

netstat -ano

netstat -aon|findstr "80"

[taskkill](https://so.csdn.net/so/search?q=taskkill&spm=1001.2101.3001.7020) /t /f /pid



过滤字段配置没有预制逻辑删除

仓库字段预制逻辑删除为0

到货入库、退货单入库

