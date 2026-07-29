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
7. 连接数据库（MySQL + Spring Data JPA）
8. CRUD 完整实现
9. 前后端联调（Vue3 + Spring Boot）
