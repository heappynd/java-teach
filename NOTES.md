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
11. 全局异常处理（@RestControllerAdvice，解决 Service 抛异常返回 500 HTML 的问题）
12. 参数校验（Bean Validation）
13. 统一响应格式 / 接口文档（待定）

## JDK 8 兼容性标注

用户要求：课程中使用的 JDK 9+ 特性需标注 JDK 8 不支持，并给出 JDK 8 替代写法。
已在以下课程中标注：
- 第 4 课：`Map.of()`（JDK 9+）-> JDK 8 用 `HashMap` + `put()`
- 第 5 课：`record`（JDK 14+）-> JDK 8 用普通类 + Lombok；`List.of()`（JDK 9+）-> JDK 8 用 `Arrays.asList()`
- 第 7 课：LambdaQueryWrapper / Page / 方法引用均为 JDK 8 原生特性，无兼容性问题。分页插件依赖差异：JDK 17+ 用 `mybatis-plus-jsqlparser`，JDK 8 用 `mybatis-plus-jsqlparser-4.9`
- 第 9 课：接口、继承、注解、构造器注入均为 Java/Spring 早期特性，IService / ServiceImpl 在 JDK 8（Spring Boot 2.x）同样可用，无兼容性问题
