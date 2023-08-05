## Elasticsearch

###### Docker安装过程

docker pull elasticsearch:7.4.2
docker pull kibana:7.4.2

mkdir -p /mydata/elasticsearch/config
mkdir -p /mydata/elasticsearch/data
chmod 777 mydata
chmod 777 elasticsearch
chmod 777 data
echo "http.host: 0.0.0.0" >> /mydata/elasticsearch/config/elasticsearch.yml



docker run --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" -e ES_JAVA_OPTS="-Xms128m -Xmx256m" -v /mydata/elasticsearch/config/elasticsearch.yml:/usr/share/elasticsearch/config/elasticsearch.yml -v /mydata/elasticsearch/data:/usr/share/elasticsearch/data -v /mydata/elasticsearch/plugins:/usr/share/elasticsearch/plugins -d elasticsearch:7.4.2

浏览器访问 http://主机ip:9200/  检查



查看elasticsearch容器的IP地址--docker容器内部的IP地址
docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' elasticsearch

启动kibana容器

docker run --name kibana -e ELASTICSEARCH_HOSTS=http://152.136.45.76:9200 -p 5601:5601 -d kibana:7.4.2



访问http://你的id地址:5601/

##### 三、初步检索

###### 1、_ca

GET /_cat/nodes：查看所有节点 

GET /_cat/health：查看 es 健康状况 _

GET /_cat/master：查看主节点 _

GET /_cat/indices：查看所有索引 show databases;

###### 2、索引一个文档（保存）

保存一个数据，保存在哪个索引的哪个类型下，指定用哪个唯一标识 PUT customer/external/1；在 customer 索引下的 external 类型下保存 1 号数据

```
PUT customer/external/1
{ "name": "John Doe"
}
```

PUT 和 POST 都可以， POST 新增。如果不指定 id，会自动生成 id。指定 id 就会修改这个数据，并新增版本号 

PUT 可以新增可以修改。PUT 必须指定 id；由于 PUT 需要指定 id，我们一般都用来做修改 操作，不指定 id 会报错。

###### 3、查询文档

```http
GET customer/external/1 
```

```json
结果：
{ "_index": "customer", //在哪个索引
"_type": "external", //在哪个类型
"_id": "1", //记录 id
"_version": 2, //版本号
"_seq_no": 1, //并发控制字段，每次更新就会+1，用来做乐观锁
"_primary_term": 1, //同上，主分片重新分配，如重启，就会变化
"found": true, "_source": { //真正的内容
"name": "John Doe"
}
}
```

更新携带 ?if_seq_no=0&if_primary_term=1