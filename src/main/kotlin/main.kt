fun main() {
    val sale = 100
    val lastSale = 1001
    val isMeloman = true
    var totalSale = 0
    if (isMeloman) {
        if (lastSale <= 1_000) {
            totalSale = (sale * 0.99).toInt()
        } else if (lastSale <= 10_000) {
            totalSale = ((sale - 100) * 0.99).toInt()
        } else {
            totalSale = ((sale * 0.95) * 0.99).toInt()
        }
    } else {
        if (lastSale <= 1_000) {
            totalSale = sale
        } else if (lastSale <= 10_000) {
            totalSale = sale - 100
        } else {
            totalSale = (sale * 0.95).toInt()
        }
    }

    println(totalSale)


}