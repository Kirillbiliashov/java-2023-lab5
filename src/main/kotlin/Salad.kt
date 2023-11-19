
/**
 * Represents a Salad, a collection of vegetables.
 *
 * @param vegetables The list of vegetables in the salad.
 */
class Salad(private val vegetables: MutableList<Vegetable>) {

    /**
     * Calculates the total calories of the salad based on the calories of its vegetables.
     *
     * @return The total calories of the salad.
     */
    fun totalCalories(): Double {
        return vegetables.sumOf { it.getCalories() }
    }

    /**
     * Retrieves a list of vegetables within the specified calorie range (inclusive).
     *
     * @param start The starting range of calories.
     * @param end The ending range of calories.
     * @return A list of vegetables within the specified calorie range.
     *
     * @throws IllegalArgumentException if start is greater than or equal to end.
     */
    fun vegetablesInCaloriesRange(start: Double, end: Double): List<Vegetable> {
        if (start >= end) throw IllegalArgumentException("make sure start is less that end")
        return vegetables.filter { it.getCalories() in start..end }
    }

    /**
     * Sorts the vegetables in the salad by their quantity in ascending order.
     */
    fun sortVegetablesByQuantity() {
        val size = vegetables.size
        for (i in 0 until size - 1) {
            var swapHappened = false
            for (j in 0 until size - i - 1) {
                if (vegetables[j].quantity > vegetables[j + 1].quantity) {
                    val temp = vegetables[j]
                    vegetables[j] = vegetables[j + 1]
                    vegetables[j + 1] = temp
                    swapHappened = true
                }
            }
            if (!swapHappened) break
        }
    }

}