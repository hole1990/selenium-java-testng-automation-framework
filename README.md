# Selenium Java TestNG Automation Framework

A hands-on Selenium WebDriver automation framework built using Java, TestNG, Maven, and the Page Object Model (POM) design pattern.

This project demonstrates a structured approach to UI test automation with reusable components and maintainable test code.

---

## 🚀 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Git & GitHub

---

## 🏗️ Framework Structure

```text
selenium-java-testng-automation-framework
│
├── pom.xml
├── .gitignore
│
└── src
    └── test
        └── java
            └── com.vishalhole
                │
                ├── base
                │   └── BaseTest.java
                │
                ├── factory
                │   └── DriverFactory.java
                │
                ├── pages
                │   └── LoginPage.java
                │
                └── tests
                    ├── GoogleTest.java
                    └── LoginTest.java
