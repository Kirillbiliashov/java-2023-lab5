
fun main() {
    val vegetables = mutableListOf(
        Tomato(3.0),
        Cucumber(1.5),
        Onion(0.5),
        Lettuce(2.0)
    )
    val salad = Salad(vegetables)
    println("total salad calories: ${salad.totalCalories()}")
    println("vegetables in 50 to 100 calories range: ${salad.vegetablesInCaloriesRange(50.0, 100.0)}")
    salad.sortVegetablesByQuantity()
    println("vegetables after sorting by quantity: ")
    println(vegetables)
}