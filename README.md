# MediaMonitor
[![](https://jitpack.io/v/andyxialm/MediaMonitor.svg)](https://jitpack.io/#andyxialm/MediaMonitor)

Listen in media file changed.

### Usage

#### Gradle
##### Step 1. Add the JitPack repository to your build file
~~~ xml
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
~~~

##### Step 2. Add the dependency
~~~ xml
dependencies {
    compile 'com.github.andyxialm:MediaMonitor:0.1.0'
}
~~~


##### Java Code
```java
MediaType.ALL
MediaType.MEDIA_TYPE_IMAGE
MediaType.MEDIA_TYPE_AUDIO
MediaType.MEDIA_TYPE_VIDEO
```

```java
MediaMonitor
    .listen(this, MediaType.ALL)
    .debounce(100, TimeUnit.MILLISECONDS)
    .subscribeOn(Schedulers.io())
    .observeOn(AndroidSchedulers.mainThread())
    .subscribe(new Action1<String>() {
        @Override
        public void call(String path) {
        }
    });
```

If a path is specified, matching is done on the whole path.

```java
listen(Context context, @MediaType int mediaType, List<Directory> rules)
```

### Example ( Where to Use it )
![](https://github.com/andyxialm/MediaMonitor/blob/master/art/screenshot.jpg?raw=true)


### Inspire
[Piasy/RxScreenshotDetector](https://github.com/Piasy/RxScreenshotDetector)

### License

    Copyright 2017 andy (https://github.com/andyxialm)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.