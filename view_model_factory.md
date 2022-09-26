Объекты типа _ViewModel_ нельзя создавать с помощью обычного конструктора (var myViewModel = MyViewModel()),<br>
так как тогда она не сможет пережить переворота экрана: система удалит её и создаст заново, поэтому сохранённые<br>
данные потеряюся.<br>
# Альтернативный способ создания _viewModel_
```Kotlin
viewModel = ViewModelProvider(this, Factory())[ViewModel::class.java]
```
В этой конструкции __this__ - ссылка на объект, содержащий эту viewModel.<br>

# Создание своего объект _MyViewModel_, принимающий параметры
```Kotlin
viewModel = ViewModelProvider(this, MyViewModelFactory(args))[MyViewModel::class.java]
```
Но лучше использовать оператор ___lazy___:
```Kotlin
private val viewModel by lazy {
    ViewModelProvider(this, MyViewModelFactory(args))[MyViewModel::class.java]
}
```
# Написание _MyViewModelFactory_
_Factory_ нужен для того, чтобы с помощью него объект _viewModel_ правильно создался.<br>
```Kotlin
class MyViewModelFactory(private val args): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MyViewModel::class.java))
            return MyViewModel(level) as T
        else
            throw RuntimeException("My view model assign error: $modelClass")
    }
}
```
Проверка ModelClass.isAssignableFrom(MyViewModel::class.java) нужна для того, чтобы пресечь ситуацию, когда<br>
с помощью _MyViewModelFactory_ иницилизируется класс, отличный от _MyViewModel_.<br>
