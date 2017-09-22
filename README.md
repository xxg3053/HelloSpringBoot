[TOC]
# Spring Boot

官网：http://projects.spring.io/spring-boot/   
## Hello World

## 启动方式

1. 直接在IDEA里面启动
2. jar方式启动

```
HelloSpringBoot > maven install 
HelloSpringBoot > java -jar target/HelloSpringBoot-0.0.1-SNAPHOT.jar 
```
3. mvn方式

```
HelloSpringBoot > mvn spring-boot:run
```


## 属性配置

```
@Value
@Component
@ConfigurationProperies
```

## Controller的使用

```
@Controller      处理http请求
@RestController  返回json
@RequestMapping  配置Url映射
```




## spring-data-jpa

```
  jpa:
    hibernate:
      ddl-auto: update  # create 每次都创建表  update只创建没有的
    show-sql: true   #格式化sql
    
```


## 事务管理

使用Transactional注解
```
    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("E");
        girlA.setAge(19);
        girlRepository.save(girlA);


        Girl girlB = new Girl();
        girlB.setCupSize("FM");
        girlB.setAge(20);
        girlRepository.save(girlB);
    }  
```

## @Valid表单验证  

## AOP统一异常处理

## 数据库

### spring-data-jpa
### jdbctemplate
### Mybatis
### redis
### MongoDB

## 缓存

用缓存应对高并发
