# NOTES.md - 教学笔记

## 用户背景

- 6-7 年 Vue3 前端开发经验
- 熟悉 JavaScript/TypeScript、HTTP、RESTful API 概念
- Java 完全零基础
- Windows 操作系统
- 目标：全栈开发，能写后端 API 与 Vue3 前端对接

## 教学策略

- 利用前端经验类比：用 npm 类比 Maven，用 Vue 组件类比 Spring Controller，用 package.json 类比 pom.xml
- 以实际操作为主，理论为辅
- 每节课聚焦一个具体可操作的技能点
- 中文教学，技术术语保留英文

## 前端 → 后端概念映射

| 前端概念 | 后端对应 | 说明 |
|---------|---------|------|
| npm / yarn | Maven / Gradle | 包管理工具 |
| package.json | pom.xml | 项目配置和依赖声明 |
| node_modules | ~/.m2/repository | 依赖存储位置 |
| Vue Router 路由 | @RequestMapping | URL 路由映射 |
| Express/Koa Controller | @RestController | 处理 HTTP 请求 |
| axios 发请求 | @GetMapping/@PostMapping | 定义 API 端点 |
| Vite dev server | Spring Boot 内嵌 Tomcat | 开发服务器 |
| .env 文件 | application.properties | 环境配置 |

## 学习路径规划

1. JDK 安装与环境配置
2. Maven 安装与基础概念
3. 使用 Spring Initializr 创建项目
4. 理解 Spring Boot 项目结构（对比前端项目）
5. 编写第一个 REST API
6. Java 基础语法（按需穿插）
7. 连接数据库（PostgreSQL + MyBatis Plus）
8. CRUD 完整实现（MyBatis Plus BaseMapper）
9. 前后端联调（Vue3 + Spring Boot）

工程化进阶阶段（第 9 课起，已按序推进）：
10. Service 层与依赖注入（第 9 课，已完成）
11. Java 包与项目结构（第 10 课，已完成 -- 补充分包教学）
12. 全局异常处理（第 11 课，已完成 -- @RestControllerAdvice）
13. 参数校验（第 12 课，已完成 -- Bean Validation）
14. 统一响应格式（第 13 课，已完成 -- Result<T>）

课程全部完成！核心 Mission 目标已达成。

## JDK 8 兼容性标注

用户要求：课程中使用的 JDK 9+ 特性需标注 JDK 8 不支持，并给出 JDK 8 替代写法。
已在以下课程中标注：
- 第 4 课：`Map.of()`（JDK 9+）-> JDK 8 用 `HashMap` + `put()`
- 第 5 课：`record`（JDK 14+）-> JDK 8 用普通类 + Lombok；`List.of()`（JDK 9+）-> JDK 8 用 `Arrays.asList()`
- 第 7 课：LambdaQueryWrapper / Page / 方法引用均为 JDK 8 原生特性，无兼容性问题。分页插件依赖差异：JDK 17+ 用 `mybatis-plus-jsqlparser`，JDK 8 用 `mybatis-plus-jsqlparser-4.9`
- 第 9 课：接口、继承、注解、构造器注入均为 Java/Spring 早期特性，IService / ServiceImpl 在 JDK 8（Spring Boot 2.x）同样可用，无兼容性问题
- 第 10 课：Java 包机制是 JDK 1.0 特性，与 JDK 版本无关，完全兼容
- 第 11 课：@RestControllerAdvice / @ExceptionHandler 是 Spring MVC 3.2+ 特性，JDK 8 完全兼容
- 第 12 课：Bean Validation (JSR 380) 支持 JDK 8；Spring Boot 2.x 下 import 从 jakarta.validation 换成 javax.validation
- 第 13 课：Result 泛型类 JDK 5+ 支持，Lombok @Data 兼容 JDK 8，Stream API 是 JDK 8 原生特性

## MyBatis Plus 版本差异备忘

MyBatis Plus 3.5.17（Spring Boot 4 starter）中部分类的包路径发生了变化：
- `IService`: `com.baomidou.mybatisplus.extension.service` -> `com.baomidou.mybatisplus.spring.service`
- `ServiceImpl`: `com.baomidou.mybatisplus.extension.service.impl` -> `com.baomidou.mybatisplus.spring.service.impl`
- `LambdaQueryWrapper`、`Page`、`BaseMapper` 等其他类路径未变
- JDK 8（Spring Boot 2.x）仍使用旧的 `extension.service` 路径
