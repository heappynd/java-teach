# Java 包与项目结构

用户在第 9 课后自行将项目从扁平包（`com.yourname.demo`）重组为标准分层分包结构（`controller/`、`entity/`、`mapper/`、`config/`），指出之前的课程从未教过如何建包。第 10 课已补充此内容，同时第 4-9 课的代码示例已全部更新为多包结构。后续课程（第 11 课起）应沿用 `controller`、`service`、`mapper`、`entity`、`config` 的分包约定。

## 影响

- 原计划的"第 10 课：全局异常处理"顺延为第 11 课
- 第 9 课的"下一课"链接已从 `0010-global-exception-handling.html` 改为 `0010-java-packages-and-structure.html`
- 用户已自行采用 Lombok（`@Data`、`@AllArgsConstructor`、`@NoArgsConstructor`）替代手写 getter/setter，课程暂未涵盖 Lombok，留意后续是否需要补充
