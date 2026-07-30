# 学习方向调整：PostgreSQL + MyBatis Plus + JDK 8 兼容性

用户提出三点改进要求，影响后续所有课程：

1. **JDK 8 兼容性标注**：用户工作中可能遇到 JDK 8 项目，要求课程中使用的 JDK 9+ 特性（如 `Map.of()`、`List.of()`、`record`）标注 JDK 8 不支持，并给出 JDK 8 替代写法。已在第 4、5 课中添加 `callout-jdk8` 标注。注意：Spring Boot 3.x/4.x 本身需要 JDK 17+，JDK 8 项目需用 Spring Boot 2.7.x。

2. **数据库改为 PostgreSQL**：原计划使用 MySQL，现改为 PostgreSQL。已更新 MISSION.md、NOTES.md、术语表、第 5 课的下一课引用。

3. **数据层框架改为 MyBatis Plus**：原计划使用 Spring Data JPA，现改为 MyBatis Plus（国内企业主流方案）。已更新术语表数据层部分、学习路径、RESOURCES.md。后续数据库课程将基于 MyBatis Plus 的 BaseMapper、条件构造器等核心功能展开。

这些调整不影响已完成的 5 课内容（环境搭建 + REST API 基础），但从第 6 课起将按新方向进行。
