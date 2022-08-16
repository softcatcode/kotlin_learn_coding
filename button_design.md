# Подготовка
1) Создать _.xml_ файл с любым названием в папке _res/drawable_.<br>
2) Написать в этом файле:
```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
      
</shape>
```
У тега ___shape___ есть настройка ```android:shape```.
```
android:shape="oval"
android:shape="rectangle"
```
3) Применить с помощью _android:background_ к кнопке __androidx.appcompat.widget.AppCompatButton__ (не ___Button___).
# Теги рисования
| Название | Назначение |
|---|---|
| ___gradient___ | цвет (градиент) |
| ___solid___ | сплошной цвет |
| ___corners___ | радиус углов |
| ___stroke___ | цвет и толщина рамки |
| ___size___ | размер |

# Примеры настроек тегов
## gradient
```xml
<gradient
    android:startColor="#2DF4BC"
    android:endColor="#182255"
    android:centerColor="#A81FF2"
    android:angle="90"
/>
```
## solid
```xml
<solid android:color="@color/green"/>
```
## corners
```xml
<corners
     android:radius="100dp"
     android:bottomLeftRadius="5dp"
/>
```
## stroke
```xml
<stroke
    android:width="5dp"
    android:color="@color/white"
/>
```
## size
```xml
<size
    android:width="100dp"
    android:height="50dp"
/>
```
# Пример готового дизайна кнопки
```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <gradient
        android:startColor="#2DF4BC"
        android:endColor="#182255"
        android:centerColor="#A81FF2"
        android:angle="90"
    />
    <corners android:radius="100dp" android:bottomLeftRadius="5dp"/>
    <stroke android:width="5dp" android:color="@color/white"/>
    <size android:width="100dp" android:height="50dp"/>
</shape>
```
