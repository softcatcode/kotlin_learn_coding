# Подключение библиотек
Первый graidle-файл:
```Kotin
buildscript {
    dependencies {
        // jetpack navigation
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.5.2"
    }
}
```
Второй graidle-файл:
```Kotlin
plugins {
    id 'androidx.navigation.safeargs'
    id 'kotlin-kapt'
}

dependencies {
    implementation 'androidx.navigation:navigation-fragment-ktx:2.5.2'
    implementation 'androidx.navigation:navigation-ui-ktx:2.5.2'
}
```
Если использовать не последнюю версию подключаемых файлов, то может не работать.

# Создание navigation файла
В папке ___res___ создать папку navigation, а в ней - main_navigation.xml.<br>
В этом файле настроить схему навиггации.

# Файл _activity_main.xml_
К тегу _FragmentContainerView_ ужно добавить строки:
```Kotlin
app:navGraph="@navigation/main_navigation"
app:defaultNavHost="true"
android:name="androidx.navigation.fragment.NavHostFragment"
```

# Запуск фрагмента
Автоматически создаютя классы для передачи аргументов с соответствующими названиями.
```Kotlin
findNavController().navigate(R.id.action_introFragment_to_gameFragment); // without args
findNavController().navigate(IntroFragmentDirections.actionIntroFragmentToGameFragment(args)) // with args
```
___args___ - список аргументов (через ,).<br>
Чтобы настроить завершение работы фрагмента, нужно настроить это событие в main_navigation.xml (указать, куда переходить)<br>
и вызвать метод ```findNavController().popBackStack()```.

# Иницилизация аргументов
```Kotlin
private val args by navArgs<MyFragmentArgs>()
```
Класс _MyFragment_ сгенерируется автоматически.
