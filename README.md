# Widgets Demo

Небольшое Android-приложение на Java — песочница со стандартными элементами
интерфейса: Switch, CheckBox, ToggleButton, ImageView, поля ввода и календарь
посещаемости на основе [ZCustomCalendar](https://github.com/naishadhparmar/zcustomcalendar).

## Возможности

- Главный экран на ConstraintLayout: изображение, Switch (меняет фон экрана),
  CheckBox, ToggleButton, переход на второй экран
- Календарь с пометками дней («текущий», «присутствовал», «отсутствовал»)
  и всплывающей датой при выборе
- Второй экран с несколькими EditText и возвратом на главный

## Стек

| Область | Технологии                                        |
|---------|---------------------------------------------------|
| Язык    | Java 8                                            |
| UI      | Activity, ConstraintLayout, LinearLayout, Material Components |
| Прочее  | ZCustomCalendar 1.0.1                             |

## Сборка

Проект открывается в Android Studio (Gradle 6.5, AGP 4.1, JDK 8–11).
Важно: библиотека `org.naishadhparmar.zcustomcalendar:zcustomcalendar:1.0.1`
публиковалась только в JCenter, который её больше не отдаёт, а проект настроен
на Gradle 6.5 / AGP 4.1. Для сборки на современном окружении нужно обновить
Gradle и AGP и подключить библиотеку из исходников или заменить календарь
стандартным `CalendarView`.
