class ColdStore(
    val name: String,
    val maxValue: Double,
    val maxTemperature: Double,
    val minTemperature: Double
) {
    private var isOpen: Boolean = false
    private var items: MutableList<Product> = mutableListOf()
    private var currentTemperature: Double = 0.0

    fun openDoor(): Boolean {
        if (!isOpen) {
            isOpen = true
            return true
        }
        return false
    }

    fun closeDoor(): Boolean {
        if (isOpen) {
            isOpen = false
            return true
        }
        return false
    }

    fun addProduct(product: Product): Boolean {
        if (!isOpen && product.value > 0)
            return false

        val usedSpace = items.sumOf { it.value }
        if (usedSpace + product.value > maxValue)
            return false
        return items.add(product)
    }

    // dellProduct

    fun setTemperature(newTemp: Double): Boolean {
        if (newTemp in minTemperature..maxTemperature) {
            currentTemperature = newTemp
            return true
        }
        return false
    }
}