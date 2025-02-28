class Airplane {
    var brand: String = "" //марка самолета
    var departure: String = "" //пункт отправления
    var appointment: String = "" //пункт назначения
    var dataDeparture: String = "" //дата отправления
    var timeDeparture: String = "" //время отправления
    var travelTime: String = "" //время в пути
    fun FlightInfo(){ // функция выдает информацию о рейсе
        println("Рейс на самолете $brand, из $departure в $appointment, дата отправления: $dataDeparture, время отправления: $timeDeparture, время в пути: $travelTime")
    }
    fun FlightStatus(canceled: Boolean, delayed: Boolean): String{ // функция проверяет статус рейса
       return when{
           canceled -> "Рейс отменен"
           delayed -> "Рейс задерживается"
           else -> "Рейс отправляется вовремя"
       }
    }
    fun FlightCost(serviceClass: String, luggage: Boolean, food: Boolean): String{ // функция вычисляет стоимость билета
        var cost = when(serviceClass){
          "Эконом" -> 300
          "Бизнес" -> 600
          else -> 0
        }
        if(luggage){
            cost = cost + 200
        }
        if(food){
            cost = cost + 100
        }
        return "Ваш билет - $serviceClass класса, с учетом наличия багажа и питания стоит: $cost"
    }

}