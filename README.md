# Day 3 - Android (Kotlin Fundamentals)

An educational Android application demonstrating core Kotlin programming concepts and Android development patterns.

## Overview

This project serves as a learning resource for Kotlin language features and Android app architecture, featuring a simple task management structure with Categories and Users.

## Key Concepts Covered

### Classes & Objects
- Data models: `User`, `Task`, `Category`
- Multiple constructor overloading
- Default parameter values

### Collections
- `ArrayList` for task and category management
- `HashMap` for flexible data initialization

### Companion Objects
- `AppData` uses companion object for static-like access
- Global task management without instance creation

### Extension Functions
- `User+myFun.kt`: Custom functions returning Pair tuples
- Demonstrates Kotlin's functional programming capabilities

### Enums & When Expressions
- `Direction` enum (NORTH, SOUTH, EAST, WEST, SOUTHWEST)
- `RGB` enum with color component values
- Pattern matching with `when` statements

## Tech Stack

| Component | Technology |
|-----------|------------|
| Language | Kotlin 1.6.10 |
| Platform | Android API 29-32 |
| Build | Gradle 7.0.3 |
| UI | AndroidX, Material Design |

## Project Structure

```
app/src/main/java/com/oddinstitute/day3/
├── MainActivity.kt        # Main launcher activity
├── DetailsActivity.kt     # Secondary activity
├── AppData.kt             # Global data (companion object)
├── User.kt                # User model (multiple constructors)
├── NewUser.kt             # Nullable properties example
├── Task.kt                # Task data class
├── Category.kt            # Category grouping tasks
├── Direction.kt           # Enum examples
├── User+myFun.kt          # Extension function
├── User+myFun2.kt         # Additional extensions
└── User+other.kt          # More extensions
```

## User Creation Examples

```kotlin
// Multiple initialization patterns
val user1 = User("Steve", "Blue", 235, 85f)
val user2 = User("Sarah", "Brown")
val user3 = User(hashMapOf("name" to "Jenny", "eyeColor" to "green"))
val user4 = NewUser("email@example.com")
```

## Task Management

```kotlin
// Access global data via companion object
AppData.populateTasks()
AppData.addTask(Task("New task"))
AppData.allTasks  // List<Category>
```

## Building

```bash
./gradlew build
./gradlew installDebug
```

## Requirements

- Android Studio
- Android SDK 32
- Kotlin 1.6.10
- Device/Emulator API 29+
