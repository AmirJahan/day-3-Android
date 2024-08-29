# Day 3 - Android (Kotlin Fundamentals)

This repository contains an Android application designed to demonstrate core Kotlin programming concepts. It serves as an educational project for learning how to structure Android apps and utilize Kotlin language features.

## Project Overview

The application features a simple task management structure with Categories and Users, showcasing object-oriented programming in Kotlin.

## Key Concepts Covered

*   **Classes & Objects**: Implementation of data models like `User`, `Task`, and `Category`.
*   **Collections**: Usage of `ArrayList` and `HashMap` for managing data.
*   **Companion Objects**: Utilizing `companion object` in `AppData` for static-like access to shared data.
*   **Extension Functions**: Demonstrating how to extend functionality of existing classes (e.g., `User+myFun.kt`).
*   **Android Components**: Basic structure with `MainActivity` and `DetailsActivity`.

## Structure

*   `com.oddinstitute.day3`: Main package containing the source code.
    *   **Models**: `User.kt`, `Task.kt`, `Category.kt`
    *   **Data Management**: `AppData.kt`
    *   **Extensions**: `User+myFun.kt`, `User+other.kt`