package lesson1_variables

fun main(){
    val secondsInSpace: Short = 6480
    var theExactTimeLine: String = ""

        val hours:Byte = (secondsInSpace/3600).toByte()
        val minutes:Byte = ((secondsInSpace%3600)/60).toByte()
        val seconds:Byte = (secondsInSpace%60).toByte()

        val theExactTimeMap: Map<String, Byte> =
            mapOf("hours" to hours,
                  "minutes" to minutes,
                  "seconds" to seconds )

        theExactTimeMap.forEach { (key, value) ->
            when(key){
                "hours" -> theExactTimeLine +=
                                if(value < 10) { "0${value}:" }
                                else { "$value:" }

                "minutes" -> theExactTimeLine +=
                                if(value < 10) { "0${value}:" }
                                else { "$value:" }

                "seconds" -> theExactTimeLine +=
                                 if(value < 10) { "0${value}" }
                                 else { "$value" }
            } }

        println(theExactTimeLine)
}