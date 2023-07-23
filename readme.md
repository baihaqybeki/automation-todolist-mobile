# Automation Mobile To Do List - Java Appium (Cucumber)

![Java](https://img.shields.io/badge/java-v1.8-blue.svg)
![Appium](https://img.shields.io/badge/appium-v1.21.0-green.svg)
![Cucumber](https://img.shields.io/badge/cucumber-v6.11.0-yellow.svg)
![Mobile Testing](https://img.shields.io/badge/mobile-testing-orange.svg)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)

## Introduction

This repository provides a sample mobile testing automation framework using Java, Appium, and Cucumber. The mobile application used is To Do List (bit.ly/ToDoListApk) and the goal is to demonstrate how to set up a mobile testing project with BDD features, making it easy for testers and stakeholders to collaborate on defining test scenarios in a human-readable format.

## Features

- Utilizes Appium for mobile automation.
- Written in Java, making it easily understandable for developers and testers.
- Integrates with Cucumber for writing and executing feature files in Gherkin format.
- Follows the Page Object Model (POM) design pattern for maintainable and scalable test automation.
- Provides sample test scenarios covering basic mobile interactions and validations.

## Prerequisites

Before running the automation scripts, ensure you have the following prerequisites set up:

1. Java Development Kit (JDK) 1.8 or higher installed.
2. Appium server installed and running on your machine.
3. Mobile devices or emulators connected and accessible through Appium.
4. Android SDK
5. Set Desired Capability with device details used

To set the Desired Capability, open `src/main/java/com/splendapps/splendo/utils/Constants.java` and custom this script :

```java
	public static final String deviceName = "RMX1971";
	public static final String udid = "e381d3a4";
	public static final String platformName = "Android";
	public static final String platformVersion = "11";
	public static final String automationName = "Uiautomator2";
	public static final String appPackage = "com.splendapps.splendo";
	public static final String appActivity = "com.splendapps.splendo.MainActivity";
```

## Usage

To create new feature files and step definitions, add them to the `src/test/resources/features` and `src/test/java/steps` directories, respectively.

To create POM classes for new mobile screens, add them to the `src/main/java/com/splendapps/splendo/pages` directory.

## Project Structure

The project follows a standard Maven project structure and is organized as follows:

```
├── src/
│ ├── main/
│ │ └── java/
| |   └──com
| |    └──splendapps
| |      └──splendo
| |        └── [main application code]
│ └── test/
│ | |── java/
│ | | └── steps/
│ │ |  └── [Cucumber step definitions]
│ | └── resources/
│ |  └── Features
| |   └──[Cucumber feature files]
├── pom.xml
└── README.md
```
