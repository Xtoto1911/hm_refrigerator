class Refrigerator {
    constructor() {
        stores.add(ColdStore("Freez", 20.0, 5.0, -20.0))
    }

    constructor(coldStore: ColdStore) {
        stores.add(coldStore)
    }

    constructor(listStores: List<ColdStore>) : this() {
        if (listStores.isNullOrEmpty()) {
            stores.clear()
            stores.addAll(listStores)
        }
    }


    private val stores: MutableList<ColdStore> = mutableListOf()
    fun addToStore(product: Product, index: Int): Boolean = stores[index].addProduct(product)

    //dell product

    fun setTemperature(newTemp: Double, index: Int): Boolean = stores[index].setTemperature(newTemp)
}