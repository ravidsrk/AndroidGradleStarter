Android Gradle Studio
=====================

[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/ravidsrk/AndroidGradleStarter?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)     [![Build Status](https://travis-ci.org/ravidsrk/AndroidGradleStarter.svg?branch=master)](https://travis-ci.org/ravidsrk/AndroidGradleStarter)


A sample android starter project to demonstrate the integration of the following tools:

- Automation:             Gradle
- Testing:                Android Testing Framework, Robotium, Roboelectric (JUnit, Android)
- Continuous Integration: TravisCI

Sample Tasks
------------

- Adding testing-only project dependencies
- Using square spoon to run integraton tests
- Writing android tests with robotium
- Writing junit tests with robolectric
- Android tests can be run with only Robotium use "gradle connectedAndroidTest"
- Android tests can be run with Robotium and Spoon "gradle spoon"
- Robolectric junit tests can be run with "gradle clean test"


License
-------

    Copyright 2014 Ravindra Kumar.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
