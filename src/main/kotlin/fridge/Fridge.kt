package fridge

class Fridge(var numberOfDrinks : Int, var litersOfMilk : Double) {
    fun takeADrink() : String {
        return if (numberOfDrinks >= 1) {
            numberOfDrinks--
            "Here is your drink."
        }
        else "Not enough drinks!"
    }

    fun takeMilk(lOfMilk: Double) : String {
        return if (litersOfMilk >= lOfMilk) {
            litersOfMilk -= lOfMilk
            "Here is your milk."
        }
        else "Not enough milk!"
    }

    fun fillMilk(lOfMilk: Double) { litersOfMilk += lOfMilk }
    fun fillDrinks(number: Int) { numberOfDrinks += number }
}