```Kotlin
private fun setupSwipeProcessing() {
    val callback = object: ItemTouchHelper.SimpleCallback(
        0,
        ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
    ) {
        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean {
            return false
        }
        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            val item: ShopItem = adapter.getItem(viewHolder.adapterPosition)
            viewModel.deleteItemById(item.id)
        }
    }
val itemTouchHelper = ItemTouchHelper(callback)
itemTouchHelper.attachToRecyclerView(recyclerView)
```
