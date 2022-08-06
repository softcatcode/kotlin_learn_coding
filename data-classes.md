Назначение data-классов - хранить набор полей.<br>
То есть от обычного класса отличается синтаксисом о отсутствием методов.<br>
Как и у обычных классов, он автоматически поддерживает такие методы, как toString(), hashCode() и т. д.

# Объявление data-классов
```Kotlin
data class User(var name: String, var age: UInt);

fun main()
{
    var u: User = User("Peter", 19U)
    print(u.toString())
}
```
```
User(name=Peter, age=19)
```
