# Widgets Demo

A small Android app in Java: a sandbox for standard UI elements:
Switch, CheckBox, ToggleButton, ImageView, input fields, and a calendar.

## Features

- Main screen built with ConstraintLayout: an image, a Switch (changes the screen
  background), a CheckBox, a ToggleButton, and navigation to a second screen
- Calendar (CalendarView): the selected date is shown in a popup message
- A second screen with several EditText fields and a way back to the main screen

## Tech stack

| Area     | Technologies                                      |
|----------|---------------------------------------------------|
| Language | Java 8                                            |
| UI       | Activity, ConstraintLayout, LinearLayout, Material Components |

## Build

Requires JDK 11–17 and Android SDK 30.

```bash
./gradlew assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`.
