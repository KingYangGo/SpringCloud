###### Windows单机启动方式

startup.cmd -m standalone

###### Nacos查状态

ps -ef |grep nacos

Linux搭建nacos集群

[Linux部署Nacos集群(各种踩坑)-CSDN社区](https://bbs.csdn.net/topics/602722686)

###### 查看nacos运行

*# 用来了几个* ps -ef|grep nacos|grep -v grep | wc -l

window单机启动
startup.cmd -m standalone
访问方式
http://192.168.211.1:8848/nacos/index.html#/

