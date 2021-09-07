# passworedCloud
passwored  alibaba cloud 项目分享
****
docker nacos 配置
~~~~
docker run -d -p 8848:8848 --env MODE=standalone  --name nacos  nacos/nacos-server:1.4.1
~~~~
****
docker sentinel 配置
~~~~
docker run --name sentinel -d  -p 8858:8858  bladex/sentinel-dashboard:1.8.0
~~~~
****
docker seata 配置
~~~~
docker run -d --name  seata1.3.0 -p 8091:8091  -e SEATA_IP=192.168.0.1  -v /Users/wangke/seata1.3/seata-server:/seata-server seataio/seata-server:1.3.0
~~~~
****
docker mysql 配置
~~~~
docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=123456 -e TZ=Asia/Shanghai -d mysql:5.7
~~~~
