MadGames 🎮
A cross-platform gaming discovery app built with Kotlin Multiplatform and Compose Multiplatform

🚀 Key Features
Cross-Platform Support: Runs on Android, iOS, and Desktop (JVM)
Game Discovery: Browse and discover games using the RAWG Video Games API
Search Functionality: Search for specific games (implementation in progress)
Favorites System: Save and manage favorite games (implementation in progress)
Modern UI: Built with Jetpack Compose/Compose Multiplatform for native performance

🏗️ Architecture & Tech Stack
Kotlin Multiplatform: Share business logic across platforms
Compose Multiplatform: Modern declarative UI framework
Clean Architecture: Organized in feature-based modules (data, domain, ui)
MVVM Pattern: ViewModel-driven UI state management
Dependency Injection: Koin for DI across all platforms
Networking: Ktor client for API communication
Image Loading: Coil3 for efficient image loading and caching
Database: SQLDelight for local data persistence (setup ready)

🎯 API Integration
Powered by the RAWG Video Games Database API for comprehensive game data including:
Game metadata and descriptions
High-quality game artwork and screenshots
Search and filtering capabilities

### Build and Run Android Application

To build and run the development version of the Android app, use the run configuration from the run widget
in your IDE’s toolbar or build it directly from the terminal:
- on macOS/Linux
  ```shell
  ./gradlew :composeApp:assembleDebug
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:assembleDebug
  ```

### Build and Run Desktop (JVM) Application

To build and run the development version of the desktop app, use the run configuration from the run widget
in your IDE’s toolbar or run it directly from the terminal:
- on macOS/Linux
  ```shell
  ./gradlew :composeApp:run
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:run
  ```

### Build and Run iOS Application

To build and run the development version of the iOS app, use the run configuration from the run widget
in your IDE’s toolbar or open the [/iosApp](./iosApp) directory in Xcode and run it from there.

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
