Используется для последовательного применения нескольких методов к объекту.
```Kotlin
val user = User("Bob", 110).apply {
    setAge(45)
    setCity("London")
    score = 100 // class variable
}
```
Внутри ___apply___ есть прямой доступ ко всем полям и методам.
