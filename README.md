# TACTICAL STRIKE: ZERO HOUR

A native Android 3D FPS prototype built with Kotlin + JNI + C++17 + OpenGL ES 3.0.

## Overview
This project implements a lightweight custom game engine, a native OpenGL renderer, player input, enemy AI, mission flow, and Android lifecycle integration. The game is designed to run as a native Android application with a debug APK build workflow.

## Structure
- `app/src/main/java/com/tacticalstrike/game` – Kotlin Android app and input/UI integration.
- `app/src/main/cpp` – native game engine, renderer, enemy and weapon systems, JNI bridge.
- `.github/workflows/android.yml` – GitHub Actions APK build workflow.

## Build locally
```bash
./gradlew :app:assembleDebug
```

The APK is generated at:
`app/build/outputs/apk/debug/app-debug.apk`

## Build in GitHub Actions
Push to `main` or run `workflow_dispatch` from the GitHub Actions tab. The workflow builds the native Android project and uploads the APK as an artifact named `TACTICAL-STRIKE-ANDROID-APK`.

## Notes
This project is a buildable native Android foundation for a tactical sci-fi FPS. It includes a custom engine loop, touch HUD input, procedural scene rendering, enemy simulation, and mission progression logic.
