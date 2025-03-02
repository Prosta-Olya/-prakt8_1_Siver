fun main() {
    while (true) {
        try {
            println("Введите данные для рейса(марка самолета, пункт отправления, пункт назначения, дата отправления, время отправления и время в пути):")
            val flight = Airplane(
                brand = readln(),
                departure = readln(),
                appointment = readln(),
                dataDeparture = readln(),
                timeDeparture = readln(),
                travelTime = readln()
            )
            flight.FlightInfo()
            println("Введите 0 - если рейс придет вовремя \n введите 1 - если райс задерживается \n введите 2 - если рейс отменен")
            val status = readLine()!!.toInt()
            when (status) {
                0 -> {
                    val canceled = false
                    val delayed = false
                    val minutes = 0
                    println(flight.FlightStatus(canceled, delayed, minutes))
                }

                1 -> {
                    val canseled = false
                    val delayed = true
                    println("Введите на сколько минут задерживается рейс")
                    val minutes = readLine()!!.toInt()
                    println(flight.FlightStatus(canseled, delayed, minutes))
                }

                2 -> {
                    val canceled = true
                    val delayed = false
                    val minutes = 0
                    println(flight.FlightStatus(canceled, delayed, minutes))
                }

                else -> println("Некорректный ввод")
            }
            println("Хотите вывести информацию о текущем маршруте?")
            val route = readLine()!!.toString()
            if (route == "Да" || route == "да") println(flight.RouteInfo())
            println("Хотите изменить время отправления?")
            val time = readLine()!!.toString()
            if (time == "Да" || time == "да") {
                println("Введите новое время:")
                val newTime = readLine()!!.toString()
                println(flight.UpdateDepartureTime(newTime))
            }
            println("Хотите изменить дату отправления?")
            val data = readLine()!!.toString()
            if (data == "Да" || data == "да") {
                println("Введите новую дату:")
                val newData = readLine()!!.toString()
                println(flight.UpdateDataDeparture(newData))
            }
            println("Будут ли еще рейсы?")
            val otv = readLine()!!.toString()
            if (otv != "Да" || otv != "да") {
                break
            }
        } catch (e: Exception) {
            println("Некорректный ввод")
        }
    }
}