# _study
springcloud学习

# 微服务

## 什么是微服务

* 就目前而言，对于微服务，业界并没有一个统一的，标准的定义
* 但通常而言，微服务架构是一种架构模式，或者说是一种架构风格，它提倡将单一的应用程序划分成一组小的服务，每个服务运行在其独立的自己的进程内，服务之间互相协调，互相配置，为用户提供最终价值。服务之间采用轻量级的通信机制互相沟通，每个服务都围绕着具体的业务进行构建，并且能够被独立的部署到生产环境中，另外，应尽量避免统一的，集中式的服务管理机制，对具体的一个服务而言，应根据业务上下文，选择合适的语言，工具对其进行构建，可以有一个非常轻量级的集中式管理来协调这些服务，可以使用不同的语言来编写服务，也可以使用不同的数据存储;

**可能有的人觉得官方的话太过生涩，我们从技术维度来理解下:**
微服务化的核心就是将传统的一站式应用，根据业务拆分成一个一个的服务，彻底地去耦合，每一个微服务提供单个业务功能的服务，一个服务做一件事情，从技术角度看就是一种小而独立的处理过程，类似进程的概念，能够自行单独启动或销毁，拥有自己独立的数据库。



微服务的概念源于2014年3月Martin Fowler所写的一篇文章“Microservices”(http://martinfowler.com/articles/microservices.html)。



## 什么是微服务架构

微服务架构的核心思想是，一个应用是由多个小的、相互独立的、微服务组成，这些服务运行在自己的进程中，开发和发布都没有依赖。不同服务通过一些轻量级交互机制来通信，例如 RPC、HTTP 等，服务可独立扩展伸缩，每个服务定义了明确的边界，不同的服务甚至可以采用不同的编程语言来实现，由独立的团队来维护。简单的来说，一个系统的不同模块转变成不同的服务！而且服务可以使用不同的技术加以实现！





## 微服务的优点和缺点

**优点**

* 单一职责原则
* 每个服务足够内聚，足够小，代码容易理解，这样能聚焦一个指定的业务功能或业务需求;·开发简单，开发效率提高，一个服务可能就是专一的只干一件事;
* 微服务能够被小团队单独开发，这个小团队是2~5人的开发人员组成;
* 微服务是松耦合的，是有功能意义的服务，无论是在开发阶段或部署阶段都是独立的。
* 微服务能使用不同的语言开发。
* 易于和第三方集成，微服务允许容易且灵活的方式集成自动部署，通过持续集成工具，如jenkins，Hudson,bamboo
  微服务易于被一个开发人员理解，修改和维护，这样小团队能够更关注自己的工作成果。无需通过合作才能体现价值。
* 微服务允许你利用融合最新技术。
  微服务只是业务逻辑的代码，不会和HTML, CSS或其他界面混合
* 每个微服务都有自己的存储能力，可以有自己的数据库，也可以有统一数据库



**缺点:**

* 微服务架构带来过多的运维操作, 可能需要团队具备一定的 DevOps 技巧.
* 分布式系统可能复杂难以管理。因为分布部署跟踪问题难。当服务数量增加，管理复杂性增加

## 微服务技术栈


![img](https://img-blog.csdn.net/20180819231826706?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xuYXpq/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
![img](https://img-blog.csdn.net/20180819231839747?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xuYXpq/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)




# SpringCloud

## 什么是SpringCloud

SpringCloud,基于SpringBoot提供了一套微服务解决方案，包括服务注册与发现，配置中心，全链路监控，服务网关，负载均衡，熔断器等组件，除了基于NetFlix的开源组件做高度抽象封装之外，还有一些选型中立的开源组件。

SpringCloud利用SpringBoot的开发便利性，巧妙地简化了分布式系统基础设施的开发，SpringCloud为开发人员提供了快速构建分布式系统的一些工具，包括配置管理，服务发现，断路器，路由，微代理，事件总线，全局锁,决策竞选，分布式会话等等，他们都可以用SpringBoot的开发风格做到一键启动和部署。

SpringBoot并没有重复造轮子，它只是将目前各家公司开发的比较成熟，经得起实际考研的服务框架组合起来，通过SpringBoot风格进行再封装，屏蔽掉了复杂的配置和实现原理，最终给开发者留出了一套简单易懂，易部署和易维护的分布式系统开发工具包

SpringCloud是分布式微服务架构下的一站式解决方案，是各个微服务架构落地技术的集合体，俗称微服务全家桶。



## SpringCloud和SpringBoot的关系

* SpringBoot专注于快速方便的开发单个个体微服务。- Jar

* SpringCloud是关注全局的微服务协调整理治理框架，它将SpringBoot开发的一个个单体微服务整合并管理起来，为各个微服务之间

  提供︰配置管理，服务发现，断路器，路由，微代理，事件总线，全局锁，决策竞选,分布式会话等等集成服务。

* SpringBoot可以离开SpringClooud独立使用，开发项目，但是SpringCloud离不开SpringBoot，属于依赖关系

* .SpringBoot专注于快速、方便的开发单个个体微服务，SpringCloud关注全局的服务治理框架





## SpringCloud和Dubbo选型

[Dubbo vs Spring Cloud：两大技术栈如何选型？](https://ld246.com/article/1591749333308)



## SpringCloud的版本名称

Spring Cloud Release Train	Spring Boot Version
Hoxton	2.2.x
Greenwich	2.1.x
Finchley	2.0.x
Edgware	1.5.x
Dalston	1.5.x
Camden	1.4.x
Brixton	1.3.x
Angle	1.2.x

spring cloud是一个由众多独立子项目组成的大型综合项目，每个子项目有不同的发行节奏，都维护着自己的发布版本号。spring c1Toud通过一个资源清单BoM(Bill of Materials）来管理每个版本的子项目清单。为避免与子项目的发布号混淆，所以没有采用版本号的方式，而是通过命名的方式。

这些版本名称的命名方式采用了伦敦地铁站的名称，同时根据字母表的顺序来对应版本时间顺序，比如:最早的Release版本: Ange1，第二个Release版本: Brixton，然后是camden、Dalston、Edgware。





## SpringCloud的模块

[Spring Cloud 都有哪些模块](https://www.cnblogs.com/fengzheng/p/10567632.html)



## 关于SpringBoot和SpringCloud的版本列表

spring-boot-starter-parent 版本列表地址：
https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-parent

spring-cloud-dependencies 版本列表地址：
https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-dependencies

Spring Cloud	Spring Boot
Angel版本	兼容Spring Boot 1.2.x
Brixton版本	兼容Spring Boot 1.3.x，也兼容Spring Boot 1.4.x
Camden版本	兼容Spring Boot 1.4.x，也兼容Spring Boot 1.5.x
Dalston版本、Edgware版本	兼容Spring Boot 1.5.x，不兼容Spring Boot 2.0.x
Finchley版本	兼容Spring Boot 2.0.x，不兼容Spring Boot 1.5.x
Greenwich版本	兼容Spring Boot 2.1.x
Hoxtonl版本	兼容Spring Boot 2.2.x



```xml
 		<dependencyManagement>
			<dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Hoxton.SR10</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
		</dependencyManagement>
```





# 服务注册和服务发现

[深入了解服务注册与发现](https://zhuanlan.zhihu.com/p/161277955)





# Eureka

## 什么是Eureka

Spring Cloud 封装了 Netflix 公司开发的 Eureka 模块来实现服务注册和发现。Eureka 采用了 C-S 的设计架构。Eureka Server 作为服务注册功能的服务器，它是服务注册中心。而系统中的其他微服务，使用 Eureka 的客户端连接到 Eureka Server，并维持心跳连接。这样系统的维护人员就可以通过 Eureka Server 来监控系统中各个微服务是否正常运行。Spring Cloud 的一些其他模块（比如Zuul）就可以通过 Eureka Server 来发现系统中的其他微服务，并执行相关的逻辑。

Eureka由两个组件组成：Eureka服务器和Eureka客户端。Eureka服务器用作服务注册服务器。Eureka客户端是一个java客户端，用来简化与服务器的交互、作为轮询负载均衡器，并提供服务的故障切换支持。Netflix在其生产环境中使用的是另外的客户端，它提供基于流量、资源利用率以及出错状态的加权负载均衡。

用一张图来认识以下：

![img](http://favorites.ren/assets/images/2017/springcloud/eureka-architecture-overview.png)

上图简要描述了Eureka的基本架构，由3个角色组成：

1、**Eureka Server**（搭建的集群）

- 提供服务注册和发现

2、**Application Service** （Service Provider）

- 服务提供方
- 将自身服务注册到Eureka，从而使服务消费方能够找到

3、**Application Client**（Service Consumer）

- 服务消费方
- 从Eureka获取注册服务列表，从而能够消费服务



## Eureka配置

以下配置都是以 `eureka.server` 开头：

| 参数                                        | 描述                         | 备注       |
| ------------------------------------------- | ---------------------------- | ---------- |
| eureka.server.eviction-interval-timer-in-ms | server清理无效节点的时间间隔 | 默认60秒   |
| eureka.server.enable-self-preservation      | 是否开启自我保护，默认true   | true false |
| eureka.server.renewal-percent-threshold     | 开启自我保护的系数           | 默认：0.85 |

client参数配置：

| 参数                                                   | 描述                           | 备注          |
| ------------------------------------------------------ | ------------------------------ | ------------- |
| eureka.client.enabled                                  | 是否开启client，默认true       | true false    |
| eureka.client.register-with-eureka                     | 是否注册                       | 默认true      |
| eureka.client.fetch-registry                           | 是否检索服务                   | true false    |
| eureka.client.serviceUrl.defaultZone                   | 默认服务注册中心地址           | 多个用","隔开 |
| eureka.client.eureka-server-connect-timeout-seconds    | 连接server服务器超时时间       | 默认5秒       |
| eureka.client.eureka-connection-idle-timeout-seconds   | 连接server的连接空闲时长       | 默认30秒      |
| eureka.client.eureka-server-read-timeout-seconds       | 连接server读取数据超时时间     | 默认8秒       |
| eureka.client.eureka-server-total-connections          | 连接server的最大连接数         | 默认200       |
| eureka.client.eureka-server-total-connections-per-host | 对单个server的最大连接数       | 默认50        |
| eureka.client.eureka-service-url-poll-interval-seconds | 获取集群中最新的server节点数据 | 默认0         |
| eureka.client.heartbeat-executor-thread-pool-size      | client维持与server的心跳线程数 | 默认2         |
| eureka.client.service-url                              | 列出所有可用注册中心的地址     |               |

eureka instance 相关配置：

| 参数                                                 | 描述                                 | 备注                                                         |
| ---------------------------------------------------- | ------------------------------------ | ------------------------------------------------------------ |
| eureka.instance.lease-renewal-interval-in-seconds    | 服务续约任务调用间隔时间，默认30秒   | client每隔30秒向server上报自己状态，避免被server剔除         |
| eureka.instance.lease-expiration-duration-in-seconds | 服务时效时间，默认90秒               | 当server 90秒内没有收到client的注册信息时，会将该节点剔除    |
| eureka.client.registry-fetch-interval-seconds        | client本地缓存清单更新间隔，默认30秒 | client每隔30秒，向server请求可用服务清单。对于API网关类应用，可以适当降低时间间隔 |
| eureka.instance.prefer-ip-address                    | 注册服务时是否使用IP注册，默认false  | true false                                                   |
| eureka.instance.ip-address                           | server端的ip地址                     |                                                              |
| eureka.instance.hostname                             | server端的hostname                   | 默认localhost                                                |
| eureka.instance.instance-id                          | 注册到server的实例                   |                                                              |



## 服务中心

服务中心又称注册中心，管理各种服务功能包括服务的注册、发现、熔断、负载、降级等，比如dubbo admin后台的各种功能。

有了服务中心调用关系会有什么变化，画几个简图来帮忙理解

项目A调用项目B

正常调用项目A请求项目B

![img](http://favorites.ren/assets/images/2017/springcloud/ab.jpg)

有了服务中心之后，任何一个服务都不能直接去掉用，都需要通过服务中心来调用

![img](http://favorites.ren/assets/images/2017/springcloud/a2b.jpg)

项目A调用项目B，项目B在调用项目C

![img](http://favorites.ren/assets/images/2017/springcloud/abc.jpg)

这时候调用的步骤就会为两步：第一步，项目A首先从服务中心请求项目B服务器，然后项目B在从服务中心请求项目C服务。

![img](http://favorites.ren/assets/images/2017/springcloud/a2b2c.jpg)

上面的项目只是两三个相互之间的简单调用，但是如果项目超过20个30个呢，在15年底的时候我司分布式的项目就达到了二十几个，画一张图来描述几十个项目之间的相互调用关系全是线条，任何其中的一个项目改动，就会牵连好几个项目跟着重启，巨麻烦而且容易出错。通过服务中心来获取服务你不需要关注你调用的项目IP地址，由几台服务器组成，每次直接去服务中心获取可以使用的服务去调用既可。

由于各种服务都注册到了服务中心，就有了去做很多高级功能条件。比如几台服务提供相同服务来做均衡负载；监控服务器调用成功率来做熔断，移除服务列表中的故障点；监控服务调用时间来对不同的服务器设置不同的权重等等。



### Eureka服务注册中心的作用

**1）服务的注册**

把QQ群理解为注册中心，Kevin为群主，当有其他的人（Q1）想申请加入此QQ群的时候，这个过程可理解为服务的注册；若群主接受申请，则为服务的注册成功，拒绝申请，则为服务的注册失败；

**2）服务的发现**

若群主接受申请，Q1进入群中，QQ群界面中的群成员可以理解为已注册的服务；

Q1可以在群中发送消息/传文件，这个过程称为服务的发现。



### 常见的注册中心有哪些

1）Dubbo 的注册中心 Zookeeper

2）Sringcloud 的注册中心 Eureka



## Eureka Server的自我保护机制



## Eureka的依赖

client端依赖

```xml
<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    <version>2.2.7.RELEASE</version>
</dependency>
```

server端依赖

```
<!--Eureka server端依赖-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
    <version>2.2.7.RELEASE</version>
</dependency>
```





SpringCloud和SpringBoot依赖

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-dependencies</artifactId>
    <!--<version>Finchley.SR2</version>-->
    <version>Hoxton.SR10</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
<!--springboot-->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>2.3.3.RELEASE</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```



# Erueka对比Zookeeper

## ACID与CAP

**ACID的定义：**

- **Atomic原子性**: 一个事务的所有系列操作步骤被看成是一个动作，所有的步骤要么全部完成要么一个也不会完成，如果事务过程中任何一点失败，将要被改变的数据库记录就不会被真正被改变。
- **Consistent一致性**: 数据库的约束 级联和触发机制Trigger都必须满足事务的一致性。也就是说，通过各种途径包括外键约束等任何写入数据库的数据都是有效的，不能发生表与表之间存在外键约束，但是有数据却违背这种约束性。所有改变数据库数据的动作事务必须完成，没有事务会创建一个无效数据状态，这是不同于CAP理论的一致性"consistency".
- **Isolated**隔离性: 主要用于实现并发控制, 隔离能够确保并发执行的事务能够顺序一个接一个执行，通过隔离，一个未完成事务不会影响另外一个未完成事务。
- **Durable**持久性: 一旦一个事务被提交，它应该持久保存，不会因为和其他操作冲突而取消这个事务。很多人认为这意味着事务是持久在磁盘上，但是规范没有特别定义这点。



**CAP的定义**

- **Consistent一致性**: 同样数据在分布式系统中所有地方都是被复制成相同。
- **Available可用性**: 所有在分布式系统活跃的节点都能够处理操作且能响应查询。
- **Partition Tolerant**分区容错性: 在两个复制系统之间，如果发生了计划之外的网络连接问题，对于这种情况，有一套容错性设计来保证。



## 什么是CAP

CAP原则又称CAP定理，指的是在一个分布式系统中，[一致性](https://baike.baidu.com/item/一致性/9840083)（Consistency）、[可用性](https://baike.baidu.com/item/可用性/109628)（Availability）、[分区容错性](https://baike.baidu.com/item/分区容错性/23734073)（Partition tolerance）。CAP 原则指的是，这三个[要素](https://baike.baidu.com/item/要素/5261200)最多只能同时实现两点，不可能三者兼顾。

![img](https://www.wangbase.com/blogimg/asset/201807/bg2018071607.jpg)



[CAP原则(CAP定理)、BASE理论](https://www.cnblogs.com/duanxz/p/5229352.html)

[CAP 定理的含义](http://www.ruanyifeng.com/blog/2018/07/cap.html)





## Zookeeper保证的是CP

当向注册中心查询服务列表时，我们可以容忍注册中心返回的是几分钟以前的注册信息，但不能接受服务直接down掉不可用。也就是说，服务注册功能对可用性的要求要高于一致性。但是Zookeeper会出现这样一种情况，当master节点因为网络故障与其他节点失去联系时，剩余节点会重新进行leader选举。问题在于，选举leader的时间太长，30~120s，且选举期间整个Zookeeper集群都是不可用的，这就导致在选举期间注册服务瘫痪。在云部署的环境下，因为网络问题使得Zookeeper集群失去master节点是较大概率会发生的事件，虽然服务最终能够恢复，但是漫长的选举时间导致的注册长期不可用是不能容忍的。



## Eureka保证的是AP

Eureka看明白了这一点，因此在设计时就优先保证可用性。Eureka各个节点都是平等的，几个节点挂掉不会影响正常节点的工作，剩余的节点依然可以提供注册和查询服务。而Eureka的客户端在向某个Eureka注册时，如果发现连接失败，则会自动切换至其他节点，只要有一台Eureka还在，就能保住注册服务的可用性，只不过查到的信息可能不是最新的，除此之外，Eureka还有一种自我保护机制，如果在15分钟内超过85%的节点都没有正常的心跳，那么Eureka就认为客户端与注册中心出现了网络故障，此时会出现以下几种情况:
1.Eureka不再从注册列表中移除因为长时间没收到心跳而应该过期的服务

2.Eureka仍然能够接受新服务的注册和查询请求，但是不会被同步到其他节点上(即保证当前节点依然可用)

3.当网络稳定时，当前实例新的注册信息会被同步到其他节点中



# spring cloud中重要的组件

spring cloud中有几个重要的组件，深入理解它们之间的关系才能更好的使用它们：

- ribbon：实现服务定位和客户端负载均衡；
- hystrix：实现服务熔断、服务降级、资源隔离等；
- feign：声明式的http客户端，用于服务之间的http调用。相比于resttemplate，feign与ribbon和hystrix集成更友好，是spring cloud的顶层组件。



[深入理解feign、ribbon和hystrix三者的关系及超时配置](https://zhongpan.tech/2020/03/23/029-hystrix-ribbon-feign-relationship/)

[Feign Ribbon Hystrix 三者关系](https://www.cnblogs.com/crazymakercircle/p/11664812.html)



# Ribbon

## 负载均衡

负载均衡建立在现有网络结构之上，它提供了一种廉价有效透明的方法扩展[网络设备](https://baike.baidu.com/item/网络设备/7667828)和[服务器](https://baike.baidu.com/item/服务器/100571)的带宽、增加[吞吐量](https://baike.baidu.com/item/吞吐量/157092)、加强网络数据处理能力、提高网络的灵活性和可用性。

负载均衡*（Load Balance）*其意思就是分摊到多个操作单元上进行执行，例如Web[服务器](https://baike.baidu.com/item/服务器/100571)、[FTP服务器](https://baike.baidu.com/item/FTP服务器)、[企业](https://baike.baidu.com/item/企业/707680)关键应用服务器和其它关键任务服务器等，从而共同完成工作任务。



## ribbon是什么?

Spring Cloud Ribbon是基于Netflix Ribbon实现的一套**客户端负载均衡的工具**。

简单的说，Ribbon是Netflix发布的开源项目，主要功能是提供客户端的软件负载均衡算法，将NetFlix的中间层服务连接在一起。Ribbon的客户端组件提供一系列

完整的配置项如:连接超时、重试等等。简单的说，就是在配置文件中列出LoadBalancer(简称LB:负载均衡）后面所有的机器，Ribbon会自动的帮助你基于某种规

则(如简单轮询，随机连接等等）去连接这些机器。我们也很容易使用Ribbon实现自定义的负载均衡算法!



## ribbon能干嘛?

* LB，即负载均衡(Load Balance)，在微服务或分布式集群中经常用的一种应用。
* 负载均衡简单的说就是将用户的请求平摊的分配到多个服务上，从而达到系统的HA (高可用)。
* 常见的负载均衡软件有Nginx,Lvs等等
* dubbo、SpringCloud中均给我们提供了负载均衡，SpringCloud的负载均衡算法可以自定义
* 负载均衡简单分类:
  * 集中式LB
    即在服务的消费方和提供方之间使用独立的LB设施，如Nginx（反向代理服务器!），由该设施负责把访问请求通过某种策略转发至服务的提供方!
  * 进程式LB
    将LB逻辑集成到消费方，消费方从服务注册中心获知有哪些地址可用，然后自己再从这些地址中选出一个合适的服务器。
    Ribbon就属于进程内LB，它只是一个类库，集成于消费方进程，消费方通过它来获取到服务提供方的地址!



## @RestTemplate

RestTemplate是Spring提供的用于访问Rest服务的客户端，RestTemplate提供了多种便捷访问远程Http服务的方法,能够大大提高客户端的编写效率。



[Springboot — 用更优雅的方式发HTTP请求(RestTemplate详解)](https://www.cnblogs.com/javazhiyin/p/9851775.html)





## @LoadBalanced   RestTemplate

学习springcluod的时候，有一个困惑，为什么RestTemplate上面@LoadBalanced注解，就能实现负载均衡

```java
@Configuration
public class ConfigBean {

    @Bean
	//这里就是创建一个负载均衡的RestTemplate Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
```



[springCloud的RestTemplate+@LoadBalanced注解实现负载均衡源码分析](https://blog.csdn.net/chengkui1990/article/details/80742225)





## Ribbon负载均衡

默认是轮询

Ribbon自带有几种负载均衡策略实现：

- RandomRule：随机选取负载均衡策略，随机Random对象，在所有服务实例中随机找一个服务的索引号，然后从上线的服务中获取对应的服务。
- RoundRobinRule：线性轮询负载均衡策略。
- WeightedResponseTimeRule：响应时间作为选取权重的负载均衡策略，根据平均响应时间计算所有服务的权重，响应时间越短的服务权重越大，被选中的概率越高。刚启动时，如果统计信息不足，则使用线性轮询策略，等信息足够时，再切换到WeightedResponseTimeRule。
- RetryRule：使用线性轮询策略获取服务，如果获取失败则在指定时间内重试，重新获取可用服务。
- ClientConfigEnabledRoundRobinRule：默认通过线性轮询策略选取服务。通过继承该类，并且对choose方法进行重写，可以实现更多的策略，继承后保底使用RoundRobinRule策略。
- BestAvailableRule：继承自ClientConfigEnabledRoundRobinRule。从所有没有断开的服务中，选取到目前为止请求数量最小的服务。
- PredicateBasedRule：抽象类，提供一个choose方法的模板，通过调用AbstractServerPredicate实现类的过滤方法来过滤出目标的服务，再通过轮询方法选出一个服务。
- AvailabilityFilteringRule：按可用性进行过滤服务的负载均衡策略，会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，还有并发的连接数超过阈值的服务，然后对剩余的服务列表进行线性轮询。
- ZoneAvoidanceRule：本身没有重写choose方法，用的还是抽象父类PredicateBasedRule的choose。



添加Ribbon负载均衡

```java
@Configuration
public class ConfigBean {

    @Bean
	//这里就是创建一个负载均衡的RestTemplate Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
```



在controller层调用RestTemplate，并配置服务名

```java
@RestController
public class DeptConsumerController {
    //消费者，不应该由service层

    //RestTemplate
    //RestTemplate是Spring提供的用于访问Rest服务的客户端，RestTemplate提供了多种便捷访问远程Http服务的方法,能够大大提高客户端的编写效率。
    @Autowired
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX = "http://localhost:8001/";

    //Ribbon，通过服务名来访问，服务名spring.application.name=[springcloud-provider-dept]大写
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/list")
    public List<Dept> get(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
```



通过配置文件向Eureka中注册

```
eureka:
  client:
    service-url:
      defaultZone: http://localhost:7002/eureka/,http://localhost:7001/eureka/
```



启动类上添加@RibbonClient注解

```java
@SpringBootApplication
@EnableEurekaClient
@RibbonClient
public class DeptConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
```



可以在Java中更改负载均衡的实现策略

```java
@Configuration
public class ConfigBean {

    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
```





# Feign

## Feign依赖

```
<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-feign -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-feign</artifactId>
    <version>1.4.7.RELEASE</version>
</dependency>
```



## Feign相关注解

**FeignClient注解**

FeignClient注解被@Target(ElementType.TYPE)修饰，表示FeignClient注解的作用目标在**接口上**



使用注解@FeignClient 定义feign客户端 ;

```java
@FeignClient(name = "test-service", path = "/test")
public interface TestService {
    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    TestModel echo(@RequestParam("parameter") String parameter);
}
```

该例子定义了一个feign客户端，将远程服务`http://test-service/test/echo`映射为一个本地`Java`方法调用。



声明接口之后，在代码中通过@Resource或@Autowired注入之后即可使用。@FeignClient标签的常用属性如下：

- name：指定FeignClient的名称，如果项目使用了Ribbon，name属性会作为微服务的名称，用于服务发现
- url: url一般用于调试，可以手动指定@FeignClient调用的地址
- decode404:当发生http 404错误时，如果该字段位true，会调用decoder进行解码，否则抛出FeignException
- configuration: Feign配置类，可以自定义Feign的Encoder、Decoder、LogLevel、Contract
- fallback: 定义容错的处理类，当调用远程接口失败或超时时，会调用对应接口的容错逻辑，fallback指定的类必须实现@FeignClient标记的接口
- fallbackFactory: 工厂类，用于生成fallback类示例，通过这个属性我们可以实现每个接口通用的容错逻辑，减少重复的代码
- path: 定义当前FeignClient的统一前缀

[FeignClient注解及参数](https://www.cnblogs.com/smiler/p/10689894.html)



**@EnableFeignClients**

注解`@EnableFeignClients`告诉框架扫描所有使用注解`@FeignClient`定义的`feign`客户端。

[微服务 通过EnableFeignClients调用其他服务的api](https://www.cnblogs.com/UniqueColor/p/7130782.html)



## Feign原理

[Feign原理](https://www.cnblogs.com/crazymakercircle/p/11965726.html)

[Spring Cloud Feign 总结](https://www.cnblogs.com/ealenxie/p/10275794.html)



# Hystrix

## 认识Hystrix

Hystrix是Netflix开源的一款容错框架，包含常用的容错方法：线程池隔离、信号量隔离、熔断、降级回退。在高并发访问下，系统所依赖的服务的稳定性对系统的影响非常大，依赖有很多不可控的因素，比如网络连接变慢，资源突然繁忙，暂时不可用，服务脱机等。我们要构建稳定、可靠的分布式系统，就必须要有这样一套容错方法。





## 服务熔断

### Hystrix的服务熔断相关注解

**@EnableCircuitBreaker** 

启动断路器

**@HystrixCommand**

此注解表示此方法是hystrix方法，其中fallbackMethod定义回退方法的名称。HystrixCommand的回退方法，此方法必须和hystrix的执行方法在相同类中。可以把HystrixCommand的执行参数和执行失败的异常传入回退方法中

```java
public @interface HystrixCommand {

            // HystrixCommand 命令所属的组的名称：默认注解方法类的名称
            String groupKey() default "";

            // HystrixCommand 命令的key值，默认值为注解方法的名称
            String commandKey() default "";

            // 线程池名称，默认定义为groupKey
            String threadPoolKey() default "";
            // 定义回退方法的名称, 此方法必须和hystrix的执行方法在相同类中
            String fallbackMethod() default "";
            // 配置hystrix命令的参数
            HystrixProperty[] commandProperties() default {};
            // 配置hystrix依赖的线程池的参数
             HystrixProperty[] threadPoolProperties() default {};

            // 如果hystrix方法抛出的异常包括RUNTIME_EXCEPTION，则会被封装HystrixRuntimeException异常。我们也可以通过此方法定义哪些需要忽略的异常
            Class<? extends Throwable>[] ignoreExceptions() default {};

            // 定义执行hystrix observable的命令的模式，类型详细见ObservableExecutionMode
            ObservableExecutionMode observableExecutionMode() default ObservableExecutionMode.EAGER;

            // 如果hystrix方法抛出的异常包括RUNTIME_EXCEPTION，则会被封装HystrixRuntimeException异常。此方法定义需要抛出的异常
            HystrixException[] raiseHystrixExceptions() default {};

            // 定义回调方法：但是defaultFallback不能传入参数，返回参数和hystrix的命令兼容
            String defaultFallback() default "";
        }
```







## 服务降级

整体资源快不够用了，忍痛将某些服务先关掉，待度过难关，在开启回来。

所谓降级，就是一般是从整体符合考虑，就是当某个服务熔断之后，服务器将不再被调用，此刻客户端可以自己准备一个本地的fallback回调，返回一个缺省值，这样做，虽然服务水平下降，但好歹可用，比直接挂掉要强。



**定义服务降级处理类**

修改服务接口的提供者项目(springcloud-api)，定义服务降级处理类实现一个FallbackFactory接口，并提供service接口的实现，通过create方法提供服务降级后的实现（缺省值）。

```java
//注册进容器
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    //为中断的服务提供默认的实现（缺省值）
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            public Dept queryById(Long deptno) {
                return new Dept().setDb_source("没有数据")
                        .setDeptno(deptno)
                        .setDname("id=>"+deptno+"没有对应的服务，这个服务已经中断");
            }
        };
    }
}
```

**修改提供服务的service熔断处理的机制**

此处是在公共的service对某个service的方法访问进行统一的fallback处理

```java
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();
    @RequestMapping(value = "/dept/add}", method = RequestMethod.POST)
    public boolean add(Dept dept);
}
```

**修改负载均衡项目的yml**

新增加配置项到microservicecloud-consumer-dep-feign

```python
feign:
  hystrix:
    enabled: true
```

1、先启动eureka,2、启动springcloud-provider-dept-8001,3、启动springcloud-consumer-dept-feign







## DashBoard流监控

Hystrix-dashboard是一款针对Hystrix进行实时监控的工具，通过Hystrix Dashboard我们可以在直观地看到各Hystrix Command的请求响应时间, 请求成功率等数据。但是只使用Hystrix Dashboard的话, 你只能看到单个应用内的服务信息, 这明显不够. 我们需要一个工具能让我们汇总系统内多个服务的数据并显示到Hystrix Dashboard上, 这个工具就是Turbine.



创建module ： springcloud-consumer-hystrix-dashboard



导入依赖

```xml
<!--Hystrix依赖-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-hystrix</artifactId>
    <version>1.4.7.RELEASE</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-hystrix-dashboard -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-hystrix-dashboard</artifactId>
    <version>1.4.7.RELEASE</version>
</dependency>
```



创建启动类

```java
@SpringBootApplication
//开启Dashboard流监控
@EnableHystrixDashboard
public class DeptConsumerDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9001.class,args);
    }
}
```



在开启熔断服务的服务器上添加ServletRegistrationBean

服务器必须开启熔断服务，即启动类上有@EnableCircuitBreaker注解

```java
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker //开启熔断服务
public class DeptHystrixProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptHystrixProvider_8001.class,args);
    }

    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        //流监控的url
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }
}
```



依次开启Eurake集群，服务器，和DashBoard流监控



访问`https://localhost:9001/actuator/hystrix.stream`，出现下面的问题

![img](https://img-blog.csdn.net/20180903003218705?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2Z4YmluMTIz/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)





通过在springcloud-consumer-hystrix-dashboard 模块中的application.yml中添加

```
hystrix:
  dashboard:
    proxy-stream-allow-list: "localhost"
```

解决问题







# Zuul路由网关 

## **Zuul简单介绍**

 Zuul作为微服务系统的网关组件，用于构建边界服务，致力于动态路由、过滤、监控、弹性伸缩和安全。

为什么需要Zuul

Zuul、Ribbon以及Eureka结合可以实现智能路由和负载均衡的功能；网关将所有服务的API接口统一聚合，统一对外暴露。外界调用API接口时，不需要知道微服务系统中各服务相互调用的复杂性，保护了内部微服务单元的API接口；网关可以做用户身份认证和权限认证，防止非法请求操作API接口；网关可以实现监控功能，实时日志输出，对请求进行记录；网关可以实现流量监控，在高流量的情况下，对服务降级；API接口从内部服务分离出来，方便做测试。

Zuul通过Servlet来实现，通过自定义的ZuulServlet来对请求进行控制。核心是一系列过滤器，可以在Http请求的发起和响应返回期间执行一系列过滤器。Zuul采取了动态读取、编译和运行这些过滤器。过滤器之间不能直接通信，而是通过RequestContext对象来共享数据，每个请求都会创建一个RequestContext对象。

Zuul生命周期如下图。 当一个客户端Request请求进入Zuul网关服务时，网关先进入”pre filter“，进行一系列的验证、操作或者判断。然后交给”routing filter“进行路由转发，转发到具体的服务实例进行逻辑处理、返回数据。当具体的服务处理完成后，最后由”post filter“进行处理，该类型的处理器处理完成之后，将Request信息返回客户端。 

![img](https://img2018.cnblogs.com/blog/978388/201811/978388-20181119111951438-226231762.png)

## Zuul使用

zuul 可以实现对内的路由，即所有服务之间互相访问的时候，都通过 zuul 来做。但是这不是正确的用法。zuul 接受的请求应该全部来自于外部，主要指前端（浏览器/app）。内部服务互相调用只需要通过 Eureka Server 进行服务发现和调用即可。

### 启动 zuul 服务

使用 Spring Cloud 来启动 zuul 非常简单，通过引入 spring-cloud-starter-zuul 并提供注解 EnableZuulProxy 即可。

		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-zuul</artifactId>
		</dependency>

 spring-cloud-starter-zuul已经停止维护，Netflix维护的新依赖

```xml
<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-zuul -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-zuul</artifactId>
    <version>2.2.7.RELEASE</version>
</dependency>
```



```java
@EnableZuulProxy

@SpringBootApplication
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
```

### 路由配置

zuul 的路由策略默认通过配置文件实现，也可以通过插件读取配置中心或者数据库内的配置。下面都以配置文件为实例。

### 不使用 Eureka

当 zuul 不配合 Eureka 服务发现服务的时候，Zuul 的路由就要基于 URL 去路由。比如下面的配置：

```
spring:
  application:
    name: api-gateway

server:
  port: 5555

zuul:
  routes:
    user-service:
      path: /myusers/**
      url: http://127.0.0.1:4444
```

每当用户访问 zuul 的`/myusers` 为前缀的路径时，zuul 就会将请求转至`127.0.0.1:4444`。

### 使用 Eureka

基于 URL 去配置有一个问题，就是当服务本身被调度到其他节点时，Zuul 无法感知。利用 Eureka 注册服务的能力，如果 Zuul 也能去 Eureka Server 获取服务的地址并且基于所有服务的实例进行轮询/熔断/重试，那就更好了。当然可以，因为 Zuul 和 Eureka 都是 Netflix 开发的，它们之间可以配合。



首先，为 Zuul 使用 Eureka 做一些额外配置，包括添加spring-cloud-starter-netflix-zuul 依赖，以及为 Zuul 应用配置 Eureka 相关的注解。

```xml
<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-zuul -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-zuul</artifactId>
    <version>2.2.7.RELEASE</version>
</dependency>
```



```java
@EnableZuulProxy
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	@Bean
    public SimpleFilter simpleFilter() {
	    return new SimpleFilter();
    }
}
```

EnableDiscoveryClient，是为了让 Zuul 能够访问 Eureka Server 并注册自身，EnableCircuitBreaker 则是提供能力，让 Zuul 的转发同时具备熔断能力。



现在我们在配置文件里面就不需要写死目标服务的地址了，而是可以用 serviceId 来代替。另外，还需要把Eureka Server 的地址告诉 Zuul。

```properties
server:
  port: 9527

spring:
  application:
    name: springcloud-zuul
eureka:
  client:
    service-url:
      defaultZone: http://localhost:7002/eureka/,http://localhost:7001/eureka/
  instance:
    instance-id: zuul
    prefer-ip-address: true

zuul:
  routes: #路由
    mydept.serviceId: springcloud-provider-dept #mydept.serviceId 改为 springcloud-provider-dept.serviceId
    mydept.path: /mydept/**
```

用户访问 zuul 的`localhost:9527/mydept/` 为前缀的路径时，和访问``localhost:9527/springcloud-provider-dept/``为前缀的路径得到内容相同。



[Zuul 路由使用](https://xli1224.github.io/2017/09/09/use-zuul/)
