#### **Linux下“/”和“~”的区别**

[(115条消息) Linux下“/”和“~”的区别_lq_kl的博客-CSDN博客_linux](https://blog.csdn.net/lq_kl/article/details/81056241?spm=1001.2101.3001.6650.6&utm_medium=distribute.pc_relevant.none-task-blog-2~default~OPENSEARCH~Rate-6-81056241-blog-81745417.pc_relevant_3mothn_strategy_and_data_recovery&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2~default~OPENSEARCH~Rate-6-81056241-blog-81745417.pc_relevant_3mothn_strategy_and_data_recovery&utm_relevant_index=13)

#### **Ctrl+l清屏**

#### **删除一个目录**

rm -rf name 

-r向下递归

-f强制删除

-i交互式删除

#### **递归新建一个目录**

mkdir -p /app/redis

#### **Linux命令 - echo命令**

###### **1.语法：**

echo [选项] [输出内容]

##### **2.功能：**

  输出内容到控制台。

##### **3.参数：**

-n  不在最后自动换行。

-e  使用-e扩展参数选项时，与如下参数一起使用，有不同含义，支持反斜线控制的字符转换

​	\a 发出警告声。

​	\b 删除前一个字符。

​	\c 最后不加上换行符号。

​	\f 换行但光标仍旧停留在原来的位置。

​	\n 换行且光标移至行首。

​	\r 光标移至行首，但不换行。

​	\t 制表符，也就是Tab键。

​	\v 与\f相同。

​	\\ 插入\字符。

​	\033[30m 黑色字 \033[0m

​	\033[31m 红色字 \033[0m

​	\033[32m 绿色字 \033[0m

​	\033[33m 黄色字 \033[0m

​	\033[34m 蓝色字 \033[0m

​	\033[35m 紫色字 \033[0m

​	\033[36m 天蓝字 \033[0m

​	\033[37m 白色字 \033[0m

​	\033[40;37m 黑底白字 \033[0m

​	\033[41;37m 红底白字 \033[0m

​	\033[42;37m 绿底白字 \033[0m

​	\033[43;37m 黄底白字 \033[0m

​	\033[44;37m 蓝底白字 \033[0m

​	\033[45;37m 紫底白字 \033[0m

​	\033[46;37m 天蓝底白字 \033[0m

​	\033[47;30m 白底黑字 \033[0m

##### **4.常用范例：**

###### **例一：输出hello world**

 

命令：echo -e "hello\tworld"

 

[root@localhost test]# echo "hello\tworld"

hello\tworld

[root@localhost test]# echo -e "hello\tworld"

hello	world

1

2

3

4

###### **例二：颜色打印输出内容**

 

命令：sh color.sh

 

  可以把命令写进shell脚本在调用脚本执行，也可以直接执行命令。

 

\#color.sh内容如下

echo -e "\033[35mHello World\033[0m"

echo -e "\033[46;37mHello World\033[0m"

echo "Hello World"

 

 

###### **例三：覆盖log.txt里面的内容**

 

命令：echo Hello World > log.txt

 

  > 表示覆盖，原内容被覆盖。

 

[root@localhost test]# cat log.txt 

abcdefghigklmnopqrstuvwxyz

[root@localhost test]# echo Hello World > log.txt 

[root@localhost test]# cat log.txt 

Hello World

###### **例四：在log.txt追加内容**

 

命令：echo Hello World2 >> log.txt

  >> 表示追加，原内容不变。

[root@localhost test]# cat log.txt 

Hello World

[root@localhost test]# echo Hello World2 >> log.txt 

[root@localhost test]# cat log.txt 

Hello World

Hello World

##### **关闭linx防火墙**

防火墙状态：systemctl status firewalld.service

 

Active: inactive (dead)/active(running)

 

关闭firewall：systemctl stop firewalld.service

 

重启：systemctl restart firewalld.service

 

启动：systemctl start firewalld.service

 

禁止firewall开机启动:systemctl disable firewalld.service

 

设置开机启用：systemctl enable firewalld.service

 

查看服务是否开机启动：systemctl is-enabled firewalld.service;echo

 

查看已启动的服务列表：systemctl list-unit-files|grep enabled

 

查看已经开放的端口：firewall-cmd --list-ports

##### **虚拟机下 centos7 网络间歇性断网**

 

vi /etc/sysconfig/network-scripts/ifcfg-ens33

编辑文件，添加一行内容:

NM_CONTROLLED=no

 

#### **Centos7网络配置文件**

###### **进入网络配置文件目录 ls查看目录**

cd /etc/sysconfig/network-scripts

ls

vim ifcfg-ens33

 

代码示例:

 

TYPE=Ethernet

PROXY_METHOD=none

BROWSER_ONLY=no

BOOTPROTO=static  #启动的时候的 IP 取得的协议，这里是固定的，如果是动态主机的话，要改成 dhcp 才行#

DEFROUTE=yes

IPV4_FAILURE_FATAL=no

IPV6INIT=yes

IPV6_AUTOCONF=yes

IPV6_DEFROUTE=yes

IPV6_FAILURE_FATAL=no

IPV6_ADDR_GEN_MODE=stable-privacy

NAME=ens33   #设定网卡的名称，要跟文件名称对应 #

UUID=f5e37a10-3da9-47af-8dbb-370b7bf24509 

DEVICE=ens33  #设定网卡的名称，要跟文件名称对应 #

ONBOOT=yes   #是否在开机的的时候启动网卡# 

IPADDR=192.168.0.7     #IP 地址#  必设置

GATEWAY=192.168.0.2    #网关地址#  必须设置

NETWORK=192.168.0.3　　   #该网段的第一个 IP# 可以不设置

BROADCAST=192.168.0.255　　#最后一个同网段的广播地址#  可以不设置

NETMASK=255.255.255.0   #子网掩码#  必设置

DNS1=192.168.0.1  必设置  跟ip地址一样，只需要把最后末尾改成1即可

\#GATEWAYDEV=eth0 推荐阅读： linux网络配置文件(redhat、ubuntu系统) centos基本网络配置-网卡eth0、DNS、Host等

linux主机刚安装好时，ONBOOT属性的缺省值为no，需要修改为yes，BOORPROTO缺省值为dhcp，需要修改为static。

然后，设置IP地址，网络掩码，网关等。

三种选择使用第一第二都可以

###### **重启网络**

systemctl restart network #重启网卡

service network restart  #重启网卡network服务

systemctl enable network #开机启动网卡

ping [www.baidu.com](http://www.baidu.com)

 

###### **设置DNS地址**

vi /etc/resolv.conf   //编辑 resolv.conf文件 

nameserver 114.114.114.114  //添加DNS地址

 

###### **查看端口**

iptables-save

###### 查看开放指定端口

lsof -i:3306

###### **开放端口**

firewall-cmd --zone=public --add-port=80/tcp --permanent#开放80端口

###### **重载防火墙**

firewall-cmd --reload

###### **Linux安装RabbitMQ**

[(80条消息) RabbitMQ之Linux安装_linux rabbitmq user can only log in via localhost_yzm4399的博客-CSDN博客](https://blog.csdn.net/qq_43654581/article/details/121418365)



###### 解压文件

tar -zxvf filename



###### 拷贝文件

常见用法：
1、复制当前目录下的文件fileA到目录directory里面。

cp fileA /directory/

2、复制当前目录下的文件fileA、fileB、fileC到目录directory里面。

cp fileA fileB fileC /directory/

3、复制当前目录下的文件fileA到目录directory里面，并改名为fileB。

cp fileA /directory/fileB

4、复制目录directoryA下面的所有文件到目录directoryB里面。

cp -r /directoryA/* /directoryB/

**-a**:此参数的效果和同时指定"-dpR"参数相同;
**-d**:当复制符号连接时，把目标文件或目录也建立为符号连接，并指向与源文件或目录连接的原始文件或目录;
**-f**:强行复制文件或目录，不论目标文件或目录是否已存在;
**-i**:覆盖既有文件之前先询问用户;
**-l**:对源文件建立硬连接，而非复制文件;
**-p**:保留源文件或目录的属性;
**-R/r**:递归处理，将指定目录下的所有文件与子目录一并处理;
**-s**:对源文件建立符号连接，而非复制文件;
**-u**:使用这项参数后只会在源文件的更改时间较目标文件更新时或是名称相互对应的目标文件并不存在时，才复制文件;
**-s**:在备份文件时，用指定的后缀“SUFFIX”代替文件的默认后缀;
**-b**:覆盖已存在的文件目标前将目标文件备份;
**-v**:详细显示命令执行的操作。

######  Linux安装Mysql

创建远程登录用户

create user 'yk'@'%' IDENTIFIED WITH mysql_native_password  BY '123456';

https://blog.csdn.net/xhmico/article/details/125197747

[(80条消息) Linux-安装MySQL（详细教程）_linux安装mysql_多加点辣也没关系的博客-CSDN博客](https://blog.csdn.net/xhmico/article/details/125197747)

 Linux运行Mysql脚本

source /opt2/mysql/create.sql;   # 先运行表创建脚本
source /opt2/mysql/populate.sql;  # 在运行表填充脚本

######  linux系统更新profile文件立即生效

方法一：让/etc/profile文件修改后立即生效 ,可以使用如下命令: # . /etc/profile 注意: . 和 /etc/profile 有空格

方法二：让/etc/profile文件修改后立即生效 ,可以使用如下命令: # source /etc/profile

###### 杀掉一个进程

killall -9 nginx 

######  管道查找

 ps -ef|grep nginx

 

 