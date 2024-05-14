# Mensageria com Kafka (Spring Boot)

Este projeto consiste em duas partes que serão executadas em portas diferentes: um Produtor (responsável por enviar informações) e um Consumidor (responsável por receber essas informações).

## Java (versão)
- Java 17

## Spring Boot (versão)
- Spring Boot 3.2.5

## IDE
- IntelliJ

## Requisição HTTP
- API Dog

## Dependências (Spring Boot)
- Spring Web
- Spring for Apache Kafka
- Spring Boot DevTools

## Configuração do arquivo application.yml

- application.yml (Producer)
```yml
server:
  port: 9090

topicos:
  pagamento:
    request:
      topic: "pagamento.request.topic.v1"
```

- application.yml (Consumer)
```yml
server:
  port: 8080

topicos:
  pagamento:
    request:
      topic: "pagamento.request.topic.v1"
```

## Configurando o Kafka:

- Realize o Download do Kafka: https://www.apache.org/dyn/closer.cgi?path=/kafka/3.7.0/kafka_2.13-3.7.0.tgz
- Extraia o Kafka:
```bash
$ tar -xzf kafka_2.13-3.7.0.tgz
```
- Entre no diretório:
```bash
$ cd kafka_2.13-3.7.0
```
- Agora você precisa abrir dois terminais um para o ZooKeeper e outro para o Kafka e inserir os comandos:

ZooKeeper:
```bash
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```
Kafka:
```bash
$ bin/kafka-server-start.sh config/server.properties
```
