# Widgets Demo

Небольшое Android-приложение на Java — песочница со стандартными элементами
интерфейса: Switch, CheckBox, ToggleButton, ImageView, поля ввода и календарь.

## Возможности

- Главный экран на ConstraintLayout: изображение, Switch (меняет фон экрана),
  CheckBox, ToggleButton, переход на второй экран
- Календарь (CalendarView): выбранная дата показывается во всплывающем сообщении
- Второй экран с несколькими EditText и возвратом на главный

## Стек

| Область | Технологии                                        |
|---------|---------------------------------------------------|
| Язык    | Java 8                                            |
| UI      | Activity, ConstraintLayout, LinearLayout, Material Components |

## Сборка

Требуется JDK 11–17 и Android SDK 30.

```bash
./gradlew assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`.
