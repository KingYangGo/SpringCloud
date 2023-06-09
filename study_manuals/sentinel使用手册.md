Linux获取安装包
wget https://github.com/alibaba/Sentinel/releases/download/1.8.1/sentinel-dashboard-1.8.1.jar
启动sentinel
java -jar sentinel-dashboard-1.8.1.jar -Dserver.port=18080
访问http://ip:18080