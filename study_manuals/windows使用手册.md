###### 查看端口被占用情况

netstat -ano |findstr 8080

###### 根据PID杀掉进程

taskkill -PID 24068 -F