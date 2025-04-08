data class Product(
    val name: String,
    val value: Double
) {
    init {
        require(value > 0) { "Объем не может быть равен 0 и отрицательным" }
    }
}