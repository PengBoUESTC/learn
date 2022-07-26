# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.2/maven-plugin/reference/html/#build-image)

### 工程搭建
    
    1. 创建父工程(learn)，父工程为spring-boot 工程

    2. 创建子工程（user-provider, user-consumer）, 子工程为 普通mvn 工程

    3. 子工程公共接口抽取为 common-interface 子工程，该 子工程为普通 mvn 工程

    4. 子工程依赖导入 common-interface dubbo spring-boot-starter-web curator(版本可能影响启动)

    5. properties 配置文件编辑，dubbo.registry
    
    6. 业务代码开发

### 环境搭建

    1. zookeeper 安装 (docker-compose 虚拟机集群安装 https://hub.docker.com/_/zookeeper)
        ```bash
            brew info zookeeper
            brew install zookeeper
            zkServer start
            zkCli
        ```
    2. dubbo-admin 安装 (docker 虚拟机安装方式 https://hub.docker.com/r/chenchuxin/dubbo-admin)
        ```bash
         // https://github.com/apache/dubbo-admin
         // 在 IDEA 中打开工程，依赖安装，构建 jar包
         java -jar dubbo-admin-xxx.jar
        ```
    3. 在同一台机器安装，注意 端口占用问题

### 目前问题
    
    1. dubbo-admin 有时看不到 服务？？？
    
    