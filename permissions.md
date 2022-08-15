Получение разрешения на примере чтения из внешнего хранилища и записи в него.
# 1. Объявление в Manifest
Строки
```xml
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
```
Должны быть записаны в файл _AndroidManifest.xml_ перед строкой ```<application```.
# 2. Явный запрос разрешения
Функция __onRequestPermissionResult__ вызывается после любого запроса разрешения.<br>
Статическое поле __REQUEST_READ_WRITE_CODE__ используется для определения, после какого запроса она была вызвана.<br>
## Отправка запроса
```Kotlin
ActivityCompat.requestPermissions(  this,
                                    arrayOf(
                                        Manifest.permission.READ_EXTERNAL_STORAGE,
                                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                                    ), REQUEST_READ_WRITE_CODE
                                 )
```
## Обаботка результата запроса
```Kotlin
override fun onRequestPermissionResult(
          requestCode: Int,
          permissions: Array<out String>
          grantResult: IntArray
        ) {
 
    when (requestCode) {
        REQUEST_READ_WRITE_CODE -> {
            if (grantResult[0] != PackageManager.PERMISSION_GRANTED) {
                Log.i("requests", "Read permission denied.")
                return
            }
            if (grantResult[1] != PackageManager.PERMISSION_GRANTED) {
                Log.i("requests", "Write permission denied.")
                return
            }
            Log.i("request", "Read and write permissions are successfully granted.")
            
        }
        else -> {
            Log.i("requests", "Undefined permission request code.")
            return
        }
    }
}
```
# Проверка наличия разрешения
При использовании разрешения нужно проверить, не было ли оно отозвано.
```Kotlin
val readStatus = ContextCompat.checkSelfPermision(this, Manifest.permision.READ_EXTERNAL_STORAGE)
val readStatus = ContextCompat.checkSelfPermision(this, Manifest.permision.READ_EXTERNAL_STORAGE)
if (readStatus != PackageManager.PERMISSION_GRANTED)
    return
if (writeStatus != PackageManager.PERMISSION_GRANTED)
    return
```
