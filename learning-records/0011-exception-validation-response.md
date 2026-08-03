# 全局异常处理、参数校验、统一响应格式

三课一起完成，补齐工程化进阶的最后拼图：

1. **第 11 课 -- 全局异常处理**：`@RestControllerAdvice` + `@ExceptionHandler`，把 Service 抛出的异常统一转成 JSON 错误响应。解决第 9 课邮箱查重抛 `IllegalArgumentException` 返回 500 HTML 的问题。前端类比：Express 错误中间件。

2. **第 12 课 -- 参数校验**：Bean Validation (JSR 380) 注解 (`@NotBlank`, `@Email`, `@Min`) + `@Valid`，自动校验请求体，不用在 Service 里手写 if 判空。校验失败抛 `MethodArgumentNotValidException`，在全局异常处理器中拦截并返回字段级错误信息。前端类比：Element Plus 表单 rules。

3. **第 13 课 -- 统一响应格式**：`Result<T>` 包装类，所有接口返回 `{ code, message, data }` 统一结构。成功返回 `Result.success(data)`，失败返回 `Result.error(code, message)`。前端用 Axios 拦截器统一处理，业务代码直接取 `res.data.data`。

## JDK 8 兼容性

三课全部兼容 JDK 8 / Spring Boot 2.x。唯一差异：Bean Validation 的 import 从 `jakarta.validation` 换成 `javax.validation`。

## 课程完成状态

全部 13 课已完成。Mission 核心目标（全栈开发、RESTful API、数据库 CRUD、前后端联调）在第 8 课达成，工程化进阶（Service 层、分包、异常处理、参数校验、统一响应）在第 13 课完成。
