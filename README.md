Android Gradle Studio
====================

[![Build Status](https://travis-ci.org/ravidsrk/AndroidGradleStarter.png?branch=master)](https://travis-ci.org/ravidsrk/AndroidGradleStarter)


A sample android starter project to demonstrate the integration of the following tools:

- Automation:             Gradle
- Testing:                Android Testing Framework, Robotium, Roboelectric (JUnit, Instrumentation)
- Continuous Integration: TravisCI

Sample Tasks
------------

- adding testing-only project dependencies
- using square spoon to run integraton tests
- writing instrumentation tests with robotium
- writing junit tests with robolectric
- Instrumentation tests can be run with only Robotium use "gradle connectedInstrumentTest"
- Instrumentation tests can be run with Robotium and Spoon "gradle spoon"
- Robolectric junit tests can be run with "gradle clean test"
