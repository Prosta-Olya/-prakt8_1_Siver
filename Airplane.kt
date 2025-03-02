class Airplane (
        val brand: String, //марка самолета
        val departure: String, //пункт отправления
        val appointment: String, //пункт назначения
        var dataDeparture: String, //дата отправления
        var timeDeparture: String, //время отправления
        val travelTime: String,//время в пути
    ) {
    fun FlightInfo() { // функция выдает информацию о рейсе
        println("Рейс на самолете $brand, из $departure в $appointment, дата отправления: $dataDeparture, время отправления: $timeDeparture, время в пути: $travelTime")
    }

    fun FlightStatus(canceled: Boolean, delayed: Boolean, minutes: Int): String { // функция проверяет статус рейса
        return when {
            canceled -> "Рейс отменен"
            delayed -> "Рейс задерживается на $minutes мин"
            else -> "Рейс отправляется вовремя"
        }
    }

    fun RouteInfo(): String { // функция получает информацию о маршруте
        return "Маршрут: $departure -> $appointment"
    }

    fun UpdateDepartureTime(newTime: String) {
        timeDeparture = newTime
        println("Новое время отправления: $timeDeparture")
    }
    fun UpdateDataDeparture(newData:String){
        dataDeparture = newData
        println("Новое время отправления: $dataDeparture")
    }
}