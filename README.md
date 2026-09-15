# Jenkins Maven JUnit Project

This repository contains a simple Maven Java project with multiple JUnit 5 test cases for a Jenkins CI assignment.

## Jenkins configuration

Create a **Freestyle project** in Jenkins.

Under **Source Code Management**:
- Select **Git**
- Repository URL: `https://github.com/LukePickle11/JenkinsRepo.git`
- Branch: `*/main`

Under **Build Steps**:
- Select **Invoke top-level Maven targets**
- Goals: `clean test`

The project contains 6 JUnit tests. A successful Jenkins build should report 0 failures and 0 errors.
