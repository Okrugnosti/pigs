object PiggyBank {

    private var pig: ArrayList<Money> = ArrayList<Money>() // список монеток/купюр
    private var fragile: Boolean = false // свойство, определяющее, разбита ли копилка

    fun putMoney(money: Money) {
        // проверьте, не разбита ли копилка
        if (fragile != true) {

            // добавьте монетку в копилку
            pig.add(money)
            println("Добавлено в копилку $money")
        } else println("Вы разбили копилку, вы больше ничего положить туда не можете")
    }

    //разбиваем копилку и выводим список выпавших монет
    fun smash(): ArrayList<Money> {
        // установить флаг, что копилка разбита true, и вернуть все монетки, которые были в копилке

        fragile = true
        println("Копилка разбита, вы достали оттуда: ${pig.size}")

        for (x : Money in pig) println(x.toString())

        pig.clear()
        return pig
    }

    //трясем копилку - вытрясти монетку из копилки
    fun shake(): Money? {
        // проверьте, не разбита ли копилка
        if (fragile != true) {
            // вытрясти монетку из копилки (если в копилке нет монетки, вернуть null). Помните, купюры вытрясти нельзя.
            if (pig.isEmpty()) {
                return null

            } else {
                ///////// - ******** - /////////
                var a : Money
                for (x : Money in pig){
                    if(x.isCoin == true) {
                        println(x.toString())
                        pig.remove(x)
                        a = x
                    }
                }
                return null
            }
        } else {
            println("Вы разбили копилку, больше оттуда ничего не вытрясти")
            return null
        }
    }



}