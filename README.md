# Automation Assignment

An automation framework for automation tests/scripts catering the following acceptance criteria


# What is this repository for?

This repo is used to maintain the assignment Automation Framework.

# Background:

Cucumber feature has been designed to cater the acceptance criteria for story with cucumber tags features.For instance, scenarios have been tagged 
with smoke and prod tags to achieve environment or test phase specific execution. Scenario in feature file also have been designed in a such way that both scearnio will run in sequence on both chrome and firefox browers.

# Acceptance criteria

# Test User Story

As a Xero User,
In order to manage my business successfully,
I want to be able to add an “ANZ (NZ)” bank account inside any Xero Organisation and logs out from application successfully

# Built with

Java, Maven, Cucumber, Extent Report, TestNG,Eclipse

# Prerequisites

- Since test scripts are created in apache maven project, so maven should be installed and configured in local system on which the tests are going to be executed.
- TestNG framework should be configured in Eclipse
- Cucumber should be configured in Eclipse 

# Versioning and central repository

GitHub is used as central repository and for versioning.

# Script Execution:

Scenarios enlisted in feature file can be run with the following approaches:

***Approach 1- On Local System:***

Navigate to project root directory (where pom.xml is located) and run **mvn clean install -Dcucumber.filter.tags="@smoke"** to run a cucumber scenarios tagged with @smoke or @regression

**OR**

Navigate to **src/test/resources/runner/testng.xml**, right click on it and choose Run as-->TestNG Suite


# Reporting 

- Extent Reporting framework is used to create interactive and detailed reports for the tests.Once the scripts are executed, refresh the project either in eclipse or directory level and navigate to ***report*** folder and expand. Right click the report and open in web browser to view the execution results in graphical report. 
Reports for chrome browser with execution date and timings have been generated.


# Download a Framework


# Framework Architecture

- src/test/resources/Feature_Xero - all the cucumber features files (files .feature ext) goes here.
- src/test/java/com/cucumber/stepDef - all step defintions under this package for feature steps.
- src/test/java/com/cucumber/runner - runner class is placed under this to run scripts on local system
- src/main/java/com/cucumber/baseSteps/steps - contains a base class (to set up framework or initilize web driver) and to be inherited by other classes.
- src/main/java/com/cucumber/extent- Contains classes in relation with extent reporting
- src/main/java/com/cucumber/page- contains classses specific to related pages with related locators and methods.
- src/main/java/com/cucumber/utils- contains utility classes in lieu of generic wrapper methods
- src/main/resouces/runner- contains testng.xml to configure test case execution enviornment
- src/test/resources/logs- contains text file to gather logs
- src/test/resources/properties- contains properties to define framework properties such as app url
- com.cucumber.assignment/reports- contains test execution extent report

# References: Execution videos for have shared on email.

# Author
Hitesh Ghai 

