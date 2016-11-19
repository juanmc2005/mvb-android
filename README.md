# Model View Binding
[![Release](https://jitpack.io/v/juanmc2005/mvb-android.svg)](https://jitpack.io/#juanmc2005/mvb-android)

A Java micro framework to ease Android development

## Why?
This (very) small framework aims to lower the time you spend coding typical java client use cases in Android, such as performing a request to a server and waiting for a response, or doing some background task while the user has to wait.
Since we tend to run into these issues throughout a lot of Android projects, I thought it would be interesting to see how much they could be abstracted/refactored into common behavior, so as to focus less on what's known and boring and more on what's new and challenging.

## What does it do?
It provides `UseCase` objects, which work with `SubjectProvider`s from [UCBindings](https://github.com/devsar/ucbindings) to give automatic rx subscription handling, cancelling, binding with an Activity, etc. These use cases can also be triggered and cancelled at will whenever you need to, so you have full control over them, you just need to specify what kind of caching policy you want, which is the source rx observable delivering the data (can be changed at runtime), and what kind of object you expect the observable to return.

Moreover, it is pluggable to RxJava, so you can expect to connect them easily and keep all the observables from your existing project.

## A Simple Example

```java
// TODO an example will be posted soon. Sorry :(
```

## Download

Add jitpack as a repository in your top-level `build.gradle` file

```gradle
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

Add the MVB dependency to your module-level `build.gradle` file

```gradle
dependencies {
    ...
    compile 'com.github.juanmc2005:mvb-android:x.y.z'
    ...
}
```

## License

```
Copyright 2016 Juan Manuel Coria

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
