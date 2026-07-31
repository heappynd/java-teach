# 前后端联调完成

第 8 课完成了 Vue3 前端与 Spring Boot 后端的联调，标志着用户 Mission 核心目标全部实现。

## 核心知识点

1. **CORS（跨域资源共享）** -- 浏览器同源策略导致不同端口的前后端无法直接通信。请求实际到达后端并被处理，但浏览器检查响应头后决定是否放行 JS 读取结果。

2. **两种解决方案**：
   - **Vite 代理**（开发环境）：Vite dev server 转发 `/api/*` 请求到 Spring Boot，浏览器认为是同源，不触发 CORS。
   - **Spring Boot CORS 配置**（生产环境）：通过 `WebMvcConfigurer.addCorsMappings()` 在响应头声明 `Access-Control-Allow-Origin`，允许指定前端源访问。

3. **全栈数据流**：Vue3 axios -> Vite 代理 -> Spring Boot Controller -> UserMapper -> PostgreSQL -> 返回 `Page<User>` JSON -> Vue3 渲染。

## 用户成就

用户已具备完整的全栈开发能力：
- 后端：Spring Boot + MyBatis Plus + PostgreSQL，CRUD + 搜索 + 分页
- 前端：Vue3 + axios，完整用户管理界面
- 联调：Vite 代理 + CORS 配置，前后端数据跑通

## 学习路径进度

- [x] 第 1-2 课：环境搭建（JDK + Maven）
- [x] 第 3 课：创建 Spring Boot 项目
- [x] 第 4-5 课：REST API 基础
- [x] 第 6 课：连接 PostgreSQL + MyBatis Plus
- [x] 第 7 课：条件构造器 + 分页查询
- [x] 第 8 课：前后端联调 -- Mission 核心目标达成
- [ ] 第 9 课+：工程化进阶（Service 层、异常处理、参数校验等）

后续课程进入工程化进阶阶段，提升代码规范性和健壮性。
