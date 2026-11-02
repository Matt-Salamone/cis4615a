# CIS4615 Homework 2 - Java Security Vulnerabilities

This repository contains Java examples based on the SEI CERT Oracle Coding Standard for Java.

## Objective

Demonstrate 10 Java security weaknesses and track their corrections using Git and GitHub.

## Repository Structure

- `master`: Original, intentionally noncompliant Java examples.
- `fix-*` branches: Corrected implementations of individual security weaknesses.

## Reference

https://cmu-sei.github.io/secure-coding-standards/sei-cert-oracle-coding-standard-for-java/

## HW02 — CERT Java Security Examples

This repository contains ten short Java programs illustrating
security weaknesses from the SEI CERT Oracle Coding Standard
for Java and their corresponding corrections.

### Branches

- `master`: Original noncompliant (vulnerable) examples.
- `fix/security-examples`: Corrected versions of all ten examples.

The correction branch is intentionally not merged into master.
Each security correction is tracked in a separate Git commit.

### Security rules

| Rule | Filename | Security weakness |
|---|---|---|
| IDS03-J | R00_IDS03_J.java | Unsanitized logging |
| EXP00-J | R02_XP00_J.java | Ignored return value |
| NUM03-J | R03_NUM03_J.java | Incorrect unsigned integer type |
| STR03-J | R04_STR03_J.java | Binary data encoded as text |
| MET01-J | R06_MET01_J.java | Assertions used for argument validation |
| OBJ01-J | R05_OBJ01_J.java | Public mutable field |
| ERR00-J | R07_ERR00_J.java | Suppressed checked exception |
| THI00-J | R10_THI00_J.java | Direct invocation of Thread.run() |
| FIO04-J | R13_FIO04_J.java | Resource not explicitly closed |
| MSC02-J | R49_MSC02_J.java | Predictable security-sensitive randomness |

The professor's filename R02_XP00_J.java is retained exactly
as assigned; the standard identifies this rule as EXP00-J.

### Compile and run

Requires JDK 25.

In Git Bash, from the repository root:

    javac R*.java
    java R00_IDS03_J

Replace R00_IDS03_J with any other example class name.

The FIO04-J demonstration expects to run from the repository root.

### Note

The master branch intentionally contains insecure code for
educational demonstration. The correction branch contains the
compliant implementations.
