# Создание окна с текстовым сообщением
## Код запуска и иницилизации
```Kotlin
val builder: AlertDialog.Builder = AlertDialog.Builder(this)
builder.setTitle("info")
builder.setMessage("some text")
builder.setNeutralButton("ok", ::infoDialogClickListener)
builder.setNegativeButton("nb", ::infoDialogClickListener)
builder.setPositiveButton("pb", ::infoDialogClickListener)
builder.show()
```
## Обработка нажатия на кнопки
```Kotlin
    private fun infoDialogClickListener(dialogInterface: DialogInterface, id: Int) {
        when (id) {
            AlertDialog.BUTTON_POSITIVE -> {
                Log.i("dialog", "positive")
            }
            AlertDialog.BUTTON_NEGATIVE -> {
                Log.i("dialog", "negative")
            }
            AlertDialog.BUTTON_NEUTRAL -> {
                Log.i("dialog", "neutral")
            }
        }
    }
```
# Создание окна со списком для выбора
Метод ___setMessage___ не должен быть использован.<br>
В папке _drawable/values_ создаётся _.xml_ файл (любое название):
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string-array name="multi_item">
        <item>1</item>
        <item>2</item>
        <item>3</item>
        <item>4</item>
        <item>5</item>
    </string-array>
</resources>
```
## Множественный выбор
```Kotlin
builder.setMultiChoiceItems(R.array.multi_item, null) {
    dialog, index, choice ->
    Log.i("dialog", "$index: $choice")
}
```
Второй параметр ___setMultiChoiceItems___ - массив __true__/__false__: выбрано или нет.
## Одиночный выбор
```Kotlin
builder.setSingleChoiceItems(R.array.multi_item, 0) {
            dialog, index ->
            Log.i("codingeveryday", "$dialog: $index")
        }
```
Второй параметр ___setSingleChoiceItems___ - индекс выбранного элемента.
# Как менять расположение кнопок (stackoverflow)
```Kotlin
AlertDialog alertDialog = new AlertDialog.Builder(this).create();
alertDialog.setTitle("Title");
alertDialog.setMessage("Message");

alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes",
        new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No",
        new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                 dialog.dismiss();
            }
         });
alertDialog.show();

Button btnPositive = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
Button btnNegative = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);

LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) btnPositive.getLayoutParams();
layoutParams.weight = 10;
btnPositive.setLayoutParams(layoutParams);
btnNegative.setLayoutParams(layoutParams);
```
