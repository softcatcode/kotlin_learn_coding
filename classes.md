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
По умолчанию поля ___name___, ___age___ и ___points___ должны иметь какие-то занчения.<br>
Эти значения можно будет менять, обращаясь к ним при использовании класса (если они с модификатором ___var___, а не ___val___).

# Добавление иницилизатора
__class__ _User_(<параметры для иницилизации>) {...}<br>
Иницилизатор описывается с помощью ```init {...}```

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
При создании класса сразу вызовется ___init___.<br>
Поля ___name___ и ___age___ иницилизируются в ___init___, поэтому их значение по умолчанию можно не указывать.<br>
Ключевое слово ```this``` используется для обозначения этого же класса.<br>
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

Поля ___name___ и ___age___ объявлены так, что их значения будут приниматься в моммент создания класса.<br>
Кстати, по умолчания иницилизатор определяется как ```init {}``` (если его не писать).

# Как добавить конструктор
Конструкторы позволяют создавать класс, используя различные фактические параметры, а не ровно те, которые требует иницилизатор.<br>
Конструктор примет любые параметры, на которые он расчитан, и сам вызовет иницилизатор "правильным" способом,<br>
а затем, если нужно, выполнит какой-либо код.

```Kotlin
class User(var name: String, var age: UInt)
{
    var points: Long = 0

    constructor(name: String): this(name, 20U)
    {
        print("constructed ${name}\n")
    }
    constructor(age: Int): this("None", age.toUInt())
    constructor(name: String, age: Double): this(name, age.toUInt())

    fun get_score(): Long = points / age.toLong()
    fun show() {
        println("Player $name got score ${get_score()}.")
    }
}
```
### Замечание 1
Иницилизатор - главный конструктор.<br>
Его параметры указываются после имени класса, а тело описывается с помощью __init__.
### Замечание 2
Если добавить конструктор ```constructor(name: String, age: Int): this(name, age.toUInt())```,<br>
то получится следующее сообщение об ошибке:
```
Kotlin: Platform declaration clash: The following declarations have the same JVM signature (<init>(Ljava/lang/String;I)V):
    constructor User(name: String, age: Int) defined in User
    constructor User(name: String, age: UInt) defined in User
```

