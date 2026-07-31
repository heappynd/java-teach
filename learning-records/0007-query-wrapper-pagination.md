# 条件构造器与分页查询

第 7 课教授了三个核心技能：

1. **PUT 更新接口** -- 用 `updateById` 补全 CRUD。关键点：`updateById` 默认只更新非 null 字段（选择性更新），不会把 null 字段写入数据库。

2. **LambdaQueryWrapper** -- 条件构造器，用方法引用（`User::getName`）替代字符串字段名，编译时安全。支持链式调用拼接多条件。每个条件方法支持 `boolean condition` 参数，实现动态条件查询。

3. **分页插件** -- 从 MyBatis Plus 3.5.9 起，`PaginationInnerInterceptor` 需要额外引入 `mybatis-plus-jsqlparser` 依赖。配置 `MybatisPlusConfig` 类注册拦截器，使用 `Page<T>` 对象配合 `selectPage` 实现自动分页。返回的 JSON 包含 `records`、`total`、`current`、`size`、`pages` 字段，可直接被 Vue3 前端分页组件消费。

## JDK 8 兼容性

本课所有代码（Lambda、方法引用、Wrapper、Page）完全兼容 JDK 8。唯一差异：分页插件依赖改为 `mybatis-plus-jsqlparser-4.9`（因为 jsqlparser 5.0+ 要求 JDK 11+）。

## BOM 引入

本课首次引入 `mybatis-plus-bom` 管理依赖版本。后续 MyBatis Plus 相关依赖无需手动写版本号。

## 学习路径进度

- [x] 第 1-2 课：环境搭建（JDK + Maven）
- [x] 第 3 课：创建 Spring Boot 项目
- [x] 第 4-5 课：REST API 基础（GET/POST/路径参数/DTO）
- [x] 第 6 课：连接 PostgreSQL + MyBatis Plus 基础 CRUD
- [x] 第 7 课：条件构造器 + 分页查询 + PUT 更新
- [ ] 第 8 课：前后端联调（Vue3 + Spring Boot）

用户已具备完整的后端 CRUD + 搜索 + 分页 API，下一课应聚焦前后端联调，让 Vue3 前端真正调用 Spring Boot 后端，跑通全栈链路。
