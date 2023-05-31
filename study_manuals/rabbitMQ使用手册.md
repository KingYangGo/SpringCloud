#### rabbitMQ安装启动过程

1、进入[rabbitmq](https://so.csdn.net/so/search?q=rabbitmq&spm=1001.2101.3001.7020)的sbin目录，进入CMD

2、输入`./rabbitmq-plugins enable rabbitmq_management启用管理服务。`

3、输入./rabbitmqctl start_app启动服务。

出错可以使用

`rabbitmqctl stop` ：停止rabbitmq
`　　rabbitmq-server restart` : 重启rabbitmq

#### **Linux安装RabbitMQ**

[(80条消息) RabbitMQ之Linux安装_linux rabbitmq user can only log in via localhost_yzm4399的博客-CSDN博客](https://blog.csdn.net/qq_43654581/article/details/121418365)

#### 学习网站

[RabbitMQ - 幂等性、优先级、惰性 | OddFar's Notes](https://note.oddfar.com/pages/ee71b9/#惰性队列)