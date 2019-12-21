# usecase-kafka-consumer
C:\Program Files\Java\jdk11\jdk-11s
zookeeper-server-start.bat ../../config/zookeeper.properties
kafka-server-start.bat ../../config/server.properties
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic kafka_produce
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic kafka_consume

kafka-topics.bat --list --bootstrap-server localhost:9092
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic kafka_produce --from-beginning
kafka-console-producer.bat --broker-list localhost:9092 --topic kafka_consume
