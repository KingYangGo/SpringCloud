### Linux系统下的redis操作

###### 进入cli数据操作

docker exec -it redis redis-cli

###### AOF持久化

vim redis.conf

appendonly  yes

