Android Gradle Studio
=====================

[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/ravidsrk/AndroidGradleStarter?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)  [![Build Status](https://travis-ci.org/ravidsrk/AndroidGradleStarter.svg?branch=master)](https://travis-ci.org/ravidsrk/AndroidGradleStarter)


A sample android starter project to demonstrate the integration of the following tools:

- Automation:             Gradle
- Testing:                Android Testing Framework, Robotium, Roboelectric (JUnit, Android)
- Continuous Integration: TravisCI

Sample Tasks
------------

- adding testing-only project dependencies
- using square spoon to run integraton tests
- writing android tests with robotium
- writing junit tests with robolectric
- android tests can be run with only Robotium use "gradle connectedAndroidTest"
- Android tests can be run with Robotium and Spoon "gradle spoon"
- Robolectric junit tests can be run with "gradle clean test"
