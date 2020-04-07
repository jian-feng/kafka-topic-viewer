デモ用サンプルアプリ
===========================

> [kafka-topics-ui](/kafka-topics-ui)は、
もっと簡単に使え、機能が多いため、お薦めです。

***廃止 2019/05/22***  

元のプロジェクトは、[こちら][1]になります。

[1]: https://gitlab.com/appdev-demos/camel-kafka-vr

このプロジェクトは、Spring-bootベースのCamelサンプルです。

このサンプルでは、Camelを使用してKafkaと連携させ、オフセットを前後に移動する(forward/backward)ことで、さまざまなイベントのリプレイ機能を紹介します。

![swagger](assets/swagger.png)

また、イベントやリプレイを視覚的に表現するために、KafkaトピックおよびCamelコンシューマの3Dビューが組み込まれています。

![3d-viewer](assets/3d-viewer.png)


## ローカル環境での実行方法:

前提: Kafkaが予めセットアップ済み

### 1. Create a topic called `my-cluster-test`

	bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 3 --partitions 1 --topic my-cluster-test

### 2. Run the App

	git clone git@github.com:G-Monoplus-Cloud/KafkaPoc.git
	cd KafkaPoc/kafka-topic-viewer
	mvn clean package
	java -jar ./target/kafka-topic-viewer-0.1-SNAPSHOT.jar 

> Kafka Brokerの情報を上書きしたい場合は、  
`java -jar ./target/kafka-topic-viewer-0.1-SNAPSHOT.jar --kafka.broker=192.168.33.71:9092` 

### 3. View REST operations with swagger UI    

[http://localhost:8080/webjars/swagger-ui/2.1.0/index.html?url=/camel/api-docs#](http://localhost:8080/webjars/swagger-ui/2.1.0/index.html?url=/camel/api-docs#)

> リモートからアクセスする場合は、予めSSHポートフォーワードしてブラウザで開いてください。  
`ssh -i id_rsa -p 60000 root@kafka1dev.e-paas.net -L 8080:localhost:8080`


### 4. Graphical view

[http://localhost:8290/](http://localhost:8290/)    
  or  
[http://localhost:8290/topicview.html](http://localhost:8290/topicview.html)

> リモートからアクセスする場合は、予めSSHポートフォーワードしてブラウザで開いてください。  
`ssh -i id_rsa -p 60000 root@kafka1dev.e-paas.net -L 8290:localhost:8290`

### 5. To clean topic, delete and recreate with no consumers running

	bin/kafka-topics.sh --zookeeper localhost:2181 --delete --topic my-cluster-test
