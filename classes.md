# Клласс без особенностей Kotlin
```Kotlin
class User
{
    var points: Long = 0
    var name: String = ""
    var age: UInt = 0U

    fun get_score(): Long = points / age.toLong()
    fun show() {
        println("Player $name got score ${get_score()}.")
    }
}

fun main()
{
   var u: User = User()
    u.name = "John"
    u.age = 20U
    u.points += 100
    u.show()
}
```

# Добавление конструктора
__class__ _User_(<параметры конструктора>) {...}<br>
Конструктор описывается с помощью ```init {...}```

```Kotlin
class User(name: String, age: UInt)
{
    var points: Long = 0
    var name: String
    var age: UInt

    init {
        this.name = name
        this.age = age
    }

    fun get_score(): Long = points / age.toLong()
    fun show() {
        println("Player $name got score ${get_score()}.")
    }
}

fun main()
{
   var u: User = User("John", 20U)
    u.points += 100
    u.show()
}
```
Поля ___name___ и ___age___ иницилизируются в конструкторе, поэтому их значение по умолчанию можно не указывать.<br>
Ключевое слово ```this``` используется для обозначения этого же класса<br>
(для обращения к полям, если их имена совпадают с именами параметров корнструктора).

# Что если доавить ```var``` перед параметром конструктора
```Kotlin
class User(var name: String, var age: UInt)
{
    var points: Long = 0
    
    init {
        print("class User created\n")
    }
    
    fun get_score(): Long = points / age.toLong()
    fun show() {
        println("Player $name got score ${get_score()}.")
    }
}

fun main()
{
   var u: User = User("John", 20U)
    u.points += 100
    u.show()
}
```

Поля ___name___ и ___age___ объявлены так, что их значения будут приниматься в моммент вызова конструктора.<br>
Кстати, по умолчания конструктор выглядит как ```init {}``` (если его не писать).
