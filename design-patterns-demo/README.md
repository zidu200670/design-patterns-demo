# 多国邮编校验器 · 对象适配器模式实践

使用 **Java + Swing** 实现的课程 Demo：用**对象适配器模式（Object Adapter Pattern）**统一校验
美国、加拿大、中国的邮政编码，并配套 UML 类图。

## 功能

- 美国邮编（ZIP）：形如 `12345-6789` / `12345`
- 加拿大邮编：形如 `K1A 0B1`
- 中国邮编：形如 `150001`（6 位数字）
- 图形界面选择国家 / 州省，输入邮编后即时校验并提示结果

## 设计（对象适配器）

- **Target（目标接口）**：`ZipCodeValidator.isValidZipCode(zip, state)`
- **Adaptee（被适配者）**：`USAZipCode`、`CanadianPostalCode`、`ChinesePostalCode`
- **Adapter（适配器）**：`CAPostalCodeAdapter`、`ChinesePostalCodeAdapter`
  —— 实现 `ZipCodeValidator`，内部持有被适配者对象并把调用转发过去
- **Client**：`Customer`（只依赖 `ZipCodeValidator`）、`ZipCodeTester`（GUI）

新增中国邮编校验时，原接口零改动，只需新增 `ChinesePostalCode` 与 `ChinesePostalCodeAdapter`，
体现了“面向接口编程 + 开闭原则”。

## 目录结构

```
.
├── src/             Java 源码（9 个类）
└── diagrams/        UML 类图（classdiagram.png）
```

## 技术栈

Java（JDK 8+）、Swing / AWT、UML、面向对象设计

## 运行

```bash
cd src
javac *.java
java ZipCodeTester
```

## 说明

课程学习用途，代码用于演示对象适配器模式的结构与协作方式。
