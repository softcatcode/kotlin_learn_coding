Подключение библиотеки:
```Kotlin
plugins {
    id 'kotlin-parcelize'
}
```

Затем нужно расширить класс от _Parcelable_:
```Kotlin
 @Parcelize
enum class Level: Parcelable {
    TEST, EASY, NORMAL, HARD
}
```

Передача в качестве параметра:
```Kotlin
val args = Bundle().apply {
    putParcelable(KEY_STR, obj)
}
```
