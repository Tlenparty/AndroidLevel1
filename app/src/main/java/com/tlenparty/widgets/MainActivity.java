package com.tlenparty.widgets;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;


/**
 * Практическое задание
 * Создать проект со следующими пользовательскими элементами: TextView, EditText, Button, Switch,
 * CheckBox, ToggleButton. Для работы использовать LinearLayout. Использовать различные шрифты,
 * цвета, размеры, прочие атрибуты.

 * Создать ещё один макет (если не получается, то проект) с несколькими EditText, где использовать
 * атрибут inputType: text, textPersonName, phone, number, textPassword, textEmailAddress и другие
 * значения.
 *
 * Добавить в проект элемент CalendarView.
 * * Разобраться, что такое параметр ems.
 */


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView; // изображение робота
    private Button  btn_changeActivity;
    private ConstraintLayout background;
    private EditText editText;
    private Switch switchButton;
    private ToggleButton toggleButton;
    private CheckBox checkBox;
    private CalendarView calendarView;


    @Override
    // Точка входа , начало работы activity. Bundle - контейнер в который мы кладем savedInstanceState
    //onCreate должен вызывать методы, без какой либо логики
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        //setNetText();
        setAndroidRobotImageView();
        onClickSecondActivity();
        changeColorBySwitch();
        switchButton.setOnClickListener(this);
    }

    private void initViews() {
        //Чтобы найти view пишем. R - класс для доступа к ресурсам(к id)
        //Надо найти imageView (crashNullPointerException
        imageView = findViewById(R.id.imageView);
        switchButton = findViewById(R.id.switchButton);
        toggleButton = findViewById(R.id.toggleButton);
        checkBox = findViewById(R.id.checkBox);
        btn_changeActivity = findViewById(R.id.changeActivity);
        calendarView = findViewById(R.id.calendar_view);
        background= findViewById(R.id.background);
        // При выборе даты показываем её во всплывающем сообщении
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            String date = dayOfMonth + "/" + (month + 1) + "/" + year;
            Toast.makeText(getApplicationContext(), date, Toast.LENGTH_LONG).show();
        });
    }

    private void setNetText() {
        // Устанвливаем текст. new_text ссылка на ресурс.
       // textView.setText(R.string.new_text);
        // Если нужна сама строка то. Берем строчку программно
        //String appNameStr = getString(R.string.app_name);
    }

    private void changeColor() {
        int colorRes = R.color.purple_700;
        // Контекст - обьект для доступа к ресурсам. Строки, картинки цвета, активити
        int color = ContextCompat.getColor(getApplicationContext(), colorRes);
       // textView.setTextColor(color);
    }

    private void setAndroidRobotImageView() {
        // ссылка на картинку
         int imageRes = R.drawable.ic_baseline_android_24;
        // Класс, который представляет картинки
         Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), imageRes);
        //В imageView.SetImageResource можнно передать imageRes
        imageView.setImageResource(R.drawable.ic_baseline_android_24);

    }

    private void changeColorBySwitch() {
    }

    private void onClickSecondActivity() {
        btn_changeActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
            // Запуск activity
            startActivity(intent);
        });
    }

    @Override
    public void onClick(View v) {
        background.setBackgroundResource(R.color.blue_dark);
    }
}