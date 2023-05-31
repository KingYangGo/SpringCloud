###### Linux下nginx启动命令

./nginx -c /usr/local/nginx/conf/nginx.conf

1、进入到安装的目录里面 whereis nginx

2、进入该路径：cd /usr/local/nginx/sbin

3、启动nginx 命令： ./nginx 出现下面启动成功

4、查看nginx 的状态 ps -ef | grep nginx 出现master 则启动成功

![16.png](http://img.558idc.com/uploadfile/allimg/linux-1/1661246769968723.png)

5、关闭nginx 命令 kill -9 进程号，则关闭nginx

6、停止 nginx 命令： ./nginx -s stop

7、重启nginx命令：./nginx -s reload