# Service 层与依赖注入

第 9 课开启工程化进阶阶段，完成第一次架构重构：在 Controller 与 Mapper 之间引入 Service 层。

## 核心知识点

1. **三层架构** -- Controller（HTTP 交互）-> Service（业务逻辑）-> Mapper（数据访问）。前端类比：Vue 组件事件处理 -> Pinia store actions -> api/user.js。业务规则放 Service 层的理由：复用、可测试、可维护。

2. **IService / ServiceImpl** -- MyBatis Plus 的 Service 层脚手架。`UserService extends IService<User>`，`UserServiceImpl extends ServiceImpl<UserMapper, User>`，自动获得 save/getById/page/count 等全套 CRUD 方法，内部自动调用 UserMapper。方法命名与 BaseMapper 刻意区分（get 查单行、remove 删除、list 列表、page 分页）。接口 + Impl 分离类比 TypeScript interface 契约。

3. **依赖注入** -- `@Service` 让 Spring 扫描并把实例注册进容器（类比 Vue `app.provide()`），Controller 通过构造器注入取用（类比 `inject()`）。字段注入改为构造器注入：final 不可变、依赖一目了然、方便传 mock 测试。

4. **第一个业务逻辑** -- 新增用户前邮箱查重（`count(wrapper)` + 抛 `IllegalArgumentException`）。重构后所有接口行为不变（前端零改动），重复邮箱返回 500。

## JDK 8 兼容性

本课代码（接口、继承、注解、构造器注入）完全兼容 JDK 8，IService/ServiceImpl 在 Spring Boot 2.x 同样可用，无兼容性问题。

## 学习路径进度

- [x] 第 1-2 课：环境搭建（JDK + Maven）
- [x] 第 3 课：创建 Spring Boot 项目
- [x] 第 4-5 课：REST API 基础
- [x] 第 6 课：连接 PostgreSQL + MyBatis Plus
- [x] 第 7 课：条件构造器 + 分页查询
- [x] 第 8 课：前后端联调 -- Mission 核心目标达成
- [x] 第 9 课：Service 层与依赖注入 -- 工程化进阶启动
- [x] 第 10 课：Java 包与项目结构 -- 补充分包教学
- [ ] 第 11 课：全局异常处理（@RestControllerAdvice）
- [ ] 第 12 课+：参数校验（Bean Validation）、统一响应格式

下一课方向明确：第 9 课 createUser 抛出的 IllegalArgumentException 会让 Spring Boot 返回 500 HTML 错误页（Whitelabel Error Page），前端 axios 拿到 HTML 而非 JSON。第 11 课用 @RestControllerAdvice 全局异常处理，把所有异常统一转成规范的 JSON 错误响应。
