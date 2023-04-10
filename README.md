# KMMSiddurApp
A free sidduur app for Android and iOS, written in Kotlin and Jetpack Compose.

# Build
Set gradle JDK version to 17. 

## iOS
To build the (unmaintained) UIKit version run `./gradlew iosCompose:iosDeployIPhone13ProDebug`. This may be neccesary to do first in order to build the Compose version. To build the compose version, open the project in XCode on a Mac (I am using an M1 Air) and press the "Play" button.

## Android
Build the app as usual, just like any other app.

# Credits
Based on this [guide](https://medium.com/better-programming/jetpack-compose-for-ios-getting-started-step-by-step-e7be6f52edd4)
