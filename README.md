# idea-test-breakpoints

Minimal project where test breakpoints are not working for included Gradle projects

## Steps to replicate

1. Search for `Add breakpoint here` in this project
2. Add breakpoints to those lines of the comments
3. Running a debug test for `library/src/CalculateTest` does not stop at the breakpoint
4. Running a debug test for `src/CalculateTest` does stop at the breakpoint

Both `build.gradle.kts` have the same configuration and both test files are the same

## Details about the system

IntelliJ IDEA 2021.3.2
Build #IU-213.6777.52, built on January 28, 2022

Runtime version: 11.0.13+7-b1751.25 x86_64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.

IDEA Kotlin Plugin version: 213-1.6.10-release-961-IJ6777.52

## Workaround

In `Preferences > Build, Execution, Deployment > Build Tools > Gradle`,
set `Run tests using: IntelliJ IDEA` makes the breakpoints for `library/src/CalculateTest` works