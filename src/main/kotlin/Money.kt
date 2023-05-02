class Money (
    var amount : Float,
    var isCoin : Boolean
){

    companion object {
        val coins_10: Money = Money(0.1f, true)
        val coins_50: Money = Money(0.5f, true)
        val coins_100: Money = Money(1f, true)
        
        val bill_50: Money = Money(50f, false)
        val bill_100: Money = Money(100f, false)
        val bill_500: Money = Money(500f, false)
        val bill_1000: Money = Money(1000f, false)
    }


    override fun toString(): String {
        var str = ""

        if (isCoin) {
            if (((amount * 100).toInt()) == 100) {
                str = "руб."
                return "${(amount).toInt()} $str"
            } else {
                str = "коп."
                return "${(amount * 100).toInt()} $str"
            }
        } else {
            str = "руб."
            return "${amount.toInt()} $str"
        }
    }
}